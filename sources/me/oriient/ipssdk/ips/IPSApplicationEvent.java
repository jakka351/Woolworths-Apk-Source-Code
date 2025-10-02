package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes4.dex */
public @interface IPSApplicationEvent {
    public static final int CALIBRATION_DIALOG_HIDDEN = 1;
    public static final int CALIBRATION_DIALOG_PRESENTED = 0;
    public static final int MAP_HIDDEN = 3;
    public static final int MAP_PRESENTED = 2;
    public static final int NAVIGATION_PATH_HIDDEN = 7;
    public static final int NAVIGATION_PATH_PRESENTED = 6;
    public static final int USER_POSITION_HIDDEN = 5;
    public static final int USER_POSITION_PRESENTED = 4;
    public static final int WALK_TO_LOCK_INDICATOR_HIDDEN = 9;
    public static final int WALK_TO_LOCK_INDICATOR_PRESENTED = 8;
}
