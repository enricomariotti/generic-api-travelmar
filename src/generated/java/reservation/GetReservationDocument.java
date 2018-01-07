/*
 * An XML document type.
 * Localname: getReservation
 * Namespace: urn:reservation
 * Java type: reservation.GetReservationDocument
 *
 * Automatically generated - do not modify.
 */
package reservation;


/**
 * A document containing one getReservation(@urn:reservation) element.
 *
 * This is a complex type.
 */
public interface GetReservationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetReservationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC58F10119519D173605E2994BBEFDE2E").resolveHandle("getreservationa452doctype");
    
    /**
     * Gets the "getReservation" element
     */
    GetReservation getGetReservation();
    
    /**
     * Sets the "getReservation" element
     */
    void setGetReservation(GetReservation getReservation);
    
    /**
     * Appends and returns a new empty "getReservation" element
     */
    GetReservation addNewGetReservation();
    
    /**
     * An XML getReservation(@urn:reservation).
     *
     * This is a complex type.
     */
    public interface GetReservation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetReservation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC58F10119519D173605E2994BBEFDE2E").resolveHandle("getreservation6960elemtype");
        
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
         * Gets the "corse" element
         */
        CorseArray getCorse();
        
        /**
         * Tests for nil "corse" element
         */
        boolean isNilCorse();
        
        /**
         * Sets the "corse" element
         */
        void setCorse(CorseArray corse);
        
        /**
         * Appends and returns a new empty "corse" element
         */
        CorseArray addNewCorse();
        
        /**
         * Nils the "corse" element
         */
        void setNilCorse();
        
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
         * Gets the "bagagli" element
         */
        java.math.BigInteger getBagagli();
        
        /**
         * Gets (as xml) the "bagagli" element
         */
        org.apache.xmlbeans.XmlInteger xgetBagagli();
        
        /**
         * Tests for nil "bagagli" element
         */
        boolean isNilBagagli();
        
        /**
         * Sets the "bagagli" element
         */
        void setBagagli(java.math.BigInteger bagagli);
        
        /**
         * Sets (as xml) the "bagagli" element
         */
        void xsetBagagli(org.apache.xmlbeans.XmlInteger bagagli);
        
        /**
         * Nils the "bagagli" element
         */
        void setNilBagagli();
        
        /**
         * Gets the "animali" element
         */
        java.math.BigInteger getAnimali();
        
        /**
         * Gets (as xml) the "animali" element
         */
        org.apache.xmlbeans.XmlInteger xgetAnimali();
        
        /**
         * Tests for nil "animali" element
         */
        boolean isNilAnimali();
        
        /**
         * Sets the "animali" element
         */
        void setAnimali(java.math.BigInteger animali);
        
        /**
         * Sets (as xml) the "animali" element
         */
        void xsetAnimali(org.apache.xmlbeans.XmlInteger animali);
        
        /**
         * Nils the "animali" element
         */
        void setNilAnimali();
        
        /**
         * Gets the "accompagnatore" element
         */
        String getAccompagnatore();
        
        /**
         * Gets (as xml) the "accompagnatore" element
         */
        org.apache.xmlbeans.XmlString xgetAccompagnatore();
        
        /**
         * Tests for nil "accompagnatore" element
         */
        boolean isNilAccompagnatore();
        
        /**
         * Sets the "accompagnatore" element
         */
        void setAccompagnatore(String accompagnatore);
        
        /**
         * Sets (as xml) the "accompagnatore" element
         */
        void xsetAccompagnatore(org.apache.xmlbeans.XmlString accompagnatore);
        
        /**
         * Nils the "accompagnatore" element
         */
        void setNilAccompagnatore();
        
        /**
         * Gets the "cell_accompagnatore" element
         */
        String getCellAccompagnatore();
        
        /**
         * Gets (as xml) the "cell_accompagnatore" element
         */
        org.apache.xmlbeans.XmlString xgetCellAccompagnatore();
        
        /**
         * Tests for nil "cell_accompagnatore" element
         */
        boolean isNilCellAccompagnatore();
        
        /**
         * Sets the "cell_accompagnatore" element
         */
        void setCellAccompagnatore(String cellAccompagnatore);
        
        /**
         * Sets (as xml) the "cell_accompagnatore" element
         */
        void xsetCellAccompagnatore(org.apache.xmlbeans.XmlString cellAccompagnatore);
        
        /**
         * Nils the "cell_accompagnatore" element
         */
        void setNilCellAccompagnatore();
        
        /**
         * Gets the "note" element
         */
        String getNote();
        
        /**
         * Gets (as xml) the "note" element
         */
        org.apache.xmlbeans.XmlString xgetNote();
        
        /**
         * Tests for nil "note" element
         */
        boolean isNilNote();
        
        /**
         * Sets the "note" element
         */
        void setNote(String note);
        
        /**
         * Sets (as xml) the "note" element
         */
        void xsetNote(org.apache.xmlbeans.XmlString note);
        
        /**
         * Nils the "note" element
         */
        void setNilNote();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static GetReservation newInstance() {
              return (GetReservation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static GetReservation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (GetReservation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static GetReservationDocument newInstance() {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static GetReservationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static GetReservationDocument parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static GetReservationDocument parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static GetReservationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static GetReservationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static GetReservationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static GetReservationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static GetReservationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static GetReservationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static GetReservationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static GetReservationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static GetReservationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static GetReservationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static GetReservationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static GetReservationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static GetReservationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static GetReservationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (GetReservationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
