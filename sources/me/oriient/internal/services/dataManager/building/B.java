package me.oriient.internal.services.dataManager.building;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;

/* loaded from: classes7.dex */
public final class B extends Lambda implements Function1 {
    public B(D d) {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        KTypeProjection kTypeProjection = KTypeProjection.c;
        Iterable iterable = (Iterable) JsonSerializationKt.parseAsJson(it, Reflection.c(KTypeProjection.Companion.a(Reflection.b(BuildingSearchResponse.class))));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(((BuildingSearchResponse) it2.next()).toBuildingSearchResult());
        }
        return arrayList;
    }
}
