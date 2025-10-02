package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.PowerManager;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class lqqqlll {
    private static final String pp0070p0070pp = lqlqqll.u00750075u00750075u(lqqqlll.class);

    private lqqqlll() {
    }

    @TargetApi
    public static boolean y0079yy007900790079(@Nonnull Context context) {
        if (nnlllnn.nlnllln.ff0066006600660066f() && nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 >= nnlllnn.nnnnnln.nnlnnln.s0073s0073s00730073) {
            try {
                Object systemService = context.getSystemService("power");
                if (systemService instanceof PowerManager) {
                    return ((PowerManager) systemService).isInteractive();
                }
                return true;
            } catch (SecurityException e) {
                lqlqqll.llqqqll.u0075uuuuu(pp0070p0070pp, "User refuse granting permission {}", e.toString());
                nlnnlnl.d00640064dd0064d(e);
            } catch (Exception e2) {
                lqlqqll.uuu007500750075u(pp0070p0070pp, e2.toString());
            }
        }
        return true;
    }
}
