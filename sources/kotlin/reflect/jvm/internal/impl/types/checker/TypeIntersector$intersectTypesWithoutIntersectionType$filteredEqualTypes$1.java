package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* loaded from: classes7.dex */
final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 extends FunctionReferenceImpl implements Function2<KotlinType, KotlinType, Boolean> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        KotlinType p0 = (KotlinType) obj;
        KotlinType p1 = (KotlinType) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ((TypeIntersector) this.receiver).getClass();
        NewKotlinTypeChecker.b.getClass();
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.b;
        return Boolean.valueOf(newKotlinTypeCheckerImpl.d(p0, p1) && !newKotlinTypeCheckerImpl.d(p1, p0));
    }
}
