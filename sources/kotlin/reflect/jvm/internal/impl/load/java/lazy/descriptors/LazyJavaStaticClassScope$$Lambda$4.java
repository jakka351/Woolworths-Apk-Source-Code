package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
class LazyJavaStaticClassScope$$Lambda$4 implements Function1 {
    public static final LazyJavaStaticClassScope$$Lambda$4 d = new LazyJavaStaticClassScope$$Lambda$4();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = LazyJavaStaticClassScope.p;
        ClassifierDescriptor classifierDescriptorC = ((KotlinType) obj).J0().c();
        if (classifierDescriptorC instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorC;
        }
        return null;
    }
}
