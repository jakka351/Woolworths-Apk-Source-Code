package com.google.api;

import com.google.protobuf.Internal;

/* loaded from: classes6.dex */
public enum ChangeType implements Internal.EnumLite {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.api.ChangeType$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<ChangeType> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            if (i == 0) {
                return ChangeType.CHANGE_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return ChangeType.ADDED;
            }
            if (i == 2) {
                return ChangeType.REMOVED;
            }
            if (i != 3) {
                return null;
            }
            return ChangeType.MODIFIED;
        }
    }

    public static final class ChangeTypeVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : ChangeType.MODIFIED : ChangeType.REMOVED : ChangeType.ADDED : ChangeType.CHANGE_TYPE_UNSPECIFIED) != null;
        }
    }

    ChangeType(int i) {
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
