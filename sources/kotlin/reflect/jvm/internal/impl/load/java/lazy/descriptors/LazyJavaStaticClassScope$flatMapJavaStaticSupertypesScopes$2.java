package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes7.dex */
public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2 extends DFS.AbstractNodeHandler<ClassDescriptor, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClassDescriptor f24439a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ Function1 c;

    public LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(ClassDescriptor classDescriptor, LinkedHashSet linkedHashSet, Function1 function1) {
        this.f24439a = classDescriptor;
        this.b = linkedHashSet;
        this.c = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public final /* bridge */ /* synthetic */ Object a() {
        return Unit.f24250a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public final boolean b(Object obj) {
        ClassDescriptor current = (ClassDescriptor) obj;
        Intrinsics.h(current, "current");
        if (current == this.f24439a) {
            return true;
        }
        MemberScope memberScopeQ0 = current.q0();
        Intrinsics.g(memberScopeQ0, "getStaticScope(...)");
        if (!(memberScopeQ0 instanceof LazyJavaStaticScope)) {
            return true;
        }
        this.b.addAll((Collection) this.c.invoke(memberScopeQ0));
        return false;
    }
}
