package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes7.dex */
public class AnnotationDescriptorImpl implements AnnotationDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final KotlinType f24348a;
    public final Map b;
    public final SourceElement c;

    public AnnotationDescriptorImpl(SimpleType simpleType, Map map, SourceElement sourceElement) {
        if (simpleType == null) {
            c(0);
            throw null;
        }
        if (map == null) {
            c(1);
            throw null;
        }
        this.f24348a = simpleType;
        this.b = map;
        this.c = sourceElement;
    }

    public static /* synthetic */ void c(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map b() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
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
        SourceElement sourceElement = this.c;
        if (sourceElement != null) {
            return sourceElement;
        }
        c(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final KotlinType getType() {
        KotlinType kotlinType = this.f24348a;
        if (kotlinType != null) {
            return kotlinType;
        }
        c(3);
        throw null;
    }

    public final String toString() {
        return DescriptorRenderer.f24521a.q(this, null);
    }
}
