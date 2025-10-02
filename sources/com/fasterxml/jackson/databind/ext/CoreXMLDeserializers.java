package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* loaded from: classes4.dex */
public class CoreXMLDeserializers extends Deserializers.Base {
    public static final DatatypeFactory d;

    public static class Std extends FromStringDeserializer<Object> {
        public final int h;

        public Std(Class cls, int i) {
            super(cls);
            this.h = i;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            if (this.h != 2 || !jsonParser.a1(JsonToken.VALUE_NUMBER_INT)) {
                return super.e(jsonParser, deserializationContext);
            }
            Date dateQ = Q(jsonParser, deserializationContext);
            if (dateQ == null) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(dateQ);
            TimeZone timeZoneK = deserializationContext.f.k();
            if (timeZoneK != null) {
                gregorianCalendar.setTimeZone(timeZoneK);
            }
            return CoreXMLDeserializers.d.newXMLGregorianCalendar(gregorianCalendar);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object o0(DeserializationContext deserializationContext, String str) {
            int i = this.h;
            if (i == 1) {
                return CoreXMLDeserializers.d.newDuration(str);
            }
            if (i != 2) {
                if (i == 3) {
                    return QName.valueOf(str);
                }
                throw new IllegalStateException();
            }
            try {
                Date dateR = R(deserializationContext, str);
                if (dateR == null) {
                    return null;
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(dateR);
                TimeZone timeZoneK = deserializationContext.f.k();
                if (timeZoneK != null) {
                    gregorianCalendar.setTimeZone(timeZoneK);
                }
                return CoreXMLDeserializers.d.newXMLGregorianCalendar(gregorianCalendar);
            } catch (JsonMappingException unused) {
                return CoreXMLDeserializers.d.newXMLGregorianCalendar(str);
            }
        }
    }

    static {
        try {
            d = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer c(JavaType javaType) {
        Class cls = javaType.d;
        if (cls == QName.class) {
            return new Std(cls, 3);
        }
        if (cls == XMLGregorianCalendar.class) {
            return new Std(cls, 2);
        }
        if (cls == Duration.class) {
            return new Std(cls, 1);
        }
        return null;
    }
}
