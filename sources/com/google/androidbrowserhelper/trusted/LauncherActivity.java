package com.google.androidbrowserhelper.trusted;

import android.app.Activity;
import android.os.Bundle;
import com.google.androidbrowserhelper.trusted.TwaLauncher;
import com.google.androidbrowserhelper.trusted.splashscreens.PwaWrapperSplashScreenStrategy;
import com.google.androidbrowserhelper.trusted.splashscreens.SplashImageTransferTask;

/* loaded from: classes6.dex */
public class LauncherActivity extends Activity {
    public static boolean i;
    public static int j;
    public LauncherActivityMetadata d;
    public boolean e;
    public PwaWrapperSplashScreenStrategy f;
    public final QualityEnforcer g = new QualityEnforcer();
    public TwaLauncher h;

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02e1, code lost:
    
        if (r2.queryIntentServices(r6, 64).size() > 0) goto L121;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.androidbrowserhelper.trusted.LauncherActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        SplashImageTransferTask splashImageTransferTask;
        super.onDestroy();
        j--;
        TwaLauncher twaLauncher = this.h;
        if (twaLauncher != null && !twaLauncher.h) {
            TwaLauncher.TwaCustomTabsServiceConnection twaCustomTabsServiceConnection = twaLauncher.e;
            if (twaCustomTabsServiceConnection != null) {
                twaLauncher.f14785a.unbindService(twaCustomTabsServiceConnection);
            }
            twaLauncher.f14785a = null;
            twaLauncher.h = true;
        }
        PwaWrapperSplashScreenStrategy pwaWrapperSplashScreenStrategy = this.f;
        if (pwaWrapperSplashScreenStrategy == null || (splashImageTransferTask = pwaWrapperSplashScreenStrategy.g) == null) {
            return;
        }
        splashImageTransferTask.g.cancel(true);
        splashImageTransferTask.f = null;
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        PwaWrapperSplashScreenStrategy pwaWrapperSplashScreenStrategy = this.f;
        if (pwaWrapperSplashScreenStrategy != null) {
            pwaWrapperSplashScreenStrategy.j = true;
            com.google.androidbrowserhelper.trusted.splashscreens.a aVar = pwaWrapperSplashScreenStrategy.k;
            if (aVar != null) {
                aVar.run();
                pwaWrapperSplashScreenStrategy.k = null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.e) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("android.support.customtabs.trusted.BROWSER_WAS_LAUNCHED_KEY", this.e);
    }
}
