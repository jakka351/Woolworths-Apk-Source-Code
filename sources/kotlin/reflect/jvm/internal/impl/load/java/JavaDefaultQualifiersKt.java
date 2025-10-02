package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes7.dex */
public final class JavaDefaultQualifiersKt {

    /* renamed from: a, reason: collision with root package name */
    public static final List f24400a;
    public static final List b;
    public static final Object c;
    public static final Object d;
    public static final LinkedHashMap e;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.g;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.e;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.f;
        List listR = CollectionsKt.R(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.i, AnnotationQualifierApplicabilityType.h);
        f24400a = listR;
        List listQ = CollectionsKt.Q(annotationQualifierApplicabilityType3);
        b = listQ;
        FqName fqName = JvmAnnotationNamesKt.f24409a;
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.f;
        List list = listR;
        Map mapJ = MapsKt.j(new Pair(fqName, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier), list, false)), new Pair(JvmAnnotationNamesKt.b, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier), list, false)), new Pair(JvmAnnotationNamesKt.c, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.d), list)));
        c = mapJ;
        List list2 = listQ;
        Map mapJ2 = MapsKt.j(new Pair(JvmAnnotationNamesKt.h, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier), list2)), new Pair(JvmAnnotationNamesKt.i, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.e), list2)));
        d = mapJ2;
        e = MapsKt.m(mapJ, mapJ2);
    }

    public static final LinkedHashMap a() {
        return e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Map b() {
        return c;
    }
}
