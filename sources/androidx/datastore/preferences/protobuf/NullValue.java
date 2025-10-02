package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* loaded from: classes2.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: androidx.datastore.preferences.protobuf.NullValue$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<NullValue> {
    }

    public static final class NullValueVerifier implements Internal.EnumVerifier {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return (i != 0 ? null : NullValue.NULL_VALUE) != null;
        }
    }

    NullValue(int i) {
        this.d = i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
