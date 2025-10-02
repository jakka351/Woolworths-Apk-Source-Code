package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class CompositePackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* renamed from: a, reason: collision with root package name */
    public final List f24357a;
    public final String b;

    public CompositePackageFragmentProvider(List list, String debugName) {
        Intrinsics.h(debugName, "debugName");
        this.f24357a = list;
        this.b = debugName;
        list.size();
        CollectionsKt.L0(list).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final List a(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f24357a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.a((PackageFragmentProvider) it.next(), fqName, arrayList);
        }
        return CollectionsKt.G0(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean b(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        List list = this.f24357a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!PackageFragmentProviderKt.b((PackageFragmentProvider) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void c(FqName fqName, ArrayList arrayList) {
        Intrinsics.h(fqName, "fqName");
        Iterator it = this.f24357a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.a((PackageFragmentProvider) it.next(), fqName, arrayList);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final Collection r(FqName fqName, Function1 function1) {
        Intrinsics.h(fqName, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.f24357a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((PackageFragmentProvider) it.next()).r(fqName, function1));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
