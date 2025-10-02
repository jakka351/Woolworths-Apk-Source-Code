package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class FloatNode extends NumericNode {
    public final float d;

    public FloatNode(float f) {
        this.d = f;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final boolean C() {
        float f = this.d;
        return f >= -2.14748365E9f && f <= 2.14748365E9f;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final int D() {
        return (int) this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final boolean E() {
        float f = this.d;
        return Float.isNaN(f) || Float.isInfinite(f);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final long F() {
        return (long) this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public final JsonParser.NumberType b() {
        return JsonParser.NumberType.g;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof FloatNode)) {
            if (Float.compare(this.d, ((FloatNode) obj).d) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.b0(this.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        String str = NumberOutput.f14200a;
        return Float.toString(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final BigInteger m() {
        return q().toBigInteger();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public final boolean o() {
        float f = this.d;
        return f >= -9.223372E18f && f <= 9.223372E18f;
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
        return Float.valueOf(this.d);
    }
}
