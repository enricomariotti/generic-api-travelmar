/*
 * An XML document type.
 * Localname: getScali
 * Namespace: urn:reservation
 * Java type: reservation.GetScaliDocument
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * A document containing one getScali(@urn:reservation) element.
 *
 * This is a complex type.
 */
public class GetScaliDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.GetScaliDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetScaliDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSCALI$0 = 
        new javax.xml.namespace.QName("urn:reservation", "getScali");
    
    
    /**
     * Gets the "getScali" element
     */
    public GetScali getGetScali()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetScali target = null;
            target = (GetScali)get_store().find_element_user(GETSCALI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getScali" element
     */
    public void setGetScali(GetScali getScali)
    {
        generatedSetterHelperImpl(getScali, GETSCALI$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getScali" element
     */
    public GetScali addNewGetScali()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetScali target = null;
            target = (GetScali)get_store().add_element_user(GETSCALI$0);
            return target;
        }
    }
    /**
     * An XML getScali(@urn:reservation).
     *
     * This is a complex type.
     */
    public static class GetScaliImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements GetScali
    {
        private static final long serialVersionUID = 1L;
        
        public GetScaliImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
