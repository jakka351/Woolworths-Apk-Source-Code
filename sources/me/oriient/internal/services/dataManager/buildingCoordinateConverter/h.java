package me.oriient.internal.services.dataManager.buildingCoordinateConverter;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.services.dataManager.building.BuildingId;

/* loaded from: classes7.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuildingId f25125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BuildingId buildingId) {
        super(1);
        this.f25125a = buildingId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        String value = this.f25125a.getValue();
        KTypeProjection kTypeProjection = KTypeProjection.c;
        Iterable iterable = (Iterable) JsonSerializationKt.parseAsJson(it, Reflection.c(KTypeProjection.Companion.a(Reflection.b(FloorConverterResponse.class))));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(((FloorConverterResponse) it2.next()).toFloorConverterData());
        }
        return new a(value, arrayList);
    }
}
