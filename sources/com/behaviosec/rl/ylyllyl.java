package com.behaviosec.rl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.behaviosec.rl.android.BehavioWebView;
import com.behaviosec.rl.android.BehavioWebViewClient;
import com.behaviosec.rl.android.LogBridge;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class ylyllyl {
    public static int c00630063cccc0063 = 1;
    public static int c0063ccccc0063 = 94;
    public static int cc00630063ccc0063 = 0;
    public static int ccc0063ccc0063 = 2;
    private static final String i0069i0069006900690069;
    private final oddoodo ii00690069006900690069;
    private final String q00710071qqqq;
    private final boolean q0071qqqqq;
    private final Set<WebView> qq0071qqqq = new HashSet();

    static {
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847280));
        int i = c0063ccccc0063;
        if (((c00630063cccc0063 + i) * i) % ccc0063ccc0063 != 0) {
            c0063ccccc0063 = 88;
            cc00630063ccc0063 = 62;
        }
        i0069i0069006900690069 = uuxuuuu.pppp0070ppp("s\u0001\u0001s\u0002|\u0012au\u0002z\u0002u\u0002", cR0072r0072r00720072, (char) (ylyylll.r0072rrr00720072() ^ (-1691741344)));
    }

    public ylyllyl(@NonNull Context context, @NonNull oddoodo oddoodoVar) {
        this.ii00690069006900690069 = oddoodoVar;
        this.q0071qqqqq = !oddoodoVar.listenHierarchyChanges();
        this.q00710071qqqq = context.getClass().getSimpleName();
    }

    public static int c0063c0063ccc0063() {
        return 38;
    }

    public static int cc0063cccc0063() {
        return 0;
    }

    public static /* synthetic */ oddoodo rrr007200720072r(ylyllyl ylyllylVar) {
        if ((c0063c0063ccc0063() * (c0063c0063ccc0063() + c00630063cccc0063)) % ccc0063ccc0063 != cc00630063ccc0063) {
            c0063ccccc0063 = c0063c0063ccc0063();
            cc00630063ccc0063 = c0063c0063ccc0063();
        }
        return ylyllylVar.ii00690069006900690069;
    }

    public void add(@NonNull final WebView webView) {
        LogBridge.d(uuxuuuu.pppp0070ppp("\u0007\u0016\u0014\t\u001d\u001a-~\u0019'\u001e'!/", (char) (ylyylll.r0072rrr00720072() ^ (-1691741249)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))), uuxuuuu.pp0070p0070ppp("{", (char) (ylyylll.r0072rrr00720072() ^ (-1691741305)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847249)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))) + this.q00710071qqqq + uuxuuuu.pppp0070ppp("\tL\u000f\u0013\fH\u0001\u0010\u0006z\u000f\f\u0017ZA", (char) (yllylll.r007200720072r00720072() ^ (-1146716838)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))) + webView.getId());
        if (this.qq0071qqqq.contains(webView)) {
            LogBridge.i(uuxuuuu.pppp0070ppp("?LH;MHY)AMBIAM", (char) (yylylll.r0072r0072r00720072() ^ (-1349847175)), (char) (yyyllll.rrrr007200720072() ^ 383821867)), uuxuuuu.pppp0070ppp("\u001d", (char) (yylylll.r0072r0072r00720072() ^ (-1349847188)), (char) (yyyllll.rrrr007200720072() ^ 383821869)) + this.q00710071qqqq + uuxuuuu.pp0070p0070ppp("u7mzvi{v\b/t|\u0002yn)isxjeg{!rdefoo_k][\u0016l]gZZ^\u000fbUQ\u000bKL\\P\\NX\\\u001c\u0001", (char) (ylyylll.r0072rrr00720072() ^ (-1691741193)), (char) (yyyllll.rrrr007200720072() ^ 383822060), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))) + webView.getId());
            return;
        }
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("\u0016##\u0016$\u001f4\u0004\u0018$\u001d$\u0018$", (char) (yylylll.r0072r0072r00720072() ^ (-1349847217)), (char) (yyyllll.rrrr007200720072() ^ 383821870));
        StringBuilder sb = new StringBuilder();
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716738));
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072() ^ (-1691741279);
        int i = c0063ccccc0063;
        if (((c00630063cccc0063 + i) * i) % ccc0063ccc0063 != cc0063cccc0063()) {
            c0063ccccc0063 = c0063c0063ccc0063();
            c00630063cccc0063 = c0063c0063ccc0063();
        }
        sb.append(uuxuuuu.pp0070p0070ppp("\u0013", cR007200720072r00720072, (char) iR0072rrr00720072, (char) (yyyllll.rrrr007200720072() ^ 383821868)));
        sb.append(this.q00710071qqqq);
        sb.append(uuxuuuu.pppp0070ppp("\u0005H|\f\u0006z\u000b\b'P\u0014\u001e!\u001b\u000edW", (char) (ylyylll.r0072rrr00720072() ^ (-1691741233)), (char) (383821870 ^ yyyllll.rrrr007200720072())));
        sb.append(webView.getId());
        LogBridge.i(strPppp0070ppp, sb.toString());
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.behaviosec.rl.ylyllyl.1
            public static int c006300630063ccc0063 = 58;
            public static int c0063cc0063cc0063 = 2;
            public static int cccc0063cc0063 = 1;

            @Override // java.lang.Runnable
            public void run() {
                if (ylyllyl.rrr007200720072r(ylyllyl.this).injectJavascriptCollector()) {
                    if (webView.getWebViewClient().getClass().getName().equals(uuxuuuu.pppp0070ppp("$2)861-wB1/98D~)86+?<O\u001cFDAKR", (char) (yylylll.r0072r0072r00720072() ^ (-1349847214)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))))) {
                        webView.setWebViewClient(new BehavioWebViewClient());
                    }
                    int i2 = c006300630063ccc0063;
                    if (((cccc0063cc0063 + i2) * i2) % c0063cc0063cc0063 != 0) {
                        c006300630063ccc0063 = 89;
                        cccc0063cc0063 = 10;
                    }
                }
                WebView webView2 = webView;
                if (webView2 instanceof BehavioWebView) {
                    ((BehavioWebView) webView2).sssss0073s();
                }
            }
        });
        this.qq0071qqqq.add(webView);
    }

    public void remove(@NonNull WebView webView) {
        if (this.qq0071qqqq.contains(webView)) {
            String strPppp0070ppp = uuxuuuu.pppp0070ppp("]jfYkfwG_k`g_k", (char) (yllylll.r007200720072r00720072() ^ (-1146716684)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056)));
            StringBuilder sb = new StringBuilder();
            sb.append(uuxuuuu.pp0070p0070ppp(":", (char) (yllylll.r007200720072r00720072() ^ (-1146716895)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847292)), (char) (yyyllll.rrrr007200720072() ^ 383821869)));
            sb.append(this.q00710071qqqq);
            char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847290));
            int iC0063c0063ccc0063 = c0063c0063ccc0063();
            if (((c00630063cccc0063 + iC0063c0063ccc0063) * iC0063c0063ccc0063) % ccc0063ccc0063 != 0) {
                c0063ccccc0063 = 90;
                c00630063cccc0063 = c0063c0063ccc0063();
            }
            sb.append(uuxuuuu.pppp0070ppp("SFjY1\u000f&0~G}\u0017=B4k\u001a8\u0007W,Om\u001a\t*F\u0007m\u0004", cR0072r0072r00720072, (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))));
            sb.append(webView.getId());
            LogBridge.v(strPppp0070ppp, sb.toString());
            this.qq0071qqqq.remove(webView);
        }
    }

    public void removeAll() {
        this.qq0071qqqq.clear();
    }
}
