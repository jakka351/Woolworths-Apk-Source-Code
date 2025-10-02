package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes7.dex */
class SignatureEnhancement$$Lambda$4 implements Function1 {
    public static final SignatureEnhancement$$Lambda$4 d = new SignatureEnhancement$$Lambda$4();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassifierDescriptor classifierDescriptorC = ((UnwrappedType) obj).J0().c();
        if (classifierDescriptorC == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorC.getName();
        FqName fqName = JavaToKotlinClassMap.f;
        return Boolean.valueOf(Intrinsics.c(name, fqName.f24500a.f()) && Intrinsics.c(DescriptorUtilsKt.c(classifierDescriptorC), fqName));
    }
}
