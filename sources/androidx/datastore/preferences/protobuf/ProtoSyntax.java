package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ProtoSyntax {
    public static final ProtoSyntax d;
    public static final ProtoSyntax e;
    public static final ProtoSyntax f;
    public static final /* synthetic */ ProtoSyntax[] g;

    static {
        ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
        d = protoSyntax;
        ProtoSyntax protoSyntax2 = new ProtoSyntax("PROTO3", 1);
        e = protoSyntax2;
        ProtoSyntax protoSyntax3 = new ProtoSyntax("EDITIONS", 2);
        f = protoSyntax3;
        g = new ProtoSyntax[]{protoSyntax, protoSyntax2, protoSyntax3};
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) java.lang.Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) g.clone();
    }
}
