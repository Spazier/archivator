package de.archivator.beans;

/*
 * This file is part of archivator, a software system for managing
 * and retrieving archived items.
 *
 * Copyright (C) 2012  müller, dreher,
 *                     burghard.britzke bubi@charmides.in-berlin.de
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; package de.archivator.beans;

 /*
 * This file is part of archivator, a software system for managing
 * and retrieving archived items.
 *
 * Copyright (C) 2012  müller, dreher,
 *                     burghard.britzke bubi@charmides.in-berlin.de
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

import de.archivator.entities.Archivale;
import de.archivator.entities.Dokumentart;
import de.archivator.entities.Name;
import de.archivator.entities.Organisationseinheit;

/**
 * Die PdfExportBean dient zum generieren einer PDF-Datei, die die Informationen
 * zu einem Archivale enthält
 * 
 * @author Jan Müller
 */

@Named(value = "pdfExportBean")
@RequestScoped
public class PdfExportBean {

	@Inject
	private DetailBean detailBean;

	@Inject
	private RechercheBean rechercheBean;

	private List<Archivale> archivalien;

	private Document document;

	private FacesContext context;

	private final String FILENAME = "document";

	/**
	 * Die Methode createPdfFromRecord dient zum Erzeugen einer PDF-Datei aus
	 * einem einzelnen Archiv-Datensatz
	 */
	public void createPdfFromRecord(FacesContext context) {
		this.context = context;
		archivalien = new ArrayList<Archivale>();
		archivalien.add(detailBean.getAktuellesArchivale());
		createDocument();
	}
	
	/**
	 * Die Methode createPdfFromList dient zum Erzeugen einer PDF-Datei aus
	 * einem Recherche-Ergebnis
	 */
	public void createPdfFromList(FacesContext context) {
		this.context = context;
		archivalien = rechercheBean.getArchivalien();
		createDocument();	
	}
	
	/**
	 * Die Methode createDocument erzeugt ein Pdf-Dokument
	 * und füllt sie mit den Inhalten aus der Liste "archivalien"
	 */
	private void createDocument() {
		try {
			document = new Document();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PdfWriter.getInstance(document, baos);
			document.open();

			for (int i = 0; i < archivalien.size(); i++) {
				addContentFrom(archivalien.get(i));
			}
			
			document.close();
			HttpServletResponse response = (HttpServletResponse) this.context
					.getExternalContext().getResponse();
			response.setContentType("application/pdf");
			// den Browser informieren, dass er eine neue Datei erhält und sie
			// herunterladen soll, anstatt sie auf der Seite darzustellen
			response.setHeader("Content-disposition",
					"attachment; filename="+FILENAME);
			// the contentlength
			response.setContentLength(baos.size());
			// write ByteArrayOutputStream to the ServletOutputStream
			ServletOutputStream os = response.getOutputStream();
			baos.writeTo(os);
			os.flush();
			os.close();
		} catch (Exception e) {
			System.out.println("Exception");
		}
		context.responseComplete();
	}

	/**
	 * die Methode addDetails dient zum Hinzufügen von Details aus einem Archivale
	 * in ein Dokument
	 */
	private void addContentFrom(Archivale aktuellesArchivale) throws DocumentException {
		LineSeparator UNDERLINE = new LineSeparator(1, 100, null,
				Element.ALIGN_CENTER, -2);
		
		document.add(Chunk.NEWLINE);
		document.add(UNDERLINE);
		document.add(Chunk.NEWLINE);

		Paragraph headline = new Paragraph(aktuellesArchivale.getBetreff());
		headline.setAlignment(Element.ALIGN_CENTER);
		document.add(headline);
		document.add(new Paragraph("Inhalt: " + aktuellesArchivale.getInhalt()));
		document.add(new Paragraph("Datum (Jahr): "
				+ aktuellesArchivale.getVonJahr() + " - "
				+ aktuellesArchivale.getBisJahr()));

		List<Name> names = aktuellesArchivale.getNamen();
		for (Name n : names) {
			document.add(new Paragraph("Name:" + n.getVorname() + " "
					+ n.getNachname()));
		}

		List<Organisationseinheit> organisationseinheiten = aktuellesArchivale
				.getOrganisationseinheiten();
		for (Organisationseinheit o : organisationseinheiten) {
			document.add(new Paragraph("Organisationseinheiten:" + o.getName()));
		}

		List<Dokumentart> dokumentarten = aktuellesArchivale.getDokumentarten();
		for (Dokumentart d : dokumentarten) {
			document.add(new Paragraph("Dokumentarten:" + d.getName()));
		}
	}


}