package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.app.Activity;
import com.lexisnexisrisk.threatmetrix.rl.HybridAppWithNTFSupport;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class nlnllll extends nnnllll implements HybridAppWithNTFSupport {
    private static final String kkkk006Bk006B = lqlqqll.u00750075u00750075u(nlnllll.class);

    public nlnllll(lqlllql lqlllqlVar) {
        super(lqlllqlVar);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.HybridAppWithNTFSupport
    public void clearCurrentKeyboardTarget(@Nonnull String str, String str2, @Nonnull Activity activity) {
        lqlllql lqlllqlVar;
        if (!this.kk006B006Bkk006B.get() || (lqlllqlVar = this.k006B006B006Bkk006B) == null) {
            lqlqqll.uuu007500750075u(kkkk006Bk006B, "Failed to unset current keyboard target: TMXProfiling is not configured or argument is not valid.");
        } else {
            lqlllqlVar.uu0075u007500750075(str, str2, activity);
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.HybridAppWithNTFSupport
    public void keyboardTargetTextChanged(@Nonnull String str, String str2, String str3, @Nonnull Activity activity) {
        lqlllql lqlllqlVar;
        if (!this.kk006B006Bkk006B.get() || (lqlllqlVar = this.k006B006B006Bkk006B) == null) {
            lqlqqll.uuu007500750075u(kkkk006Bk006B, "Failed to set keyboard target text changed: TMXProfiling is not configured or argument is not valid.");
        } else {
            lqlllqlVar.h00680068h0068hh(str, str2, str3, activity);
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.HybridAppWithNTFSupport
    public void registerKeyboardTarget(@Nonnull String str, boolean z, @Nonnull Activity activity) {
        lqlllql lqlllqlVar;
        if (!this.kk006B006Bkk006B.get() || (lqlllqlVar = this.k006B006B006Bkk006B) == null) {
            lqlqqll.uuu007500750075u(kkkk006Bk006B, "Failed to register keyboard target: TMXProfiling is not configured or argument is not valid.");
        } else {
            lqlllqlVar.hh006800680068hh(str, z, activity);
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.HybridAppWithNTFSupport
    public void setCurrentKeyboardTarget(@Nonnull String str, String str2, @Nonnull Activity activity) {
        lqlllql lqlllqlVar;
        if (!this.kk006B006Bkk006B.get() || (lqlllqlVar = this.k006B006B006Bkk006B) == null) {
            lqlqqll.uuu007500750075u(kkkk006Bk006B, "Failed to set current keyboard target: TMXProfiling is not configured or argument is not valid.");
        } else {
            lqlllqlVar.h0068hhh0068h(str, str2, activity);
        }
    }
}
