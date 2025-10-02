package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class nnlnlnl extends nllnnnl {
    private int e00650065eeee;
    private String eee0065eee;

    public nnlnlnl(long j, boolean z) {
        super(j, z);
        this.e00650065eeee = 0;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_DEVICE_ENCRYPT_AND_STATUS;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        this.e00650065eeee = lqlllll.yy0079y00790079y(nlnlnnlVar.d0064dd0064dd());
        String strY0079yy00790079y = lqlllll.y0079yy00790079y(nlnlnnlVar.d0064dd0064dd());
        this.eee0065eee = strY0079yy00790079y;
        if (strY0079yy00790079y != null) {
            this.eee0065eee = String.valueOf(strY0079yy00790079y.compareTo("1") == 0);
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.DEVICE_ENCRYPTION_STATUS.jj006Ajj006A006A(), String.valueOf(this.e00650065eeee));
        map.put(lqqqqql.DEVICE_DEV_ENABLED_STATUS.jj006Ajj006A006A(), this.eee0065eee);
    }
}
