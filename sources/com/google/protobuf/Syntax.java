package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes6.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.protobuf.Syntax$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<Syntax> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            if (i == 0) {
                return Syntax.SYNTAX_PROTO2;
            }
            if (i == 1) {
                return Syntax.SYNTAX_PROTO3;
            }
            if (i != 2) {
                return null;
            }
            return Syntax.SYNTAX_EDITIONS;
        }
    }

    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return (i != 0 ? i != 1 ? i != 2 ? null : Syntax.SYNTAX_EDITIONS : Syntax.SYNTAX_PROTO3 : Syntax.SYNTAX_PROTO2) != null;
        }
    }

    Syntax(int i2) {
        this.d = i2;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
