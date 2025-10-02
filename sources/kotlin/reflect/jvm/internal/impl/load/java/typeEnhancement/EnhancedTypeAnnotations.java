package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes7.dex */
final class EnhancedTypeAnnotations implements Annotations {
    public final FqName d;

    public EnhancedTypeAnnotations(FqName fqNameToMatch) {
        Intrinsics.h(fqNameToMatch, "fqNameToMatch");
        this.d = fqNameToMatch;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final AnnotationDescriptor H(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        if (fqName.equals(this.d)) {
            return EnhancedTypeAnnotationDescriptor.f24443a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return EmptyIterator.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean m2(FqName fqName) {
        return Annotations.DefaultImpls.b(this, fqName);
    }
}
