package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.UUID;

/* loaded from: classes4.dex */
public class UUIDSerializer extends StdScalarSerializer<UUID> implements ContextualSerializer {
    public static final char[] g = "0123456789abcdef".toCharArray();
    public final Boolean f;

    public UUIDSerializer(Boolean bool) {
        super(UUID.class);
        this.f = bool;
    }

    public static final void o(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void p(char[] cArr, int i, int i2) {
        char[] cArr2 = g;
        cArr[i2] = cArr2[(i >> 12) & 15];
        cArr[i2 + 1] = cArr2[(i >> 8) & 15];
        cArr[i2 + 2] = cArr2[(i >> 4) & 15];
        cArr[i2 + 3] = cArr2[i & 15];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonSerializer b(com.fasterxml.jackson.databind.SerializerProvider r2, com.fasterxml.jackson.databind.BeanProperty r3) {
        /*
            r1 = this;
            java.lang.Class r0 = r1.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = com.fasterxml.jackson.databind.ser.std.StdSerializer.k(r2, r3, r0)
            if (r2 == 0) goto L18
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.e
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.m
            if (r2 != r3) goto L11
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L19
        L11:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.l
            if (r2 != r3) goto L18
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L19
        L18:
            r2 = 0
        L19:
            java.lang.Boolean r3 = r1.f
            boolean r3 = java.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L27
            com.fasterxml.jackson.databind.ser.std.UUIDSerializer r3 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer
            r3.<init>(r2)
            return r3
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.UUIDSerializer.b(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        UUID uuid = (UUID) obj;
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        UUID uuid = (UUID) obj;
        Boolean bool = this.f;
        if (bool != null ? bool.booleanValue() : !(jsonGenerator instanceof TokenBuffer) && jsonGenerator.c()) {
            byte[] bArr = new byte[16];
            long mostSignificantBits = uuid.getMostSignificantBits();
            long leastSignificantBits = uuid.getLeastSignificantBits();
            o((int) (mostSignificantBits >> 32), 0, bArr);
            o((int) mostSignificantBits, 4, bArr);
            o((int) (leastSignificantBits >> 32), 8, bArr);
            o((int) leastSignificantBits, 12, bArr);
            jsonGenerator.getClass();
            jsonGenerator.x(Base64Variants.b, bArr, 0, 16);
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        int i = (int) (mostSignificantBits2 >> 32);
        p(cArr, i >> 16, 0);
        p(cArr, i, 4);
        cArr[8] = '-';
        int i2 = (int) mostSignificantBits2;
        p(cArr, i2 >>> 16, 9);
        cArr[13] = '-';
        p(cArr, i2, 14);
        cArr[18] = '-';
        long leastSignificantBits2 = uuid.getLeastSignificantBits();
        p(cArr, (int) (leastSignificantBits2 >>> 48), 19);
        cArr[23] = '-';
        p(cArr, (int) (leastSignificantBits2 >>> 32), 24);
        int i3 = (int) leastSignificantBits2;
        p(cArr, i3 >> 16, 28);
        p(cArr, i3, 32);
        jsonGenerator.K1(cArr, 0, 36);
    }
}
