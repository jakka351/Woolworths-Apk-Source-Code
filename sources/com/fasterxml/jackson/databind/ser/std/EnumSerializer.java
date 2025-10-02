package com.fasterxml.jackson.databind.ser.std;

import YU.a;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements ContextualSerializer {
    public final EnumValues f;
    public final Boolean g;

    public EnumSerializer(EnumValues enumValues, Boolean bool) {
        super(enumValues.d);
        this.f = enumValues;
        this.g = bool;
    }

    public static Boolean o(Class cls, JsonFormat.Value value, boolean z, Boolean bool) {
        JsonFormat.Shape shape = value.e;
        if (shape == null || shape == JsonFormat.Shape.d || shape == JsonFormat.Shape.f) {
            return bool;
        }
        if (shape == JsonFormat.Shape.l || shape == JsonFormat.Shape.e) {
            return Boolean.FALSE;
        }
        if (shape.a() || shape == JsonFormat.Shape.g) {
            return Boolean.TRUE;
        }
        String name = cls.getName();
        String str = z ? "class" : "property";
        StringBuilder sb = new StringBuilder("Unsupported serialization shape (");
        sb.append(shape);
        sb.append(") for Enum ");
        sb.append(name);
        sb.append(", not supported as ");
        throw new IllegalArgumentException(a.o(sb, str, " annotation"));
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Class cls = this.d;
        JsonFormat.Value valueK = StdSerializer.k(serializerProvider, beanProperty, cls);
        if (valueK != null) {
            Boolean bool = this.g;
            Boolean boolO = o(cls, valueK, false, bool);
            if (!Objects.equals(boolO, bool)) {
                return new EnumSerializer(this.f, boolO);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        boolean zR;
        Enum r3 = (Enum) obj;
        Boolean bool = this.g;
        if (bool != null) {
            zR = bool.booleanValue();
        } else {
            zR = serializerProvider.d.r(SerializationFeature.WRITE_ENUMS_USING_INDEX);
        }
        if (zR) {
            jsonGenerator.d0(r3.ordinal());
            return;
        }
        if (serializerProvider.d.r(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.J1(r3.toString());
        } else {
            jsonGenerator.C1(this.f.e[r3.ordinal()]);
        }
    }
}
