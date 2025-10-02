package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class nllllnl extends nllnnnl {
    private float e006500650065e0065e;
    private int e00650065ee0065e;
    private int e0065e0065e0065e;
    private float e0065ee00650065e;
    private float ee00650065e0065e;
    private int ee0065ee0065e;
    private int eee0065e0065e;
    private float eeee00650065e;

    public nllllnl(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_DISPLAY;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        nnnnnll nnnnnllVar = new nnnnnll(nlnlnnlVar.d0064dd0064dd());
        this.ee0065ee0065e = nnnnnllVar.d00640064006400640064d();
        this.e00650065ee0065e = nnnnnllVar.dd0064d00640064d();
        this.e0065e0065e0065e = nnnnnllVar.d00640064d00640064d();
        this.eee0065e0065e = nnnnnllVar.dddddd0064();
        this.eeee00650065e = nnnnnllVar.d0064dddd0064();
        this.e0065ee00650065e = nnnnnllVar.dd0064ddd0064();
        this.ee00650065e0065e = nnnnnllVar.ddd006400640064d();
        this.e006500650065e0065e = nnnnnllVar.d0064d006400640064d();
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.DEVICE_DISPLAY_WIDTH_IN_PIXEL.jj006Ajj006A006A(), String.valueOf(this.eee0065e0065e));
        map.put(lqqqqql.DEVICE_DISPLAY_HEIGHT_IN_PIXEL.jj006Ajj006A006A(), String.valueOf(this.e0065e0065e0065e));
        map.put(lqqqqql.DEVICE_DISPLAY_NATIVE_BOUND_X.jj006Ajj006A006A(), String.valueOf(this.ee00650065e0065e));
        map.put(lqqqqql.DEVICE_DISPLAY_NATIVE_BOUND_Y.jj006Ajj006A006A(), String.valueOf(this.e006500650065e0065e));
        map.put(lqqqqql.DEVICE_DISPLAY_XDPI.jj006Ajj006A006A(), String.valueOf(this.eeee00650065e));
        map.put(lqqqqql.DEVICE_DISPLAY_YDPI.jj006Ajj006A006A(), String.valueOf(this.e0065ee00650065e));
        map.put(lqqqqql.DEVICE_DISPLAY_RESOLUTION.jj006Ajj006A006A(), Math.max(this.ee0065ee0065e, this.e00650065ee0065e) + "x" + Math.min(this.ee0065ee0065e, this.e00650065ee0065e));
        map.put(lqlqqlq.mmmm006D006Dm, this.ee0065ee0065e >= this.e00650065ee0065e ? "landscape" : "portrait");
    }
}
