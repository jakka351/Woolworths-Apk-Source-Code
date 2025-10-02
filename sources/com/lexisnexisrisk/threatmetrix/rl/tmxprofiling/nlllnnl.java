package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class nlllnnl {

    @Nonnull
    public final Context ww0077w007700770077;

    public nlllnnl(@Nonnull Context context) {
        this.ww0077w007700770077 = context;
    }

    public FileOutputStream d0064ddd0064d(@Nonnull String str) throws FileNotFoundException {
        return this.ww0077w007700770077.openFileOutput(str, 0);
    }

    public String ddddd0064d() {
        return this.ww0077w007700770077.getPackageName();
    }
}
