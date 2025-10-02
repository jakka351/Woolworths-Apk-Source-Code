package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FakePureImplementationsProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f24396a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f24396a = linkedHashMap;
        b(StandardClassIds.w, a("java.util.ArrayList", "java.util.LinkedList"));
        b(StandardClassIds.x, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(StandardClassIds.y, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(ClassId.Companion.b(new FqName("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(ClassId.Companion.b(new FqName("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((ClassId) entry.getKey()).a(), ((ClassId) entry.getValue()).a()));
        }
        b = MapsKt.p(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.Companion.b(new FqName(str)));
        }
        return arrayList;
    }

    public static void b(ClassId classId, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f24396a.put(obj, classId);
        }
    }
}
