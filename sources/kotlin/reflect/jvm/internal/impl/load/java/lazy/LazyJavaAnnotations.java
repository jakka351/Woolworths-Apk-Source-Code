package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.woolworths.scanlibrary.domain.productsearch.a;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TransformingSequence;

/* loaded from: classes.dex */
public final class LazyJavaAnnotations implements Annotations {
    public final LazyJavaResolverContext d;
    public final JavaAnnotationOwner e;
    public final boolean f;
    public final MemoizedFunctionToNullable g;

    public LazyJavaAnnotations(LazyJavaResolverContext c, JavaAnnotationOwner annotationOwner, boolean z) {
        Intrinsics.h(c, "c");
        Intrinsics.h(annotationOwner, "annotationOwner");
        this.d = c;
        this.e = annotationOwner;
        this.f = z;
        this.g = c.f24425a.f24422a.b(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations$$Lambda$0
            public final LazyJavaAnnotations d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                JavaAnnotation annotation = (JavaAnnotation) obj;
                Intrinsics.h(annotation, "annotation");
                Name name = JavaAnnotationMapper.f24416a;
                LazyJavaAnnotations lazyJavaAnnotations = this.d;
                return JavaAnnotationMapper.b(lazyJavaAnnotations.d, annotation, lazyJavaAnnotations.f);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final AnnotationDescriptor H(FqName fqName) {
        AnnotationDescriptor annotationDescriptor;
        Intrinsics.h(fqName, "fqName");
        JavaAnnotationOwner javaAnnotationOwner = this.e;
        JavaAnnotation javaAnnotationH = javaAnnotationOwner.H(fqName);
        if (javaAnnotationH != null && (annotationDescriptor = (AnnotationDescriptor) this.g.invoke(javaAnnotationH)) != null) {
            return annotationDescriptor;
        }
        Name name = JavaAnnotationMapper.f24416a;
        return JavaAnnotationMapper.a(fqName, javaAnnotationOwner, this.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return this.e.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        JavaAnnotationOwner javaAnnotationOwner = this.e;
        TransformingSequence transformingSequenceR = SequencesKt.r(CollectionsKt.n(javaAnnotationOwner.getAnnotations()), this.g);
        Name name = JavaAnnotationMapper.f24416a;
        return SequencesKt.h(SequencesKt.u(transformingSequenceR, JavaAnnotationMapper.a(StandardNames.FqNames.m, javaAnnotationOwner, this.d)), new a(26)).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean m2(FqName fqName) {
        return Annotations.DefaultImpls.b(this, fqName);
    }
}
