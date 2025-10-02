package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes4.dex */
public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    public static final int[] h;

    static {
        int[] iArr = new int[127];
        h = iArr;
        Arrays.fill(iArr, -1);
        for (int i = 0; i < 10; i++) {
            h[i + 48] = i;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            int[] iArr2 = h;
            int i3 = i2 + 10;
            iArr2[i2 + 97] = i3;
            iArr2[i2 + 65] = i3;
        }
    }

    public static int v0(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return new UUID(0L, 0L);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public final Object o0(DeserializationContext deserializationContext, String str) throws InvalidFormatException {
        int length = str.length();
        Class cls = this.d;
        if (length != 36) {
            if (str.length() != 24) {
                deserializationContext.J(cls, str, "UUID has to be represented by standard 36-char representation", new Object[0]);
                throw null;
            }
            Base64Variant base64Variant = Base64Variants.b;
            base64Variant.getClass();
            ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(null);
            base64Variant.b(str, byteArrayBuilder);
            return u0(byteArrayBuilder.e(), deserializationContext);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            deserializationContext.J(cls, str, "UUID has to be represented by standard 36-char representation", new Object[0]);
            throw null;
        }
        return new UUID((x0(str, 0, deserializationContext) << 32) + ((y0(str, 9, deserializationContext) << 16) | y0(str, 14, deserializationContext)), ((x0(str, 28, deserializationContext) << 32) >>> 32) | (((y0(str, 19, deserializationContext) << 16) | y0(str, 24, deserializationContext)) << 32));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public final Object p0(DeserializationContext deserializationContext, Object obj) throws MismatchedInputException {
        if (obj instanceof byte[]) {
            return u0((byte[]) obj, deserializationContext);
        }
        super.p0(deserializationContext, obj);
        throw null;
    }

    public final UUID u0(byte[] bArr, DeserializationContext deserializationContext) throws InvalidFormatException {
        if (bArr.length == 16) {
            return new UUID((v0(0, bArr) << 32) | ((v0(4, bArr) << 32) >>> 32), (v0(8, bArr) << 32) | ((v0(12, bArr) << 32) >>> 32));
        }
        throw new InvalidFormatException(deserializationContext.i, YU.a.m(new StringBuilder("Can only construct UUIDs from byte[16]; got "), bArr.length, " bytes"), bArr);
    }

    public final int w0(String str, int i, DeserializationContext deserializationContext) throws InvalidFormatException {
        int i2;
        char cCharAt = str.charAt(i);
        char cCharAt2 = str.charAt(i + 1);
        int[] iArr = h;
        if (cCharAt <= 127 && cCharAt2 <= 127 && (i2 = (iArr[cCharAt] << 4) | iArr[cCharAt2]) >= 0) {
            return i2;
        }
        Class cls = this.d;
        if (cCharAt > 127 || iArr[cCharAt] < 0) {
            throw deserializationContext.b0(cls, str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(cCharAt), Integer.toHexString(cCharAt)));
        }
        throw deserializationContext.b0(cls, str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(cCharAt2), Integer.toHexString(cCharAt2)));
    }

    public final int x0(String str, int i, DeserializationContext deserializationContext) {
        return w0(str, i + 6, deserializationContext) + (w0(str, i, deserializationContext) << 24) + (w0(str, i + 2, deserializationContext) << 16) + (w0(str, i + 4, deserializationContext) << 8);
    }

    public final int y0(String str, int i, DeserializationContext deserializationContext) {
        return w0(str, i + 2, deserializationContext) + (w0(str, i, deserializationContext) << 8);
    }
}
