package me.oriient.internal.services.uploadingManager.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSessionType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DL_TRAINING_PDR", "REMOTE_MAPPING", "TRACKING", "POSITIONING", "CALIBRATION", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataUploaderSessionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataUploaderSessionType[] $VALUES;

    @NotNull
    private final String value;
    public static final DataUploaderSessionType DL_TRAINING_PDR = new DataUploaderSessionType("DL_TRAINING_PDR", 0, "dlTrainingPdr");
    public static final DataUploaderSessionType REMOTE_MAPPING = new DataUploaderSessionType("REMOTE_MAPPING", 1, "remoteMapping");
    public static final DataUploaderSessionType TRACKING = new DataUploaderSessionType("TRACKING", 2, "tracking");
    public static final DataUploaderSessionType POSITIONING = new DataUploaderSessionType("POSITIONING", 3, "startRtPositioning");
    public static final DataUploaderSessionType CALIBRATION = new DataUploaderSessionType("CALIBRATION", 4, "startRtCalibration");

    private static final /* synthetic */ DataUploaderSessionType[] $values() {
        return new DataUploaderSessionType[]{DL_TRAINING_PDR, REMOTE_MAPPING, TRACKING, POSITIONING, CALIBRATION};
    }

    static {
        DataUploaderSessionType[] dataUploaderSessionTypeArr$values = $values();
        $VALUES = dataUploaderSessionTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(dataUploaderSessionTypeArr$values);
    }

    private DataUploaderSessionType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<DataUploaderSessionType> getEntries() {
        return $ENTRIES;
    }

    public static DataUploaderSessionType valueOf(String str) {
        return (DataUploaderSessionType) Enum.valueOf(DataUploaderSessionType.class, str);
    }

    public static DataUploaderSessionType[] values() {
        return (DataUploaderSessionType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
