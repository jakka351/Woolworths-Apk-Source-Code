package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import android.app.Activity;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes6.dex */
public final class xlllxlx {
    public static int f0066f0066f00660066 = 2;
    public static int fff0066f00660066 = 1;
    public static int fffff00660066 = 4;
    public static final String v007600760076v0076v;
    public static final String v00760076v00760076v;
    public static final String v00760076vv0076v;
    public static final String v0076v0076v0076v;
    public static final String v0076vv00760076v;
    public static final String v0076vvv0076v;
    public static final String vv00760076v0076v;
    public static final String vv0076v00760076v;
    public static final String vv0076vv0076v;
    public static final String vvv0076v0076v;
    public static final String vvvv00760076v;
    public static final String v0076vvvvv = xlxllxl.r0072r0072r0072r("P[+OSMcW^CVU8bVXc]]", (char) (jjjjkjj.rrrrrr0072() ^ 2074272610), (char) (jkkkjjj.rrr007200720072r() ^ 1252464211));
    public static final String vv0076vvvv = xlxllxl.r007200720072r0072r("\u0001\u0001\u0004w|z~", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105898), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858857), (char) (jkkkjjj.rrr007200720072r() ^ 1252464210));
    public static final String v00760076vvvv = xlxllxl.r0072r0072r0072r("R\u0001\"JOt\u0011B{QU6CihZ\u0002\u007f@9x", (char) (jjjjkjj.rrrrrr0072() ^ 2074272728), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105818));
    public static final String vvv0076vvv = xlxllxl.r0072r0072r0072r("OALO>KK\u001c>L86!1H:<-/", (char) (jjjjkjj.rrrrrr0072() ^ 2074272724), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105820));
    public static final String v0076v0076vvv = xlxllxl.r0072r0072r0072r("\u0007z\b\r}\r\u000fc\u0002~\u0003\u0005\u0013", (char) (jkkkjjj.rrr007200720072r() ^ 1252464358), (char) (jkkkjjj.rrr007200720072r() ^ 1252464208));
    public static final String vv00760076vvv = xlxllxl.r007200720072r0072r("\u0015\t\u0016\u001b\f\u001b\u001d~\u001d\u0018", (char) (jkkkjjj.rrr007200720072r() ^ 1252464182), (char) (jkkkjjj.rrr007200720072r() ^ 1252464232), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105822));
    public static final String v007600760076vvv = xlxllxl.r007200720072r0072r("b\u0006\u001c3AV~\u000b(>0l\u0005\u001d!EQj", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858898), (char) (jjjjkjj.rrrrrr0072() ^ 2074272531), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105816));
    public static final String vvvv0076vv = xlxllxl.r0072r0072r0072r("\u0011\u0013\u000b\n\u0004\b\u007fXy\n}\n{\u0006\n", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105903), (char) (jkkkjjj.rrr007200720072r() ^ 1252464210));
    public static final String v0076vv0076vv = xlxllxl.r0072r0072r0072r("cg[ckYYW3TdXdV`TO\\", (char) (jkkkjjj.rrr007200720072r() ^ 1252464343), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858857));
    public static final String vv0076v0076vv = xlxllxl.r0072r0072r0072r("5*=611\u001485=6F", (char) (jjjjkjj.rrrrrr0072() ^ 2074272615), (char) (jkkkjjj.rrr007200720072r() ^ 1252464213));
    public static final String v00760076v0076vv = xlxllxl.r0072r0072r0072r("~@+n4E\u0012.a\u0003\u001a'\u0019\u000e", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858967), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858853));
    public static final String vvv00760076vv = xlxllxl.r0072r0072r0072r("viGcyePt}m}\u0001nx", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105818), (char) (jkkkjjj.rrr007200720072r() ^ 1252464223));
    public static final String v0076v00760076vv = xlxllxl.r0072r0072r0072r("J?\u001b9E3#FBAHSBII\u001f4;5<", (char) (jjjjkjj.rrrrrr0072() ^ 2074272592), (char) (jkkkjjj.rrr007200720072r() ^ 1252464223));
    public static final String vv007600760076vv = xlxllxl.r007200720072r0072r("F\u000e\u0003.CdeQZ\"n,B-\u0002B'*\u0007s;*\u001b", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858810), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858805), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105817));
    public static final String v0076007600760076vv = xlxllxl.r007200720072r0072r("\u0003\u0014&.\u0015\u000bMwbVKE\u001d=", (char) (jjjjkjj.rrrrrr0072() ^ 2074272650), (char) (jkkkjjj.rrr007200720072r() ^ 1252464308), (char) (jkkkjjj.rrr007200720072r() ^ 1252464215));
    public static final String vvvvv0076v = xlxllxl.r0072r0072r0072r("Ax\u0012<b#Kr(JSw\u000e)", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105923), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858853));
    public boolean vvv007600760076v = false;
    public boolean v0076v007600760076v = false;
    public long vv0076007600760076v = 0;
    public int v00760076007600760076v = 0;
    public int vvvvvv0076 = 60;
    public int v0076vvvv0076 = 500;
    public int vv0076vvv0076 = 6;
    public int v00760076vvv0076 = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    public int vvv0076vv0076 = 0;
    public int v0076v0076vv0076 = 0;
    public int vv00760076vv0076 = 0;
    public int v007600760076vv0076 = 0;
    public int vvvv0076v0076 = 0;
    public int v0076vv0076v0076 = 0;
    public int vv0076v0076v0076 = 0;
    public int v00760076v0076v0076 = 0;
    public int vvv00760076v0076 = 0;
    public String v0076v00760076v0076 = null;
    public Map<String, String> vv007600760076v0076 = null;
    public Map<String, String> v0076007600760076v0076 = null;
    public Set<String> vvvvv00760076 = null;
    public Set<String> v0076vvv00760076 = null;
    public boolean vv0076vv00760076 = false;
    public String v00760076vv00760076 = xlxllxl.r0072r0072r0072r("b\r", (char) (jjjjkjj.rrrrrr0072() ^ 2074272583), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858853));
    public Activity vvv0076v00760076 = null;
    public TMXProfilingConnectionsInterface v0076v0076v00760076 = null;

    static {
        char cRrrrrr0072 = (char) (jjjjkjj.rrrrrr0072() ^ 2074272572);
        char cRrrrrr00722 = (char) (jjjjkjj.rrrrrr0072() ^ 2074272628);
        int iRrrrrr0072 = jjjjkjj.rrrrrr0072();
        int i = fffff00660066;
        if (((fff0066f00660066 + i) * i) % ff0066ff00660066() != 0) {
            fffff00660066 = f00660066ff00660066();
            fff0066f00660066 = 26;
        }
        v0076vvv0076v = xlxllxl.r007200720072r0072r(",.H^k~m!%3Jel\u0003\u0013x6LVm", cRrrrrr0072, cRrrrrr00722, (char) (iRrrrrr0072 ^ 2074272515));
        vv0076vv0076v = xlxllxl.r007200720072r0072r("|u&2U_f\f\"6ba\u0005\u0016=:ekw\u0015M?", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858779), (char) (1132105923 ^ jkjjkjj.rr0072rrr0072()), (char) (jjjjkjj.rrrrrr0072() ^ 2074272519));
        v00760076vv0076v = xlxllxl.r007200720072r0072r("!\u0019\u0018\rS?\bbW%\u001b/7J]\u007fu:d\u0006\u000e2V", (char) (jkkkjjj.rrr007200720072r() ^ 1252464251), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105751), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858860));
        vvv0076v0076v = xlxllxl.r0072r0072r0072r("KJ>R\\a[R4EQF8IUYhjM[t@`rR", (char) (jjkjkjj.r00720072rrr0072() ^ 1742859003), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105819));
        v0076v0076v0076v = xlxllxl.r0072r0072r0072r(")(\u0018,27-$\u0012#+ \u000e\u001f'+&(\b(\u0014&$s\u0010\"\u000e", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858878), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105823));
        vv00760076v0076v = xlxllxl.r0072r0072r0072r("[ZJ^di_VDU]RB5=K`,HZF", (char) (jkkkjjj.rrr007200720072r() ^ 1252464276), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105820));
        v007600760076v0076v = xlxllxl.r0072r0072r0072r("'(\u001a08?70 3=4&\u001b&H6JJ\u001c:N<", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105978), (char) (jkkkjjj.rrr007200720072r() ^ 1252464213));
        vvvv00760076v = xlxllxl.r0072r0072r0072r("\u0004w}\u0003xo_|mTgxohfNocc", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105854), (char) (jjjjkjj.rrrrrr0072() ^ 2074272512));
        v0076vv00760076v = xlxllxl.r007200720072r0072r("%\u0019\u001f$\u001a\u0011t\u0019\u0014\u000e\u000b\u001bo\u0006\u001a\u0004\u0015\u0004\u0012\b\u000e\u0011", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858843), (char) (jjjjkjj.rrrrrr0072() ^ 2074272738), (char) (jkkkjjj.rrr007200720072r() ^ 1252464210));
        vv0076v00760076v = xlxllxl.r007200720072r0072r("P=9\u001c>9?6\u001a44<A513.:\b:96,$64$", (char) (jjjjkjj.rrrrrr0072() ^ 2074272614), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858793), (char) (jjjjkjj.rrrrrr0072() ^ 2074272516));
        v00760076v00760076v = xlxllxl.r007200720072r0072r("<8p\n\n7TKr\u0014", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105965), (char) (jkkkjjj.rrr007200720072r() ^ 1252464333), (char) (1252464213 ^ jkkkjjj.rrr007200720072r()));
    }

    public static int f00660066ff00660066() {
        return 52;
    }

    public static int f0066fff00660066() {
        return 1;
    }

    public static int ff0066ff00660066() {
        return 2;
    }

    private int tt0074t0074t0074(@Nonnull Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public boolean t00740074t0074t0074() {
        Map<String, String> map;
        Map<String, String> map2;
        if (!this.vvv007600760076v || !xlxxllx.ttttt00740074(this.v0076v00760076v0076) || this.v0076v0076v00760076 == null || (map = this.v0076007600760076v0076) == null || map.size() <= 0 || (map2 = this.vv007600760076v0076) == null || map2.size() <= 0) {
            return false;
        }
        Map<String, String> map3 = this.vv007600760076v0076;
        char cR00720072rrr0072 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858916);
        int iR00720072rrr0072 = jjkjkjj.r00720072rrr0072() ^ 1742858863;
        int i = fffff00660066;
        if (((fff0066f00660066 + i) * i) % f0066f0066f00660066 != 0) {
            fffff00660066 = f00660066ff00660066();
            fff0066f00660066 = 37;
        }
        return map3.containsKey(xlxllxl.r0072r0072r0072r(")\u001a'&\u001b \u001e\u000e\u0017\u0011", cR00720072rrr0072, (char) iR00720072rrr0072));
    }

    public void ttt00740074t0074(Map<String, Object> map) {
        int i;
        if (map == null) {
            return;
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("\u0001\u0001\u0004w|z~", (char) (jkkkjjj.rrr007200720072r() ^ 1252464237), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858918), (char) (jjjjkjj.rrrrrr0072() ^ 2074272512)))) {
            Object obj = map.get(xlxllxl.r0072r0072r0072r("+`T(s\u0016|", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105824), (char) (jjjjkjj.rrrrrr0072() ^ 2074272517)));
            this.vv0076007600760076v = obj instanceof Long ? ((Long) obj).longValue() : 0L;
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("8-\t';)\r?=-A7>>", (char) (jjjjkjj.rrrrrr0072() ^ 2074272724), (char) (jkkkjjj.rrr007200720072r() ^ 1252464313), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105821)))) {
            this.vvvvvv0076 = tt0074t0074t0074(map, xlxllxl.r0072r0072r0072r("eZ6ThV:ljZndkk", (char) (jkkkjjj.rrr007200720072r() ^ 1252464161), (char) (jkkkjjj.rrr007200720072r() ^ 1252464213)));
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r(">3\u000f-A/\u0018>E7EJ6B", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858827), (char) (jjjjkjj.rrrrrr0072() ^ 2074272601), (char) (jkkkjjj.rrr007200720072r() ^ 1252464211)))) {
            this.v0076vvvv0076 = tt0074t0074t0074(map, xlxllxl.r0072r0072r0072r("\u0015\ne\u0004\u0018\u0006n\u0015\u001c\u000e\u001c!\r\u0019", (char) (jkkkjjj.rrr007200720072r() ^ 1252464328), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858856)));
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("3(\u0004\"6$\u00147+*1<3::\u0010=D>E", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105862), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858862)))) {
            this.vv0076vvv0076 = tt0074t0074t0074(map, xlxllxl.r0072r0072r0072r("XM)G[I9\\POVaX__5bicj", (char) (jjjjkjj.rrrrrr0072() ^ 2074272741), (char) (jjjjkjj.rrrrrr0072() ^ 2074272513)));
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("3&\u007f\u001c.\u001a\f)\u0017#' \u001b$#\u0018\u001d\u001bw\u0014\u0017\u0012\u001c", (char) (jjjjkjj.rrrrrr0072() ^ 2074272622), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105980), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858857)))) {
            this.v00760076vvv0076 = tt0074t0074t0074(map, xlxllxl.r0072r0072r0072r("tgA]o[MjXdha\\edY^\\9UXS]", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858937), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105823)));
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("6)396:\r?=-A7>>", (char) (jjjjkjj.rrrrrr0072() ^ 2074272634), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858927), (char) (jjjjkjj.rrrrrr0072() ^ 2074272514)))) {
            this.vvv0076vv0076 = tt0074t0074t0074(map, xlxllxl.r0072r0072r0072r("ZKSWRT%UQ?QEJH", (char) (jkkkjjj.rrr007200720072r() ^ 1252464207), (char) (jjjjkjj.rrrrrr0072() ^ 2074272518)));
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("2#+/*,\u0002&+\u001b'*\u0014\u001e", (char) (jkkkjjj.rrr007200720072r() ^ 1252464278), (char) (jjjjkjj.rrrrrr0072() ^ 2074272518)))) {
            this.v0076v0076vv0076 = tt0074t0074t0074(map, xlxllxl.r0072r0072r0072r("&\u0017\u001f#\u001e u\u001a\u001f\u000f\u001b\u001e\b\u0012", (char) (jjjjkjj.rrrrrr0072() ^ 2074272576), (char) (1742858857 ^ jjkjkjj.r00720072rrr0072())));
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("*\u001d'-*.\r0$#*5,33\t6=7>", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105921), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858862)))) {
            this.vv00760076vv0076 = tt0074t0074t0074(map, xlxllxl.r0072r0072r0072r("\u0005$Qx'^\u00127L\t\u00079]gtqRl~\u0001", (char) (jjjjkjj.rrrrrr0072() ^ 2074272563), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105811)));
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("PAIMHJ+H6BF?:CB7<:\u001e3C-", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105977), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105817)))) {
            int iF00660066ff00660066 = f00660066ff00660066();
            if (((fff0066f00660066 + iF00660066ff00660066) * iF00660066ff00660066) % f0066f0066f00660066 != 0) {
                fffff00660066 = 59;
                fff0066f00660066 = f00660066ff00660066();
            }
            char cR00720072rrr0072 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858914);
            char cR00720072rrr00722 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858927);
            int i2 = fffff00660066;
            if (((i2 + fff0066f00660066) * i2) % f0066f0066f00660066 != 0) {
                fffff00660066 = f00660066ff00660066();
                fff0066f00660066 = f00660066ff00660066();
            }
            i = 2074272517;
            this.v007600760076vv0076 = tt0074t0074t0074(map, xlxllxl.r007200720072r0072r("fW_c^`A^LX\\UPYXMRP4IYC", cR00720072rrr0072, cR00720072rrr00722, (char) (jkkkjjj.rrr007200720072r() ^ 1252464210)));
        } else {
            i = 2074272517;
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("A\u0012\u0013;h&\u0002S)\"&Gl\u001by+vP1\ne", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105872), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858860)))) {
            this.vvvv0076v0076 = tt0074t0074t0074(map, xlxllxl.r0072r0072r0072r("gdR^b[V_^SXV-XJUXGOCX", (char) (jjjjkjj.rrrrrr0072() ^ 2074272648), (char) (jjjjkjj.rrrrrr0072() ^ 2074272518)));
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("QCNQ@MM-IB", (char) (jkkkjjj.rrr007200720072r() ^ 1252464281), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105820)))) {
            this.v0076v00760076v0076 = (String) map.get(xlxllxl.r0072r0072r0072r("C5@C2??\u001f;4", (char) (jkkkjjj.rrr007200720072r() ^ 1252464129), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105820)));
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("RFSXIXZ/MJNP^", (char) (jkkkjjj.rrr007200720072r() ^ 1252464156), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105821)))) {
            Object obj2 = map.get(xlxllxl.r007200720072r0072r("cU`cR__2NIKKW", (char) (jkkkjjj.rrr007200720072r() ^ 1252464265), (char) (jkkkjjj.rrr007200720072r() ^ 1252464379), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858861)));
            this.v0076007600760076v0076 = obj2 instanceof Map ? (Map) obj2 : null;
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("j\u0014:x\u0003Kfn,u|6<\u00046c\u0001-J", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105901), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105859), (char) (jjjjkjj.rrrrrr0072() ^ 2074272515)))) {
            Object obj3 = map.get(xlxllxl.r007200720072r0072r("'9\f^M?C\u0007l4\u0001nQW#\u001bE\u0002\u0005", (char) (jkkkjjj.rrr007200720072r() ^ 1252464357), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105917), (char) (jkkkjjj.rrr007200720072r() ^ 1252464215)));
            this.vv007600760076v0076 = obj3 instanceof Map ? (Map) obj3 : null;
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("2??@87I?FF\"HNP>LBE", (char) (jkkkjjj.rrr007200720072r() ^ 1252464232), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858754), (char) (1252464211 ^ jkkkjjj.rrr007200720072r())))) {
            this.v0076v0076v00760076 = (TMXProfilingConnectionsInterface) map.get(xlxllxl.r007200720072r0072r("ITRQGDTHMK%IMM9E9:", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105767), (char) (jjjjkjj.rrrrrr0072() ^ 2074272537), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858861)));
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("Sxrp\u000100\u0011\t$VU-Hz\t\u000eyb\u001b:o\u0016RH", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105908), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105890), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105820)))) {
            this.v0076vv0076v0076 = tt0074t0074t0074(map, xlxllxl.r007200720072r0072r("[ZJ^di_VDU]R@QY]XZ9G\\(DVB", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105804), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858883), (char) (jjjjkjj.rrrrrr0072() ^ 2074272516)));
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("!\"\u0014*291*\u001a-7.\u001e1;A>B$F4HH\u001a8L:", (char) (jjjjkjj.rrrrrr0072() ^ 2074272570), (char) (jjjjkjj.rrrrrr0072() ^ 2074272513)))) {
            this.vv0076v0076v0076 = tt0074t0074t0074(map, xlxllxl.r0072r0072r0072r("]\\L`nsi`FW_TJ[cgZ\\<\\Pb`0DVB", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105951), (char) (jjjjkjj.rrrrrr0072() ^ 2074272516)));
        }
        String strR007200720072r0072r = xlxllxl.r007200720072r0072r("RQAU[`VM;LTI9,4BW#?Q=", (char) (jjjjkjj.rrrrrr0072() ^ 2074272604), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105884), (char) (jjjjkjj.rrrrrr0072() ^ 2074272512));
        int i3 = fffff00660066;
        if (((f0066fff00660066() + i3) * i3) % ff0066ff00660066() != 0) {
            fffff00660066 = f00660066ff00660066();
        }
        if (map.containsKey(strR007200720072r0072r)) {
            this.v00760076v0076v0076 = tt0074t0074t0074(map, xlxllxl.r007200720072r0072r(";\u001clbI0\u0007_\u001e\u0011yP!u^N4a^R\u001f", (char) (jjjjkjj.rrrrrr0072() ^ 2074272547), (char) (jkkkjjj.rrr007200720072r() ^ 1252464183), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105816)));
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("lk[ouzpgUfncSFOo[mk;WiU", (char) (jjkjkjj.r00720072rrr0072() ^ 1742859003), (char) (1132105862 ^ jkjjkjj.rr0072rrr0072()), (char) (1742858861 ^ jjkjkjj.r00720072rrr0072())))) {
            this.vvv00760076v0076 = tt0074t0074t0074(map, xlxllxl.r0072r0072r0072r("XWG[af\\SARZO?2;[GYW'CUA", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105868), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105823)));
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("5(2859\u00117>0>C/;$9D8G=EC<", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858985), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105831), (char) (jkkkjjj.rrr007200720072r() ^ 1252464208)))) {
            this.v00760076007600760076v = tt0074t0074t0074(map, xlxllxl.r007200720072r0072r("?08<79\u000f38(47!+\u0012%. -!'#\u001a", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858863), (char) (jjjjkjj.rrrrrr0072() ^ 2074272693), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105819)));
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("fjdeaga<_qguiu{", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105851), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105847), (char) (jjjjkjj.rrrrrr0072() ^ 2074272513)))) {
            Object obj4 = map.get(xlxllxl.r0072r0072r0072r("GKEF:@:\u0015@RHVBNT", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105840), (char) (1132105819 ^ jkjjkjj.rr0072rrr0072())));
            if (obj4 instanceof Activity) {
                this.vvv0076v00760076 = (Activity) obj4;
            }
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("zpI1/\u001e:`4O{\u0013*V\u0007\u00180e", (char) (jjjjkjj.rrrrrr0072() ^ 2074272690), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858927), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105817)))) {
            Object obj5 = map.get(xlxllxl.r0072r0072r0072r("sST{+L?\u00056Zk\u0001^UJ_& ", (char) (jjjjkjj.rrrrrr0072() ^ 2074272526), (char) (jjjjkjj.rrrrrr0072() ^ i)));
            if ((obj5 instanceof Set) && !((Set) obj5).isEmpty()) {
                this.vvvvv00760076 = (Set) map.get(xlxllxl.r007200720072r0072r("kG\u000fnR\u0018kAxqU!\tR0{R7", (char) (jkkkjjj.rrr007200720072r() ^ 1252464212), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105870), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858858)));
            }
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("aVib]]@daibr", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858911), (char) (jjjjkjj.rrrrrr0072() ^ 2074272513)))) {
            Object obj6 = map.get(xlxllxl.r007200720072r0072r("9.A:55\u0018<9A:J", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858900), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858818), (char) (2074272513 ^ jjjjkjj.rrrrrr0072())));
            if ((obj6 instanceof Set) && !((Set) obj6).isEmpty()) {
                this.v0076vvv00760076 = (Set) map.get(xlxllxl.r0072r0072r0072r("!BD\u001fz..\f.40\u001b", (char) (jkkkjjj.rrr007200720072r() ^ 1252464240), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858853)));
            }
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("=17<2)\r1,&#3\b\u001e2\u001c-\u001c* &)", (char) (jkkkjjj.rrr007200720072r() ^ 1252464196), (char) (jjjjkjj.rrrrrr0072() ^ 2074272512)))) {
            Object obj7 = map.get(xlxllxl.r0072r0072r0072r("\b}\u0006\r\u0005}c\n\u0007\u0003\u0002\u0014j\u0003\u0019\u0005\u0018\t\u0019\u0011\u0019\u001e", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858980), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858862)));
            if (obj7 instanceof Boolean) {
                this.vv0076vv00760076 = ((Boolean) obj7).booleanValue();
            }
        }
        if (map.containsKey(xlxllxl.r0072r0072r0072r("\u0011\u007fy^\u0007\u0004\b\u0001Zvt~\n\u007fy}n|H|\u0002\u0001tnvvd", (char) (jkkkjjj.rrr007200720072r() ^ 1252464307), (char) (jjjjkjj.rrrrrr0072() ^ 2074272516)))) {
            Object obj8 = map.get(xlxllxl.r007200720072r0072r("mZV9[V\\S7QQY^RNPKW%WVSIASQA", (char) (jjjjkjj.rrrrrr0072() ^ 2074272512), (char) (jkkkjjj.rrr007200720072r() ^ 1252464339), (char) (2074272516 ^ jjjjkjj.rrrrrr0072())));
            if (obj8 instanceof String) {
                this.v00760076vv00760076 = (String) obj8;
            }
        }
        boolean z = false;
        if (map.containsKey(xlxllxl.r007200720072r0072r("V_-OQI]OT7HE&N@@IA?", (char) (jjjjkjj.rrrrrr0072() ^ 2074272536), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105773), (char) (jkkkjjj.rrr007200720072r() ^ 1252464214)))) {
            Object obj9 = map.get(xlxllxl.r007200720072r0072r("2U8eA\u0016j\u000elMgm(mjZ\u0014\u001f.", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858806), (char) (jjjjkjj.rrrrrr0072() ^ 2074272531), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105817)));
            this.vvv007600760076v = (obj9 instanceof Boolean) && ((Boolean) obj9).booleanValue();
        }
        if (map.containsKey(xlxllxl.r007200720072r0072r("~\u000fE|#Fh:[|@\b/T\u0001\u001dn\u00011", (char) (jkkkjjj.rrr007200720072r() ^ 1252464348), (char) (jjjjkjj.rrrrrr0072() ^ 2074272555), (char) (1742858858 ^ jjkjkjj.r00720072rrr0072())))) {
            Object obj10 = map.get(xlxllxl.r007200720072r0072r("L@FKA8(E6\u001d0A81/\u00178,,", (char) (jjjjkjj.rrrrrr0072() ^ 2074272528), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105783), (char) (2074272512 ^ jjjjkjj.rrrrrr0072())));
            if ((obj10 instanceof Boolean) && ((Boolean) obj10).booleanValue()) {
                z = true;
            }
            this.v0076v007600760076v = z;
        }
    }
}
