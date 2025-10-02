package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes.dex */
public class TypeUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final ErrorType f24621a = ErrorUtils.c(ErrorTypeKind.o, new String[0]);
    public static final ErrorType b = ErrorUtils.c(ErrorTypeKind.l, new String[0]);
    public static final SpecialType c = new SpecialType("NO_EXPECTED_TYPE");
    public static final SpecialType d = new SpecialType("UNIT_EXPECTED_TYPE");

    public static class SpecialType extends DelegatingSimpleType {
        public final String e;

        public SpecialType(String str) {
            this.e = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void V0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeUtils.SpecialType.V0(int):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
        /* renamed from: L0 */
        public final KotlinType O0(KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner != null) {
                return this;
            }
            V0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public final /* bridge */ /* synthetic */ UnwrappedType N0(boolean z) {
            N0(z);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        /* renamed from: O0 */
        public final UnwrappedType L0(KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner != null) {
                return this;
            }
            V0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public final /* bridge */ /* synthetic */ UnwrappedType P0(TypeAttributes typeAttributes) {
            P0(typeAttributes);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        /* renamed from: Q0 */
        public final SimpleType N0(boolean z) {
            throw new IllegalStateException(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        /* renamed from: R0 */
        public final SimpleType P0(TypeAttributes typeAttributes) {
            if (typeAttributes != null) {
                throw new IllegalStateException(this.e);
            }
            V0(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public final SimpleType S0() {
            throw new IllegalStateException(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        /* renamed from: T0 */
        public final SimpleType L0(KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner != null) {
                return this;
            }
            V0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public final DelegatingSimpleType U0(SimpleType simpleType) {
            throw new IllegalStateException(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        public final String toString() {
            String str = this.e;
            if (str != null) {
                return str;
            }
            V0(1);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r27) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeUtils.a(int):void");
    }

    public static boolean b(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(28);
            throw null;
        }
        if (kotlinType.K0()) {
            return true;
        }
        return FlexibleTypesKt.b(kotlinType) && b(FlexibleTypesKt.a(kotlinType).S0());
    }

    public static boolean c(KotlinType kotlinType, Function1 function1, SmartSet smartSet) {
        if (kotlinType == null) {
            return false;
        }
        UnwrappedType unwrappedTypeM0 = kotlinType.M0();
        if (n(kotlinType)) {
            return ((Boolean) function1.invoke(unwrappedTypeM0)).booleanValue();
        }
        if (smartSet != null && smartSet.contains(kotlinType)) {
            return false;
        }
        if (((Boolean) function1.invoke(unwrappedTypeM0)).booleanValue()) {
            return true;
        }
        if (smartSet == null) {
            smartSet = SmartSet.d();
        }
        smartSet.add(kotlinType);
        FlexibleType flexibleType = unwrappedTypeM0 instanceof FlexibleType ? (FlexibleType) unwrappedTypeM0 : null;
        if (flexibleType != null && (c(flexibleType.R0(), function1, smartSet) || c(flexibleType.S0(), function1, smartSet))) {
            return true;
        }
        if ((unwrappedTypeM0 instanceof DefinitelyNotNullType) && c(((DefinitelyNotNullType) unwrappedTypeM0).V0(), function1, smartSet)) {
            return true;
        }
        TypeConstructor typeConstructorJ0 = kotlinType.J0();
        if (typeConstructorJ0 instanceof IntersectionTypeConstructor) {
            Iterator it = ((IntersectionTypeConstructor) typeConstructorJ0).a().iterator();
            while (it.hasNext()) {
                if (c((KotlinType) it.next(), function1, smartSet)) {
                    return true;
                }
            }
            return false;
        }
        for (TypeProjection typeProjection : kotlinType.H0()) {
            if (!typeProjection.a() && c(typeProjection.getType(), function1, smartSet)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).t()));
        }
        return CollectionsKt.G0(arrayList);
    }

    public static boolean e(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(29);
            throw null;
        }
        if (kotlinType.J0().c() instanceof ClassDescriptor) {
            return false;
        }
        TypeSubstitutor typeSubstitutorD = TypeSubstitutor.d(kotlinType);
        Collection<KotlinType> collectionA = kotlinType.J0().a();
        ArrayList arrayList = new ArrayList(collectionA.size());
        for (KotlinType kotlinType2 : collectionA) {
            if (kotlinType2 == null) {
                a(21);
                throw null;
            }
            KotlinType kotlinTypeK = typeSubstitutorD.k(kotlinType2, Variance.f);
            KotlinType kotlinTypeI = kotlinTypeK != null ? i(kotlinTypeK, kotlinType.K0()) : null;
            if (kotlinTypeI != null) {
                arrayList.add(kotlinTypeI);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (f((KotlinType) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(27);
            throw null;
        }
        if (kotlinType.K0()) {
            return true;
        }
        if (FlexibleTypesKt.b(kotlinType) && f(FlexibleTypesKt.a(kotlinType).S0())) {
            return true;
        }
        if (SpecialTypesKt.a(kotlinType)) {
            return false;
        }
        if (g(kotlinType)) {
            return e(kotlinType);
        }
        if (kotlinType instanceof AbstractStubType) {
            TypeParameterDescriptor typeParameterDescriptorB = ((AbstractStubType) kotlinType).S0().b();
            return typeParameterDescriptorB == null || e(typeParameterDescriptorB.t());
        }
        TypeConstructor typeConstructorJ0 = kotlinType.J0();
        if (!(typeConstructorJ0 instanceof IntersectionTypeConstructor)) {
            return false;
        }
        Iterator it = ((IntersectionTypeConstructor) typeConstructorJ0).a().iterator();
        while (it.hasNext()) {
            if (f((KotlinType) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(KotlinType kotlinType) {
        if (kotlinType != null) {
            return (kotlinType.J0().c() instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) kotlinType.J0().c() : null) != null || (kotlinType.J0() instanceof NewTypeVariableConstructor);
        }
        a(60);
        throw null;
    }

    public static UnwrappedType h(KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            a(3);
            throw null;
        }
        UnwrappedType unwrappedTypeN0 = kotlinType.M0().N0(z);
        if (unwrappedTypeN0 != null) {
            return unwrappedTypeN0;
        }
        a(4);
        throw null;
    }

    public static KotlinType i(KotlinType kotlinType, boolean z) {
        if (kotlinType != null) {
            return z ? h(kotlinType, true) : kotlinType;
        }
        a(8);
        throw null;
    }

    public static SimpleType j(SimpleType simpleType, boolean z) {
        if (simpleType == null) {
            a(5);
            throw null;
        }
        if (!z) {
            return simpleType;
        }
        SimpleType simpleTypeN0 = simpleType.N0(true);
        if (simpleTypeN0 != null) {
            return simpleTypeN0;
        }
        a(6);
        throw null;
    }

    public static StarProjectionImpl k(TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor != null) {
            return new StarProjectionImpl(typeParameterDescriptor);
        }
        a(45);
        throw null;
    }

    public static TypeProjectionBase l(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        if (typeParameterDescriptor != null) {
            return erasureTypeAttributes.b() == TypeUsage.d ? new TypeProjectionImpl(StarProjectionImplKt.b(typeParameterDescriptor)) : new StarProjectionImpl(typeParameterDescriptor);
        }
        a(46);
        throw null;
    }

    public static SimpleType m(TypeConstructor typeConstructor, MemberScope memberScope, Function1 function1) {
        if (typeConstructor == null) {
            a(12);
            throw null;
        }
        if (memberScope == null) {
            a(13);
            throw null;
        }
        List listD = d(typeConstructor.getParameters());
        TypeAttributes.e.getClass();
        return KotlinTypeFactory.f(TypeAttributes.f, typeConstructor, listD, false, memberScope, function1);
    }

    public static boolean n(KotlinType kotlinType) {
        if (kotlinType != null) {
            return kotlinType == c || kotlinType == d;
        }
        a(0);
        throw null;
    }
}
