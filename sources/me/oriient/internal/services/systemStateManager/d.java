package me.oriient.internal.services.systemStateManager;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[UiElementState.values().length];
        try {
            iArr[UiElementState.PRESENTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UiElementState.HIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UiElementState.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
