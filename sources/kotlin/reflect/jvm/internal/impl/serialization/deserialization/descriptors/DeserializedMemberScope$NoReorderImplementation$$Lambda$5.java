package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* loaded from: classes7.dex */
class DeserializedMemberScope$NoReorderImplementation$$Lambda$5 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list = (List) StorageKt.a(null, DeserializedMemberScope.NoReorderImplementation.f24590a[2]);
        int iH = MapsKt.h(CollectionsKt.s(list, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Object obj : list) {
            Name name = ((TypeAliasDescriptor) obj).getName();
            Intrinsics.g(name, "getName(...)");
            linkedHashMap.put(name, obj);
        }
        return linkedHashMap;
    }
}
