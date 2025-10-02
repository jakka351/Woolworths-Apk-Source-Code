package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.TMXStatusCode;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;

/* loaded from: classes6.dex */
public class llqlllq {
    private static final llqlllq aa00610061a00610061 = new llqlllq();
    private int aaaaa00610061 = 0;
    private long a0061aaa00610061 = 0;
    private long aa0061aa00610061 = 0;
    private long a00610061aa00610061 = 0;
    private String aaa0061a00610061 = null;
    private TMXStatusCode a0061a0061a00610061 = TMXStatusCode.TMX_OK;

    public static llqlllq g0067gg0067ggg() {
        return aa00610061a00610061;
    }

    public int g0067006700670067ggg() {
        return this.aaaaa00610061;
    }

    public TMXStatusCode g00670067g0067ggg() {
        return this.a0061a0061a00610061;
    }

    public long g0067g00670067ggg() {
        return nnlllnn.nlnnnnl.f0066fff00660066() - this.a0061aaa00610061;
    }

    public void g0067ggg0067gg() {
        this.aaaaa00610061++;
        this.a0061aaa00610061 = nnlllnn.nlnnnnl.f0066fff00660066();
    }

    public long gg006700670067ggg() {
        return this.a0061aaa00610061;
    }

    public long gg0067g0067ggg() {
        long j = this.a00610061aa00610061;
        if (j == 0) {
            return 0L;
        }
        return j - this.aa0061aa00610061;
    }

    public void gg0067gg0067gg(int i) {
        this.aaaaa00610061 = i;
    }

    public String ggg00670067ggg() {
        return this.aaa0061a00610061;
    }

    public void ggggg0067gg(String str, TMXStatusCode tMXStatusCode) {
        this.aa0061aa00610061 = this.a0061aaa00610061;
        this.a00610061aa00610061 = nnlllnn.nlnnnnl.f0066fff00660066();
        this.aaa0061a00610061 = str;
        this.a0061a0061a00610061 = tMXStatusCode;
    }
}
