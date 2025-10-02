package kotlin.reflect.jvm.internal.impl.types.checker;

import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;

/* loaded from: classes7.dex */
public class TypeCheckingProcedure {
    public static UnwrappedType a(SimpleType simpleType, SimpleType simpleType2) {
        boolean z = false;
        if (simpleType != null) {
            TypeCheckerProcedureCallbacksImpl typeCheckerProcedureCallbacksImpl = new TypeCheckerProcedureCallbacksImpl();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(new SubtypePathNode(simpleType, null));
            TypeConstructor typeConstructorJ0 = simpleType2.J0();
            while (!arrayDeque.isEmpty()) {
                SubtypePathNode subtypePathNode = (SubtypePathNode) arrayDeque.poll();
                KotlinType kotlinTypeI = subtypePathNode.f24630a;
                TypeConstructor typeConstructorJ02 = kotlinTypeI.J0();
                if (typeCheckerProcedureCallbacksImpl.b(typeConstructorJ02, typeConstructorJ0)) {
                    boolean zK0 = kotlinTypeI.K0();
                    for (SubtypePathNode subtypePathNode2 = subtypePathNode.b; subtypePathNode2 != null; subtypePathNode2 = subtypePathNode2.b) {
                        KotlinType kotlinType = subtypePathNode2.f24630a;
                        List listH0 = kotlinType.H0();
                        boolean z2 = listH0 instanceof Collection;
                        TypeConstructorSubstitution.Companion companion = TypeConstructorSubstitution.b;
                        if (z2 && listH0.isEmpty()) {
                            kotlinTypeI = new TypeSubstitutor(companion.a(kotlinType.J0(), kotlinType.H0())).i(kotlinTypeI, Variance.f);
                        } else {
                            Iterator it = listH0.iterator();
                            while (it.hasNext()) {
                                Variance varianceB = ((TypeProjection) it.next()).b();
                                Variance variance = Variance.f;
                                if (varianceB != variance) {
                                    kotlinTypeI = (KotlinType) CapturedTypeApproximationKt.a(new TypeSubstitutor(CapturedTypeConstructorKt.b(companion.a(kotlinType.J0(), kotlinType.H0()))).i(kotlinTypeI, variance)).b;
                                    break;
                                }
                            }
                            kotlinTypeI = new TypeSubstitutor(companion.a(kotlinType.J0(), kotlinType.H0())).i(kotlinTypeI, Variance.f);
                        }
                        zK0 = zK0 || kotlinType.K0();
                    }
                    TypeConstructor typeConstructorJ03 = kotlinTypeI.J0();
                    if (typeCheckerProcedureCallbacksImpl.b(typeConstructorJ03, typeConstructorJ0)) {
                        return TypeUtils.h(kotlinTypeI, zK0);
                    }
                    throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + UtilsKt.a(typeConstructorJ03) + ", \n\nsupertype: " + UtilsKt.a(typeConstructorJ0) + " \n" + typeConstructorJ03.equals(typeConstructorJ0));
                }
                for (KotlinType kotlinType2 : typeConstructorJ02.a()) {
                    Intrinsics.e(kotlinType2);
                    arrayDeque.add(new SubtypePathNode(kotlinType2, subtypePathNode));
                }
            }
            return null;
        }
        Object[] objArr = new Object[3];
        switch (z) {
            case true:
            case true:
            case true:
            case true:
                objArr[0] = "supertype";
                break;
            case true:
            case true:
            case true:
            default:
                objArr[0] = "subtype";
                break;
            case true:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case true:
            case true:
            case true:
                objArr[0] = MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case true:
            case true:
                objArr[0] = "argument";
                break;
            case true:
            case true:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case true:
                objArr[0] = "type1";
                break;
            case true:
                objArr[0] = "type2";
                break;
            case true:
                objArr[0] = "typeParameter";
                break;
            case true:
                objArr[0] = "typeArgument";
                break;
            case true:
                objArr[0] = "typeParameterVariance";
                break;
            case true:
                objArr[0] = "typeArgumentVariance";
                break;
            case true:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case true:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        switch (z) {
            case true:
            case true:
                objArr[2] = "getOutType";
                break;
            case true:
            case true:
                break;
            case true:
            case true:
                objArr[2] = "getInType";
                break;
            case true:
            case true:
                objArr[2] = "equalTypes";
                break;
            case true:
            case true:
            case true:
            case true:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case true:
            case true:
                objArr[2] = "isSubtypeOf";
                break;
            case true:
            case true:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case true:
            case true:
            case true:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
