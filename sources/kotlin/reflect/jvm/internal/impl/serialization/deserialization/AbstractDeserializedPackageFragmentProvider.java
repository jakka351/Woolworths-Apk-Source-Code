package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* loaded from: classes.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f24563a;
    public final ModuleDescriptorImpl b;
    public DeserializationComponents c;
    public final MemoizedFunctionToNullable d;

    public AbstractDeserializedPackageFragmentProvider(LockBasedStorageManager lockBasedStorageManager, ReflectKotlinClassFinder reflectKotlinClassFinder, ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f24563a = lockBasedStorageManager;
        this.b = moduleDescriptorImpl;
        this.d = lockBasedStorageManager.b(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider$$Lambda$0
            public final AbstractDeserializedPackageFragmentProvider d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FqName fqName = (FqName) obj;
                Intrinsics.h(fqName, "fqName");
                AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider = this.d;
                BuiltInsPackageFragmentImpl builtInsPackageFragmentImplD = abstractDeserializedPackageFragmentProvider.d(fqName);
                if (builtInsPackageFragmentImplD == null) {
                    return null;
                }
                DeserializationComponents deserializationComponents = abstractDeserializedPackageFragmentProvider.c;
                if (deserializationComponents != null) {
                    builtInsPackageFragmentImplD.I0(deserializationComponents);
                    return builtInsPackageFragmentImplD;
                }
                Intrinsics.p("components");
                throw null;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final List a(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        return CollectionsKt.S(this.d.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean b(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        MemoizedFunctionToNullable memoizedFunctionToNullable = this.d;
        return (memoizedFunctionToNullable.h(fqName) ? (PackageFragmentDescriptor) memoizedFunctionToNullable.invoke(fqName) : d(fqName)) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void c(FqName fqName, ArrayList arrayList) {
        Intrinsics.h(fqName, "fqName");
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, this.d.invoke(fqName));
    }

    public abstract BuiltInsPackageFragmentImpl d(FqName fqName);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final Collection r(FqName fqName, Function1 function1) {
        Intrinsics.h(fqName, "fqName");
        return EmptySet.d;
    }
}
