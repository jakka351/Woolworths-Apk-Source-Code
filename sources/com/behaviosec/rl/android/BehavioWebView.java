package com.behaviosec.rl.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;
import com.behaviosec.rl.yyyllyl;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BehavioWebView extends WebView {
    private static final String e0065eeeee = "BehavioWebView";
    public static int x00780078x00780078x0078 = 2;
    public static int x0078x007800780078x0078 = 0;
    public static int xx0078x00780078x0078 = 1;
    public static int xxxx00780078x0078 = 8;
    private oooddod e00650065eeee;
    private ododdod e0065e0065eee;
    private String ee0065eeee;
    private oddodod eee0065eee;

    public class oddodod {
        public static int x007800780078xx00780078 = 0;
        public static int x00780078x0078x00780078 = 2;
        public static int xx00780078xx00780078 = 42;
        public static int xxxx0078x00780078 = 1;
        private String e006500650065eee;
        private String e0065ee0065ee;
        private String eeee0065ee;

        public oddodod(@NonNull String str, @Nullable String str2, @Nullable String str3) {
            this.e006500650065eee = str;
            this.eeee0065ee = str2;
            this.e0065ee0065ee = str3;
        }

        public static int x0078xx0078x00780078() {
            return 2;
        }

        public static int xx0078x0078x00780078() {
            return 80;
        }

        @NonNull
        public String getData() {
            int i = xx00780078xx00780078;
            if (((xxxx0078x00780078 + i) * i) % x0078xx0078x00780078() != x007800780078xx00780078) {
                xx00780078xx00780078 = 52;
                x007800780078xx00780078 = xx0078x0078x00780078();
            }
            return this.e006500650065eee;
        }

        @Nullable
        public String getEncoding() {
            int i = xx00780078xx00780078;
            if (((xxxx0078x00780078 + i) * i) % x00780078x0078x00780078 != x007800780078xx00780078) {
                xx00780078xx00780078 = 40;
                x007800780078xx00780078 = xx0078x0078x00780078();
            }
            return this.e0065ee0065ee;
        }

        @Nullable
        public String getMimeType() {
            String str = this.eeee0065ee;
            int i = xx00780078xx00780078;
            if (((xxxx0078x00780078 + i) * i) % x00780078x0078x00780078 != 0) {
                xx00780078xx00780078 = 65;
                x007800780078xx00780078 = xx0078x0078x00780078();
            }
            return str;
        }
    }

    public class ododdod {
        public static int x007800780078x007800780078 = 2;
        public static int x0078x0078x007800780078 = 0;
        public static int xx00780078x007800780078 = 1;
        private String e0065eee0065e;
        private Map<String, String> ee0065ee0065e;

        public ododdod(@NonNull String str, @NonNull Map<String, String> map) {
            this.e0065eee0065e = str;
            this.ee0065ee0065e = map;
        }

        public static int xxx0078x007800780078() {
            return 13;
        }

        @NonNull
        public Map<String, String> getAdditionalHttpHeaders() {
            if ((xxx0078x007800780078() * (xxx0078x007800780078() + xx00780078x007800780078)) % x007800780078x007800780078 != x0078x0078x007800780078) {
                x0078x0078x007800780078 = 3;
            }
            return this.ee0065ee0065e;
        }

        @NonNull
        public String getUrl() {
            return this.e0065eee0065e;
        }
    }

    public class oododod {
        public static int x00780078xxx00780078 = 0;
        public static int xx0078xxx00780078 = 2;
        public static int xxx0078xx00780078 = 1;
        public static int xxxxxx00780078 = 34;

        private oododod() {
        }

        public static int x0078x0078xx00780078() {
            return 26;
        }

        public static int x0078xxxx00780078() {
            return 1;
        }

        @JavascriptInterface
        public void postMessage(String str) throws JSONException {
            String str2;
            String message;
            LogBridge.d(BehavioWebView.e0065eeeee, uuxuuuu.pppp0070ppp(";ONQVdTT\u0011eVf^fk\u0018f_no^ed:!", (char) (ylyylll.r0072rrr00720072() ^ (-1691741275)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))) + str);
            Activity activityRrrr00720072r = yyyllyl.rrrr00720072r(BehavioWebView.this.getContext());
            if (activityRrrr00720072r == null) {
                LogBridge.w(BehavioWebView.e0065eeeee, uuxuuuu.pppp0070ppp(";^pfthtz\"lw%t|tu", (char) (yyyllll.rrrr007200720072() ^ 383822032), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(uuxuuuu.pppp0070ppp("Y_WM", (char) (yylylll.r0072r0072r00720072() ^ (-1349847164)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))));
                if (string.equalsIgnoreCase(uuxuuuu.pppp0070ppp("\t|{~\u0006\bu\u0004", (char) (yyyllll.rrrr007200720072() ^ 383821890), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))))) {
                    String string2 = jSONObject.getString(uuxuuuu.pppp0070ppp("NH", (char) (yylylll.r0072r0072r00720072() ^ (-1349847234)), (char) (yyyllll.rrrr007200720072() ^ 383821867)));
                    boolean z = jSONObject.getBoolean(uuxuuuu.pppp0070ppp("z\u0004fw\u0004\b\u0001\u000b\u0003\u000f\u0001", (char) (yllylll.r007200720072r00720072() ^ (-1146716697)), (char) ((-1146716800) ^ yllylll.r007200720072r00720072())));
                    LogBridge.d(BehavioWebView.e0065eeeee, uuxuuuu.pppp0070ppp("k;i\n\u001am8\u0004'\rHq\u001dv^", (char) (yylylll.r0072r0072r00720072() ^ (-1349847061)), (char) ((-1691741334) ^ ylyylll.r0072rrr00720072())) + string2 + uuxuuuu.pp0070p0070ppp("`BFP\u0005\b(9Ao?eV\t\\sl$IkVW\u0010;\u000eZ", (char) (yylylll.r0072r0072r00720072() ^ (-1349847274)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847245)), (char) (yyyllll.rrrr007200720072() ^ 383821871)) + z);
                    BehavioSecClient.registerKeyboardTarget(string2, z, activityRrrr00720072r);
                    return;
                }
                int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
                int i = xxxxxx00780078;
                if (((x0078xxxx00780078() + i) * i) % xx0078xxx00780078 != 0) {
                    xxxxxx00780078 = 88;
                    xx0078xxx00780078 = 96;
                }
                if (string.equalsIgnoreCase(uuxuuuu.pppp0070ppp("\u0015\u001d\u0010!\u001e", (char) (iR0072rrr00720072 ^ (-1691741326)), (char) (yyyllll.rrrr007200720072() ^ 383821865)))) {
                    int i2 = xxxxxx00780078;
                    if (((xxx0078xx00780078 + i2) * i2) % xx0078xxx00780078 != x00780078xxx00780078) {
                        xxxxxx00780078 = x0078x0078xx00780078();
                        x00780078xxx00780078 = x0078x0078xx00780078();
                    }
                    String string3 = jSONObject.getString(uuxuuuu.pppp0070ppp("jd", (char) (yylylll.r0072r0072r00720072() ^ (-1349847281)), (char) (yyyllll.rrrr007200720072() ^ 383821868)));
                    String string4 = jSONObject.getString(uuxuuuu.pp0070p0070ppp("K ^\f\u007fV\u0006J{\u007f,", (char) (yllylll.r007200720072r00720072() ^ (-1146716926)), (char) (yllylll.r007200720072r00720072() ^ (-1146716807)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))));
                    LogBridge.d(BehavioWebView.e0065eeeee, uuxuuuu.pppp0070ppp("\\\u0007{\u000f\u000eU<\u0007\u0003?", (char) (yylylll.r0072r0072r00720072() ^ (-1349847193)), (char) ((-1349847050) ^ yylylll.r0072r0072r00720072())) + string3 + uuxuuuu.pp0070p0070ppp("I\u0014\u001fL\u0014\u001e\u0013&%\u0018\u0018T- ,!Y\u001e1/0$.5a7)=:\u0001g", (char) ((-1691741329) ^ ylyylll.r0072rrr00720072()), (char) (yyyllll.rrrr007200720072() ^ 383821961), (char) ((-1691741334) ^ ylyylll.r0072rrr00720072())) + string4);
                    BehavioSecClient.setCurrentKeyboardTarget(string3, string4, activityRrrr00720072r);
                    return;
                }
                if (string.equalsIgnoreCase(uuxuuuu.pp0070p0070ppp("=HRP", (char) (yllylll.r007200720072r00720072() ^ (-1146716924)), (char) (yyyllll.rrrr007200720072() ^ 383821848), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))))) {
                    String string5 = jSONObject.getString(uuxuuuu.pp0070p0070ppp("~=", (char) (yylylll.r0072r0072r00720072() ^ (-1349847269)), (char) (yllylll.r007200720072r00720072() ^ (-1146716730)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))));
                    String string6 = jSONObject.getString(uuxuuuu.pp0070p0070ppp("\u0016)'(\u001c&-\u000e 41", (char) (yylylll.r0072r0072r00720072() ^ (-1349847089)), (char) (yllylll.r007200720072r00720072() ^ (-1146716675)), (char) ((-1691741334) ^ ylyylll.r0072rrr00720072())));
                    LogBridge.d(BehavioWebView.e0065eeeee, uuxuuuu.pppp0070ppp("V(c\u0005d\u00170$\n", (char) (yylylll.r0072r0072r00720072() ^ (-1349847161)), (char) ((-1691741329) ^ ylyylll.r0072rrr00720072())) + string5 + uuxuuuu.pp0070p0070ppp("\u0004OQTT~DL?PMxO@J=s6GCB4<Ak?/A<\u0001e", (char) (ylyylll.r0072rrr00720072() ^ (-1691741399)), (char) (yllylll.r007200720072r00720072() ^ (-1146716755)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + string6);
                    BehavioSecClient.unsetCurrentKeyboardTarget(string5, string6, activityRrrr00720072r);
                    return;
                }
                if (string.equalsIgnoreCase(uuxuuuu.pppp0070ppp("PVY__", (char) (yyyllll.rrrr007200720072() ^ 383821901), (char) ((-1349847050) ^ yylylll.r0072r0072r00720072())))) {
                    String string7 = jSONObject.getString(uuxuuuu.pppp0070ppp("A=", (char) (yylylll.r0072r0072r00720072() ^ (-1349847186)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))));
                    String string8 = jSONObject.getString(uuxuuuu.pppp0070ppp("UQH7GYT", (char) (yllylll.r007200720072r00720072() ^ (-1146716742)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))));
                    String string9 = jSONObject.getString(uuxuuuu.pp0070p0070ppp("f\\mIYkf", (char) (yylylll.r0072r0072r00720072() ^ (-1349847148)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847214)), (char) (383821869 ^ yyyllll.rrrr007200720072())));
                    LogBridge.d(BehavioWebView.e0065eeeee, uuxuuuu.pp0070p0070ppp("?f\u00121)B9\u0015Z/*UDD", (char) (yylylll.r0072r0072r00720072() ^ (-1349847288)), (char) (yyyllll.rrrr007200720072() ^ 383821930), (char) (383821865 ^ yyyllll.rrrr007200720072())) + string7 + uuxuuuu.pp0070p0070ppp("#Q?!\u001f\u0001gQ}-\"\bv\u0012", (char) (ylyylll.r0072rrr00720072() ^ (-1691741419)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847265)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))) + string8 + uuxuuuu.pppp0070ppp("X,&U", (char) (yylylll.r0072r0072r00720072() ^ (-1349847120)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))) + string9);
                    BehavioSecClient.keyboardTargetTextChanged(string7, string8, string9, activityRrrr00720072r);
                    return;
                }
                if (string.equalsIgnoreCase(uuxuuuu.pp0070p0070ppp("2%5\u0012$+*", (char) (ylyylll.r0072rrr00720072() ^ (-1691741249)), (char) (yllylll.r007200720072r00720072() ^ (-1146716689)), (char) ((-1691741334) ^ ylyylll.r0072rrr00720072())))) {
                    String string10 = jSONObject.getString(uuxuuuu.pppp0070ppp("YKRQ;O\\U", (char) (yylylll.r0072r0072r00720072() ^ (-1349847142)), (char) (yyyllll.rrrr007200720072() ^ 383821870)));
                    LogBridge.d(BehavioWebView.e0065eeeee, uuxuuuu.pppp0070ppp("\u0001\u0011\u0016\u0013L\u001a\f\u0017\u000eG\n\u000e\u0006\u0012\n\u0007\u0005?\u0013\r<", (char) (ylyylll.r0072rrr00720072() ^ (-1691741426)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + string10);
                    BehavioSecClient.setPageName(activityRrrr00720072r, string10);
                    return;
                }
                if (string.equalsIgnoreCase(uuxuuuu.pp0070p0070ppp("+3+&6\u0015'()22/\u001d/#(&*", (char) (ylyylll.r0072rrr00720072() ^ (-1691741424)), (char) (yyyllll.rrrr007200720072() ^ 383821974), (char) (383821869 ^ yyyllll.rrrr007200720072())))) {
                    LogBridge.d(BehavioWebView.e0065eeeee, uuxuuuu.pppp0070ppp("Yc]ZlMadgrtscwmttz(lkwxrr", (char) (yylylll.r0072r0072r00720072() ^ (-1349847212)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))));
                    BehavioSecClient.clearRegistrations(activityRrrr00720072r);
                } else {
                    if (string.equalsIgnoreCase(uuxuuuu.pp0070p0070ppp("xkulMk\u007fm", (char) (ylyylll.r0072rrr00720072() ^ (-1691741191)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847042)), (char) (yyyllll.rrrr007200720072() ^ 383821866)))) {
                        LogBridge.d(BehavioWebView.e0065eeeee, uuxuuuu.pppp0070ppp("XIUJ%AWC\rOPZUMO", (char) (ylyylll.r0072rrr00720072() ^ (-1691741197)), (char) ((-1146716800) ^ yllylll.r007200720072r00720072())));
                        BehavioSecClient.sendData(activityRrrr00720072r);
                        return;
                    }
                    LogBridge.d(BehavioWebView.e0065eeeee, uuxuuuu.pp0070p0070ppp("9SNHVMVPP\r[TcdSZY\u0015jph^4\u001b", (char) (yyyllll.rrrr007200720072() ^ 383822017), (char) (yyyllll.rrrr007200720072() ^ 383821859), (char) (yyyllll.rrrr007200720072() ^ 383821866)) + string);
                }
            } catch (JSONException e) {
                e = e;
                str2 = BehavioWebView.e0065eeeee;
                message = uuxuuuu.pp0070p0070ppp("\u007f,+')U%\u0015%%\u001a\u001e\u0016Mv~yw", (char) (yyyllll.rrrr007200720072() ^ 383821874), (char) (yllylll.r007200720072r00720072() ^ (-1146716710)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788)));
                LogBridge.e(str2, message, e);
            } catch (Exception e2) {
                e = e2;
                str2 = BehavioWebView.e0065eeeee;
                message = e.getMessage();
                LogBridge.e(str2, message, e);
            }
        }
    }

    public class oooddod {
        public static int x0078x00780078x00780078 = 0;
        public static int x0078xxx007800780078 = 2;
        public static int xx007800780078x00780078 = 1;
        public static int xxx00780078x00780078 = 23;
        private String e0065006500650065ee;
        private String e00650065e0065ee;
        private String e0065e00650065ee;
        private String ee006500650065ee;
        private String eee00650065ee;

        public oooddod(@Nullable String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.e00650065e0065ee = str;
            this.eee00650065ee = str2;
            this.e0065e00650065ee = str3;
            this.ee006500650065ee = str4;
            this.e0065006500650065ee = str5;
        }

        public static int x0078007800780078x00780078() {
            return 2;
        }

        public static int xxxxx007800780078() {
            return 20;
        }

        @Nullable
        public String getBaseUrl() {
            String str = this.e00650065e0065ee;
            int i = xxx00780078x00780078;
            if (((xx007800780078x00780078 + i) * i) % x0078007800780078x00780078() != x0078x00780078x00780078) {
                xxx00780078x00780078 = 81;
                x0078x00780078x00780078 = xxxxx007800780078();
            }
            return str;
        }

        @NonNull
        public String getData() {
            int i = xxx00780078x00780078;
            if (((xx007800780078x00780078 + i) * i) % x0078xxx007800780078 != x0078x00780078x00780078) {
                xxx00780078x00780078 = xxxxx007800780078();
                x0078x00780078x00780078 = xxxxx007800780078();
            }
            return this.eee00650065ee;
        }

        @Nullable
        public String getEncoding() {
            String str = this.ee006500650065ee;
            int iXxxxx007800780078 = xxxxx007800780078();
            if (((xx007800780078x00780078 + iXxxxx007800780078) * iXxxxx007800780078) % x0078xxx007800780078 != 0) {
                xxx00780078x00780078 = xxxxx007800780078();
                x0078x00780078x00780078 = 72;
            }
            return str;
        }

        @Nullable
        public String getHistoryUrl() {
            int i = 2;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused) {
                    xxx00780078x00780078 = xxxxx007800780078();
                    return this.e0065006500650065ee;
                }
            }
        }

        @Nullable
        public String getMimeType() {
            return this.e0065e00650065ee;
        }
    }

    public BehavioWebView(@NonNull Context context) {
        super(context);
        s0073007300730073ss();
    }

    @SuppressLint
    private void s0073007300730073ss() {
        getSettings().setJavaScriptEnabled(true);
        addJavascriptInterface(new oododod(), uuxuuuu.pp0070p0070ppp("[k\u0013\u0003\u001a\u001aB@WO\u001d\u00032T\u0003ic#", (char) (yyyllll.rrrr007200720072() ^ 383821901), (char) (yyyllll.rrrr007200720072() ^ 383821932), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))));
    }

    public static int x00780078007800780078x0078() {
        return 1;
    }

    public static int x0078xx00780078x0078() {
        return 0;
    }

    public static int xx0078007800780078x0078() {
        return 2;
    }

    public static int xxx007800780078x0078() {
        return 85;
    }

    @Override // android.webkit.WebView
    public void loadData(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        if (BehavioSecClient.a00610061a00610061a() != null) {
            super.loadData(str, str2, str3);
            return;
        }
        this.ee0065eeee = null;
        this.e0065e0065eee = null;
        this.eee0065eee = new oddodod(str, str2, str3);
        int i = xxxx00780078x0078;
        if (((xx0078x00780078x0078 + i) * i) % x00780078x00780078x0078 != x0078x007800780078x0078) {
            xxxx00780078x0078 = 37;
            x0078x007800780078x0078 = xxx007800780078x0078();
        }
        this.e00650065eeee = null;
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(@Nullable String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        if (BehavioSecClient.a00610061a00610061a() != null) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        this.ee0065eeee = null;
        this.e0065e0065eee = null;
        this.eee0065eee = null;
        this.e00650065eeee = new oooddod(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NonNull String str) {
        if (BehavioSecClient.a00610061a00610061a() != null) {
            super.loadUrl(str);
            return;
        }
        this.ee0065eeee = str;
        this.e0065e0065eee = null;
        this.eee0065eee = null;
        int i = xxxx00780078x0078;
        if (((xx0078x00780078x0078 + i) * i) % x00780078x00780078x0078 != 0) {
            xxxx00780078x0078 = xxx007800780078x0078();
            xx0078x00780078x0078 = 99;
        }
        this.e00650065eeee = null;
    }

    public void sssss0073s() {
        String str = this.ee0065eeee;
        if (str != null) {
            loadUrl(str);
            return;
        }
        ododdod ododdodVar = this.e0065e0065eee;
        if (ododdodVar != null) {
            loadUrl(ododdodVar.getUrl(), this.e0065e0065eee.getAdditionalHttpHeaders());
            return;
        }
        oddodod oddododVar = this.eee0065eee;
        if (oddododVar != null) {
            loadData(oddododVar.getData(), this.eee0065eee.getMimeType(), this.eee0065eee.getEncoding());
            return;
        }
        oooddod oooddodVar = this.e00650065eeee;
        if (oooddodVar != null) {
            String baseUrl = oooddodVar.getBaseUrl();
            int i = xxxx00780078x0078;
            if (((xx0078x00780078x0078 + i) * i) % x00780078x00780078x0078 != x0078x007800780078x0078) {
                xxxx00780078x0078 = xxx007800780078x0078();
                x0078x007800780078x0078 = xxx007800780078x0078();
            }
            loadDataWithBaseURL(baseUrl, this.e00650065eeee.getData(), this.e00650065eeee.getMimeType(), this.e00650065eeee.getEncoding(), this.e00650065eeee.getHistoryUrl());
        }
    }

    public BehavioWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        s0073007300730073ss();
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NonNull String str, @NonNull Map<String, String> map) {
        if (BehavioSecClient.a00610061a00610061a() == null) {
            this.ee0065eeee = null;
            this.e0065e0065eee = new ododdod(str, map);
            this.eee0065eee = null;
            this.e00650065eeee = null;
            return;
        }
        int i = xxxx00780078x0078;
        if (((xx0078x00780078x0078 + i) * i) % x00780078x00780078x0078 != x0078x007800780078x0078) {
            xxxx00780078x0078 = xxx007800780078x0078();
            x0078x007800780078x0078 = 68;
        }
        super.loadUrl(str, map);
    }

    public BehavioWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s0073007300730073ss();
    }

    @RequiresApi
    public BehavioWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        s0073007300730073ss();
    }
}
