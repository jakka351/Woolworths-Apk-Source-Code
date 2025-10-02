package me.oriient.internal.services.sensorsManager;

/* loaded from: classes7.dex */
public final class X implements InterfaceC1496j {
    @Override // me.oriient.internal.services.sensorsManager.InterfaceC1496j
    public final float a(float[] fArr, int i) {
        if (i != 0) {
            return fArr[i - 1];
        }
        if (fArr.length >= 4) {
            i = 3;
        }
        return fArr[i];
    }
}
