package com.google.api;

import com.google.protobuf.Internal;

/* loaded from: classes6.dex */
public enum FieldBehavior implements Internal.EnumLite {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNRECOGNIZED(-1);

    public static final Internal.EnumLiteMap l = new AnonymousClass1();
    public final int d;

    /* renamed from: com.google.api.FieldBehavior$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<FieldBehavior> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            return FieldBehavior.a(i);
        }
    }

    public static final class FieldBehaviorVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return FieldBehavior.a(i) != null;
        }
    }

    FieldBehavior(int i) {
        this.d = i;
    }

    public static FieldBehavior a(int i) {
        if (i == 0) {
            return FIELD_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return OPTIONAL;
        }
        if (i == 2) {
            return REQUIRED;
        }
        if (i == 3) {
            return OUTPUT_ONLY;
        }
        if (i == 4) {
            return INPUT_ONLY;
        }
        if (i != 5) {
            return null;
        }
        return IMMUTABLE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
