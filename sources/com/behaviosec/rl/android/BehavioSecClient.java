package com.behaviosec.rl.android;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.behaviosec.rl.oddoodo;
import com.behaviosec.rl.odooodo;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;

/* loaded from: classes4.dex */
public class BehavioSecClient {
    public static int a006100610061aaa0061 = 2;
    public static int a0061a0061aaa0061 = 81;
    public static int a0061aa0061aa0061 = 0;
    public static int aa00610061aaa0061 = 1;
    private static boolean f0066fff0066f;
    private static Application fffff0066f;
    private static final String ff006600660066ff = uuxuuuu.pppp0070ppp("w\u001c \u001a0$+\u0010#\"\u0003-+(29", (char) (yllylll.r007200720072r00720072() ^ (-1146716878)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336)));
    private static odooodo f0066006600660066ff = null;

    static {
        try {
            throw null;
        } catch (Exception unused) {
            a0061a0061aaa0061 = aaaa0061aa0061();
            f0066fff0066f = false;
        }
    }

    private BehavioSecClient() {
    }

    public static oddoodo a00610061a00610061a() {
        odooodo odooodoVar = f0066006600660066ff;
        if (odooodoVar != null) {
            return odooodoVar.getConfiguration();
        }
        int i = a0061a0061aaa0061;
        if (((aa00610061aaa0061 + i) * i) % a006100610061aaa0061 != 0) {
            a0061a0061aaa0061 = 20;
            aa00610061aaa0061 = aaaa0061aa0061();
        }
        LogBridge.w(uuxuuuu.pppp0070ppp("\\\u0001\u0001z\u0015\t\fpwvS}\u007f|\u0003\n", (char) (yylylll.r0072r0072r00720072() ^ (-1349847064)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))), uuxuuuu.pppp0070ppp("$D9VS\b\u0007\u000e;79", (char) (ylyylll.r0072rrr00720072() ^ (-1691741297)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))));
        return null;
    }

    public static int a00610061a0061aa0061() {
        return 2;
    }

    public static int aa0061a0061aa0061() {
        return 1;
    }

    public static int aaaa0061aa0061() {
        return 42;
    }

    public static void clearRegistrations(@NonNull Activity activity) {
        LogBridge.d(uuxuuuu.pp0070p0070ppp(".RVPfZaFYX9ca^ho", (char) (yyyllll.rrrr007200720072() ^ 383821956), (char) (yyyllll.rrrr007200720072() ^ 383821840), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))), uuxuuuu.pp0070p0070ppp("\u0017\u001f\u0017\u0012\"\u0001\u0013\u0014\u0015\u001e\u001e\u001b\t\u001b\u000f\u0014\u0012\u0016A\u0002\u0003\u0013\u0007\u0013\u0005\u000f\u0013R", (char) (yllylll.r007200720072r00720072() ^ (-1146716900)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847109)), (char) (yyyllll.rrrr007200720072() ^ 383821870)) + activity);
        if (f0066006600660066ff == null) {
            odooodo odooodoVarVv0076v007600760076 = odooodo.vv0076v007600760076();
            int i = a0061a0061aaa0061;
            if (((aa00610061aaa0061 + i) * i) % a00610061a0061aa0061() != 0) {
                a0061a0061aaa0061 = 1;
                a0061aa0061aa0061 = aaaa0061aa0061();
            }
            f0066006600660066ff = odooodoVarVv0076v007600760076;
        }
        if (f0066fff0066f) {
            f0066006600660066ff.vv00760076v00760076(activity);
        }
    }

    @NonNull
    public static String getData(@NonNull Activity activity) {
        if (f0066006600660066ff == null) {
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        if (f0066fff0066f) {
            return f0066006600660066ff.v0076vv007600760076(activity);
        }
        int i = a0061a0061aaa0061;
        if (((aa00610061aaa0061 + i) * i) % a006100610061aaa0061 != a0061aa0061aa0061) {
            a0061a0061aaa0061 = aaaa0061aa0061();
            a0061aa0061aa0061 = 49;
        }
        return "";
    }

    public static void keyboardTargetTextChanged(String str, String str2, String str3, @NonNull Activity activity) {
        LogBridge.d(uuxuuuu.pppp0070ppp("&HJBVHM0A>\u001dEA<DI", (char) (yyyllll.rrrr007200720072() ^ 383822070), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), String.format(uuxuuuu.pppp0070ppp("yt\ns\u0002t\u0007yjx\u000b\u0001\u007f\u0010p\u0003\u0017\u0014c\n\u0004\u0012\f\u000b\u000bG\f\u000b\u0017\u0018\u0012\u0012N\u001f\u001fQ'\u0015'\u001d\u001c,X^.[4'3(`1/(d:,@=io?xm0>5qA9LuK=QNz\u0001P", (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))), str, str2, str3));
        if (f0066006600660066ff == null) {
            int i = a0061a0061aaa0061;
            if (((aa00610061aaa0061 + i) * i) % a006100610061aaa0061 != 0) {
                a0061a0061aaa0061 = 65;
                a0061aa0061aa0061 = aaaa0061aa0061();
            }
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        f0066006600660066ff.v0076v0076007600760076(str, str2, str3, activity);
    }

    public static void registerKeyboardTarget(String str, boolean z, @NonNull Activity activity) throws FlutterJavaInterfaceException {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("Tx|v\r\u0001\bl\u007f~_\n\b\u0005\u000f\u0016", (char) (yllylll.r007200720072r00720072() ^ (-1146716849)), (char) (yllylll.r007200720072r00720072() ^ (-1146716740)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053)));
        String str2 = uuxuuuu.pp0070p0070ppp("jJj\u0015j%\n:/\b\u0010L\u001dVTX-,!\ncO'K%g+E", (char) (ylyylll.r0072rrr00720072() ^ (-1691741281)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741318)), (char) (yyyllll.rrrr007200720072() ^ 383821865)) + str + uuxuuuu.pp0070p0070ppp("\r\u0007Y#(\u000e1T*#", (char) (yllylll.r007200720072r00720072() ^ (-1146716774)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741277)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + activity;
        if ((aaaa0061aa0061() * (aaaa0061aa0061() + aa00610061aaa0061)) % a006100610061aaa0061 != a0061aa0061aa0061) {
            a0061a0061aaa0061 = aaaa0061aa0061();
            a0061aa0061aa0061 = aaaa0061aa0061();
        }
        LogBridge.d(strPp0070p0070ppp, str2);
        if (f0066006600660066ff == null) {
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        f0066006600660066ff.c0063ccccc(str, z, activity);
    }

    public static void resetData(@NonNull Activity activity) {
        int i = a0061a0061aaa0061;
        if (((aa0061a0061aa0061() + i) * i) % a006100610061aaa0061 != 0) {
            a0061a0061aaa0061 = aaaa0061aa0061();
            a0061aa0061aa0061 = 65;
        }
        if (f0066006600660066ff == null) {
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        if (f0066fff0066f) {
            f0066006600660066ff.c0063c0063ccc(activity);
        }
    }

    public static void sendData(@NonNull Activity activity) {
        if (f0066006600660066ff == null) {
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        if (f0066fff0066f) {
            f0066006600660066ff.cccc0063cc(activity);
        }
    }

    public static void setCurrentKeyboardTarget(String str, String str2, @NonNull Activity activity) {
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847204));
        char cR0072r0072r007200722 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847055));
        int i = a0061a0061aaa0061;
        if (((aa00610061aaa0061 + i) * i) % a006100610061aaa0061 != 0) {
            a0061a0061aaa0061 = 18;
            a0061aa0061aa0061 = aaaa0061aa0061();
        }
        LogBridge.d(uuxuuuu.pppp0070ppp("qeF\u001c\u0001>lP?}gf4.'\b", cR0072r0072r00720072, cR0072r0072r007200722), String.format(uuxuuuu.pppp0070ppp("\u0012\u0005\u0015d\u0018\u0016\u0017\u000b\u0015\u001cs\u000f$\u000e\u001c\u000f!\u0014\u0005\u0013%\u001b\u001a*V\u001b\u001a&'!!]..`6$6,+;gm=jC6B7oE7KHtzJ", (char) (yllylll.r007200720072r00720072() ^ (-1146716797)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))), str, str2));
        if (f0066006600660066ff == null) {
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        f0066006600660066ff.cc006300630063cc(str, activity);
    }

    public static void setNewJourneyId(@NonNull String str) {
        if (f0066006600660066ff == null) {
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        if (f0066fff0066f) {
            f0066006600660066ff.c0063006300630063cc(str);
            if ((aaaa0061aa0061() * (aaaa0061aa0061() + aa00610061aaa0061)) % a006100610061aaa0061 != a0061aa0061aa0061) {
                a0061a0061aaa0061 = aaaa0061aa0061();
                a0061aa0061aa0061 = 37;
            }
        }
    }

    public static void setPageName(@NonNull Activity activity, @NonNull String str) {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("%\fT\u0011g\u001ei\u0011$e\u000bw6uD\u000e", (char) (ylyylll.r0072rrr00720072() ^ (-1691741195)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847114)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791)));
        StringBuilder sb = new StringBuilder();
        if (((aa0061a0061aa0061() + a0061a0061aaa0061) * a0061a0061aaa0061) % a006100610061aaa0061 != a0061aa0061aa0061) {
            a0061a0061aaa0061 = 20;
            a0061aa0061aa0061 = 73;
        }
        sb.append(uuxuuuu.pppp0070ppp("@\u0005&\u001dV }.\u0017&\u001cx\b\f\t#wT7 &", (char) (yllylll.r007200720072r00720072() ^ (-1146716862)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))));
        sb.append(activity);
        sb.append(uuxuuuu.pp0070p0070ppp("\u0012RScWcU_c#", (char) (yylylll.r0072r0072r00720072() ^ (-1349847257)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741266)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))));
        sb.append(activity);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        if (f0066006600660066ff == null) {
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        f0066006600660066ff.setPageName(activity, str);
    }

    public static void startCollection(@NonNull BehavioSecCollector behavioSecCollector, @NonNull Application application) {
        if (f0066006600660066ff == null) {
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        if (f0066fff0066f) {
            return;
        }
        oddoodo configuration = behavioSecCollector.getConfiguration();
        IBehavioSecConnector connector = behavioSecCollector.getConnector();
        int iAaaa0061aa0061 = aaaa0061aa0061();
        if (((aa00610061aaa0061 + iAaaa0061aa0061) * iAaaa0061aa0061) % a006100610061aaa0061 != 0) {
            a0061a0061aaa0061 = 15;
            aa00610061aaa0061 = aaaa0061aa0061();
        }
        LogBridge.init(application, configuration.getLogLevel());
        LogBridge.i(uuxuuuu.pppp0070ppp("P;Li'V4\u0019Y\ba1Xbw ", (char) (yylylll.r0072r0072r00720072() ^ (-1349847158)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))), uuxuuuu.pppp0070ppp("\u000fDa\u0011\u0019\nX{0\u0010\n~ &3", (char) (ylyylll.r0072rrr00720072() ^ (-1691741326)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))));
        f0066006600660066ff.ccc00630063cc(configuration);
        f0066006600660066ff.c0063c00630063cc(connector);
        f0066006600660066ff.c00630063c0063cc(behavioSecCollector.getChunkConnector());
        f0066006600660066ff.ccc0063ccc();
        fffff0066f = application;
        application.registerActivityLifecycleCallbacks(f0066006600660066ff);
        f0066fff0066f = true;
    }

    public static void stopCollection() {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("r\u001c\u0005D?\u0017#le)q!\u0004f5 ", (char) (yyyllll.rrrr007200720072() ^ 383821956), (char) (ylyylll.r0072rrr00720072() ^ (-1691741325)), (char) (yyyllll.rrrr007200720072() ^ 383821868)), uuxuuuu.pp0070p0070ppp("b+KuK!C\u000b)Pf\u0003.v", (char) (ylyylll.r0072rrr00720072() ^ (-1691741433)), (char) (yllylll.r007200720072r00720072() ^ (-1146716846)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))));
        if (f0066006600660066ff == null) {
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        if (f0066fff0066f) {
            fffff0066f.unregisterActivityLifecycleCallbacks(f0066006600660066ff);
            f0066006600660066ff.ccc0063c0063c();
            f0066fff0066f = false;
        }
    }

    public static void unsetCurrentKeyboardTarget(String str, String str2, @NonNull Activity activity) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("<\r\u007f^E}.\u001b\u0005T89\u0002u!\u0003", (char) (yylylll.r0072r0072r00720072() ^ (-1349847184)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329)));
        String strPppp0070ppp2 = uuxuuuu.pppp0070ppp("'!'\u001a*y-+, *1\t$9#1$6)\u001a(:0/?k0/;<66rCCuK9KA@P|\u0003R\u007fXKWL\u0005ZL`]\n\u0010_", (char) (ylyylll.r0072rrr00720072() ^ (-1691741352)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787)));
        Object[] objArr = {str, str2};
        int i = a0061a0061aaa0061;
        if (((aa00610061aaa0061 + i) * i) % a006100610061aaa0061 != a0061aa0061aa0061) {
            a0061a0061aaa0061 = 7;
            a0061aa0061aa0061 = aaaa0061aa0061();
        }
        LogBridge.d(strPppp0070ppp, String.format(strPppp0070ppp2, objArr));
        if (f0066006600660066ff == null) {
            f0066006600660066ff = odooodo.vv0076v007600760076();
        }
        f0066006600660066ff.c0063c0063c0063c(str, activity);
    }

    public static void startCollection(@NonNull BehavioSecCollector behavioSecCollector, @NonNull Application application, @Nullable Activity activity) {
        startCollection(behavioSecCollector, application);
        int i = a0061a0061aaa0061;
        if (((aa00610061aaa0061 + i) * i) % a006100610061aaa0061 != a0061aa0061aa0061) {
            a0061a0061aaa0061 = aaaa0061aa0061();
            a0061aa0061aa0061 = 12;
        }
        f0066006600660066ff.vvv0076007600760076(activity);
    }
}
