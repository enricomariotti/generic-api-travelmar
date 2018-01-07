/*
 * XML Type:  getReservationResult
 * Namespace: urn:reservation
 * Java type: reservation.GetReservationResult
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * An XML getReservationResult(@urn:reservation).
 *
 * This is a complex type.
 */
public class GetReservationResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.GetReservationResult
{
    private static final long serialVersionUID = 1L;
    
    public GetReservationResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("", "status");
    private static final javax.xml.namespace.QName DATA$2 = 
        new javax.xml.namespace.QName("", "data");
    private static final javax.xml.namespace.QName MESSAGE$4 = 
        new javax.xml.namespace.QName("", "message");
    
    
    /**
     * Gets the "status" element
     */
    public java.math.BigInteger getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlInteger xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.math.BigInteger status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
            }
            target.setBigIntegerValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlInteger status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "data" element
     */
    public reservation.PrenotazioniArray getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            reservation.PrenotazioniArray target = null;
            target = (reservation.PrenotazioniArray)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(reservation.PrenotazioniArray data)
    {
        generatedSetterHelperImpl(data, DATA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "data" element
     */
    public reservation.PrenotazioniArray addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            reservation.PrenotazioniArray target = null;
            target = (reservation.PrenotazioniArray)get_store().add_element_user(DATA$2);
            return target;
        }
    }
    
    /**
     * Gets the "message" element
     */
    public String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "message" element
     */
    public void setMessage(String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$4);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$4);
            }
            target.set(message);
        }
    }
}
