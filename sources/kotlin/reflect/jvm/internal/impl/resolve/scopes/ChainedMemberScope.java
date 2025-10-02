package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class ChainedMemberScope implements MemberScope {
    public final String b;
    public final MemberScope[] c;

    @SourceDebugExtension
    public static final class Companion {
        public static MemberScope a(Iterable iterable, String debugName) {
            Intrinsics.h(debugName, "debugName");
            SmartList smartList = new SmartList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                MemberScope memberScope = (MemberScope) it.next();
                if (memberScope != MemberScope.Empty.b) {
                    if (memberScope instanceof ChainedMemberScope) {
                        CollectionsKt.j(smartList, ((ChainedMemberScope) memberScope).c);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return b(debugName, smartList);
        }

        public static MemberScope b(String debugName, SmartList smartList) {
            Intrinsics.h(debugName, "debugName");
            int i = smartList.d;
            return i != 0 ? i != 1 ? new ChainedMemberScope(debugName, (MemberScope[]) smartList.toArray(new MemberScope[0])) : (MemberScope) smartList.get(0) : MemberScope.Empty.b;
        }
    }

    public ChainedMemberScope(String str, MemberScope[] memberScopeArr) {
        this.b = str;
        this.c = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.c) {
            CollectionsKt.h(memberScope.a(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        MemberScope[] memberScopeArr = this.c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.d;
        }
        if (length == 1) {
            return memberScopeArr[0].b(name, noLookupLocation);
        }
        Collection collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.b(name, noLookupLocation));
        }
        return collectionA == null ? EmptySet.d : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.c) {
            CollectionsKt.h(memberScope.c(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set d() {
        return MemberScopeKt.a(ArraysKt.e(this.c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection e(Name name, LookupLocation lookupLocation) {
        Intrinsics.h(name, "name");
        MemberScope[] memberScopeArr = this.c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.d;
        }
        if (length == 1) {
            return memberScopeArr[0].e(name, lookupLocation);
        }
        Collection collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.e(name, lookupLocation));
        }
        return collectionA == null ? EmptySet.d : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : this.c) {
            ClassifierDescriptor classifierDescriptorF = memberScope.f(name, location);
            if (classifierDescriptorF != null) {
                if (!(classifierDescriptorF instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorF).p0()) {
                    return classifierDescriptorF;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorF;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        MemberScope[] memberScopeArr = this.c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.d;
        }
        if (length == 1) {
            return memberScopeArr[0].g(kindFilter, function1);
        }
        Collection collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.g(kindFilter, function1));
        }
        return collectionA == null ? EmptySet.d : collectionA;
    }

    public final String toString() {
        return this.b;
    }
}
