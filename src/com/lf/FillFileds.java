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
	    reader = new PdfReader("Userdetails.pdf");
	    stamper = new PdfStamper(reader, new FileOutputStream(
	        "Userdetails-Modified.pdf"));
	    form = stamper.getAcroFields();
	    form.setField("Name", "LevelFive");
	    form.setField("Name", "LevelFive");

	    stamper.setFormFlattening(true);
	    stamper.close();
	}
}
