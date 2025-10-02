package me.oriient.positioningengine.ondevice;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.ondevice.models.EnginePerformanceReport;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010#R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lme/oriient/positioningengine/ondevice/OnDeviceEnginePerformanceMonitorImpl;", "Lme/oriient/positioningengine/ondevice/OnDeviceEnginePerformanceMonitor;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "", "shouldLogLocally", "<init>", "(Lme/oriient/internal/infra/utils/core/Logger;Z)V", "", "sessionStartTimeMillis", "", "initialize", "(J)V", "reset", "()V", "processingStartTimeMillis", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "sample", "handleProcessing", "(JLme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;)V", "Lme/oriient/positioningengine/common/PositioningUpdate;", "position", "handlePositionUpdate", "(Lme/oriient/positioningengine/common/PositioningUpdate;)V", "Lme/oriient/positioningengine/ondevice/models/EnginePerformanceReport;", "getPerformanceReport", "()Lme/oriient/positioningengine/ondevice/models/EnginePerformanceReport;", "Lme/oriient/internal/infra/utils/core/Logger;", "Z", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "Lkotlin/Lazy;", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "J", "totalProcessingTime", "totalLagTime", "totalProcessedSamples", "didReachFirstPositionLock", "Lme/oriient/positioningengine/ondevice/models/a;", "performanceReport", "Lme/oriient/positioningengine/ondevice/models/a;", "Companion", "me/oriient/positioningengine/ondevice/Y", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OnDeviceEnginePerformanceMonitorImpl implements OnDeviceEnginePerformanceMonitor {

    @NotNull
    private static final Y Companion = new Y();

    @NotNull
    private static final String TAG = "OnDeviceEnginePerformanceMonitor";
    private boolean didReachFirstPositionLock;

    @NotNull
    private final Logger logger;

    @NotNull
    private me.oriient.positioningengine.ondevice.models.a performanceReport;
    private long sessionStartTimeMillis;
    private final boolean shouldLogLocally;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;
    private long totalLagTime;
    private long totalProcessedSamples;
    private long totalProcessingTime;

    public OnDeviceEnginePerformanceMonitorImpl(@NotNull Logger logger, boolean z) {
        Intrinsics.h(logger, "logger");
        this.logger = logger;
        this.shouldLogLocally = z;
        this.timeProvider = DiKt.getDi().inject(Reflection.f24268a.b(TimeProvider.class));
        this.performanceReport = new me.oriient.positioningengine.ondevice.models.a();
    }

    private final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    @Override // me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor
    @NotNull
    public EnginePerformanceReport getPerformanceReport() {
        me.oriient.positioningengine.ondevice.models.a aVar = this.performanceReport;
        return new me.oriient.positioningengine.ondevice.models.a(aVar.f26470a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h);
    }

    @Override // me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor
    public void handlePositionUpdate(@NotNull PositioningUpdate position) {
        Intrinsics.h(position, "position");
        if (this.didReachFirstPositionLock || position.getLockProgress() < 1.0d) {
            return;
        }
        this.totalProcessingTime = 0L;
        this.totalProcessedSamples = 0L;
        this.totalLagTime = 0L;
        this.didReachFirstPositionLock = true;
    }

    @Override // me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor
    public void handleProcessing(long processingStartTimeMillis, @NotNull SensorsDataSample sample) {
        Intrinsics.h(sample, "sample");
        long jTimeIntervalSinceNow = getTimeProvider().timeIntervalSinceNow(processingStartTimeMillis);
        long jAbs = Math.abs(TimeUnit.NANOSECONDS.toMillis(sample.getStartTimeNanos() - sample.getFirstGyroTimestampNanos()) - getTimeProvider().timeIntervalSinceNow(this.sessionStartTimeMillis));
        long j = this.totalProcessingTime + jTimeIntervalSinceNow;
        this.totalProcessingTime = j;
        long j2 = this.totalLagTime + jAbs;
        this.totalLagTime = j2;
        long j3 = this.totalProcessedSamples + 1;
        this.totalProcessedSamples = j3;
        long j4 = j / j3;
        long j5 = j2 / j3;
        if (this.didReachFirstPositionLock) {
            me.oriient.positioningengine.ondevice.models.a aVar = this.performanceReport;
            aVar.d = Math.max(aVar.d, jTimeIntervalSinceNow);
            me.oriient.positioningengine.ondevice.models.a aVar2 = this.performanceReport;
            aVar2.h = Math.max(aVar2.h, jAbs);
            me.oriient.positioningengine.ondevice.models.a aVar3 = this.performanceReport;
            aVar3.c = j4;
            aVar3.g = j5;
        } else {
            me.oriient.positioningengine.ondevice.models.a aVar4 = this.performanceReport;
            aVar4.b = Math.max(aVar4.b, jTimeIntervalSinceNow);
            me.oriient.positioningengine.ondevice.models.a aVar5 = this.performanceReport;
            aVar5.f = Math.max(aVar5.f, jAbs);
            me.oriient.positioningengine.ondevice.models.a aVar6 = this.performanceReport;
            aVar6.f26470a = j4;
            aVar6.e = j5;
        }
        if (this.shouldLogLocally) {
            this.logger.d(TAG, "Performance report: " + this.performanceReport);
        }
    }

    @Override // me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor
    public void initialize(long sessionStartTimeMillis) {
        reset();
        this.sessionStartTimeMillis = sessionStartTimeMillis;
    }

    @Override // me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor
    public void reset() {
        this.sessionStartTimeMillis = 0L;
        this.totalProcessingTime = 0L;
        this.totalLagTime = 0L;
        this.totalProcessedSamples = 0L;
        this.didReachFirstPositionLock = false;
        this.performanceReport = new me.oriient.positioningengine.ondevice.models.a();
    }
}
