package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class nnnllnl extends nllnnnl {
    private String e00650065e0065ee;

    public nnnllnl(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_DEVICE_NAME;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) {
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        String strYyyy0079y0079 = lqlllll.yyyy0079y0079(nlnlnnlVar.d0064dd0064dd());
        this.e00650065e0065ee = strYyyy0079y0079;
        if (strYyyy0079y0079 == null) {
            this.e00650065e0065ee = "";
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.DEVICE_NAME.jj006Ajj006A006A(), this.e00650065e0065ee);
    }
}
