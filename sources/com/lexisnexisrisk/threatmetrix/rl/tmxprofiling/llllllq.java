package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class llllllq extends nllnnnl {
    public boolean a0061a0061aa0061;
    public String aaa0061aa0061;

    public llllllq(long j, boolean z) {
        super(j, z);
        this.a0061a0061aa0061 = false;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_PLUGIN_DETECTION;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        this.aaa0061aa0061 = lqlllll.yyyy0079yy(nlnlnnlVar.d0064dd0064dd());
        this.a0061a0061aa0061 = true;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.PLUGIN_PATH_STR.jj006Ajj006A006A(), this.a0061a0061aa0061 ? this.aaa0061aa0061 : lqlqqlq.m006Dmm006D006Dm);
        this.a0061a0061aa0061 = false;
    }
}
