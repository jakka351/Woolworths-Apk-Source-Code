package me.oriient.internal.services.sensorsManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;

/* loaded from: classes7.dex */
public final class j0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorsManagerImpl f25578a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(SensorsManagerImpl sensorsManagerImpl) {
        super(0);
        this.f25578a = sensorsManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CoroutineContextProvider coroutineContextProvider = this.f25578a.coroutineContextProvider;
        OriientSensorWrapper[] oriientSensorWrapperArr = this.f25578a.sensors;
        if (oriientSensorWrapperArr != null) {
            return coroutineContextProvider.newThreadPoolCoroutineContext(oriientSensorWrapperArr.length, null);
        }
        Intrinsics.p("sensors");
        throw null;
    }
}
