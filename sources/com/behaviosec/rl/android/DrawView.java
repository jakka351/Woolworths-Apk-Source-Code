package com.behaviosec.rl.android;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.behaviosec.rl.ooodood;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;

/* loaded from: classes4.dex */
public class DrawView extends View {
    private static final String e006500650065ee0065 = uuxuuuu.pppp0070ppp("\u000b:*A!52E", (char) (yllylll.r007200720072r00720072() ^ (-1146716885)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343)));
    public static int v00760076vvvv0076 = 0;
    public static int v0076vvvvv0076 = 1;
    public static int vv0076vvvv0076 = 2;
    public static int vvvvvvv0076 = 37;
    private final View eeee0065e0065;

    public DrawView(Context context, View view) {
        super(context);
        this.eeee0065e0065 = view;
    }

    public static int v0076v0076vvv0076() {
        return 61;
    }

    public static int vvv0076vvv0076() {
        return 1;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        uuxuuuu.pppp0070ppp("a_D^cPT0`NV[\u000e\u000e\u0004", (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335)));
        LogBridge.d(uuxuuuu.pppp0070ppp("u#\u0011&\u0004\u0016\u0011\"", (char) (yyyllll.rrrr007200720072() ^ 383821873), (char) (yyyllll.rrrr007200720072() ^ 383821865)), uuxuuuu.pppp0070ppp("\u001f\u001f\u0006\")\u0018\u001e{.\u001e(/ce]", (char) (yylylll.r0072r0072r00720072() ^ (-1349847075)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))) + motionEvent);
        View view = this.eeee0065e0065;
        if (view != null) {
            zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
        } else {
            int action = motionEvent.getAction();
            LogBridge.d(uuxuuuu.pppp0070ppp("6cUjL^]n", (char) (yllylll.r007200720072r00720072() ^ (-1146716680)), (char) (yyyllll.rrrr007200720072() ^ 383821870)), uuxuuuu.pp0070p0070ppp("\u007f}b|\u0002nrN~lty,,\"bcsglj5\u001a", (char) (yyyllll.rrrr007200720072() ^ 383821869), (char) (yllylll.r007200720072r00720072() ^ (-1146716900)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))) + action);
            if (action == 4) {
                float pressure = motionEvent.getPressure();
                char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741432));
                char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847166));
                int i = vvvvvvv0076;
                if (((v0076vvvvv0076 + i) * i) % vv0076vvvv0076 != 0) {
                    vvvvvvv0076 = 15;
                    v0076vvvvv0076 = 73;
                }
                LogBridge.d(uuxuuuu.pp0070p0070ppp("&\u0004c+z?,o", cR0072rrr00720072, cR0072r0072r00720072, (char) (yllylll.r007200720072r00720072() ^ (-1146716786))), uuxuuuu.pppp0070ppp("TT;W^MS1cS]d\u0019\u001b\u0013h^c\\2\u0019", (char) (yllylll.r007200720072r00720072() ^ (-1146716872)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343))) + motionEvent.getEventTime() + uuxuuuu.pppp0070ppp("%\u0018ghZgfgcU)\u000e", (char) (yllylll.r007200720072r00720072() ^ (-1146716726)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))) + pressure);
                String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("i\u0019\t \u007f\u0014\u0011$", (char) (yyyllll.rrrr007200720072() ^ 383822032), (char) (ylyylll.r0072rrr00720072() ^ (-1691741378)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)));
                StringBuilder sb = new StringBuilder();
                sb.append(uuxuuuu.pppp0070ppp("@>#=B/3\u000f?-5:llb23%212. sX", (char) (yyyllll.rrrr007200720072() ^ 383821970), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
                sb.append(pressure);
                LogBridge.d(strPp0070p0070ppp, sb.toString());
                ooodood.setLastDown(getContext(), SystemClock.uptimeMillis(), pressure);
            }
            zDispatchTouchEvent = false;
        }
        return !zDispatchTouchEvent ? super.onTouchEvent(motionEvent) : zDispatchTouchEvent;
    }
}
