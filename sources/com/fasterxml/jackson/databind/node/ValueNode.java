package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public abstract class ValueNode extends BaseJsonNode {
    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base, com.fasterxml.jackson.databind.JsonSerializable
    public void g(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(d(), this));
        h(jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode w(int i) {
        return null;
    }
}
