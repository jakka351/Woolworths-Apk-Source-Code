package com.behaviosec.rl;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.behaviosec.rl.android.EditTextHandler;
import com.behaviosec.rl.android.FlutterJavaInterfaceException;
import com.behaviosec.rl.android.LogBridge;
import com.behaviosec.rl.android.NonEditTextInputHandler;
import com.behaviosec.rl.android.OrientationListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class oodddoo {
    private static final String g0067g0067g0067g;
    private static final long gg00670067g0067g = 20000;
    public static int p00700070p0070007000700070 = 2;
    public static int p0070pp0070007000700070 = 0;
    public static int pp0070p0070007000700070 = 1;
    public static int pppp0070007000700070 = 45;
    private ylyllyl g00670067006700670067g;
    private final odooodo g006700670067g0067g;
    private oododoo g00670067g00670067g;
    private int g00670067ggg0067;
    private EditTextHandler g0067g006700670067g;
    private final oddddoo g0067gg00670067g = new oddddoo();
    private odddodd g0067gggg0067;
    private NonEditTextInputHandler gg0067006700670067g;
    private ododdoo gg0067g00670067g;
    private OrientationListener gg0067ggg0067;
    private ylyylyl ggg006700670067g;
    private final oddoodo gggg00670067g;
    private yllllyl gggggg0067;

    public class oddddoo {
        public static final int ALL_DATA = 0;
        public static final int KEYSTROKE_DATA = 1;
        public static final int TOUCH_DATA = 2;
        public static int f006600660066ffff = 0;
        public static int f0066ff0066fff = 2;
        public static int ff0066f0066fff = 25;
        public static int ffff0066fff = 1;
        private boolean g0067g0067gg0067 = false;
        private boolean gg00670067gg0067 = true;
        private yllyyly ggg0067gg0067;

        public oddddoo() {
        }

        public static int f0066006600660066fff() {
            return 2;
        }

        public static int ff00660066ffff() {
            return 18;
        }

        public static int fffff0066ff() {
            return 1;
        }

        public void v007600760076v0076v(Activity activity, int i, long j, long j2) {
            this.ggg0067gg0067.scheduleWithFixedDelay(new ooooodo(oodddoo.vvv007600760076v(oodddoo.this), activity, i), j, j2, TimeUnit.MILLISECONDS);
        }

        public boolean v00760076v00760076v() {
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused) {
                    ff0066f0066fff = ff00660066ffff();
                    try {
                        throw null;
                    } catch (Exception unused2) {
                        ff0066f0066fff = 43;
                        return this.gg00670067gg0067;
                    }
                }
            }
        }

        public void v0076v0076v0076v() {
            yllyyly yllyylyVar = this.ggg0067gg0067;
            if (yllyylyVar != null) {
                int i = ff0066f0066fff;
                if (((ffff0066fff + i) * i) % f0066ff0066fff != f006600660066ffff) {
                    ff0066f0066fff = 92;
                    f006600660066ffff = ff00660066ffff();
                }
                yllyylyVar.b00620062b0062bb();
            }
        }

        public void v0076vv00760076v(@NonNull Activity activity, boolean z) {
            long chunksFrequency;
            long j;
            int i;
            oddddoo oddddooVar;
            Activity activity2;
            this.gg00670067gg0067 = false;
            yllyyly yllyylyVar = this.ggg0067gg0067;
            if (yllyylyVar != null) {
                yllyylyVar.shutdown();
            }
            if (oodddoo.v0076v007600760076v(oodddoo.this).sendSeparateChunks()) {
                this.ggg0067gg0067 = new yllyyly(2);
                long keystrokesFrequency = oodddoo.v0076v007600760076v(oodddoo.this).getKeystrokesFrequency();
                long touchFrequency = oodddoo.v0076v007600760076v(oodddoo.this).getTouchFrequency();
                v007600760076v0076v(activity, 1, z ? keystrokesFrequency : 250L, keystrokesFrequency);
                int i2 = ff0066f0066fff;
                if (((ffff0066fff + i2) * i2) % f0066ff0066fff != f006600660066ffff) {
                    ff0066f0066fff = 12;
                    f006600660066ffff = 91;
                }
                j = z ? 250 + touchFrequency : 500L;
                i = 2;
                oddddooVar = this;
                activity2 = activity;
                chunksFrequency = touchFrequency;
            } else {
                this.ggg0067gg0067 = new yllyyly(1);
                chunksFrequency = oodddoo.v0076v007600760076v(oodddoo.this).getChunksFrequency();
                j = z ? chunksFrequency : 250L;
                i = 0;
                oddddooVar = this;
                activity2 = activity;
            }
            oddddooVar.v007600760076v0076v(activity2, i, j, chunksFrequency);
            this.g0067g0067gg0067 = true;
        }

        public void vv00760076v0076v() {
            yllyyly yllyylyVar = this.ggg0067gg0067;
            if (yllyylyVar != null) {
                yllyylyVar.bbb00620062bb();
                int i = ff0066f0066fff;
                if (((ffff0066fff + i) * i) % f0066006600660066fff() != 0) {
                    ff0066f0066fff = ff00660066ffff();
                    f006600660066ffff = 91;
                }
            }
        }

        public void vv0076v00760076v() {
            v0076v0076v0076v();
            int iFf00660066ffff = ff00660066ffff();
            if (((fffff0066ff() + iFf00660066ffff) * iFf00660066ffff) % f0066ff0066fff != 0) {
                ff0066f0066fff = 58;
                f006600660066ffff = 67;
            }
            this.g0067g0067gg0067 = false;
        }

        public boolean vvv0076v0076v() {
            int i = ff0066f0066fff;
            if (((ffff0066fff + i) * i) % f0066ff0066fff != f006600660066ffff) {
                ff0066f0066fff = ff00660066ffff();
                f006600660066ffff = ff00660066ffff();
            }
            return this.g0067g0067gg0067;
        }

        public void vvvv00760076v() {
            yllyyly yllyylyVar = this.ggg0067gg0067;
            if (yllyylyVar != null) {
                yllyylyVar.shutdown();
            }
            int i = ff0066f0066fff;
            if (((ffff0066fff + i) * i) % f0066ff0066fff != f006600660066ffff) {
                ff0066f0066fff = 53;
                f006600660066ffff = 51;
            }
            this.ggg0067gg0067 = null;
            this.g0067g0067gg0067 = false;
        }
    }

    public static class ooooodo implements Runnable {
        public static int ff0066ff0066ff = 0;
        public static int fff0066f0066ff = 2;
        private int g00670067g0067g0067 = 0;
        private final Activity g0067gg0067g0067;
        private final int gg0067g0067g0067;
        private final odooodo gggg0067g0067;

        public ooooodo(odooodo odooodoVar, Activity activity, int i) {
            this.gggg0067g0067 = odooodoVar;
            this.g0067gg0067g0067 = activity;
            this.gg0067g0067g0067 = i;
        }

        public static int f00660066ff0066ff() {
            return 1;
        }

        public static int f0066fff0066ff() {
            return 77;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            odooodo odooodoVar = this.gggg0067g0067;
            Activity activity = this.g0067gg0067g0067;
            int i = this.gg0067g0067g0067;
            int i2 = this.g00670067g0067g0067;
            this.g00670067g0067g0067 = i2 + 1;
            if (i2 == 0) {
                if ((f0066fff0066ff() * (f00660066ff0066ff() + f0066fff0066ff())) % fff0066f0066ff != ff0066ff0066ff) {
                    ff0066ff0066ff = f0066fff0066ff();
                }
                z = true;
            } else {
                z = false;
            }
            odooodoVar.sendChunkData(activity, i, z);
        }
    }

    static {
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716836));
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821831);
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072() ^ (-1691741330);
        int i = pppp0070007000700070;
        if (((pp0070p0070007000700070 + i) * i) % p00700070p0070007000700070 != p0070pp0070007000700070) {
            pppp0070007000700070 = 76;
            p0070pp0070007000700070 = 2;
        }
        g0067g0067g0067g = uuxuuuu.pp0070p0070ppp("\u0019`v3\\rP&\u001cPY*4c<\u0019\u000e\u001fI}", cR007200720072r00720072, cRrrr007200720072, (char) iR0072rrr00720072);
    }

    public oodddoo(@NonNull odooodo odooodoVar, @NonNull oddoodo oddoodoVar) {
        LogBridge.d(uuxuuuu.pppp0070ppp("l\u000f\u0011\t\u001d\u000f\u0014d\u0006\u0016\n\u0016\b\u0012\u0016n\u000fz\r|", (char) (ylyylll.r0072rrr00720072() ^ (-1691741287)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), uuxuuuu.pppp0070ppp("Vf`b\u000f", (char) (yyyllll.rrrr007200720072() ^ 383821938), (char) (yyyllll.rrrr007200720072() ^ 383821865)) + this);
        this.g006700670067g0067g = odooodoVar;
        this.gggg00670067g = oddoodoVar;
    }

    public static int f00660066fffff() {
        return 0;
    }

    public static int f0066ffffff() {
        return 57;
    }

    public static int ff0066fffff() {
        return 2;
    }

    public static int pp007000700070007000700070() {
        return 1;
    }

    public static /* synthetic */ oddoodo v0076v007600760076v(oodddoo oodddooVar) {
        if ((f0066ffffff() * (f0066ffffff() + pp0070p0070007000700070)) % p00700070p0070007000700070 != p0070pp0070007000700070) {
            pppp0070007000700070 = f0066ffffff();
            p0070pp0070007000700070 = 79;
        }
        return oodddooVar.gggg00670067g;
    }

    public static /* synthetic */ odooodo vvv007600760076v(oodddoo oodddooVar) {
        int i = pppp0070007000700070;
        if (((pp0070p0070007000700070 + i) * i) % p00700070p0070007000700070 != p0070pp0070007000700070) {
            pppp0070007000700070 = f0066ffffff();
            p0070pp0070007000700070 = f0066ffffff();
        }
        return oodddooVar.g006700670067g0067g;
    }

    public void v00760076007600760076v(@NonNull Activity activity) {
        oododoo oododooVar = this.g00670067g00670067g;
        if (oododooVar != null) {
            oododooVar.clearData();
        }
        ylyylyl ylyylylVar = this.ggg006700670067g;
        if (ylyylylVar != null) {
            ylyylylVar.rrr0072rrr();
        }
        if ((f0066ffffff() * (f0066ffffff() + pp0070p0070007000700070)) % p00700070p0070007000700070 != f00660066fffff()) {
            pppp0070007000700070 = f0066ffffff();
            p0070pp0070007000700070 = f0066ffffff();
        }
        ooodood.cleanTimings(activity, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v0076007600760076v0076(@androidx.annotation.NonNull android.app.Activity r7, boolean r8, int r9) {
        /*
            r6 = this;
            int r0 = com.behaviosec.rl.yllylll.r007200720072r00720072()
            r1 = -1146716813(0xffffffffbba67d73, float:-0.0050808727)
            r0 = r0 ^ r1
            char r0 = (char) r0
            int r1 = com.behaviosec.rl.yylylll.r0072r0072r00720072()
            r2 = -1349847292(0xffffffffaf8af704, float:-2.527757E-10)
            r1 = r1 ^ r2
            char r1 = (char) r1
            int r2 = com.behaviosec.rl.yyyllll.rrrr007200720072()
            r3 = 383821867(0x16e0a82b, float:3.629528E-25)
            r2 = r2 ^ r3
            char r2 = (char) r2
            java.lang.String r3 = "FYPEN-'t\u000b\bpy`WP&;\u0014\u001b\b"
            java.lang.String r0 = com.behaviosec.rl.uuxuuuu.pp0070p0070ppp(r3, r0, r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = com.behaviosec.rl.yylylll.r0072r0072r00720072()
            r3 = -1349847233(0xffffffffaf8af73f, float:-2.5277733E-10)
            r2 = r2 ^ r3
            char r2 = (char) r2
            int r3 = com.behaviosec.rl.yylylll.r0072r0072r00720072()
            r4 = -1349847055(0xffffffffaf8af7f1, float:-2.5278227E-10)
            r3 = r3 ^ r4
            char r3 = (char) r3
            java.lang.String r4 = "B\u0016\u0011M_{\u000fC\u001b0)J\u001f\u001eLS"
            java.lang.String r2 = com.behaviosec.rl.uuxuuuu.pppp0070ppp(r4, r2, r3)
            r1.append(r2)
            r1.append(r6)
            int r2 = com.behaviosec.rl.yylylll.r0072r0072r00720072()
            r3 = -1349847107(0xffffffffaf8af7bd, float:-2.5278082E-10)
            r2 = r2 ^ r3
            char r2 = (char) r2
            int r3 = com.behaviosec.rl.yllylll.r007200720072r00720072()
            r4 = -1146716790(0xffffffffbba67d8a, float:-0.0050808834)
            r3 = r3 ^ r4
            char r3 = (char) r3
            java.lang.String r4 = "{,"
            java.lang.String r2 = com.behaviosec.rl.uuxuuuu.pppp0070ppp(r4, r2, r3)
            r1.append(r2)
            r1.append(r7)
            int r2 = com.behaviosec.rl.yylylll.r0072r0072r00720072()
            r3 = -1349847149(0xffffffffaf8af793, float:-2.5277966E-10)
            r2 = r2 ^ r3
            char r2 = (char) r2
            int r3 = com.behaviosec.rl.yllylll.r007200720072r00720072()
            r4 = -1146716787(0xffffffffbba67d8d, float:-0.005080885)
            r3 = r3 ^ r4
            char r3 = (char) r3
            java.lang.String r4 = "\u000e\u0003VJY[I[^%"
            java.lang.String r2 = com.behaviosec.rl.uuxuuuu.pppp0070ppp(r4, r2, r3)
            r1.append(r2)
            r1.append(r8)
            int r2 = com.behaviosec.rl.yyyllll.rrrr007200720072()
            r3 = 383822033(0x16e0a8d1, float:3.629569E-25)
            r2 = r2 ^ r3
            char r2 = (char) r2
            int r3 = com.behaviosec.rl.ylyylll.r0072rrr00720072()
            r4 = -1691741258(0xffffffff9b2a13b6, float:-1.4068439E-22)
            r3 = r3 ^ r4
            char r3 = (char) r3
            int r4 = com.behaviosec.rl.yyyllll.rrrr007200720072()
            r5 = 383821870(0x16e0a82e, float:3.6295288E-25)
            r4 = r4 ^ r5
            char r4 = (char) r4
            java.lang.String r5 = "\u0011\u0004YKFW(B\u0017"
            java.lang.String r2 = com.behaviosec.rl.uuxuuuu.pp0070p0070ppp(r5, r2, r3, r4)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.behaviosec.rl.android.LogBridge.d(r0, r1)
            com.behaviosec.rl.oodddoo$oddddoo r0 = r6.g0067gg00670067g
            boolean r0 = r0.v00760076v00760076v()
            if (r0 != 0) goto Ld2
            int r0 = r6.g00670067ggg0067
            if (r0 == r9) goto Ld9
            int r0 = com.behaviosec.rl.oodddoo.pppp0070007000700070
            int r1 = com.behaviosec.rl.oodddoo.pp0070p0070007000700070
            int r1 = r1 + r0
            int r1 = r1 * r0
            int r0 = com.behaviosec.rl.oodddoo.p00700070p0070007000700070
            int r1 = r1 % r0
            int r0 = com.behaviosec.rl.oodddoo.p0070pp0070007000700070
            if (r1 == r0) goto Ld2
            int r0 = f0066ffffff()
            com.behaviosec.rl.oodddoo.pppp0070007000700070 = r0
            r0 = 48
            com.behaviosec.rl.oodddoo.p0070pp0070007000700070 = r0
        Ld2:
            com.behaviosec.rl.oododoo r0 = r6.g00670067g00670067g
            if (r0 == 0) goto Ld9
            r0.clearData()
        Ld9:
            com.behaviosec.rl.oodddoo$oddddoo r0 = r6.g0067gg00670067g
            r0.v0076vv00760076v(r7, r8)
            r6.g00670067ggg0067 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.oodddoo.v0076007600760076v0076(android.app.Activity, boolean, int):void");
    }

    public void v007600760076vv0076(String str, String str2, String str3) throws IllegalArgumentException {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("\f[*y-u\u0010\u001d\u0005yT\u001cp_\u0017(`!Jq", (char) (yllylll.r007200720072r00720072() ^ (-1146716736)), (char) (yllylll.r007200720072r00720072() ^ (-1146716826)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056)));
        StringBuilder sb = new StringBuilder();
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847280));
        int i = pppp0070007000700070;
        if (((pp0070p0070007000700070 + i) * i) % p00700070p0070007000700070 != 0) {
            pppp0070007000700070 = f0066ffffff();
            p0070pp0070007000700070 = 68;
        }
        sb.append(uuxuuuu.pppp0070ppp("OJ_IWJ\\O@N`VUeFXli9_Yga``\u001dr`rhgwMi@", cR0072r0072r00720072, (char) (yyyllll.rrrr007200720072() ^ 383821871)));
        sb.append(str);
        sb.append(uuxuuuu.pppp0070ppp("(\u001d", (char) (ylyylll.r0072rrr00720072() ^ (-1691741293)), (char) (yyyllll.rrrr007200720072() ^ 383821870)));
        sb.append(this);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        NonEditTextInputHandler nonEditTextInputHandler = this.gg0067006700670067g;
        if (nonEditTextInputHandler != null) {
            nonEditTextInputHandler.bb00620062bbb(str, str2, str3);
        }
    }

    public void v00760076v0076v0076(@NonNull Activity activity) {
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        if (!(callback instanceof yllllyl)) {
            return;
        }
        int i = 3;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                pppp0070007000700070 = 89;
                window.setCallback(((yllllyl) callback).getWindowCallback());
                return;
            }
        }
    }

    public Map<String, String> v00760076vvv0076(@NonNull Activity activity, boolean z) throws Exception {
        Map<String, String> timingsAsMap = ooodood.getTimingsAsMap(ooodood.ss0073ssss(activity), activity, this.g00670067ggg0067, z);
        oododoo oododooVar = this.g00670067g00670067g;
        if (oododooVar != null) {
            oododooVar.addChunkData(timingsAsMap, this.g00670067ggg0067);
        }
        int i = pppp0070007000700070;
        if (((pp0070p0070007000700070 + i) * i) % p00700070p0070007000700070 != 0) {
            pppp0070007000700070 = f0066ffffff();
            p0070pp0070007000700070 = 49;
        }
        return timingsAsMap;
    }

    public void v0076v00760076v0076(String str) {
        oododoo oododooVar = this.g00670067g00670067g;
        if (oododooVar != null) {
            if ((f0066ffffff() * (f0066ffffff() + pp0070p0070007000700070)) % p00700070p0070007000700070 != p0070pp0070007000700070) {
                pppp0070007000700070 = 36;
                p0070pp0070007000700070 = 68;
            }
            oododooVar.addBKEvent(uuxuuuu.pp0070p0070ppp("P", (char) (yylylll.r0072r0072r00720072() ^ (-1349847149)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741305)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), str);
        }
    }

    public ylyylyl v0076v0076vv0076() {
        ylyylyl ylyylylVar = this.ggg006700670067g;
        int i = pppp0070007000700070;
        if (((pp0070p0070007000700070 + i) * i) % p00700070p0070007000700070 != p0070pp0070007000700070) {
            pppp0070007000700070 = 9;
            p0070pp0070007000700070 = 59;
        }
        return ylyylylVar;
    }

    public boolean v0076vv0076v0076(String str, boolean z) throws FlutterJavaInterfaceException {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("e\n\u000e\b\u001e\u0012\u0019k\u000f!\u0017%\u0019%+\u0006(\u0016*\u001c", (char) (yyyllll.rrrr007200720072() ^ 383822075), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046)));
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pp0070p0070ppp("UILOZ\\N\\6QfP^QcVGUg]\\l\u0019n\\ndcsIe<", (char) (ylyylll.r0072rrr00720072() ^ (-1691741359)), (char) (yllylll.r007200720072r00720072() ^ (-1146716765)), (char) (yyyllll.rrrr007200720072() ^ 383821864)));
        sb.append(str);
        int iF0066ffffff = f0066ffffff();
        if (((pp0070p0070007000700070 + iF0066ffffff) * iF0066ffffff) % p00700070p0070007000700070 != 0) {
            pppp0070007000700070 = f0066ffffff();
            p0070pp0070007000700070 = 86;
        }
        sb.append(uuxuuuu.pp0070p0070ppp("uS", (char) (yyyllll.rrrr007200720072() ^ 383822051), (char) (ylyylll.r0072rrr00720072() ^ (-1691741294)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
        sb.append(this);
        LogBridge.d(strPppp0070ppp, sb.toString());
        NonEditTextInputHandler nonEditTextInputHandler = this.gg0067006700670067g;
        if (nonEditTextInputHandler != null) {
            return nonEditTextInputHandler.b006200620062bbb(str, z);
        }
        return false;
    }

    public void v0076vvv00760076() {
        LogBridge.d(uuxuuuu.pppp0070ppp("\u001c>@8L>C\u00145E9E7AE\u001e>*<,", (char) (yyyllll.rrrr007200720072() ^ 383821981), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), uuxuuuu.pppp0070ppp("rrll@r^[ljdff\u0012", (char) (yylylll.r0072r0072r00720072() ^ (-1349847129)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))) + this);
        oddddoo oddddooVar = this.g0067gg00670067g;
        int i = pppp0070007000700070;
        if (((pp0070p0070007000700070 + i) * i) % ff0066fffff() != 0) {
            pppp0070007000700070 = f0066ffffff();
            p0070pp0070007000700070 = 0;
        }
        oddddooVar.vv0076v00760076v();
    }

    public String v0076vvvv0076(@NonNull Activity activity) throws Exception {
        LogBridge.d(uuxuuuu.pppp0070ppp("Dhlf|pwJm\u007fu\u0004w\u0004\nd\u0007t\tz", (char) (ylyylll.r0072rrr00720072() ^ (-1691741208)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))), uuxuuuu.pppp0070ppp("c`n:[k_k]gk5QcO'\f", (char) (yyyllll.rrrr007200720072() ^ 383822078), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))) + this + uuxuuuu.pp0070p0070ppp("\\>", (char) (ylyylll.r0072rrr00720072() ^ (-1691741426)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741353)), (char) (yyyllll.rrrr007200720072() ^ 383821871)) + activity);
        JSONArray timingsAsJSON = ooodood.getTimingsAsJSON(ooodood.ss0073ssss(activity), activity);
        oododoo oododooVar = this.g00670067g00670067g;
        if (oododooVar != null) {
            timingsAsJSON.put(oododooVar.getData());
        }
        if (this.ggg006700670067g != null) {
            try {
                throw null;
            } catch (Exception unused) {
                pppp0070007000700070 = f0066ffffff();
                timingsAsJSON = this.ggg006700670067g.k006Bk006B006B006B006B(timingsAsJSON);
            }
        }
        odddodd odddoddVar = this.g0067gggg0067;
        if (odddoddVar != null) {
            timingsAsJSON = odddoddVar.ss0073s00730073s(timingsAsJSON);
        }
        String string = timingsAsJSON.toString();
        v00760076007600760076v(activity);
        return string;
    }

    public void vv0076007600760076v(@NonNull Activity activity, int i) {
        ylyylyl ylyylylVar;
        if ((i == 0 || i == 2) && (ylyylylVar = this.ggg006700670067g) != null) {
            ylyylylVar.rrr0072rrr();
        }
        if (i == 0 || i == 1) {
            int i2 = pppp0070007000700070;
            if (((pp0070p0070007000700070 + i2) * i2) % p00700070p0070007000700070 != 0) {
                pppp0070007000700070 = f0066ffffff();
                p0070pp0070007000700070 = 59;
            }
            oododoo oododooVar = this.g00670067g00670067g;
            if (oododooVar != null) {
                oododooVar.clearChunk();
            }
            ooodood.cleanTimings(activity, true);
        }
    }

    public void vv007600760076v0076(@NonNull Activity activity) {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("\u00137;5K?F\u0019<NDRFRX3UCWI", (char) (yyyllll.rrrr007200720072() ^ 383822024), (char) (yyyllll.rrrr007200720072() ^ 383822017), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), uuxuuuu.pp0070p0070ppp("u\u0004\u0006$;s", (char) (yyyllll.rrrr007200720072() ^ 383821910), (char) (yllylll.r007200720072r00720072() ^ (-1146716901)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))) + this);
        ododdoo ododdooVar = new ododdoo(activity);
        this.gg0067g00670067g = ododdooVar;
        ododdooVar.onCreate(null);
        if (this.g00670067g00670067g == null) {
            this.g00670067g00670067g = new oododoo();
        }
        synchronized (this) {
            try {
                if (this.gg0067ggg0067 == null) {
                    this.gg0067ggg0067 = new OrientationListener(activity.getApplicationContext(), 3, this.g00670067g00670067g);
                }
                if (this.gg0067ggg0067.canDetectOrientation()) {
                    this.gg0067ggg0067.enable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.gggg00670067g.collectTouchData()) {
            LogBridge.d(uuxuuuu.pppp0070ppp("\u0018`\u00182a\"uA\u000f]R\u007f\")D=\u0014\u0015Q\\", (char) (yllylll.r007200720072r00720072() ^ (-1146716772)), (char) (yyyllll.rrrr007200720072() ^ 383821869)), uuxuuuu.pppp0070ppp("rd1\u0014v1XF)35\u00076}L.]:S\u0014[5~", (char) (yllylll.r007200720072r00720072() ^ (-1146716767)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))) + this + uuxuuuu.pp0070p0070ppp("k`", (char) (ylyylll.r0072rrr00720072() ^ (-1691741440)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741373)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))) + activity);
            this.ggg006700670067g = new ylyylyl(activity, yyyllyl.rr0072r00720072r(activity.getWindow().getDecorView().getRootView(), activity), this.gggg00670067g.collectLegacyTouchData() ^ true, 2, this.gggg00670067g.getBhsOptions());
            ylyylyl.r007200720072rrr(this.gggg00670067g.collectRawData());
        }
        if (this.gggg00670067g.collectKeyboardData()) {
            LogBridge.d(uuxuuuu.pp0070p0070ppp("\u0001:\n_|U\n\u000b\f,dQ3pDf\u001d2O&", (char) (yllylll.r007200720072r00720072() ^ (-1146716842)), (char) (yllylll.r007200720072r00720072() ^ (-1146716874)), (char) (yyyllll.rrrr007200720072() ^ 383821871)), uuxuuuu.pppp0070ppp("Bmih`]m\u0018B[nVbScT\u000fRN`L\nOWY\u0006", (char) ((-1146716874) ^ yllylll.r007200720072r00720072()), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + this + uuxuuuu.pppp0070ppp("7*", (char) (yyyllll.rrrr007200720072() ^ 383821841), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))) + activity);
            View rootView = activity.getWindow().getDecorView().getRootView();
            if (this.g00670067006700670067g == null) {
                this.g00670067006700670067g = new ylyllyl(activity, this.gggg00670067g);
            }
            if (this.g0067g006700670067g == null) {
                this.g0067g006700670067g = new EditTextHandler(activity, this.ggg006700670067g, rootView, this.g00670067g00670067g, this.g00670067006700670067g, this.gggg00670067g);
            }
            if (this.gg0067006700670067g == null) {
                this.gg0067006700670067g = new NonEditTextInputHandler(activity);
            }
        }
        Window window = activity.getWindow();
        yllllyl yllllylVar = new yllllyl(window.getCallback(), this.g0067g006700670067g, this.ggg006700670067g, activity.getClass().getSimpleName());
        this.gggggg0067 = yllllylVar;
        window.setCallback(yllllylVar);
    }

    public boolean vv00760076vv0076() {
        int i = pppp0070007000700070;
        if (((pp0070p0070007000700070 + i) * i) % p00700070p0070007000700070 != p0070pp0070007000700070) {
            pppp0070007000700070 = 53;
            p0070pp0070007000700070 = f0066ffffff();
        }
        return this.g0067gg00670067g.vvv0076v0076v();
    }

    public void vv0076v0076v0076() {
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741289));
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716730));
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
        int i = pppp0070007000700070;
        if (((pp007000700070007000700070() + i) * i) % p00700070p0070007000700070 != 0) {
            pppp0070007000700070 = f0066ffffff();
            p0070pp0070007000700070 = 54;
        }
        LogBridge.d(uuxuuuu.pp0070p0070ppp("B\u0007lOsT|Q\u0003>hC4\\\u0002B|0l\u0003", cR0072rrr00720072, cR007200720072r00720072, (char) (iR0072rrr00720072 ^ (-1691741333))), uuxuuuu.pp0070p0070ppp("\u0011\u00158M\t\u0002T8)%E;<u%{+\u001e", (char) (ylyylll.r0072rrr00720072() ^ (-1691741306)), (char) (yyyllll.rrrr007200720072() ^ 383821975), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))) + this);
        EditTextHandler editTextHandler = this.g0067g006700670067g;
        if (editTextHandler != null) {
            editTextHandler.removeAll();
        }
    }

    public void vv0076vv00760076(String str) {
        oododoo oododooVar = this.g00670067g00670067g;
        if (oododooVar != null) {
            int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
            int iF0066ffffff = f0066ffffff();
            if (((pp0070p0070007000700070 + iF0066ffffff) * iF0066ffffff) % p00700070p0070007000700070 != 0) {
                pppp0070007000700070 = 94;
                p0070pp0070007000700070 = 85;
            }
            oododooVar.addBKEvent(uuxuuuu.pp0070p0070ppp("\t", (char) (iR0072rrr00720072 ^ (-1691741199)), (char) (yllylll.r007200720072r00720072() ^ (-1146716819)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), str);
        }
    }

    @NonNull
    public Map<String, String> vv0076vvv0076(@NonNull Activity activity, int i, boolean z) throws JSONException, SecurityException {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("H5\u0004LQo\n3\u001fWF\u000eIB_\u001c[J\u001e\u001f", (char) (yllylll.r007200720072r00720072() ^ (-1146716814)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)), (char) (yyyllll.rrrr007200720072() ^ 383821871));
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pp0070p0070ppp("aJS\u000f\u001f.JZ\u0010`:-\u001b@", (char) (ylyylll.r0072rrr00720072() ^ (-1691741334)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847095)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))));
        sb.append(this);
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716736));
        int iRrrr007200720072 = yyyllll.rrrr007200720072() ^ 383821870;
        int i2 = pppp0070007000700070;
        if (((pp0070p0070007000700070 + i2) * i2) % ff0066fffff() != p0070pp0070007000700070) {
            pppp0070007000700070 = f0066ffffff();
            p0070pp0070007000700070 = f0066ffffff();
        }
        sb.append(uuxuuuu.pppp0070ppp("uh", cR007200720072r00720072, (char) iRrrr007200720072));
        sb.append(activity);
        sb.append(uuxuuuu.pppp0070ppp("(A~i(\u000f2*\u0007;X0\u0003\u0010#\u0004o", (char) (ylyylll.r0072rrr00720072() ^ (-1691741208)), (char) (yyyllll.rrrr007200720072() ^ 383821869)));
        sb.append(z);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        Map<String, String> mapV00760076vvv0076 = (i == 0 || i == 1) ? v00760076vvv0076(activity, z) : null;
        if ((i == 0 || i == 2) && this.ggg006700670067g != null) {
            if (mapV00760076vvv0076 == null) {
                mapV00760076vvv0076 = new HashMap<>();
            }
            vvv0076vv0076(mapV00760076vvv0076, i, z);
        }
        vv0076007600760076v(activity, i);
        return mapV00760076vvv0076 == null ? new HashMap() : mapV00760076vvv0076;
    }

    public void vvv00760076v0076() {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("s\u0016\u0018\u0010$\u0016\u001bk\r\u001d\u0011\u001d\u000f\u0019\u001du\u0016\u0002\u0014\u0004", (char) (ylyylll.r0072rrr00720072() ^ (-1691741200)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056)));
        String str = uuxuuuu.pppp0070ppp("zlyzqh\"", (char) (yyyllll.rrrr007200720072() ^ 383821996), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))) + this + uuxuuuu.pppp0070ppp("z6\u001c-\u0010\u0016f{\u001a\u001e}", (char) (ylyylll.r0072rrr00720072() ^ (-1691741391)), (char) (yyyllll.rrrr007200720072() ^ 383821869)) + this.gg0067006700670067g;
        if (((pp007000700070007000700070() + pppp0070007000700070) * pppp0070007000700070) % p00700070p0070007000700070 != p0070pp0070007000700070) {
            pppp0070007000700070 = f0066ffffff();
            p0070pp0070007000700070 = 25;
        }
        LogBridge.d(strPppp0070ppp, str);
        ododdoo ododdooVar = this.gg0067g00670067g;
        if (ododdooVar != null) {
            ododdooVar.onResume();
        }
        oododoo oododooVar = this.g00670067g00670067g;
        if (oododooVar != null) {
            oododooVar.onResume();
        }
        ylyylyl ylyylylVar = this.ggg006700670067g;
        if (ylyylylVar != null) {
            ylyylylVar.rrr0072r0072r();
        }
        if (this.gggg00670067g.sendInChunks()) {
            this.g0067gg00670067g.vv00760076v0076v();
        }
    }

    public void vvv0076vv0076(Map<String, String> map, int i, boolean z) throws JSONException, SecurityException {
        long touchFrequency;
        int iCeil = 1;
        if (i == 0) {
            if (this.gggg00670067g.getChunksFrequency() < 20000) {
                touchFrequency = this.gggg00670067g.getChunksFrequency();
                iCeil = (int) Math.ceil(20000.0f / touchFrequency);
            }
        } else if (this.gggg00670067g.getChunksFrequency() >= 20000) {
            int i2 = pppp0070007000700070;
            if (((pp0070p0070007000700070 + i2) * i2) % p00700070p0070007000700070 != p0070pp0070007000700070) {
                pppp0070007000700070 = 30;
                p0070pp0070007000700070 = 24;
            }
        } else {
            touchFrequency = this.gggg00670067g.getTouchFrequency();
            iCeil = (int) Math.ceil(20000.0f / touchFrequency);
        }
        this.ggg006700670067g.kkk006B006B006B006B(map, this.g00670067ggg0067, z, iCeil);
    }

    public void vvvv0076v0076() {
        LogBridge.d(uuxuuuu.pppp0070ppp("~!#\u001b7).~\u0018(\u001c(\",0\t!\r\u001f\u000f", (char) (yyyllll.rrrr007200720072() ^ 383821968), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), uuxuuuu.pppp0070ppp("xj\u007f~q-", (char) (yllylll.r007200720072r00720072() ^ (-1146716799)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))) + this);
        if (this.gggg00670067g.sendInChunks()) {
            int i = pppp0070007000700070;
            if (((pp0070p0070007000700070 + i) * i) % p00700070p0070007000700070 != 0) {
                pppp0070007000700070 = 36;
                p0070pp0070007000700070 = 34;
            }
            this.g0067gg00670067g.v0076v0076v0076v();
        }
        ododdoo ododdooVar = this.gg0067g00670067g;
        if (ododdooVar != null) {
            ododdooVar.onPause();
        }
        oododoo oododooVar = this.g00670067g00670067g;
        if (oododooVar != null) {
            oododooVar.onPause();
        }
        ylyylyl ylyylylVar = this.ggg006700670067g;
        if (ylyylylVar != null) {
            ylyylylVar.r0072r0072r0072r();
        }
    }

    public void vvvvv00760076() {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("x\u001b!\u0019)\u001b$t\"2*6$.6\u000f\u001b\u0007\u001d\r", (char) (yylylll.r0072r0072r00720072() ^ (-1349847225)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049)));
        StringBuilder sb = new StringBuilder();
        int i = pppp0070007000700070;
        if (((pp0070p0070007000700070 + i) * i) % p00700070p0070007000700070 != f00660066fffff()) {
            pppp0070007000700070 = 32;
            p0070pp0070007000700070 = 98;
        }
        sb.append(uuxuuuu.pp0070p0070ppp("\u001aH=l\u0016", (char) (yllylll.r007200720072r00720072() ^ (-1146716753)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847161)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))));
        sb.append(this);
        LogBridge.d(strPppp0070ppp, sb.toString());
        ododdoo ododdooVar = this.gg0067g00670067g;
        if (ododdooVar != null) {
            ododdooVar.onStop();
        }
        ylyylyl ylyylylVar = this.ggg006700670067g;
        if (ylyylylVar != null) {
            ylyylylVar.r0072r0072r0072r();
        }
    }

    public void vvvvvv0076() {
        LogBridge.d(uuxuuuu.pppp0070ppp("\u0006*.(>29\f/A7E9EK&H6J<", (char) (yyyllll.rrrr007200720072() ^ 383822057), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))), uuxuuuu.pppp0070ppp("57FHGEPw", (char) (yylylll.r0072r0072r00720072() ^ (-1349847078)), (char) (yyyllll.rrrr007200720072() ^ 383821859)) + this);
        this.g0067gg00670067g.vvvv00760076v();
        vv0076v0076v0076();
        ylyllyl ylyllylVar = this.g00670067006700670067g;
        if (ylyllylVar != null) {
            ylyllylVar.removeAll();
            this.g00670067006700670067g = null;
        }
        ododdoo ododdooVar = this.gg0067g00670067g;
        if (ododdooVar != null) {
            ododdooVar.onDestroy();
        }
        this.gg0067g00670067g = null;
        this.g00670067g00670067g = null;
        this.ggg006700670067g = null;
        this.g0067g006700670067g = null;
        this.gg0067006700670067g = null;
        this.gggggg0067 = null;
        this.g0067gggg0067 = null;
        synchronized (this) {
            OrientationListener orientationListener = this.gg0067ggg0067;
            if (orientationListener != null && orientationListener.canDetectOrientation()) {
                try {
                    this.gg0067ggg0067.disable();
                } catch (NullPointerException unused) {
                }
            }
            this.gg0067ggg0067 = null;
        }
    }
}
