package com.behaviosec.rl.android;

import android.content.Context;
import android.view.OrientationEventListener;
import com.behaviosec.rl.odooooo;
import com.behaviosec.rl.oododoo;

/* loaded from: classes4.dex */
public class OrientationListener extends OrientationEventListener {
    public static int h00680068h0068h00680068 = 1;
    public static int hh0068h0068h00680068 = 18;
    public static int hhh00680068h00680068 = 2;
    private ylyyyly x00780078x007800780078;
    private final oododoo xx0078x007800780078;

    public enum ylyyyly {
        UNKNOWN,
        PORTRAIT,
        PORTRAIT_UPSIDE_DOWN,
        LANDSCAPE_LEFT,
        LANDSCAPE_RIGHT;

        static {
            int iHh006800680068h00680068 = (hh006800680068h00680068() * (hhhhh006800680068() + hh006800680068h00680068())) % h0068hhh006800680068();
            h0068006800680068h00680068();
        }

        public static int h0068006800680068h00680068() {
            return 0;
        }

        public static int h0068hhh006800680068() {
            return 2;
        }

        public static int hh006800680068h00680068() {
            return 72;
        }

        public static int hhhhh006800680068() {
            return 1;
        }

        public static ylyyyly valueOf(String str) {
            return (ylyyyly) odooooo.j006Ajjj006A006A(ylyyyly.class, str);
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static ylyyyly[] valuesCustom() {
            ylyyyly[] ylyyylyVarArr = (ylyyyly[]) values().clone();
            int iHh006800680068h00680068 = (hh006800680068h00680068() * (hhhhh006800680068() + hh006800680068h00680068())) % h0068hhh006800680068();
            h0068006800680068h00680068();
            return ylyyylyVarArr;
        }
    }

    public OrientationListener(Context context, int i, oododoo oododooVar) {
        super(context, i);
        this.x00780078x007800780078 = ylyyyly.UNKNOWN;
        this.xx0078x007800780078 = oododooVar;
    }

    public static int h0068h00680068h00680068() {
        return 54;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[PHI: r1
  0x0018: PHI (r1v12 com.behaviosec.rl.android.OrientationListener$ylyyyly) = 
  (r1v5 com.behaviosec.rl.android.OrientationListener$ylyyyly)
  (r1v6 com.behaviosec.rl.android.OrientationListener$ylyyyly)
  (r1v11 com.behaviosec.rl.android.OrientationListener$ylyyyly)
  (r1v13 com.behaviosec.rl.android.OrientationListener$ylyyyly)
 binds: [B:45:0x0077, B:34:0x0060, B:21:0x0030, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onOrientationChanged(int r5) {
        /*
            r4 = this;
            com.behaviosec.rl.android.OrientationListener$ylyyyly r0 = com.behaviosec.rl.android.OrientationListener.ylyyyly.UNKNOWN
            r1 = 30
            if (r5 < 0) goto Lc
            if (r5 >= r1) goto Lc
        L8:
            com.behaviosec.rl.android.OrientationListener$ylyyyly r5 = com.behaviosec.rl.android.OrientationListener.ylyyyly.PORTRAIT
            goto L82
        Lc:
            r2 = 60
            if (r5 < r1) goto L1f
            if (r5 >= r2) goto L1f
            com.behaviosec.rl.android.OrientationListener$ylyyyly r5 = r4.x00780078x007800780078
            com.behaviosec.rl.android.OrientationListener$ylyyyly r1 = com.behaviosec.rl.android.OrientationListener.ylyyyly.PORTRAIT
            if (r5 != r1) goto L1b
        L18:
            r5 = r1
            goto L82
        L1b:
            com.behaviosec.rl.android.OrientationListener$ylyyyly r5 = com.behaviosec.rl.android.OrientationListener.ylyyyly.LANDSCAPE_RIGHT
            goto L82
        L1f:
            r1 = 120(0x78, float:1.68E-43)
            if (r5 < r2) goto L26
            if (r5 >= r1) goto L26
            goto L1b
        L26:
            r2 = 150(0x96, float:2.1E-43)
            if (r5 < r1) goto L36
            if (r5 >= r2) goto L36
            com.behaviosec.rl.android.OrientationListener$ylyyyly r5 = r4.x00780078x007800780078
            com.behaviosec.rl.android.OrientationListener$ylyyyly r1 = com.behaviosec.rl.android.OrientationListener.ylyyyly.LANDSCAPE_RIGHT
            if (r5 != r1) goto L33
            goto L18
        L33:
            com.behaviosec.rl.android.OrientationListener$ylyyyly r5 = com.behaviosec.rl.android.OrientationListener.ylyyyly.PORTRAIT_UPSIDE_DOWN
            goto L82
        L36:
            r1 = 210(0xd2, float:2.94E-43)
            if (r5 < r2) goto L56
            if (r5 >= r1) goto L56
            com.behaviosec.rl.android.OrientationListener$ylyyyly r5 = com.behaviosec.rl.android.OrientationListener.ylyyyly.PORTRAIT_UPSIDE_DOWN
            int r1 = com.behaviosec.rl.android.OrientationListener.hh0068h0068h00680068
            int r2 = com.behaviosec.rl.android.OrientationListener.h00680068h0068h00680068
            int r2 = r2 + r1
            int r2 = r2 * r1
            int r1 = com.behaviosec.rl.android.OrientationListener.hhh00680068h00680068
            int r2 = r2 % r1
            if (r2 == 0) goto L82
            int r1 = h0068h00680068h00680068()
            com.behaviosec.rl.android.OrientationListener.hh0068h0068h00680068 = r1
            int r1 = h0068h00680068h00680068()
            com.behaviosec.rl.android.OrientationListener.h00680068h0068h00680068 = r1
            goto L82
        L56:
            r2 = 240(0xf0, float:3.36E-43)
            if (r5 < r1) goto L66
            if (r5 >= r2) goto L66
            com.behaviosec.rl.android.OrientationListener$ylyyyly r5 = r4.x00780078x007800780078
            com.behaviosec.rl.android.OrientationListener$ylyyyly r1 = com.behaviosec.rl.android.OrientationListener.ylyyyly.PORTRAIT_UPSIDE_DOWN
            if (r5 != r1) goto L63
            goto L18
        L63:
            com.behaviosec.rl.android.OrientationListener$ylyyyly r5 = com.behaviosec.rl.android.OrientationListener.ylyyyly.LANDSCAPE_LEFT
            goto L82
        L66:
            r1 = 300(0x12c, float:4.2E-43)
            if (r5 < r2) goto L6d
            if (r5 >= r1) goto L6d
            goto L63
        L6d:
            r2 = 330(0x14a, float:4.62E-43)
            if (r5 < r1) goto L7a
            if (r5 >= r2) goto L7a
            com.behaviosec.rl.android.OrientationListener$ylyyyly r5 = r4.x00780078x007800780078
            com.behaviosec.rl.android.OrientationListener$ylyyyly r1 = com.behaviosec.rl.android.OrientationListener.ylyyyly.LANDSCAPE_LEFT
            if (r5 != r1) goto L8
            goto L18
        L7a:
            if (r5 < r2) goto L81
            r1 = 360(0x168, float:5.04E-43)
            if (r5 >= r1) goto L81
            goto L8
        L81:
            r5 = r0
        L82:
            com.behaviosec.rl.android.OrientationListener$ylyyyly r1 = r4.x00780078x007800780078
            if (r1 == r5) goto Lab
            if (r1 == r0) goto La9
            com.behaviosec.rl.oododoo r0 = r4.xx0078x007800780078
            int r1 = com.behaviosec.rl.yylylll.r0072r0072r00720072()
            r2 = -1349847165(0xffffffffaf8af783, float:-2.5277921E-10)
            r1 = r1 ^ r2
            char r1 = (char) r1
            int r2 = com.behaviosec.rl.yyyllll.rrrr007200720072()
            r3 = 383821858(0x16e0a822, float:3.6295259E-25)
            r2 = r2 ^ r3
            char r2 = (char) r2
            java.lang.String r3 = "]"
            java.lang.String r1 = com.behaviosec.rl.uuxuuuu.pppp0070ppp(r3, r1, r2)
            int r2 = r5.ordinal()
            r0.addBKEvent(r1, r2)
        La9:
            r4.x00780078x007800780078 = r5
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.android.OrientationListener.onOrientationChanged(int):void");
    }
}
