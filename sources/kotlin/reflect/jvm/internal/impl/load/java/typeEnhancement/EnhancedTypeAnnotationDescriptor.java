package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes7.dex */
final class EnhancedTypeAnnotationDescriptor implements AnnotationDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnhancedTypeAnnotationDescriptor f24443a = new EnhancedTypeAnnotationDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final FqName d() {
        ClassDescriptor classDescriptorD = DescriptorUtilsKt.d(this);
        if (classDescriptorD != null) {
            if (ErrorUtils.f(classDescriptorD)) {
                classDescriptorD = null;
            }
            if (classDescriptorD != null) {
                return DescriptorUtilsKt.c(classDescriptorD);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final SourceElement g() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final KotlinType getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
