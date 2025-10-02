package kotlin.reflect.jvm.internal.impl.types;

import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* loaded from: classes7.dex */
public final class TypeSubstitutionKt {
    public static final SimpleType a(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        UnwrappedType unwrappedTypeM0 = kotlinType.M0();
        SimpleType simpleType = unwrappedTypeM0 instanceof SimpleType ? (SimpleType) unwrappedTypeM0 : null;
        if (simpleType != null) {
            return simpleType;
        }
        throw new IllegalStateException(("This is should be simple type: " + kotlinType).toString());
    }

    public static final SimpleType b(SimpleType simpleType, List newArguments, TypeAttributes newAttributes) {
        Intrinsics.h(simpleType, "<this>");
        Intrinsics.h(newArguments, "newArguments");
        Intrinsics.h(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == simpleType.I0()) {
            return simpleType;
        }
        if (newArguments.isEmpty()) {
            return simpleType.P0(newAttributes);
        }
        if (!(simpleType instanceof ErrorType)) {
            return KotlinTypeFactory.d(newAttributes, simpleType.J0(), newArguments, simpleType.K0(), null);
        }
        ErrorType errorType = (ErrorType) simpleType;
        TypeConstructor typeConstructor = errorType.e;
        ErrorScope errorScope = errorType.f;
        ErrorTypeKind errorTypeKind = errorType.g;
        boolean z = errorType.i;
        String[] strArr = errorType.j;
        return new ErrorType(typeConstructor, errorScope, errorTypeKind, newArguments, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static KotlinType c(KotlinType kotlinType, List list, Annotations annotations, int i) {
        if ((i & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        Intrinsics.h(kotlinType, "<this>");
        if ((list.isEmpty() || list == kotlinType.H0()) && annotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        TypeAttributes typeAttributesI0 = kotlinType.I0();
        if ((annotations instanceof FilteredAnnotations) && ((FilteredAnnotations) annotations).isEmpty()) {
            annotations = Annotations.Companion.f24350a;
        }
        TypeAttributes typeAttributesA = TypeAttributesKt.a(typeAttributesI0, annotations);
        UnwrappedType unwrappedTypeM0 = kotlinType.M0();
        if (unwrappedTypeM0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeM0;
            return KotlinTypeFactory.a(b(flexibleType.e, list, typeAttributesA), b(flexibleType.f, list, typeAttributesA));
        }
        if (unwrappedTypeM0 instanceof SimpleType) {
            return b((SimpleType) unwrappedTypeM0, list, typeAttributesA);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ SimpleType d(SimpleType simpleType, List list, TypeAttributes typeAttributes, int i) {
        if ((i & 1) != 0) {
            list = simpleType.H0();
        }
        if ((i & 2) != 0) {
            typeAttributes = simpleType.I0();
        }
        return b(simpleType, list, typeAttributes);
    }
}
