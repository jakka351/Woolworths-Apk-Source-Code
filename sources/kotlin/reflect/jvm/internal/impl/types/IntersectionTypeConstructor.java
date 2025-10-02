package kotlin.reflect.jvm.internal.impl.types;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {

    /* renamed from: a, reason: collision with root package name */
    public KotlinType f24606a;
    public final LinkedHashSet b;
    public final int c;

    public IntersectionTypeConstructor(AbstractCollection typesToIntersect) {
        Intrinsics.h(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection a() {
        return this.b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean d() {
        return false;
    }

    public final MemberScope e() {
        return TypeIntersectionScope.Companion.a("member scope for intersection type", this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntersectionTypeConstructor)) {
            return false;
        }
        return Intrinsics.c(this.b, ((IntersectionTypeConstructor) obj).b);
    }

    public final SimpleType f() {
        TypeAttributes.e.getClass();
        return KotlinTypeFactory.f(TypeAttributes.f, this, EmptyList.d, false, e(), new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$$Lambda$2
            public final IntersectionTypeConstructor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
                IntersectionTypeConstructor intersectionTypeConstructor = this.d;
                intersectionTypeConstructor.getClass();
                Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
                LinkedHashSet linkedHashSet = intersectionTypeConstructor.b;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).L0(kotlinTypeRefiner));
                    z = true;
                }
                IntersectionTypeConstructor intersectionTypeConstructorI = null;
                if (z) {
                    KotlinType kotlinType = intersectionTypeConstructor.f24606a;
                    intersectionTypeConstructorI = new IntersectionTypeConstructor(arrayList).i(kotlinType != null ? kotlinType.L0(kotlinTypeRefiner) : null);
                }
                if (intersectionTypeConstructorI != null) {
                    intersectionTypeConstructor = intersectionTypeConstructorI;
                }
                return intersectionTypeConstructor.f();
            }
        });
    }

    public final KotlinType g() {
        return this.f24606a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.d;
    }

    public final String h(final Function1 getProperTypeRelatedToStringify) {
        Intrinsics.h(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt.M(CollectionsKt.u0(new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                KotlinType kotlinType = (KotlinType) obj;
                Intrinsics.e(kotlinType);
                Function1 function1 = getProperTypeRelatedToStringify;
                String string = function1.invoke(kotlinType).toString();
                KotlinType kotlinType2 = (KotlinType) obj2;
                Intrinsics.e(kotlinType2);
                return ComparisonsKt.a(string, function1.invoke(kotlinType2).toString());
            }
        }, this.b), " & ", "{", "}", new Function1(getProperTypeRelatedToStringify) { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$$Lambda$0
            public final Function1 d;

            {
                this.d = getProperTypeRelatedToStringify;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinType kotlinType = (KotlinType) obj;
                Intrinsics.e(kotlinType);
                return this.d.invoke(kotlinType).toString();
            }
        }, 24);
    }

    public final int hashCode() {
        return this.c;
    }

    public final IntersectionTypeConstructor i(KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructor = new IntersectionTypeConstructor(this.b);
        intersectionTypeConstructor.f24606a = kotlinType;
        return intersectionTypeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns p() {
        KotlinBuiltIns kotlinBuiltInsP = ((KotlinType) this.b.iterator().next()).J0().p();
        Intrinsics.g(kotlinBuiltInsP, "getBuiltIns(...)");
        return kotlinBuiltInsP;
    }

    public final String toString() {
        return h(IntersectionTypeConstructor$$Lambda$1.d);
    }
}
