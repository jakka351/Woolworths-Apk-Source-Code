package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {
    public final LockBasedStorageManager f;
    public final KotlinBuiltIns g;
    public final Map h;
    public final PackageViewDescriptorFactory i;
    public ModuleDependenciesImpl j;
    public PackageFragmentProvider k;
    public final boolean l;
    public final MemoizedFunctionToNotNull m;
    public final Lazy n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(Name moduleName, LockBasedStorageManager lockBasedStorageManager, KotlinBuiltIns kotlinBuiltIns, int i) {
        super(Annotations.Companion.f24350a, moduleName);
        Map map = EmptyMap.d;
        Intrinsics.h(moduleName, "moduleName");
        this.f = lockBasedStorageManager;
        this.g = kotlinBuiltIns;
        if (!moduleName.e) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.h = map;
        PackageViewDescriptorFactory.f24361a.getClass();
        PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) T(PackageViewDescriptorFactory.Companion.b);
        this.i = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.b : packageViewDescriptorFactory;
        this.l = true;
        this.m = lockBasedStorageManager.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$$Lambda$0
            public final ModuleDescriptorImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FqName fqName = (FqName) obj;
                Intrinsics.h(fqName, "fqName");
                ModuleDescriptorImpl moduleDescriptorImpl = this.d;
                return moduleDescriptorImpl.i.a(moduleDescriptorImpl, fqName, moduleDescriptorImpl.f);
            }
        });
        this.n = LazyKt.b(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$$Lambda$1
            public final ModuleDescriptorImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModuleDescriptorImpl moduleDescriptorImpl = this.d;
                ModuleDependenciesImpl moduleDependenciesImpl = moduleDescriptorImpl.j;
                if (moduleDependenciesImpl == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = moduleDescriptorImpl.getName().d;
                    Intrinsics.g(str, "toString(...)");
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                List list = moduleDependenciesImpl.f24360a;
                if (!moduleDescriptorImpl.l) {
                    InvalidModuleExceptionKt.a(moduleDescriptorImpl);
                }
                list.contains(moduleDescriptorImpl);
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((ModuleDescriptorImpl) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it2.next()).k;
                    Intrinsics.e(packageFragmentProvider);
                    arrayList.add(packageFragmentProvider);
                }
                return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl.getName());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final boolean B(ModuleDescriptor targetModule) {
        Intrinsics.h(targetModule, "targetModule");
        if (equals(targetModule)) {
            return true;
        }
        Intrinsics.e(this.j);
        if (CollectionsKt.t(EmptySet.d, targetModule)) {
            return true;
        }
        O();
        return targetModule.O().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final PackageViewDescriptor L(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        if (!this.l) {
            InvalidModuleExceptionKt.a(this);
        }
        return (PackageViewDescriptor) this.m.invoke(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final List O() {
        if (this.j != null) {
            return EmptyList.d;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().d;
        Intrinsics.g(str, "toString(...)");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final Object T(ModuleCapability capability) {
        Intrinsics.h(capability, "capability");
        Object obj = this.h.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.g(obj, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor e() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final KotlinBuiltIns p() {
        return this.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final Collection r(FqName fqName, Function1 function1) {
        Intrinsics.h(fqName, "fqName");
        boolean z = this.l;
        if (!z) {
            InvalidModuleExceptionKt.a(this);
        }
        if (!z) {
            InvalidModuleExceptionKt.a(this);
        }
        return ((CompositePackageFragmentProvider) this.n.getD()).r(fqName, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeclarationDescriptorImpl.o0(this));
        if (!this.l) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        PackageFragmentProvider packageFragmentProvider = this.k;
        sb.append(packageFragmentProvider != null ? packageFragmentProvider.getClass().getSimpleName() : null);
        return sb.toString();
    }
}
