package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class DecimalNode extends NumericNode {
    public static final DecimalNode e = new DecimalNode(BigDecimal.ZERO);
    public static final BigDecimal f = BigDecimal.valueOf(-2147483648L);
    public static final BigDecimal g = BigDecimal.valueOf(2147483647L);
    public static final BigDecimal h = BigDecimal.valueOf(Long.MIN_VALUE);
    public static final BigDecimal i = BigDecimal.valueOf(Long.MAX_VALUE);
    public final BigDecimal d;

    public DecimalNode(BigDecimal bigDecimal) {
        this.d = bigDecimal;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final boolean C() {
        BigDecimal bigDecimal = f;
        BigDecimal bigDecimal2 = this.d;
        return bigDecimal2.compareTo(bigDecimal) >= 0 && bigDecimal2.compareTo(g) <= 0;
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
        return JsonParser.NumberType.i;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof DecimalNode) && ((DecimalNode) obj).d.compareTo(this.d) == 0;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.m0(this.d);
    }

    public final int hashCode() {
        return Double.valueOf(this.d.doubleValue()).hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        return this.d.toString();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final BigInteger m() {
        return this.d.toBigInteger();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public final boolean o() {
        BigDecimal bigDecimal = h;
        BigDecimal bigDecimal2 = this.d;
        return bigDecimal2.compareTo(bigDecimal) >= 0 && bigDecimal2.compareTo(i) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final BigDecimal q() {
        return this.d;
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
