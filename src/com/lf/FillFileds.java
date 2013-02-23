package com.lf;

import java.io.FileOutputStream;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class FillFileds {
	public static void main(String[] args) throws Exception{
		
	    PdfReader reader;
	    PdfStamper stamper;
	    AcroFields form;
	    reader = new PdfReader("User-details.pdf");
	    stamper = new PdfStamper(reader, new FileOutputStream(
	        "Userdetails-Modified.pdf"));
	    form = stamper.getAcroFields();
	    form.setField("Name", "LevelFive");
	    form.setField("EMail", "lf@lfsolutions.net");
	    form.setField("Designation", "CEO");
	    form.setField("Address", "18 Primrose Road");
	    System.out.println("Its completed perfectly.");
	    stamper.setFormFlattening(true);
	    stamper.close();
	}
}
