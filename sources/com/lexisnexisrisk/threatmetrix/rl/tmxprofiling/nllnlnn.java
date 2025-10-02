package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.media.AudioManager;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class nllnlnn extends nllnnnl {
    private static final String s0073s0073sss = "cellular";
    private static final String ss00730073sss = "voip";
    public int s007300730073sss;
    public String ssss0073ss;

    public nllnlnn(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_PHONE_CALL;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        String str;
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        this.s007300730073sss = 0;
        this.ssss0073ss = null;
        Object systemService = nlnlnnlVar.d0064dd0064dd().ww0077w007700770077.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            int mode = ((AudioManager) systemService).getMode();
            if (mode == 2) {
                this.s007300730073sss = 1;
                str = s0073s0073sss;
            } else {
                if (mode != 3) {
                    return;
                }
                this.s007300730073sss = 1;
                str = ss00730073sss;
            }
            this.ssss0073ss = str;
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.IN_CALL_STATUS.jj006Ajj006A006A(), String.valueOf(this.s007300730073sss));
        if (this.ssss0073ss != null) {
            map.put(lqqqqql.IN_CALL_TYPE.jj006Ajj006A006A(), this.ssss0073ss);
        }
    }
}
