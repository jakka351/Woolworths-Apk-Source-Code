package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ProtoSyntax {
    public static final ProtoSyntax d;
    public static final ProtoSyntax e;
    public static final /* synthetic */ ProtoSyntax[] f;

    static {
        ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
        d = protoSyntax;
        ProtoSyntax protoSyntax2 = new ProtoSyntax("PROTO3", 1);
        e = protoSyntax2;
        f = new ProtoSyntax[]{protoSyntax, protoSyntax2};
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) f.clone();
    }
}
