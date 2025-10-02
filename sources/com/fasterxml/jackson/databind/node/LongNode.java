package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class LongNode extends NumericNode {
    public final long d;

    public LongNode(long j) {
        this.d = j;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final boolean C() {
        long j = this.d;
        return j >= -2147483648L && j <= 2147483647L;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final int D() {
        return (int) this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final long F() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public final JsonParser.NumberType b() {
        return JsonParser.NumberType.e;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof LongNode) && ((LongNode) obj).d == this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.i0(this.d);
    }

    public final int hashCode() {
        long j = this.d;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        String str = NumberOutput.f14200a;
        long j = this.d;
        return (j > 2147483647L || j < -2147483648L) ? Long.toString(j) : NumberOutput.m((int) j);
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
        return Long.valueOf(this.d);
    }
}
