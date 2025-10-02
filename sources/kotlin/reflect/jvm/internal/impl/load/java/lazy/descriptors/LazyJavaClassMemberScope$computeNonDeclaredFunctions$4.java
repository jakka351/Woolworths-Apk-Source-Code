package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes7.dex */
final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$4 extends FunctionReferenceImpl implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Name p0 = (Name) obj;
        Intrinsics.h(p0, "p0");
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) this.receiver;
        int i = LazyJavaClassMemberScope.v;
        return lazyJavaClassMemberScope.O(p0);
    }
}
