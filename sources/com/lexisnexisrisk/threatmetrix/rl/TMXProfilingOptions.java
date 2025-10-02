package com.lexisnexisrisk.threatmetrix.rl;

import android.app.Activity;
import android.location.Location;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class TMXProfilingOptions {
    public static final int qqqq0071qq = Integer.MAX_VALUE;
    private String q0071qq0071qq;
    private String q0071qqq0071q;
    private List<String> qq0071q0071qq;

    @Nullable
    private jjxjxjj.GenericLocation qq0071qq0071q;
    private boolean qqqqq0071q;
    public static final String qq00710071qqq = lqlqqll.u00750075u00750075u(TMXProfilingOptions.class);
    public static final int q007100710071qqq = (int) TimeUnit.MINUTES.toSeconds(5);
    private boolean q00710071q0071qq = false;
    private int qqq00710071qq = Integer.MAX_VALUE;
    private Activity q0071q00710071qq = null;
    private final Set<String> qq007100710071qq = new HashSet();
    private final Set<String> q0071007100710071qq = new HashSet();

    @Nonnull
    public TMXProfilingOptions disableBehavioSec() {
        this.q00710071q0071qq = true;
        return this;
    }

    public TMXProfilingOptions setBehavioSecDuration(int i, TimeUnit timeUnit) {
        if (i <= 0) {
            lqlqqll.uuuu00750075u(qq00710071qqq, "An invalid duration value has been entered.");
            this.qqq00710071qq = Integer.MAX_VALUE;
            return this;
        }
        long seconds = timeUnit.toSeconds(i);
        int i2 = q007100710071qqq;
        if (seconds <= i2) {
            this.qqq00710071qq = (int) seconds;
            return this;
        }
        lqlqqll.uuuu00750075u(qq00710071qqq, "A value greater than the maximum duration value of 5 minutes has been entered. The Behavioral Biometrics Duration for this profiling event will default to 5 minutes.");
        this.qqq00710071qq = i2;
        return this;
    }

    @Nonnull
    public TMXProfilingOptions setCustomAttributes(List<String> list) {
        this.qq0071q0071qq = list;
        return this;
    }

    @Nonnull
    public TMXProfilingOptions setLocation(Location location) {
        if (nnlllnn.nnnnlln.f0066fff0066f()) {
            this.qq0071qq0071q = lqlllll.y007900790079yyy(location, true);
        }
        return this;
    }

    @Nonnull
    public TMXProfilingOptions setSessionID(String str) {
        this.q0071qq0071qq = str;
        return this;
    }

    public TMXProfilingOptions setTMXBehavioSecIncludedActivities(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            this.qq007100710071qq.addAll(set);
        }
        return this;
    }

    public TMXProfilingOptions setTMXBehavioSecInjectJavascriptCollector(boolean z) {
        this.qqqqq0071q = z;
        return this;
    }

    public TMXProfilingOptions setTMXBehavioSecMaskedFields(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            this.q0071007100710071qq.addAll(set);
        }
        return this;
    }

    public TMXProfilingOptions setTMXBehavioSecRunningActivity(Activity activity) {
        this.q0071q00710071qq = activity;
        return this;
    }

    public TMXProfilingOptions setTMXBehavioSecWebFieldIdentifierAttribute(String str) {
        this.q0071qqq0071q = str;
        return this;
    }

    public int w00770077007700770077ww() {
        return this.qqq00710071qq;
    }

    public String w007700770077ww0077w() {
        return this.q0071qqq0071q;
    }

    public Set<String> w00770077www0077w() {
        return this.qq007100710071qq;
    }

    public Set<String> w0077w0077ww0077w() {
        return this.q0071007100710071qq;
    }

    public jjxjxjj.GenericLocation w0077wwww0077w() {
        return this.qq0071qq0071q;
    }

    public Activity ww00770077ww0077w() {
        return this.q0071q00710071qq;
    }

    public String ww0077www0077w() {
        return this.q0071qq0071qq;
    }

    public boolean www0077ww0077w() {
        return this.qqqqq0071q;
    }

    public boolean wwww0077w0077w() {
        return this.q00710071q0071qq;
    }

    public List<String> wwwwww0077w() {
        return this.qq0071q0071qq;
    }
}
