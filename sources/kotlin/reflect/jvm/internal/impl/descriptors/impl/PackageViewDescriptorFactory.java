package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes.dex */
public interface PackageViewDescriptorFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f24361a = Companion.f24362a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f24362a = new Companion();
        public static final ModuleCapability b = new ModuleCapability("PackageViewDescriptorFactory");
    }

    public static final class Default implements PackageViewDescriptorFactory {
        public static final Default b = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory
        public final LazyPackageViewDescriptorImpl a(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName, LockBasedStorageManager storageManager) {
            Intrinsics.h(fqName, "fqName");
            Intrinsics.h(storageManager, "storageManager");
            return new LazyPackageViewDescriptorImpl(moduleDescriptorImpl, fqName, storageManager);
        }
    }

    LazyPackageViewDescriptorImpl a(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName, LockBasedStorageManager lockBasedStorageManager);
}
