package me.oriient.internal.services.sensorsManager.support;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.SystemLocationManager;
import me.oriient.internal.infra.locationManager.SystemLocationManagerFactory;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.android.HandlerFactory;
import me.oriient.internal.infra.utils.android.WakeLockFactory;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.ForegroundServiceMonitor;
import me.oriient.internal.services.sensorsManager.SensorsDataProvider;
import me.oriient.internal.services.sensorsManager.SensorsDataProviderImpl;
import me.oriient.internal.services.sensorsManager.SensorsManager;
import me.oriient.internal.services.sensorsManager.SensorsManagerImpl;
import me.oriient.internal.services.sensorsManager.SystemSensorManager;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020?H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\f\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b-\u0010.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b2\u00103R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\f\u001a\u0004\b7\u00108¨\u0006@"}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SensorsDataProviderFactoryImpl;", "Lme/oriient/internal/services/sensorsManager/support/SensorsDataProviderFactory;", "foregroundServiceMonitor", "Lme/oriient/internal/services/sensorsManager/ForegroundServiceMonitor;", "systemSensorManager", "Lme/oriient/internal/services/sensorsManager/SystemSensorManager;", "(Lme/oriient/internal/services/sensorsManager/ForegroundServiceMonitor;Lme/oriient/internal/services/sensorsManager/SystemSensorManager;)V", "appStateProvider", "Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "getAppStateProvider", "()Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "appStateProvider$delegate", "Lkotlin/Lazy;", "contextProvider", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "getContextProvider", "()Lme/oriient/internal/infra/utils/android/ContextProvider;", "contextProvider$delegate", "coroutineContextProvider", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "eLog", "Lme/oriient/internal/services/elog/ELog;", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "handlerFactory", "Lme/oriient/internal/infra/utils/android/HandlerFactory;", "getHandlerFactory", "()Lme/oriient/internal/infra/utils/android/HandlerFactory;", "handlerFactory$delegate", "locationManagerFactory", "Lme/oriient/internal/infra/locationManager/SystemLocationManagerFactory;", "getLocationManagerFactory", "()Lme/oriient/internal/infra/locationManager/SystemLocationManagerFactory;", "locationManagerFactory$delegate", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "systemLocationManager", "Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "getSystemLocationManager", "()Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "systemLocationManager$delegate", "timeProvider", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "wakeLockFactory", "Lme/oriient/internal/infra/utils/android/WakeLockFactory;", "getWakeLockFactory", "()Lme/oriient/internal/infra/utils/android/WakeLockFactory;", "wakeLockFactory$delegate", "createSensorManager", "Lme/oriient/internal/services/sensorsManager/SensorsManager;", "extraPrints", "", "createSensorsDataProvider", "Lme/oriient/internal/services/sensorsManager/SensorsDataProvider;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SensorsDataProviderFactoryImpl implements SensorsDataProviderFactory {

    /* renamed from: appStateProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appStateProvider;

    /* renamed from: contextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy contextProvider;

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    @NotNull
    private final ForegroundServiceMonitor foregroundServiceMonitor;

    /* renamed from: handlerFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy handlerFactory;

    /* renamed from: locationManagerFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy locationManagerFactory;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    /* renamed from: systemLocationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy systemLocationManager;

    @NotNull
    private final SystemSensorManager systemSensorManager;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    /* renamed from: wakeLockFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy wakeLockFactory;

    public SensorsDataProviderFactoryImpl(@NotNull ForegroundServiceMonitor foregroundServiceMonitor, @NotNull SystemSensorManager systemSensorManager) {
        Intrinsics.h(foregroundServiceMonitor, "foregroundServiceMonitor");
        Intrinsics.h(systemSensorManager, "systemSensorManager");
        this.foregroundServiceMonitor = foregroundServiceMonitor;
        this.systemSensorManager = systemSensorManager;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.contextProvider = di.inject(reflectionFactory.b(ContextProvider.class));
        this.coroutineContextProvider = InternalDiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.handlerFactory = InternalDiKt.getDi().inject(reflectionFactory.b(HandlerFactory.class));
        this.wakeLockFactory = InternalDiKt.getDi().inject(reflectionFactory.b(WakeLockFactory.class));
        this.timeProvider = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.appStateProvider = InternalDiKt.getDi().inject(reflectionFactory.b(AppStateProvider.class));
        this.logger = InternalDiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.locationManagerFactory = InternalDiKt.getDi().inject(reflectionFactory.b(SystemLocationManagerFactory.class));
        this.systemLocationManager = LazyKt.b(new i(this));
    }

    private final AppStateProvider getAppStateProvider() {
        return (AppStateProvider) this.appStateProvider.getD();
    }

    private final ContextProvider getContextProvider() {
        return (ContextProvider) this.contextProvider.getD();
    }

    private final CoroutineContextProvider getCoroutineContextProvider() {
        return (CoroutineContextProvider) this.coroutineContextProvider.getD();
    }

    private final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    private final HandlerFactory getHandlerFactory() {
        return (HandlerFactory) this.handlerFactory.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SystemLocationManagerFactory getLocationManagerFactory() {
        return (SystemLocationManagerFactory) this.locationManagerFactory.getD();
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final SystemLocationManager getSystemLocationManager() {
        return (SystemLocationManager) this.systemLocationManager.getD();
    }

    private final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    private final WakeLockFactory getWakeLockFactory() {
        return (WakeLockFactory) this.wakeLockFactory.getD();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorsDataProviderFactory
    @NotNull
    public SensorsManager createSensorManager(boolean extraPrints) {
        return new SensorsManagerImpl(getELog(), getContextProvider(), getHandlerFactory(), getWakeLockFactory(), getCoroutineContextProvider(), getTimeProvider(), this.systemSensorManager, getSystemLocationManager(), getAppStateProvider(), this.foregroundServiceMonitor, getLogger(), extraPrints);
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorsDataProviderFactory
    @NotNull
    public SensorsDataProvider createSensorsDataProvider() {
        return new SensorsDataProviderImpl(getContextProvider(), getELog(), getTimeProvider(), getSystemLocationManager(), getAppStateProvider(), this.foregroundServiceMonitor, getCoroutineContextProvider(), getLogger());
    }
}
