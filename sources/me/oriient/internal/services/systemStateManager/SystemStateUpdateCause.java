package me.oriient.internal.services.systemStateManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lme/oriient/internal/services/systemStateManager/SystemStateUpdateCause;", "", "uploadableName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getUploadableName", "()Ljava/lang/String;", "SESSION_START", "CALIBRATION_NEEDED", "POSITION_LOCKED", "CALIBRATION_ACTIVE", "APP_STATE", "CALIBRATION_DIALOG", "MAP", "USER_POSITION", "NAVIGATION_PATH", "WALK_TO_LOCK_INDICATOR", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SystemStateUpdateCause {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SystemStateUpdateCause[] $VALUES;

    @NotNull
    private final String uploadableName;
    public static final SystemStateUpdateCause SESSION_START = new SystemStateUpdateCause("SESSION_START", 0, "sessionStart");
    public static final SystemStateUpdateCause CALIBRATION_NEEDED = new SystemStateUpdateCause("CALIBRATION_NEEDED", 1, "calibrationNeeded");
    public static final SystemStateUpdateCause POSITION_LOCKED = new SystemStateUpdateCause("POSITION_LOCKED", 2, "positionLocked");
    public static final SystemStateUpdateCause CALIBRATION_ACTIVE = new SystemStateUpdateCause("CALIBRATION_ACTIVE", 3, "calibrationActive");
    public static final SystemStateUpdateCause APP_STATE = new SystemStateUpdateCause("APP_STATE", 4, "appState");
    public static final SystemStateUpdateCause CALIBRATION_DIALOG = new SystemStateUpdateCause("CALIBRATION_DIALOG", 5, "calibrationDialog");
    public static final SystemStateUpdateCause MAP = new SystemStateUpdateCause("MAP", 6, "map");
    public static final SystemStateUpdateCause USER_POSITION = new SystemStateUpdateCause("USER_POSITION", 7, "userPosition");
    public static final SystemStateUpdateCause NAVIGATION_PATH = new SystemStateUpdateCause("NAVIGATION_PATH", 8, "navigationPath");
    public static final SystemStateUpdateCause WALK_TO_LOCK_INDICATOR = new SystemStateUpdateCause("WALK_TO_LOCK_INDICATOR", 9, "walkToLockIndicator");

    private static final /* synthetic */ SystemStateUpdateCause[] $values() {
        return new SystemStateUpdateCause[]{SESSION_START, CALIBRATION_NEEDED, POSITION_LOCKED, CALIBRATION_ACTIVE, APP_STATE, CALIBRATION_DIALOG, MAP, USER_POSITION, NAVIGATION_PATH, WALK_TO_LOCK_INDICATOR};
    }

    static {
        SystemStateUpdateCause[] systemStateUpdateCauseArr$values = $values();
        $VALUES = systemStateUpdateCauseArr$values;
        $ENTRIES = EnumEntriesKt.a(systemStateUpdateCauseArr$values);
    }

    private SystemStateUpdateCause(String str, int i, String str2) {
        this.uploadableName = str2;
    }

    @NotNull
    public static EnumEntries<SystemStateUpdateCause> getEntries() {
        return $ENTRIES;
    }

    public static SystemStateUpdateCause valueOf(String str) {
        return (SystemStateUpdateCause) Enum.valueOf(SystemStateUpdateCause.class, str);
    }

    public static SystemStateUpdateCause[] values() {
        return (SystemStateUpdateCause[]) $VALUES.clone();
    }

    @NotNull
    public final String getUploadableName() {
        return this.uploadableName;
    }
}
