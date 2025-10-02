package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import android.os.Process;
import android.system.Os;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.util.Map;

/* loaded from: classes6.dex */
public class nlnnlll extends nllnnnl {
    private static final String k006B006Bk006B006Bk = lqlqqll.u00750075u00750075u(nlnnlll.class);
    private int k006Bk006B006B006Bk;
    private int kk006B006B006B006Bk;
    private String kkk006B006B006Bk;

    public nlnnlll(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_DEVICE;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null || this.kkk006B006B006Bk != null) {
            return;
        }
        this.kkk006B006B006Bk = lqlllll.y0079y00790079yy(nlnlnnlVar.d0064dd0064dd());
        lqlqqll.llqqqll.yy00790079007900790079(k006B006Bk006B006Bk, "got agent_app_info: " + this.kkk006B006B006Bk);
        this.k006Bk006B006B006Bk = Process.myPid();
        if (nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 >= nnlllnn.nnnnnln.nnlnnln.ss00730073s00730073) {
            this.kk006B006B006B006Bk = Os.getppid();
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String strJj006Ajj006A006A = lqqqqql.AGENT_OS_VERSION.jj006Ajj006A006A();
        String str = nnlllnn.nnnnnln.nlnnnln.sss0073ss0073;
        map.put(strJj006Ajj006A006A, llqllqq.g0067006700670067gg0067(str));
        String str2 = nnlllnn.nnnnnln.nlnnnln.s007300730073ss0073;
        if (str2 != null) {
            map.put(lqqqqql.AGENT_SECURITY_PATCH_LEVEL.jj006Ajj006A006A(), llqllqq.g0067006700670067gg0067(str2));
        }
        map.put(lqqqqql.AGENT_LANGUAGE.jj006Ajj006A006A(), llqllqq.g0067006700670067gg0067(lllqqlq.mmmmm006Dm));
        String strJj006Ajj006A006A2 = lqqqqql.AGENT_BRAND.jj006Ajj006A006A();
        StringBuilder sb = new StringBuilder();
        String str3 = nnlllnn.nnnnnln.sss0073s0073s;
        sb.append(str3);
        sb.append(", ");
        sb.append(nnlllnn.nnnnnln.sss007300730073s);
        map.put(strJj006Ajj006A006A2, llqllqq.g0067006700670067gg0067(sb.toString()));
        String strJj006Ajj006A006A3 = lqqqqql.AGENT_DEVICE.jj006Ajj006A006A();
        String str4 = nnlllnn.nnnnnln.ssss00730073s;
        map.put(strJj006Ajj006A006A3, llqllqq.g0067006700670067gg0067(str4));
        map.put(lqqqqql.AGENT_MODEL.jj006Ajj006A006A(), llqllqq.g0067006700670067gg0067(nnlllnn.nnnnnln.s0073ss00730073s));
        map.put(lqqqqql.AGENT_OS.jj006Ajj006A006A(), llqllqq.g0067006700670067gg0067(lqlllll.yyy00790079y0079()));
        map.put(lqqqqql.AGENT_CONF_OS.jj006Ajj006A006A(), lqlllll.yy00790079y0079y());
        map.put(lqqqqql.AGENT_TYPE.jj006Ajj006A006A(), "agent_mobile");
        map.put(lqqqqql.AGENT_VERSION.jj006Ajj006A006A(), "7.6-46 : RL");
        map.put(lqqqqql.AGENT_APP_INFO.jj006Ajj006A006A(), this.kkk006B006B006Bk);
        String strJj006Ajj006A006A4 = lqqqqql.DEVICE_VERSION_BRAND.jj006Ajj006A006A();
        StringBuilder sbV = a.v("android-", str, " ", str3, ":");
        sbV.append(str4);
        map.put(strJj006Ajj006A006A4, sbV.toString());
        map.put(lqqqqql.AGENT_PROCESS_ID.jj006Ajj006A006A(), Integer.toString(this.k006Bk006B006B006Bk));
        if (nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 >= nnlllnn.nnnnnln.nnlnnln.ss00730073s00730073) {
            map.put(lqqqqql.AGENT_PARENT_PID.jj006Ajj006A006A(), Integer.toString(this.kk006B006B006B006Bk));
        }
    }
}
