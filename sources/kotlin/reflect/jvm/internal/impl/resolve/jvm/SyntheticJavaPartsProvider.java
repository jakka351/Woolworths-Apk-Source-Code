package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes.dex */
public interface SyntheticJavaPartsProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f24549a = Companion.f24550a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f24550a = new Companion();
        public static final CompositeSyntheticJavaPartsProvider b = new CompositeSyntheticJavaPartsProvider();
    }

    void a(ClassDescriptor classDescriptor, Name name, ArrayList arrayList, LazyJavaResolverContext lazyJavaResolverContext);

    PropertyDescriptorImpl b(ClassDescriptor classDescriptor, PropertyDescriptorImpl propertyDescriptorImpl, LazyJavaResolverContext lazyJavaResolverContext);

    void c(ClassDescriptor classDescriptor, ArrayList arrayList, LazyJavaResolverContext lazyJavaResolverContext);

    void d(ClassDescriptor classDescriptor, Name name, ListBuilder listBuilder, LazyJavaResolverContext lazyJavaResolverContext);

    ArrayList e(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    ArrayList f(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    void g(ClassDescriptor classDescriptor, Name name, ArrayList arrayList, LazyJavaResolverContext lazyJavaResolverContext);

    ArrayList h(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);
}
