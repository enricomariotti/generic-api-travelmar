/*
 * XML Type:  Prenotazione
 * Namespace: urn:reservation
 * Java type: reservation.Prenotazione
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * An XML Prenotazione(@urn:reservation).
 *
 * This is a complex type.
 */
public class PrenotazioneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.Prenotazione
{
    private static final long serialVersionUID = 1L;
    
    public PrenotazioneImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMPREN$0 = 
        new javax.xml.namespace.QName("", "numpren");
    private static final javax.xml.namespace.QName DATA$2 = 
        new javax.xml.namespace.QName("", "Data");
    private static final javax.xml.namespace.QName DA$4 = 
        new javax.xml.namespace.QName("", "Da");
    private static final javax.xml.namespace.QName A$6 = 
        new javax.xml.namespace.QName("", "A");
    private static final javax.xml.namespace.QName ORAPAR$8 = 
        new javax.xml.namespace.QName("", "ora_par");
    private static final javax.xml.namespace.QName ORAARR$10 = 
        new javax.xml.namespace.QName("", "ora_arr");
    private static final javax.xml.namespace.QName ADULTI$12 = 
        new javax.xml.namespace.QName("", "adulti");
    private static final javax.xml.namespace.QName BAMBINI$14 = 
        new javax.xml.namespace.QName("", "bambini");
    private static final javax.xml.namespace.QName INFANTI$16 = 
        new javax.xml.namespace.QName("", "infanti");
    private static final javax.xml.namespace.QName BAGAGLI$18 = 
        new javax.xml.namespace.QName("", "bagagli");
    private static final javax.xml.namespace.QName ANIMALI$20 = 
        new javax.xml.namespace.QName("", "animali");
    private static final javax.xml.namespace.QName TOTALE$22 = 
        new javax.xml.namespace.QName("", "totale");
    private static final javax.xml.namespace.QName BIGLIETTI$24 = 
        new javax.xml.namespace.QName("", "Biglietti");
    
    
    /**
     * Gets the "numpren" element
     */
    public String getNumpren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMPREN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numpren" element
     */
    public org.apache.xmlbeans.XmlString xgetNumpren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMPREN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numpren" element
     */
    public void setNumpren(String numpren)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMPREN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMPREN$0);
            }
            target.setStringValue(numpren);
        }
    }
    
    /**
     * Sets (as xml) the "numpren" element
     */
    public void xsetNumpren(org.apache.xmlbeans.XmlString numpren)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMPREN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMPREN$0);
            }
            target.set(numpren);
        }
    }
    
    /**
     * Gets the "Data" element
     */
    public String getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DA$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DA$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DA$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DA$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(A$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(A$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(A$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(A$6);
            }
            target.set(a);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORAPAR$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORAPAR$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORAPAR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORAPAR$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORAPAR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORAPAR$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORAARR$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORAARR$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORAARR$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORAARR$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORAARR$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORAARR$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADULTI$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADULTI$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADULTI$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADULTI$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADULTI$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADULTI$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAMBINI$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BAMBINI$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAMBINI$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BAMBINI$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BAMBINI$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BAMBINI$14);
            }
            target.set(bambini);
        }
    }
    
    /**
     * Gets the "infanti" element
     */
    public String getInfanti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFANTI$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "infanti" element
     */
    public org.apache.xmlbeans.XmlString xgetInfanti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INFANTI$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "infanti" element
     */
    public void setInfanti(String infanti)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFANTI$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFANTI$16);
            }
            target.setStringValue(infanti);
        }
    }
    
    /**
     * Sets (as xml) the "infanti" element
     */
    public void xsetInfanti(org.apache.xmlbeans.XmlString infanti)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INFANTI$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INFANTI$16);
            }
            target.set(infanti);
        }
    }
    
    /**
     * Gets the "bagagli" element
     */
    public String getBagagli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAGAGLI$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bagagli" element
     */
    public org.apache.xmlbeans.XmlString xgetBagagli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BAGAGLI$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bagagli" element
     */
    public void setBagagli(String bagagli)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAGAGLI$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BAGAGLI$18);
            }
            target.setStringValue(bagagli);
        }
    }
    
    /**
     * Sets (as xml) the "bagagli" element
     */
    public void xsetBagagli(org.apache.xmlbeans.XmlString bagagli)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BAGAGLI$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BAGAGLI$18);
            }
            target.set(bagagli);
        }
    }
    
    /**
     * Gets the "animali" element
     */
    public String getAnimali()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANIMALI$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "animali" element
     */
    public org.apache.xmlbeans.XmlString xgetAnimali()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANIMALI$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "animali" element
     */
    public void setAnimali(String animali)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANIMALI$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANIMALI$20);
            }
            target.setStringValue(animali);
        }
    }
    
    /**
     * Sets (as xml) the "animali" element
     */
    public void xsetAnimali(org.apache.xmlbeans.XmlString animali)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANIMALI$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANIMALI$20);
            }
            target.set(animali);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALE$22, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOTALE$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALE$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOTALE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOTALE$22);
            }
            target.set(totale);
        }
    }
    
    /**
     * Gets the "Biglietti" element
     */
    public reservation.BigliettiArray getBiglietti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            reservation.BigliettiArray target = null;
            target = (reservation.BigliettiArray)get_store().find_element_user(BIGLIETTI$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Biglietti" element
     */
    public void setBiglietti(reservation.BigliettiArray biglietti)
    {
        generatedSetterHelperImpl(biglietti, BIGLIETTI$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Biglietti" element
     */
    public reservation.BigliettiArray addNewBiglietti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            reservation.BigliettiArray target = null;
            target = (reservation.BigliettiArray)get_store().add_element_user(BIGLIETTI$24);
            return target;
        }
    }
}
