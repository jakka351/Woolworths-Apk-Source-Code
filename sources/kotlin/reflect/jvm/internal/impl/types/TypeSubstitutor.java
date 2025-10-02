package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;

/* loaded from: classes7.dex */
public class TypeSubstitutor {
    public static final TypeSubstitutor b = new TypeSubstitutor(TypeSubstitution.f24618a);

    /* renamed from: a, reason: collision with root package name */
    public final TypeSubstitution f24619a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$1, reason: invalid class name */
    final class AnonymousClass1 implements Function1<FqName, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            if (((FqName) obj) != null) {
                return Boolean.valueOf(!r2.equals(StandardNames.FqNames.y));
            }
            throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24620a;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f24620a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24620a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24620a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class SubstitutionException extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VarianceConflictType {
        public static final VarianceConflictType d;
        public static final VarianceConflictType e;
        public static final VarianceConflictType f;
        public static final /* synthetic */ VarianceConflictType[] g;

        static {
            VarianceConflictType varianceConflictType = new VarianceConflictType("NO_CONFLICT", 0);
            d = varianceConflictType;
            VarianceConflictType varianceConflictType2 = new VarianceConflictType("IN_IN_OUT_POSITION", 1);
            e = varianceConflictType2;
            VarianceConflictType varianceConflictType3 = new VarianceConflictType("OUT_IN_IN_POSITION", 2);
            f = varianceConflictType3;
            g = new VarianceConflictType[]{varianceConflictType, varianceConflictType2, varianceConflictType3};
        }

        public static VarianceConflictType valueOf(String str) {
            return (VarianceConflictType) Enum.valueOf(VarianceConflictType.class, str);
        }

        public static VarianceConflictType[] values() {
            return (VarianceConflictType[]) g.clone();
        }
    }

    public TypeSubstitutor(TypeSubstitution typeSubstitution) {
        this.f24619a = typeSubstitution;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.a(int):void");
    }

    public static Variance b(Variance variance, Variance variance2) {
        if (variance == null) {
            a(38);
            throw null;
        }
        if (variance2 == null) {
            a(39);
            throw null;
        }
        Variance variance3 = Variance.f;
        if (variance == variance3) {
            if (variance2 != null) {
                return variance2;
            }
            a(40);
            throw null;
        }
        if (variance2 == variance3) {
            if (variance != null) {
                return variance;
            }
            a(41);
            throw null;
        }
        if (variance == variance2) {
            if (variance2 != null) {
                return variance2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    public static VarianceConflictType c(Variance variance, Variance variance2) {
        Variance variance3 = Variance.g;
        return (variance == variance3 && variance2 == Variance.h) ? VarianceConflictType.f : (variance == Variance.h && variance2 == variance3) ? VarianceConflictType.e : VarianceConflictType.d;
    }

    public static TypeSubstitutor d(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(6);
            throw null;
        }
        return new TypeSubstitutor(TypeConstructorSubstitution.b.a(kotlinType.J0(), kotlinType.H0()));
    }

    public static TypeSubstitutor e(TypeSubstitution typeSubstitution) {
        return new TypeSubstitutor(typeSubstitution);
    }

    public static TypeSubstitutor f(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            a(3);
            throw null;
        }
        if (typeSubstitution2 == null) {
            a(4);
            throw null;
        }
        if (typeSubstitution.f()) {
            typeSubstitution = typeSubstitution2;
        } else if (!typeSubstitution2.f()) {
            typeSubstitution = new DisjointKeysUnionTypeSubstitution(typeSubstitution, typeSubstitution2);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    public static String j(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ExceptionUtilsKt.a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final TypeSubstitution g() {
        TypeSubstitution typeSubstitution = this.f24619a;
        if (typeSubstitution != null) {
            return typeSubstitution;
        }
        a(8);
        throw null;
    }

    public final boolean h() {
        return this.f24619a.f();
    }

    public final KotlinType i(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            a(9);
            throw null;
        }
        if (this.f24619a.f()) {
            return kotlinType;
        }
        try {
            KotlinType type = l(new TypeProjectionImpl(kotlinType, variance), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (SubstitutionException e) {
            return ErrorUtils.c(ErrorTypeKind.n, e.getMessage());
        }
    }

    public final KotlinType k(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            a(14);
            throw null;
        }
        if (variance == null) {
            a(15);
            throw null;
        }
        TypeProjection typeProjectionImpl = new TypeProjectionImpl(g().g(kotlinType, variance), variance);
        TypeSubstitution typeSubstitution = this.f24619a;
        if (!typeSubstitution.f()) {
            try {
                typeProjectionImpl = l(typeProjectionImpl, null, 0);
            } catch (SubstitutionException unused) {
                typeProjectionImpl = null;
            }
        }
        if (typeSubstitution.a() || typeSubstitution.b()) {
            typeProjectionImpl = CapturedTypeApproximationKt.b(typeProjectionImpl, typeSubstitution.b());
        }
        if (typeProjectionImpl == null) {
            return null;
        }
        return typeProjectionImpl.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection l(kotlin.reflect.jvm.internal.impl.types.TypeProjection r17, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r18, int r19) throws kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.l(kotlin.reflect.jvm.internal.impl.types.TypeProjection, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, int):kotlin.reflect.jvm.internal.impl.types.TypeProjection");
    }
}
