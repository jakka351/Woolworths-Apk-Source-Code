package kotlin.reflect.jvm.internal.impl.types;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes.dex */
class AbstractTypeConstructor$$Lambda$1 implements Function1 {
    public static final AbstractTypeConstructor$$Lambda$1 d = new AbstractTypeConstructor$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        return new AbstractTypeConstructor.Supertypes(CollectionsKt.Q(ErrorUtils.d));
    }
}
