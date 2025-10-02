package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SubstitutingScope implements MemberScope {
    public final MemberScope b;
    public final Lazy c;
    public final TypeSubstitutor d;
    public HashMap e;
    public final Lazy f;

    public SubstitutingScope(MemberScope workerScope, final TypeSubstitutor givenSubstitutor) {
        Intrinsics.h(workerScope, "workerScope");
        Intrinsics.h(givenSubstitutor, "givenSubstitutor");
        this.b = workerScope;
        this.c = LazyKt.b(new Function0(givenSubstitutor) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$$Lambda$0
            public final TypeSubstitutor d;

            {
                this.d = givenSubstitutor;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypeSubstitution typeSubstitutionG = this.d.g();
                typeSubstitutionG.getClass();
                return new TypeSubstitutor(typeSubstitutionG);
            }
        });
        TypeSubstitution typeSubstitutionG = givenSubstitutor.g();
        Intrinsics.g(typeSubstitutionG, "getSubstitution(...)");
        this.d = new TypeSubstitutor(CapturedTypeConstructorKt.b(typeSubstitutionG));
        this.f = LazyKt.b(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$$Lambda$1
            public final SubstitutingScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SubstitutingScope substitutingScope = this.d;
                return substitutingScope.h(ResolutionScope.DefaultImpls.a(substitutingScope.b, null, 3));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        return this.b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        return h(this.b.b(name, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        return this.b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set d() {
        return this.b.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection e(Name name, LookupLocation lookupLocation) {
        Intrinsics.h(name, "name");
        return h(this.b.e(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        ClassifierDescriptor classifierDescriptorF = this.b.f(name, location);
        if (classifierDescriptorF != null) {
            return (ClassifierDescriptor) i(classifierDescriptorF);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        return (Collection) this.f.getD();
    }

    public final Collection h(Collection collection) {
        if (this.d.f24619a.f() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((DeclarationDescriptor) it.next()));
        }
        return linkedHashSet;
    }

    public final DeclarationDescriptor i(DeclarationDescriptor declarationDescriptor) {
        TypeSubstitutor typeSubstitutor = this.d;
        if (typeSubstitutor.f24619a.f()) {
            return declarationDescriptor;
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        HashMap map = this.e;
        Intrinsics.e(map);
        Object objB = map.get(declarationDescriptor);
        if (objB == null) {
            if (!(declarationDescriptor instanceof Substitutable)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + declarationDescriptor).toString());
            }
            objB = ((Substitutable) declarationDescriptor).b(typeSubstitutor);
            if (objB == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + declarationDescriptor + " substitution fails");
            }
            map.put(declarationDescriptor, objB);
        }
        return (DeclarationDescriptor) objB;
    }
}
