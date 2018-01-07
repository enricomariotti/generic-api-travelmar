/*
 * An XML document type.
 * Localname: getReservationResponse
 * Namespace: urn:reservation
 * Java type: reservation.GetReservationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * A document containing one getReservationResponse(@urn:reservation) element.
 *
 * This is a complex type.
 */
public class GetReservationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.GetReservationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetReservationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRESERVATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:reservation", "getReservationResponse");
    
    
    /**
     * Gets the "getReservationResponse" element
     */
    public GetReservationResponse getGetReservationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetReservationResponse target = null;
            target = (GetReservationResponse)get_store().find_element_user(GETRESERVATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getReservationResponse" element
     */
    public void setGetReservationResponse(GetReservationResponse getReservationResponse)
    {
        generatedSetterHelperImpl(getReservationResponse, GETRESERVATIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getReservationResponse" element
     */
    public GetReservationResponse addNewGetReservationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetReservationResponse target = null;
            target = (GetReservationResponse)get_store().add_element_user(GETRESERVATIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getReservationResponse(@urn:reservation).
     *
     * This is a complex type.
     */
    public static class GetReservationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements GetReservationResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetReservationResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public reservation.GetReservationResult getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.GetReservationResult target = null;
                target = (reservation.GetReservationResult)get_store().find_element_user(RETURN$0, 0);
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
                reservation.GetReservationResult target = null;
                target = (reservation.GetReservationResult)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(reservation.GetReservationResult xreturn)
        {
            generatedSetterHelperImpl(xreturn, RETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public reservation.GetReservationResult addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.GetReservationResult target = null;
                target = (reservation.GetReservationResult)get_store().add_element_user(RETURN$0);
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
                reservation.GetReservationResult target = null;
                target = (reservation.GetReservationResult)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (reservation.GetReservationResult)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
