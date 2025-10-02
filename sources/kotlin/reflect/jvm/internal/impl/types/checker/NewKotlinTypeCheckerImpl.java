package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes.dex */
public final class NewKotlinTypeCheckerImpl implements NewKotlinTypeChecker {
    public final KotlinTypePreparator c = KotlinTypePreparator.Default.f24624a;
    public final OverridingUtil d = new OverridingUtil(OverridingUtil.d);

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public final boolean a(KotlinType a2, KotlinType b) {
        Intrinsics.h(a2, "a");
        Intrinsics.h(b, "b");
        return AbstractTypeChecker.e(ClassicTypeCheckerStateKt.a(false, null, this.c, 6), a2.M0(), b.M0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public final OverridingUtil b() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public final KotlinTypeRefiner c() {
        return KotlinTypeRefiner.Default.f24625a;
    }

    public final boolean d(KotlinType subtype, KotlinType supertype) {
        Intrinsics.h(subtype, "subtype");
        Intrinsics.h(supertype, "supertype");
        return AbstractTypeChecker.j(AbstractTypeChecker.f24599a, ClassicTypeCheckerStateKt.a(true, null, this.c, 6), subtype.M0(), supertype.M0());
    }
}
