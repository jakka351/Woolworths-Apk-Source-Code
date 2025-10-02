package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public final class PackageFragmentProviderKt {
    public static final void a(PackageFragmentProvider packageFragmentProvider, FqName fqName, ArrayList arrayList) {
        Intrinsics.h(packageFragmentProvider, "<this>");
        Intrinsics.h(fqName, "fqName");
        if (packageFragmentProvider instanceof PackageFragmentProviderOptimized) {
            ((PackageFragmentProviderOptimized) packageFragmentProvider).c(fqName, arrayList);
        } else {
            arrayList.addAll(packageFragmentProvider.a(fqName));
        }
    }

    public static final boolean b(PackageFragmentProvider packageFragmentProvider, FqName fqName) {
        Intrinsics.h(packageFragmentProvider, "<this>");
        Intrinsics.h(fqName, "fqName");
        return packageFragmentProvider instanceof PackageFragmentProviderOptimized ? ((PackageFragmentProviderOptimized) packageFragmentProvider).b(fqName) : c(packageFragmentProvider, fqName).isEmpty();
    }

    public static final ArrayList c(PackageFragmentProvider packageFragmentProvider, FqName fqName) {
        Intrinsics.h(packageFragmentProvider, "<this>");
        Intrinsics.h(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(packageFragmentProvider, fqName, arrayList);
        return arrayList;
    }
}
