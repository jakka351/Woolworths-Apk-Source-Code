package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* loaded from: classes.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {
    public final Object b;
    public final MemoizedFunctionToNullable c = new LockBasedStorageManager("Java nullability annotation states").b(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl$$Lambda$0
        public final NullabilityAnnotationStatesImpl d;

        {
            this.d = this;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object next;
            FqName fqName = (FqName) obj;
            Intrinsics.e(fqName);
            ?? r0 = this.d.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = r0.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                FqName packageName = (FqName) entry.getKey();
                if (!fqName.equals(packageName)) {
                    Intrinsics.h(packageName, "packageName");
                    if (Intrinsics.c(fqName.f24500a.c() ? null : fqName.b(), packageName)) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                Iterator it2 = linkedHashMap.entrySet().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int length = FqNamesUtilKt.b((FqName) ((Map.Entry) next).getKey(), fqName).f24500a.f24501a.length();
                        do {
                            Object next2 = it2.next();
                            int length2 = FqNamesUtilKt.b((FqName) ((Map.Entry) next2).getKey(), fqName).f24500a.f24501a.length();
                            if (length > length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
            }
            return null;
        }
    });

    public NullabilityAnnotationStatesImpl(Map map) {
        this.b = map;
    }
}
