import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;
import org.dom4j.io.OutputFormat;
import org.dom4j.Node;
import java.io.*;
public class xml_yaz {
public static void main(String s[])
{
xml_yaz orn=new xml_yaz();
orn.olustur();
}
public void olustur()
{
Document document = DocumentHelper.createDocument();
Element kok = document.addElement( "kok" );
Element testNode = kok.addElement( "test" ).addAttribute( "ad", "okan" );
Element yazar = kok.addElement( "yazar" )
.addAttribute( "ad", "ali" )
.addAttribute( "sehir", "ankara" )
.addText( "ayse" );
yazar = kok.addElement( "yazar" )
.addAttribute( "ad", "veli" )
.addAttribute( "sehir", "izmir" )
.addText( "fatma" );
yazar = kok.addElement( "yazar" )
.addAttribute( "ad", "aaaaa" )
.addAttribute( "sehir", "bolu" )
.addText( "MRS" );
//for deleting node
testNode.detach();
try
{
FileWriter out = new FileWriter( "deneme.xml" );
//OutputFormat outformat =OutputFormat.createCompactFormat();
OutputFormat outformat =OutputFormat.createPrettyPrint();
XMLWriter writer = new XMLWriter(out, outformat);
writer.write(document);
writer.close();


}
catch(Exception e)
{
e.printStackTrace();

}

}


}