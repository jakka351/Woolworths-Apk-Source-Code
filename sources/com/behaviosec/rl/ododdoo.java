package com.behaviosec.rl;

import android.content.Context;
import com.behaviosec.rl.android.LogBridge;

/* loaded from: classes4.dex */
public class ododdoo implements yyyylyy {
    private static final String ggggg0067g;
    public static int p00700070pp007000700070 = 0;
    public static int p0070p0070p007000700070 = 2;
    public static int pp0070pp007000700070 = 11;
    public static int ppp0070p007000700070 = 1;
    private final Context g0067ggg0067g;
    private yllylyy gg0067gg0067g = null;
    private final Object g00670067gg0067g = new Object();
    private Boolean ggg0067g0067g = Boolean.FALSE;

    static {
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072() ^ (-1349847095);
        if ((pp00700070p007000700070() * (pp00700070p007000700070() + ppp0070p007000700070)) % p0070p0070p007000700070 != p00700070pp007000700070) {
            pp0070pp007000700070 = 39;
            p00700070pp007000700070 = pp00700070p007000700070();
        }
        ggggg0067g = uuxuuuu.pppp0070ppp("\u0007)+#7).~ 0$0\",0y\u001a \u0018\u0019\u0012$\u0014", (char) iR0072r0072r00720072, (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)));
    }

    public ododdoo(Context context) {
        yyyllyl.r00720072r00720072r(context);
        this.g0067ggg0067g = context;
    }

    public static int p007000700070p007000700070() {
        return 2;
    }

    public static int pp00700070p007000700070() {
        return 27;
    }

    private void v00760076vv0076v() {
        if (ooodood.monitoringEnabled) {
            uuxuuuu.pp0070p0070ppp("2\"\u001e\u0018A\u0016!DKf:\u0017\u000e}Z\n\u0010TF\u001aW\u000bo;", (char) (yyyllll.rrrr007200720072() ^ 383822004), (char) (yylylll.r0072r0072r00720072() ^ (-1349847101)), (char) (yyyllll.rrrr007200720072() ^ 383821871));
            synchronized (this.g00670067gg0067g) {
                try {
                    if (this.ggg0067g0067g.booleanValue()) {
                        LogBridge.i(getTag(), uuxuuuu.pp0070p0070ppp("L@ILTD+F['S\\T3Q\\^PZR`\u0017\u0019\u0011", (char) (ylyylll.r0072rrr00720072() ^ (-1691741337)), (char) (yllylll.r007200720072r00720072() ^ (-1146716870)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))));
                        this.ggg0067g0067g = Boolean.valueOf(!ooodood.removeKeyDownListener(this.g0067ggg0067g));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void vv0076vv0076v() {
        if (ooodood.monitoringEnabled) {
            uuxuuuu.pp0070p0070ppp("jtF~-T\u000b\u0012\u0002A_5G\b\u0014\u0017wNr\u0013\r", (char) (yylylll.r0072r0072r00720072() ^ (-1349847224)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741267)), (char) (yyyllll.rrrr007200720072() ^ 383821871));
            synchronized (this.g00670067gg0067g) {
                try {
                    if (!this.ggg0067g0067g.booleanValue()) {
                        LogBridge.i(getTag(), uuxuuuu.pppp0070ppp("6:;#>S\u001fKTL+ITVHRJX\u000f\u0011\tMZZaSgd+\u0012", (char) (yylylll.r0072r0072r00720072() ^ (-1349847205)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))) + this.g0067ggg0067g);
                        ooodood.addKeyDownListener(this.g0067ggg0067g);
                        this.ggg0067g0067g = Boolean.TRUE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public String getTag() {
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847159));
        char cR0072r0072r007200722 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847060));
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        int i = pp0070pp007000700070;
        if (((ppp0070p007000700070 + i) * i) % p0070p0070p007000700070 != p00700070pp007000700070) {
            pp0070pp007000700070 = 34;
            p00700070pp007000700070 = pp00700070p007000700070();
        }
        return uuxuuuu.pp0070p0070ppp("J\u001c\f\b$\u007f\u000fEWf<\u000f5m#([]nce4j", cR0072r0072r00720072, cR0072r0072r007200722, (char) (iRrrr007200720072 ^ 383821871));
    }

    @Override // com.behaviosec.rl.yyyylyy
    public void onCreate(ylyylyy ylyylyyVar) {
        uuxuuuu.pppp0070ppp("ooEuifzl02*", (char) (yylylll.r0072r0072r00720072() ^ (-1349847284)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)));
        LogBridge.i(getTag(), uuxuuuu.pp0070p0070ppp("\u00147\u001byd;s~QZ\u0002G[._A;w\u001d}\u001d", (char) (yllylll.r007200720072r00720072() ^ (-1146716886)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741266)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))) + ylyylyyVar);
        if (ylyylyyVar != null) {
            ylyylyyVar.initActivity();
            int i = pp0070pp007000700070;
            if (((ppp0070p007000700070 + i) * i) % p0070p0070p007000700070 != p00700070pp007000700070) {
                pp0070pp007000700070 = pp00700070p007000700070();
                p00700070pp007000700070 = 54;
            }
        }
        vv0076vv0076v();
    }

    @Override // com.behaviosec.rl.yyyylyy
    public void onDestroy() {
        uuxuuuu.pppp0070ppp("><\u00111>>;7@mmc", (char) (ylyylll.r0072rrr00720072() ^ (-1691741391)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791)));
        LogBridge.i(getTag(), uuxuuuu.pp0070p0070ppp("jh=]jjgcl\u001a\u001a\u0010", (char) (yllylll.r007200720072r00720072() ^ (-1146716785)), (char) (yyyllll.rrrr007200720072() ^ 383821995), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))));
        int i = pp0070pp007000700070;
        if (((ppp0070p007000700070 + i) * i) % p0070p0070p007000700070 != 0) {
            pp0070pp007000700070 = pp00700070p007000700070();
            p00700070pp007000700070 = pp00700070p007000700070();
        }
        ooodood.yy0079y007900790079(this.g0067ggg0067g);
    }

    @Override // com.behaviosec.rl.yyyylyy
    public void onPause() {
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847184));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = pp0070pp007000700070;
        if (((ppp0070p007000700070 + i) * i) % p0070p0070p007000700070 != 0) {
            pp0070pp007000700070 = pp00700070p007000700070();
            p00700070pp007000700070 = 84;
        }
        uuxuuuu.pppp0070ppp("uuXj\u007f~q57/", cR0072r0072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847046)));
        LogBridge.i(getTag(), uuxuuuu.pp0070p0070ppp("\u0011Y\u0003L9b=\u0011N\u0018", (char) (yylylll.r0072r0072r00720072() ^ (-1349847214)), (char) (yyyllll.rrrr007200720072() ^ 383822012), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
        v00760076vv0076v();
    }

    @Override // com.behaviosec.rl.yyyylyy
    public void onRestart() {
        uuxuuuu.pp0070p0070ppp("\r\u000bm\u007f\r\rx\t\n<<2", (char) (yyyllll.rrrr007200720072() ^ 383821890), (char) (ylyylll.r0072rrr00720072() ^ (-1691741201)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788)));
        String tag = getTag();
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716882));
        int iRrrr007200720072 = yyyllll.rrrr007200720072() ^ 383821868;
        int i = pp0070pp007000700070;
        if (((ppp0070p007000700070 + i) * i) % p0070p0070p007000700070 != p00700070pp007000700070) {
            pp0070pp007000700070 = 88;
            p00700070pp007000700070 = 61;
        }
        LogBridge.i(tag, uuxuuuu.pppp0070ppp("GE(:GG3CDvvl", cR007200720072r00720072, (char) iRrrr007200720072));
        vv0076vv0076v();
    }

    @Override // com.behaviosec.rl.yyyylyy
    public void onResume() {
        uuxuuuu.pppp0070ppp("ggH\\gj_X(*\u001e", (char) (yylylll.r0072r0072r00720072() ^ (-1349847292)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332)));
        LogBridge.i(getTag(), uuxuuuu.pp0070p0070ppp("_!A\r\u000bCm?S \r", (char) (yylylll.r0072r0072r00720072() ^ (-1349847268)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847172)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))));
        vv0076vv0076v();
    }

    @Override // com.behaviosec.rl.yyyylyy
    public void onStop() {
        uuxuuuu.pp0070p0070ppp("~0\u0012#|&J -", (char) (yylylll.r0072r0072r00720072() ^ (-1349847227)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847161)), (char) (yyyllll.rrrr007200720072() ^ 383821871));
        LogBridge.i(getTag(), uuxuuuu.pppp0070ppp("\b\bm\u0010\f\u000eFH0", (char) (yylylll.r0072r0072r00720072() ^ (-1349847062)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))));
        v00760076vv0076v();
        int i = pp0070pp007000700070;
        if (((ppp0070p007000700070 + i) * i) % p0070p0070p007000700070 != p00700070pp007000700070) {
            pp0070pp007000700070 = pp00700070p007000700070();
            p00700070pp007000700070 = 92;
        }
    }
}
