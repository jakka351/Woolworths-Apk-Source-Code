package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes7.dex */
public class TypeProjectionImpl extends TypeProjectionBase {

    /* renamed from: a, reason: collision with root package name */
    public final Variance f24617a;
    public final KotlinType b;

    public TypeProjectionImpl(KotlinType kotlinType, Variance variance) {
        if (variance == null) {
            d(0);
            throw null;
        }
        if (kotlinType == null) {
            d(1);
            throw null;
        }
        this.f24617a = variance;
        this.b = kotlinType;
    }

    public static /* synthetic */ void d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final boolean a() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final Variance b() {
        Variance variance = this.f24617a;
        if (variance != null) {
            return variance;
        }
        d(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final TypeProjection c(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner != null) {
            return new TypeProjectionImpl(kotlinTypeRefiner.a(this.b), this.f24617a);
        }
        d(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final KotlinType getType() {
        KotlinType kotlinType = this.b;
        if (kotlinType != null) {
            return kotlinType;
        }
        d(5);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeProjectionImpl(KotlinType kotlinType) {
        this(kotlinType, Variance.f);
        if (kotlinType != null) {
        } else {
            d(2);
            throw null;
        }
    }
}
