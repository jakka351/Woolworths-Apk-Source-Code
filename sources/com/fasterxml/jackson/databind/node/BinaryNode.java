package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class BinaryNode extends ValueNode {
    public static final BinaryNode e = new BinaryNode(new byte[0]);
    public final byte[] d;

    public BinaryNode(byte[] bArr) {
        this.d = bArr;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BinaryNode)) {
            return Arrays.equals(((BinaryNode) obj).d, this.d);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Base64Variant base64Variant = serializerProvider.d.e.j;
        byte[] bArr = this.d;
        jsonGenerator.x(base64Variant, bArr, 0, bArr.length);
    }

    public final int hashCode() {
        byte[] bArr = this.d;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        return Base64Variants.b.e(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final byte[] n() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType x() {
        return JsonNodeType.e;
    }
}
