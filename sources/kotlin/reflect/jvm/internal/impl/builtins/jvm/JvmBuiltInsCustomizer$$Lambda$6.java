package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes7.dex */
class JvmBuiltInsCustomizer$$Lambda$6 implements DFS.Neighbors {

    /* renamed from: a, reason: collision with root package name */
    public static final JvmBuiltInsCustomizer$$Lambda$6 f24326a = new JvmBuiltInsCustomizer$$Lambda$6();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable a(Object obj) {
        KProperty[] kPropertyArr = JvmBuiltInsCustomizer.h;
        return ((CallableMemberDescriptor) obj).H0().q();
    }
}
