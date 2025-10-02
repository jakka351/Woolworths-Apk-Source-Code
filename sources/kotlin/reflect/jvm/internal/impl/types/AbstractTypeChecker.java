package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AbstractTypeChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractTypeChecker f24599a = new AbstractTypeChecker();

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TypeVariance typeVariance = TypeVariance.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TypeVariance typeVariance2 = TypeVariance.e;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TypeCheckerState.LowerCapturedTypePolicy[] lowerCapturedTypePolicyArr = TypeCheckerState.LowerCapturedTypePolicy.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TypeCheckerState.LowerCapturedTypePolicy[] lowerCapturedTypePolicyArr2 = TypeCheckerState.LowerCapturedTypePolicy.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final boolean a(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        UnwrappedType unwrappedTypeO;
        return typeSystemContext.E(rigidTypeMarker) || ((rigidTypeMarker instanceof CapturedTypeMarker) && (unwrappedTypeO = typeSystemContext.O(typeSystemContext.I(typeSystemContext.a0((CapturedTypeMarker) rigidTypeMarker)))) != null && typeSystemContext.E(typeSystemContext.i(unwrappedTypeO)));
    }

    public static final boolean b(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2, boolean z) {
        Collection<KotlinTypeMarker> collectionW = typeSystemContext.w(rigidTypeMarker);
        if ((collectionW instanceof Collection) && collectionW.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : collectionW) {
            if (Intrinsics.c(typeSystemContext.A(kotlinTypeMarker), typeSystemContext.G(rigidTypeMarker2))) {
                return true;
            }
            if (z && j(f24599a, typeCheckerState, rigidTypeMarker2, kotlinTypeMarker)) {
                return true;
            }
        }
        return false;
    }

    public static List c(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicyC;
        TypeSystemContext typeSystemContext = typeCheckerState.c;
        typeSystemContext.j0(rigidTypeMarker, typeConstructorMarker);
        if (typeSystemContext.K(typeConstructorMarker) || !typeSystemContext.r(rigidTypeMarker)) {
            if (!typeSystemContext.q0(typeConstructorMarker)) {
                SmartList smartList = new SmartList();
                typeCheckerState.c();
                ArrayDeque arrayDeque = typeCheckerState.g;
                Intrinsics.e(arrayDeque);
                SmartSet smartSet = typeCheckerState.h;
                Intrinsics.e(smartSet);
                arrayDeque.push(rigidTypeMarker);
                while (!arrayDeque.isEmpty()) {
                    RigidTypeMarker rigidTypeMarker2 = (RigidTypeMarker) arrayDeque.pop();
                    Intrinsics.e(rigidTypeMarker2);
                    if (smartSet.add(rigidTypeMarker2)) {
                        CaptureStatus captureStatus = CaptureStatus.d;
                        SimpleType simpleTypeM = typeSystemContext.m(rigidTypeMarker2);
                        if (simpleTypeM == null) {
                            simpleTypeM = rigidTypeMarker2;
                        }
                        boolean zS0 = typeSystemContext.s0(typeSystemContext.G(simpleTypeM), typeConstructorMarker);
                        TypeCheckerState.SupertypesPolicy.None none = TypeCheckerState.SupertypesPolicy.None.f24613a;
                        if (zS0) {
                            smartList.add(simpleTypeM);
                            supertypesPolicyC = none;
                        } else {
                            supertypesPolicyC = typeSystemContext.a(simpleTypeM) == 0 ? TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f24612a : typeSystemContext.C(simpleTypeM);
                        }
                        if (supertypesPolicyC.equals(none)) {
                            supertypesPolicyC = null;
                        }
                        if (supertypesPolicyC != null) {
                            Iterator it = typeSystemContext.f0(typeSystemContext.G(rigidTypeMarker2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(supertypesPolicyC.a(typeCheckerState, (KotlinTypeMarker) it.next()));
                            }
                        }
                    }
                }
                typeCheckerState.a();
                return smartList;
            }
            if (typeSystemContext.s0(typeSystemContext.G(rigidTypeMarker), typeConstructorMarker)) {
                CaptureStatus captureStatus2 = CaptureStatus.d;
                SimpleType simpleTypeM2 = typeSystemContext.m(rigidTypeMarker);
                if (simpleTypeM2 != null) {
                    rigidTypeMarker = simpleTypeM2;
                }
                return CollectionsKt.Q(rigidTypeMarker);
            }
        }
        return EmptyList.d;
    }

    public static List d(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        int i;
        List listC = c(typeCheckerState, rigidTypeMarker, typeConstructorMarker);
        TypeSystemContext typeSystemContext = typeCheckerState.c;
        if (listC.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                TypeArgumentListMarker typeArgumentListMarkerS = typeSystemContext.S((RigidTypeMarker) obj);
                int iW = typeSystemContext.W(typeArgumentListMarkerS);
                while (true) {
                    if (i >= iW) {
                        arrayList.add(obj);
                        break;
                    }
                    UnwrappedType unwrappedTypeO = typeSystemContext.O(typeSystemContext.e(typeArgumentListMarkerS, i));
                    i = (unwrappedTypeO != null ? typeSystemContext.F(unwrappedTypeO) : null) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listC;
    }

    public static boolean e(TypeCheckerState typeCheckerState, KotlinTypeMarker a2, KotlinTypeMarker b) {
        AbstractTypeRefiner abstractTypeRefiner = typeCheckerState.e;
        Intrinsics.h(a2, "a");
        Intrinsics.h(b, "b");
        TypeSystemContext typeSystemContext = typeCheckerState.c;
        if (a2 == b) {
            return true;
        }
        if (g(typeSystemContext, a2) && g(typeSystemContext, b)) {
            KotlinTypeMarker kotlinTypeMarkerD = typeCheckerState.d(abstractTypeRefiner.a(a2));
            KotlinTypeMarker kotlinTypeMarkerD2 = typeCheckerState.d(abstractTypeRefiner.a(b));
            SimpleType simpleTypeM = typeSystemContext.M(kotlinTypeMarkerD);
            if (!typeSystemContext.s0(typeSystemContext.A(kotlinTypeMarkerD), typeSystemContext.A(kotlinTypeMarkerD2))) {
                return false;
            }
            if (typeSystemContext.a(simpleTypeM) == 0) {
                return typeSystemContext.g0(kotlinTypeMarkerD) || typeSystemContext.g0(kotlinTypeMarkerD2) || typeSystemContext.p0(simpleTypeM) == typeSystemContext.p0(typeSystemContext.M(kotlinTypeMarkerD2));
            }
        }
        AbstractTypeChecker abstractTypeChecker = f24599a;
        return j(abstractTypeChecker, typeCheckerState, a2, b) && j(abstractTypeChecker, typeCheckerState, b, a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return r6.T(r6.A(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker f(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r6, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r7, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r8) {
        /*
            int r0 = r6.a(r7)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L5e
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r4 = r6.b0(r7, r2)
            boolean r5 = r6.g(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L5b
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r3 = r6.O(r3)
            if (r3 != 0) goto L1d
            goto L5b
        L1d:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r6.M(r3)
            boolean r4 = r6.r0(r4)
            if (r4 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r6.M(r8)
            boolean r4 = r6.r0(r4)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = r1
        L34:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L52
            if (r4 == 0) goto L4b
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r4 = r6.A(r3)
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r6.A(r8)
            boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r5)
            if (r4 == 0) goto L4b
            goto L52
        L4b:
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r3 = f(r6, r3, r8)
            if (r3 == 0) goto L5b
            return r3
        L52:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r7 = r6.A(r7)
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r6 = r6.T(r7, r2)
            return r6
        L5b:
            int r2 = r2 + 1
            goto L6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.f(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker):kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker");
    }

    public static boolean g(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        return (!typeSystemContext.B(typeSystemContext.A(kotlinTypeMarker)) || typeSystemContext.z(kotlinTypeMarker) || typeSystemContext.D(kotlinTypeMarker) || typeSystemContext.U(kotlinTypeMarker) || typeSystemContext.b(kotlinTypeMarker)) ? false : true;
    }

    public static boolean h(TypeCheckerState typeCheckerState, TypeArgumentListMarker capturedSubArguments, RigidTypeMarker rigidTypeMarker) {
        boolean zJ;
        Intrinsics.h(capturedSubArguments, "capturedSubArguments");
        TypeSystemContext typeSystemContext = typeCheckerState.c;
        TypeConstructor typeConstructorG = typeSystemContext.G(rigidTypeMarker);
        int iW = typeSystemContext.W(capturedSubArguments);
        int iE0 = typeSystemContext.e0(typeConstructorG);
        if (iW == iE0 && iW == typeSystemContext.a(rigidTypeMarker)) {
            for (int i = 0; i < iE0; i++) {
                TypeArgumentMarker typeArgumentMarkerB0 = typeSystemContext.b0(rigidTypeMarker, i);
                UnwrappedType unwrappedTypeO = typeSystemContext.O(typeArgumentMarkerB0);
                if (unwrappedTypeO != null) {
                    TypeArgumentMarker typeArgumentMarkerE = typeSystemContext.e(capturedSubArguments, i);
                    typeSystemContext.N(typeArgumentMarkerE);
                    TypeVariance typeVariance = TypeVariance.g;
                    UnwrappedType unwrappedTypeO2 = typeSystemContext.O(typeArgumentMarkerE);
                    Intrinsics.e(unwrappedTypeO2);
                    TypeVariance typeVarianceV = typeSystemContext.V(typeSystemContext.T(typeConstructorG, i));
                    TypeVariance typeVarianceN = typeSystemContext.N(typeArgumentMarkerB0);
                    if (typeVarianceV == typeVariance) {
                        typeVarianceV = typeVarianceN;
                    } else if (typeVarianceN != typeVariance && typeVarianceV != typeVarianceN) {
                        typeVarianceV = null;
                    }
                    if (typeVarianceV == null) {
                        return typeCheckerState.f24610a;
                    }
                    if (typeVarianceV != typeVariance || (!k(typeSystemContext, unwrappedTypeO2, unwrappedTypeO, typeConstructorG) && !k(typeSystemContext, unwrappedTypeO, unwrappedTypeO2, typeConstructorG))) {
                        int i2 = typeCheckerState.f;
                        if (i2 > 100) {
                            throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + unwrappedTypeO2).toString());
                        }
                        typeCheckerState.f = i2 + 1;
                        int iOrdinal = typeVarianceV.ordinal();
                        AbstractTypeChecker abstractTypeChecker = f24599a;
                        if (iOrdinal == 0) {
                            zJ = j(abstractTypeChecker, typeCheckerState, unwrappedTypeO, unwrappedTypeO2);
                        } else if (iOrdinal == 1) {
                            zJ = j(abstractTypeChecker, typeCheckerState, unwrappedTypeO2, unwrappedTypeO);
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zJ = e(typeCheckerState, unwrappedTypeO2, unwrappedTypeO);
                        }
                        typeCheckerState.f--;
                        if (!zJ) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d5 A[EDGE_INSN: B:339:0x02d5->B:187:0x02d5 BREAK  A[LOOP:10: B:178:0x02b6->B:340:0x02b6]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean j(kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r17, final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r18, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r19, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r20) {
        /*
            Method dump skipped, instructions count: 1329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.j(kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker):boolean");
    }

    public static boolean k(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeParameterDescriptor typeParameterDescriptorO0;
        SimpleTypeMarker simpleTypeMarkerQ = typeSystemContext.Q(kotlinTypeMarker);
        if (!(simpleTypeMarkerQ instanceof CapturedTypeMarker)) {
            return false;
        }
        CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) simpleTypeMarkerQ;
        if (typeSystemContext.x(capturedTypeMarker) || !typeSystemContext.g(typeSystemContext.I(typeSystemContext.a0(capturedTypeMarker))) || typeSystemContext.H(capturedTypeMarker) != CaptureStatus.d) {
            return false;
        }
        TypeConstructor typeConstructorA = typeSystemContext.A(kotlinTypeMarker2);
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructorA instanceof TypeVariableTypeConstructorMarker ? (TypeVariableTypeConstructorMarker) typeConstructorA : null;
        return (typeVariableTypeConstructorMarker == null || (typeParameterDescriptorO0 = typeSystemContext.o0(typeVariableTypeConstructorMarker)) == null || !typeSystemContext.R(typeParameterDescriptorO0, typeConstructorMarker)) ? false : true;
    }

    public final boolean i(TypeCheckerState typeCheckerState, UnwrappedType subType, UnwrappedType superType) {
        Intrinsics.h(subType, "subType");
        Intrinsics.h(superType, "superType");
        return j(this, typeCheckerState, subType, superType);
    }
}
