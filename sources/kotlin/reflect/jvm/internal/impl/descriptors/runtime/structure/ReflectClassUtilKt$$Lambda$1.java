package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class ReflectClassUtilKt$$Lambda$1 implements Function1 {
    public static final ReflectClassUtilKt$$Lambda$1 d = new ReflectClassUtilKt$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ParameterizedType it = (ParameterizedType) obj;
        List list = ReflectClassUtilKt.f24377a;
        Intrinsics.h(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        Intrinsics.g(actualTypeArguments, "getActualTypeArguments(...)");
        return ArraysKt.g(actualTypeArguments);
    }
}
