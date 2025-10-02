package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* renamed from: a, reason: collision with root package name */
    public final JavaClass f24429a;
    public final Function1 b;
    public final Function1 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public ClassDeclaredMemberIndex(JavaClass jClass, Function1 function1) {
        Intrinsics.h(jClass, "jClass");
        this.f24429a = jClass;
        this.b = function1;
        Function1 function12 = new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$$Lambda$0
            public final ClassDeclaredMemberIndex d;

            {
                this.d = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r6) {
                /*
                    r5 = this;
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod r6 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) r6
                    java.lang.String r0 = "m"
                    kotlin.jvm.internal.Intrinsics.h(r6, r0)
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex r0 = r5.d
                    kotlin.jvm.functions.Function1 r0 = r0.b
                    java.lang.Object r0 = r0.invoke(r6)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    r1 = 0
                    if (r0 == 0) goto Laa
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass r0 = r6.t()
                    java.lang.Class r0 = r0.f24381a
                    boolean r0 = r0.isInterface()
                    r2 = 1
                    if (r0 == 0) goto La6
                    kotlin.reflect.jvm.internal.impl.name.Name r0 = r6.getName()
                    java.lang.String r0 = r0.b()
                    int r3 = r0.hashCode()
                    r4 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
                    if (r3 == r4) goto L90
                    r4 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
                    if (r3 == r4) goto L4a
                    r4 = 147696667(0x8cdac1b, float:1.23784505E-33)
                    if (r3 == r4) goto L41
                    goto L8e
                L41:
                    java.lang.String r3 = "hashCode"
                    boolean r0 = r0.equals(r3)
                    if (r0 != 0) goto L98
                    goto L8e
                L4a:
                    java.lang.String r3 = "equals"
                    boolean r0 = r0.equals(r3)
                    if (r0 != 0) goto L53
                    goto L8e
                L53:
                    java.util.List r6 = r6.h()
                    java.lang.Object r6 = kotlin.collections.CollectionsKt.p0(r6)
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter r6 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter) r6
                    r0 = 0
                    if (r6 == 0) goto L65
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType r6 = r6.getType()
                    goto L66
                L65:
                    r6 = r0
                L66:
                    boolean r3 = r6 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
                    if (r3 == 0) goto L6d
                    r0 = r6
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r0 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) r0
                L6d:
                    if (r0 != 0) goto L70
                    goto L8e
                L70:
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier r6 = r0.e()
                    boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
                    if (r0 == 0) goto L8e
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r6 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) r6
                    kotlin.reflect.jvm.internal.impl.name.FqName r6 = r6.d()
                    if (r6 == 0) goto L8e
                    kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r6 = r6.f24500a
                    java.lang.String r6 = r6.f24501a
                    java.lang.String r0 = "java.lang.Object"
                    boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r0)
                    if (r6 == 0) goto L8e
                    r6 = r2
                    goto La2
                L8e:
                    r6 = r1
                    goto La2
                L90:
                    java.lang.String r3 = "toString"
                    boolean r0 = r0.equals(r3)
                    if (r0 == 0) goto L8e
                L98:
                    java.util.List r6 = r6.h()
                    java.util.ArrayList r6 = (java.util.ArrayList) r6
                    boolean r6 = r6.isEmpty()
                La2:
                    if (r6 == 0) goto La6
                    r6 = r2
                    goto La7
                La6:
                    r6 = r1
                La7:
                    if (r6 != 0) goto Laa
                    r1 = r2
                Laa:
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$$Lambda$0.invoke(java.lang.Object):java.lang.Object");
            }
        };
        this.c = function12;
        FilteringSequence filteringSequenceG = SequencesKt.g(CollectionsKt.n(jClass.m()), function12);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            Object next = anonymousClass1.next();
            Name name = ((JavaMethod) next).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        FilteringSequence filteringSequenceG2 = SequencesKt.g(CollectionsKt.n(this.f24429a.z()), this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        FilteringSequence.AnonymousClass1 anonymousClass12 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass12.hasNext()) {
            Object next2 = anonymousClass12.next();
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListS = this.f24429a.s();
        Function1 function13 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListS) {
            if (((Boolean) function13.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iH = MapsKt.h(CollectionsKt.s(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            linkedHashMap3.put(((JavaRecordComponent) next3).getName(), next3);
        }
        this.f = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final Set a() {
        FilteringSequence filteringSequenceG = SequencesKt.g(CollectionsKt.n(this.f24429a.m()), this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            linkedHashSet.add(((JavaMethod) anonymousClass1.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final Set b() {
        return this.f.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final JavaField c(Name name) {
        Intrinsics.h(name, "name");
        return (JavaField) this.e.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final Set d() {
        FilteringSequence filteringSequenceG = SequencesKt.g(CollectionsKt.n(this.f24429a.z()), this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            linkedHashSet.add(((JavaField) anonymousClass1.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final Collection e(Name name) {
        Intrinsics.h(name, "name");
        List list = (List) this.d.get(name);
        return list != null ? list : EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final JavaRecordComponent f(Name name) {
        Intrinsics.h(name, "name");
        return (JavaRecordComponent) this.f.get(name);
    }
}
