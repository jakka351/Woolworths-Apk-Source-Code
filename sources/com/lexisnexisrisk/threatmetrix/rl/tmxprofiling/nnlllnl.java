package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class nnlllnl extends nllnnnl {
    private long e0065006500650065ee;
    private long e0065e00650065ee;
    private String e0065eee0065e;
    private long ee006500650065ee;
    private String eeeee0065e;

    public nnlllnl(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_DEVICE_STATE;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        this.e0065eee0065e = llqllqq.ggggg00670067g(lqlllll.y0079007900790079yy(nlnlnnlVar.d0064dd0064dd()));
        this.e0065e00650065ee = lqlllll.yyyyy0079y();
        this.ee006500650065ee = lqlllll.y00790079yyy0079();
        this.e0065006500650065ee = lqlllll.yy0079yy00790079();
        this.eeeee0065e = lqlllll.yyy007900790079y(this.ee006500650065ee, this.e0065e00650065ee);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.DEVICE_STATE.jj006Ajj006A006A(), llqllqq.g0067006700670067gg0067(this.eeeee0065e));
        String strJj006Ajj006A006A = lqqqqql.DEVICE_BOOT_TIME.jj006Ajj006A006A();
        long j = this.e0065e00650065ee;
        map.put(strJj006Ajj006A006A, j == 0 ? "" : String.valueOf(j));
        String strJj006Ajj006A006A2 = lqqqqql.DEVICE_FREE_SPACE.jj006Ajj006A006A();
        long j2 = this.ee006500650065ee;
        map.put(strJj006Ajj006A006A2, j2 == 0 ? "" : String.valueOf(j2));
        String strJj006Ajj006A006A3 = lqqqqql.DEVICE_TOTAL_SPACE.jj006Ajj006A006A();
        long j3 = this.e0065006500650065ee;
        map.put(strJj006Ajj006A006A3, j3 != 0 ? String.valueOf(j3) : "");
        map.put(lqqqqql.DEVICE_BATTERY_STATUS.jj006Ajj006A006A(), this.e0065eee0065e);
    }
}
