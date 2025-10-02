package me.oriient.internal.services.eventManager;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[EventManagerState.values().length];
        try {
            iArr[EventManagerState.ONLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventManagerState.OFFLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EventManagerState.DISCONNECTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EventManagerState.CONNECTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
