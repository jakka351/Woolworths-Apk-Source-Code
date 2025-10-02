package me.oriient.internal.services.sensorsManager;

import me.oriient.internal.infra.utils.android.appState.AppState;

/* renamed from: me.oriient.internal.services.sensorsManager.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC1492f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[AppState.values().length];
        try {
            iArr[AppState.BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppState.FOREGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AppState.UNDEFINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
