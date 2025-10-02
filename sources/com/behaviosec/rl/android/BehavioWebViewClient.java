package com.behaviosec.rl.android;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.behaviosec.rl.oddoodo;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;
import java.util.Collection;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class BehavioWebViewClient extends WebViewClient {
    private static final String e0065e0065e0065e = uuxuuuu.pppp0070ppp("q1A;1C9@0bkmeBg2@z\u0004}UHNEAJ\u0002ICO\u001b:VWNNQZ8RPGPJX\u0010\bd\u001amaqsqn!`h`a1\u0017u\u0019\u0001syp|\u0006=\bfdnmy&D(\u0015:\t\u0002\u0011\u0012\u0001\bvZt\u0003y\u0003|\u000b\u001ddK(M#\u001d)d\u0004\u0010\u0011\b\b\u000b\u0014\u0002\u001c*!*$2zQ*\u001d#\u001a&/f=7C\u000f.:;2\"%.\f&4+4>LzY|[\u001a\u007fC7GIGDvORXO[d\u001cc]Y%DPQHHKdB\\jajdr,\u0012p\u001d\u001d\u001f2", (char) (ylyylll.r0072rrr00720072() ^ (-1691741279)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788)));
    private static final String ee00650065e0065e = uuxuuuu.pppp0070ppp("\u000f\u0002\b~\u000b\u0014Kqckd\u0012\u0012\u000b\u000f\u000eGeI&K\u0016\u0012\u0014\u001e%\u001b\u0019\u001d\u001a(w,-,$\u001e22$y`hg7kqf68<8-9\u001485=6F\u000etzJ\u0004xM@JPGSIWG)MJRK[#\n\u0010_\rk*", (char) (ylyylll.r0072rrr00720072() ^ (-1691741185)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050)));
    private static final String eee0065e0065e = "BehavioWebViewClient";
    public static int x0078x00780078007800780078 = 0;
    public static int x0078xx0078007800780078 = 1;
    public static int xx0078x0078007800780078 = 2;
    public static int xxxx0078007800780078 = 11;

    public void injectJavaScriptCollector(final WebView webView, final String str) {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                xxxx0078007800780078 = 20;
                webView.evaluateJavascript(uuxuuuu.pppp0070ppp("\u0011\u001foLAw\u0015J|\u001e{'m;_N\u0011@\u0010\u0005\u001fh\u0018\u0012 X00Wsf,Gld\u0019FnDo|\n9 _\u000eZew/qEv{NP!\u0006G=0oy.>L\b2#/L\u0006R\u0004\u00073n4in#\u0012}\u0016A/\u001d;\fh`\u0006p@K|&)n3\u0012\u0017\u000e;4\\\rl(\u001fzx\u0011\bpl@#\u0014)f2mR\"\u0015NTnIY0P5dr|\tIK\u0015GG-wfcRpnwl)?\f!WiZku\u0001&[\u0003rmu\u0013\u0001p`x3\tl\u000eb}e&2SJj|>PAv\u001b", (char) (yyyllll.rrrr007200720072() ^ 383821920), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))), new ValueCallback<String>() { // from class: com.behaviosec.rl.android.BehavioWebViewClient.1
                    public static int v00760076vvvvv = 2;
                    public static int v0076vvvvvv = 0;
                    public static int vv0076vvvvv = 1;
                    public static int xx007800780078007800780078 = 42;

                    public static int vvv0076vvvv() {
                        return 94;
                    }

                    @Override // android.webkit.ValueCallback
                    public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        onReceiveValue2(str2);
                        while (true) {
                            try {
                                int[] iArr2 = new int[-1];
                            } catch (Exception unused2) {
                                xx007800780078007800780078 = 38;
                                return;
                            }
                        }
                    }

                    /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
                    public void onReceiveValue2(String str2) {
                        oddoodo oddoodoVarA00610061a00610061a = BehavioSecClient.a00610061a00610061a();
                        if (oddoodoVarA00610061a00610061a == null) {
                            return;
                        }
                        String webFieldIdentifierAttribute = oddoodoVarA00610061a00610061a.getWebFieldIdentifierAttribute();
                        String string = new JSONArray((Collection) oddoodoVarA00610061a00610061a.getNormalFields()).toString();
                        String string2 = new JSONArray((Collection) oddoodoVarA00610061a00610061a.getMaskedFields()).toString();
                        WebView webView2 = webView;
                        int i = xx007800780078007800780078;
                        if (((vv0076vvvvv + i) * i) % v00760076vvvvv != v0076vvvvvv) {
                            xx007800780078007800780078 = 28;
                            v0076vvvvvv = vvv0076vvvv();
                        }
                        webView2.evaluateJavascript(String.format(uuxuuuu.pppp0070ppp("/ $\u0019#*_\u0004syp\u001c\u001a\u0011\u0013\u0010GcE C\f\u0006\u0006\u000e\u0013\u0007\u0003\u0005\u007f\fY\f\u000b\b}u\b\u0006uI.41~15(uuwqdnGidjao5\u001a\u001ek#\u0016hYaeZdXdR2TOULZ \u0005\tV\u0002^\u001b", (char) (ylyylll.r0072rrr00720072() ^ (-1691741327)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))), webFieldIdentifierAttribute, string, string2), new ValueCallback<String>() { // from class: com.behaviosec.rl.android.BehavioWebViewClient.1.1
                            public static int v007600760076vvvv = 35;
                            public static int v0076v00760076vvv = 2;
                            public static int v0076vv0076vvv = 1;
                            public static int vvvv0076vvv;

                            public static int v00760076v0076vvv() {
                                return 72;
                            }

                            public static int vv0076v0076vvv() {
                                return 2;
                            }

                            public static int vvv00760076vvv() {
                                return 0;
                            }

                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str3) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                WebView webView3 = webView;
                                int i2 = v007600760076vvvv;
                                if (((v0076vv0076vvv + i2) * i2) % vv0076v0076vvv() != vvvv0076vvv) {
                                    v007600760076vvvv = v00760076v0076vvv();
                                    vvvv0076vvv = 10;
                                }
                                webView3.evaluateJavascript(str, null);
                            }
                        });
                    }
                });
                return;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        oddoodo oddoodoVarA00610061a00610061a = BehavioSecClient.a00610061a00610061a();
        if (oddoodoVarA00610061a00610061a != null && oddoodoVarA00610061a00610061a.injectJavascriptCollector()) {
            injectJavaScriptCollector(webView, InjectJS.ESCAPED_JS_CONTENT);
        }
        super.onPageFinished(webView, str);
        int i = xxxx0078007800780078;
        if (((x0078xx0078007800780078 + i) * i) % xx0078x0078007800780078 != 0) {
            xxxx0078007800780078 = 69;
            x0078xx0078007800780078 = 40;
        }
    }
}
