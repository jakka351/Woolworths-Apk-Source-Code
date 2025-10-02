package me.oriient.internal.services.sensorsManager;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;

/* loaded from: classes7.dex */
public final class Y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorsManagerImpl f25563a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(SensorsManagerImpl sensorsManagerImpl) {
        super(0);
        this.f25563a = sensorsManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Set<Map.Entry<SystemSensor, SensorInformation>> setEntrySet = this.f25563a.getSensorsInformation().entrySet();
        int iH = MapsKt.h(CollectionsKt.s(setEntrySet, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put("sensor_" + ((SystemSensor) entry.getKey()).getOsSensorType(), Boolean.valueOf(((SensorInformation) entry.getValue()).getBatchingSupported()));
        }
        return linkedHashMap;
    }
}
