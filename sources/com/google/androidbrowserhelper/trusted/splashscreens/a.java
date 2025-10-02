package com.google.androidbrowserhelper.trusted.splashscreens;

import androidx.camera.core.processing.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ PwaWrapperSplashScreenStrategy d;
    public final /* synthetic */ g e;

    public /* synthetic */ a(PwaWrapperSplashScreenStrategy pwaWrapperSplashScreenStrategy, g gVar) {
        this.d = pwaWrapperSplashScreenStrategy;
        this.e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SystemBarColorPredictor systemBarColorPredictor = PwaWrapperSplashScreenStrategy.l;
        this.e.run();
        this.d.f14789a.overridePendingTransition(0, 0);
    }
}
