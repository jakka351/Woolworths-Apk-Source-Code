package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
class ReflectJavaClass$$Lambda$0 implements Function1 {
    public static final ReflectJavaClass$$Lambda$0 d = new ReflectJavaClass$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
    }
}
