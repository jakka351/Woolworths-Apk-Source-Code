package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class lllqllq extends nllnnnl {
    public boolean a006100610061a00610061;

    public lllqllq(long j, boolean z) {
        super(j, z);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_RAT;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        Context applicationContext;
        Display[] displays;
        this.a006100610061a00610061 = false;
        if (nlnlnnlVar == null || nlnlnnlVar.d0064dd0064dd() == null || nlnlnnlVar.d0064dd0064dd().ww0077w007700770077 == null || (applicationContext = nlnlnnlVar.d0064dd0064dd().ww0077w007700770077.getApplicationContext()) == null) {
            return;
        }
        Object systemService = applicationContext.getSystemService("display");
        if ((systemService instanceof DisplayManager) && (displays = ((DisplayManager) systemService).getDisplays()) != null) {
            for (Display display : displays) {
                if (display != null) {
                    int flags = display.getFlags();
                    if ((flags & 8) != 0 && (flags & 2) == 0) {
                        this.a006100610061a00610061 = true;
                        return;
                    }
                }
            }
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null || !this.a006100610061a00610061) {
            return;
        }
        map.put(lqqqqql.RAT_DETECTION_INFO.jj006Ajj006A006A(), "true");
    }
}
