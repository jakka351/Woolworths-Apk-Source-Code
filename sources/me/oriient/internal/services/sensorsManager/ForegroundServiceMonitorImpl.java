package me.oriient.internal.services.sensorsManager;

import android.app.ActivityManager;
import androidx.annotation.Keep;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010&R\"\u0010)\u001a\u00020(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u00101\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\"\u0004\b3\u00104R(\u00105\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b5\u00102\"\u0004\b6\u00104¨\u00069"}, d2 = {"Lme/oriient/internal/services/sensorsManager/ForegroundServiceMonitorImpl;", "Lme/oriient/internal/services/sensorsManager/ForegroundServiceMonitor;", "<init>", "()V", "", "onEnteredBackground", "backgroundPollingTask", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onEnteredForeground", "", "isForegroundServiceActive", "()Z", "startMonitoring", "stopMonitoring", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "contextProvider$delegate", "Lkotlin/Lazy;", "getContextProvider", "()Lme/oriient/internal/infra/utils/android/ContextProvider;", "contextProvider", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "appStateProvider$delegate", "getAppStateProvider", "()Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "appStateProvider", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "", "backgroundCheckIntervalMillis", "J", "getBackgroundCheckIntervalMillis", "()J", "setBackgroundCheckIntervalMillis", "(J)V", "Lkotlinx/coroutines/Job;", "value", "appStateListenerJob", "Lkotlinx/coroutines/Job;", "setAppStateListenerJob", "(Lkotlinx/coroutines/Job;)V", "backgroundPollingJob", "setBackgroundPollingJob", "Companion", "me/oriient/internal/services/sensorsManager/b", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ForegroundServiceMonitorImpl implements ForegroundServiceMonitor {

    @NotNull
    private static final C1488b Companion = new C1488b();

    @NotNull
    private static final String TAG = "ForegroundServiceMonitor";

    @Nullable
    private Job appStateListenerJob;

    /* renamed from: appStateProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appStateProvider;
    private long backgroundCheckIntervalMillis;

    @Nullable
    private Job backgroundPollingJob;

    /* renamed from: contextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy contextProvider;

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    public ForegroundServiceMonitorImpl() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.contextProvider = di.inject(reflectionFactory.b(ContextProvider.class));
        this.coroutineContextProvider = InternalDiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.appStateProvider = InternalDiKt.getDi().inject(reflectionFactory.b(AppStateProvider.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.logger = InternalDiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.backgroundCheckIntervalMillis = Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object backgroundPollingTask(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.sensorsManager.C1489c
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.sensorsManager.c r0 = (me.oriient.internal.services.sensorsManager.C1489c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.services.sensorsManager.c r0 = new me.oriient.internal.services.sensorsManager.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            me.oriient.internal.services.sensorsManager.ForegroundServiceMonitorImpl r0 = r0.f25567a
            kotlin.ResultKt.b(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.ResultKt.b(r7)
            long r4 = r6.getBackgroundCheckIntervalMillis()
            r0.f25567a = r6
            r0.d = r3
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            r0 = r6
        L44:
            me.oriient.internal.services.elog.ELog r7 = r0.getELog()
            boolean r1 = r0.isForegroundServiceActive()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = "foregroundServiceActive"
            r2.<init>(r3, r1)
            java.util.Map r1 = kotlin.collections.MapsKt.i(r2)
            java.lang.String r2 = "ForegroundServiceMonitor"
            java.lang.String r3 = "App in background"
            r7.d(r2, r3, r1)
            me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider r7 = r0.getCoroutineContextProvider()
            kotlin.coroutines.CoroutineContext r7 = r7.getDefault()
            kotlinx.coroutines.internal.ContextScope r7 = kotlinx.coroutines.CoroutineScopeKt.a(r7)
            me.oriient.internal.services.sensorsManager.d r1 = new me.oriient.internal.services.sensorsManager.d
            r2 = 0
            r1.<init>(r0, r2)
            r3 = 3
            kotlinx.coroutines.Job r7 = kotlinx.coroutines.BuildersKt.c(r7, r2, r2, r1, r3)
            r0.setBackgroundPollingJob(r7)
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.ForegroundServiceMonitorImpl.backgroundPollingTask(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppStateProvider getAppStateProvider() {
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

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final boolean isForegroundServiceActive() throws SecurityException {
        Object systemService = getContextProvider().getContext().getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return false;
        }
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
        Intrinsics.g(runningServices, "getRunningServices(...)");
        if (!(runningServices instanceof Collection) || !runningServices.isEmpty()) {
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (runningServiceInfo.foreground && Intrinsics.c(runningServiceInfo.service.getPackageName(), getContextProvider().getContext().getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEnteredBackground() {
        getELog().i(TAG, "App entered background", MapsKt.i(new Pair("foregroundServiceActive", Boolean.valueOf(isForegroundServiceActive()))));
        setBackgroundPollingJob(BuildersKt.c(CoroutineScopeKt.a(getCoroutineContextProvider().getDefault()), null, null, new C1491e(this, null), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEnteredForeground() {
        getELog().d(TAG, "App entered foreground", MapsKt.i(new Pair("foregroundServiceActive", Boolean.valueOf(isForegroundServiceActive()))));
        setBackgroundPollingJob(null);
    }

    private final void setAppStateListenerJob(Job job) {
        Job job2 = this.appStateListenerJob;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.appStateListenerJob = job;
    }

    private final void setBackgroundPollingJob(Job job) {
        Job job2 = this.backgroundPollingJob;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.backgroundPollingJob = job;
    }

    @Override // me.oriient.internal.services.sensorsManager.ForegroundServiceMonitor
    public long getBackgroundCheckIntervalMillis() {
        return this.backgroundCheckIntervalMillis;
    }

    @Override // me.oriient.internal.services.sensorsManager.ForegroundServiceMonitor
    public void setBackgroundCheckIntervalMillis(long j) {
        this.backgroundCheckIntervalMillis = j;
    }

    @Override // me.oriient.internal.services.sensorsManager.ForegroundServiceMonitor
    public void startMonitoring() {
        getLogger().d(TAG, "startMonitoring() called");
        setAppStateListenerJob(BuildersKt.c(CoroutineScopeKt.a(getCoroutineContextProvider().getDefault()), null, null, new C1494h(this, null), 3));
    }

    @Override // me.oriient.internal.services.sensorsManager.ForegroundServiceMonitor
    public void stopMonitoring() {
        getLogger().d(TAG, "stopMonitoring() called");
        setAppStateListenerJob(null);
        setBackgroundPollingJob(null);
    }
}
