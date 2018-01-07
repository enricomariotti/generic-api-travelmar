/*
 * An XML document type.
 * Localname: getScaliResponse
 * Namespace: urn:reservation
 * Java type: reservation.GetScaliResponseDocument
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * A document containing one getScaliResponse(@urn:reservation) element.
 *
 * This is a complex type.
 */
public class GetScaliResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.GetScaliResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetScaliResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSCALIRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:reservation", "getScaliResponse");
    
    
    /**
     * Gets the "getScaliResponse" element
     */
    public GetScaliResponse getGetScaliResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetScaliResponse target = null;
            target = (GetScaliResponse)get_store().find_element_user(GETSCALIRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getScaliResponse" element
     */
    public void setGetScaliResponse(GetScaliResponse getScaliResponse)
    {
        generatedSetterHelperImpl(getScaliResponse, GETSCALIRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getScaliResponse" element
     */
    public GetScaliResponse addNewGetScaliResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetScaliResponse target = null;
            target = (GetScaliResponse)get_store().add_element_user(GETSCALIRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getScaliResponse(@urn:reservation).
     *
     * This is a complex type.
     */
    public static class GetScaliResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements GetScaliResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetScaliResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public reservation.ScaliArray getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.ScaliArray target = null;
                target = (reservation.ScaliArray)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.ScaliArray target = null;
                target = (reservation.ScaliArray)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(reservation.ScaliArray xreturn)
        {
            generatedSetterHelperImpl(xreturn, RETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public reservation.ScaliArray addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.ScaliArray target = null;
                target = (reservation.ScaliArray)get_store().add_element_user(RETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.ScaliArray target = null;
                target = (reservation.ScaliArray)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (reservation.ScaliArray)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
