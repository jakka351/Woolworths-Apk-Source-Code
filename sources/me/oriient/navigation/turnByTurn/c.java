package me.oriient.navigation.turnByTurn;

import me.oriient.navigation.turnByTurn.models.TurnAroundState;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TurnAroundState.values().length];
        try {
            iArr[TurnAroundState.NO_TURN_AROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TurnAroundState.TURN_AROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TurnAroundState.TURN_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TurnAroundState.TURN_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
