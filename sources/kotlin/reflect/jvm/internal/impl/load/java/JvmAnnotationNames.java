package kotlin.reflect.jvm.internal.impl.load.java;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* loaded from: classes.dex */
public final class JvmAnnotationNames {

    /* renamed from: a, reason: collision with root package name */
    public static final FqName f24408a;
    public static final Name b;
    public static final FqName c;
    public static final FqName d;
    public static final FqName e;
    public static final FqName f;
    public static final FqName g;
    public static final FqName h;
    public static final FqName i;
    public static final FqName j;
    public static final FqName k;
    public static final FqName l;
    public static final FqName m;
    public static final FqName n;
    public static final FqName o;
    public static final FqName p;
    public static final FqName q;

    static {
        FqName fqName = new FqName("kotlin.Metadata");
        f24408a = fqName;
        JvmClassName.b(fqName).d();
        b = Name.e("value");
        c = new FqName(Target.class.getName());
        new FqName(ElementType.class.getName());
        d = new FqName(Retention.class.getName());
        new FqName(RetentionPolicy.class.getName());
        e = new FqName(Deprecated.class.getName());
        f = new FqName(Documented.class.getName());
        g = new FqName("java.lang.annotation.Repeatable");
        new FqName(Override.class.getName());
        h = new FqName("org.jetbrains.annotations.NotNull");
        i = new FqName("org.jetbrains.annotations.Nullable");
        j = new FqName("org.jetbrains.annotations.Mutable");
        k = new FqName("org.jetbrains.annotations.ReadOnly");
        l = new FqName("kotlin.annotations.jvm.ReadOnly");
        m = new FqName("kotlin.annotations.jvm.Mutable");
        n = new FqName("kotlin.jvm.PurelyImplements");
        new FqName("kotlin.jvm.internal");
        FqName fqName2 = new FqName("kotlin.jvm.internal.SerializedIr");
        o = fqName2;
        JvmClassName.b(fqName2).d();
        p = new FqName("kotlin.jvm.internal.EnhancedNullability");
        q = new FqName("kotlin.jvm.internal.EnhancedMutability");
    }
}
