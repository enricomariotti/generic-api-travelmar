/*
 * XML Type:  Biglietto
 * Namespace: urn:reservation
 * Java type: reservation.Biglietto
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * An XML Biglietto(@urn:reservation).
 *
 * This is a complex type.
 */
public class BigliettoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.Biglietto
{
    private static final long serialVersionUID = 1L;
    
    public BigliettoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODTAR$0 = 
        new javax.xml.namespace.QName("", "CodTar");
    private static final javax.xml.namespace.QName NUMBIGL$2 = 
        new javax.xml.namespace.QName("", "NumBigl");
    private static final javax.xml.namespace.QName QUANTITA$4 = 
        new javax.xml.namespace.QName("", "Quantita");
    private static final javax.xml.namespace.QName IMPORTO$6 = 
        new javax.xml.namespace.QName("", "Importo");
    private static final javax.xml.namespace.QName MESSAGE$8 = 
        new javax.xml.namespace.QName("", "Message");
    
    
    /**
     * Gets the "CodTar" element
     */
    public String getCodTar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODTAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodTar" element
     */
    public org.apache.xmlbeans.XmlString xgetCodTar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODTAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CodTar" element
     */
    public void setCodTar(String codTar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODTAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODTAR$0);
            }
            target.setStringValue(codTar);
        }
    }
    
    /**
     * Sets (as xml) the "CodTar" element
     */
    public void xsetCodTar(org.apache.xmlbeans.XmlString codTar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODTAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODTAR$0);
            }
            target.set(codTar);
        }
    }
    
    /**
     * Gets the "NumBigl" element
     */
    public String getNumBigl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBIGL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumBigl" element
     */
    public org.apache.xmlbeans.XmlString xgetNumBigl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBIGL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumBigl" element
     */
    public void setNumBigl(String numBigl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBIGL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBIGL$2);
            }
            target.setStringValue(numBigl);
        }
    }
    
    /**
     * Sets (as xml) the "NumBigl" element
     */
    public void xsetNumBigl(org.apache.xmlbeans.XmlString numBigl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBIGL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBIGL$2);
            }
            target.set(numBigl);
        }
    }
    
    /**
     * Gets the "Quantita" element
     */
    public String getQuantita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Quantita" element
     */
    public org.apache.xmlbeans.XmlString xgetQuantita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITA$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Quantita" element
     */
    public void setQuantita(String quantita)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITA$4);
            }
            target.setStringValue(quantita);
        }
    }
    
    /**
     * Sets (as xml) the "Quantita" element
     */
    public void xsetQuantita(org.apache.xmlbeans.XmlString quantita)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUANTITA$4);
            }
            target.set(quantita);
        }
    }
    
    /**
     * Gets the "Importo" element
     */
    public String getImporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Importo" element
     */
    public org.apache.xmlbeans.XmlString xgetImporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTO$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Importo" element
     */
    public void setImporto(String importo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTO$6);
            }
            target.setStringValue(importo);
        }
    }
    
    /**
     * Sets (as xml) the "Importo" element
     */
    public void xsetImporto(org.apache.xmlbeans.XmlString importo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMPORTO$6);
            }
            target.set(importo);
        }
    }
    
    /**
     * Gets the "Message" element
     */
    public String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$8);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "Message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$8);
            }
            target.set(message);
        }
    }
}
