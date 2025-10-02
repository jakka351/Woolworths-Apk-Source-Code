package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public final class JavaTypeEnhancementState {
    public static final JavaTypeEnhancementState d;

    /* renamed from: a, reason: collision with root package name */
    public final Jsr305Settings f24404a;
    public final Function1 b;
    public final boolean c;

    public static final class Companion {
    }

    static {
        FqName fqName = JavaNullabilityAnnotationSettingsKt.f24402a;
        KotlinVersion configuredKotlinVersion = KotlinVersion.h;
        Intrinsics.h(configuredKotlinVersion, "configuredKotlinVersion");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = JavaNullabilityAnnotationSettingsKt.d;
        KotlinVersion kotlinVersion = javaNullabilityAnnotationsStatus.b;
        ReportLevel globalReportLevel = (kotlinVersion == null || kotlinVersion.g - configuredKotlinVersion.g > 0) ? javaNullabilityAnnotationsStatus.f24403a : javaNullabilityAnnotationsStatus.c;
        Intrinsics.h(globalReportLevel, "globalReportLevel");
        Jsr305Settings jsr305Settings = new Jsr305Settings(globalReportLevel, globalReportLevel == ReportLevel.f ? null : globalReportLevel);
        JavaTypeEnhancementState$Companion$DEFAULT$1 javaTypeEnhancementState$Companion$DEFAULT$1 = JavaTypeEnhancementState$Companion$DEFAULT$1.d;
        d = new JavaTypeEnhancementState(jsr305Settings);
    }

    public JavaTypeEnhancementState(Jsr305Settings jsr305Settings) {
        JavaTypeEnhancementState$Companion$DEFAULT$1 javaTypeEnhancementState$Companion$DEFAULT$1 = JavaTypeEnhancementState$Companion$DEFAULT$1.d;
        this.f24404a = jsr305Settings;
        this.b = javaTypeEnhancementState$Companion$DEFAULT$1;
        this.c = jsr305Settings.e || javaTypeEnhancementState$Companion$DEFAULT$1.invoke(JavaNullabilityAnnotationSettingsKt.f24402a) == ReportLevel.e;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f24404a + ", getReportLevelForAnnotation=" + this.b + ')';
    }
}
