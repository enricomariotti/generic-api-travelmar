/*
 * XML Type:  Scali
 * Namespace: urn:reservation
 * Java type: reservation.Scali
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * An XML Scali(@urn:reservation).
 *
 * This is a complex type.
 */
public class ScaliImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.Scali
{
    private static final long serialVersionUID = 1L;
    
    public ScaliImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COD$0 = 
        new javax.xml.namespace.QName("", "COD");
    private static final javax.xml.namespace.QName SCALO$2 = 
        new javax.xml.namespace.QName("", "Scalo");
    
    
    /**
     * Gets the "COD" element
     */
    public String getCOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "COD" element
     */
    public org.apache.xmlbeans.XmlString xgetCOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "COD" element
     */
    public void setCOD(String cod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COD$0);
            }
            target.setStringValue(cod);
        }
    }
    
    /**
     * Sets (as xml) the "COD" element
     */
    public void xsetCOD(org.apache.xmlbeans.XmlString cod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COD$0);
            }
            target.set(cod);
        }
    }
    
    /**
     * Gets the "Scalo" element
     */
    public String getScalo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Scalo" element
     */
    public org.apache.xmlbeans.XmlString xgetScalo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCALO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Scalo" element
     */
    public void setScalo(String scalo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCALO$2);
            }
            target.setStringValue(scalo);
        }
    }
    
    /**
     * Sets (as xml) the "Scalo" element
     */
    public void xsetScalo(org.apache.xmlbeans.XmlString scalo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCALO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCALO$2);
            }
            target.set(scalo);
        }
    }
}
