package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty2;

/* loaded from: classes7.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements KMutableProperty2 {
    @Override // kotlin.jvm.internal.CallableReference
    public final KCallable computeReflected() {
        return Reflection.f24268a.f(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutablePropertyReference2Impl) this).getGetter().call(obj, obj2);
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty2.Setter c() {
        return ((KMutableProperty2) getReflected()).c();
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty2.Getter getGetter() {
        return ((KMutableProperty2) getReflected()).getGetter();
    }
}
