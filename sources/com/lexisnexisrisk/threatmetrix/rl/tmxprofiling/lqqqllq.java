package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.pm.PackageManager;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class lqqqllq extends nllnnnl {
    public String a0061a0061006100610061;
    public String aaa0061006100610061;

    public lqqqllq(long j, boolean z) {
        super(j, z);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_ROOT_DETECTION;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException, PackageManager.NameNotFoundException {
        if (nlnlnnlVar.d0064dd0064dd() == null || nlnlnnlVar.d0064006400640064dd() == null || nlnlnnlVar.d0064006400640064dd().t0074ttttt.isEmpty()) {
            return;
        }
        List<String> listYy00790079yyy = lqlllll.yy00790079yyy(nlnlnnlVar.d0064dd0064dd(), nlnlnnlVar.d0064006400640064dd().t0074ttttt);
        this.aaa0061006100610061 = String.valueOf(listYy00790079yyy.size());
        this.a0061a0061006100610061 = llqllqq.gg0067gggg0067(listYy00790079yyy, ";", true);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.ROOT_DETECTION_PATH_COUNT.jj006Ajj006A006A(), this.aaa0061006100610061);
        map.put(lqqqqql.ROOT_DETECTION_PATH_STR.jj006Ajj006A006A(), llqllqq.ggggg0067g0067(this.a0061a0061006100610061, 2048));
    }
}
