/*
 * XML Type:  Corsa
 * Namespace: urn:reservation
 * Java type: reservation.Corsa
 *
 * Automatically generated - do not modify.
 */
package reservation;


/**
 * An XML Corsa(@urn:reservation).
 *
 * This is a complex type.
 */
public interface Corsa extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Corsa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC58F10119519D173605E2994BBEFDE2E").resolveHandle("corsa866etype");
    
    /**
     * Gets the "Data" element
     */
    String getData();
    
    /**
     * Gets (as xml) the "Data" element
     */
    org.apache.xmlbeans.XmlString xgetData();
    
    /**
     * Sets the "Data" element
     */
    void setData(String data);
    
    /**
     * Sets (as xml) the "Data" element
     */
    void xsetData(org.apache.xmlbeans.XmlString data);
    
    /**
     * Gets the "Da" element
     */
    String getDa();
    
    /**
     * Gets (as xml) the "Da" element
     */
    org.apache.xmlbeans.XmlString xgetDa();
    
    /**
     * Sets the "Da" element
     */
    void setDa(String da);
    
    /**
     * Sets (as xml) the "Da" element
     */
    void xsetDa(org.apache.xmlbeans.XmlString da);
    
    /**
     * Gets the "A" element
     */
    String getA();
    
    /**
     * Gets (as xml) the "A" element
     */
    org.apache.xmlbeans.XmlString xgetA();
    
    /**
     * Sets the "A" element
     */
    void setA(String a);
    
    /**
     * Sets (as xml) the "A" element
     */
    void xsetA(org.apache.xmlbeans.XmlString a);
    
    /**
     * Gets the "Cfg_Linea" element
     */
    String getCfgLinea();
    
    /**
     * Gets (as xml) the "Cfg_Linea" element
     */
    org.apache.xmlbeans.XmlString xgetCfgLinea();
    
    /**
     * Sets the "Cfg_Linea" element
     */
    void setCfgLinea(String cfgLinea);
    
    /**
     * Sets (as xml) the "Cfg_Linea" element
     */
    void xsetCfgLinea(org.apache.xmlbeans.XmlString cfgLinea);
    
    /**
     * Gets the "IdCorsa" element
     */
    String getIdCorsa();
    
    /**
     * Gets (as xml) the "IdCorsa" element
     */
    org.apache.xmlbeans.XmlString xgetIdCorsa();
    
    /**
     * Sets the "IdCorsa" element
     */
    void setIdCorsa(String idCorsa);
    
    /**
     * Sets (as xml) the "IdCorsa" element
     */
    void xsetIdCorsa(org.apache.xmlbeans.XmlString idCorsa);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static Corsa newInstance() {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static Corsa newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static Corsa parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static Corsa parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static Corsa parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static Corsa parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static Corsa parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static Corsa parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static Corsa parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static Corsa parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static Corsa parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static Corsa parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static Corsa parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static Corsa parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static Corsa parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static Corsa parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static Corsa parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static Corsa parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (Corsa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
