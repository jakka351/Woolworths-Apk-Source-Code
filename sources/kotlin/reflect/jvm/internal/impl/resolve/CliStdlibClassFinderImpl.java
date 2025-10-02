package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

/* loaded from: classes7.dex */
final class CliStdlibClassFinderImpl implements StdlibClassFinder {

    /* renamed from: a, reason: collision with root package name */
    public static final CliStdlibClassFinderImpl f24527a = new CliStdlibClassFinderImpl();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    public final ClassDescriptor a(ModuleDescriptor moduleDescriptor) {
        return FindClassInModuleKt.a(moduleDescriptor, StandardClassIds.z);
    }
}
