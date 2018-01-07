/*
 * An XML document type.
 * Localname: getDisponibilita
 * Namespace: urn:reservation
 * Java type: reservation.GetDisponibilitaDocument
 *
 * Automatically generated - do not modify.
 */
package reservation.impl;
/**
 * A document containing one getDisponibilita(@urn:reservation) element.
 *
 * This is a complex type.
 */
public class GetDisponibilitaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements reservation.GetDisponibilitaDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDisponibilitaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDISPONIBILITA$0 = 
        new javax.xml.namespace.QName("urn:reservation", "getDisponibilita");
    
    
    /**
     * Gets the "getDisponibilita" element
     */
    public GetDisponibilita getGetDisponibilita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetDisponibilita target = null;
            target = (GetDisponibilita)get_store().find_element_user(GETDISPONIBILITA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDisponibilita" element
     */
    public void setGetDisponibilita(GetDisponibilita getDisponibilita)
    {
        generatedSetterHelperImpl(getDisponibilita, GETDISPONIBILITA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getDisponibilita" element
     */
    public GetDisponibilita addNewGetDisponibilita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GetDisponibilita target = null;
            target = (GetDisponibilita)get_store().add_element_user(GETDISPONIBILITA$0);
            return target;
        }
    }
    /**
     * An XML getDisponibilita(@urn:reservation).
     *
     * This is a complex type.
     */
    public static class GetDisponibilitaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements GetDisponibilita
    {
        private static final long serialVersionUID = 1L;
        
        public GetDisponibilitaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERNAME$0 = 
            new javax.xml.namespace.QName("", "username");
        private static final javax.xml.namespace.QName PASSWORD$2 = 
            new javax.xml.namespace.QName("", "password");
        private static final javax.xml.namespace.QName TRATTE$4 = 
            new javax.xml.namespace.QName("", "tratte");
        private static final javax.xml.namespace.QName ADULTI$6 = 
            new javax.xml.namespace.QName("", "adulti");
        private static final javax.xml.namespace.QName BAMBINI$8 = 
            new javax.xml.namespace.QName("", "bambini");
        
        
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
         * Gets the "tratte" element
         */
        public reservation.TratteArray getTratte()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.TratteArray target = null;
                target = (reservation.TratteArray)get_store().find_element_user(TRATTE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "tratte" element
         */
        public boolean isNilTratte()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.TratteArray target = null;
                target = (reservation.TratteArray)get_store().find_element_user(TRATTE$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "tratte" element
         */
        public void setTratte(reservation.TratteArray tratte)
        {
            generatedSetterHelperImpl(tratte, TRATTE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "tratte" element
         */
        public reservation.TratteArray addNewTratte()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.TratteArray target = null;
                target = (reservation.TratteArray)get_store().add_element_user(TRATTE$4);
                return target;
            }
        }
        
        /**
         * Nils the "tratte" element
         */
        public void setNilTratte()
        {
            synchronized (monitor())
            {
                check_orphaned();
                reservation.TratteArray target = null;
                target = (reservation.TratteArray)get_store().find_element_user(TRATTE$4, 0);
                if (target == null)
                {
                    target = (reservation.TratteArray)get_store().add_element_user(TRATTE$4);
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
    }
}
