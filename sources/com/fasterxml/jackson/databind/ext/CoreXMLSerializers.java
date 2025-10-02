package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* loaded from: classes4.dex */
public class CoreXMLSerializers extends Serializers.Base {

    public static class XMLGregorianCalendarSerializer extends StdSerializer<XMLGregorianCalendar> implements ContextualSerializer {
        public static final XMLGregorianCalendarSerializer g = new XMLGregorianCalendarSerializer(CalendarSerializer.i);
        public final JsonSerializer f;

        public XMLGregorianCalendarSerializer(JsonSerializer jsonSerializer) {
            super(XMLGregorianCalendar.class);
            this.f = jsonSerializer;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
        public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
            JsonSerializer jsonSerializer = this.f;
            JsonSerializer jsonSerializerC = serializerProvider.C(jsonSerializer, beanProperty);
            return jsonSerializerC != jsonSerializer ? new XMLGregorianCalendarSerializer(jsonSerializerC) : this;
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final boolean d(SerializerProvider serializerProvider, Object obj) {
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            return this.f.d(serializerProvider, xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar());
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            this.f.f(xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar(), jsonGenerator, serializerProvider);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            WritableTypeId writableTypeIdD = typeSerializer.d(JsonToken.VALUE_STRING, xMLGregorianCalendar);
            writableTypeIdD.b = XMLGregorianCalendar.class;
            WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, writableTypeIdD);
            this.f.f(xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar(), jsonGenerator, serializerProvider);
            typeSerializer.f(jsonGenerator, writableTypeIdE);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.Base, com.fasterxml.jackson.databind.ser.Serializers
    public final JsonSerializer c(JavaType javaType) {
        Class cls = javaType.d;
        if (Duration.class.isAssignableFrom(cls) || QName.class.isAssignableFrom(cls)) {
            return ToStringSerializer.f;
        }
        if (XMLGregorianCalendar.class.isAssignableFrom(cls)) {
            return XMLGregorianCalendarSerializer.g;
        }
        return null;
    }
}
