package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* loaded from: classes.dex */
public final class DeserializationComponents {

    /* renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f24570a;
    public final ModuleDescriptor b;
    public final DeserializationConfiguration.Default c;
    public final ClassDataFinder d;
    public final AnnotationAndConstantLoader e;
    public final PackageFragmentProviderOptimized f;
    public final LocalClassifierTypeSettings.Default g;
    public final ErrorReporter h;
    public final LookupTracker.DO_NOTHING i;
    public final FlexibleTypeDeserializer j;
    public final Iterable k;
    public final NotFoundClasses l;
    public final ContractDeserializer$Companion$DEFAULT$1 m;
    public final AdditionalClassPartsProvider n;
    public final PlatformDependentDeclarationFilter o;
    public final ExtensionRegistryLite p;
    public final NewKotlinTypeChecker q;
    public final List r;
    public final EnumEntriesDeserializationSupport s;
    public final ClassDeserializer t;

    public DeserializationComponents(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor moduleDescriptor, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProviderOptimized packageFragmentProviderOptimized, ErrorReporter errorReporter, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable fictitiousClassDescriptorFactories, NotFoundClasses notFoundClasses, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker kotlinTypeChecker, SamConversionResolverImpl samConversionResolverImpl, List list, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport) {
        Intrinsics.h(moduleDescriptor, "moduleDescriptor");
        Intrinsics.h(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.h(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.h(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.h(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.h(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f24570a = lockBasedStorageManager;
        this.b = moduleDescriptor;
        this.c = DeserializationConfiguration.Default.f24571a;
        this.d = classDataFinder;
        this.e = annotationAndConstantLoader;
        this.f = packageFragmentProviderOptimized;
        this.g = LocalClassifierTypeSettings.Default.f24579a;
        this.h = errorReporter;
        this.i = LookupTracker.DO_NOTHING.f24392a;
        this.j = flexibleTypeDeserializer;
        this.k = fictitiousClassDescriptorFactories;
        this.l = notFoundClasses;
        this.m = ContractDeserializer.Companion.f24569a;
        this.n = additionalClassPartsProvider;
        this.o = platformDependentDeclarationFilter;
        this.p = extensionRegistryLite;
        this.q = kotlinTypeChecker;
        this.r = list;
        this.s = enumEntriesDeserializationSupport;
        this.t = new ClassDeserializer(this);
    }

    public final DeserializationContext a(PackageFragmentDescriptor packageFragmentDescriptor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource) {
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(metadataVersion, "metadataVersion");
        return new DeserializationContext(this, nameResolver, packageFragmentDescriptor, typeTable, versionRequirementTable, metadataVersion, deserializedContainerSource, null, EmptyList.d);
    }

    public final ClassDescriptor b(ClassId classId) {
        Intrinsics.h(classId, "classId");
        Set set = ClassDeserializer.c;
        return this.t.a(classId, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializationComponents(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor moduleDescriptor, DeserializedClassDataFinder deserializedClassDataFinder, AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl, PackageFragmentProviderOptimized packageFragmentProviderOptimized, Iterable iterable, NotFoundClasses notFoundClasses, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker newKotlinTypeChecker, SamConversionResolverImpl samConversionResolverImpl, int i) {
        NewKotlinTypeChecker newKotlinTypeChecker2;
        EnumEntriesDeserializationSupport enumEntriesDeserializationSupport;
        if ((i & 65536) != 0) {
            NewKotlinTypeChecker.b.getClass();
            newKotlinTypeChecker2 = NewKotlinTypeChecker.Companion.b;
        } else {
            newKotlinTypeChecker2 = newKotlinTypeChecker;
        }
        List listQ = CollectionsKt.Q(DefaultTypeAttributeTranslator.f24604a);
        if ((i & 524288) != 0) {
            enumEntriesDeserializationSupport = EnumEntriesDeserializationSupport.Default.f24574a;
        } else {
            enumEntriesDeserializationSupport = JvmEnumEntriesDeserializationSupport.f24578a;
        }
        this(lockBasedStorageManager, moduleDescriptor, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProviderOptimized, ErrorReporter.f24575a, FlexibleTypeDeserializer.ThrowException.f24576a, iterable, notFoundClasses, additionalClassPartsProvider, platformDependentDeclarationFilter, extensionRegistryLite, newKotlinTypeChecker2, samConversionResolverImpl, listQ, enumEntriesDeserializationSupport);
    }
}
