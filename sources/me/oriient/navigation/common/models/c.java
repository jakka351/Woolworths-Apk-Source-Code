package me.oriient.navigation.common.models;

import me.oriient.navigation.common.models.TransitionCore;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TransitionCore.a.values().length];
        try {
            iArr[TransitionCore.a.ESCALATOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransitionCore.a.ELEVATOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransitionCore.a.STAIRS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransitionCore.a.RAMP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransitionCore.a.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
