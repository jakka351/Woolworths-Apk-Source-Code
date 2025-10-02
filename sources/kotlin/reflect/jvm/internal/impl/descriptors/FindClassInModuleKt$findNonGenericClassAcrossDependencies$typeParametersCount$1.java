package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes7.dex */
final /* synthetic */ class FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 extends PropertyReference1Impl {
    public static final FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 d = new FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1(ClassId.class, "outerClassId", "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((ClassId) obj).e();
    }
}
