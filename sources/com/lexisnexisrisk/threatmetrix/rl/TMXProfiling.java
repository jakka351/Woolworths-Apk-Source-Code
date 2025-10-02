package com.lexisnexisrisk.threatmetrix.rl;

import android.content.Context;
import com.lexisnexisrisk.threatmetrix.rl.TMXStrongAuth;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqllqqq;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlllnnl;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnnlnll;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class TMXProfiling extends jjjxxjj {
    private Timer t0074t0074007400740074;
    private int tt00740074007400740074;
    private volatile boolean ttt0074007400740074;
    private static final String tt0074t007400740074 = lqlqqll.u00750075u00750075u(TMXProfiling.class);

    @Nullable
    private static volatile TMXProfiling t00740074t007400740074 = null;

    private TMXProfiling() {
        super(new nnnlnll());
        this.ttt0074007400740074 = true;
    }

    @Nonnull
    public static TMXProfiling getInstance() {
        TMXProfiling tMXProfiling = t00740074t007400740074;
        return tMXProfiling != null ? tMXProfiling : w00770077w00770077ww();
    }

    @Nonnull
    private static synchronized TMXProfiling w00770077w00770077ww() {
        TMXProfiling tMXProfiling = t00740074t007400740074;
        if (tMXProfiling != null) {
            return tMXProfiling;
        }
        TMXProfiling tMXProfiling2 = new TMXProfiling();
        t00740074t007400740074 = tMXProfiling2;
        return tMXProfiling2;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public /* bridge */ /* synthetic */ void deregisterUser(@Nonnull String str, @Nullable TMXEndNotifier tMXEndNotifier) {
        super.deregisterUser(str, tMXEndNotifier);
    }

    public HybridAppWithNTFSupport getCordovaSupport() {
        return this.v007600760076v0076v;
    }

    public HybridAppWithNTFSupport getFlutterSupport() {
        return this.v007600760076v0076v;
    }

    public HybridAppWithNTFSupport getJetpackComposeSupport() {
        return this.v007600760076v0076v;
    }

    public ReactNativeSupport getReactNativeSupport() {
        return this.vv00760076v0076v;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public /* bridge */ /* synthetic */ void getUserContextRegisteredStatus(@Nonnull String str, @Nullable TMXEndNotifier tMXEndNotifier) {
        super.getUserContextRegisteredStatus(str, tMXEndNotifier);
    }

    public void init(Context context, String str) throws IllegalStateException, IllegalArgumentException {
        init(new TMXConfig().setContext(context).setOrgId(str));
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public /* bridge */ /* synthetic */ void pauseLocationServices(boolean z) {
        super.pauseLocationServices(z);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    @Nullable
    public /* bridge */ /* synthetic */ String processStrongAuthMessage(@Nonnull TMXStrongAuth.StrongAuthConfiguration strongAuthConfiguration, @Nonnull TMXStrongAuth.StrongAuthCallback strongAuthCallback, @Nullable TMXEndNotifier tMXEndNotifier) {
        return super.processStrongAuthMessage(strongAuthConfiguration, strongAuthCallback, tMXEndNotifier);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public /* bridge */ /* synthetic */ TMXProfilingHandle profile(@Nonnull TMXEndNotifier tMXEndNotifier) {
        return super.profile(tMXEndNotifier);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    @Nullable
    public /* bridge */ /* synthetic */ String registerUser(@Nonnull String str, @Nullable String str2, @Nonnull String str3, @Nonnull TMXStrongAuth.StrongAuthCallback strongAuthCallback, @Nullable TMXEndNotifier tMXEndNotifier) {
        return super.registerUser(str, str2, str3, strongAuthCallback, tMXEndNotifier);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public /* bridge */ /* synthetic */ boolean scanPackages() {
        return super.scanPackages();
    }

    public void w0077w007700770077ww() {
        synchronized (this) {
            try {
                this.ttt0074007400740074 = true;
                this.v0076vv0076v0076 = true;
                Timer timer = this.t0074t0074007400740074;
                if (timer != null) {
                    timer.cancel();
                }
                lqlqqll.uuu007500750075u(tt0074t007400740074, "Screen is on profiling is unblocked.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public void w0077ww00770077ww(nlllnnl nlllnnlVar) {
        if (this.tt00740074007400740074 > 0) {
            lqllqqq.g0067gggg00670067(this, nlllnnlVar);
        }
    }

    public void ww0077007700770077ww() throws InterruptedException {
        this.v0076v0076vv0076.g006700670067gggg(this.vvvv0076v0076);
        w00770077w0077ww0077();
        this.v0076v0076vv0076.g0067gggggg();
        t00740074t007400740074 = null;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public void ww0077w00770077ww(@Nonnull TMXConfig tMXConfig) {
        this.ttt0074007400740074 = true;
        this.tt00740074007400740074 = jjjxxjj.www007700770077w0077(tMXConfig.ww00770077w0077ww(), TMXConfig.tt0074007400740074t, "screenOffTimeout");
        Timer timer = this.t0074t0074007400740074;
        if (timer != null) {
            timer.cancel();
        }
        jjjxxjj.w0077w007700770077w0077(tMXConfig.wwwww0077ww(), 0L, "LowPowerUpdateTime");
        jjjxxjj.w0077w007700770077w0077(tMXConfig.w0077w00770077www(), 0L, "HighPowerUpdateTime");
        jjjxxjj.www007700770077w0077(tMXConfig.w0077007700770077www(), 2, "location accuracy");
        jjjxxjj.v0076v0076v0076v.hhhh0068hh(tMXConfig.wwww0077www().ww0077w007700770077);
    }

    public void www007700770077ww() {
        this.ttt0074007400740074 = false;
        lqlqqll.uuu007500750075u(tt0074t007400740074, "Screen is off, any future profiling will be blocked after " + this.tt00740074007400740074 + " milliseconds.");
        Timer timer = this.t0074t0074007400740074;
        if (timer != null) {
            timer.cancel();
        }
        this.t0074t0074007400740074 = new Timer();
        this.t0074t0074007400740074.schedule(new TimerTask() { // from class: com.lexisnexisrisk.threatmetrix.rl.TMXProfiling.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                synchronized (this) {
                    try {
                        if (!TMXProfiling.this.ttt0074007400740074) {
                            TMXProfiling.this.v0076vv0076v0076 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, this.tt00740074007400740074);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public /* bridge */ /* synthetic */ void init(@Nonnull TMXConfig tMXConfig) throws IllegalStateException, IllegalArgumentException {
        super.init(tMXConfig);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    @Nullable
    public /* bridge */ /* synthetic */ String processStrongAuthMessage(@Nonnull Object obj, @Nonnull TMXStrongAuth.StrongAuthCallback strongAuthCallback, @Nullable TMXEndNotifier tMXEndNotifier) {
        return super.processStrongAuthMessage(obj, strongAuthCallback, tMXEndNotifier);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public /* bridge */ /* synthetic */ TMXProfilingHandle profile(@Nonnull TMXProfilingOptions tMXProfilingOptions, @Nonnull TMXEndNotifier tMXEndNotifier) {
        return super.profile(tMXProfilingOptions, tMXEndNotifier);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public /* bridge */ /* synthetic */ boolean scanPackages(int i, @Nonnull TimeUnit timeUnit, @Nullable TMXScanEndNotifier tMXScanEndNotifier) {
        return super.scanPackages(i, timeUnit, tMXScanEndNotifier);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public /* bridge */ /* synthetic */ TMXProfilingHandle profile(@Nonnull String str, @Nonnull TMXEndNotifier tMXEndNotifier) {
        return super.profile(str, tMXEndNotifier);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj
    public /* bridge */ /* synthetic */ boolean scanPackages(TMXScanEndNotifier tMXScanEndNotifier) {
        return super.scanPackages(tMXScanEndNotifier);
    }
}
