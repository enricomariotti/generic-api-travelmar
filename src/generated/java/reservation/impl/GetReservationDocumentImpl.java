/*
 * An XML document type.
 * Localname: getReservation
 * Namespace: urn:reservation
 * Java type: reservation.GetReservationDocument
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * A document containing one getReservation(@urn:reservation) element.
 *
 * This is a complex type.
 */
public class GetReservationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.GetReservationDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetReservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRESERVATION$0 = 
        new javax.xml.namespace.QName("urn:reservation", "getReservation");
    
    
    /**
     * Gets the "getReservation" element
     */
    public GetReservation getGetReservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetReservation target = null;
            target = (GetReservation)get_store().find_element_user(GETRESERVATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getReservation" element
     */
    public void setGetReservation(GetReservation getReservation)
    {
        generatedSetterHelperImpl(getReservation, GETRESERVATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getReservation" element
     */
    public GetReservation addNewGetReservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetReservation target = null;
            target = (GetReservation)get_store().add_element_user(GETRESERVATION$0);
            return target;
        }
    }
    /**
     * An XML getReservation(@urn:reservation).
     *
     * This is a complex type.
     */
    public static class GetReservationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements GetReservation
    {
        private static final long serialVersionUID = 1L;
        
        public GetReservationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERNAME$0 = 
            new javax.xml.namespace.QName("", "username");
        private static final javax.xml.namespace.QName PASSWORD$2 = 
            new javax.xml.namespace.QName("", "password");
        private static final javax.xml.namespace.QName CORSE$4 = 
            new javax.xml.namespace.QName("", "corse");
        private static final javax.xml.namespace.QName ADULTI$6 = 
            new javax.xml.namespace.QName("", "adulti");
        private static final javax.xml.namespace.QName BAMBINI$8 = 
            new javax.xml.namespace.QName("", "bambini");
        private static final javax.xml.namespace.QName BAGAGLI$10 = 
            new javax.xml.namespace.QName("", "bagagli");
        private static final javax.xml.namespace.QName ANIMALI$12 = 
            new javax.xml.namespace.QName("", "animali");
        private static final javax.xml.namespace.QName ACCOMPAGNATORE$14 = 
            new javax.xml.namespace.QName("", "accompagnatore");
        private static final javax.xml.namespace.QName CELLACCOMPAGNATORE$16 = 
            new javax.xml.namespace.QName("", "cell_accompagnatore");
        private static final javax.xml.namespace.QName NOTE$18 = 
            new javax.xml.namespace.QName("", "note");
        
        
        /**
         * Gets the "username" element
         */
        public String getUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "username" element
         */
        public org.apache.xmlbeans.XmlString xgetUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "username" element
         */
        public boolean isNilUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "username" element
         */
        public void setUsername(String username)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$0);
                }
                target.setStringValue(username);
            }
        }
        
        /**
         * Sets (as xml) the "username" element
         */
        public void xsetUsername(org.apache.xmlbeans.XmlString username)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$0);
                }
                target.set(username);
            }
        }
        
        /**
         * Nils the "username" element
         */
        public void setNilUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "password" element
         */
        public String getPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "password" element
         */
        public org.apache.xmlbeans.XmlString xgetPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "password" element
         */
        public boolean isNilPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "password" element
         */
        public void setPassword(String password)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$2);
                }
                target.setStringValue(password);
            }
        }
        
        /**
         * Sets (as xml) the "password" element
         */
        public void xsetPassword(org.apache.xmlbeans.XmlString password)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$2);
                }
                target.set(password);
            }
        }
        
        /**
         * Nils the "password" element
         */
        public void setNilPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "corse" element
         */
        public reservation.CorseArray getCorse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.CorseArray target = null;
                target = (reservation.CorseArray)get_store().find_element_user(CORSE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "corse" element
         */
        public boolean isNilCorse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.CorseArray target = null;
                target = (reservation.CorseArray)get_store().find_element_user(CORSE$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "corse" element
         */
        public void setCorse(reservation.CorseArray corse)
        {
            generatedSetterHelperImpl(corse, CORSE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "corse" element
         */
        public reservation.CorseArray addNewCorse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.CorseArray target = null;
                target = (reservation.CorseArray)get_store().add_element_user(CORSE$4);
                return target;
            }
        }
        
        /**
         * Nils the "corse" element
         */
        public void setNilCorse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.CorseArray target = null;
                target = (reservation.CorseArray)get_store().find_element_user(CORSE$4, 0);
                if (target == null)
                {
                    target = (reservation.CorseArray)get_store().add_element_user(CORSE$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "adulti" element
         */
        public java.math.BigInteger getAdulti()
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
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "adulti" element
         */
        public org.apache.xmlbeans.XmlInteger xgetAdulti()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADULTI$6, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "adulti" element
         */
        public boolean isNilAdulti()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADULTI$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "adulti" element
         */
        public void setAdulti(java.math.BigInteger adulti)
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
                target.setBigIntegerValue(adulti);
            }
        }
        
        /**
         * Sets (as xml) the "adulti" element
         */
        public void xsetAdulti(org.apache.xmlbeans.XmlInteger adulti)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADULTI$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ADULTI$6);
                }
                target.set(adulti);
            }
        }
        
        /**
         * Nils the "adulti" element
         */
        public void setNilAdulti()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADULTI$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ADULTI$6);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "bambini" element
         */
        public java.math.BigInteger getBambini()
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
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "bambini" element
         */
        public org.apache.xmlbeans.XmlInteger xgetBambini()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BAMBINI$8, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "bambini" element
         */
        public boolean isNilBambini()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BAMBINI$8, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "bambini" element
         */
        public void setBambini(java.math.BigInteger bambini)
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
                target.setBigIntegerValue(bambini);
            }
        }
        
        /**
         * Sets (as xml) the "bambini" element
         */
        public void xsetBambini(org.apache.xmlbeans.XmlInteger bambini)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BAMBINI$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BAMBINI$8);
                }
                target.set(bambini);
            }
        }
        
        /**
         * Nils the "bambini" element
         */
        public void setNilBambini()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BAMBINI$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BAMBINI$8);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "bagagli" element
         */
        public java.math.BigInteger getBagagli()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAGAGLI$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "bagagli" element
         */
        public org.apache.xmlbeans.XmlInteger xgetBagagli()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BAGAGLI$10, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "bagagli" element
         */
        public boolean isNilBagagli()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BAGAGLI$10, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "bagagli" element
         */
        public void setBagagli(java.math.BigInteger bagagli)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAGAGLI$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BAGAGLI$10);
                }
                target.setBigIntegerValue(bagagli);
            }
        }
        
        /**
         * Sets (as xml) the "bagagli" element
         */
        public void xsetBagagli(org.apache.xmlbeans.XmlInteger bagagli)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BAGAGLI$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BAGAGLI$10);
                }
                target.set(bagagli);
            }
        }
        
        /**
         * Nils the "bagagli" element
         */
        public void setNilBagagli()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BAGAGLI$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BAGAGLI$10);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "animali" element
         */
        public java.math.BigInteger getAnimali()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANIMALI$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "animali" element
         */
        public org.apache.xmlbeans.XmlInteger xgetAnimali()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ANIMALI$12, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "animali" element
         */
        public boolean isNilAnimali()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ANIMALI$12, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "animali" element
         */
        public void setAnimali(java.math.BigInteger animali)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANIMALI$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANIMALI$12);
                }
                target.setBigIntegerValue(animali);
            }
        }
        
        /**
         * Sets (as xml) the "animali" element
         */
        public void xsetAnimali(org.apache.xmlbeans.XmlInteger animali)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ANIMALI$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ANIMALI$12);
                }
                target.set(animali);
            }
        }
        
        /**
         * Nils the "animali" element
         */
        public void setNilAnimali()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ANIMALI$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ANIMALI$12);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "accompagnatore" element
         */
        public String getAccompagnatore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOMPAGNATORE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "accompagnatore" element
         */
        public org.apache.xmlbeans.XmlString xgetAccompagnatore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOMPAGNATORE$14, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "accompagnatore" element
         */
        public boolean isNilAccompagnatore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOMPAGNATORE$14, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "accompagnatore" element
         */
        public void setAccompagnatore(String accompagnatore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOMPAGNATORE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOMPAGNATORE$14);
                }
                target.setStringValue(accompagnatore);
            }
        }
        
        /**
         * Sets (as xml) the "accompagnatore" element
         */
        public void xsetAccompagnatore(org.apache.xmlbeans.XmlString accompagnatore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOMPAGNATORE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCOMPAGNATORE$14);
                }
                target.set(accompagnatore);
            }
        }
        
        /**
         * Nils the "accompagnatore" element
         */
        public void setNilAccompagnatore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOMPAGNATORE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCOMPAGNATORE$14);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "cell_accompagnatore" element
         */
        public String getCellAccompagnatore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLACCOMPAGNATORE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cell_accompagnatore" element
         */
        public org.apache.xmlbeans.XmlString xgetCellAccompagnatore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELLACCOMPAGNATORE$16, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "cell_accompagnatore" element
         */
        public boolean isNilCellAccompagnatore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELLACCOMPAGNATORE$16, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "cell_accompagnatore" element
         */
        public void setCellAccompagnatore(String cellAccompagnatore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLACCOMPAGNATORE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CELLACCOMPAGNATORE$16);
                }
                target.setStringValue(cellAccompagnatore);
            }
        }
        
        /**
         * Sets (as xml) the "cell_accompagnatore" element
         */
        public void xsetCellAccompagnatore(org.apache.xmlbeans.XmlString cellAccompagnatore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELLACCOMPAGNATORE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CELLACCOMPAGNATORE$16);
                }
                target.set(cellAccompagnatore);
            }
        }
        
        /**
         * Nils the "cell_accompagnatore" element
         */
        public void setNilCellAccompagnatore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELLACCOMPAGNATORE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CELLACCOMPAGNATORE$16);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "note" element
         */
        public String getNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "note" element
         */
        public org.apache.xmlbeans.XmlString xgetNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$18, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "note" element
         */
        public boolean isNilNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$18, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "note" element
         */
        public void setNote(String note)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTE$18);
                }
                target.setStringValue(note);
            }
        }
        
        /**
         * Sets (as xml) the "note" element
         */
        public void xsetNote(org.apache.xmlbeans.XmlString note)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTE$18);
                }
                target.set(note);
            }
        }
        
        /**
         * Nils the "note" element
         */
        public void setNilNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTE$18);
                }
                target.setNil();
            }
        }
    }
}
