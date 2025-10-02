package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24340a;

    public PackageFragmentProviderImpl(ArrayList arrayList) {
        this.f24340a = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final List a(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f24340a) {
            if (Intrinsics.c(((PackageFragmentDescriptor) obj).d(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean b(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        ArrayList arrayList = this.f24340a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.c(((PackageFragmentDescriptor) it.next()).d(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void c(FqName fqName, ArrayList arrayList) {
        Intrinsics.h(fqName, "fqName");
        for (Object obj : this.f24340a) {
            if (Intrinsics.c(((PackageFragmentDescriptor) obj).d(), fqName)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final Collection r(final FqName fqName, Function1 function1) {
        Intrinsics.h(fqName, "fqName");
        return SequencesKt.x(SequencesKt.g(SequencesKt.r(CollectionsKt.n(this.f24340a), PackageFragmentProviderImpl$$Lambda$0.d), new Function1(fqName) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$$Lambda$1
            public final FqName d;

            {
                this.d = fqName;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FqName it = (FqName) obj;
                Intrinsics.h(it, "it");
                return Boolean.valueOf(!it.f24500a.c() && it.b().equals(this.d));
            }
        }));
    }
}
