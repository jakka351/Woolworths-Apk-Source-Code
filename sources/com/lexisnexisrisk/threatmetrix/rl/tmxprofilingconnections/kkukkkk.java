package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kuukkkk;
import java.io.IOException;
import java.util.Map;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class kkukkkk implements Runnable {
    private static final String hhh0068hh0068 = kuukkkk.cc0063ccc0063(kkukkkk.class);
    public static int k006B006B006Bk006B006B = 0;
    public static int k006Bkk006B006B006B = 2;
    public static int kk006B006Bk006B006B = 76;
    public static int kkkk006B006B006B = 1;

    @Nonnull
    private final TMXProfilingConnectionsInterface.HttpMethod h00680068006800680068h;
    private final int h00680068hhh0068;
    private final TMXProfilingConnectionsInterface.TMXCallback h0068hhhh0068;

    @Nonnull
    private final kuuukkk hh0068006800680068h;
    private final byte[] hh0068hhh0068;

    @Nonnull
    private final String hhhhhh0068;

    public kkukkkk(@Nonnull kuuukkk kuuukkkVar, @Nonnull TMXProfilingConnectionsInterface.HttpMethod httpMethod, @Nonnull String str, Map<String, String> map, byte[] bArr, int i, TMXProfilingConnectionsInterface.TMXCallback tMXCallback) {
        this.hh0068006800680068h = kuuukkkVar;
        if (map != null && !map.isEmpty()) {
            kuuukkkVar.cccc006300630063(map);
        }
        this.h00680068006800680068h = httpMethod;
        this.hh0068hhh0068 = bArr;
        this.h0068hhhh0068 = tMXCallback;
        this.hhhhhh0068 = str;
        this.h00680068hhh0068 = Math.max(i, 0);
    }

    private void cccc0063cc(boolean z) {
        long jNanoTime = System.nanoTime();
        String str = hhh0068hh0068;
        kuukkkk.kkkukkk.cc0063c0063cc(str, kukuukk.kkk006B006B006Bk("i[p@<\\Y_e\u0005\u000f\\<u", (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233238)), (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233305)), (char) (kkkkuku.kkkk006Bk006B() ^ 797363561)) + this.hhhhhh0068, z ? kukuukk.kkk006B006B006Bk("r#o/s!c\u001e", (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121715), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535287)), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535347))) : kukuukk.kk006Bk006B006Bk("\u0003\u0003n~\u007fswo", (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233112)), (char) (kkkkuku.kkkk006Bk006B() ^ 797363564)));
        try {
            throw null;
        } catch (Exception unused) {
            kk006B006Bk006B006B = 60;
            TMXProfilingConnectionsInterface.HttpMethod httpMethod = this.h00680068006800680068h;
            int iCc00630063006300630063 = httpMethod == TMXProfilingConnectionsInterface.HttpMethod.GET ? this.hh0068006800680068h.cc00630063006300630063(this.hhhhhh0068) : httpMethod == TMXProfilingConnectionsInterface.HttpMethod.POST ? this.hh0068006800680068h.k006B006B006Bkkk(this.hhhhhh0068, this.hh0068hhh0068) : -1;
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            if (iCc00630063006300630063 >= 0) {
                kuukkkk.kkkukkk.c0063cc0063cc(str, kukuukk.kkk006B006B006Bk("eYih`]o__6\u001d", (char) (kkuukku.kk006Bkkk006B() ^ (-1182535220)), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121625), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535351))) + this.hh0068006800680068h.k006Bk006Bkkk() + kukuukk.kk006Bk006B006Bk("t=Aq", (char) (kkkkuku.kkkk006Bk006B() ^ 797363524), (char) ((-910233340) ^ kuuukku.k006Bk006Bkk006B())) + jNanoTime2 + kukuukk.kk006Bk006B006Bk("rw", (char) (kkkkuku.kkkk006Bk006B() ^ 797363562), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121611)));
                return;
            }
            kuukkkk.c0063cc0063c0063(str, kukuukk.kk006Bk006B006Bk("R\"yZ9{Y3\u0004yH\u001f{y^>\u0017q\u0002.\u007fKo\"", (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233236)), (char) (kkkkuku.kkkk006Bk006B() ^ 797363566)) + this.hhhhhh0068 + kukuukk.kk006Bk006B006Bk("sL?K@x", (char) (kkuukku.kk006Bkkk006B() ^ (-1182535281)), (char) (797363562 ^ kkkkuku.kkkk006Bk006B())) + this.hh0068006800680068h.kkk006Bkkk().toString() + kukuukk.kkk006B006B006Bk("A\u001am.", (char) (kkuukku.kk006Bkkk006B() ^ (-1182535404)), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535206)), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121608)) + jNanoTime2 + kukuukk.kk006Bk006B006Bk("\u000f\u0014", (char) (kkkkuku.kkkk006Bk006B() ^ 797363505), (char) ((-910233340) ^ kuuukku.k006Bk006Bkk006B())));
        }
    }

    public static int kk006B006B006B006B006B() {
        return 75;
    }

    @Override // java.lang.Runnable
    public void run() {
        TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCodeKkk006Bkkk = this.hh0068006800680068h.kkk006Bkkk();
        int i = 0;
        while (i <= this.h00680068hhh0068 && !tMXHttpResponseCodeKkk006Bkkk.succeeded() && tMXHttpResponseCodeKkk006Bkkk.getHttpResponseCode() != -6 && tMXHttpResponseCodeKkk006Bkkk.getHttpResponseCode() != -5) {
            cccc0063cc(i != 0);
            i++;
            tMXHttpResponseCodeKkk006Bkkk = this.hh0068006800680068h.kkk006Bkkk();
            if (!tMXHttpResponseCodeKkk006Bkkk.succeeded()) {
                kuukkkk.c0063cc0063c0063(hhh0068hh0068, kukuukk.kk006Bk006B006Bk("o}~|\u0001/8", (char) (kkkkuku.kkkk006Bk006B() ^ 797363557), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121610)) + tMXHttpResponseCodeKkk006Bkkk.getHttpResponseCode() + kukuukk.kkk006B006B006Bk("Duyq\u000f\u000f>1\u0010\\\f03\u0013QJh3%\u0007Lq\u0013", (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121751), (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233144)), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535347))) + this.hhhhhh0068);
            }
        }
        try {
            try {
                if (this.h0068hhhh0068 != null) {
                    this.h0068hhhh0068.onComplete(tMXHttpResponseCodeKkk006Bkkk, tMXHttpResponseCodeKkk006Bkkk.getHttpResponseCode() == 200 ? this.hh0068006800680068h.k006B006Bkkkk() : null);
                }
            } catch (IOException unused) {
                String str = hhh0068hh0068;
                StringBuilder sb = new StringBuilder();
                char cK006B006B006B006B006Bk = (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121586);
                char cKk006Bkkk006B = (char) (kkuukku.kk006Bkkk006B() ^ (-1182535357));
                int i2 = kk006B006Bk006B006B;
                if (((kkkk006B006B006B + i2) * i2) % k006Bkk006B006B006B != k006B006B006Bk006B006B) {
                    kk006B006Bk006B006B = 15;
                    k006B006B006Bk006B006B = 30;
                }
                sb.append(kukuukk.kk006Bk006B006Bk("I\u001fVo,\u0004!F~f]rJ", cK006B006B006B006B006Bk, cKk006Bkkk006B));
                sb.append(tMXHttpResponseCodeKkk006Bkkk.toString());
                sb.append(kukuukk.kk006Bk006B006Bk(";1\u0004\u0004o\u0002\u0002~*xv'xjuxgtt\u001frl\u001c", (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233102)), (char) (kkkkuku.kkkk006Bk006B() ^ 797363565)));
                sb.append(this.hh0068006800680068h.kk006Bkkkk());
                kuukkkk.c00630063006300630063c(str, sb.toString());
            }
            this.hh0068006800680068h.ccc0063006300630063();
        } catch (Throwable th) {
            this.hh0068006800680068h.ccc0063006300630063();
            throw th;
        }
    }
}
