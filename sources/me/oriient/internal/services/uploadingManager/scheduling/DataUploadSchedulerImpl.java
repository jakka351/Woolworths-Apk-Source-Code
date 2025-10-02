package me.oriient.internal.services.uploadingManager.scheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.Keep;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.persistentStorage.PersistentStorage;
import me.oriient.internal.infra.powerManager.PowerManager;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeFormattingExtKt;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.uploadingManager.models.DataUploadMode;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001RB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010%\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010ER*\u0010I\u001a\u00020G2\u0006\u0010H\u001a\u00020G8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadSchedulerImpl;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler;", "<init>", "()V", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "scheduledWork", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode$Scheduled;", "mode", "", "scheduleJobScheduler", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;Lme/oriient/internal/services/uploadingManager/models/DataUploadMode$Scheduled;)V", "cancelJobScheduler", "scheduleReceivers", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;)V", "cancelAlarmManager", "scheduleUploadControlTask", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "createControlTaskPendingIntent", "(Landroid/content/Context;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;)Landroid/app/PendingIntent;", "createChargerTaskPendingIntent", "", "getImmutablePendingIntentFlags", "()I", "scheduleChargerTask", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;", "scheduleUploading", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;)V", "cancelScheduling", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$WakeUpReason;", "reason", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "getUploadTrigger", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$WakeUpReason;)Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "contextProvider$delegate", "Lkotlin/Lazy;", "getContextProvider", "()Lme/oriient/internal/infra/utils/android/ContextProvider;", "contextProvider", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/persistentStorage/PersistentStorage;", "storage$delegate", "getStorage", "()Lme/oriient/internal/infra/persistentStorage/PersistentStorage;", "storage", "Lme/oriient/internal/infra/powerManager/PowerManager;", "powerManager$delegate", "getPowerManager", "()Lme/oriient/internal/infra/powerManager/PowerManager;", "powerManager", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;", "value", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;", "getConfig", "()Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;", "setConfig", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;)V", "currentMode", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;", "Companion", "me/oriient/internal/services/uploadingManager/scheduling/e", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DataUploadSchedulerImpl implements DataUploadScheduler {

    @NotNull
    private static final e Companion = new e();

    @NotNull
    private static final String LAST_UPLOAD_SUCCESS_KEY = "me.oriient.uploadingmananger.lastUpload";

    @NotNull
    private static final String MAX_TIME_INTERVAL_PASSED_KEY = "me.oriient.uploadingmananger.maxTimePassed";

    @NotNull
    private static final String PREF_KEY_CHARGER_TASK_INTERVAL_MIN = "me.oriient.uploadingmananger.chargerTaskIntervalMin";

    @NotNull
    private static final String PREF_KEY_CONTROL_TASK_INTERVAL_MIN = "me.oriient.uploadingmananger.controlTaskIntervalMin";

    @NotNull
    private static final String PREF_KEY_CONTROL_TASK_MAX_TIME_MIN = "me.oriient.uploadingmananger.controlTaskMaxTimeMin";

    @NotNull
    private static final String PREF_KEY_UPLOAD_TASK_MAX_DELAY_MIN = "me.oriient.uploadingmananger.uploadTaskMaxDelayMin";

    @NotNull
    private static final String TAG = "DataUploadScheduler";

    @NotNull
    private static final String TIME_DIFF_WHEN_MAX_TIME_PASSED_KEY = "me.oriient.uploadingmananger.timeDiffWhenMaxTimePassed";
    private static final int UPLOAD_JOB_ID = 558;

    @NotNull
    private DataUploadingSchedulingConfig config;

    /* renamed from: contextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy contextProvider;

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    @Nullable
    private DataUploadMode currentMode;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    /* renamed from: powerManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy powerManager;

    /* renamed from: storage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy storage;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    public DataUploadSchedulerImpl() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.contextProvider = di.inject(reflectionFactory.b(ContextProvider.class));
        this.coroutineContextProvider = InternalDiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.storage = InternalDiKt.getDi().inject(reflectionFactory.b(PersistentStorage.class));
        this.powerManager = InternalDiKt.getDi().inject(reflectionFactory.b(PowerManager.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.timeProvider = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.logger = InternalDiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.config = new DataUploadingSchedulingConfig(getStorage().getLong(PREF_KEY_CHARGER_TASK_INTERVAL_MIN, 15L), getStorage().getLong(PREF_KEY_CONTROL_TASK_INTERVAL_MIN, 120L), getStorage().getLong(PREF_KEY_CONTROL_TASK_MAX_TIME_MIN, 2880L), getStorage().getLong(PREF_KEY_UPLOAD_TASK_MAX_DELAY_MIN, 720L));
    }

    private final void cancelAlarmManager() {
        Context context = getContextProvider().getContext();
        Object systemService = context.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        if (alarmManager == null) {
            getELog().e(TAG, "no alarm manager");
            return;
        }
        getLogger().d(TAG, "cancelJobScheduler: canceled charger task");
        alarmManager.cancel(createChargerTaskPendingIntent(context, null));
        getLogger().d(TAG, "cancelJobScheduler: canceled control task");
        alarmManager.cancel(createControlTaskPendingIntent(context, null));
    }

    private final void cancelJobScheduler() {
        Object systemService = getContextProvider().getContext().getSystemService("jobscheduler");
        JobScheduler jobScheduler = systemService instanceof JobScheduler ? (JobScheduler) systemService : null;
        if (jobScheduler == null) {
            getELog().e(TAG, "JobScheduler is null!");
        } else {
            getLogger().d(TAG, "cancelJobScheduler: canceled jobScheduler job");
            jobScheduler.cancel(UPLOAD_JOB_ID);
        }
    }

    private final PendingIntent createChargerTaskPendingIntent(Context context, DataUploadScheduledWork scheduledWork) {
        Intent intent = new Intent(context, (Class<?>) DataUploadReceiver.class);
        intent.setAction(DataUploadReceiver.RECEIVER_ACTION_CHARGER);
        intent.putExtra("class_name_key", scheduledWork != null ? scheduledWork.getClass().getCanonicalName() : null);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, getImmutablePendingIntentFlags());
        Intrinsics.g(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    private final PendingIntent createControlTaskPendingIntent(Context context, DataUploadScheduledWork scheduledWork) {
        Intent intent = new Intent(context, (Class<?>) DataUploadReceiver.class);
        intent.setAction(DataUploadReceiver.RECEIVER_ACTION_CONTROL);
        intent.putExtra("class_name_key", scheduledWork != null ? scheduledWork.getClass().getCanonicalName() : null);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, getImmutablePendingIntentFlags());
        Intrinsics.g(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContextProvider getContextProvider() {
        return (ContextProvider) this.contextProvider.getD();
    }

    private final CoroutineContextProvider getCoroutineContextProvider() {
        return (CoroutineContextProvider) this.coroutineContextProvider.getD();
    }

    private final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    private final int getImmutablePendingIntentFlags() {
        return 201326592;
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final PowerManager getPowerManager() {
        return (PowerManager) this.powerManager.getD();
    }

    private final PersistentStorage getStorage() {
        return (PersistentStorage) this.storage.getD();
    }

    private final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    private final void scheduleChargerTask(DataUploadScheduledWork scheduledWork) {
        Context context = getContextProvider().getContext();
        Object systemService = context.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        if (alarmManager == null) {
            getELog().e(TAG, "no alarm manager");
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(getConfig().getChargerTaskIntervalMin());
        kotlin.reflect.jvm.internal.impl.types.checker.a.q("interval", TimeFormattingExtKt.formatMilli(millis), getELog(), TAG, "scheduleChargerTask() called");
        getLogger().d(TAG, "scheduleChargerTask: scheduling charger task");
        alarmManager.setRepeating(1, getTimeProvider().getCurrentTimeMillis() + millis, millis, createChargerTaskPendingIntent(context, scheduledWork));
    }

    private final void scheduleJobScheduler(DataUploadScheduledWork scheduledWork, DataUploadMode.Scheduled mode) {
        Context context = getContextProvider().getContext();
        Object systemService = context.getSystemService("jobscheduler");
        JobScheduler jobScheduler = systemService instanceof JobScheduler ? (JobScheduler) systemService : null;
        if (jobScheduler == null) {
            getELog().e(TAG, "JobScheduler is null!");
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(getConfig().getUploadTaskMaxDelayMin());
        getELog().d(TAG, "Scheduling upload task", MapsKt.j(new Pair("interval", TimeFormattingExtKt.formatMilli(millis)), new Pair("requireWifi", Boolean.valueOf(mode.getRequireWiFi())), new Pair("requireCharger", Boolean.valueOf(mode.getRequireCharger()))));
        JobInfo.Builder persisted = new JobInfo.Builder(UPLOAD_JOB_ID, new ComponentName(context, (Class<?>) DataUploadScheduledJob.class)).setRequiredNetworkType(mode.getRequireWiFi() ? 2 : 1).setRequiresCharging(mode.getRequireCharger()).setPeriodic(millis).setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("class_name_key", scheduledWork.getClass().getCanonicalName());
        JobInfo.Builder extras = persisted.setExtras(persistableBundle);
        getLogger().d(TAG, "scheduleChargerTask: scheduling jobScheduler task");
        jobScheduler.schedule(extras.build());
    }

    private final void scheduleReceivers(DataUploadScheduledWork scheduledWork) {
        scheduleChargerTask(scheduledWork);
        scheduleUploadControlTask(scheduledWork);
    }

    private final void scheduleUploadControlTask(DataUploadScheduledWork scheduledWork) {
        Context context = getContextProvider().getContext();
        Object systemService = context.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        if (alarmManager == null) {
            getELog().e(TAG, "no alarm manager");
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(getConfig().getControlTaskIntervalMin());
        kotlin.reflect.jvm.internal.impl.types.checker.a.q("interval", TimeFormattingExtKt.formatMilli(millis), getELog(), TAG, "scheduleUploadControlTask() called");
        getLogger().d(TAG, "scheduleChargerTask: scheduling control task");
        alarmManager.setRepeating(1, getTimeProvider().getCurrentTimeMillis() + millis, millis, createControlTaskPendingIntent(context, scheduledWork));
    }

    @Override // me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler
    public void cancelScheduling() {
        getELog().d(TAG, "cancelScheduling() called");
        cancelAlarmManager();
        cancelJobScheduler();
        this.currentMode = null;
    }

    @Override // me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler
    @NotNull
    public DataUploadingSchedulingConfig getConfig() {
        return this.config;
    }

    @Override // me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler
    @Nullable
    public DataUploadScheduler.UploadTrigger getUploadTrigger(@NotNull DataUploadScheduler.WakeUpReason reason) {
        Intrinsics.h(reason, "reason");
        int i = f.$EnumSwitchMapping$0[reason.ordinal()];
        if (i == 1) {
            if (((Boolean) getPowerManager().isCharging().getValue()).booleanValue()) {
                return DataUploadScheduler.UploadTrigger.PhoneCharging.INSTANCE;
            }
            if (getStorage().getBoolean(MAX_TIME_INTERVAL_PASSED_KEY, false)) {
                return new DataUploadScheduler.UploadTrigger.MaxDelayPassed(TimeUnit.MINUTES.toMillis(getConfig().getControlTaskMaxTimeMin()), getStorage().getLong(LAST_UPLOAD_SUCCESS_KEY, 0L), getStorage().getLong(TIME_DIFF_WHEN_MAX_TIME_PASSED_KEY, 0L));
            }
            return null;
        }
        if (i != 2) {
            if (i == 3) {
                getLogger().d(TAG, "shouldUploadOnWakeup: conditions met. can upload");
                return DataUploadScheduler.UploadTrigger.ScheduledUpload.INSTANCE;
            }
            if (i == 4) {
                return DataUploadScheduler.UploadTrigger.AggressiveMode.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }
        long j = getStorage().getLong(LAST_UPLOAD_SUCCESS_KEY, 0L);
        kotlin.reflect.jvm.internal.impl.types.checker.a.q("lastUploadTime", TimeFormattingExtKt.formatMilli(j), getELog(), TAG, "running upload control task");
        if (j <= 0) {
            getLogger().d(TAG, "shouldUploadOnWakeup: no last upload. setting current time.");
            getELog().d(TAG, "no last upload. setting current time.");
            getStorage().putLong(LAST_UPLOAD_SUCCESS_KEY, getTimeProvider().getCurrentTimeMillis());
            return null;
        }
        long millis = TimeUnit.MINUTES.toMillis(getConfig().getControlTaskMaxTimeMin());
        long currentTimeMillis = getTimeProvider().getCurrentTimeMillis() - j;
        getELog().d(TAG, "running upload control task", MapsKt.j(new Pair("lastUpload", TimeFormattingExtKt.formatMilli(currentTimeMillis)), new Pair("maxUploadInterval", TimeFormattingExtKt.formatMilli(millis))));
        if (currentTimeMillis <= millis) {
            getELog().d(TAG, "shouldUploadOnWakeup: max interval not passed", MapsKt.j(new Pair("timeFromLastUpload", Long.valueOf(currentTimeMillis)), new Pair("maxTimeMilli", Long.valueOf(millis))));
            getStorage().putBoolean(MAX_TIME_INTERVAL_PASSED_KEY, false);
            getStorage().putLong(TIME_DIFF_WHEN_MAX_TIME_PASSED_KEY, 0L);
            return null;
        }
        getLogger().d(TAG, "shouldUploadOnWakeup: max interval has passed. forcing upload now.");
        getELog().d(TAG, "max interval has passed. forcing upload now.");
        getStorage().putBoolean(MAX_TIME_INTERVAL_PASSED_KEY, true);
        getStorage().putLong(TIME_DIFF_WHEN_MAX_TIME_PASSED_KEY, currentTimeMillis);
        return new DataUploadScheduler.UploadTrigger.MaxDelayPassed(millis, j, currentTimeMillis);
    }

    @Override // me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler
    public void scheduleUploading(@NotNull DataUploadScheduledWork scheduledWork, @NotNull DataUploadMode mode) {
        Intrinsics.h(scheduledWork, "scheduledWork");
        Intrinsics.h(mode, "mode");
        getLogger().d(TAG, "scheduleUploading() called with: mode = " + mode);
        if (mode instanceof DataUploadMode.Immediate) {
            BuildersKt.c(CoroutineScopeKt.a(getCoroutineContextProvider().getDefault()), null, null, new g(scheduledWork, this, null), 3);
            return;
        }
        if (mode instanceof DataUploadMode.Scheduled) {
            if (mode.equals(this.currentMode)) {
                getLogger().d(TAG, "scheduleUploading: already scheduled");
                return;
            }
            scheduleReceivers(scheduledWork);
            scheduleJobScheduler(scheduledWork, (DataUploadMode.Scheduled) mode);
            this.currentMode = mode;
        }
    }

    @Override // me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler
    public void setConfig(@NotNull DataUploadingSchedulingConfig value) {
        Intrinsics.h(value, "value");
        this.config = value;
        getStorage().putLong(PREF_KEY_CHARGER_TASK_INTERVAL_MIN, value.getChargerTaskIntervalMin());
        getStorage().putLong(PREF_KEY_CONTROL_TASK_INTERVAL_MIN, value.getControlTaskIntervalMin());
        getStorage().putLong(PREF_KEY_CONTROL_TASK_MAX_TIME_MIN, value.getControlTaskMaxTimeMin());
        getStorage().putLong(PREF_KEY_UPLOAD_TASK_MAX_DELAY_MIN, value.getUploadTaskMaxDelayMin());
    }
}
