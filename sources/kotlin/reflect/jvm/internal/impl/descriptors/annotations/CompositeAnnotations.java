package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CompositeAnnotations implements Annotations {
    public final List d;

    public CompositeAnnotations(List list) {
        this.d = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final AnnotationDescriptor H(final FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        return (AnnotationDescriptor) SequencesKt.i(SequencesKt.s(CollectionsKt.n(this.d), new Function1(fqName) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$$Lambda$0
            public final FqName d;

            {
                this.d = fqName;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Annotations it = (Annotations) obj;
                Intrinsics.h(it, "it");
                return it.H(this.d);
            }
        }));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        List list = this.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return new FlatteningSequence.AnonymousClass1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean m2(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        Iterator it = CollectionsKt.n(this.d).f24253a.iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).m2(fqName)) {
                return true;
            }
        }
        return false;
    }

    public CompositeAnnotations(Annotations... annotationsArr) {
        this.d = ArraysKt.l0(annotationsArr);
    }
}
