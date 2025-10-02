package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum EcPointFormat implements Internal.EnumLite {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.crypto.tink.proto.EcPointFormat$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<EcPointFormat> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            return EcPointFormat.a(i);
        }
    }

    public static final class EcPointFormatVerifier implements Internal.EnumVerifier {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return EcPointFormat.a(i) != null;
        }
    }

    EcPointFormat(int i) {
        this.d = i;
    }

    public static EcPointFormat a(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i == 2) {
            return COMPRESSED;
        }
        if (i != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
