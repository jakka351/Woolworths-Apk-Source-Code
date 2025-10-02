package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public class AsDeductionTypeSerializer extends TypeSerializerBase {
    public static final AsDeductionTypeSerializer c = new AsDeductionTypeSerializer(null, null);

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final TypeSerializer a(BeanProperty beanProperty) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final JsonTypeInfo.As c() {
        return JsonTypeInfo.As.h;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final WritableTypeId e(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws JsonGenerationException {
        if (!writableTypeId.f.h || jsonGenerator.e()) {
            return null;
        }
        jsonGenerator.P1(writableTypeId);
        return writableTypeId;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final WritableTypeId f(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
        if (writableTypeId == null) {
            return null;
        }
        jsonGenerator.R1(writableTypeId);
        return writableTypeId;
    }
}
