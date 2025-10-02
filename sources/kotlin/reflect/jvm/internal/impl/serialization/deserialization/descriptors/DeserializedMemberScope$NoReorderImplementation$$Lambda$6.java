package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* loaded from: classes7.dex */
class DeserializedMemberScope$NoReorderImplementation$$Lambda$6 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KProperty[] kPropertyArr = DeserializedMemberScope.NoReorderImplementation.f24590a;
        List list = (List) StorageKt.a(null, DeserializedMemberScope.NoReorderImplementation.f24590a[3]);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Name name = ((SimpleFunctionDescriptor) obj).getName();
            Intrinsics.g(name, "getName(...)");
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return linkedHashMap;
    }
}
