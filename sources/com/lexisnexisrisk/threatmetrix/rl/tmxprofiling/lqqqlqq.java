package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class lqqqlqq extends nllnnnl {
    private String g006700670067g0067g;
    private String gggg00670067g;

    public lqqqlqq(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_SUBSCRIBER;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        this.g006700670067g0067g = lqlllll.y0079y0079y0079y(nlnlnnlVar.d0064dd0064dd());
        this.gggg00670067g = lqlllll.yyy0079y0079y(nlnlnnlVar.d0064dd0064dd());
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String strJj006Ajj006A006A = lqqqqql.SUBSCRIBER_CELL_INFO.jj006Ajj006A006A();
        String str = this.g006700670067g0067g;
        map.put(strJj006Ajj006A006A, str == null ? "" : llqllqq.ggggg0067g0067(str, 2048));
        String strJj006Ajj006A006A2 = lqqqqql.SUBSCRIBER_CELL_ID.jj006Ajj006A006A();
        String str2 = this.gggg00670067g;
        map.put(strJj006Ajj006A006A2, str2 != null ? str2 : "");
    }
}
