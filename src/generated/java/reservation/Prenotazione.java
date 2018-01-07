/*
 * XML Type:  Prenotazione
 * Namespace: urn:reservation
 * Java type: reservation.Prenotazione
 *
 * Automatically generated - do not modify.
 */
package reservation;


/**
 * An XML Prenotazione(@urn:reservation).
 *
 * This is a complex type.
 */
public interface Prenotazione extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Prenotazione.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC58F10119519D173605E2994BBEFDE2E").resolveHandle("prenotazionee872type");
    
    /**
     * Gets the "numpren" element
     */
    String getNumpren();
    
    /**
     * Gets (as xml) the "numpren" element
     */
    org.apache.xmlbeans.XmlString xgetNumpren();
    
    /**
     * Sets the "numpren" element
     */
    void setNumpren(String numpren);
    
    /**
     * Sets (as xml) the "numpren" element
     */
    void xsetNumpren(org.apache.xmlbeans.XmlString numpren);
    
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
     * Gets the "ora_par" element
     */
    String getOraPar();
    
    /**
     * Gets (as xml) the "ora_par" element
     */
    org.apache.xmlbeans.XmlString xgetOraPar();
    
    /**
     * Sets the "ora_par" element
     */
    void setOraPar(String oraPar);
    
    /**
     * Sets (as xml) the "ora_par" element
     */
    void xsetOraPar(org.apache.xmlbeans.XmlString oraPar);
    
    /**
     * Gets the "ora_arr" element
     */
    String getOraArr();
    
    /**
     * Gets (as xml) the "ora_arr" element
     */
    org.apache.xmlbeans.XmlString xgetOraArr();
    
    /**
     * Sets the "ora_arr" element
     */
    void setOraArr(String oraArr);
    
    /**
     * Sets (as xml) the "ora_arr" element
     */
    void xsetOraArr(org.apache.xmlbeans.XmlString oraArr);
    
    /**
     * Gets the "adulti" element
     */
    String getAdulti();
    
    /**
     * Gets (as xml) the "adulti" element
     */
    org.apache.xmlbeans.XmlString xgetAdulti();
    
    /**
     * Sets the "adulti" element
     */
    void setAdulti(String adulti);
    
    /**
     * Sets (as xml) the "adulti" element
     */
    void xsetAdulti(org.apache.xmlbeans.XmlString adulti);
    
    /**
     * Gets the "bambini" element
     */
    String getBambini();
    
    /**
     * Gets (as xml) the "bambini" element
     */
    org.apache.xmlbeans.XmlString xgetBambini();
    
    /**
     * Sets the "bambini" element
     */
    void setBambini(String bambini);
    
    /**
     * Sets (as xml) the "bambini" element
     */
    void xsetBambini(org.apache.xmlbeans.XmlString bambini);
    
    /**
     * Gets the "infanti" element
     */
    String getInfanti();
    
    /**
     * Gets (as xml) the "infanti" element
     */
    org.apache.xmlbeans.XmlString xgetInfanti();
    
    /**
     * Sets the "infanti" element
     */
    void setInfanti(String infanti);
    
    /**
     * Sets (as xml) the "infanti" element
     */
    void xsetInfanti(org.apache.xmlbeans.XmlString infanti);
    
    /**
     * Gets the "bagagli" element
     */
    String getBagagli();
    
    /**
     * Gets (as xml) the "bagagli" element
     */
    org.apache.xmlbeans.XmlString xgetBagagli();
    
    /**
     * Sets the "bagagli" element
     */
    void setBagagli(String bagagli);
    
    /**
     * Sets (as xml) the "bagagli" element
     */
    void xsetBagagli(org.apache.xmlbeans.XmlString bagagli);
    
    /**
     * Gets the "animali" element
     */
    String getAnimali();
    
    /**
     * Gets (as xml) the "animali" element
     */
    org.apache.xmlbeans.XmlString xgetAnimali();
    
    /**
     * Sets the "animali" element
     */
    void setAnimali(String animali);
    
    /**
     * Sets (as xml) the "animali" element
     */
    void xsetAnimali(org.apache.xmlbeans.XmlString animali);
    
    /**
     * Gets the "totale" element
     */
    String getTotale();
    
    /**
     * Gets (as xml) the "totale" element
     */
    org.apache.xmlbeans.XmlString xgetTotale();
    
    /**
     * Sets the "totale" element
     */
    void setTotale(String totale);
    
    /**
     * Sets (as xml) the "totale" element
     */
    void xsetTotale(org.apache.xmlbeans.XmlString totale);
    
    /**
     * Gets the "Biglietti" element
     */
    BigliettiArray getBiglietti();
    
    /**
     * Sets the "Biglietti" element
     */
    void setBiglietti(BigliettiArray biglietti);
    
    /**
     * Appends and returns a new empty "Biglietti" element
     */
    BigliettiArray addNewBiglietti();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static Prenotazione newInstance() {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static Prenotazione newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static Prenotazione parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static Prenotazione parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static Prenotazione parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static Prenotazione parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static Prenotazione parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static Prenotazione parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static Prenotazione parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static Prenotazione parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static Prenotazione parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static Prenotazione parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static Prenotazione parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static Prenotazione parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static Prenotazione parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static Prenotazione parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static Prenotazione parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static Prenotazione parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (Prenotazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
