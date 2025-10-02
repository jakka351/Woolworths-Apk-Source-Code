package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SpecialTypesKt {
    public static final boolean a(KotlinType kotlinType) {
        return kotlinType.M0() instanceof DefinitelyNotNullType;
    }

    public static final UnwrappedType b(UnwrappedType unwrappedType, boolean z) {
        Intrinsics.h(unwrappedType, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeA = DefinitelyNotNullType.Companion.a(unwrappedType, z);
        if (definitelyNotNullTypeA != null) {
            return definitelyNotNullTypeA;
        }
        SimpleType simpleTypeC = c(unwrappedType);
        return simpleTypeC != null ? simpleTypeC : unwrappedType.N0(false);
    }

    public static final SimpleType c(UnwrappedType unwrappedType) {
        IntersectionTypeConstructor intersectionTypeConstructorI;
        TypeConstructor typeConstructorJ0 = unwrappedType.J0();
        IntersectionTypeConstructor intersectionTypeConstructor = typeConstructorJ0 instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) typeConstructorJ0 : null;
        if (intersectionTypeConstructor != null) {
            LinkedHashSet<KotlinType> linkedHashSet = intersectionTypeConstructor.b;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(linkedHashSet, 10));
            boolean z = false;
            for (KotlinType kotlinTypeB : linkedHashSet) {
                if (TypeUtils.f(kotlinTypeB)) {
                    kotlinTypeB = b(kotlinTypeB.M0(), false);
                    z = true;
                }
                arrayList.add(kotlinTypeB);
            }
            if (z) {
                KotlinType kotlinTypeB2 = intersectionTypeConstructor.f24606a;
                if (kotlinTypeB2 == null) {
                    kotlinTypeB2 = null;
                } else if (TypeUtils.f(kotlinTypeB2)) {
                    kotlinTypeB2 = b(kotlinTypeB2.M0(), false);
                }
                intersectionTypeConstructorI = new IntersectionTypeConstructor(arrayList).i(kotlinTypeB2);
            } else {
                intersectionTypeConstructorI = null;
            }
            if (intersectionTypeConstructorI != null) {
                return intersectionTypeConstructorI.f();
            }
        }
        return null;
    }

    public static final SimpleType d(SimpleType simpleType, SimpleType abbreviatedType) {
        Intrinsics.h(simpleType, "<this>");
        Intrinsics.h(abbreviatedType, "abbreviatedType");
        return KotlinTypeKt.a(simpleType) ? simpleType : new AbbreviatedType(simpleType, abbreviatedType);
    }
}
