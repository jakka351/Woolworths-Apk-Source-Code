package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class StandardClassIdsKt {
    public static final ClassId a(String str) {
        FqName fqName = StandardClassIds.f24504a;
        return new ClassId(StandardClassIds.f24504a, Name.e(str));
    }

    public static final ClassId b(String str) {
        FqName fqName = StandardClassIds.f24504a;
        return new ClassId(StandardClassIds.c, Name.e(str));
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iH = MapsKt.h(CollectionsKt.s(setEntrySet, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final ClassId d(Name name) {
        FqName fqName = StandardClassIds.f24504a;
        ClassId classId = StandardClassIds.m;
        return new ClassId(classId.f24499a, Name.e(name.c().concat(classId.f().c())));
    }

    public static final ClassId e(String str) {
        FqName fqName = StandardClassIds.f24504a;
        return new ClassId(StandardClassIds.b, Name.e(str));
    }

    public static final ClassId f(ClassId classId) {
        FqName fqName = StandardClassIds.f24504a;
        return new ClassId(StandardClassIds.f24504a, Name.e("U".concat(classId.f().c())));
    }
}
