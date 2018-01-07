/*
 * XML Type:  Corsa
 * Namespace: urn:reservation
 * Java type: reservation.Corsa
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * An XML Corsa(@urn:reservation).
 *
 * This is a complex type.
 */
public class CorsaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.Corsa
{
    private static final long serialVersionUID = 1L;
    
    public CorsaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATA$0 = 
        new javax.xml.namespace.QName("", "Data");
    private static final javax.xml.namespace.QName DA$2 = 
        new javax.xml.namespace.QName("", "Da");
    private static final javax.xml.namespace.QName A$4 = 
        new javax.xml.namespace.QName("", "A");
    private static final javax.xml.namespace.QName CFGLINEA$6 = 
        new javax.xml.namespace.QName("", "Cfg_Linea");
    private static final javax.xml.namespace.QName IDCORSA$8 = 
        new javax.xml.namespace.QName("", "IdCorsa");
    
    
    /**
     * Gets the "Data" element
     */
    public String getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Data" element
     */
    public org.apache.xmlbeans.XmlString xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Data" element
     */
    public void setData(String data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$0);
            }
            target.setStringValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "Data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlString data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$0);
            }
            target.set(data);
        }
    }
    
    /**
     * Gets the "Da" element
     */
    public String getDa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Da" element
     */
    public org.apache.xmlbeans.XmlString xgetDa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DA$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Da" element
     */
    public void setDa(String da)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DA$2);
            }
            target.setStringValue(da);
        }
    }
    
    /**
     * Sets (as xml) the "Da" element
     */
    public void xsetDa(org.apache.xmlbeans.XmlString da)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DA$2);
            }
            target.set(da);
        }
    }
    
    /**
     * Gets the "A" element
     */
    public String getA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "A" element
     */
    public org.apache.xmlbeans.XmlString xgetA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(A$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "A" element
     */
    public void setA(String a)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(A$4);
            }
            target.setStringValue(a);
        }
    }
    
    /**
     * Sets (as xml) the "A" element
     */
    public void xsetA(org.apache.xmlbeans.XmlString a)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(A$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(A$4);
            }
            target.set(a);
        }
    }
    
    /**
     * Gets the "Cfg_Linea" element
     */
    public String getCfgLinea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CFGLINEA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Cfg_Linea" element
     */
    public org.apache.xmlbeans.XmlString xgetCfgLinea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CFGLINEA$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Cfg_Linea" element
     */
    public void setCfgLinea(String cfgLinea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CFGLINEA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CFGLINEA$6);
            }
            target.setStringValue(cfgLinea);
        }
    }
    
    /**
     * Sets (as xml) the "Cfg_Linea" element
     */
    public void xsetCfgLinea(org.apache.xmlbeans.XmlString cfgLinea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CFGLINEA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CFGLINEA$6);
            }
            target.set(cfgLinea);
        }
    }
    
    /**
     * Gets the "IdCorsa" element
     */
    public String getIdCorsa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCORSA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdCorsa" element
     */
    public org.apache.xmlbeans.XmlString xgetIdCorsa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDCORSA$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IdCorsa" element
     */
    public void setIdCorsa(String idCorsa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCORSA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDCORSA$8);
            }
            target.setStringValue(idCorsa);
        }
    }
    
    /**
     * Sets (as xml) the "IdCorsa" element
     */
    public void xsetIdCorsa(org.apache.xmlbeans.XmlString idCorsa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDCORSA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDCORSA$8);
            }
            target.set(idCorsa);
        }
    }
}
