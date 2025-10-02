package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void a(ClassDescriptor thisDescriptor, Name name, ArrayList arrayList, LazyJavaResolverContext c) {
        Intrinsics.h(thisDescriptor, "thisDescriptor");
        Intrinsics.h(name, "name");
        Intrinsics.h(c, "c");
        Iterator<E> it = EmptyList.d.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).a(thisDescriptor, name, arrayList, c);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final PropertyDescriptorImpl b(ClassDescriptor classDescriptor, PropertyDescriptorImpl propertyDescriptor, LazyJavaResolverContext c) {
        Intrinsics.h(propertyDescriptor, "propertyDescriptor");
        Intrinsics.h(c, "c");
        Iterator<E> it = EmptyList.d.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((SyntheticJavaPartsProvider) it.next()).b(classDescriptor, propertyDescriptor, c);
        }
        return propertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void c(ClassDescriptor thisDescriptor, ArrayList arrayList, LazyJavaResolverContext c) {
        Intrinsics.h(thisDescriptor, "thisDescriptor");
        Intrinsics.h(c, "c");
        Iterator<E> it = EmptyList.d.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).c(thisDescriptor, arrayList, c);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void d(ClassDescriptor thisDescriptor, Name name, ListBuilder listBuilder, LazyJavaResolverContext c) {
        Intrinsics.h(thisDescriptor, "thisDescriptor");
        Intrinsics.h(name, "name");
        Intrinsics.h(c, "c");
        Iterator<E> it = EmptyList.d.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).d(thisDescriptor, name, listBuilder, c);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final ArrayList e(ClassDescriptor thisDescriptor, LazyJavaResolverContext c) {
        Intrinsics.h(thisDescriptor, "thisDescriptor");
        Intrinsics.h(c, "c");
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = EmptyList.d.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((SyntheticJavaPartsProvider) it.next()).e(thisDescriptor, c), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final ArrayList f(ClassDescriptor thisDescriptor, LazyJavaResolverContext c) {
        Intrinsics.h(thisDescriptor, "thisDescriptor");
        Intrinsics.h(c, "c");
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = EmptyList.d.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((SyntheticJavaPartsProvider) it.next()).f(thisDescriptor, c), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void g(ClassDescriptor thisDescriptor, Name name, ArrayList arrayList, LazyJavaResolverContext c) {
        Intrinsics.h(thisDescriptor, "thisDescriptor");
        Intrinsics.h(name, "name");
        Intrinsics.h(c, "c");
        Iterator<E> it = EmptyList.d.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).g(thisDescriptor, name, arrayList, c);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final ArrayList h(ClassDescriptor thisDescriptor, LazyJavaResolverContext c) {
        Intrinsics.h(thisDescriptor, "thisDescriptor");
        Intrinsics.h(c, "c");
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = EmptyList.d.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((SyntheticJavaPartsProvider) it.next()).h(thisDescriptor, c), arrayList);
        }
        return arrayList;
    }
}
