package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class IntNode extends NumericNode {
    public static final IntNode[] e = new IntNode[12];
    public final int d;

    static {
        for (int i = 0; i < 12; i++) {
            e[i] = new IntNode(i - 1);
        }
    }

    public IntNode(int i) {
        this.d = i;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final boolean C() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final int D() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final long F() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public final JsonParser.NumberType b() {
        return JsonParser.NumberType.d;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof IntNode) && ((IntNode) obj).d == this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.d0(this.d);
    }

    public final int hashCode() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        return NumberOutput.m(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final BigInteger m() {
        return BigInteger.valueOf(this.d);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public final boolean o() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final BigDecimal q() {
        return BigDecimal.valueOf(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final double s() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final Number z() {
        return Integer.valueOf(this.d);
    }
}
