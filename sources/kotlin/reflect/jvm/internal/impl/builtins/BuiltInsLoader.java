package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes7.dex */
public interface BuiltInsLoader {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f24307a = Companion.f24308a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f24308a = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.d, BuiltInsLoader$Companion$$Lambda$0.d);

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public static BuiltInsLoader a() {
            return (BuiltInsLoader) b.getD();
        }
    }

    PackageFragmentProviderImpl a(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor moduleDescriptor, Iterable iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z);
}
