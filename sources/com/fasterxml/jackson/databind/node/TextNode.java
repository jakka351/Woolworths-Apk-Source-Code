package com.fasterxml.jackson.databind.node;

import YU.a;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

/* loaded from: classes4.dex */
public class TextNode extends ValueNode {
    public static final TextNode e = new TextNode("");
    public final String d;

    public TextNode(String str) {
        this.d = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String B() {
        return this.d;
    }

    public final byte[] C(Base64Variant base64Variant) throws InvalidFormatException {
        String strTrim = this.d.trim();
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder((BufferRecycler) null, Math.max(16, Math.min(65536, ((strTrim.length() >> 2) * 3) + 4)));
        try {
            base64Variant.b(strTrim, byteArrayBuilder);
            return byteArrayBuilder.e();
        } catch (IllegalArgumentException e2) {
            throw new InvalidFormatException(null, a.A("Cannot access contents of TextNode as binary due to broken Base64 encoding: ", e2.getMessage()), strTrim);
        }
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.VALUE_STRING;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj).d.equals(this.d);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        String str = this.d;
        if (str == null) {
            jsonGenerator.Y();
        } else {
            jsonGenerator.J1(str);
        }
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final long j() {
        return NumberInput.a(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String l() {
        String str = this.d;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final byte[] n() {
        return C(Base64Variants.b);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType x() {
        return JsonNodeType.l;
    }
}
