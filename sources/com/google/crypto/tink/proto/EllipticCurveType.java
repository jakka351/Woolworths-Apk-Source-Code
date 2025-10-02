package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum EllipticCurveType implements Internal.EnumLite {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.crypto.tink.proto.EllipticCurveType$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<EllipticCurveType> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            return EllipticCurveType.a(i);
        }
    }

    public static final class EllipticCurveTypeVerifier implements Internal.EnumVerifier {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return EllipticCurveType.a(i) != null;
        }
    }

    EllipticCurveType(int i) {
        this.d = i;
    }

    public static EllipticCurveType a(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i == 4) {
            return NIST_P521;
        }
        if (i != 5) {
            return null;
        }
        return CURVE25519;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
