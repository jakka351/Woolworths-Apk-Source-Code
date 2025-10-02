package YU;

import YU.X;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import au.com.woolworths.android.onesite.app.BaseShopApplication;
import com.cyberfend.cyfsecurity.CYFManager;
import com.cyberfend.cyfsecurity.CYFMonitor;
import com.cyberfend.cyfsecurity.CircleProgressBar;

/* loaded from: classes.dex */
public class Us {
    public static int i = 2443;
    public static int j = 7531;

    /* renamed from: a, reason: collision with root package name */
    public WebView f30a;
    public Application b;
    public X c;
    public String d;
    public String e;
    public String f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final String h = CircleProgressBar.a("%$[@n}u{g\u0001HkkH\u001c\u001fBMU[\u0010\u0001^TVH\u000e\u0013EVFZj](nY\u0014.xv`tWG#:ukk8dQx!\u007f}rebs{`=YyMI]On@@KBFU\n\u0001WNLiW[\u001c\u0012\u0007\u0015Eh]\u001fAAW \fTKLxGQX$<(em`q`{qT'r~}q8vhaw}p~x^ny#^rM61\u001c\rTEWYWF\u0017\u0000\u0014\\R\\V\u0004\r\u001b[BXL\b");

    class Aw implements X.v {
        public Aw() {
        }

        /* JADX WARN: Removed duplicated region for block: B:69:? A[SYNTHETIC] */
        @Override // YU.X.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r6 = this;
                int r0 = YU.Us.i
                YU.Ue r0 = YU.Ue.h()
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.g(r1)
                YU.Us r0 = YU.Us.this
                r0.d()
                android.os.Handler r1 = r0.g     // Catch: java.lang.Exception -> L1b
                YU.Us$Fp r2 = new YU.Us$Fp     // Catch: java.lang.Exception -> L1b
                r2.<init>()     // Catch: java.lang.Exception -> L1b
                r1.post(r2)     // Catch: java.lang.Exception -> L1b
                goto L1f
            L1b:
                r1 = move-exception
                YU.UB.a(r1)
            L1f:
                com.cyberfend.cyfsecurity.CYFManager r1 = com.cyberfend.cyfsecurity.CYFMonitor.f14058a
                int r2 = r1.h()
                r3 = 3
                r4 = 7530(0x1d6a, float:1.0552E-41)
                r5 = 2442(0x98a, float:3.422E-42)
                if (r2 != r3) goto L4e
                r0 = 11
                r1.l(r0)
                int r0 = YU.Us.i
                if (r0 > r5) goto L45
            L35:
                int r0 = YU.Us.i
                int r0 = r0 + 91
                r1 = 42
                if (r0 == r1) goto L3e
                goto L35
            L3e:
                int r0 = YU.Us.i
                int r0 = r0 >> 29
                YU.Us.i = r0
                goto L3e
            L45:
                int r1 = YU.Us.j
                if (r1 > r4) goto Lb8
                r0 = r0 ^ 2443(0x98b, float:3.423E-42)
                if (r0 == 0) goto L80
                goto La8
            L4e:
                int r2 = r1.h()
                r3 = 2
                if (r2 != r3) goto L6e
                int r0 = YU.Us.i
                if (r0 > r5) goto L68
            L59:
                int r0 = YU.Us.i
                int r1 = r0 + 156
                r2 = 22
                if (r1 == r2) goto L62
                goto L59
            L62:
                int r1 = r0 % 31
                int r1 = r1 + r0
                YU.Us.i = r1
                goto L59
            L68:
                r0 = 10
            L6a:
                r1.l(r0)
                return
            L6e:
                java.lang.String r0 = r0.e
                if (r0 != 0) goto Lb9
                r0 = 9
                r1.l(r0)
                int r0 = YU.Us.j
                if (r0 > r4) goto Lb8
                int r0 = YU.Us.i
                if (r0 > r5) goto L80
                goto La8
            L80:
                int r0 = YU.Us.j
                int r1 = r0 + 26
                r2 = 58
                r3 = 31
                if (r1 == r3) goto L9f
                r3 = 50
                if (r1 == r3) goto L91
                if (r1 == r2) goto L97
                goto L80
            L91:
                int r0 = r0 % 71
                int r0 = r0 * 40
            L95:
                YU.Us.j = r0
            L97:
                int r0 = YU.Us.j
                int r0 = r0 >> 71
                r0 = r0 ^ 3228(0xc9c, float:4.523E-42)
                int r0 = r0 % r3
                goto L95
            L9f:
                int r0 = r0 % 22
                int r0 = r0 * r2
                YU.Us.j = r0
                int r0 = YU.Us.i
                if (r0 > r5) goto L80
            La8:
                int r0 = YU.Us.i
                int r1 = r0 + 65
                r2 = 4
                if (r1 == r2) goto Lb0
                goto La8
            Lb0:
                int r1 = r0 + r0
                int r1 = r1 + r0
                int r0 = r1 >> 65
                YU.Us.i = r0
                goto La8
            Lb8:
                return
            Lb9:
                r0 = 1
                goto L6a
            */
            throw new UnsupportedOperationException("Method not decompiled: YU.Us.Aw.a():void");
        }
    }

    class Fp implements Runnable {
        public static String e = CircleProgressBar.a("n`}yDL[hCBHz(@@");
        public static String f = CircleProgressBar.a("SV]}DMKN");
        public static String g = CircleProgressBar.a("xgpzY\u0013NGCOK");
        public static String h = CircleProgressBar.a("n`}yDL[\u0005FC");

        class Fd implements Runnable {
            public Fd() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                Us us = Us.this;
                us.f30a.destroy();
                us.f30a = null;
            }
        }

        public Fp() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Us us = Us.this;
            WebView webView = us.f30a;
            if (webView != null) {
                webView.stopLoading();
                us.f30a.removeJavascriptInterface(f);
                us.f30a.loadUrl(g);
                WebView.setWebContentsDebuggingEnabled(false);
                us.f30a.getSettings().setJavaScriptEnabled(false);
                us.b.deleteDatabase(h);
                us.b.deleteDatabase(e);
                us.f30a.clearHistory();
                us.f30a.clearCache(true);
                us.f30a.setWebViewClient(null);
                us.f30a.setWebChromeClient(null);
                us.f30a.loadUrl(g);
                us.f30a.clearFormData();
                us.f30a.clearSslPreferences();
                us.f30a.clearFocus();
                us.f30a.clearView();
                us.f30a.removeAllViewsInLayout();
                us.f30a.removeAllViews();
                us.f30a.clearAnimation();
                us.g.postDelayed(new Fd(), 50L);
            }
        }
    }

    class Fw extends WebViewClient {
        public Fw() {
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Us.b(Us.this);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            Us.b(Us.this);
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Us.b(Us.this);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    class Uc extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }
    }

    public Us(Application application, String str, String str2) {
        this.b = null;
        try {
            this.b = application;
            this.d = str;
            this.e = str2;
            this.f = null;
            a();
        } catch (Exception e) {
            UB.a(e);
        }
    }

    public static void b(Us us) {
        CYFManager cYFManager;
        int i2;
        int i3;
        Ue.h().g(Boolean.FALSE);
        us.d();
        try {
            us.g.post(us.new Fp());
        } catch (Exception e) {
            UB.a(e);
        }
        us.c.b = null;
        if (N.a().booleanValue()) {
            cYFManager = CYFMonitor.f14058a;
            if (cYFManager.h() == 2) {
                cYFManager.l(5);
                if ((i ^ 2443) == 0) {
                    return;
                }
            } else if (cYFManager.h() == 4) {
                i2 = 7;
            } else {
                cYFManager.l(8);
                if (i > 2442) {
                    return;
                }
            }
            do {
                i3 = i;
            } while (i3 + 39 != 72);
            while (true) {
                i = ((i >> 8) + i3) * 105;
            }
        } else {
            cYFManager = CYFMonitor.f14058a;
            i2 = 6;
        }
        cYFManager.l(i2);
    }

    public final void a() {
        try {
            this.f30a = new WebView(this.b);
            if (this.c == null) {
                this.c = new X(this.b, new Aw());
            }
            if ((this.b.getApplicationInfo().flags & 2) != 0) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            e();
        } catch (Exception e) {
            UB.a(e);
        }
    }

    public final String c() {
        X x = this.c;
        if (x == null || !x.e.booleanValue()) {
            return null;
        }
        return this.c.b;
    }

    public final void d() {
        String str = this.e;
        this.f = str;
        if (str != null) {
            String strB = M.b(str);
            UA ua = UA.f;
            synchronized (ua) {
                BaseShopApplication baseShopApplication = ua.f18a;
                if (baseShopApplication == null) {
                    O.e(CircleProgressBar.a("J`q|B[hJV@c~eLG"), CircleProgressBar.a("jdij~zdJQI\u001a?EKLWOAL\u0017GN\u001cUG]\\"), new Throwable[0]);
                    return;
                }
                SharedPreferences.Editor editorEdit = baseShopApplication.getSharedPreferences(CircleProgressBar.a("zjr!LBMFCH\u000e}iPOBD\u0017HEK[YIW_SJE"), 0).edit();
                editorEdit.putString(CircleProgressBar.a("jv@gLZD"), strB);
                editorEdit.commit();
            }
        }
    }

    public final void e() {
        try {
            this.f30a.getSettings().setJavaScriptEnabled(true);
            this.f30a.getSettings().setCacheMode(2);
            this.f30a.addJavascriptInterface(this.c, CircleProgressBar.a("SV]}DMKN"));
            this.f30a.setWebChromeClient(new Uc());
            this.f30a.setWebViewClient(new Fw());
            Uri.Builder builderBuildUpon = Uri.parse(this.d).buildUpon();
            builderBuildUpon.appendPath(CircleProgressBar.a("Fvzl"));
            builderBuildUpon.appendPath(CircleProgressBar.a("jatPNAMGNDNxc\nHP"));
            builderBuildUpon.appendQueryParameter(CircleProgressBar.a("vv"), CircleProgressBar.a("xk{}B@H"));
            builderBuildUpon.appendQueryParameter(CircleProgressBar.a("jq~}Y]EFG"), this.c.startTime());
            builderBuildUpon.appendQueryParameter(CircleProgressBar.a("j|l{HDzNPRIph"), this.c.systemVersion());
            builderBuildUpon.appendQueryParameter(CircleProgressBar.a("tj{jA"), this.c.model());
            builderBuildUpon.appendQueryParameter(CircleProgressBar.a("}`ifNLdJPEW~tAvZZ\\"), this.c.hardWareType());
            builderBuildUpon.appendQueryParameter(CircleProgressBar.a("xuoFILB_KGIzt"), this.c.appIdentifier());
            builderBuildUpon.appendQueryParameter(CircleProgressBar.a("}`ifNLeO"), this.c.androidId());
            if (this.e != null) {
                builderBuildUpon.appendQueryParameter(CircleProgressBar.a("j`myH[\u007fBFDsvaJCO"), this.e);
            }
            this.f30a.loadData(this.h.replace(CircleProgressBar.a("B^J]atq"), builderBuildUpon.toString()), CircleProgressBar.a("m`g{\u0002AXFN\u001a\u0000|nEPPOM\u0005bz{\u0011\u0003"), null);
            if (this.e != null) {
                CYFMonitor.f14058a.l(14);
            }
        } catch (Exception e) {
            UB.a(e);
        }
    }
}
