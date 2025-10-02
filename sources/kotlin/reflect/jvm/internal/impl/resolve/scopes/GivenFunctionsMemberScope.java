package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] d = {Reflection.f24268a.h(new PropertyReference1Impl(GivenFunctionsMemberScope.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};
    public final AbstractClassDescriptor b;
    public final NotNullLazyValue c;

    public GivenFunctionsMemberScope(StorageManager storageManager, AbstractClassDescriptor abstractClassDescriptor) {
        Intrinsics.h(storageManager, "storageManager");
        this.b = abstractClassDescriptor;
        this.c = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$$Lambda$0
            public final GivenFunctionsMemberScope d;

            {
                this.d = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r10v1 */
            /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ?? arrayList;
                KProperty[] kPropertyArr = GivenFunctionsMemberScope.d;
                final GivenFunctionsMemberScope givenFunctionsMemberScope = this.d;
                List listH = givenFunctionsMemberScope.h();
                List list = listH;
                final ArrayList arrayList2 = new ArrayList(3);
                AbstractClassDescriptor abstractClassDescriptor2 = givenFunctionsMemberScope.b;
                Collection collectionA = abstractClassDescriptor2.m().a();
                Intrinsics.g(collectionA, "getSupertypes(...)");
                ArrayList arrayList3 = new ArrayList();
                Iterator it = collectionA.iterator();
                while (it.hasNext()) {
                    CollectionsKt.h(ResolutionScope.DefaultImpls.a(((KotlinType) it.next()).s(), null, 3), arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof CallableMemberDescriptor) {
                        arrayList4.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    Name name = ((CallableMemberDescriptor) next2).getName();
                    Object arrayList5 = linkedHashMap.get(name);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(name, arrayList5);
                    }
                    ((List) arrayList5).add(next2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Intrinsics.g(key, "component1(...)");
                    Name name2 = (Name) key;
                    List list2 = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((CallableMemberDescriptor) obj) instanceof FunctionDescriptor);
                        Object arrayList6 = linkedHashMap2.get(boolValueOf);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList6);
                        }
                        ((List) arrayList6).add(obj);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list3 = (List) entry2.getValue();
                        OverridingUtil overridingUtil = OverridingUtil.c;
                        List list4 = list3;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj2 : listH) {
                                if (Intrinsics.c(((FunctionDescriptor) obj2).getName(), name2)) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else {
                            arrayList = EmptyList.d;
                        }
                        overridingUtil.h(name2, list4, (Collection) arrayList, abstractClassDescriptor2, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                            public final void a(CallableMemberDescriptor fakeOverride) {
                                Intrinsics.h(fakeOverride, "fakeOverride");
                                OverridingUtil.r(fakeOverride, null);
                                arrayList2.add(fakeOverride);
                            }

                            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                            public final void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor fromCurrent) {
                                Intrinsics.h(fromCurrent, "fromCurrent");
                                throw new IllegalStateException(("Conflict in scope of " + givenFunctionsMemberScope.b + ": " + callableMemberDescriptor + " vs " + fromCurrent).toString());
                            }
                        });
                    }
                }
                return CollectionsKt.c0(kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.b(arrayList2), list);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Collection collection;
        Intrinsics.h(name, "name");
        List list = (List) StorageKt.a(this.c, d[0]);
        if (list.isEmpty()) {
            collection = EmptyList.d;
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : list) {
                if ((obj instanceof PropertyDescriptor) && Intrinsics.c(((PropertyDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            collection = smartList;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection e(Name name, LookupLocation lookupLocation) {
        Collection collection;
        Intrinsics.h(name, "name");
        List list = (List) StorageKt.a(this.c, d[0]);
        if (list.isEmpty()) {
            collection = EmptyList.d;
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : list) {
                if ((obj instanceof SimpleFunctionDescriptor) && Intrinsics.c(((SimpleFunctionDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            collection = smartList;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        if (!kindFilter.a(DescriptorKindFilter.n.b)) {
            return EmptyList.d;
        }
        return (List) StorageKt.a(this.c, d[0]);
    }

    public abstract List h();
}
