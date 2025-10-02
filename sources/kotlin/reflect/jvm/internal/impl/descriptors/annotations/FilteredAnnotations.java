package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FilteredAnnotations implements Annotations {
    public final Annotations d;
    public final Function1 e;

    public FilteredAnnotations(Annotations annotations, Function1 function1) {
        this.d = annotations;
        this.e = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final AnnotationDescriptor H(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        if (((Boolean) this.e.invoke(fqName)).booleanValue()) {
            return this.d.H(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        Annotations annotations = this.d;
        if ((annotations instanceof Collection) && ((Collection) annotations).isEmpty()) {
            return false;
        }
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            FqName fqNameD = it.next().d();
            if (fqNameD != null && ((Boolean) this.e.invoke(fqNameD)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : this.d) {
            FqName fqNameD = annotationDescriptor.d();
            if (fqNameD != null && ((Boolean) this.e.invoke(fqNameD)).booleanValue()) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean m2(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        if (((Boolean) this.e.invoke(fqName)).booleanValue()) {
            return this.d.m2(fqName);
        }
        return false;
    }
}
