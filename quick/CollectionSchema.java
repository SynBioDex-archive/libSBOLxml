pakage org.sbolstandard.xml;

// generated from Collection.qiml

import com.jxml.quick.*;
import com.jxml.quick.engine.*;
import com.jxml.quick.recycle.*;
import com.jxml.quick.access.*;
import com.jxml.quick.qmap.*;
import com.jxml.quick.tf.*;
import org.xml.sax.*;

public class CollectionSchema extends QSchemaFactory
{
	protected static QDoc schema=null;

	public static QDoc createSchema()
		throws SAXException, QE, QPE, ClassNotFoundException, 
			InstantiationException, IllegalAccessException
	{
		if (schema!=null)
			return schema;
		return (new CollectionSchema()).create();
	}

	public QDoc create()
		throws SAXException, QE, QPE, ClassNotFoundException, 
			InstantiationException, IllegalAccessException
	{
		if (schema!=null)
			return schema;
		QSoftDocHash sdh=Quick.schemaHash;
		QDoc rv=sdh.get("Collection.qjml");
		if (rv!=null)
		{
			schema=rv;
			return schema;
		}
		synchronized(this.getClass())
		{
			if (schema!=null)
				return schema;
			rv=build();
			schema=sdh.add(rv);
			if (schema!=rv)
				return schema;
			QRefHash.add(schema);
			return schema;
		}
	}

	protected QDoc build()
		throws SAXException, QE, QPE, ClassNotFoundException, 
			InstantiationException, IllegalAccessException
	{
		QDocImpl doc=new QDocImpl();
		QIML rootCE=new QIML();
		
		
		doc.setRoot(rootCE);
		QElementFactory var0=new QElementFactory();
		doc.setId("Collection",var0);
		var0.tagName="Collection";
		QClassWrapper var1=new QClassWrapper();
		var0.targetFactory=var1;
		var1.wClassName="org.sbolstandard.core.Collection";
		QCElementFactory var2=new QCElementFactory();
		doc.setId("genid_1314737132902",var2);
		var2.access=new com.jxml.quick.access.QMALAccess();
		QElementFactory var3=new QElementFactory();
		doc.setId("genid_1314737132903",var3);
		var3.tagName="_attributes";
		var3.targetFactory=new com.jxml.quick.tf.QMALTF();
		QCElementFactory var4=new QCElementFactory();
		doc.setId("genid_1314737132904",var4);
		var4.optional=true;
		QPropertyAccess var5=new QPropertyAccess();
		var4.access=var5;
		var5.property="description";
		QElementFactory var6=new QElementFactory();
		doc.setId("Collection.description",var6);
		var6.tagName="description";
		var6.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		var6.addToFactory(var4);
		var4.addToFactory(var3);
		QCElementFactory var7=new QCElementFactory();
		doc.setId("genid_1314737132905",var7);
		QPropertyAccess var8=new QPropertyAccess();
		var7.access=var8;
		var8.property="displayId";
		QElementFactory var9=new QElementFactory();
		doc.setId("Collection.displayId",var9);
		var9.tagName="displayId";
		var9.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		var9.addToFactory(var7);
		var7.addToFactory(var3);
		QCElementFactory var10=new QCElementFactory();
		doc.setId("genid_1314737132906",var10);
		var10.optional=true;
		QPropertyAccess var11=new QPropertyAccess();
		var10.access=var11;
		var11.property="name";
		QElementFactory var12=new QElementFactory();
		doc.setId("Collection.name",var12);
		var12.tagName="name";
		var12.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		var12.addToFactory(var10);
		var10.addToFactory(var3);
		var3.addToFactory(var2);
		var2.addToFactory(var0);
		QCElementFactory var13=new QCElementFactory();
		doc.setId("genid_1314737132907",var13);
		var13.repeating=true;
		QListPropertyAccess var14=new QListPropertyAccess();
		var13.access=var14;
		var14.property="component";
		QElementFactory var15=new QElementFactory();
		doc.setId("DnaComponent",var15);
		var15.tagName="DnaComponent";
		QClassWrapper var16=new QClassWrapper();
		var15.targetFactory=var16;
		var16.wClassName="org.sbolstandard.core.DnaComponent";
		QCElementFactory var17=new QCElementFactory();
		doc.setId("genid_1314737132908",var17);
		var17.access=new com.jxml.quick.access.QMALAccess();
		QElementFactory var18=new QElementFactory();
		doc.setId("genid_1314737132909",var18);
		var18.tagName="_attributes";
		var18.targetFactory=new com.jxml.quick.tf.QMALTF();
		QCElementFactory var19=new QCElementFactory();
		doc.setId("genid_1314737132910",var19);
		var19.optional=true;
		QPropertyAccess var20=new QPropertyAccess();
		var19.access=var20;
		var20.property="description";
		QElementFactory var21=new QElementFactory();
		doc.setId("DnaComponent.description",var21);
		var21.tagName="description";
		var21.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		var21.addToFactory(var19);
		var19.addToFactory(var18);
		QCElementFactory var22=new QCElementFactory();
		doc.setId("genid_1314737132911",var22);
		QPropertyAccess var23=new QPropertyAccess();
		var22.access=var23;
		var23.property="displayId";
		QElementFactory var24=new QElementFactory();
		doc.setId("DnaComponent.displayId",var24);
		var24.tagName="displayId";
		var24.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		var24.addToFactory(var22);
		var22.addToFactory(var18);
		QCElementFactory var25=new QCElementFactory();
		doc.setId("genid_1314737132912",var25);
		var25.defaultValue="true";
		var25.optional=true;
		QPropertyAccess var26=new QPropertyAccess();
		var25.access=var26;
		var26.property="isCircular";
		QElementFactory var27=new QElementFactory();
		doc.setId("DnaComponent.isCircular",var27);
		var27.tagName="isCircular";
		var27.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		var27.addToFactory(var25);
		var25.addToFactory(var18);
		QCElementFactory var28=new QCElementFactory();
		doc.setId("genid_1314737132913",var28);
		var28.optional=true;
		QPropertyAccess var29=new QPropertyAccess();
		var28.access=var29;
		var29.property="name";
		QElementFactory var30=new QElementFactory();
		doc.setId("DnaComponent.name",var30);
		var30.tagName="name";
		var30.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		var30.addToFactory(var28);
		var28.addToFactory(var18);
		var18.addToFactory(var17);
		var17.addToFactory(var15);
		QCElementFactory var31=new QCElementFactory();
		doc.setId("genid_1314737132914",var31);
		var31.repeating=true;
		QListPropertyAccess var32=new QListPropertyAccess();
		var31.access=var32;
		var32.property="type";
		QElementFactory var33=new QElementFactory();
		doc.setId("URI",var33);
		var33.tagName="URI";
		var33.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		QCElementFactory var34=new QCElementFactory();
		doc.setId("genid_1314737132915",var34);
		var34.access=new com.jxml.quick.access.QMALAccess();
		QElementFactory var35=new QElementFactory();
		doc.setId("genid_1314737132916",var35);
		var35.tagName="_attributes";
		var35.targetFactory=new com.jxml.quick.tf.QMALTF();
		var35.addToFactory(var34);
		var34.addToFactory(var33);
		var33.addToFactory(var31);
		var31.addToFactory(var15);
		QCElementFactory var36=new QCElementFactory();
		doc.setId("genid_1314737132917",var36);
		QPropertyAccess var37=new QPropertyAccess();
		var36.access=var37;
		var37.property="dnaSequence";
		QElementFactory var38=new QElementFactory();
		doc.setId("DnaSequence",var38);
		var38.tagName="DnaSequence";
		var38.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		QCElementFactory var39=new QCElementFactory();
		doc.setId("genid_1314737132918",var39);
		var39.access=new com.jxml.quick.access.QMALAccess();
		QElementFactory var40=new QElementFactory();
		doc.setId("genid_1314737132919",var40);
		var40.tagName="_attributes";
		var40.targetFactory=new com.jxml.quick.tf.QMALTF();
		var40.addToFactory(var39);
		var39.addToFactory(var38);
		var38.addToFactory(var36);
		var36.addToFactory(var15);
		QCElementFactory var41=new QCElementFactory();
		doc.setId("genid_1314737132920",var41);
		var41.repeating=true;
		QListPropertyAccess var42=new QListPropertyAccess();
		var41.access=var42;
		var42.property="annotation";
		QElementFactory var43=new QElementFactory();
		doc.setId("SequenceAnnotation",var43);
		var43.tagName="SequenceAnnotation";
		QClassWrapper var44=new QClassWrapper();
		var43.targetFactory=var44;
		var44.wClassName="org.sbolstandard.core.SequenceAnnotation";
		QCElementFactory var45=new QCElementFactory();
		doc.setId("genid_1314737132921",var45);
		var45.access=new com.jxml.quick.access.QMALAccess();
		QElementFactory var46=new QElementFactory();
		doc.setId("genid_1314737132922",var46);
		var46.tagName="_attributes";
		var46.targetFactory=new com.jxml.quick.tf.QMALTF();
		QCElementFactory var47=new QCElementFactory();
		doc.setId("genid_1314737132923",var47);
		QPropertyAccess var48=new QPropertyAccess();
		var47.access=var48;
		var48.property="end";
		QElementFactory var49=new QElementFactory();
		doc.setId("SequenceAnnotation.end",var49);
		var49.tagName="end";
		var49.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		var49.addToFactory(var47);
		var47.addToFactory(var46);
		QCElementFactory var50=new QCElementFactory();
		doc.setId("genid_1314737132924",var50);
		QPropertyAccess var51=new QPropertyAccess();
		var50.access=var51;
		var51.property="genbankStart";
		QElementFactory var52=new QElementFactory();
		doc.setId("SequenceAnnotation.genbankStart",var52);
		var52.tagName="genbankStart";
		var52.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		var52.addToFactory(var50);
		var50.addToFactory(var46);
		QCElementFactory var53=new QCElementFactory();
		doc.setId("genid_1314737132925",var53);
		QPropertyAccess var54=new QPropertyAccess();
		var53.access=var54;
		var54.property="strand";
		QElementFactory var55=new QElementFactory();
		doc.setId("SequenceAnnotation.strand",var55);
		var55.tagName="strand";
		var55.targetFactory=new QPropertyEditor("java.lang.String","sun.beans.editors.StringEditor");

		var55.addToFactory(var53);
		var53.addToFactory(var46);
		var46.addToFactory(var45);
		var45.addToFactory(var43);
		QCElementFactory var56=new QCElementFactory();
		doc.setId("genid_1314737132926",var56);
		var56.repeating=true;
		QListPropertyAccess var57=new QListPropertyAccess();
		var56.access=var57;
		var57.property="dnaComponent";
		QElementFactory var58=var15;
		var58.addToFactory(var56);
		var56.addToFactory(var43);
		var43.addToFactory(var41);
		var41.addToFactory(var15);
		var15.addToFactory(var13);
		var13.addToFactory(var0);

		var0.addToFactory(rootCE);
		doc.setSchema(Quick.QIMLSchema());
		doc.setKey("Collection.qjml");
		doc.pool=new QContextPool(doc);
		return doc;
	}
}		

