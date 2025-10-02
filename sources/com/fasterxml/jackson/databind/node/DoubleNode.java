package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class DoubleNode extends NumericNode {
    public final double d;

    public DoubleNode(double d) {
        this.d = d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final boolean C() {
        double d = this.d;
        return d >= -2.147483648E9d && d <= 2.147483647E9d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final int D() {
        return (int) this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final boolean E() {
        double d = this.d;
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final long F() {
        return (long) this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public final JsonParser.NumberType b() {
        return JsonParser.NumberType.h;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof DoubleNode)) {
            if (Double.compare(this.d, ((DoubleNode) obj).d) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.Z(this.d);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        return ((int) (jDoubleToLongBits >> 32)) ^ ((int) jDoubleToLongBits);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        String str = NumberOutput.f14200a;
        return Double.toString(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final BigInteger m() {
        return BigDecimal.valueOf(this.d).toBigInteger();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public final boolean o() {
        double d = this.d;
        return d >= -9.223372036854776E18d && d <= 9.223372036854776E18d;
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
        return Double.valueOf(this.d);
    }
}
