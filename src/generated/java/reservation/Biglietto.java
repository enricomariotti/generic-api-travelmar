/*
 * XML Type:  Biglietto
 * Namespace: urn:reservation
 * Java type: reservation.Biglietto
 *
 * Automatically generated - do not modify.
 */
package reservation;


/**
 * An XML Biglietto(@urn:reservation).
 *
 * This is a complex type.
 */
public interface Biglietto extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Biglietto.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC58F10119519D173605E2994BBEFDE2E").resolveHandle("bigliettoc601type");
    
    /**
     * Gets the "CodTar" element
     */
    String getCodTar();
    
    /**
     * Gets (as xml) the "CodTar" element
     */
    org.apache.xmlbeans.XmlString xgetCodTar();
    
    /**
     * Sets the "CodTar" element
     */
    void setCodTar(String codTar);
    
    /**
     * Sets (as xml) the "CodTar" element
     */
    void xsetCodTar(org.apache.xmlbeans.XmlString codTar);
    
    /**
     * Gets the "NumBigl" element
     */
    String getNumBigl();
    
    /**
     * Gets (as xml) the "NumBigl" element
     */
    org.apache.xmlbeans.XmlString xgetNumBigl();
    
    /**
     * Sets the "NumBigl" element
     */
    void setNumBigl(String numBigl);
    
    /**
     * Sets (as xml) the "NumBigl" element
     */
    void xsetNumBigl(org.apache.xmlbeans.XmlString numBigl);
    
    /**
     * Gets the "Quantita" element
     */
    String getQuantita();
    
    /**
     * Gets (as xml) the "Quantita" element
     */
    org.apache.xmlbeans.XmlString xgetQuantita();
    
    /**
     * Sets the "Quantita" element
     */
    void setQuantita(String quantita);
    
    /**
     * Sets (as xml) the "Quantita" element
     */
    void xsetQuantita(org.apache.xmlbeans.XmlString quantita);
    
    /**
     * Gets the "Importo" element
     */
    String getImporto();
    
    /**
     * Gets (as xml) the "Importo" element
     */
    org.apache.xmlbeans.XmlString xgetImporto();
    
    /**
     * Sets the "Importo" element
     */
    void setImporto(String importo);
    
    /**
     * Sets (as xml) the "Importo" element
     */
    void xsetImporto(org.apache.xmlbeans.XmlString importo);
    
    /**
     * Gets the "Message" element
     */
    String getMessage();
    
    /**
     * Gets (as xml) the "Message" element
     */
    org.apache.xmlbeans.XmlString xgetMessage();
    
    /**
     * Sets the "Message" element
     */
    void setMessage(String message);
    
    /**
     * Sets (as xml) the "Message" element
     */
    void xsetMessage(org.apache.xmlbeans.XmlString message);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static Biglietto newInstance() {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static Biglietto newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static Biglietto parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static Biglietto parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static Biglietto parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static Biglietto parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static Biglietto parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static Biglietto parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static Biglietto parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static Biglietto parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static Biglietto parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static Biglietto parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static Biglietto parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static Biglietto parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static Biglietto parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static Biglietto parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static Biglietto parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static Biglietto parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (Biglietto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
