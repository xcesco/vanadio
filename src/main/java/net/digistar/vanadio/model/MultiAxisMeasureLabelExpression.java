package net.digistar.vanadio.model;

import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

/**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    // @XmlAccessorType(XmlAccessType.FIELD)
@BindType
    public  class MultiAxisMeasureLabelExpression {

          @BindXml(xmlType = XmlType.VALUE)
        public String content;

        /**
         * Gets the value of the content property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getContent() {
            return content;
        }

        /**
         * Sets the value of the content property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setContent(String value) {
            this.content = value;
        }

    }