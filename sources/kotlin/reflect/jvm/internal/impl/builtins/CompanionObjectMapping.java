package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class CompanionObjectMapping {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f24309a;

    static {
        Set<PrimitiveType> set = PrimitiveType.h;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(set, 10));
        for (PrimitiveType primitiveType : set) {
            Intrinsics.h(primitiveType, "primitiveType");
            arrayList.add(StandardNames.l.a(primitiveType.d));
        }
        ArrayList arrayListD0 = CollectionsKt.d0(StandardNames.FqNames.j.g(), CollectionsKt.d0(StandardNames.FqNames.h.g(), CollectionsKt.d0(StandardNames.FqNames.f.g(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListD0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ClassId.Companion.b((FqName) it.next()));
        }
        f24309a = linkedHashSet;
    }
}
