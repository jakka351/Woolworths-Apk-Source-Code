package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AbstractNullabilityChecker {
    public static boolean a(TypeCheckerState typeCheckerState, RigidTypeMarker type, TypeCheckerState.SupertypesPolicy supertypesPolicy) {
        Intrinsics.h(typeCheckerState, "<this>");
        Intrinsics.h(type, "type");
        TypeSystemContext typeSystemContext = typeCheckerState.c;
        if ((typeSystemContext.r(type) && !typeSystemContext.p0(type)) || typeSystemContext.c(type)) {
            return true;
        }
        typeCheckerState.c();
        ArrayDeque arrayDeque = typeCheckerState.g;
        Intrinsics.e(arrayDeque);
        SmartSet smartSet = typeCheckerState.h;
        Intrinsics.e(smartSet);
        arrayDeque.push(type);
        while (!arrayDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarker = (RigidTypeMarker) arrayDeque.pop();
            Intrinsics.e(rigidTypeMarker);
            if (smartSet.add(rigidTypeMarker)) {
                boolean zP0 = typeSystemContext.p0(rigidTypeMarker);
                TypeCheckerState.SupertypesPolicy.None none = TypeCheckerState.SupertypesPolicy.None.f24613a;
                TypeCheckerState.SupertypesPolicy supertypesPolicy2 = zP0 ? none : supertypesPolicy;
                if (supertypesPolicy2.equals(none)) {
                    supertypesPolicy2 = null;
                }
                if (supertypesPolicy2 == null) {
                    continue;
                } else {
                    Iterator it = typeSystemContext.f0(typeSystemContext.G(rigidTypeMarker)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerA = supertypesPolicy2.a(typeCheckerState, (KotlinTypeMarker) it.next());
                        if ((typeSystemContext.r(rigidTypeMarkerA) && !typeSystemContext.p0(rigidTypeMarkerA)) || typeSystemContext.c(rigidTypeMarkerA)) {
                            typeCheckerState.a();
                            return true;
                        }
                        arrayDeque.add(rigidTypeMarkerA);
                    }
                }
            }
        }
        typeCheckerState.a();
        return false;
    }

    public static boolean b(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeSystemContext typeSystemContext = typeCheckerState.c;
        if (typeSystemContext.s(rigidTypeMarker)) {
            return true;
        }
        if (typeSystemContext.p0(rigidTypeMarker)) {
            return false;
        }
        if (typeCheckerState.b && typeSystemContext.n(rigidTypeMarker)) {
            return true;
        }
        return typeSystemContext.s0(typeSystemContext.G(rigidTypeMarker), typeConstructorMarker);
    }
}
