package me.oriient.internal.services.sensorsManager;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;

/* loaded from: classes7.dex */
public final class Z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f25564a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(List list) {
        super(0);
        this.f25564a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EnumEntries<SystemSensor> entries = SystemSensor.getEntries();
        List list = this.f25564a;
        int iH = MapsKt.h(CollectionsKt.s(entries, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator<SystemSensor> it = entries.iterator();
        while (it.hasNext()) {
            linkedHashMap.put("sensor_" + it.next().getOsSensorType(), Boolean.valueOf(!list.contains(r2)));
        }
        return linkedHashMap;
    }
}
