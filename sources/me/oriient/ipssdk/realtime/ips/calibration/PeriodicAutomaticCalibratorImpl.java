package me.oriient.ipssdk.realtime.ips.calibration;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.ips.ICalibrationListener;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.ips.calibration.AutomaticCalibrator;
import me.oriient.ipssdk.realtime.ofs.S2;
import me.oriient.ipssdk.realtime.ofs.X2;
import me.oriient.ipssdk.realtime.ofs.Y2;
import me.oriient.positioningengine.common.EngineStopReason;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\b¨\u0006\u0010"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/calibration/PeriodicAutomaticCalibratorImpl;", "Lme/oriient/ipssdk/realtime/ips/calibration/AutomaticCalibrator;", "Lme/oriient/ipssdk/realtime/ips/calibration/AutomaticCalibrator$Delegate;", "delegate", "<init>", "(Lme/oriient/ipssdk/realtime/ips/calibration/AutomaticCalibrator$Delegate;)V", "", "start", "()V", "Lme/oriient/positioningengine/common/EngineStopReason;", "stopCalibrationReason", "stop", "(Lme/oriient/positioningengine/common/EngineStopReason;)V", "reset", "Companion", "me/oriient/ipssdk/realtime/ofs/R2", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PeriodicAutomaticCalibratorImpl implements AutomaticCalibrator {

    @NotNull
    public static final String GEOFENCE_REQUEST_ID = "auto-calibration";

    /* renamed from: a, reason: collision with root package name */
    private final AutomaticCalibrator.Delegate f25874a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private final Lazy h;
    private final Lazy i;
    private final List j;
    private Job k;
    private boolean l;
    private Job m;
    private String n;
    private long o;
    private Long p;

    public PeriodicAutomaticCalibratorImpl(@NotNull AutomaticCalibrator.Delegate delegate) {
        Intrinsics.h(delegate, "delegate");
        this.f25874a = delegate;
        this.b = LazyKt.b(new b(this));
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(Logger.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(AuthManager.class));
        Lazy lazyInject = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        this.f = lazyInject;
        this.g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        Lazy lazyInject2 = DependencyInjectionKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.h = lazyInject2;
        this.i = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingGeofenceManager.class));
        this.j = CollectionsKt.Q(14);
        this.l = true;
        this.o = (long) (((RemoteConfigManager) lazyInject.getD()).getRealTimeConfig().getAutoCalibration().getAutoCalibCheckTimeIntervalSec() * TimeUnit.SECONDS.toMillis(1L));
        BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) lazyInject2.getD()).getDefault()), null, null, new a(this, null), 3);
    }

    public static final void access$cancelBackgroundCalibrationTimeout(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        ((Logger) periodicAutomaticCalibratorImpl.c.getD()).d("PeriodicAutomaticCalibrator", "cancelBackgroundCalibrationTimeout() called");
        Job job = periodicAutomaticCalibratorImpl.m;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        periodicAutomaticCalibratorImpl.m = null;
    }

    public static final ICalibrationListener access$getAutoCalibrationListener(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        return (ICalibrationListener) periodicAutomaticCalibratorImpl.b.getD();
    }

    public static final RemoteConfigManager access$getConfigManager(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        return (RemoteConfigManager) periodicAutomaticCalibratorImpl.f.getD();
    }

    public static final ELog access$getELog(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        return (ELog) periodicAutomaticCalibratorImpl.d.getD();
    }

    public static final Logger access$getLogger(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        return (Logger) periodicAutomaticCalibratorImpl.c.getD();
    }

    public static final TimeProvider access$getTimeProvider(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        return (TimeProvider) periodicAutomaticCalibratorImpl.g.getD();
    }

    public static final void access$onCalibrationProcessError(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl, IPSError iPSError) {
        ((Logger) periodicAutomaticCalibratorImpl.c.getD()).d("PeriodicAutomaticCalibrator", "onCalibrationProcessError() called with: ipsError = " + iPSError);
        if (periodicAutomaticCalibratorImpl.j.contains(Integer.valueOf(iPSError.getCode()))) {
            periodicAutomaticCalibratorImpl.l = false;
        }
    }

    public static final void access$onCalibrationTimeout(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        ((Logger) periodicAutomaticCalibratorImpl.c.getD()).d("PeriodicAutomaticCalibrator", "onCalibrationTimeout()");
        periodicAutomaticCalibratorImpl.l = false;
        ((Logger) periodicAutomaticCalibratorImpl.c.getD()).d("PeriodicAutomaticCalibrator", "cancelBackgroundCalibrationTimeout() called");
        Job job = periodicAutomaticCalibratorImpl.m;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        periodicAutomaticCalibratorImpl.m = null;
        Positioning positioning = Positioning.INSTANCE;
        positioning.removeCalibrationListener((ICalibrationListener) periodicAutomaticCalibratorImpl.b.getD());
        positioning.stopCalibration(null);
        ((ELog) periodicAutomaticCalibratorImpl.d.getD()).i("PeriodicAutomaticCalibrator", "Automatic calibration timeout", new S2(periodicAutomaticCalibratorImpl));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0196, code lost:
    
        if (kotlinx.coroutines.CoroutineScopeKt.c(r9, r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$scheduleAutoCalibrationTask(final me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl.access$scheduleAutoCalibrationTask(me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void access$startBackgroundCalibrationTimer(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        ((Logger) periodicAutomaticCalibratorImpl.c.getD()).d("PeriodicAutomaticCalibrator", "startBackgroundCalibrationTimer() called");
        Job jobC = BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) periodicAutomaticCalibratorImpl.h.getD()).getIo()), null, null, new Y2(periodicAutomaticCalibratorImpl, null), 3);
        Job job = periodicAutomaticCalibratorImpl.m;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        periodicAutomaticCalibratorImpl.m = jobC;
    }

    @Override // me.oriient.ipssdk.realtime.ips.calibration.AutomaticCalibrator
    public void reset() {
        ((Logger) this.c.getD()).d("PeriodicAutomaticCalibrator", "reset() called");
        ((Logger) this.c.getD()).d("PeriodicAutomaticCalibrator", "cancelBackgroundCalibrationTimeout() called");
        Job job = this.m;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.m = null;
        this.l = true;
    }

    @Override // me.oriient.ipssdk.realtime.ips.calibration.AutomaticCalibrator
    public void start() {
        ((Logger) this.c.getD()).d("PeriodicAutomaticCalibrator", "start() called");
        if (this.k != null) {
            ((Logger) this.c.getD()).d("PeriodicAutomaticCalibrator", "AutomaticCalibrator is already running");
            return;
        }
        if (((AuthManager) this.e.getD()).getCredentials().getValue() == null) {
            ((Logger) this.c.getD()).d("PeriodicAutomaticCalibrator", "Can't start automatic calibration before login");
            return;
        }
        ((ELog) this.d.getD()).i("PeriodicAutomaticCalibrator", "Start automatic calibration check timer", MapsKt.i(new Pair("timeInterval", Double.valueOf(((RemoteConfigManager) this.f.getD()).getRealTimeConfig().getAutoCalibration().getAutoCalibCheckTimeIntervalSec()))));
        this.l = true;
        ((BuildingGeofenceManager) this.i.getD()).enableCircularStrategy(true, GEOFENCE_REQUEST_ID);
        Job jobC = BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) this.h.getD()).getIo()), null, null, new X2(this, null), 3);
        Job job = this.k;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.k = jobC;
    }

    @Override // me.oriient.ipssdk.realtime.ips.calibration.AutomaticCalibrator
    public void stop(@Nullable EngineStopReason stopCalibrationReason) {
        ((Logger) this.c.getD()).d("PeriodicAutomaticCalibrator", "stop() called");
        if (this.k != null) {
            ((ELog) this.d.getD()).i("PeriodicAutomaticCalibrator", "Stop automatic calibration check timer");
            Job job = this.k;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            this.k = null;
            ((Logger) this.c.getD()).d("PeriodicAutomaticCalibrator", "cancelBackgroundCalibrationTimeout() called");
            Job job2 = this.m;
            if (job2 != null) {
                job2.cancel((CancellationException) null);
            }
            this.m = null;
            ((Logger) this.c.getD()).d("PeriodicAutomaticCalibrator", "stopObservingGeofence() called");
            ((BuildingGeofenceManager) this.i.getD()).enableCircularStrategy(false, GEOFENCE_REQUEST_ID);
            if (stopCalibrationReason != null) {
                this.f25874a.stopCalibration(stopCalibrationReason);
            }
        }
    }
}
