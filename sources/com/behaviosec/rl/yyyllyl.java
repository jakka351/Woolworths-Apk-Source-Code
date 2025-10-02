package com.behaviosec.rl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.behaviosec.rl.android.LogBridge;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class yyyllyl {
    public static int c006300630063006300630063c = 2;
    public static int c00630063c006300630063c = 1;
    public static int cc0063c006300630063c = 21;
    public static int ccccccc0063;
    private static final String iii0069006900690069;

    static {
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821891);
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847111));
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
        if ((c0063c0063006300630063c() * (c0063c0063006300630063c() + c00630063c006300630063c)) % c006300630063006300630063c != cc00630063006300630063c()) {
            cc0063c006300630063c = c0063c0063006300630063c();
            ccccccc0063 = c0063c0063006300630063c();
        }
        iii0069006900690069 = uuxuuuu.pp0070p0070ppp("r\u0013\t\r\u0015", cRrrr007200720072, cR0072r0072r00720072, (char) (iR0072rrr00720072 ^ (-1691741336)));
    }

    private yyyllyl() {
    }

    public static int c0063c0063006300630063c() {
        return 80;
    }

    public static int cc00630063006300630063c() {
        return 0;
    }

    public static int ccc0063006300630063c() {
        return 2;
    }

    public static final void r00720072r00720072r(Context context) {
        String str = uuxuuuu.pp0070p0070ppp("884/\u000f%$}1/)\u001f!#\"\\", (char) (yyyllll.rrrr007200720072() ^ 383821892), (char) (ylyylll.r0072rrr00720072() ^ (-1691741278)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))) + context + uuxuuuu.pp0070p0070ppp("\u001fj", (char) (ylyylll.r0072rrr00720072() ^ (-1691741283)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847089)), (char) (yyyllll.rrrr007200720072() ^ 383821868));
        try {
            Activity activityRrrr00720072r = rrrr00720072r(context);
            LogBridge.d(uuxuuuu.pppp0070ppp("Gg]ai", (char) (yllylll.r007200720072r00720072() ^ (-1146716687)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343))), str + uuxuuuu.pppp0070ppp("FGWKWISW\u0017{", (char) (ylyylll.r0072rrr00720072() ^ (-1691741344)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))) + activityRrrr00720072r);
            if (activityRrrr00720072r != null) {
                Window window = activityRrrr00720072r.getWindow();
                char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741197));
                int iR007200720072r00720072 = yllylll.r007200720072r00720072();
                int i = cc0063c006300630063c;
                if (((c00630063c006300630063c + i) * i) % ccc0063006300630063c() != 0) {
                    cc0063c006300630063c = c0063c0063006300630063c();
                    c00630063c006300630063c = c0063c0063006300630063c();
                }
                LogBridge.d(uuxuuuu.pppp0070ppp("p\u0011\u0003\u0007\u0013", cR0072rrr00720072, (char) (iR007200720072r00720072 ^ (-1146716788))), str + uuxuuuu.pp0070p0070ppp("^QWNZc'\u000e", (char) (ylyylll.r0072rrr00720072() ^ (-1691741219)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847230)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))) + window);
                if (window != null) {
                    window.getDecorView().setImportantForAutofill(8);
                }
            }
        } catch (ClassCastException e) {
            LogBridge.w(uuxuuuu.pppp0070ppp("5SGIO", (char) (ylyylll.r0072rrr00720072() ^ (-1691741386)), (char) ((-1146716788) ^ yllylll.r007200720072r00720072())), str, e);
        }
    }

    public static List<View> r0072rr00720072r(View view) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        while (!linkedList.isEmpty()) {
            int i = cc0063c006300630063c;
            if (((c00630063c006300630063c + i) * i) % ccc0063006300630063c() != ccccccc0063) {
                cc0063c006300630063c = 32;
                ccccccc0063 = 88;
            }
            View view2 = (View) linkedList.remove();
            arrayList.add(view2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    linkedList.add(viewGroup.getChildAt(i2));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public static ViewGroup rr0072r00720072r(@NonNull View view, @NonNull Context context) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        while (!linkedList.isEmpty()) {
            View view2 = (View) linkedList.remove();
            arrayList.add(view2);
            if (view2 instanceof ViewGroup) {
                return (ViewGroup) view2;
            }
        }
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821969);
        int iRrrr007200720072 = yyyllll.rrrr007200720072() ^ 383821962;
        int i = cc0063c006300630063c;
        if (((c00630063c006300630063c + i) * i) % c006300630063006300630063c != 0) {
            cc0063c006300630063c = c0063c0063006300630063c();
            c00630063c006300630063c = 44;
        }
        LogBridge.i(uuxuuuu.pp0070p0070ppp("<ZNPV", cRrrr007200720072, (char) iRrrr007200720072, (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), uuxuuuu.pppp0070ppp("\u0006(Y\u0011%\"5\u00062073c+5<6-\u0005jA@7=7p3r8JCDQxIIA\u000b", (char) (ylyylll.r0072rrr00720072() ^ (-1691741217)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))));
        return new FrameLayout(context);
    }

    public static Activity rrrr00720072r(Context context) {
        if (context == null) {
            return null;
        }
        if (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                return rrrr00720072r(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }
        int i = cc0063c006300630063c;
        if (((c00630063c006300630063c + i) * i) % c006300630063006300630063c != cc00630063006300630063c()) {
            cc0063c006300630063c = 15;
            c00630063c006300630063c = 44;
        }
        return (Activity) context;
    }
}
