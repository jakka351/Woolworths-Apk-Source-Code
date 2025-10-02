package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.app.Activity;
import com.lexisnexisrisk.threatmetrix.rl.HybridAppSupport;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class nnnllll implements HybridAppSupport {
    private static final String k006Bk006Bkk006B = lqlqqll.u00750075u00750075u(nnnllll.class);
    public final lqlllql k006B006B006Bkk006B;
    public final AtomicBoolean kk006B006Bkk006B;

    public nnnllll() {
        this.kk006B006Bkk006B = new AtomicBoolean(false);
        this.k006B006B006Bkk006B = null;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.HybridAppSupport
    public void clearRegistrations(@Nonnull Activity activity) {
        lqlllql lqlllqlVar;
        if (!this.kk006B006Bkk006B.get() || (lqlllqlVar = this.k006B006B006Bkk006B) == null) {
            lqlqqll.uuu007500750075u(k006Bk006Bkk006B, "Failed to set page name: TMXProfiling is not configured or argument is not valid.");
        } else {
            lqlllqlVar.u00750075u007500750075(activity);
        }
    }

    public void finishInit() {
        this.kk006B006Bkk006B.set(true);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.HybridAppSupport
    public void setPageName(@Nonnull Activity activity, @Nonnull String str) {
        if (!this.kk006B006Bkk006B.get() || this.k006B006B006Bkk006B == null || activity == null || llqllqq.ggggggg0067(str)) {
            lqlqqll.uuu007500750075u(k006Bk006Bkk006B, "Failed to clear UI registrations: TMXProfiling is not configured or argument is not valid.");
        } else {
            this.k006B006B006Bkk006B.h00680068hh0068h(activity, str);
        }
    }

    public nnnllll(lqlllql lqlllqlVar) {
        this.kk006B006Bkk006B = new AtomicBoolean(false);
        this.k006B006B006Bkk006B = lqlllqlVar;
    }
}
