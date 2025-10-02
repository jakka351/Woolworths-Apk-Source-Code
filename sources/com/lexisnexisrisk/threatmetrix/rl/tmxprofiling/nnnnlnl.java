package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class nnnnlnl extends nllnnnl {
    private String w00770077w007700770077;

    @Nullable
    private final lllqqql www0077007700770077;

    public nnnnlnl(long j, lllqqql lllqqqlVar) {
        super(j);
        this.www0077007700770077 = lllqqqlVar;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_COOKIE;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() != null && this.w00770077w007700770077 == null) {
            this.w00770077w007700770077 = lqqlqqq.ggg0067g006700670067(this.www0077007700770077);
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null || llqllqq.ggggggg0067(this.w00770077w007700770077)) {
            return;
        }
        map.put(lqqqqql.DEVICE_SOFTWARE_ID.jj006Ajj006A006A(), this.w00770077w007700770077);
    }
}
