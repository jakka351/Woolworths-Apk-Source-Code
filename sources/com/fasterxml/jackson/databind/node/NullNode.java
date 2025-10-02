package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

/* loaded from: classes4.dex */
public class NullNode extends ValueNode {
    public static final NullNode d = new NullNode();

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.VALUE_NULL;
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof NullNode);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serializerProvider.o(jsonGenerator);
    }

    public final int hashCode() {
        return 4;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        return "null";
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String l() {
        return null;
    }

    public Object readResolve() {
        return d;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType x() {
        return JsonNodeType.h;
    }
}
