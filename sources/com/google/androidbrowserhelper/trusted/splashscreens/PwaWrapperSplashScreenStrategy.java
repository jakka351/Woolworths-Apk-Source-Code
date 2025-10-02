package com.google.androidbrowserhelper.trusted.splashscreens;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;
import androidx.camera.core.processing.f;
import androidx.camera.core.processing.g;
import com.google.androidbrowserhelper.trusted.LauncherActivity;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public class PwaWrapperSplashScreenStrategy implements SplashScreenStrategy {
    public static final SystemBarColorPredictor l;

    /* renamed from: a, reason: collision with root package name */
    public final LauncherActivity f14789a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public Bitmap f;
    public SplashImageTransferTask g;
    public String h;
    public boolean i;
    public boolean j;
    public a k;

    static {
        SystemBarColorPredictor systemBarColorPredictor = new SystemBarColorPredictor();
        systemBarColorPredictor.f14792a = new HashMap();
        l = systemBarColorPredictor;
    }

    public PwaWrapperSplashScreenStrategy(LauncherActivity launcherActivity, int i, int i2, int i3, String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        this.j = false;
        this.b = i;
        this.c = i2;
        this.f14789a = launcherActivity;
        this.d = str;
        this.e = i3;
    }

    @Override // com.google.androidbrowserhelper.trusted.splashscreens.SplashScreenStrategy
    public final void a(TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder, CustomTabsSession customTabsSession, g gVar) throws ExecutionException, InterruptedException {
        if (!this.i || this.f == null) {
            gVar.run();
            return;
        }
        if (TextUtils.isEmpty(this.d)) {
            Log.w("SplashScreenStrategy", "FileProvider authority not specified, can't transfer splash image.");
            gVar.run();
            return;
        }
        SplashImageTransferTask splashImageTransferTask = new SplashImageTransferTask(this.f14789a, this.f, this.d, customTabsSession, this.h);
        this.g = splashImageTransferTask;
        splashImageTransferTask.f = new f(8, this, trustedWebActivityIntentBuilder, gVar);
        splashImageTransferTask.g.execute(new Void[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    @Override // com.google.androidbrowserhelper.trusted.splashscreens.SplashScreenStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r12, androidx.browser.trusted.TrustedWebActivityIntentBuilder r13) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.androidbrowserhelper.trusted.splashscreens.PwaWrapperSplashScreenStrategy.b(java.lang.String, androidx.browser.trusted.TrustedWebActivityIntentBuilder):void");
    }
}
