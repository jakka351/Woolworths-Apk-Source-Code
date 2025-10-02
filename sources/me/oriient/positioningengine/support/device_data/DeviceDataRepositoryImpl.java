package me.oriient.positioningengine.support.device_data;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.elog.Metric;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.support.device_data.model.DeviceData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lme/oriient/positioningengine/support/device_data/DeviceDataRepositoryImpl;", "Lme/oriient/positioningengine/support/device_data/DeviceDataRepository;", "Lme/oriient/positioningengine/support/device_data/DeviceDataRest;", "deviceDataRest", "Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "<init>", "(Lme/oriient/positioningengine/support/device_data/DeviceDataRest;Lme/oriient/internal/services/elog/ELog;Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;)V", "", "deviceModel", "userSessionId", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/positioningengine/support/device_data/model/DeviceData;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "loadDeviceData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/support/device_data/DeviceDataRest;", "Lme/oriient/internal/services/elog/ELog;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "Lkotlin/Lazy;", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/services/elog/Metric;", "metric$delegate", "getMetric", "()Lme/oriient/internal/services/elog/Metric;", "metric", "Companion", "me/oriient/positioningengine/support/device_data/c", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DeviceDataRepositoryImpl implements DeviceDataRepository {

    @NotNull
    private static final c Companion = new c();

    @NotNull
    private static final String TAG = "PredefinedDataShiftRepository";

    @NotNull
    private final CoroutineContextProvider coroutineContextProvider;

    @NotNull
    private final DeviceDataRest deviceDataRest;

    @NotNull
    private final ELog eLog;

    /* renamed from: metric$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy metric;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    public DeviceDataRepositoryImpl(@NotNull DeviceDataRest deviceDataRest, @NotNull ELog eLog, @NotNull CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.h(deviceDataRest, "deviceDataRest");
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        this.deviceDataRest = deviceDataRest;
        this.eLog = eLog;
        this.coroutineContextProvider = coroutineContextProvider;
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.timeProvider = di.inject(reflectionFactory.b(TimeProvider.class));
        this.metric = DiKt.getDi().inject(reflectionFactory.b(Metric.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Metric getMetric() {
        return (Metric) this.metric.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    @Override // me.oriient.positioningengine.support.device_data.DeviceDataRepository
    @Nullable
    public Object loadDeviceData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Outcome<DeviceData, PositioningEngineError>> continuation) {
        return BuildersKt.f(this.coroutineContextProvider.getIo(), new d(this, str, str2, null), continuation);
    }
}
