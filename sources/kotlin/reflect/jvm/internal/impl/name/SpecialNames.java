package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class SpecialNames {

    /* renamed from: a, reason: collision with root package name */
    public static final Name f24503a = Name.l("<no name provided>");
    public static final Name b;
    public static final Name c;
    public static final Name d;
    public static final Name e;
    public static final Name f;
    public static final Name g;

    static {
        Name.l("<root package>");
        b = Name.e("Companion");
        c = Name.e("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        Name.l("<anonymous>");
        FqName fqName = FqName.c;
        FqName.Companion.a(Name.l("<anonymous>"));
        Name.l("<unary>");
        d = Name.l("<this>");
        e = Name.l("<init>");
        Name.l("<iterator>");
        Name.l("<destruct>");
        f = Name.l("<local>");
        Name.l("<unused var>");
        g = Name.l("<set-?>");
        Name.l("<array>");
        Name.l("<receiver>");
        Name.l("<get-entries>");
    }
}
