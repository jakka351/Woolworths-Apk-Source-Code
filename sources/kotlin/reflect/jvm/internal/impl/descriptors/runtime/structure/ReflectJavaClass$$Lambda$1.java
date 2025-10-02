package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes7.dex */
class ReflectJavaClass$$Lambda$1 implements Function1 {
    public static final ReflectJavaClass$$Lambda$1 d = new ReflectJavaClass$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!Name.f(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.e(simpleName);
        }
        return null;
    }
}
