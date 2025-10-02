package com.lexisnexisrisk.threatmetrix.rl;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqllqq;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqqqqql;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class DrmIdCollector extends nllnnnl {
    private String eeeeee0065;

    public DrmIdCollector(long j, boolean z) {
        super(j, z);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_DRM;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        this.eeeeee0065 = lqlllll.y0079y007900790079y();
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null || !llqllqq.g0067g0067006700670067g(this.eeeeee0065)) {
            return;
        }
        map.put(lqqqqql.DRM_ID.jj006Ajj006A006A(), this.eeeeee0065);
    }
}
