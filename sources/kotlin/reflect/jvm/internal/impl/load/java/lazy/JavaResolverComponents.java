package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.CompositeSyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* loaded from: classes.dex */
public final class JavaResolverComponents {

    /* renamed from: a, reason: collision with root package name */
    public final StorageManager f24422a;
    public final JavaClassFinder b;
    public final KotlinClassFinder c;
    public final DeserializedDescriptorResolver d;
    public final SignaturePropagator e;
    public final ErrorReporter f;
    public final JavaResolverCache g;
    public final JavaPropertyInitializerEvaluator h;
    public final SamConversionResolver i;
    public final JavaSourceElementFactory j;
    public final ModuleClassResolver k;
    public final PackagePartProvider l;
    public final SupertypeLoopChecker m;
    public final LookupTracker n;
    public final ModuleDescriptor o;
    public final ReflectionTypes p;
    public final AnnotationTypeQualifierResolver q;
    public final SignatureEnhancement r;
    public final JavaClassesTracker s;
    public final JavaResolverSettings t;
    public final NewKotlinTypeChecker u;
    public final JavaTypeEnhancementState v;
    public final JavaModuleAnnotationsProvider w;
    public final SyntheticJavaPartsProvider x;

    public JavaResolverComponents(StorageManager storageManager, JavaClassFinder finder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory sourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor module, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings settings, NewKotlinTypeChecker kotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleResolver) {
        SyntheticJavaPartsProvider.f24549a.getClass();
        Intrinsics.h(storageManager, "storageManager");
        Intrinsics.h(finder, "finder");
        Intrinsics.h(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.h(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.h(signaturePropagator, "signaturePropagator");
        Intrinsics.h(errorReporter, "errorReporter");
        Intrinsics.h(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        Intrinsics.h(samConversionResolver, "samConversionResolver");
        Intrinsics.h(sourceElementFactory, "sourceElementFactory");
        Intrinsics.h(moduleClassResolver, "moduleClassResolver");
        Intrinsics.h(packagePartProvider, "packagePartProvider");
        Intrinsics.h(supertypeLoopChecker, "supertypeLoopChecker");
        Intrinsics.h(lookupTracker, "lookupTracker");
        Intrinsics.h(module, "module");
        Intrinsics.h(reflectionTypes, "reflectionTypes");
        Intrinsics.h(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        Intrinsics.h(signatureEnhancement, "signatureEnhancement");
        Intrinsics.h(javaClassesTracker, "javaClassesTracker");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.h(javaTypeEnhancementState, "javaTypeEnhancementState");
        Intrinsics.h(javaModuleResolver, "javaModuleResolver");
        CompositeSyntheticJavaPartsProvider syntheticPartsProvider = SyntheticJavaPartsProvider.Companion.b;
        Intrinsics.h(syntheticPartsProvider, "syntheticPartsProvider");
        this.f24422a = storageManager;
        this.b = finder;
        this.c = kotlinClassFinder;
        this.d = deserializedDescriptorResolver;
        this.e = signaturePropagator;
        this.f = errorReporter;
        this.g = JavaResolverCache.f24419a;
        this.h = javaPropertyInitializerEvaluator;
        this.i = samConversionResolver;
        this.j = sourceElementFactory;
        this.k = moduleClassResolver;
        this.l = packagePartProvider;
        this.m = supertypeLoopChecker;
        this.n = lookupTracker;
        this.o = module;
        this.p = reflectionTypes;
        this.q = annotationTypeQualifierResolver;
        this.r = signatureEnhancement;
        this.s = javaClassesTracker;
        this.t = settings;
        this.u = kotlinTypeChecker;
        this.v = javaTypeEnhancementState;
        this.w = javaModuleResolver;
        this.x = syntheticPartsProvider;
    }
}
