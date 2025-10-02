package com.behaviosec.rl.android;

import android.content.Context;
import androidx.annotation.NonNull;
import com.behaviosec.rl.android.FlutterJavaInterfaceException;
import com.behaviosec.rl.ooodood;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylylyly;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;
import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class NonEditTextInputHandler {
    public static int h00680068hhh00680068 = 1;
    public static int hh00680068hh00680068 = 0;
    public static int hh0068hhh00680068 = 50;
    public static int hhh0068hh00680068 = 2;
    private static final String xxxx007800780078;
    private final Map<String, ylylyly> x0078xx007800780078 = new HashMap();

    static {
        int iR007200720072r00720072 = yllylll.r007200720072r00720072();
        int i = hh0068hhh00680068;
        if (((h00680068hhh00680068 + i) * i) % hhh0068hh00680068 != hh00680068hh00680068) {
            hh0068hhh00680068 = 94;
            hh00680068hh00680068 = 73;
        }
        xxxx007800780078 = uuxuuuu.pppp0070ppp("w\u0018\u0016k\n\u000e\u0018v\u0007\u0019\u0014g\f\r\u0011\u000fay\u0006z\u0002y\u0006", (char) (iR007200720072r00720072 ^ (-1146716722)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333)));
    }

    public NonEditTextInputHandler(@NonNull Context context) {
        ooodood.addNonEditTextInputHandler(this, context);
    }

    private ylylyly bbb0062bbb(String str) {
        return this.x0078xx007800780078.get(str);
    }

    public static int h006800680068hh00680068() {
        return 1;
    }

    public static int h0068h0068hh00680068() {
        return 37;
    }

    public static int h0068hh0068h00680068() {
        return 0;
    }

    public static int hhhh0068h00680068() {
        return 2;
    }

    public boolean b006200620062bbb(@NonNull String str, boolean z) throws FlutterJavaInterfaceException {
        if (bbb0062bbb(str) != null) {
            LogBridge.w(uuxuuuu.pppp0070ppp(",NN&>DP1;OL\"@CII\u00160>560>", (char) (yyyllll.rrrr007200720072() ^ 383822071), (char) (yyyllll.rrrr007200720072() ^ 383821870)), uuxuuuu.pppp0070ppp("XJKLUUEQ)BU=I:J;*6F:7Eo=/:1\u0005p", (char) (ylyylll.r0072rrr00720072() ^ (-1691741350)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))) + str + uuxuuuu.pp0070p0070ppp("E\u0011#g\u00158r\u001fdI.Ef(\u001cZ", (char) (yllylll.r007200720072r00720072() ^ (-1146716777)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741239)), (char) (yyyllll.rrrr007200720072() ^ 383821865)));
            throw new FlutterJavaInterfaceException(FlutterJavaInterfaceException.ErrorCode.ENTRY_EXISTS_FOR_ID);
        }
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("[{yOmq{Zj|wKoptrE]i^e]i", (char) (yylylll.r0072r0072r00720072() ^ (-1349847262)), (char) (yyyllll.rrrr007200720072() ^ 383822070), (char) (yllylll.r007200720072r00720072() ^ (-1146716788)));
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pp0070p0070ppp("2C_~#?Ntk!OV|\r9ERy&9P}C->cyip", (char) (yllylll.r007200720072r00720072() ^ (-1146716874)), (char) (yyyllll.rrrr007200720072() ^ 383822006), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))));
        sb.append(str);
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847094));
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        if (((h006800680068hh00680068() + hh0068hhh00680068) * hh0068hhh00680068) % hhhh0068h00680068() != hh00680068hh00680068) {
            hh0068hhh00680068 = h0068h0068hh00680068();
            hh00680068hh00680068 = 17;
        }
        sb.append(uuxuuuu.pp0070p0070ppp("_", cR0072r0072r00720072, (char) (iRrrr007200720072 ^ 383822061), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        ylylyly ylylylyVar = new ylylyly(str, Boolean.valueOf(z));
        this.x0078xx007800780078.put(ylylylyVar.getFieldName(), ylylylyVar);
        LogBridge.d(uuxuuuu.pppp0070ppp("=_[3OU]>L`Y/QTVVGakbgak", (char) (yylylll.r0072r0072r00720072() ^ (-1349847069)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800))), uuxuuuu.pp0070p0070ppp("jo?y>\u001dK\u001fywi\r\u0006'bWTW@.O\u0005l", (char) (yllylll.r007200720072r00720072() ^ (-1146716674)), (char) (yllylll.r007200720072r00720072() ^ (-1146716844)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))) + this);
        return true;
    }

    public List<ylylyly> b0062b0062bbb() {
        int i = 1;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                return new ArrayList(this.x0078xx007800780078.values());
            }
        }
    }

    public void bb00620062bbb(String str, String str2, String str3) throws IllegalArgumentException {
        ylylyly ylylylyVarBbb0062bbb = bbb0062bbb(str);
        if (ylylylyVarBbb0062bbb != null) {
            LogBridge.d(uuxuuuu.pppp0070ppp("\u0001##z\u001b!-\u000e 41\u0007-066\u000b%3*3-;", (char) (ylyylll.r0072rrr00720072() ^ (-1691741224)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))), uuxuuuu.pppp0070ppp("NI^HVI[N?M_UTdEWkh8^Xf`__\u001ck_le;)", (char) (yyyllll.rrrr007200720072() ^ 383821979), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))) + str + uuxuuuu.pppp0070ppp(q2.c, (char) (yyyllll.rrrr007200720072() ^ 383822045), (char) (yllylll.r007200720072r00720072() ^ (-1146716800))));
            ylylylyVarBbb0062bbb.b0062b00620062bb(str2, str3);
            return;
        }
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847287));
        int i = hh0068hhh00680068;
        if (((h00680068hhh00680068 + i) * i) % hhh0068hh00680068 != h0068hh0068h00680068()) {
            hh0068hhh00680068 = h0068h0068hh00680068();
            hh00680068hh00680068 = 26;
        }
        LogBridge.w(uuxuuuu.pppp0070ppp("WwuKimwVfxsGklpnAYeZaYe", cR0072r0072r00720072, (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), uuxuuuu.pppp0070ppp("\u001d\u0016)\u0011\u001d\u000e\u001e\u000f}\n\u001a\u000e\u000b\u0019w\b\u001a\u0015b\u0007~\u000b\u0003\u007f}8\u0006w\u0003yM9", (char) (ylyylll.r0072rrr00720072() ^ (-1691741276)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))) + str + uuxuuuu.pp0070p0070ppp("A;\u0001\r\u0004\u0013\u000fH\u0017C\n\u001e\u0010\u001b\u001d\u001d", (char) (yllylll.r007200720072r00720072() ^ (-1146716845)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741271)), (char) (yyyllll.rrrr007200720072() ^ 383821866)));
    }

    public void bbbb0062bb() {
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
        if ((h0068h0068hh00680068() * (h0068h0068hh00680068() + h00680068hhh00680068)) % hhh0068hh00680068 != hh00680068hh00680068) {
            hh0068hhh00680068 = h0068h0068hh00680068();
            hh00680068hh00680068 = 6;
        }
        LogBridge.d(uuxuuuu.pppp0070ppp(".NL\"@DN-=OJ\u001eBCGE\u00180<180<", (char) (iR0072rrr00720072 ^ (-1691741386)), (char) (yyyllll.rrrr007200720072() ^ 383821870)), uuxuuuu.pppp0070ppp("\t+U\u007f'Z\u001a\u0016h0", (char) (yllylll.r007200720072r00720072() ^ (-1146716806)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))) + this);
        this.x0078xx007800780078.clear();
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pppp0070ppp("\n.a\b^", (char) (ylyylll.r0072rrr00720072() ^ (-1691741187)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))));
        sb.append(super.toString());
        sb.append(uuxuuuu.pppp0070ppp("o8v\u001aBOg`\u0002>2eYO", (char) (yylylll.r0072r0072r00720072() ^ (-1349847119)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))));
        for (Map.Entry<String, ylylyly> entry : this.x0078xx007800780078.entrySet()) {
            int i = hh0068hhh00680068;
            if (((h00680068hhh00680068 + i) * i) % hhh0068hh00680068 != hh00680068hh00680068) {
                hh0068hhh00680068 = h0068h0068hh00680068();
                hh00680068hh00680068 = h0068h0068hh00680068();
            }
            sb.append(entry.getKey());
            sb.append(uuxuuuu.pp0070p0070ppp("k", (char) (yllylll.r007200720072r00720072() ^ (-1146716768)), (char) (yyyllll.rrrr007200720072() ^ 383821937), (char) (yyyllll.rrrr007200720072() ^ 383821870)));
            sb.append(entry.getValue());
            sb.append(uuxuuuu.pp0070p0070ppp("\u0007", (char) (ylyylll.r0072rrr00720072() ^ (-1691741256)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741269)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))));
        }
        return sb.toString();
    }
}
