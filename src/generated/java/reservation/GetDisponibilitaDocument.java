/*
 * An XML document type.
 * Localname: getDisponibilita
 * Namespace: urn:reservation
 * Java type: reservation.GetDisponibilitaDocument
 *
 * Automatically generated - do not modify.
 */
package reservation;


/**
 * A document containing one getDisponibilita(@urn:reservation) element.
 *
 * This is a complex type.
 */
public interface GetDisponibilitaDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetDisponibilitaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC58F10119519D173605E2994BBEFDE2E").resolveHandle("getdisponibilita32bfdoctype");
    
    /**
     * Gets the "getDisponibilita" element
     */
    GetDisponibilita getGetDisponibilita();
    
    /**
     * Sets the "getDisponibilita" element
     */
    void setGetDisponibilita(GetDisponibilita getDisponibilita);
    
    /**
     * Appends and returns a new empty "getDisponibilita" element
     */
    GetDisponibilita addNewGetDisponibilita();
    
    /**
     * An XML getDisponibilita(@urn:reservation).
     *
     * This is a complex type.
     */
    public interface GetDisponibilita extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetDisponibilita.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC58F10119519D173605E2994BBEFDE2E").resolveHandle("getdisponibilita7880elemtype");
        
        /**
         * Gets the "username" element
         */
        String getUsername();
        
        /**
         * Gets (as xml) the "username" element
         */
        org.apache.xmlbeans.XmlString xgetUsername();
        
        /**
         * Tests for nil "username" element
         */
        boolean isNilUsername();
        
        /**
         * Sets the "username" element
         */
        void setUsername(String username);
        
        /**
         * Sets (as xml) the "username" element
         */
        void xsetUsername(org.apache.xmlbeans.XmlString username);
        
        /**
         * Nils the "username" element
         */
        void setNilUsername();
        
        /**
         * Gets the "password" element
         */
        String getPassword();
        
        /**
         * Gets (as xml) the "password" element
         */
        org.apache.xmlbeans.XmlString xgetPassword();
        
        /**
         * Tests for nil "password" element
         */
        boolean isNilPassword();
        
        /**
         * Sets the "password" element
         */
        void setPassword(String password);
        
        /**
         * Sets (as xml) the "password" element
         */
        void xsetPassword(org.apache.xmlbeans.XmlString password);
        
        /**
         * Nils the "password" element
         */
        void setNilPassword();
        
        /**
         * Gets the "tratte" element
         */
        TratteArray getTratte();
        
        /**
         * Tests for nil "tratte" element
         */
        boolean isNilTratte();
        
        /**
         * Sets the "tratte" element
         */
        void setTratte(TratteArray tratte);
        
        /**
         * Appends and returns a new empty "tratte" element
         */
        TratteArray addNewTratte();
        
        /**
         * Nils the "tratte" element
         */
        void setNilTratte();
        
        /**
         * Gets the "adulti" element
         */
        java.math.BigInteger getAdulti();
        
        /**
         * Gets (as xml) the "adulti" element
         */
        org.apache.xmlbeans.XmlInteger xgetAdulti();
        
        /**
         * Tests for nil "adulti" element
         */
        boolean isNilAdulti();
        
        /**
         * Sets the "adulti" element
         */
        void setAdulti(java.math.BigInteger adulti);
        
        /**
         * Sets (as xml) the "adulti" element
         */
        void xsetAdulti(org.apache.xmlbeans.XmlInteger adulti);
        
        /**
         * Nils the "adulti" element
         */
        void setNilAdulti();
        
        /**
         * Gets the "bambini" element
         */
        java.math.BigInteger getBambini();
        
        /**
         * Gets (as xml) the "bambini" element
         */
        org.apache.xmlbeans.XmlInteger xgetBambini();
        
        /**
         * Tests for nil "bambini" element
         */
        boolean isNilBambini();
        
        /**
         * Sets the "bambini" element
         */
        void setBambini(java.math.BigInteger bambini);
        
        /**
         * Sets (as xml) the "bambini" element
         */
        void xsetBambini(org.apache.xmlbeans.XmlInteger bambini);
        
        /**
         * Nils the "bambini" element
         */
        void setNilBambini();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static GetDisponibilita newInstance() {
              return (GetDisponibilita) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static GetDisponibilita newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (GetDisponibilita) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static GetDisponibilitaDocument newInstance() {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static GetDisponibilitaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static GetDisponibilitaDocument parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static GetDisponibilitaDocument parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static GetDisponibilitaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static GetDisponibilitaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static GetDisponibilitaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static GetDisponibilitaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static GetDisponibilitaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static GetDisponibilitaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static GetDisponibilitaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static GetDisponibilitaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static GetDisponibilitaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static GetDisponibilitaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static GetDisponibilitaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static GetDisponibilitaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static GetDisponibilitaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static GetDisponibilitaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (GetDisponibilitaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
