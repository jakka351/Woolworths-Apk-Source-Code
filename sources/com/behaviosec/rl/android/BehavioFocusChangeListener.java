package com.behaviosec.rl.android;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.behaviosec.rl.odooddo;
import com.behaviosec.rl.oododoo;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class BehavioFocusChangeListener implements View.OnFocusChangeListener {
    public static int a00610061a0061a0061a = 92;
    public static int a0061aa0061a0061a = 1;
    public static int aa0061a0061a0061a = 2;
    public static int aaaa0061a0061a;
    private static final String ww00770077w00770077;
    private oododoo w007700770077w00770077;
    private View.OnFocusChangeListener w0077ww007700770077;
    private odooddo wwww007700770077;
    private WeakHashMap<View, View> ww0077w007700770077 = new WeakHashMap<>();
    private WeakHashMap<View, View> w00770077w007700770077 = new WeakHashMap<>();

    static {
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847151));
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716896));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = a00610061a0061a0061a;
        if (((a0061aa0061a0061a + i) * i) % aa0061a0061a0061a != 0) {
            a00610061a0061a0061a = a006100610061aa0061a();
            aaaa0061a0061a = a006100610061aa0061a();
        }
        ww00770077w00770077 = uuxuuuu.pp0070p0070ppp("&GCC-;xo&)`\u000bR`/K%\u001a\u000e(\u0001\u0003r~?}", cR0072r0072r00720072, cR007200720072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847056)));
    }

    public BehavioFocusChangeListener(@NonNull oododoo oododooVar, @NonNull odooddo odooddoVar, @Nullable View.OnFocusChangeListener onFocusChangeListener) {
        this.w007700770077w00770077 = oododooVar;
        this.wwww007700770077 = odooddoVar;
        this.w0077ww007700770077 = onFocusChangeListener;
    }

    public static int a006100610061aa0061a() {
        return 97;
    }

    public View.OnFocusChangeListener a0061aaa0061a() {
        View.OnFocusChangeListener onFocusChangeListener = this.w0077ww007700770077;
        int i = a00610061a0061a0061a;
        if (((a0061aa0061a0061a + i) * i) % aa0061a0061a0061a != 0) {
            a00610061a0061a0061a = a006100610061aa0061a();
            aaaa0061a0061a = 75;
        }
        return onFocusChangeListener;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        LogBridge.i(uuxuuuu.pp0070p0070ppp("oe\\\u0007\u000fU\rV3x}/ph\u0015\u0014@\u0011i:7\n.*R3", (char) (ylyylll.r0072rrr00720072() ^ (-1691741381)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741243)), (char) (yyyllll.rrrr007200720072() ^ 383821867)), uuxuuuu.pppp0070ppp("z\u000f\f\u001fZA", (char) (ylyylll.r0072rrr00720072() ^ (-1691741363)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + view.toString() + uuxuuuu.pppp0070ppp("'nfwIqdur8\u001d", (char) (yylylll.r0072r0072r00720072() ^ (-1349847078)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))) + z);
        WeakHashMap<View, View> weakHashMap = z ? this.ww0077w007700770077 : this.w00770077w007700770077;
        if (weakHashMap.containsKey(view)) {
            LogBridge.w(uuxuuuu.pp0070p0070ppp("-\u0004|d,aCZ@\u000b)jm)\"|\u0015\u001bS.~B[6\u0016f", (char) (ylyylll.r0072rrr00720072() ^ (-1691741405)), (char) (yllylll.r007200720072r00720072() ^ (-1146716687)), (char) (yyyllll.rrrr007200720072() ^ 383821871)), uuxuuuu.pppp0070ppp("||U\u007ft\b\u0007W}w\u0006\u007f~:\u0001\u0013\u0003\r\u0014@\u0004\u000f\u0013\b\u0011\f\fTI\u001b\u001b !\u0018\u0012\u001d\u0017R&\u001a\u0019,*,#**", (char) (ylyylll.r0072rrr00720072() ^ (-1691741268)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))));
            return;
        }
        weakHashMap.put(view, view);
        View.OnFocusChangeListener onFocusChangeListener = this.w0077ww007700770077;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        weakHashMap.remove(view);
        this.wwww007700770077.aa006100610061aa(z, 0, new Rect());
        oododoo oododooVar = this.w007700770077w00770077;
        if (oododooVar == null) {
            LogBridge.w(uuxuuuu.pp0070p0070ppp("1UYSi]d<f[nm>d^lfeMkvxjtlz", (char) (yylylll.r0072r0072r00720072() ^ (-1349847207)), (char) (yllylll.r007200720072r00720072() ^ (-1146716856)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))), uuxuuuu.pp0070p0070ppp("]\u0013\u0013\u000fb\rf\u0005\u0019\u0007FdeI\u0019!\u0019\u001aOn", (char) (yylylll.r0072r0072r00720072() ^ (-1349847184)), (char) (yyyllll.rrrr007200720072() ^ 383822003), (char) (yyyllll.rrrr007200720072() ^ 383821864)));
            return;
        }
        if (!z) {
            oododooVar.addBKEvent(uuxuuuu.pp0070p0070ppp(RequestConfiguration.MAX_AD_CONTENT_RATING_G, (char) (ylyylll.r0072rrr00720072() ^ (-1691741370)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847249)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), this.wwww007700770077.getFieldName());
            return;
        }
        int iR007200720072r00720072 = yllylll.r007200720072r00720072();
        if ((a006100610061aa0061a() * (a006100610061aa0061a() + a0061aa0061a0061a)) % aa0061a0061a0061a != aaaa0061a0061a) {
            aaaa0061a0061a = a006100610061aa0061a();
        }
        oododooVar.addBKEvent(uuxuuuu.pppp0070ppp("8", (char) (iR007200720072r00720072 ^ (-1146716863)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))), this.wwww007700770077.getFieldName());
    }
}
