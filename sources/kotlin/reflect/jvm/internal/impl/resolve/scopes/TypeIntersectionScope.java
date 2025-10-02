package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeIntersectionScope extends AbstractScopeAdapter {
    public final MemberScope b;

    @SourceDebugExtension
    public static final class Companion {
        public static MemberScope a(String message, Collection types) {
            Intrinsics.h(message, "message");
            Intrinsics.h(types, "types");
            Collection collection = types;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((KotlinType) it.next()).s());
            }
            SmartList smartListB = ScopeUtilsKt.b(arrayList);
            MemberScope memberScopeB = ChainedMemberScope.Companion.b(message, smartListB);
            return smartListB.d <= 1 ? memberScopeB : new TypeIntersectionScope(memberScopeB);
        }
    }

    public TypeIntersectionScope(MemberScope memberScope) {
        this.b = memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        return OverridingUtilsKt.a(super.b(name, noLookupLocation), TypeIntersectionScope$$Lambda$1.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection e(Name name, LookupLocation lookupLocation) {
        Intrinsics.h(name, "name");
        return OverridingUtilsKt.a(super.e(name, lookupLocation), TypeIntersectionScope$$Lambda$0.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        Collection collectionG = super.g(kindFilter, function1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionG) {
            if (((DeclarationDescriptor) obj) instanceof CallableDescriptor) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.c0(arrayList2, OverridingUtilsKt.a(arrayList, TypeIntersectionScope$$Lambda$2.d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    public final MemberScope i() {
        return this.b;
    }
}
