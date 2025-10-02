package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependenciesImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.PackagePartScopeCache;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinder;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeErrorReporter;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ModuleByClassLoaderKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f24291a = new ConcurrentHashMap();

    public static final RuntimeModuleData a(Class cls) {
        Intrinsics.h(cls, "<this>");
        ClassLoader classLoaderD = ReflectClassUtilKt.d(cls);
        WeakClassLoaderBox weakClassLoaderBox = new WeakClassLoaderBox(classLoaderD);
        ConcurrentHashMap concurrentHashMap = f24291a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(weakClassLoaderBox);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = (RuntimeModuleData) weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentHashMap.remove(weakClassLoaderBox, weakReference);
        }
        ReflectKotlinClassFinder reflectKotlinClassFinder = new ReflectKotlinClassFinder(classLoaderD);
        ClassLoader classLoader = Unit.class.getClassLoader();
        Intrinsics.g(classLoader, "getClassLoader(...)");
        ReflectKotlinClassFinder reflectKotlinClassFinder2 = new ReflectKotlinClassFinder(classLoader);
        ReflectJavaClassFinder reflectJavaClassFinder = new ReflectJavaClassFinder(classLoaderD);
        String moduleName = "runtime module for " + classLoaderD;
        Intrinsics.h(moduleName, "moduleName");
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
        JvmBuiltIns.Kind[] kindArr = JvmBuiltIns.Kind.d;
        JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager);
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(Name.l("<" + moduleName + '>'), lockBasedStorageManager, jvmBuiltIns, 56);
        jvmBuiltIns.L(moduleDescriptorImpl);
        jvmBuiltIns.N(moduleDescriptorImpl);
        DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
        SingleModuleClassResolver singleModuleClassResolver = new SingleModuleClassResolver();
        NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
        SamConversionResolverImpl samConversionResolverImpl = new SamConversionResolverImpl(lockBasedStorageManager);
        ReflectionTypes reflectionTypes = new ReflectionTypes(moduleDescriptorImpl, notFoundClasses);
        JavaTypeEnhancementState javaTypeEnhancementState = JavaTypeEnhancementState.d;
        Intrinsics.h(javaTypeEnhancementState, "javaTypeEnhancementState");
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = new AnnotationTypeQualifierResolver(javaTypeEnhancementState);
        SignatureEnhancement signatureEnhancement = new SignatureEnhancement(new JavaTypeEnhancement());
        NewKotlinTypeChecker.b.getClass();
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.b;
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(new JavaResolverComponents(lockBasedStorageManager, reflectJavaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, SignaturePropagator.f24420a, RuntimeErrorReporter.b, JavaPropertyInitializerEvaluator.DoNothing.f24418a, samConversionResolverImpl, RuntimeSourceElementFactory.f24370a, singleModuleClassResolver, PackagePartProvider.Empty.f24475a, SupertypeLoopChecker.EMPTY.f24345a, LookupTracker.DO_NOTHING.f24392a, moduleDescriptorImpl, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, JavaClassesTracker.Default.f24398a, JavaResolverSettings.Default.f24423a, newKotlinTypeCheckerImpl, javaTypeEnhancementState, new DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1()));
        MetadataVersion metadataVersion = MetadataVersion.g;
        Intrinsics.h(metadataVersion, "metadataVersion");
        JavaClassDataFinder javaClassDataFinder = new JavaClassDataFinder(reflectKotlinClassFinder, deserializedDescriptorResolver);
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(moduleDescriptorImpl, notFoundClasses, lockBasedStorageManager, reflectKotlinClassFinder);
        binaryClassAnnotationAndConstantLoaderImpl.f = metadataVersion;
        DeserializationComponents deserializationComponents = new DeserializationComponentsForJava(lockBasedStorageManager, moduleDescriptorImpl, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider, notFoundClasses, newKotlinTypeCheckerImpl, new TypeAttributeTranslators(CollectionsKt.Q(DefaultTypeAttributeTranslator.f24604a))).f24467a;
        Intrinsics.h(deserializationComponents, "<set-?>");
        deserializedDescriptorResolver.f24468a = deserializationComponents;
        singleModuleClassResolver.f24427a = new JavaDescriptorResolver(lazyJavaPackageFragmentProvider);
        JvmBuiltInsCustomizer additionalClassPartsProvider = jvmBuiltIns.M();
        JvmBuiltInsCustomizer platformDependentDeclarationFilter = jvmBuiltIns.M();
        SamConversionResolverImpl samConversionResolverImpl2 = new SamConversionResolverImpl(lockBasedStorageManager);
        Intrinsics.h(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager, reflectKotlinClassFinder2, moduleDescriptorImpl);
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(jvmBuiltInsPackageFragmentProvider);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.m;
        jvmBuiltInsPackageFragmentProvider.c = new DeserializationComponents(lockBasedStorageManager, moduleDescriptorImpl, deserializedClassDataFinder, new AnnotationAndConstantLoaderImpl(moduleDescriptorImpl, notFoundClasses, builtInSerializerProtocol), jvmBuiltInsPackageFragmentProvider, CollectionsKt.R(new BuiltInFictitiousFunctionClassFactory(lockBasedStorageManager, moduleDescriptorImpl), new JvmBuiltInClassDescriptorFactory(lockBasedStorageManager, moduleDescriptorImpl)), notFoundClasses, additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.f24561a, newKotlinTypeCheckerImpl, samConversionResolverImpl2, 262144);
        moduleDescriptorImpl.j = new ModuleDependenciesImpl(ArraysKt.l0(new ModuleDescriptorImpl[]{moduleDescriptorImpl}));
        moduleDescriptorImpl.k = new CompositePackageFragmentProvider(CollectionsKt.R(lazyJavaPackageFragmentProvider, jvmBuiltInsPackageFragmentProvider), "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl);
        RuntimeModuleData runtimeModuleData2 = new RuntimeModuleData(deserializationComponents, new PackagePartScopeCache(reflectKotlinClassFinder, deserializedDescriptorResolver));
        while (true) {
            WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(weakClassLoaderBox, new WeakReference(runtimeModuleData2));
            if (weakReference2 == null) {
                return runtimeModuleData2;
            }
            RuntimeModuleData runtimeModuleData3 = (RuntimeModuleData) weakReference2.get();
            if (runtimeModuleData3 != null) {
                return runtimeModuleData3;
            }
            concurrentHashMap.remove(weakClassLoaderBox, weakReference2);
        }
    }
}
