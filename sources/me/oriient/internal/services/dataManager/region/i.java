package me.oriient.internal.services.dataManager.region;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.services.dataManager.building.BuildingId;

/* loaded from: classes7.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuildingId f25398a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BuildingId buildingId) {
        super(1);
        this.f25398a = buildingId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        KTypeProjection kTypeProjection = KTypeProjection.c;
        Iterable iterable = (Iterable) JsonSerializationKt.parseAsJson(it, Reflection.c(KTypeProjection.Companion.a(Reflection.b(RegionResponse.class))));
        BuildingId buildingId = this.f25398a;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            BuildingRegion region = ((RegionResponse) it2.next()).toRegion(buildingId);
            if (region != null) {
                arrayList.add(region);
            }
        }
        return arrayList;
    }
}
