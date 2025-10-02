package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class BigIntegerNode extends NumericNode {
    public static final BigInteger e = BigInteger.valueOf(-2147483648L);
    public static final BigInteger f = BigInteger.valueOf(2147483647L);
    public static final BigInteger g = BigInteger.valueOf(Long.MIN_VALUE);
    public static final BigInteger h = BigInteger.valueOf(Long.MAX_VALUE);
    public final BigInteger d;

    public BigIntegerNode(BigInteger bigInteger) {
        this.d = bigInteger;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final boolean C() {
        BigInteger bigInteger = e;
        BigInteger bigInteger2 = this.d;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(f) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final int D() {
        return this.d.intValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final long F() {
        return this.d.longValue();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public final JsonParser.NumberType b() {
        return JsonParser.NumberType.f;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BigIntegerNode)) {
            return ((BigIntegerNode) obj).d.equals(this.d);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.r0(this.d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        return this.d.toString();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final BigInteger m() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public final boolean o() {
        BigInteger bigInteger = g;
        BigInteger bigInteger2 = this.d;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(h) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final BigDecimal q() {
        return new BigDecimal(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final double s() {
        return this.d.doubleValue();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final Number z() {
        return this.d;
    }
}
