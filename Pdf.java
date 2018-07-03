package sample;

import java.io.FileOutputStream;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdf {

	public static void main(String[] args) throws Exception, DocumentException{
		// creating PdfWriter
		String dest = "C:/itextExamples/demo.pdf";
		
		Rectangle rect = new Rectangle (0,0, 230.10f,149.10f);
		rect.setBackgroundColor(new BaseColor (12,93,64));
 		Document document = new Document(rect);

 	   PdfWriter writer =	PdfWriter.getInstance(document, new FileOutputStream(dest));
 			document.open();
 		
 	 
	   PdfContentByte canvas = writer.getDirectContent();
	  

		BaseFont bf = BaseFont.createFont("C:\\Users\\D.SHAH\\ROCK.TTF", BaseFont.WINANSI, BaseFont.EMBEDDED) ;
		BaseFont bf2 = BaseFont.createFont("C:\\Users\\D.SHAH\\ROCKB.TTF", BaseFont.WINANSI, BaseFont.EMBEDDED);
		
	   Font font =  FontFactory.getFont("C:\\Users\\D.SHAH\\ROCK.TTF",6 );
	   Font font1 = FontFactory.getFont("C:\\Users\\D.SHAH\\ROCKB.TTF",8);
	   Font font2 = FontFactory.getFont("C:\\Users\\D.SHAH\\ROCK.TTF",14);
	   canvas.setRGBColorFill(255, 255, 255);
	   ColumnText ct = new ColumnText(canvas);
       ct.setSimpleColumn(14.17f, 14.73f, 136.06f, 133.22f);
       ct.setAlignment(50);
	   Phrase ph = new Phrase("Europe Campus",font1);
	   Phrase ph1 = new Phrase("Boulevard De Constance", font);
	   Phrase ph2 = new Phrase("77305 Fontainebleau Cedex,France",font);
	   Phrase ph3 = new Phrase("Tel: +33 (0)1 60 72 40 00", font);
	   
	   Phrase ph4 = new Phrase("Asia Campus",font1);
	   Phrase ph5 = new Phrase ("1 Ayer Rajah Avenue", font);
	   Phrase ph6 = new Phrase("Tel: +65 6799 5388",font);
	   
	   Phrase ph7 = new Phrase("Middle East Campus",font1);
	   Phrase ph8 = new Phrase("Al Khatem Tower,ADGM Square",font);
	   Phrase ph9 = new Phrase("Al Maryah Island,P.O.Box 48049", font);
	   Phrase ph10 = new Phrase("Abu Dhabi,United Arab Emirates", font);
	   Phrase ph11 = new Phrase("Tel: +971 2 651 5200", font);
	   

	   
	   ct.addElement(ph);
	   ct.addElement(ph1);
	   ct.addElement(ph2);
	   ct.addElement(ph3);
	   ct.addElement(ph4);
	   ct.addElement(ph5);
	   ct.addElement(ph6);
	   ct.addElement(ph7);
	   ct.addElement(ph8);
	   ct.addElement(ph9);
	   ct.addElement(ph10);
	   ct.addElement(ph11);
	  
	   
	   ct.go();
	   
	
	   Phrase ph12 = new Phrase("www.insead.edu", font2);
	   ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, ph12, 210.93f, 74.5f, 270);
		 
	   ct.addElement(ph12);
	   ct.go();

		 PdfContentByte canvas1 = writer.getDirectContent();
		
	 	   BaseColor bc = new BaseColor(216,233,229);
	 	   PdfGState gs = new PdfGState();
	        gs.setFillOpacity(0.2f);
	        canvas1.setGState(gs);
	        canvas1.beginText();
	        canvas1.setFontAndSize(bf, 16);
	        canvas1.setColorFill(bc);
	      
	        canvas1.showTextAligned(Element.ALIGN_CENTER, "SPECIMEN", 120, 90, 45);
	        canvas1.showTextAligned(Element.ALIGN_CENTER, "SPECIMEN", 180, 60, 45);
	        canvas1.showTextAligned(Element.ALIGN_CENTER, "SPECIMEN", 55, 120, 50);
	        canvas1.showTextAligned(Element.ALIGN_CENTER, "SPECIMEN", 20, 25, 45);
	        canvas1.showTextAligned(Element.ALIGN_CENTER, "SPECIMEN", 98, 25, 45);
	        canvas1.showTextAligned(Element.ALIGN_CENTER, "SPECIMEN", 200, 22, 45);
	        canvas1.showTextAligned(Element.ALIGN_CENTER, "SPECIMEN", 200, 130, 45);
	        canvas1.endText();
	        
	   document.close();
	   System.out.println("done");
		
	}
}


		
		
		
		
