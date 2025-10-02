package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum EcdsaSignatureEncoding implements Internal.EnumLite {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.crypto.tink.proto.EcdsaSignatureEncoding$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<EcdsaSignatureEncoding> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            return EcdsaSignatureEncoding.a(i);
        }
    }

    public static final class EcdsaSignatureEncodingVerifier implements Internal.EnumVerifier {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return EcdsaSignatureEncoding.a(i) != null;
        }
    }

    EcdsaSignatureEncoding(int i2) {
        this.d = i2;
    }

    public static EcdsaSignatureEncoding a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i2 == 1) {
            return IEEE_P1363;
        }
        if (i2 != 2) {
            return null;
        }
        return DER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
