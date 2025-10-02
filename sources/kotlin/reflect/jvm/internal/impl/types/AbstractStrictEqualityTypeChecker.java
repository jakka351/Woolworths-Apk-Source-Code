package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes7.dex */
public final class AbstractStrictEqualityTypeChecker {
    public static boolean a(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (typeSystemContext.a(rigidTypeMarker) == typeSystemContext.a(rigidTypeMarker2) && typeSystemContext.p0(rigidTypeMarker) == typeSystemContext.p0(rigidTypeMarker2) && typeSystemContext.c(rigidTypeMarker) == typeSystemContext.c(rigidTypeMarker2) && typeSystemContext.s0(typeSystemContext.G(rigidTypeMarker), typeSystemContext.G(rigidTypeMarker2))) {
            if (typeSystemContext.c0(rigidTypeMarker, rigidTypeMarker2)) {
                return true;
            }
            int iA = typeSystemContext.a(rigidTypeMarker);
            for (int i = 0; i < iA; i++) {
                TypeArgumentMarker typeArgumentMarkerB0 = typeSystemContext.b0(rigidTypeMarker, i);
                TypeArgumentMarker typeArgumentMarkerB02 = typeSystemContext.b0(rigidTypeMarker2, i);
                if (typeSystemContext.g(typeArgumentMarkerB0) == typeSystemContext.g(typeArgumentMarkerB02)) {
                    if (!typeSystemContext.g(typeArgumentMarkerB0)) {
                        if (typeSystemContext.N(typeArgumentMarkerB0) == typeSystemContext.N(typeArgumentMarkerB02)) {
                            UnwrappedType unwrappedTypeO = typeSystemContext.O(typeArgumentMarkerB0);
                            Intrinsics.e(unwrappedTypeO);
                            UnwrappedType unwrappedTypeO2 = typeSystemContext.O(typeArgumentMarkerB02);
                            Intrinsics.e(unwrappedTypeO2);
                            if (!b(typeSystemContext, unwrappedTypeO, unwrappedTypeO2)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        SimpleType simpleTypeQ = typeSystemContext.Q(kotlinTypeMarker);
        SimpleType simpleTypeQ2 = typeSystemContext.Q(kotlinTypeMarker2);
        if (simpleTypeQ != null && simpleTypeQ2 != null) {
            return a(typeSystemContext, simpleTypeQ, simpleTypeQ2);
        }
        FlexibleType flexibleTypeF = typeSystemContext.F(kotlinTypeMarker);
        FlexibleType flexibleTypeF2 = typeSystemContext.F(kotlinTypeMarker2);
        return flexibleTypeF != null && flexibleTypeF2 != null && a(typeSystemContext, typeSystemContext.y(flexibleTypeF), typeSystemContext.y(flexibleTypeF2)) && a(typeSystemContext, typeSystemContext.l0(flexibleTypeF), typeSystemContext.l0(flexibleTypeF2));
    }
}
