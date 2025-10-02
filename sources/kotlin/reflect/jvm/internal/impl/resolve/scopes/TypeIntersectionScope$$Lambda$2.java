package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

/* loaded from: classes7.dex */
class TypeIntersectionScope$$Lambda$2 implements Function1 {
    public static final TypeIntersectionScope$$Lambda$2 d = new TypeIntersectionScope$$Lambda$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableDescriptor selectMostSpecificInEachOverridableGroup = (CallableDescriptor) obj;
        Intrinsics.h(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
