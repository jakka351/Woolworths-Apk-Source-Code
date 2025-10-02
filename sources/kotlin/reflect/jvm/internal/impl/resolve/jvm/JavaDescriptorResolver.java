package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public final class JavaDescriptorResolver {

    /* renamed from: a, reason: collision with root package name */
    public final LazyJavaPackageFragmentProvider f24547a;
    public final JavaResolverCache b = JavaResolverCache.f24419a;

    public JavaDescriptorResolver(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider) {
        this.f24547a = lazyJavaPackageFragmentProvider;
    }

    public final ClassDescriptor a(JavaClass javaClass) {
        LazyJavaPackageFragment lazyJavaPackageFragment;
        FqName fqNameD = javaClass.d();
        if (fqNameD != null) {
            LightClassOriginKind[] lightClassOriginKindArr = LightClassOriginKind.d;
        }
        ReflectJavaClass reflectJavaClassU = javaClass.u();
        if (reflectJavaClassU != null) {
            ClassDescriptor classDescriptorA = a(reflectJavaClassU);
            MemberScope memberScopeG = classDescriptorA != null ? classDescriptorA.G() : null;
            ClassifierDescriptor classifierDescriptorF = memberScopeG != null ? memberScopeG.f(javaClass.getName(), NoLookupLocation.k) : null;
            if (classifierDescriptorF instanceof ClassDescriptor) {
                return (ClassDescriptor) classifierDescriptorF;
            }
        } else if (fqNameD != null && (lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.F(this.f24547a.a(fqNameD.b()))) != null) {
            LazyJavaPackageScope lazyJavaPackageScope = lazyJavaPackageFragment.n.d;
            lazyJavaPackageScope.getClass();
            return lazyJavaPackageScope.v(javaClass.getName(), javaClass);
        }
        return null;
    }
}
