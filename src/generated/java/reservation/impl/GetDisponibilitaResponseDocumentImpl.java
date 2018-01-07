/*
 * An XML document type.
 * Localname: getDisponibilitaResponse
 * Namespace: urn:reservation
 * Java type: reservation.GetDisponibilitaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * A document containing one getDisponibilitaResponse(@urn:reservation) element.
 *
 * This is a complex type.
 */
public class GetDisponibilitaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.GetDisponibilitaResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDisponibilitaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDISPONIBILITARESPONSE$0 = 
        new javax.xml.namespace.QName("urn:reservation", "getDisponibilitaResponse");
    
    
    /**
     * Gets the "getDisponibilitaResponse" element
     */
    public GetDisponibilitaResponse getGetDisponibilitaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetDisponibilitaResponse target = null;
            target = (GetDisponibilitaResponse)get_store().find_element_user(GETDISPONIBILITARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDisponibilitaResponse" element
     */
    public void setGetDisponibilitaResponse(GetDisponibilitaResponse getDisponibilitaResponse)
    {
        generatedSetterHelperImpl(getDisponibilitaResponse, GETDISPONIBILITARESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getDisponibilitaResponse" element
     */
    public GetDisponibilitaResponse addNewGetDisponibilitaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetDisponibilitaResponse target = null;
            target = (GetDisponibilitaResponse)get_store().add_element_user(GETDISPONIBILITARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getDisponibilitaResponse(@urn:reservation).
     *
     * This is a complex type.
     */
    public static class GetDisponibilitaResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements GetDisponibilitaResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetDisponibilitaResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public reservation.GetDisponibilitaResult getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.GetDisponibilitaResult target = null;
                target = (reservation.GetDisponibilitaResult)get_store().find_element_user(RETURN$0, 0);
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
                reservation.GetDisponibilitaResult target = null;
                target = (reservation.GetDisponibilitaResult)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(reservation.GetDisponibilitaResult xreturn)
        {
            generatedSetterHelperImpl(xreturn, RETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public reservation.GetDisponibilitaResult addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.GetDisponibilitaResult target = null;
                target = (reservation.GetDisponibilitaResult)get_store().add_element_user(RETURN$0);
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
                reservation.GetDisponibilitaResult target = null;
                target = (reservation.GetDisponibilitaResult)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (reservation.GetDisponibilitaResult)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
