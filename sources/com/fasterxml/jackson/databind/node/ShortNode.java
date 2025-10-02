package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class ShortNode extends NumericNode {
    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final boolean C() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final int D() {
        return 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public final long F() {
        return 0;
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
        if (obj == null || !(obj instanceof ShortNode)) {
            return false;
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.t0((short) 0);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        return NumberOutput.m(0);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final BigInteger m() {
        return BigInteger.valueOf(0);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public final boolean o() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final BigDecimal q() {
        return BigDecimal.valueOf(0);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final double s() {
        return 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final Number z() {
        return (short) 0;
    }
}
