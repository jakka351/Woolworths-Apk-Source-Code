package me.oriient.internal.services.sensorsManager;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.oriient.internal.services.elog.ELog;

/* loaded from: classes7.dex */
public final class O implements InterfaceC1495i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ELog f25558a;
    public final /* synthetic */ SensorsDataProviderImpl b;

    public O(SensorsDataProviderImpl sensorsDataProviderImpl, ELog eLog) {
        this.b = sensorsDataProviderImpl;
        this.f25558a = eLog;
    }

    @Override // me.oriient.internal.services.sensorsManager.InterfaceC1495i
    public final void a(int i) {
        if (this.b.didOverflow.getAndSet(true)) {
            return;
        }
        this.b.overflowCount++;
        ELog eLog = this.f25558a;
        String str = SensorsDataProviderImpl.TAG + System.identityHashCode(this);
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("sensorType", Integer.valueOf(i)), new AbstractMap.SimpleEntry("overflowCount", Integer.valueOf(this.b.overflowCount)), new AbstractMap.SimpleEntry("time", Long.valueOf(System.nanoTime())), new AbstractMap.SimpleEntry("bufferSizes", this.b.getBufferSizesStr()), new AbstractMap.SimpleEntry("SensorsActualSensorsDelay", this.b.getSensorsActualSensorsDelayStr()), new AbstractMap.SimpleEntry("maxBatchDelay", Long.valueOf(this.b.maxBatchDelay))};
        HashMap map = new HashMap(6);
        for (int i2 = 0; i2 < 6; i2++) {
            Map.Entry entry = entryArr[i2];
            Object key = entry.getKey();
            if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
            }
        }
        eLog.c(str, "Buffer overflow in sensor", Collections.unmodifiableMap(map));
        for (SensorWrapper sensorWrapper : this.b.sensors) {
            this.f25558a.c(SensorsDataProviderImpl.TAG + System.identityHashCode(this), this.b.getBufferTimeStr(sensorWrapper));
        }
        SensorsDataProviderImpl sensorsDataProviderImpl = this.b;
        sensorsDataProviderImpl.maxBatchDelay = 0L;
        sensorsDataProviderImpl.lastBatchProcessing = -1L;
        sensorsDataProviderImpl.turnSensorsOff(true, false);
        SensorsDataProviderImpl.SCHEDULED_POOL_EXECUTOR.schedule(new com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f(this, 11), 1L, TimeUnit.SECONDS);
    }

    public final /* synthetic */ void a() {
        this.b.turnSensorsOnImpl();
    }
}
