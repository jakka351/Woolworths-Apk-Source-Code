package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes7.dex */
public final class JvmAnnotationNamesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final FqName f24409a;
    public static final FqName b;
    public static final FqName c;
    public static final FqName d;
    public static final FqName e;
    public static final FqName f;
    public static final FqName g;
    public static final FqName h;
    public static final FqName i;
    public static final Set j;
    public static final Set k;
    public static final Set l;
    public static final Set m;
    public static final Set n;
    public static final Set o;
    public static final Object p;
    public static final FqName q;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f24409a = fqName2;
        FqName fqName3 = new FqName("org.jspecify.nullness.NullnessUnspecified");
        FqName fqName4 = new FqName("org.jspecify.annotations.NonNull");
        FqName fqName5 = new FqName("org.jspecify.annotations.Nullable");
        FqName fqName6 = new FqName("org.jspecify.annotations.NullMarked");
        b = fqName6;
        FqName fqName7 = new FqName("org.jspecify.annotations.NullnessUnspecified");
        FqName fqName8 = new FqName("org.jspecify.annotations.NullUnmarked");
        c = fqName8;
        d = new FqName("javax.annotation.meta.TypeQualifier");
        e = new FqName("javax.annotation.meta.TypeQualifierNickname");
        f = new FqName("javax.annotation.meta.TypeQualifierDefault");
        FqName fqName9 = new FqName("javax.annotation.Nonnull");
        g = fqName9;
        FqName fqName10 = new FqName("javax.annotation.Nullable");
        FqName fqName11 = new FqName("javax.annotation.CheckForNull");
        h = new FqName("javax.annotation.ParametersAreNonnullByDefault");
        i = new FqName("javax.annotation.ParametersAreNullableByDefault");
        j = ArraysKt.r0(new FqName[]{fqName9, fqName11});
        Set setR0 = ArraysKt.r0(new FqName[]{JvmAnnotationNames.h, fqName4, new FqName("android.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.RecentlyNonNull"), new FqName("android.support.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("lombok.NonNull")});
        k = setR0;
        Set setR02 = ArraysKt.r0(new FqName[]{JvmAnnotationNames.i, fqName, fqName5, fqName10, fqName11, new FqName("android.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.RecentlyNullable"), new FqName("android.support.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable")});
        l = setR02;
        m = ArraysKt.r0(new FqName[]{fqName3, fqName7});
        SetsKt.h(SetsKt.h(SetsKt.h(SetsKt.h(SetsKt.g(SetsKt.g(new LinkedHashSet(), setR0), setR02), fqName9), fqName2), fqName6), fqName8);
        n = ArraysKt.r0(new FqName[]{JvmAnnotationNames.k, JvmAnnotationNames.l});
        o = ArraysKt.r0(new FqName[]{JvmAnnotationNames.j, JvmAnnotationNames.m});
        p = MapsKt.j(new Pair(JvmAnnotationNames.c, StandardNames.FqNames.t), new Pair(JvmAnnotationNames.d, StandardNames.FqNames.w), new Pair(JvmAnnotationNames.e, StandardNames.FqNames.m), new Pair(JvmAnnotationNames.f, StandardNames.FqNames.x));
        q = new FqName("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set a() {
        return j;
    }

    public static final Set b() {
        return m;
    }

    public static final FqName c() {
        return g;
    }

    public static final FqName d() {
        return d;
    }

    public static final FqName e() {
        return f;
    }

    public static final FqName f() {
        return e;
    }

    public static final Set g() {
        return k;
    }

    public static final Set h() {
        return l;
    }

    public static final FqName i() {
        return q;
    }
}
