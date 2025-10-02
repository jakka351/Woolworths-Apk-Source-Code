package com.lexisnexisrisk.threatmetrix.rl;

import android.app.Activity;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public interface HybridAppWithNTFSupport extends HybridAppSupport {
    void clearCurrentKeyboardTarget(@Nonnull String str, String str2, @Nonnull Activity activity);

    void keyboardTargetTextChanged(@Nonnull String str, String str2, String str3, @Nonnull Activity activity);

    void registerKeyboardTarget(@Nonnull String str, boolean z, @Nonnull Activity activity);

    void setCurrentKeyboardTarget(@Nonnull String str, String str2, @Nonnull Activity activity);
}
