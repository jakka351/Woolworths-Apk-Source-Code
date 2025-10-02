package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.elog.ELogImpl;
import me.oriient.ipssdk.common.services.elog.SdkELog;

/* loaded from: classes2.dex */
public final class k0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SdkELog f25757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(SdkELog sdkELog) {
        super(0);
        this.f25757a = sdkELog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OsData osDataAccess$getOsData = SdkELog.access$getOsData(this.f25757a);
        BuildData buildDataAccess$getBuildData = SdkELog.access$getBuildData(this.f25757a);
        j0 j0Var = new j0();
        DeviceIdProvider deviceIdProviderAccess$getDeviceIdProvider = SdkELog.access$getDeviceIdProvider(this.f25757a);
        CoroutineContextProvider coroutineContextProviderAccess$getCoroutineContextProvider = SdkELog.access$getCoroutineContextProvider(this.f25757a);
        ELog.Type type = this.f25757a.f25776a;
        return new ELogImpl(osDataAccess$getOsData, buildDataAccess$getBuildData, deviceIdProviderAccess$getDeviceIdProvider, j0Var, this.f25757a, coroutineContextProviderAccess$getCoroutineContextProvider, SdkELog.access$getGeneralGeofenceStatusProvider(this.f25757a), SdkELog.access$getRuntimeDataProvider(this.f25757a), type);
    }
}
