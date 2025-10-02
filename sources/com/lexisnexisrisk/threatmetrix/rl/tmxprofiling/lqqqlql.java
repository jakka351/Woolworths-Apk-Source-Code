package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class lqqqlql extends nllnnnl {
    private llllqql r0072r0072r0072r;

    public lqqqlql(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_NETWORK;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        this.r0072r0072r0072r = lqlllll.y00790079y0079y0079(nlnlnnlVar.d0064dd0064dd());
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null || this.r0072r0072r0072r == null) {
            return;
        }
        map.put(lqqqqql.NETWORK_INFO_BSSID.jj006Ajj006A006A(), this.r0072r0072r0072r.h00680068h006800680068() == null ? "" : this.r0072r0072r0072r.h00680068h006800680068());
        map.put(lqqqqql.NETWORK_INFO_SSID_HASH.jj006Ajj006A006A(), this.r0072r0072r0072r.j006Aj006Ajjj() == null ? "" : llqllqq.g00670067g0067gg0067(this.r0072r0072r0072r.j006Aj006Ajjj().getBytes()));
        map.put(lqqqqql.NETWORK_INFO_SSID.jj006Ajj006A006A(), this.r0072r0072r0072r.j006Aj006Ajjj() == null ? "" : this.r0072r0072r0072r.j006Aj006Ajjj());
        map.put(lqqqqql.NETWORK_INFO_RSSI.jj006Ajj006A006A(), this.r0072r0072r0072r.jj006Ajjjj() == null ? "" : this.r0072r0072r0072r.jj006Ajjjj());
        map.put(lqqqqql.NETWORK_INFO_TYPE.jj006Ajj006A006A(), this.r0072r0072r0072r.jj006A006Ajjj() == null ? "" : this.r0072r0072r0072r.jj006A006Ajjj());
        map.put(lqqqqql.NETWORK_INFO_IPV4.jj006Ajj006A006A(), this.r0072r0072r0072r.hhh0068006800680068() == null ? "" : this.r0072r0072r0072r.hhh0068006800680068());
        map.put(lqqqqql.NETWORK_INFO_IPV6.jj006Ajj006A006A(), this.r0072r0072r0072r.h0068h0068006800680068() == null ? "" : this.r0072r0072r0072r.h0068h0068006800680068());
        map.put(lqqqqql.NETWORK_INFO_MAC.jj006Ajj006A006A(), this.r0072r0072r0072r.hh00680068006800680068() == null ? "" : this.r0072r0072r0072r.hh00680068006800680068());
        map.put(lqqqqql.NETWORK_INFO_WFS.jj006Ajj006A006A(), this.r0072r0072r0072r.j006A006Ajjjj() == null ? "" : this.r0072r0072r0072r.j006A006Ajjjj());
        map.put(lqqqqql.NETWORK_INFO_VPN.jj006Ajj006A006A(), this.r0072r0072r0072r.j006A006A006Ajjj() == null ? "" : this.r0072r0072r0072r.j006A006A006Ajjj());
        map.put(lqqqqql.NETWORK_INFO_SECURITY_TYPE.jj006Ajj006A006A(), this.r0072r0072r0072r.jjj006Ajjj() != null ? this.r0072r0072r0072r.jjj006Ajjj() : "");
    }
}
