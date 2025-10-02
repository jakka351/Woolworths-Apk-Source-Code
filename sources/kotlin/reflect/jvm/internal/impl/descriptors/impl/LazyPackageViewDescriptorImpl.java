package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

@SourceDebugExtension
/* loaded from: classes.dex */
public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {
    public static final /* synthetic */ KProperty[] k;
    public final ModuleDescriptorImpl f;
    public final FqName g;
    public final NotNullLazyValue h;
    public final NotNullLazyValue i;
    public final LazyScopeAdapter j;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(LazyPackageViewDescriptorImpl.class, "fragments", "getFragments()Ljava/util/List;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        k = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(LazyPackageViewDescriptorImpl.class, "empty", "getEmpty()Z", 0, reflectionFactory)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyPackageViewDescriptorImpl(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName, StorageManager storageManager) {
        Intrinsics.h(fqName, "fqName");
        Intrinsics.h(storageManager, "storageManager");
        FqNameUnsafe fqNameUnsafe = fqName.f24500a;
        super(Annotations.Companion.f24350a, fqNameUnsafe.c() ? FqNameUnsafe.e : fqNameUnsafe.f());
        this.f = moduleDescriptorImpl;
        this.g = fqName;
        this.h = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$$Lambda$0
            public final LazyPackageViewDescriptorImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.d;
                ModuleDescriptorImpl moduleDescriptorImpl2 = lazyPackageViewDescriptorImpl.f;
                if (!moduleDescriptorImpl2.l) {
                    InvalidModuleExceptionKt.a(moduleDescriptorImpl2);
                }
                return PackageFragmentProviderKt.c((CompositePackageFragmentProvider) moduleDescriptorImpl2.n.getD(), lazyPackageViewDescriptorImpl.g);
            }
        });
        this.i = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$$Lambda$1
            public final LazyPackageViewDescriptorImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.d;
                ModuleDescriptorImpl moduleDescriptorImpl2 = lazyPackageViewDescriptorImpl.f;
                if (!moduleDescriptorImpl2.l) {
                    InvalidModuleExceptionKt.a(moduleDescriptorImpl2);
                }
                return Boolean.valueOf(PackageFragmentProviderKt.b((CompositePackageFragmentProvider) moduleDescriptorImpl2.n.getD(), lazyPackageViewDescriptorImpl.g));
            }
        });
        this.j = new LazyScopeAdapter(storageManager, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$$Lambda$2
            public final LazyPackageViewDescriptorImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = LazyPackageViewDescriptorImpl.k;
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.d;
                boolean zIsEmpty = lazyPackageViewDescriptorImpl.isEmpty();
                FqName fqName2 = lazyPackageViewDescriptorImpl.g;
                ModuleDescriptorImpl moduleDescriptorImpl2 = lazyPackageViewDescriptorImpl.f;
                if (zIsEmpty) {
                    return MemberScope.Empty.b;
                }
                List listK = lazyPackageViewDescriptorImpl.K();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(listK, 10));
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PackageFragmentDescriptor) it.next()).s());
                }
                return ChainedMemberScope.Companion.a(CollectionsKt.d0(new SubpackagesScope(moduleDescriptorImpl2, fqName2), arrayList), "package view scope for " + fqName2 + " in " + moduleDescriptorImpl2.getName());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public final ModuleDescriptorImpl C0() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public final List K() {
        return (List) StorageKt.a(this.h, k[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.e(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public final FqName d() {
        return this.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor e() {
        FqName fqName = this.g;
        if (fqName.f24500a.c()) {
            return null;
        }
        return this.f.L(fqName.b());
    }

    public final boolean equals(Object obj) {
        PackageViewDescriptor packageViewDescriptor = obj instanceof PackageViewDescriptor ? (PackageViewDescriptor) obj : null;
        return packageViewDescriptor != null && Intrinsics.c(this.g, packageViewDescriptor.d()) && Intrinsics.c(this.f, packageViewDescriptor.C0());
    }

    public final int hashCode() {
        return this.g.hashCode() + (this.f.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public final boolean isEmpty() {
        return ((Boolean) StorageKt.a(this.i, k[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public final MemberScope s() {
        return this.j;
    }
}
