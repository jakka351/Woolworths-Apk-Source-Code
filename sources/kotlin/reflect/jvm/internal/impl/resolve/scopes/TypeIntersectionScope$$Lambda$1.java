package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes7.dex */
class TypeIntersectionScope$$Lambda$1 implements Function1 {
    public static final TypeIntersectionScope$$Lambda$1 d = new TypeIntersectionScope$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PropertyDescriptor selectMostSpecificInEachOverridableGroup = (PropertyDescriptor) obj;
        Intrinsics.h(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
