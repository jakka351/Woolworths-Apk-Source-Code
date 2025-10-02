package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes.dex */
public enum KeyStatusType implements Internal.EnumLite {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.crypto.tink.proto.KeyStatusType$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<KeyStatusType> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            return KeyStatusType.a(i);
        }
    }

    /* loaded from: classes6.dex */
    public static final class KeyStatusTypeVerifier implements Internal.EnumVerifier {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return KeyStatusType.a(i) != null;
        }
    }

    KeyStatusType(int i) {
        this.d = i;
    }

    public static KeyStatusType a(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
