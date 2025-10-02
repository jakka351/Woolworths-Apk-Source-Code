package me.oriient.ipssdk.api.models;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import me.oriient.ipssdk.api.utils.OriientExperimentalApi;

@Retention(RetentionPolicy.SOURCE)
@OriientExperimentalApi
/* loaded from: classes2.dex */
public @interface IPSNavigationInstructionDirection {
    public static final int ARRIVED = 5;
    public static final int CONTINUE_STRAIGHT = 3;
    public static final int CONTINUE_STRAIGHT_TO_DESTINATION = 4;
    public static final int TURN_AROUND = 2;
    public static final int TURN_AROUND_LEFT = 7;
    public static final int TURN_AROUND_RIGHT = 6;
    public static final int TURN_LEFT = 1;
    public static final int TURN_RIGHT = 0;
}
