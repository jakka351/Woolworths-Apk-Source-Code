package me.oriient.internal.services.uploadingManager.scheduling;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.uploadingManager.models.DataUploadMode;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00132\u00020\u0001:\u0003\u0013\u0014\u0015J\b\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;", "getConfig", "()Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;", "setConfig", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;)V", "cancelScheduling", "", "getUploadTrigger", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "reason", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$WakeUpReason;", "scheduleUploading", "scheduledWork", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "mode", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;", "Companion", "UploadTrigger", "WakeUpReason", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataUploadScheduler extends DiProvidable {

    @NotNull
    public static final String CLASS_NAME_KEY = "class_name_key";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$Companion;", "", "()V", "CLASS_NAME_KEY", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String CLASS_NAME_KEY = "class_name_key";

        private Companion() {
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AggressiveMode", "MaxDelayPassed", "PhoneCharging", "ScheduledUpload", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger$AggressiveMode;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger$MaxDelayPassed;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger$PhoneCharging;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger$ScheduledUpload;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class UploadTrigger {

        @NotNull
        private final String value;

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger$AggressiveMode;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AggressiveMode extends UploadTrigger {

            @NotNull
            public static final AggressiveMode INSTANCE = new AggressiveMode();

            private AggressiveMode() {
                super("Aggressive mode", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger$MaxDelayPassed;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "maxDelayMillis", "", "lastUploadMillis", "diffMillis", "(JJJ)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MaxDelayPassed extends UploadTrigger {
            /* JADX WARN: Illegal instructions before constructor call */
            public MaxDelayPassed(long j, long j2, long j3) {
                StringBuilder sbT = androidx.camera.core.impl.b.t(j, "max delay of ", " passed since last upload at ");
                sbT.append(j2);
                super(au.com.woolworths.shop.checkout.ui.confirmation.c.m(j3, ". diff - ", sbT), null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger$PhoneCharging;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PhoneCharging extends UploadTrigger {

            @NotNull
            public static final PhoneCharging INSTANCE = new PhoneCharging();

            private PhoneCharging() {
                super("Phone is charging", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger$ScheduledUpload;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ScheduledUpload extends UploadTrigger {

            @NotNull
            public static final ScheduledUpload INSTANCE = new ScheduledUpload();

            private ScheduledUpload() {
                super("Scheduled upload", null);
            }
        }

        public /* synthetic */ UploadTrigger(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        private UploadTrigger(String str) {
            this.value = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$WakeUpReason;", "", "(Ljava/lang/String;I)V", "CHARGER_RECEIVER", "CONTROL_RECEIVER", "SCHEDULED_JOB", "AGGRESSIVE_MODE", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WakeUpReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WakeUpReason[] $VALUES;
        public static final WakeUpReason CHARGER_RECEIVER = new WakeUpReason("CHARGER_RECEIVER", 0);
        public static final WakeUpReason CONTROL_RECEIVER = new WakeUpReason("CONTROL_RECEIVER", 1);
        public static final WakeUpReason SCHEDULED_JOB = new WakeUpReason("SCHEDULED_JOB", 2);
        public static final WakeUpReason AGGRESSIVE_MODE = new WakeUpReason("AGGRESSIVE_MODE", 3);

        private static final /* synthetic */ WakeUpReason[] $values() {
            return new WakeUpReason[]{CHARGER_RECEIVER, CONTROL_RECEIVER, SCHEDULED_JOB, AGGRESSIVE_MODE};
        }

        static {
            WakeUpReason[] wakeUpReasonArr$values = $values();
            $VALUES = wakeUpReasonArr$values;
            $ENTRIES = EnumEntriesKt.a(wakeUpReasonArr$values);
        }

        private WakeUpReason(String str, int i) {
        }

        @NotNull
        public static EnumEntries<WakeUpReason> getEntries() {
            return $ENTRIES;
        }

        public static WakeUpReason valueOf(String str) {
            return (WakeUpReason) Enum.valueOf(WakeUpReason.class, str);
        }

        public static WakeUpReason[] values() {
            return (WakeUpReason[]) $VALUES.clone();
        }
    }

    void cancelScheduling();

    @NotNull
    DataUploadingSchedulingConfig getConfig();

    @Nullable
    UploadTrigger getUploadTrigger(@NotNull WakeUpReason reason);

    void scheduleUploading(@NotNull DataUploadScheduledWork scheduledWork, @NotNull DataUploadMode mode);

    void setConfig(@NotNull DataUploadingSchedulingConfig dataUploadingSchedulingConfig);
}
