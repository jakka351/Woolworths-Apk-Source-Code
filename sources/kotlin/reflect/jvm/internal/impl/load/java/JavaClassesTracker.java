package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;

/* loaded from: classes.dex */
public interface JavaClassesTracker {

    public static final class Default implements JavaClassesTracker {

        /* renamed from: a, reason: collision with root package name */
        public static final Default f24398a = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        public final void a(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        }
    }

    void a(LazyJavaClassDescriptor lazyJavaClassDescriptor);
}
