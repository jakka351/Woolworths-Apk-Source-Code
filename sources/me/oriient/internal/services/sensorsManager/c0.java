package me.oriient.internal.services.sensorsManager;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class c0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25568a;
    public final /* synthetic */ SensorsManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i, SensorsManagerImpl sensorsManagerImpl) {
        super(0);
        this.f25568a = i;
        this.b = sensorsManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("sensorType", Integer.valueOf(this.f25568a)), new Pair("time", Long.valueOf(System.nanoTime())), new Pair("overflowCount", Integer.valueOf(this.b.overflowCount)), new Pair("bufferSizes", this.b.getBufferSizesStr()), new Pair("overflowCount", Integer.valueOf(this.b.overflowCount)), new Pair("getSensorsActualSensorsDelayStr", this.b.getSensorsActualSensorsDelayStr()), new Pair("overflowCount", Integer.valueOf(this.b.overflowCount)), new Pair("maxBatchDelay", Long.valueOf(this.b.maxBatchDelay)));
    }
}
