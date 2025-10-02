package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {
    public final BuiltInsResourceLoader b = new BuiltInsResourceLoader();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public final PackageFragmentProviderImpl a(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor builtInsModule, Iterable classDescriptorFactories, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z) {
        Intrinsics.h(builtInsModule, "builtInsModule");
        Intrinsics.h(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.h(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<FqName> packageFqNames = StandardNames.r;
        BuiltInsLoaderImpl$createPackageFragmentProvider$1 builtInsLoaderImpl$createPackageFragmentProvider$1 = new BuiltInsLoaderImpl$createPackageFragmentProvider$1(1, this.b, BuiltInsResourceLoader.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
        Intrinsics.h(packageFqNames, "packageFqNames");
        ArrayList arrayList = new ArrayList();
        for (FqName fqName : packageFqNames) {
            BuiltInSerializerProtocol.m.getClass();
            InputStream inputStream = (InputStream) builtInsLoaderImpl$createPackageFragmentProvider$1.invoke(BuiltInSerializerProtocol.a(fqName));
            BuiltInsPackageFragmentImpl builtInsPackageFragmentImplA = inputStream != null ? BuiltInsPackageFragmentImpl.Companion.a(fqName, lockBasedStorageManager, builtInsModule, inputStream) : null;
            if (builtInsPackageFragmentImplA != null) {
                arrayList.add(builtInsPackageFragmentImplA);
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, builtInsModule);
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProviderImpl);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.m;
        DeserializationComponents deserializationComponents = new DeserializationComponents(lockBasedStorageManager, builtInsModule, deserializedClassDataFinder, new AnnotationAndConstantLoaderImpl(builtInsModule, notFoundClasses, builtInSerializerProtocol), packageFragmentProviderImpl, classDescriptorFactories, notFoundClasses, additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.f24561a, null, new SamConversionResolverImpl(lockBasedStorageManager), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BuiltInsPackageFragmentImpl) it.next()).I0(deserializationComponents);
        }
        return packageFragmentProviderImpl;
    }
}
