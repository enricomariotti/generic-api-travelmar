/*
 * XML Type:  TratteResult
 * Namespace: urn:reservation
 * Java type: reservation.TratteResult
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * An XML TratteResult(@urn:reservation).
 *
 * This is a complex type.
 */
public class TratteResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.TratteResult
{
    private static final long serialVersionUID = 1L;
    
    public TratteResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATA$0 = 
        new javax.xml.namespace.QName("", "data");
    private static final javax.xml.namespace.QName ORAPAR$2 = 
        new javax.xml.namespace.QName("", "ora_par");
    private static final javax.xml.namespace.QName ORAARR$4 = 
        new javax.xml.namespace.QName("", "ora_arr");
    private static final javax.xml.namespace.QName ADULTI$6 = 
        new javax.xml.namespace.QName("", "adulti");
    private static final javax.xml.namespace.QName BAMBINI$8 = 
        new javax.xml.namespace.QName("", "bambini");
    private static final javax.xml.namespace.QName STATUS$10 = 
        new javax.xml.namespace.QName("", "status");
    private static final javax.xml.namespace.QName TARADULTI$12 = 
        new javax.xml.namespace.QName("", "tar_adulti");
    private static final javax.xml.namespace.QName TARBAMBINI$14 = 
        new javax.xml.namespace.QName("", "tar_bambini");
    private static final javax.xml.namespace.QName TARBAGAGLI$16 = 
        new javax.xml.namespace.QName("", "tar_bagagli");
    private static final javax.xml.namespace.QName TARANIMALI$18 = 
        new javax.xml.namespace.QName("", "tar_animali");
    private static final javax.xml.namespace.QName TOTALE$20 = 
        new javax.xml.namespace.QName("", "totale");
    private static final javax.xml.namespace.QName CFGLINEA$22 = 
        new javax.xml.namespace.QName("", "Cfg_Linea");
    private static final javax.xml.namespace.QName IDCORSA$24 = 
        new javax.xml.namespace.QName("", "IdCorsa");
    
    
    /**
     * Gets the "data" element
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
     * Gets (as xml) the "data" element
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
     * Sets the "data" element
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
     * Sets (as xml) the "data" element
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
     * Gets the "ora_par" element
     */
    public String getOraPar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORAPAR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ora_par" element
     */
    public org.apache.xmlbeans.XmlString xgetOraPar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORAPAR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ora_par" element
     */
    public void setOraPar(String oraPar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORAPAR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORAPAR$2);
            }
            target.setStringValue(oraPar);
        }
    }
    
    /**
     * Sets (as xml) the "ora_par" element
     */
    public void xsetOraPar(org.apache.xmlbeans.XmlString oraPar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORAPAR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORAPAR$2);
            }
            target.set(oraPar);
        }
    }
    
    /**
     * Gets the "ora_arr" element
     */
    public String getOraArr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORAARR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ora_arr" element
     */
    public org.apache.xmlbeans.XmlString xgetOraArr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORAARR$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ora_arr" element
     */
    public void setOraArr(String oraArr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORAARR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORAARR$4);
            }
            target.setStringValue(oraArr);
        }
    }
    
    /**
     * Sets (as xml) the "ora_arr" element
     */
    public void xsetOraArr(org.apache.xmlbeans.XmlString oraArr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORAARR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORAARR$4);
            }
            target.set(oraArr);
        }
    }
    
    /**
     * Gets the "adulti" element
     */
    public String getAdulti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADULTI$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "adulti" element
     */
    public org.apache.xmlbeans.XmlString xgetAdulti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADULTI$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "adulti" element
     */
    public void setAdulti(String adulti)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADULTI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADULTI$6);
            }
            target.setStringValue(adulti);
        }
    }
    
    /**
     * Sets (as xml) the "adulti" element
     */
    public void xsetAdulti(org.apache.xmlbeans.XmlString adulti)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADULTI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADULTI$6);
            }
            target.set(adulti);
        }
    }
    
    /**
     * Gets the "bambini" element
     */
    public String getBambini()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAMBINI$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bambini" element
     */
    public org.apache.xmlbeans.XmlString xgetBambini()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BAMBINI$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bambini" element
     */
    public void setBambini(String bambini)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAMBINI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BAMBINI$8);
            }
            target.setStringValue(bambini);
        }
    }
    
    /**
     * Sets (as xml) the "bambini" element
     */
    public void xsetBambini(org.apache.xmlbeans.XmlString bambini)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BAMBINI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BAMBINI$8);
            }
            target.set(bambini);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$10);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$10);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "tar_adulti" element
     */
    public String getTarAdulti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARADULTI$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tar_adulti" element
     */
    public org.apache.xmlbeans.XmlString xgetTarAdulti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARADULTI$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tar_adulti" element
     */
    public void setTarAdulti(String tarAdulti)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARADULTI$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARADULTI$12);
            }
            target.setStringValue(tarAdulti);
        }
    }
    
    /**
     * Sets (as xml) the "tar_adulti" element
     */
    public void xsetTarAdulti(org.apache.xmlbeans.XmlString tarAdulti)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARADULTI$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARADULTI$12);
            }
            target.set(tarAdulti);
        }
    }
    
    /**
     * Gets the "tar_bambini" element
     */
    public String getTarBambini()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARBAMBINI$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tar_bambini" element
     */
    public org.apache.xmlbeans.XmlString xgetTarBambini()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARBAMBINI$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tar_bambini" element
     */
    public void setTarBambini(String tarBambini)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARBAMBINI$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARBAMBINI$14);
            }
            target.setStringValue(tarBambini);
        }
    }
    
    /**
     * Sets (as xml) the "tar_bambini" element
     */
    public void xsetTarBambini(org.apache.xmlbeans.XmlString tarBambini)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARBAMBINI$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARBAMBINI$14);
            }
            target.set(tarBambini);
        }
    }
    
    /**
     * Gets the "tar_bagagli" element
     */
    public String getTarBagagli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARBAGAGLI$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tar_bagagli" element
     */
    public org.apache.xmlbeans.XmlString xgetTarBagagli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARBAGAGLI$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tar_bagagli" element
     */
    public void setTarBagagli(String tarBagagli)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARBAGAGLI$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARBAGAGLI$16);
            }
            target.setStringValue(tarBagagli);
        }
    }
    
    /**
     * Sets (as xml) the "tar_bagagli" element
     */
    public void xsetTarBagagli(org.apache.xmlbeans.XmlString tarBagagli)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARBAGAGLI$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARBAGAGLI$16);
            }
            target.set(tarBagagli);
        }
    }
    
    /**
     * Gets the "tar_animali" element
     */
    public String getTarAnimali()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARANIMALI$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tar_animali" element
     */
    public org.apache.xmlbeans.XmlString xgetTarAnimali()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARANIMALI$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tar_animali" element
     */
    public void setTarAnimali(String tarAnimali)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARANIMALI$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARANIMALI$18);
            }
            target.setStringValue(tarAnimali);
        }
    }
    
    /**
     * Sets (as xml) the "tar_animali" element
     */
    public void xsetTarAnimali(org.apache.xmlbeans.XmlString tarAnimali)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARANIMALI$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARANIMALI$18);
            }
            target.set(tarAnimali);
        }
    }
    
    /**
     * Gets the "totale" element
     */
    public String getTotale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "totale" element
     */
    public org.apache.xmlbeans.XmlString xgetTotale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOTALE$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "totale" element
     */
    public void setTotale(String totale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALE$20);
            }
            target.setStringValue(totale);
        }
    }
    
    /**
     * Sets (as xml) the "totale" element
     */
    public void xsetTotale(org.apache.xmlbeans.XmlString totale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOTALE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOTALE$20);
            }
            target.set(totale);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CFGLINEA$22, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CFGLINEA$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CFGLINEA$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CFGLINEA$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CFGLINEA$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CFGLINEA$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCORSA$24, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDCORSA$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCORSA$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDCORSA$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDCORSA$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDCORSA$24);
            }
            target.set(idCorsa);
        }
    }
}
