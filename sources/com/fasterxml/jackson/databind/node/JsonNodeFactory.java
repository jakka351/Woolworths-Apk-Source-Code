package com.fasterxml.jackson.databind.node;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class JsonNodeFactory implements Serializable, JsonNodeCreator {
    public static final JsonNodeFactory d = new JsonNodeFactory();

    public static TextNode b(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? TextNode.e : new TextNode(str);
    }

    public final ValueNode a(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return NullNode.d;
        }
        if (bigDecimal.signum() == 0) {
            return DecimalNode.e;
        }
        try {
            bigDecimal = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
        } catch (ArithmeticException unused) {
        }
        return new DecimalNode(bigDecimal);
    }
}
