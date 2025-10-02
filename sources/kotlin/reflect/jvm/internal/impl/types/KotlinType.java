package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes.dex */
public abstract class KotlinType implements Annotated, KotlinTypeMarker {
    public int d;

    public abstract List H0();

    public abstract TypeAttributes I0();

    public abstract TypeConstructor J0();

    public abstract boolean K0();

    public abstract KotlinType L0(KotlinTypeRefiner kotlinTypeRefiner);

    public abstract UnwrappedType M0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        return K0() == kotlinType.K0() && StrictEqualityTypeChecker.a(M0(), kotlinType.M0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.a(I0());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.d;
        if (i != 0) {
            return i;
        }
        if (KotlinTypeKt.a(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (K0() ? 1 : 0) + ((H0().hashCode() + (J0().hashCode() * 31)) * 31);
        }
        this.d = iHashCode;
        return iHashCode;
    }

    public abstract MemberScope s();
}
