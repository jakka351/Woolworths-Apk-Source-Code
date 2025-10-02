package me.oriient.internal.services.runtimeDataProvider;

import me.oriient.internal.infra.utils.android.appState.AppState;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[AppState.values().length];
        try {
            iArr[AppState.UNDEFINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppState.BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AppState.FOREGROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
