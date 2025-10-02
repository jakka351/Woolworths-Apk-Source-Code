package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    public int f24603a;

    public abstract boolean e(ClassifierDescriptor classifierDescriptor);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TypeConstructor) && obj.hashCode() == hashCode()) {
            TypeConstructor typeConstructor = (TypeConstructor) obj;
            if (typeConstructor.getParameters().size() == getParameters().size()) {
                ClassifierDescriptor classifierDescriptorC = c();
                ClassifierDescriptor classifierDescriptorC2 = typeConstructor.c();
                if (classifierDescriptorC2 == null || ErrorUtils.f(classifierDescriptorC) || DescriptorUtils.o(classifierDescriptorC) || ErrorUtils.f(classifierDescriptorC2) || DescriptorUtils.o(classifierDescriptorC2)) {
                    return false;
                }
                return e(classifierDescriptorC2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f24603a;
        if (i != 0) {
            return i;
        }
        ClassifierDescriptor classifierDescriptorC = c();
        int iIdentityHashCode = (ErrorUtils.f(classifierDescriptorC) || DescriptorUtils.o(classifierDescriptorC)) ? System.identityHashCode(this) : DescriptorUtils.g(classifierDescriptorC).f24501a.hashCode();
        this.f24603a = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
