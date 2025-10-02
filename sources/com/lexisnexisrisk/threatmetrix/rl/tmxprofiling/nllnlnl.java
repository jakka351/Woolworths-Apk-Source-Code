package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes6.dex */
public class nllnlnl extends nllnnnl {
    private String e006500650065eee;
    private String e0065e0065eee;
    private String e0065ee0065ee;
    private Map<String, String> ee00650065eee;
    private String ee0065e0065ee;
    private int eeee0065ee;

    public nllnlnl(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_DEVICEINFO;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException, IOException {
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        int iY007900790079y0079y = lqlllll.y007900790079y0079y();
        this.eeee0065ee = iY007900790079y0079y;
        this.e0065ee0065ee = lqlllll.y00790079yy0079y(iY007900790079y0079y);
        if (this.ee00650065eee == null) {
            this.ee00650065eee = lqlllll.y0079yyy0079y();
        }
        Map<String, String> mapY007900790079yy0079 = lqlllll.y007900790079yy0079();
        if (this.e0065e0065eee == null) {
            this.e0065e0065eee = lqlllll.y00790079y00790079y(nlnlnnlVar.d0064dd0064dd(), this.ee00650065eee, mapY007900790079yy0079);
        }
        if (this.e006500650065eee == null) {
            this.e006500650065eee = lqlllll.yy0079yy0079y(this.ee00650065eee);
        }
        if (mapY007900790079yy0079.isEmpty()) {
            return;
        }
        String str = mapY007900790079yy0079.containsKey("MemTotal") ? mapY007900790079yy0079.get("MemTotal") : null;
        this.ee0065e0065ee = str;
        if (str != null) {
            this.ee0065e0065ee = str.replaceAll("\\D+", "");
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.NUM_OF_CPU_CORES.jj006Ajj006A006A(), Integer.toString(this.eeee0065ee));
        if (this.e0065e0065eee != null) {
            map.put(lqqqqql.DEVICE_FINGERPRINT.jj006Ajj006A006A(), llqllqq.g0067006700670067gg0067(this.e0065e0065eee));
        }
        if (this.e006500650065eee != null) {
            map.put(lqqqqql.CPU_NAME.jj006Ajj006A006A(), llqllqq.g0067006700670067gg0067(this.e006500650065eee));
        }
        if (this.e0065ee0065ee != null) {
            map.put(lqqqqql.CPU_SPEED.jj006Ajj006A006A(), llqllqq.g0067006700670067gg0067(this.e0065ee0065ee));
        }
        if (this.ee0065e0065ee != null) {
            map.put(lqqqqql.MEM_TOTAL.jj006Ajj006A006A(), llqllqq.g0067006700670067gg0067(this.ee0065e0065ee));
        }
    }
}
