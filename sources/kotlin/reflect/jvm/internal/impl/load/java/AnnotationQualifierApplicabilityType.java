package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AnnotationQualifierApplicabilityType {
    public static final AnnotationQualifierApplicabilityType e;
    public static final AnnotationQualifierApplicabilityType f;
    public static final AnnotationQualifierApplicabilityType g;
    public static final AnnotationQualifierApplicabilityType h;
    public static final AnnotationQualifierApplicabilityType i;
    public static final /* synthetic */ AnnotationQualifierApplicabilityType[] j;
    public static final /* synthetic */ EnumEntries k;
    public final String d;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = new AnnotationQualifierApplicabilityType("METHOD_RETURN_TYPE", 0, "METHOD");
        e = annotationQualifierApplicabilityType;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = new AnnotationQualifierApplicabilityType("VALUE_PARAMETER", 1, "PARAMETER");
        f = annotationQualifierApplicabilityType2;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = new AnnotationQualifierApplicabilityType("FIELD", 2, "FIELD");
        g = annotationQualifierApplicabilityType3;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType4 = new AnnotationQualifierApplicabilityType("TYPE_USE", 3, "TYPE_USE");
        h = annotationQualifierApplicabilityType4;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType5 = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        i = annotationQualifierApplicabilityType5;
        AnnotationQualifierApplicabilityType[] annotationQualifierApplicabilityTypeArr = {annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, annotationQualifierApplicabilityType4, annotationQualifierApplicabilityType5, new AnnotationQualifierApplicabilityType("TYPE_PARAMETER", 5, "TYPE_PARAMETER")};
        j = annotationQualifierApplicabilityTypeArr;
        k = EnumEntriesKt.a(annotationQualifierApplicabilityTypeArr);
    }

    public AnnotationQualifierApplicabilityType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static AnnotationQualifierApplicabilityType valueOf(String str) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, str);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) j.clone();
    }
}
