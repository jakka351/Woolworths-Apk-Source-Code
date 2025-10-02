package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final /* synthetic */ class ReflectJavaClass$constructors$1 extends FunctionReferenceImpl implements Function1<Member, Boolean> {
    public static final ReflectJavaClass$constructors$1 d = new ReflectJavaClass$constructors$1(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Member p0 = (Member) obj;
        Intrinsics.h(p0, "p0");
        return Boolean.valueOf(p0.isSynthetic());
    }
}
