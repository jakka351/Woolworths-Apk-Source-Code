package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeErrorReporter;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;

/* loaded from: classes.dex */
public final class DeserializationComponentsForJava {

    /* renamed from: a, reason: collision with root package name */
    public final DeserializationComponents f24467a;

    public static final class Companion {

        public static final class ModuleData {
        }
    }

    public DeserializationComponentsForJava(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptorImpl moduleDescriptorImpl, JavaClassDataFinder javaClassDataFinder, BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, NotFoundClasses notFoundClasses, NewKotlinTypeChecker kotlinTypeChecker, TypeAttributeTranslators typeAttributeTranslators) {
        PlatformDependentDeclarationFilter platformDependentDeclarationFilterM;
        AdditionalClassPartsProvider additionalClassPartsProviderM;
        Intrinsics.h(kotlinTypeChecker, "kotlinTypeChecker");
        KotlinBuiltIns kotlinBuiltIns = moduleDescriptorImpl.g;
        JvmBuiltIns jvmBuiltIns = kotlinBuiltIns instanceof JvmBuiltIns ? (JvmBuiltIns) kotlinBuiltIns : null;
        this.f24467a = new DeserializationComponents(lockBasedStorageManager, moduleDescriptorImpl, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider, RuntimeErrorReporter.b, JavaFlexibleTypeDeserializer.f24470a, EmptyList.d, notFoundClasses, (jvmBuiltIns == null || (additionalClassPartsProviderM = jvmBuiltIns.M()) == null) ? AdditionalClassPartsProvider.None.f24352a : additionalClassPartsProviderM, (jvmBuiltIns == null || (platformDependentDeclarationFilterM = jvmBuiltIns.M()) == null) ? PlatformDependentDeclarationFilter.NoPlatformDependent.f24354a : platformDependentDeclarationFilterM, JvmProtoBufUtil.f24497a, kotlinTypeChecker, new SamConversionResolverImpl(lockBasedStorageManager), typeAttributeTranslators.f24635a, JvmEnumEntriesDeserializationSupport.f24578a);
    }
}
