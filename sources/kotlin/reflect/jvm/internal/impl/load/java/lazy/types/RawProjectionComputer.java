package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public final class RawProjectionComputer extends ErasureProjectionComputer {

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JavaTypeFlexibility javaTypeFlexibility = JavaTypeFlexibility.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                JavaTypeFlexibility javaTypeFlexibility2 = JavaTypeFlexibility.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer
    public final TypeProjection a(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType kotlinType) {
        Intrinsics.h(typeAttr, "typeAttr");
        Intrinsics.h(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        if (!(typeAttr instanceof JavaTypeAttributes)) {
            return super.a(typeParameterDescriptor, typeAttr, typeParameterUpperBoundEraser, kotlinType);
        }
        JavaTypeAttributes javaTypeAttributesJ = (JavaTypeAttributes) typeAttr;
        if (!javaTypeAttributesJ.h()) {
            javaTypeAttributesJ = javaTypeAttributesJ.j(JavaTypeFlexibility.d);
        }
        int iOrdinal = javaTypeAttributesJ.f().ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new TypeProjectionImpl(kotlinType, Variance.f);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!typeParameterDescriptor.j().e) {
            return new TypeProjectionImpl(DescriptorUtilsKt.e(typeParameterDescriptor).o(), Variance.f);
        }
        List parameters = kotlinType.J0().getParameters();
        Intrinsics.g(parameters, "getParameters(...)");
        return !parameters.isEmpty() ? new TypeProjectionImpl(kotlinType, Variance.h) : TypeUtils.l(typeParameterDescriptor, javaTypeAttributesJ);
    }
}
