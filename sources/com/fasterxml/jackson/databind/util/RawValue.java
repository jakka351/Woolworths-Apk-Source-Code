package com.fasterxml.jackson.databind.util;

import YU.a;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public class RawValue implements JsonSerializable {
    public String d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawValue)) {
            return false;
        }
        String str = this.d;
        String str2 = ((RawValue) obj).d;
        if (str == str2) {
            return true;
        }
        return str != null && str.equals(str2);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public final void g(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        CharSequence charSequence = this.d;
        if (charSequence instanceof JsonSerializable) {
            ((JsonSerializable) charSequence).g(jsonGenerator, serializerProvider, typeSerializer);
        } else if (charSequence instanceof SerializableString) {
            h(jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        CharSequence charSequence = this.d;
        if (charSequence instanceof JsonSerializable) {
            ((JsonSerializable) charSequence).h(jsonGenerator, serializerProvider);
        } else if (charSequence instanceof SerializableString) {
            jsonGenerator.T0((SerializableString) charSequence);
        } else {
            jsonGenerator.V0(String.valueOf(charSequence));
        }
    }

    public final int hashCode() {
        String str = this.d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.h("[RawValue of type ", ClassUtil.f(this.d), "]");
    }
}
