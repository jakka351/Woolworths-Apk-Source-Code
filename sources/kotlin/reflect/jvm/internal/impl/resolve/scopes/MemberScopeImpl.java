package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class MemberScopeImpl implements MemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set a() {
        Collection collectionG = g(DescriptorKindFilter.p, FunctionsKt.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof SimpleFunctionDescriptor) {
                Name name = ((SimpleFunctionDescriptor) obj).getName();
                Intrinsics.g(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set c() {
        Collection collectionG = g(DescriptorKindFilter.q, FunctionsKt.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof SimpleFunctionDescriptor) {
                Name name = ((SimpleFunctionDescriptor) obj).getName();
                Intrinsics.g(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection e(Name name, LookupLocation lookupLocation) {
        Intrinsics.h(name, "name");
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        return EmptyList.d;
    }
}
