package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

/* loaded from: classes4.dex */
public class BooleanNode extends ValueNode {
    public static final BooleanNode e = new BooleanNode(true);
    public static final BooleanNode f = new BooleanNode(false);
    public final boolean d;

    public BooleanNode(boolean z) {
        this.d = z;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return this.d ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BooleanNode)) {
            return this.d == ((BooleanNode) obj).d;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.A(this.d);
    }

    public final int hashCode() {
        return this.d ? 3 : 1;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final long j() {
        return this.d ? 1L : 0L;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        return this.d ? "true" : "false";
    }

    public Object readResolve() {
        return this.d ? e : f;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType x() {
        return JsonNodeType.f;
    }
}
