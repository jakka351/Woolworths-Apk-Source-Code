package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;

/* loaded from: classes4.dex */
public class POJONode extends ValueNode {
    public final Object d;

    public POJONode(Object obj) {
        this.d = obj;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof POJONode)) {
            return false;
        }
        Object obj2 = ((POJONode) obj).d;
        Object obj3 = this.d;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object obj = this.d;
        if (obj instanceof JsonSerializable) {
            ((JsonSerializable) obj).h(jsonGenerator, serializerProvider);
        } else {
            serializerProvider.getClass();
            serializerProvider.w(obj.getClass()).f(obj, jsonGenerator, serializerProvider);
        }
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final long j() {
        Object obj = this.d;
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        Object obj = this.d;
        return obj == null ? "null" : obj.toString();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String l() {
        return this.d.toString();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final byte[] n() {
        Object obj = this.d;
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType x() {
        return JsonNodeType.k;
    }
}
