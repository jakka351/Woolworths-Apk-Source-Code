package me.oriient.internal.services.dataManager.buildingCoordinateConverter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25122a = new b();

    public b() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a converterData = (a) obj;
        Intrinsics.h(converterData, "converterData");
        String str = converterData.f25121a;
        ArrayList arrayList = converterData.b;
        int iH = MapsKt.h(CollectionsKt.s(arrayList, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            String str2 = jVar.f25127a;
            linkedHashMap.put(str2, new FloorCoordinatesConverter(str2, jVar.b, jVar.c, jVar.d, jVar.e, jVar.f));
        }
        return new BuildingCoordinateConverter(str, linkedHashMap);
    }
}
