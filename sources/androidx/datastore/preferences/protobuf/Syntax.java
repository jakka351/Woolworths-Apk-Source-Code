package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* loaded from: classes2.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: androidx.datastore.preferences.protobuf.Syntax$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<Syntax> {
    }

    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return (i != 0 ? i != 1 ? i != 2 ? null : Syntax.SYNTAX_EDITIONS : Syntax.SYNTAX_PROTO3 : Syntax.SYNTAX_PROTO2) != null;
        }
    }

    Syntax(int i2) {
        this.d = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
