package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public /* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends FunctionReferenceImpl implements Function1<FqName, ReportLevel> {
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 d = new JavaTypeEnhancementState$Companion$DEFAULT$1(1, JavaNullabilityAnnotationSettingsKt.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FqName p0 = (FqName) obj;
        Intrinsics.h(p0, "p0");
        FqName fqName = JavaNullabilityAnnotationSettingsKt.f24402a;
        NullabilityAnnotationStates.f24410a.getClass();
        NullabilityAnnotationStatesImpl configuredReportLevels = NullabilityAnnotationStates.Companion.b;
        KotlinVersion kotlinVersion = new KotlinVersion(1, 7, 20);
        Intrinsics.h(configuredReportLevels, "configuredReportLevels");
        ReportLevel reportLevel = (ReportLevel) configuredReportLevels.c.invoke(p0);
        if (reportLevel != null) {
            return reportLevel;
        }
        NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl = JavaNullabilityAnnotationSettingsKt.c;
        nullabilityAnnotationStatesImpl.getClass();
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) nullabilityAnnotationStatesImpl.c.invoke(p0);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.e;
        }
        KotlinVersion kotlinVersion2 = javaNullabilityAnnotationsStatus.b;
        return (kotlinVersion2 == null || kotlinVersion2.g - kotlinVersion.g > 0) ? javaNullabilityAnnotationsStatus.f24403a : javaNullabilityAnnotationsStatus.c;
    }
}
