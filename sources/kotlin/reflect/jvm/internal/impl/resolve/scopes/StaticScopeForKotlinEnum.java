package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] f;
    public final DeserializedClassDescriptor b;
    public final boolean c;
    public final NotNullLazyValue d;
    public final NotNullLazyValue e;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StaticScopeForKotlinEnum.class, "functions", "getFunctions()Ljava/util/List;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(StaticScopeForKotlinEnum.class, "properties", "getProperties()Ljava/util/List;", 0, reflectionFactory)};
    }

    public StaticScopeForKotlinEnum(LockBasedStorageManager storageManager, DeserializedClassDescriptor deserializedClassDescriptor, boolean z) {
        Intrinsics.h(storageManager, "storageManager");
        this.b = deserializedClassDescriptor;
        this.c = z;
        ClassKind classKind = ClassKind.d;
        this.d = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$$Lambda$0
            public final StaticScopeForKotlinEnum d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor2 = this.d.b;
                return CollectionsKt.R(DescriptorFactory.f(deserializedClassDescriptor2), DescriptorFactory.g(deserializedClassDescriptor2));
            }
        });
        this.e = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$$Lambda$1
            public final StaticScopeForKotlinEnum d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StaticScopeForKotlinEnum staticScopeForKotlinEnum = this.d;
                return staticScopeForKotlinEnum.c ? CollectionsKt.S(DescriptorFactory.e(staticScopeForKotlinEnum.b)) : EmptyList.d;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        List list = (List) StorageKt.a(this.e, f[1]);
        SmartList smartList = new SmartList();
        for (Object obj : list) {
            if (Intrinsics.c(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection e(Name name, LookupLocation lookupLocation) {
        Intrinsics.h(name, "name");
        List list = (List) StorageKt.a(this.d, f[0]);
        SmartList smartList = new SmartList();
        for (Object obj : list) {
            if (Intrinsics.c(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        KProperty[] kPropertyArr = f;
        return CollectionsKt.c0((List) StorageKt.a(this.e, kPropertyArr[1]), (List) StorageKt.a(this.d, kPropertyArr[0]));
    }
}
