package com.lexisnexisrisk.threatmetrix.rl;

import android.content.Context;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxxxjx;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxjxxjx;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxxxjx;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlllnnl;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class TMXConfig {
    public static final int t00740074007400740074t;
    private static final long t00740074ttt0074;
    private static final int t0074t0074tt0074 = 1;
    public static final String t0074tttt0074 = jxxjjxx.ss0073sss0073s("=\u0001F6D\u0006FDIEI?\u000eMDR7-;o7-;", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354649), (char) (jxjxxjx.s0073sss0073ss() ^ 513829277));
    public static final int tt0074007400740074t;
    private static final int tt0074ttt0074;
    private static final long ttt0074tt0074;
    public static final int tttttt0074;
    private boolean t0074007400740074t0074;
    private int t007400740074t00740074;
    private boolean t007400740074tt0074;
    private int t00740074t0074t0074;
    private String t00740074tt00740074;
    private long t0074t00740074t0074;

    @Nullable
    private Context t0074t0074t00740074;
    private boolean t0074tt0074t0074;
    private boolean t0074ttt00740074;
    private long tt007400740074t0074;

    @Nullable
    private TMXProfilingConnectionsInterface tt00740074t00740074;
    private int tt00740074tt0074;
    private int tt0074t0074t0074;

    @Nullable
    private String tt0074tt00740074;
    private long ttt00740074t0074;

    @Nullable
    private String ttt0074t00740074;
    private int tttt0074t0074;
    private boolean ttttt00740074;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        tt0074007400740074t = (int) timeUnit.toMillis(30L);
        t00740074007400740074t = (int) timeUnit.toMillis(3L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        tttttt0074 = (int) timeUnit2.toMillis(30L);
        tt0074ttt0074 = (int) timeUnit2.toMillis(30L);
        t00740074ttt0074 = timeUnit.toMillis(15L);
        ttt0074tt0074 = timeUnit.toMillis(60L);
    }

    public TMXConfig() {
        int i = tt0074ttt0074;
        this.tt00740074tt0074 = i;
        this.t007400740074tt0074 = false;
        this.tttt0074t0074 = i;
        this.t0074tt0074t0074 = false;
        this.tt0074t0074t0074 = t00740074007400740074t;
        this.t00740074t0074t0074 = 1;
        this.ttt00740074t0074 = llqqqql.OPTION_ALL;
        this.t0074t00740074t0074 = t00740074ttt0074;
        this.tt007400740074t0074 = ttt0074tt0074;
        this.t0074007400740074t0074 = false;
        this.ttttt00740074 = false;
        this.t0074ttt00740074 = false;
        this.tt0074tt00740074 = null;
        this.t00740074tt00740074 = jxxjjxx.sss0073ss0073s("\u0004G\r|\u0003D\u0005\u0003\u007f{\u007fu<{r\u0001}s\u00026uky", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950925), (char) (jxjxxjx.s0073sss0073ss() ^ 513829274), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354568));
        this.ttt0074t00740074 = null;
        this.t0074t0074t00740074 = null;
        this.tt00740074t00740074 = null;
        this.t007400740074t00740074 = tttttt0074;
    }

    @Nonnull
    public TMXConfig disableInitPackageScanTimeLimit() {
        this.tt00740074tt0074 = 0;
        return this;
    }

    @Nonnull
    public TMXConfig disableNonfatalLogs() {
        lqlqqll.u0075uuuu0075(true);
        return this;
    }

    @Nonnull
    public TMXConfig disableOption(long j) {
        this.ttt00740074t0074 = (~j) & this.ttt00740074t0074;
        return this;
    }

    @Nonnull
    public TMXConfig disablePackageScanTimeLimit() {
        this.tttt0074t0074 = 0;
        return this;
    }

    @Nonnull
    public TMXConfig enableOption(long j) {
        this.ttt00740074t0074 = j | this.ttt00740074t0074;
        return this;
    }

    @Nonnull
    public TMXConfig setAdvertisingIdCollection(boolean z) {
        long j = this.ttt00740074t0074;
        this.ttt00740074t0074 = z ? j | llqqqql.cc0063cc00630063 : j & (-131073);
        return this;
    }

    @Nonnull
    public TMXConfig setApiKey(String str) {
        this.tt0074tt00740074 = str;
        return this;
    }

    @Nonnull
    public TMXConfig setContext(Context context) {
        this.t0074t0074t00740074 = context;
        return this;
    }

    @Nonnull
    public TMXConfig setDisableAppHashing(boolean z) {
        this.t0074ttt00740074 = z;
        return this;
    }

    @Nonnull
    public TMXConfig setDisableAuthenticationModule(boolean z) {
        long j = this.ttt00740074t0074;
        this.ttt00740074t0074 = z ? j & (-2097153) : j | llqqqql.cc00630063c00630063;
        return this;
    }

    @Nonnull
    public TMXConfig setDisableInitPackageScan(boolean z) {
        this.t007400740074tt0074 = z;
        return this;
    }

    @Nonnull
    public TMXConfig setDisableLocSerOnBatteryLow(boolean z) {
        this.ttttt00740074 = z;
        return this;
    }

    @Nonnull
    public TMXConfig setDisableProfilePackageScan(boolean z) {
        this.t0074tt0074t0074 = z;
        return this;
    }

    @Nonnull
    public TMXConfig setFPServer(String str) {
        this.t00740074tt00740074 = str;
        return this;
    }

    @Nonnull
    public TMXConfig setHighPowerUpdateTime(long j, @Nonnull TimeUnit timeUnit) {
        this.tt007400740074t0074 = timeUnit.toMillis(j);
        return this;
    }

    @Nonnull
    public TMXConfig setInitPackageScanTimeLimit(int i, @Nonnull TimeUnit timeUnit) {
        int millis = (int) timeUnit.toMillis(i);
        this.tt00740074tt0074 = millis;
        if (millis == 0 && i != 0) {
            this.tt00740074tt0074 = 1;
        }
        return this;
    }

    @Nonnull
    public TMXConfig setLocationAccuracy(int i) {
        this.t00740074t0074t0074 = i;
        return this;
    }

    @Nonnull
    public TMXConfig setLowPowerUpdateTime(long j, @Nonnull TimeUnit timeUnit) {
        this.t0074t00740074t0074 = timeUnit.toMillis(j);
        return this;
    }

    @Nonnull
    public TMXConfig setOrgId(String str) {
        this.ttt0074t00740074 = str;
        return this;
    }

    @Nonnull
    public TMXConfig setPackageScanTimeLimit(int i, @Nonnull TimeUnit timeUnit) {
        int millis = (int) timeUnit.toMillis(i);
        this.tttt0074t0074 = millis;
        if (millis == 0 && i != 0) {
            this.tttt0074t0074 = 1;
        }
        return this;
    }

    @Nonnull
    public TMXConfig setProfileTimeout(int i, @Nonnull TimeUnit timeUnit) {
        this.t007400740074t00740074 = (int) timeUnit.toMillis(i);
        return this;
    }

    @Nonnull
    public TMXConfig setProfilingConnections(TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface) {
        this.tt00740074t00740074 = tMXProfilingConnectionsInterface;
        return this;
    }

    @Nonnull
    public TMXConfig setRegisterForLocationServices(boolean z) {
        this.t0074007400740074t0074 = z;
        return this;
    }

    @Nonnull
    public TMXConfig setScreenOffTimeout(int i, @Nonnull TimeUnit timeUnit) {
        this.tt0074t0074t0074 = (int) timeUnit.toMillis(i);
        return this;
    }

    public int w0077007700770077www() {
        return this.t00740074t0074t0074;
    }

    public boolean w007700770077w0077ww() {
        return this.t0074007400740074t0074;
    }

    @Nullable
    public String w007700770077wwww() {
        return this.tt0074tt00740074;
    }

    public boolean w00770077w0077www() {
        return this.t0074tt0074t0074;
    }

    public int w00770077ww0077ww() {
        return this.tttt0074t0074;
    }

    public long w0077w00770077www() {
        return this.tt007400740074t0074;
    }

    @Nullable
    public TMXProfilingConnectionsInterface w0077w0077w0077ww() {
        return this.tt00740074t00740074;
    }

    public boolean w0077ww0077www() {
        return this.t007400740074tt0074;
    }

    public long w0077www0077ww() {
        long j = this.ttt00740074t0074;
        return this.t0074ttt00740074 ? j & (-12289) : j;
    }

    public int ww007700770077www() {
        return this.tt00740074tt0074;
    }

    public int ww00770077w0077ww() {
        return this.tt0074t0074t0074;
    }

    public boolean ww0077w0077www() {
        return this.ttttt00740074;
    }

    @Nullable
    public String ww0077ww0077ww() {
        return this.ttt0074t00740074;
    }

    public String www00770077www() {
        return this.t00740074tt00740074;
    }

    public int www0077w0077ww() {
        return this.t007400740074t00740074;
    }

    @Nullable
    public nlllnnl wwww0077www() {
        Context context = this.t0074t0074t00740074;
        if (context == null) {
            return null;
        }
        return new nlllnnl(context.getApplicationContext());
    }

    public long wwwww0077ww() {
        return this.t0074t00740074t0074;
    }
}
