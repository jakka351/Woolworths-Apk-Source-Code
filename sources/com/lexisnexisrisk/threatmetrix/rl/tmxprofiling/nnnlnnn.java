package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class nnnlnnn extends nllnnnl {
    private String xx0078x0078x0078;

    public nnnlnnn(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_ADVERTISING_ID;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        String strYy0079y0079yy;
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        if (llqllqq.g00670067g006700670067g(nlnlnnlVar.dddd0064dd())) {
            strYy0079y0079yy = nlnlnnlVar.dddd0064dd();
        } else if (!llqllqq.ggggggg0067(this.xx0078x0078x0078)) {
            return;
        } else {
            strYy0079y0079yy = lqlllll.yy0079y0079yy(nlnlnnlVar.d0064dd0064dd());
        }
        this.xx0078x0078x0078 = strYy0079y0079yy;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null || !llqllqq.g00670067g006700670067g(this.xx0078x0078x0078)) {
            return;
        }
        map.put(lqqqqql.ADVERTISING_ID.jj006Ajj006A006A(), this.xx0078x0078x0078);
    }
}
