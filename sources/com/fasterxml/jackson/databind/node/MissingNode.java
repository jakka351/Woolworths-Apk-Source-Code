package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public final class MissingNode extends ValueNode {
    public static final MissingNode d = new MissingNode();

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.NOT_AVAILABLE;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.JsonSerializable.Base, com.fasterxml.jackson.databind.JsonSerializable
    public final void g(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.Y();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.Y();
    }

    public final int hashCode() {
        return 3;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String l() {
        return null;
    }

    public Object readResolve() {
        return d;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public final String toString() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType x() {
        return JsonNodeType.g;
    }
}
