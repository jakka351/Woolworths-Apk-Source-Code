package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes6.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.protobuf.NullValue$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<NullValue> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            if (i != 0) {
                return null;
            }
            return NullValue.NULL_VALUE;
        }
    }

    public static final class NullValueVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return (i != 0 ? null : NullValue.NULL_VALUE) != null;
        }
    }

    NullValue(int i) {
        this.d = i;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
