package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes.dex */
public enum OutputPrefixType implements Internal.EnumLite {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.crypto.tink.proto.OutputPrefixType$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<OutputPrefixType> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            return OutputPrefixType.a(i);
        }
    }

    /* loaded from: classes6.dex */
    public static final class OutputPrefixTypeVerifier implements Internal.EnumVerifier {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return OutputPrefixType.a(i) != null;
        }
    }

    OutputPrefixType(int i) {
        this.d = i;
    }

    public static OutputPrefixType a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
