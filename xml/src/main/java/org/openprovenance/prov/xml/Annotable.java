package org.openprovenance.prov.xml;
import java.util.List;
import javax.xml.bind.JAXBElement;

public interface Annotable extends Identifiable {
        public EmbeddedAnnotation getAnnotation();
        public void setAnnotation(EmbeddedAnnotation ea);
} 