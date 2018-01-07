/*
 * An XML document type.
 * Localname: annullaPrenResponse
 * Namespace: urn:reservation
 * Java type: reservation.AnnullaPrenResponseDocument
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * A document containing one annullaPrenResponse(@urn:reservation) element.
 *
 * This is a complex type.
 */
public class AnnullaPrenResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.AnnullaPrenResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnnullaPrenResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNULLAPRENRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:reservation", "annullaPrenResponse");
    
    
    /**
     * Gets the "annullaPrenResponse" element
     */
    public AnnullaPrenResponse getAnnullaPrenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AnnullaPrenResponse target = null;
            target = (AnnullaPrenResponse)get_store().find_element_user(ANNULLAPRENRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annullaPrenResponse" element
     */
    public void setAnnullaPrenResponse(AnnullaPrenResponse annullaPrenResponse)
    {
        generatedSetterHelperImpl(annullaPrenResponse, ANNULLAPRENRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "annullaPrenResponse" element
     */
    public AnnullaPrenResponse addNewAnnullaPrenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AnnullaPrenResponse target = null;
            target = (AnnullaPrenResponse)get_store().add_element_user(ANNULLAPRENRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML annullaPrenResponse(@urn:reservation).
     *
     * This is a complex type.
     */
    public static class AnnullaPrenResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements AnnullaPrenResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AnnullaPrenResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public reservation.AnnullaprenResult getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.AnnullaprenResult target = null;
                target = (reservation.AnnullaprenResult)get_store().find_element_user(RETURN$0, 0);
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
                reservation.AnnullaprenResult target = null;
                target = (reservation.AnnullaprenResult)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(reservation.AnnullaprenResult xreturn)
        {
            generatedSetterHelperImpl(xreturn, RETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public reservation.AnnullaprenResult addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.AnnullaprenResult target = null;
                target = (reservation.AnnullaprenResult)get_store().add_element_user(RETURN$0);
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
                reservation.AnnullaprenResult target = null;
                target = (reservation.AnnullaprenResult)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (reservation.AnnullaprenResult)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
