package com.behaviosec.rl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.behaviosec.rl.android.LogBridge;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ooodddd {
    private static final String[] e00650065e006500650065;
    private static final String[] e0065ee006500650065;
    private static final int ee00650065006500650065 = 5;
    private static final String[] ee0065e006500650065;
    private static final yyylyly[] eee0065006500650065;
    private static final String[] eeee006500650065;

    @SuppressLint
    private static ooodddd ttt0074ttt = null;
    public static int v00760076vvv00760076 = 1;
    public static int v0076v0076vv00760076 = 69;
    public static int vv0076vvv00760076 = 0;
    public static int vvv0076vv00760076 = 2;
    private List<String> t00740074tttt;
    private final Context t0074ttttt;
    private boolean tt0074tttt = true;
    private static final String e0065e0065e00650065 = uuxuuuu.pppp0070ppp("Z\u0004\r\u0005z\u000f\u000b\u000fa\u0004\u0014\u0006\u0005\u0017\u0013\u0017", (char) (yyyllll.rrrr007200720072() ^ 383821997), (char) (yyyllll.rrrr007200720072() ^ 383821866));
    private static final String e0065e0065006500650065 = uuxuuuu.pppp0070ppp("\u0003\u0001}~{~y{~", (char) (yylylll.r0072r0072r00720072() ^ (-1349847201)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)));
    private static final String[] ee00650065e00650065 = {uuxuuuu.pppp0070ppp("@tt\u0005<\u007fzmtm{5liq{e", (char) (yylylll.r0072r0072r00720072() ^ (-1349847265)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), uuxuuuu.pp0070p0070ppp("~33Cz>9,3,:s&$5&\" ,!\u001b\"\u001f'1\u001b", (char) (yllylll.r007200720072r00720072() ^ (-1146716928)), (char) (yllylll.r007200720072r00720072() ^ (-1146716847)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788)))};
    private static final String[] e006500650065e00650065 = {uuxuuuu.pppp0070ppp("bie\\]_h\\", (char) (yylylll.r0072r0072r00720072() ^ (-1349847245)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335)))};

    public interface ooddddd {
        void onResult(boolean z);
    }

    static {
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716861));
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        int i = v0076v0076vv00760076;
        if (((v00760076vvv00760076 + i) * i) % vvv0076vv00760076 != vv0076vvv00760076) {
            v0076v0076vv00760076 = v0076vvvv00760076();
            vv0076vvv00760076 = v0076vvvv00760076();
        }
        eeee006500650065 = new String[]{uuxuuuu.pppp0070ppp("\u0012HJ\\\u0016[XMVQa\u001d`U^gW", cR007200720072r00720072, (char) (iRrrr007200720072 ^ 383821866)), uuxuuuu.pppp0070ppp("\"XVh&iZcp[icoe", (char) (yyyllll.rrrr007200720072() ^ 383821913), (char) (yyyllll.rrrr007200720072() ^ 383821870))};
        e0065ee006500650065 = new String[]{uuxuuuu.pp0070p0070ppp("\u000ed['9J\u0010Oj\u000429\u001c\u0003Gay\td\u001f|L", (char) (ylyylll.r0072rrr00720072() ^ (-1691741414)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847115)), (char) (yyyllll.rrrr007200720072() ^ 383821871)), uuxuuuu.pppp0070ppp("N\r\n\u0001BC??", (char) (yllylll.r007200720072r00720072() ^ (-1146716793)), (char) (yyyllll.rrrr007200720072() ^ 383821865)), uuxuuuu.pppp0070ppp("\u000e|\rz\u0003\bv?\u0005\u0004dZk\u0004B?6yi", (char) (yllylll.r007200720072r00720072() ^ (-1146716674)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))), uuxuuuu.pp0070p0070ppp("\f\u0012\u000e\u001aT\u001c\u001d\u007fw\u000b%ed]#\u0015", (char) (yylylll.r0072r0072r00720072() ^ (-1349847043)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847071)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))), uuxuuuu.pppp0070ppp("%\u0002D\u001aj\u000be\u0006*\u0006\u000e\r\u001b\u001b", (char) (yyyllll.rrrr007200720072() ^ 383822068), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), uuxuuuu.pppp0070ppp("JVVBJ\u0015\\G[c\"\u001f", (char) (yyyllll.rrrr007200720072() ^ 383821896), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))), uuxuuuu.pp0070p0070ppp("W[U_\u0018_JV^\u001d\u001a\u0011TD", (char) (yllylll.r007200720072r00720072() ^ (-1146716776)), (char) (yllylll.r007200720072r00720072() ^ (-1146716810)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), uuxuuuu.pp0070p0070ppp("^\u0019H\u0006-A\fcJ\u00050\bamD\u0017&", (char) (yllylll.r007200720072r00720072() ^ (-1146716818)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741251)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)))};
        ee0065e006500650065 = new String[]{uuxuuuu.pp0070p0070ppp("kwwcc.`lau", (char) (ylyylll.r0072rrr00720072() ^ (-1691741420)), (char) (yyyllll.rrrr007200720072() ^ 383821911), (char) (yyyllll.rrrr007200720072() ^ 383821869)), uuxuuuu.pppp0070ppp("3HM\u001fqTb6D \u0016\u000b\u000e^U", (char) (yyyllll.rrrr007200720072() ^ 383821834), (char) (yllylll.r007200720072r00720072() ^ (-1146716785)))};
        e00650065e006500650065 = new String[]{uuxuuuu.pppp0070ppp("\u0004\u0010\u0014\u007f{F\n\n\u000e", (char) (ylyylll.r0072rrr00720072() ^ (-1691741429)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))), uuxuuuu.pp0070p0070ppp("=C?K\u0006GIS\nOA", (char) (ylyylll.r0072rrr00720072() ^ (-1691741274)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))), uuxuuuu.pp0070p0070ppp("\bx\u000bz\u0005\f|G\t\u000b\u0015K\u0011\u0003", (char) (yyyllll.rrrr007200720072() ^ 383821972), (char) (yllylll.r007200720072r00720072() ^ (-1146716892)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)))};
        yyylyly yyylylyVar = new yyylyly(uuxuuuu.pp0070p0070ppp("\u0004\u0012N\u0011\f\u0019]\u0002\u000e\u0019N\u000eW\u000e", (char) (yllylll.r007200720072r00720072() ^ (-1146716692)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847220)), (char) (yyyllll.rrrr007200720072() ^ 383821867)), null);
        yyylyly yyylylyVar2 = new yyylyly(uuxuuuu.pppp0070ppp("\u001c\"\u001e*d+/\u001dh-\"+4l14248", (char) (ylyylll.r0072rrr00720072() ^ (-1691741328)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343))), null);
        yyylyly yyylylyVar3 = new yyylyly(uuxuuuu.pppp0070ppp("\u0012\u0007\u0010\u0019R\u000e\u001eU\u0016\u000b\u0014\u001a\u0018\u0013(#", (char) (yylylll.r0072r0072r00720072() ^ (-1349847086)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))), null);
        yyylyly yyylylyVar4 = new yyylyly(uuxuuuu.pppp0070ppp("J?HQ\u000bQE\u000eGCNIDIHUN\\L", (char) (yyyllll.rrrr007200720072() ^ 383822042), (char) ((-1146716792) ^ yllylll.r007200720072r00720072())), null);
        yyylyly yyylylyVar5 = new yyylyly(uuxuuuu.pp0070p0070ppp("\u001d\u0012\u001b$]$\u0018` \u0018\u001a\u0016\u001c\u001e(.%17", (char) (yylylll.r0072r0072r00720072() ^ (-1349847122)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741223)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), null);
        yyylyly yyylylyVar6 = new yyylyly(uuxuuuu.pppp0070ppp("\u0010\fM\u0001\t\b\u0010\u0007\u0005u{{\u0004", (char) (yyyllll.rrrr007200720072() ^ 383821878), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), uuxuuuu.pppp0070ppp("JBBD@GA", (char) (ylyylll.r0072rrr00720072() ^ (-1691741245)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))));
        yyylyly yyylylyVar7 = new yyylyly(uuxuuuu.pppp0070ppp("0a\f.i\u0015{Z\u00160)", (char) (yllylll.r007200720072r00720072() ^ (-1146716748)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), uuxuuuu.pp0070p0070ppp("MHZacA1", (char) (yllylll.r007200720072r00720072() ^ (-1146716771)), (char) (yllylll.r007200720072r00720072() ^ (-1146716757)), (char) (yyyllll.rrrr007200720072() ^ 383821871)));
        if ((v0076vvvv00760076() * (v0076vvvv00760076() + v00760076vvv00760076)) % vvv0076vv00760076 != vv0076vvv00760076) {
            v0076v0076vv00760076 = 0;
            vv0076vvv00760076 = v0076vvvv00760076();
        }
        eee0065006500650065 = new yyylyly[]{yyylylyVar, yyylylyVar2, yyylylyVar3, yyylylyVar4, yyylylyVar5, yyylylyVar6, yyylylyVar7, new yyylyly(uuxuuuu.pppp0070ppp("\u0002\u007f?zt\u0007y\u000ex\u000b~", (char) (ylyylll.r0072rrr00720072() ^ (-1691741306)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))), uuxuuuu.pp0070p0070ppp("qzxqtx\u0004y", (char) (yyyllll.rrrr007200720072() ^ 383821864), (char) (yllylll.r007200720072r00720072() ^ (-1146716913)), (char) ((-1146716790) ^ yllylll.r007200720072r00720072()))), new yyylyly(uuxuuuu.pp0070p0070ppp("\u001eJvbR\rv\u001c\ty\u001bVB}h\u0011\u0012I<\u001e\\Rn", (char) (ylyylll.r0072rrr00720072() ^ (-1691741379)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847165)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))), null), new yyylyly(uuxuuuu.pp0070p0070ppp("\u001b\u0019X\u0017\u0012 \u001d\u0015\u001d_$\u0019\"+d\u001f%\u001f.", (char) (ylyylll.r0072rrr00720072() ^ (-1691741190)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741438)), (char) (yyyllll.rrrr007200720072() ^ 383821866)), null), new yyylyly(uuxuuuu.pppp0070ppp("!\u001dZ\u0017\u0010\u001c\u0017\r\u0013S\u0016\t\u0010\u0017", (char) (yllylll.r007200720072r00720072() ^ (-1146716909)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))), uuxuuuu.pppp0070ppp("-", (char) (yyyllll.rrrr007200720072() ^ 383821865), (char) (yllylll.r007200720072r00720072() ^ (-1146716791)))), new yyylyly(uuxuuuu.pppp0070ppp(")'b&%#\u0015'\"4j\" 2\"\u001d\f", (char) (yylylll.r0072r0072r00720072() ^ (-1349847100)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))), uuxuuuu.pp0070p0070ppp("|I(d\u0017 \u0013", (char) (yyyllll.rrrr007200720072() ^ 383821854), (char) (yllylll.r007200720072r00720072() ^ (-1146716843)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331)))), new yyylyly(uuxuuuu.pppp0070ppp("GC\u0001BC?3C0@x78,,2", (char) (yllylll.r007200720072r00720072() ^ (-1146716893)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))), uuxuuuu.pppp0070ppp("|;R", (char) (yyyllll.rrrr007200720072() ^ 383821969), (char) (yllylll.r007200720072r00720072() ^ (-1146716785)))), new yyylyly(uuxuuuu.pp0070p0070ppp("'#\\\bE0\u000e[U@O\u0019h7\u000e", (char) (yylylll.r0072r0072r00720072() ^ (-1349847231)), (char) (yllylll.r007200720072r00720072() ^ (-1146716859)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))), uuxuuuu.pp0070p0070ppp("`PV", (char) (ylyylll.r0072rrr00720072() ^ (-1691741280)), (char) (yllylll.r007200720072r00720072() ^ (-1146716865)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788)))), new yyylyly(uuxuuuu.pppp0070ppp("ie#gXdZQ[\\\\", (char) (yylylll.r0072r0072r00720072() ^ (-1349847055)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))), null)};
    }

    private ooodddd(Context context) {
        ArrayList arrayList = new ArrayList();
        this.t00740074tttt = arrayList;
        this.t0074ttttt = context;
        arrayList.add(uuxuuuu.pppp0070ppp("\u0010\u001b\u0018W\u0010\u0017\u0016\r\u0011\tP\u0003\u000f\u0004\u0011\r\u0006\u007fH\u0006y\r\u0005x|x\u0005?|p\b|\u0002\u007f}7olt~qrvjom", (char) (yyyllll.rrrr007200720072() ^ 383821944), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))));
        this.t00740074tttt.add(uuxuuuu.pp0070p0070ppp(">;,q3rrA^1@IF0", (char) (ylyylll.r0072rrr00720072() ^ (-1691741381)), (char) (yyyllll.rrrr007200720072() ^ 383822065), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))));
        this.t00740074tttt.add(uuxuuuu.pp0070p0070ppp("CPO\u0011FNMUWa\u0018L\\]", (char) (yllylll.r007200720072r00720072() ^ (-1146716690)), (char) (yllylll.r007200720072r00720072() ^ (-1146716801)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))));
    }

    private boolean d006400640064ddd() {
        return this.tt0074tttt;
    }

    private List<String> d0064d0064ddd() {
        if ((v0076vvvv00760076() * (v0076vvvv00760076() + v00760076vvv00760076)) % vvv0076vv00760076 != vv0076vvv00760076) {
            v0076v0076vv00760076 = 77;
            vv0076vvv00760076 = v0076vvvv00760076();
        }
        return this.t00740074tttt;
    }

    private boolean d0064ddddd() throws ClassNotFoundException {
        int i = 0;
        for (yyylyly yyylylyVar : eee0065006500650065) {
            String strDd00640064ddd = dd00640064ddd(this.t0074ttttt, yyylylyVar.name);
            String str = yyylylyVar.seek_value;
            if (str == null && strDd00640064ddd != null) {
                i++;
            }
            if (str != null && strDd00640064ddd != null) {
                int i2 = v0076v0076vv00760076;
                if (((v00760076vvv00760076 + i2) * i2) % vvv0076vv00760076 != vv0076vvv00760076) {
                    v0076v0076vv00760076 = 51;
                    vv0076vvv00760076 = 58;
                }
                if (strDd00640064ddd.contains(str)) {
                    i++;
                }
            }
        }
        if (i < 5) {
            return false;
        }
        dddd0064dd(uuxuuuu.pppp0070ppp("W}{z\u00049k`\n\u0013n\u0012\u0010\u0012\u0016C\u000e\u0019F\f\u000e\u001e\u0010\u000f!\u0013\u0013", (char) (yllylll.r007200720072r00720072() ^ (-1146716771)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))));
        return true;
    }

    private String dd00640064ddd(Context context, String str) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass(uuxuuuu.pppp0070ppp("Z\u0017n`=| x\u000ea2A\u0017\u0003$z(!j\u0004HtkqJ6e", (char) (yllylll.r007200720072r00720072() ^ (-1146716726)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))));
            char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847134));
            int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
            int iV0076vvvv00760076 = v0076vvvv00760076();
            if (((v00760076vvv00760076 + iV0076vvvv00760076) * iV0076vvvv00760076) % vvv0076vv00760076 != 0) {
                v0076v0076vv00760076 = 37;
                vv0076vvv00760076 = v0076vvvv00760076();
            }
            return (String) clsLoadClass.getMethod(uuxuuuu.pp0070p0070ppp("\u000e\u000b\u0019", cR0072r0072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847289)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), String.class).invoke(clsLoadClass, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ooodddd dd0064d0064dd(Context context) {
        if (context != null) {
            if (ttt0074ttt == null) {
                ttt0074ttt = new ooodddd(context.getApplicationContext());
            }
            return ttt0074ttt;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(uuxuuuu.pp0070p0070ppp("\u001a\u0004\u000f#u?Uc\th\u0001o\\!Q1\u001f?\u0017Q:\u0013]\u0010v", (char) (ylyylll.r0072rrr00720072() ^ (-1691741379)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847047)), (char) (yyyllll.rrrr007200720072() ^ 383821871)));
        if ((v0076vvvv00760076() * (v0076vvvv00760076() + v00760076vvv00760076)) % vvv0076vv00760076 == vv0076vvv00760076) {
            throw illegalArgumentException;
        }
        vv0076vvv00760076 = v0076vvvv00760076();
        throw illegalArgumentException;
    }

    private boolean dd0064dddd() throws Exception {
        dddd0064dd(ddd0064ddd());
        boolean zSs0073s007300730073 = ss0073s007300730073();
        dddd0064dd(uuxuuuu.pppp0070ppp("n\u0015\u0013\u0012\u001bP\u0014\u0014'\u001e\u0019V", (char) (yllylll.r007200720072r00720072() ^ (-1146716694)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))) + zSs0073s007300730073);
        if (!zSs0073s007300730073) {
            zSs0073s007300730073 = s0073ss007300730073();
            dddd0064dd(uuxuuuu.pppp0070ppp("\u0004($!([{\u001e/\u0019%\u0019\u001a\u0018R", (char) (ylyylll.r0072rrr00720072() ^ (-1691741257)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))) + zSs0073s007300730073);
        }
        if (!zSs0073s007300730073) {
            zSs0073s007300730073 = s0073s0073007300730073();
            dddd0064dd(uuxuuuu.pppp0070ppp("/\u001ajN@2|7tndFs:\u000fA\u0013\u0003\u0017", (char) (yllylll.r007200720072r00720072() ^ (-1146716928)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))) + zSs0073s007300730073);
            int i = v0076v0076vv00760076;
            if (((v00760076vvv00760076 + i) * i) % vvv0076vv00760076 != 0) {
                v0076v0076vv00760076 = v0076vvvv00760076();
                vv0076vvv00760076 = v0076vvvv00760076();
            }
        }
        return zSs0073s007300730073;
    }

    private static String ddd0064ddd() {
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pppp0070ppp("{0%)\"l\u0010\u0013\u0011\u0007\u0019\b\u001a\u0001g", (char) (ylyylll.r0072rrr00720072() ^ (-1691741387)), (char) (yyyllll.rrrr007200720072() ^ 383821859)));
        sb.append(Build.PRODUCT);
        sb.append(uuxuuuu.pppp0070ppp("nnoKFkY({,-@\u0007\u0007\u00146\u0001i>\u001eC", (char) (yylylll.r0072r0072r00720072() ^ (-1349847234)), (char) (yyyllll.rrrr007200720072() ^ 383821869)));
        sb.append(Build.MANUFACTURER);
        sb.append(uuxuuuu.pppp0070ppp("E~3(,%o\u0005\u0016\u0006\u0014\u000b\u0002h", (char) (yylylll.r0072r0072r00720072() ^ (-1349847217)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))));
        sb.append(Build.BRAND);
        sb.append(uuxuuuu.pppp0070ppp("o)]RNG\u0012)3E94/%\f", (char) (yyyllll.rrrr007200720072() ^ 383822031), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))));
        sb.append(Build.DEVICE);
        sb.append(uuxuuuu.pppp0070ppp("J\u00048-1*t\u0015\u0018\u000e\u0010\u0018\u0007m", (char) (yyyllll.rrrr007200720072() ^ 383821835), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343))));
        sb.append(Build.MODEL);
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716768));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = v0076v0076vv00760076;
        if (((v00760076vvv00760076 + i) * i) % vvv0076vv00760076 != v007600760076vv00760076()) {
            v0076v0076vv00760076 = 5;
            vv0076vvv00760076 = 71;
        }
        sb.append(uuxuuuu.pppp0070ppp("75<\u0013\u007f4\u001c`\u0014\u0014\u0006x\u0011.G\\\u0007", cR007200720072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847052))));
        sb.append(Build.HARDWARE);
        sb.append(uuxuuuu.pp0070p0070ppp("\u0015a\u001d\u001d(4&FUjo\u0016/=GJw\u0012\u007fq", (char) (yylylll.r0072r0072r00720072() ^ (-1349847295)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741190)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))));
        sb.append(Build.FINGERPRINT);
        return sb.toString();
    }

    private void dddd0064dd(String str) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp(".&oJ?w\u001bMRcHc14/W", (char) (yyyllll.rrrr007200720072() ^ 383821920), (char) (yyyllll.rrrr007200720072() ^ 383821869));
        if ((v0076vvvv00760076() * (v0076vvvv00760076() + v00760076vvv00760076)) % vv00760076vv00760076() != vv0076vvv00760076) {
            v0076v0076vv00760076 = v0076vvvv00760076();
            vv0076vvv00760076 = 6;
        }
        LogBridge.d(strPppp0070ppp, str);
    }

    private ooodddd s007300730073s00730073(String str) {
        this.t00740074tttt.add(str);
        int i = v0076v0076vv00760076;
        if (((v00760076vvv00760076 + i) * i) % vvv0076vv00760076 != 0) {
            v0076v0076vv00760076 = v0076vvvv00760076();
            vv0076vvv00760076 = v0076vvvv00760076();
        }
        return this;
    }

    private boolean s00730073s007300730073(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (new File(str2).exists()) {
                StringBuilder sb = new StringBuilder();
                char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847278));
                int iRrrr007200720072 = yyyllll.rrrr007200720072() ^ 383821952;
                int i = v0076v0076vv00760076;
                if (((v00760076vvv00760076 + i) * i) % vvv0076vv00760076 != 0) {
                    v0076v0076vv00760076 = v0076vvvv00760076();
                    vv0076vvv00760076 = v0076vvvv00760076();
                }
                sb.append(uuxuuuu.pp0070p0070ppp("%4\u001fJ<^", cR0072r0072r00720072, (char) iRrrr007200720072, (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
                sb.append(str);
                sb.append(uuxuuuu.pp0070p0070ppp("=\b\u0013@\u0006\b\u0018\n\t\u001b\r\r", (char) (yllylll.r007200720072r00720072() ^ (-1146716858)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741350)), (char) (yyyllll.rrrr007200720072() ^ 383821866)));
                dddd0064dd(sb.toString());
                return true;
            }
        }
        return false;
    }

    private boolean s0073s0073007300730073() throws Exception {
        if (!this.tt0074tttt || this.t00740074tttt.isEmpty()) {
            return false;
        }
        try {
            PackageManager packageManager = (PackageManager) Class.forName(uuxuuuu.pp0070p0070ppp("\u0010\u001c\u0011\u001e\u001a\u0013\rU\n\u0015\u0013\u0018\b\u0010\u0015Ma\r\u000b\u0010\u007f\u0012\r", (char) (yylylll.r0072r0072r00720072() ^ (-1349847056)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847236)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329)))).getMethod(uuxuuuu.pp0070p0070ppp("CBR/ADMDKJ3HVJQP^", (char) (yylylll.r0072r0072r00720072() ^ (-1349847248)), (char) (yyyllll.rrrr007200720072() ^ 383822012), (char) (yyyllll.rrrr007200720072() ^ 383821864)), null).invoke(this.t0074ttttt, null);
            Iterator<String> it = this.t00740074tttt.iterator();
            int i = v0076v0076vv00760076;
            if (((v00760076vvv00760076 + i) * i) % vvv0076vv00760076 != 0) {
                v0076v0076vv00760076 = 2;
                vv0076vvv00760076 = v0076vvvv00760076();
            }
            while (it.hasNext()) {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(it.next());
                if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (InvocationTargetException e) {
            throw e.getCause();
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static /* synthetic */ boolean s0073s0073s00730073(ooodddd oooddddVar) {
        int i = v0076v0076vv00760076;
        if (((v00760076vvv00760076 + i) * i) % vvv0076vv00760076 != vv0076vvv00760076) {
            v0076v0076vv00760076 = 59;
            vv0076vvv00760076 = v0076vvvv00760076();
        }
        return oooddddVar.dd0064dddd();
    }

    private boolean s0073ss007300730073() {
        if (s00730073s007300730073(ee00650065e00650065, uuxuuuu.pppp0070ppp("e\u0005\u000b\u0017", (char) (yylylll.r0072r0072r00720072() ^ (-1349847060)), (char) (yyyllll.rrrr007200720072() ^ 383821870))) || s00730073s007300730073(ee0065e006500650065, uuxuuuu.pppp0070ppp("Nzo\u0004", (char) (yllylll.r007200720072r00720072() ^ (-1146716808)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786)))) || s00730073s007300730073(e00650065e006500650065, uuxuuuu.pp0070p0070ppp("\u001fAK", (char) (yyyllll.rrrr007200720072() ^ 383822075), (char) (yllylll.r007200720072r00720072() ^ (-1146716919)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)))) || ss00730073007300730073()) {
            return true;
        }
        int i = v0076v0076vv00760076;
        if (((v00760076vvv00760076 + i) * i) % vv00760076vv00760076() != 0) {
            v0076v0076vv00760076 = 85;
            vv0076vvv00760076 = v0076vvvv00760076();
        }
        if (s00730073s007300730073(eeee006500650065, uuxuuuu.pp0070p0070ppp("|\u0017\u001f\u0015$", (char) (yyyllll.rrrr007200720072() ^ 383821976), (char) (yllylll.r007200720072r00720072() ^ (-1146716801)), (char) (yyyllll.rrrr007200720072() ^ 383821864))) || sss0073007300730073()) {
            return true;
        }
        return d0064ddddd() && s00730073s007300730073(e0065ee006500650065, uuxuuuu.pppp0070ppp("J+*", (char) (yllylll.r007200720072r00720072() ^ (-1146716802)), (char) (yyyllll.rrrr007200720072() ^ 383821859)));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean ss00730073007300730073() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.ooodddd.ss00730073007300730073():boolean");
    }

    public static /* synthetic */ void ss00730073s00730073(ooodddd oooddddVar, String str) {
        int i = v0076v0076vv00760076;
        if (((v00760076vvv00760076 + i) * i) % vvv0076vv00760076 != vv0076vvv00760076) {
            v0076v0076vv00760076 = v0076vvvv00760076();
            vv0076vvv00760076 = v0076vvvv00760076();
        }
        oooddddVar.dddd0064dd(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean ss0073s007300730073() {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.ooodddd.ss0073s007300730073():boolean");
    }

    private boolean sss0073007300730073() throws IOException {
        if (ContextCompat.a(this.t0074ttttt, uuxuuuu.pppp0070ppp("\u0010\u001c\u0011\u001e\u001a\u0013\rU\u0017\u000b\u0017\u0011\f\u0015\u0014\t\u000e\fJdhm]idZh", (char) (yyyllll.rrrr007200720072() ^ 383821872), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056)))) != 0) {
            return false;
        }
        String[] strArr = {uuxuuuu.pp0070p0070ppp("y=B;;+2r%+/n-#1\u001f!!", (char) (yllylll.r007200720072r00720072() ^ (-1146716840)), (char) (yyyllll.rrrr007200720072() ^ 383822026), (char) (yyyllll.rrrr007200720072() ^ 383821869))};
        StringBuilder sb = new StringBuilder();
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(strArr);
            processBuilder.directory(new File(uuxuuuu.pppp0070ppp("T\u001a!\u001c\u001e\u0010\u0019[\u0010\u0018\u001e_", (char) (ylyylll.r0072rrr00720072() ^ (-1691741432)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)))));
            processBuilder.redirectErrorStream(true);
            InputStream inputStream = processBuilder.start().getInputStream();
            byte[] bArr = new byte[1024];
            while (inputStream.read(bArr) != -1) {
                sb.append(new String(bArr));
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        String string = sb.toString();
        dddd0064dd(uuxuuuu.pppp0070ppp("siwegg\u001fb^p\\\u001a&6\u0017", (char) (yyyllll.rrrr007200720072() ^ 383821846), (char) (yyyllll.rrrr007200720072() ^ 383821867)) + string);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        String[] strArrSplit = string.split(uuxuuuu.pppp0070ppp("\t", (char) (yllylll.r007200720072r00720072() ^ (-1146716681)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))));
        int iV0076vvvv00760076 = v0076vvvv00760076();
        if (((v00760076vvv00760076 + iV0076vvvv00760076) * iV0076vvvv00760076) % vvv0076vv00760076 != 0) {
            v0076v0076vv00760076 = 6;
            vv0076vvv00760076 = v0076vvvv00760076();
        }
        for (String str : strArrSplit) {
            if ((str.contains(uuxuuuu.pppp0070ppp("qeYe&", (char) (ylyylll.r0072rrr00720072() ^ (-1691741329)), (char) (yyyllll.rrrr007200720072() ^ 383821868))) || str.contains(uuxuuuu.pp0070p0070ppp("MOIH\r", (char) (yyyllll.rrrr007200720072() ^ 383822005), (char) (yyyllll.rrrr007200720072() ^ 383822062), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)))) || str.contains(uuxuuuu.pppp0070ppp("\r\u001d\u0012Z", (char) (yylylll.r0072r0072r00720072() ^ (-1349847259)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))))) && str.contains(uuxuuuu.pppp0070ppp("SSRUTYVZ_", (char) (yylylll.r0072r0072r00720072() ^ (-1349847198)), (char) (yyyllll.rrrr007200720072() ^ 383821859)))) {
                dddd0064dd(uuxuuuu.pp0070p0070ppp("\u0007+'$+^\u0007\r[$-X\u001c\u001c*\u001a\u0017'\u0017\u0015", (char) (ylyylll.r0072rrr00720072() ^ (-1691741218)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741206)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))));
                return true;
            }
        }
        return false;
    }

    public static int v007600760076vv00760076() {
        return 0;
    }

    public static int v0076vvvv00760076() {
        return 2;
    }

    public static int vv00760076vv00760076() {
        return 2;
    }

    public void d00640064dddd(final ooddddd oodddddVar) {
        new Thread(new Runnable() { // from class: com.behaviosec.rl.ooodddd.1
            public static int v0076vv0076v00760076 = 1;
            public static int vv0076v0076v00760076 = 2;
            public static int vvvv0076v00760076 = 12;

            @Override // java.lang.Runnable
            public void run() {
                boolean zS0073s0073s00730073 = ooodddd.s0073s0073s00730073(ooodddd.this);
                ooodddd oooddddVar = ooodddd.this;
                StringBuilder sb = new StringBuilder();
                int iR007200720072r00720072 = yllylll.r007200720072r00720072();
                int i = vvvv0076v00760076;
                if (((v0076vv0076v00760076 + i) * i) % vv0076v0076v00760076 != 0) {
                    vvvv0076v00760076 = 73;
                    v0076vv0076v00760076 = 60;
                }
                sb.append(uuxuuuu.pppp0070ppp("fyy\u0003.`\u0006~~nu'ox$Hovl`rln5\u001a", (char) (iR007200720072r00720072 ^ (-1146716815)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))));
                sb.append(zS0073s0073s00730073);
                ooodddd.ss00730073s00730073(oooddddVar, sb.toString());
                ooddddd oodddddVar2 = oodddddVar;
                if (oodddddVar2 != null) {
                    oodddddVar2.onResult(zS0073s0073s00730073);
                }
            }
        }).start();
        int i = v0076v0076vv00760076;
        if (((v00760076vvv00760076 + i) * i) % vvv0076vv00760076 != vv0076vvv00760076) {
            v0076v0076vv00760076 = v0076vvvv00760076();
            vv0076vvv00760076 = v0076vvvv00760076();
        }
    }

    public ooodddd d0064dd0064dd(boolean z) {
        int i = v0076v0076vv00760076;
        if (((v00760076vvv00760076 + i) * i) % vvv0076vv00760076 != vv0076vvv00760076) {
            v0076v0076vv00760076 = v0076vvvv00760076();
            vv0076vvv00760076 = v0076vvvv00760076();
        }
        this.tt0074tttt = z;
        return this;
    }

    public ooodddd ssss007300730073(List<String> list) {
        this.t00740074tttt.addAll(list);
        return this;
    }
}
