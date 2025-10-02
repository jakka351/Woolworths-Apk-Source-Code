package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AnnotationUseSiteTarget {
    public static final AnnotationUseSiteTarget e;
    public static final AnnotationUseSiteTarget f;
    public static final AnnotationUseSiteTarget g;
    public static final AnnotationUseSiteTarget h;
    public static final AnnotationUseSiteTarget i;
    public static final AnnotationUseSiteTarget j;
    public static final AnnotationUseSiteTarget k;
    public static final AnnotationUseSiteTarget l;
    public static final AnnotationUseSiteTarget m;
    public static final /* synthetic */ AnnotationUseSiteTarget[] n;
    public static final /* synthetic */ EnumEntries o;
    public final String d;

    static {
        AnnotationUseSiteTarget annotationUseSiteTarget = new AnnotationUseSiteTarget("ALL", 0, null);
        AnnotationUseSiteTarget annotationUseSiteTarget2 = new AnnotationUseSiteTarget("FIELD", 1, null);
        e = annotationUseSiteTarget2;
        AnnotationUseSiteTarget annotationUseSiteTarget3 = new AnnotationUseSiteTarget("FILE", 2, null);
        f = annotationUseSiteTarget3;
        AnnotationUseSiteTarget annotationUseSiteTarget4 = new AnnotationUseSiteTarget("PROPERTY", 3, null);
        g = annotationUseSiteTarget4;
        AnnotationUseSiteTarget annotationUseSiteTarget5 = new AnnotationUseSiteTarget("PROPERTY_GETTER", 4, "get");
        h = annotationUseSiteTarget5;
        AnnotationUseSiteTarget annotationUseSiteTarget6 = new AnnotationUseSiteTarget("PROPERTY_SETTER", 5, "set");
        i = annotationUseSiteTarget6;
        AnnotationUseSiteTarget annotationUseSiteTarget7 = new AnnotationUseSiteTarget("RECEIVER", 6, null);
        j = annotationUseSiteTarget7;
        AnnotationUseSiteTarget annotationUseSiteTarget8 = new AnnotationUseSiteTarget("CONSTRUCTOR_PARAMETER", 7, "param");
        k = annotationUseSiteTarget8;
        AnnotationUseSiteTarget annotationUseSiteTarget9 = new AnnotationUseSiteTarget("SETTER_PARAMETER", 8, "setparam");
        l = annotationUseSiteTarget9;
        AnnotationUseSiteTarget annotationUseSiteTarget10 = new AnnotationUseSiteTarget("PROPERTY_DELEGATE_FIELD", 9, "delegate");
        m = annotationUseSiteTarget10;
        AnnotationUseSiteTarget[] annotationUseSiteTargetArr = {annotationUseSiteTarget, annotationUseSiteTarget2, annotationUseSiteTarget3, annotationUseSiteTarget4, annotationUseSiteTarget5, annotationUseSiteTarget6, annotationUseSiteTarget7, annotationUseSiteTarget8, annotationUseSiteTarget9, annotationUseSiteTarget10};
        n = annotationUseSiteTargetArr;
        o = EnumEntriesKt.a(annotationUseSiteTargetArr);
    }

    public AnnotationUseSiteTarget(String str, int i2, String str2) {
        this.d = str2 == null ? CapitalizeDecapitalizeKt.c(name()) : str2;
    }

    public static AnnotationUseSiteTarget valueOf(String str) {
        return (AnnotationUseSiteTarget) Enum.valueOf(AnnotationUseSiteTarget.class, str);
    }

    public static AnnotationUseSiteTarget[] values() {
        return (AnnotationUseSiteTarget[]) n.clone();
    }

    public final String a() {
        return this.d;
    }
}
