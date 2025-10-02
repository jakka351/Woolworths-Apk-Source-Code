package kotlin.reflect.jvm.internal.impl.incremental;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes.dex */
public final class UtilsKt {
    public static final void a(LookupTracker lookupTracker, LookupLocation from, ClassDescriptor scopeOwner, Name name) {
        Intrinsics.h(lookupTracker, "<this>");
        Intrinsics.h(from, "from");
        Intrinsics.h(scopeOwner, "scopeOwner");
        Intrinsics.h(name, "name");
    }

    public static final void b(LookupTracker lookupTracker, LookupLocation from, PackageFragmentDescriptor scopeOwner, Name name) {
        Intrinsics.h(lookupTracker, "<this>");
        Intrinsics.h(from, "from");
        Intrinsics.h(scopeOwner, "scopeOwner");
        Intrinsics.h(name, "name");
        String packageFqName = scopeOwner.d().f24500a.f24501a;
        Intrinsics.g(name.b(), "asString(...)");
        Intrinsics.h(packageFqName, "packageFqName");
    }
}
