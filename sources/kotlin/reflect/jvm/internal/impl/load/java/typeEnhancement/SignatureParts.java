package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

@SourceDebugExtension
/* loaded from: classes7.dex */
final class SignatureParts extends AbstractSignatureParts<AnnotationDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    public final Annotated f24454a;
    public final boolean b;
    public final LazyJavaResolverContext c;
    public final AnnotationQualifierApplicabilityType d;
    public final boolean e;

    public SignatureParts(Annotated annotated, boolean z, LazyJavaResolverContext containerContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        Intrinsics.h(containerContext, "containerContext");
        this.f24454a = annotated;
        this.b = z;
        this.c = containerContext;
        this.d = annotationQualifierApplicabilityType;
        this.e = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean c(Object obj, KotlinTypeMarker kotlinTypeMarker) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        if ((annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) && ((PossiblyExternalAnnotationDescriptor) annotationDescriptor).a()) {
            return true;
        }
        if (annotationDescriptor instanceof LazyJavaAnnotationDescriptor) {
            l();
            if (((LazyJavaAnnotationDescriptor) annotationDescriptor).h || this.d == AnnotationQualifierApplicabilityType.i) {
                return true;
            }
        }
        if (kotlinTypeMarker == null || !KotlinBuiltIns.G((KotlinType) kotlinTypeMarker) || !d().i(annotationDescriptor)) {
            return false;
        }
        this.c.f24425a.t.getClass();
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final Annotations e(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final Iterable g() {
        Annotations annotations;
        Annotated annotated = this.f24454a;
        return (annotated == null || (annotations = annotated.getAnnotations()) == null) ? EmptyList.d : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final AnnotationQualifierApplicabilityType h() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final JavaTypeQualifiersByElementType i() {
        return (JavaTypeQualifiersByElementType) this.c.c.getD();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean j() {
        Annotated annotated = this.f24454a;
        return (annotated instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) annotated).y0() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final NullabilityQualifierWithMigrationStatus k(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus) {
        if (nullabilityQualifierWithMigrationStatus != null) {
            return NullabilityQualifierWithMigrationStatus.a(nullabilityQualifierWithMigrationStatus, NullabilityQualifier.f, false, 2);
        }
        if (javaDefaultQualifiers != null) {
            return javaDefaultQualifiers.f24399a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean l() {
        this.c.f24425a.t.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final KotlinType m(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        return TypeWithEnhancementKt.a((KotlinType) kotlinTypeMarker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final FqNameUnsafe n(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.h(rigidTypeMarker, "<this>");
        ErrorType errorType = TypeUtils.f24621a;
        ClassifierDescriptor classifierDescriptorC = ((KotlinType) rigidTypeMarker).J0().c();
        ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
        if (classDescriptor != null) {
            return DescriptorUtils.g(classDescriptor);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean p() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean q(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        KotlinType kotlinType = (KotlinType) kotlinTypeMarker;
        return KotlinBuiltIns.z(kotlinType) || KotlinBuiltIns.G(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean r() {
        return this.b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean s(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker other) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        Intrinsics.h(other, "other");
        return this.c.f24425a.u.a((KotlinType) kotlinTypeMarker, (KotlinType) other);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean t(TypeParameterMarker typeParameterMarker) {
        Intrinsics.h(typeParameterMarker, "<this>");
        return typeParameterMarker instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean u(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).M0() instanceof NotNullTypeParameterImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final AnnotationTypeQualifierResolver d() {
        return this.c.f24425a.q;
    }

    public /* synthetic */ SignatureParts(Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        this(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, false);
    }
}
