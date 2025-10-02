package com.behaviosec.rl.android;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.behaviosec.rl.odddodd;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.ylyylyl;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class BehavioButtonSDK {
    public static final String TARGET_TYPE_MASKED;
    public static final String TARGET_TYPE_NORMAL;
    public static int f006600660066006600660066f = 1;
    public static int ff00660066006600660066f = 27;
    public static int ff0066ffff0066 = 0;
    public static int fffffff0066 = 2;
    private static final String u007500750075u0075u;
    private odddodd u00750075u00750075u;
    private BehavioButtonTouchListener u0075uu00750075u;
    private ylyylyl uu0075u00750075u;
    private Context uuuu00750075u;

    public static class Config {
        public static int f0066006600660066ff0066 = 0;
        public static int f00660066ff0066f0066 = 1;
        public static int f0066fff0066f0066 = 2;
        public static int ff006600660066ff0066 = 25;
        private boolean u00750075007500750075u;
        private boolean u0075u007500750075u;
        private boolean u0075uuuu0075;
        private boolean uu0075007500750075u;
        private int uu0075uuu0075;
        private boolean uuu007500750075u;
        private boolean uuuuuu0075;

        public Config() {
            this(true, false, true, true, true, false, 2);
        }

        public static /* synthetic */ boolean c0063006300630063c0063(Config config) {
            boolean z = config.uuu007500750075u;
            if (((fffff0066f0066() + ff006600660066ff0066) * ff006600660066ff0066) % f0066fff0066f0066 != f0066006600660066ff0066) {
                ff006600660066ff0066 = 4;
                f0066006600660066ff0066 = ff0066ff0066f0066();
            }
            return z;
        }

        public static /* synthetic */ int c00630063cc00630063(Config config) {
            int i = ff006600660066ff0066;
            if (((f00660066ff0066f0066 + i) * i) % f0066fff0066f0066 != f0066006600660066ff0066) {
                ff006600660066ff0066 = 71;
                f0066006600660066ff0066 = 14;
            }
            return config.uu0075uuu0075;
        }

        public static /* synthetic */ boolean c0063c00630063c0063(Config config) {
            if (((fffff0066f0066() + ff006600660066ff0066) * ff006600660066ff0066) % f0066fff0066f0066 != f0066006600660066ff0066) {
                ff006600660066ff0066 = ff0066ff0066f0066();
                f0066006600660066ff0066 = ff0066ff0066f0066();
            }
            return config.u00750075007500750075u;
        }

        public static /* synthetic */ boolean c0063ccc00630063(Config config) {
            boolean z = config.u0075uuuu0075;
            int i = ff006600660066ff0066;
            if (((f00660066ff0066f0066 + i) * i) % f0066fff0066f0066 != f0066006600660066ff0066) {
                ff006600660066ff0066 = ff0066ff0066f0066();
                f0066006600660066ff0066 = ff0066ff0066f0066();
            }
            return z;
        }

        public static /* synthetic */ boolean cc006300630063c0063(Config config) {
            int i = ff006600660066ff0066;
            if (((fffff0066f0066() + i) * i) % f0066fff0066f0066 != 0) {
                ff006600660066ff0066 = 27;
                f0066006600660066ff0066 = 43;
            }
            return config.uuuuuu0075;
        }

        public static /* synthetic */ boolean cc0063cc00630063(Config config) {
            if ((ff0066ff0066f0066() * (ff0066ff0066f0066() + f00660066ff0066f0066)) % f0066fff0066f0066 != f0066006600660066ff0066) {
                ff006600660066ff0066 = ff0066ff0066f0066();
                f0066006600660066ff0066 = 98;
            }
            return config.uu0075007500750075u;
        }

        public static int ff0066ff0066f0066() {
            return 61;
        }

        public static int fffff0066f0066() {
            return 1;
        }

        public Config(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
            this.uuu007500750075u = z;
            this.u0075u007500750075u = z2;
            this.u0075uuuu0075 = z6;
            this.uu0075uuu0075 = i;
            this.uu0075007500750075u = false;
            this.u00750075007500750075u = false;
            this.uuuuuu0075 = false;
        }
    }

    static {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("Vz~x\u0007z\u0002U\u0012\u0012\u0013\u000f\u0007l^f", (char) (ylyylll.r0072rrr00720072() ^ (-1691741438)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800)));
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 41;
            ff0066ffff0066 = f0066fffff0066();
        }
        u007500750075u0075u = strPppp0070ppp;
        TARGET_TYPE_NORMAL = uuxuuuu.pp0070p0070ppp("^", (char) (yylylll.r0072r0072r00720072() ^ (-1349847050)), (char) (yllylll.r007200720072r00720072() ^ (-1146716830)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331)));
        TARGET_TYPE_MASKED = uuxuuuu.pppp0070ppp("jp", (char) (ylyylll.r0072rrr00720072() ^ (-1691741293)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)));
    }

    public BehavioButtonSDK(@NonNull Context context, @Nullable ViewGroup viewGroup, @NonNull Config config) {
        this.uu0075u00750075u = null;
        this.u00750075u00750075u = null;
        this.uuuu00750075u = context;
        BehavioButtonTouchListener behavioButtonTouchListener = new BehavioButtonTouchListener(context);
        this.u0075uu00750075u = behavioButtonTouchListener;
        behavioButtonTouchListener.nnn006E006E006En(Config.c0063c00630063c0063(config));
        this.u0075uu00750075u.n006E006En006E006En(Config.cc006300630063c0063(config));
        if (Config.c0063006300630063c0063(config) && viewGroup != null) {
            ylyylyl ylyylylVar = new ylyylyl(context, viewGroup, !config.u0075u007500750075u);
            this.uu0075u00750075u = ylyylylVar;
            this.u0075uu00750075u.n006En006En006E006E(ylyylylVar);
            this.uu0075u00750075u.rr0072rr0072r(this.u0075uu00750075u);
            ylyylyl.r007200720072rrr(Config.c0063ccc00630063(config));
        }
        if (Config.cc0063cc00630063(config)) {
            this.u00750075u00750075u = new odddodd(context, Config.c00630063cc00630063(config));
        }
    }

    public static void collectAmbiguousKeystrokes(boolean z) {
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != 0) {
            ff00660066006600660066f = f0066fffff0066();
            f006600660066006600660066f = f0066fffff0066();
        }
        ylyylyl.rr00720072rrr(z);
    }

    public static int f00660066f0066ff0066() {
        return 1;
    }

    public static int f00660066ffff0066() {
        return 2;
    }

    public static int f0066fffff0066() {
        return 81;
    }

    public static int ffff0066ff0066() {
        return 0;
    }

    public void addToVersionObject(@NonNull String str, double d) throws Exception {
        LogBridge.d(uuxuuuu.pppp0070ppp("Nprj~puGywvpnRBH", (char) (yyyllll.rrrr007200720072() ^ 383821904), (char) (yyyllll.rrrr007200720072() ^ 383821865)), uuxuuuu.pp0070p0070ppp("A\u0002Bb\u000e1|]\no-4/J5;\u000fZn", (char) (yyyllll.rrrr007200720072() ^ 383821883), (char) (yylylll.r0072r0072r00720072() ^ (-1349847267)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))) + str + uuxuuuu.pp0070p0070ppp("\u000e\u0003", (char) (ylyylll.r0072rrr00720072() ^ (-1691741246)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741405)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))) + d);
        BehavioButtonTouchListener behavioButtonTouchListener = this.u0075uu00750075u;
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % f00660066ffff0066() != ff0066ffff0066) {
            ff00660066006600660066f = f0066fffff0066();
            ff0066ffff0066 = f0066fffff0066();
        }
        behavioButtonTouchListener.nnnnn006En(str, d);
    }

    public void addTouchEvent(@NonNull MotionEvent motionEvent) {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                ff00660066006600660066f = 23;
                if (this.uu0075u00750075u != null) {
                    this.uu0075u00750075u.r00720072rrrr(motionEvent);
                    return;
                }
                return;
            }
        }
    }

    public void clearCustomHeaderVariables() {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("Rvzt\u000b~\u0006Y\u000e\u000e\u000f\u000b\u000bpbj", (char) (yylylll.r0072r0072r00720072() ^ (-1349847045)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847180)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), uuxuuuu.pppp0070ppp("\u0002\n\u0002|\r\\\u000e\u000b\u000b\u0005\u0002[wrtt\u0001cm}sjjskx", (char) (yllylll.r007200720072r00720072() ^ (-1146716676)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
        this.u0075uu00750075u.nnn006En006En();
    }

    public void clearRegisteredFieldsAndTargets() {
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716845));
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847130));
        int iR007200720072r00720072 = yllylll.r007200720072r00720072();
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 79;
            ff0066ffff0066 = 6;
        }
        LogBridge.d(uuxuuuu.pp0070p0070ppp("\u001eiV4\u0004~\u0003S\tI&1\u0012B*\u0003", cR007200720072r00720072, cR0072r0072r00720072, (char) (iR007200720072r00720072 ^ (-1146716789))), uuxuuuu.pppp0070ppp("@JDAS4HKNY[M[OO2VS[Td3aXIWi_^nn", (char) (yylylll.r0072r0072r00720072() ^ (-1349847122)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))));
        this.u0075uu00750075u.n006E006E006En006En();
    }

    public void clearTargetPageDefinition() {
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        if ((f0066fffff0066() * (f0066fffff0066() + f006600660066006600660066f)) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 79;
            ff0066ffff0066 = 18;
        }
        LogBridge.d(uuxuuuu.pppp0070ppp("\u0005w\t%zBhSM-/\bQ<!\u0003", (char) (iRrrr007200720072 ^ 383821941), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), uuxuuuu.pppp0070ppp("/7/*B#/?+(6\u0011).+\tAACGISGLB", (char) (yllylll.r007200720072r00720072() ^ (-1146716739)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344))));
        this.u0075uu00750075u.nnnn006E006En();
    }

    public void clearTimings() {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("A\u0017\bk/L8q]~v\u001eM.)P", (char) (ylyylll.r0072rrr00720072() ^ (-1691741292)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), uuxuuuu.pppp0070ppp(">F>9I*>A<@8C", (char) (ylyylll.r0072rrr00720072() ^ (-1691741235)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))));
        this.u0075uu00750075u.nn006En006E006En();
        ylyylyl ylyylylVar = this.uu0075u00750075u;
        if (((f00660066f0066ff0066() + ff00660066006600660066f) * ff00660066006600660066f) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = f0066fffff0066();
            ff0066ffff0066 = f0066fffff0066();
        }
        if (ylyylylVar != null) {
            this.uu0075u00750075u.rrr0072rrr();
        }
    }

    public void dismissOverlayViewGroup() {
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % f00660066ffff0066() != ff0066ffff0066) {
            ff00660066006600660066f = f0066fffff0066();
            ff0066ffff0066 = f0066fffff0066();
        }
        ylyylyl ylyylylVar = this.uu0075u00750075u;
        if (ylyylylVar != null) {
            ylyylylVar.rrrr0072rr();
        }
    }

    public void enableLogging(int i) {
        int i2 = ff00660066006600660066f;
        if (((f006600660066006600660066f + i2) * i2) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 71;
            ff0066ffff0066 = f0066fffff0066();
        }
        LogBridge.init(this.uuuu00750075u, i);
    }

    @NonNull
    public String getTimingString() throws JSONException, SecurityException {
        JSONArray jSONArrayNn006Ennn006E = this.u0075uu00750075u.nn006Ennn006E();
        ylyylyl ylyylylVar = this.uu0075u00750075u;
        if (ylyylylVar != null) {
            jSONArrayNn006Ennn006E = ylyylylVar.k006Bk006B006B006B006B(jSONArrayNn006Ennn006E);
            int i = ff00660066006600660066f;
            if (((f006600660066006600660066f + i) * i) % fffffff0066 != ff0066ffff0066) {
                ff00660066006600660066f = f0066fffff0066();
                ff0066ffff0066 = f0066fffff0066();
            }
        }
        odddodd odddoddVar = this.u00750075u00750075u;
        if (odddoddVar != null) {
            jSONArrayNn006Ennn006E = odddoddVar.ss0073s00730073s(jSONArrayNn006Ennn006E);
        }
        return jSONArrayNn006Ennn006E.toString();
    }

    public void onPause() throws Exception {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("R\u00113G\u001a,M?0Ji\u0002<@Lp", (char) (ylyylll.r0072rrr00720072() ^ (-1691741210)), (char) (yllylll.r007200720072r00720072() ^ (-1146716883)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), uuxuuuu.pppp0070ppp("YY<NcbU", (char) (yylylll.r0072r0072r00720072() ^ (-1349847270)), (char) (yyyllll.rrrr007200720072() ^ 383821870)));
        this.u0075uu00750075u.nnn006E006E006E006E();
        ylyylyl ylyylylVar = this.uu0075u00750075u;
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != 0) {
            ff00660066006600660066f = f0066fffff0066();
            ff0066ffff0066 = f0066fffff0066();
        }
        if (ylyylylVar != null) {
            this.uu0075u00750075u.r0072r0072r0072r();
        }
    }

    public void onResume() throws Exception {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("*KX/N\u000f\u000fol\nUJW\u0006\u0015e", (char) (yyyllll.rrrr007200720072() ^ 383822012), (char) (ylyylll.r0072rrr00720072() ^ (-1691741212)), (char) (yyyllll.rrrr007200720072() ^ 383821867)), uuxuuuu.pppp0070ppp("\u0001\u0001ey\t\f\u0005}", (char) (yylylll.r0072r0072r00720072() ^ (-1349847102)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))));
        BehavioButtonTouchListener behavioButtonTouchListener = this.u0075uu00750075u;
        if ((f0066fffff0066() * (f0066fffff0066() + f006600660066006600660066f)) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 86;
            ff0066ffff0066 = f0066fffff0066();
        }
        behavioButtonTouchListener.nnnnn006E006E();
        ylyylyl ylyylylVar = this.uu0075u00750075u;
        if (ylyylylVar != null) {
            ylyylylVar.rrr0072r0072r();
        }
    }

    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        return this.u0075uu00750075u.onTouch(view, motionEvent);
    }

    public void registerButton(@NonNull View view, int i) {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("@bd\\pbg9kihb`D4:", (char) (ylyylll.r0072rrr00720072() ^ (-1691741278)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741280)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332)));
        StringBuilder sb = new StringBuilder();
        if ((f0066fffff0066() * (f0066fffff0066() + f006600660066006600660066f)) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 43;
            ff0066ffff0066 = 6;
        }
        sb.append(uuxuuuu.pp0070p0070ppp("l.n1yKzHVZ\u0018X\u0012aQ", (char) (yylylll.r0072r0072r00720072() ^ (-1349847157)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847220)), (char) (yyyllll.rrrr007200720072() ^ 383821868)));
        sb.append(view.toString());
        sb.append(uuxuuuu.pp0070p0070ppp("U@`j&", (char) (yylylll.r0072r0072r00720072() ^ (-1349847226)), (char) (yllylll.r007200720072r00720072() ^ (-1146716828)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))));
        sb.append((char) i);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        this.u0075uu00750075u.nn006En006En006E(view, i);
    }

    public void registerClearButton(@NonNull View view) {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("\u0017;?9OCJ\u001eRRSOO5'/", (char) (ylyylll.r0072rrr00720072() ^ (-1691741239)), (char) (yyyllll.rrrr007200720072() ^ 383822048), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), uuxuuuu.pp0070p0070ppp("\u001chi\u0016}y\u0019\u007f?#y`0Y{5#x6Q", (char) (yylylll.r0072r0072r00720072() ^ (-1349847077)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847207)), (char) (yyyllll.rrrr007200720072() ^ 383821868)) + view.toString());
        this.u0075uu00750075u.nnn006E006En006E(view);
        int i = 2;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                ff00660066006600660066f = f0066fffff0066();
                try {
                    throw null;
                } catch (Exception unused2) {
                    ff00660066006600660066f = 32;
                    while (true) {
                        try {
                            i /= 0;
                        } catch (Exception unused3) {
                            ff00660066006600660066f = f0066fffff0066();
                            return;
                        }
                    }
                }
            }
        }
    }

    public void registerDeleteButton(@NonNull View view) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("9[]Ui[`2dba[Y=-3", (char) (yllylll.r007200720072r00720072() ^ (-1146716790)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333)));
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 21;
            ff0066ffff0066 = f0066fffff0066();
        }
        LogBridge.d(strPppp0070ppp, uuxuuuu.pppp0070ppp("\u000f\u0003\u0006\t\u0014\u0016\b\u0016h\u000b\u0013\r\u001d\u000fl!!\"\u001e\u001eP", (char) (ylyylll.r0072rrr00720072() ^ (-1691741323)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))) + view.toString());
        this.u0075uu00750075u.n006En006E006En006E(view);
    }

    public void registerField(@NonNull TextView textView, @NonNull String str, @NonNull String str2) {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("(JLDXJO!SQPJH,\u001c\"", (char) (yyyllll.rrrr007200720072() ^ 383821970), (char) (yllylll.r007200720072r00720072() ^ (-1146716841)), (char) (yyyllll.rrrr007200720072() ^ 383821869));
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pp0070p0070ppp("'L\u0007\u001eb\u0014\"aM&\\s)\u0017\u0004&Qv2S`1!", (char) (yllylll.r007200720072r00720072() ^ (-1146716870)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847132)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))));
        sb.append(textView.getId());
        sb.append(uuxuuuu.pppp0070ppp(":", (char) (yyyllll.rrrr007200720072() ^ 383822048), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
        sb.append(textView.toString());
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741440));
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != 0) {
            ff00660066006600660066f = 18;
            f006600660066006600660066f = f0066fffff0066();
        }
        sb.append(uuxuuuu.pppp0070ppp("s;EIw\u007f", cR0072rrr00720072, (char) (iRrrr007200720072 ^ 383821859)));
        sb.append(str);
        sb.append(uuxuuuu.pppp0070ppp("7\u0005", (char) (yyyllll.rrrr007200720072() ^ 383821988), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))));
        sb.append(str2);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        this.u0075uu00750075u.n006E006E006E006En006E(textView, str, str2, true);
    }

    public void registerTarget(int i, @NonNull String str, @NonNull String str2) {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("+7\u001da\f\"4G\f\u001e1\u0018;R\u001a\r", (char) (yylylll.r0072r0072r00720072() ^ (-1349847142)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847101)), (char) (yyyllll.rrrr007200720072() ^ 383821865));
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pppp0070ppp("7)*+<<,8!-=16Dn79\u000e", (char) (yylylll.r0072r0072r00720072() ^ (-1349847247)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))));
        sb.append(i);
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("2", (char) (yylylll.r0072r0072r00720072() ^ (-1349847072)), (char) (yyyllll.rrrr007200720072() ^ 383821864));
        int i2 = ff00660066006600660066f;
        if (((f006600660066006600660066f + i2) * i2) % f00660066ffff0066() != ff0066ffff0066) {
            ff00660066006600660066f = 46;
            ff0066ffff0066 = 96;
        }
        sb.append(strPppp0070ppp);
        sb.append(str);
        sb.append(uuxuuuu.pppp0070ppp("<", (char) (yyyllll.rrrr007200720072() ^ 383821951), (char) (383821865 ^ yyyllll.rrrr007200720072())));
        sb.append(str2);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        this.u0075uu00750075u.n006Ennn006E006E(i, str, str2);
    }

    public void removeFeature(@NonNull String... strArr) {
        LogBridge.d(uuxuuuu.pppp0070ppp("\r15/E9@\u0014HHIEE+\u001d%", (char) (yyyllll.rrrr007200720072() ^ 383821838), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))), uuxuuuu.pppp0070ppp("XUF#NKM=>N,=EIDF\u0019AC=0Bl", (char) (ylyylll.r0072rrr00720072() ^ (-1691741276)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + Arrays.toString(strArr));
        this.u0075uu00750075u.nn006Enn006E006E(strArr);
    }

    public boolean setCurrentTarget(@NonNull String str) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("A2xY>\u0007!\u0013\nlbC\u0012xYF", (char) (ylyylll.r0072rrr00720072() ^ (-1691741226)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785)));
        StringBuilder sb = new StringBuilder();
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716780));
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != 0) {
            ff00660066006600660066f = f0066fffff0066();
            f006600660066006600660066f = f0066fffff0066();
        }
        sb.append(uuxuuuu.pp0070p0070ppp("9^w26qO\tJn>W&cU3!Hpm\fv\u001a\u0006aO;O", cR007200720072r00720072, (char) (yylylll.r0072r0072r00720072() ^ (-1349847293)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))));
        sb.append(str);
        LogBridge.d(strPppp0070ppp, sb.toString());
        return this.u0075uu00750075u.setCurrentTarget(str);
    }

    public void setOverlayViewGroup(@NonNull ViewGroup viewGroup) {
        ylyylyl ylyylylVar = this.uu0075u00750075u;
        if (ylyylylVar == null) {
            return;
        }
        ylyylylVar.r00720072rr0072r(viewGroup);
        try {
            throw null;
        } catch (Exception unused) {
            ff00660066006600660066f = 97;
        }
    }

    public void setPageName(@NonNull String str) {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("\"DF>RDI\u001bMKJDB&\u0016\u001c", (char) (ylyylll.r0072rrr00720072() ^ (-1691741328)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), uuxuuuu.pppp0070ppp("\u000b{\ndtyv^\u0001\f\u0003<", (char) (ylyylll.r0072rrr00720072() ^ (-1691741439)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))) + str);
        this.u0075uu00750075u.n006E006E006En006E006E(str);
    }

    public void setTargetPageDefinition(@NonNull String str, int i) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("n\u0013\u0017\u0011'\u001b\"u**+''\r~\u0007", (char) (yyyllll.rrrr007200720072() ^ 383821971), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053)));
        StringBuilder sb = new StringBuilder();
        int i2 = ff00660066006600660066f;
        if (((f006600660066006600660066f + i2) * i2) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 67;
            ff0066ffff0066 = 10;
        }
        sb.append(uuxuuuu.pppp0070ppp("\u0007y\njx\u000b\u0001\u007f\u0010l~\u0006\u0005d\u0007\t\r\u0013\u000f\u001b\u0011\u0018\u0018J", (char) (yyyllll.rrrr007200720072() ^ 383821936), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))));
        sb.append(str);
        sb.append(uuxuuuu.pppp0070ppp("H;", (char) (yyyllll.rrrr007200720072() ^ 383821834), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
        sb.append(i);
        LogBridge.d(strPppp0070ppp, sb.toString());
        this.u0075uu00750075u.nnnn006E006E006E(str, i);
    }

    public void switchTarget(int i) {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("Cgke{ovJ~~\u007f{{aS[", (char) (ylyylll.r0072rrr00720072() ^ (-1691741298)), (char) (yyyllll.rrrr007200720072() ^ 383821900), (char) (yyyllll.rrrr007200720072() ^ 383821866));
        StringBuilder sb = new StringBuilder();
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i2 = ff00660066006600660066f;
        if (((f006600660066006600660066f + i2) * i2) % fffffff0066 != ffff0066ff0066()) {
            ff00660066006600660066f = f0066fffff0066();
            ff0066ffff0066 = f0066fffff0066();
        }
        sb.append(uuxuuuu.pp0070p0070ppp("\u001a\u001d\u000e\u0018\u0006\nt\u0001\u0011\u0005\u0002\u0010:", (char) (iR0072r0072r00720072 ^ (-1349847052)), (char) (yllylll.r007200720072r00720072() ^ (-1146716837)), (char) (yyyllll.rrrr007200720072() ^ 383821869)));
        sb.append(i);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        this.u0075uu00750075u.n006Enn006E006E006E(i);
    }

    public void turnOffDebugMessages() {
        Context context = this.uuuu00750075u;
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != 0) {
            ff00660066006600660066f = 55;
            ff0066ffff0066 = f0066fffff0066();
        }
        LogBridge.init(context, Integer.MAX_VALUE);
    }

    public void turnOffTextFieldFilling() {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("\u000f13+?16\b:871/\u0013\u0003\t", (char) (yyyllll.rrrr007200720072() ^ 383821882), (char) (yllylll.r007200720072r00720072() ^ (-1146716789)));
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741387));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != ffff0066ff0066()) {
            ff00660066006600660066f = f0066fffff0066();
            ff0066ffff0066 = 3;
        }
        LogBridge.d(strPppp0070ppp, uuxuuuu.pp0070p0070ppp("QB\u001dsTc-@H!k;\u0007*\u001dE(){\u0010{ny", cR0072rrr00720072, (char) (iR0072r0072r00720072 ^ (-1349847225)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
        this.u0075uu00750075u.nn006En006E006E006E();
    }

    public void turnOnDebugMessages() {
        Context context = this.uuuu00750075u;
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 24;
            ff0066ffff0066 = f0066fffff0066();
        }
        LogBridge.init(context);
    }

    public void turnOnTextFieldFilling() {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("e\n\u000e\b\u001e\u0012\u0019l!!\"\u001e\u001e\u0004u}", (char) (ylyylll.r0072rrr00720072() ^ (-1691741381)), (char) (yllylll.r007200720072r00720072() ^ (-1146716858)), (char) (yyyllll.rrrr007200720072() ^ 383821864));
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != 0) {
            ff00660066006600660066f = f0066fffff0066();
            ff0066ffff0066 = f0066fffff0066();
        }
        LogBridge.d(strPp0070p0070ppp, uuxuuuu.pppp0070ppp("PPLG'E*:LG\u0018:5;2\u001357626.", (char) (iR0072rrr00720072 ^ (-1691741339)), (char) (yyyllll.rrrr007200720072() ^ 383821865)));
        this.u0075uu00750075u.n006E006En006E006E006E();
    }

    public void useCompactSensorFormat(boolean z) {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("I}Q*-\u00051&YJ\u0004H7b6\u001d", (char) (yllylll.r007200720072r00720072() ^ (-1146716786)), (char) (yllylll.r007200720072r00720072() ^ (-1146716855)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056)));
        StringBuilder sb = new StringBuilder();
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821838);
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741349));
        int iR007200720072r00720072 = (-1146716786) ^ yllylll.r007200720072r00720072();
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 59;
            ff0066ffff0066 = f0066fffff0066();
        }
        sb.append(uuxuuuu.pp0070p0070ppp("\u001b\u000b'w^N{_\u001c_(lp(\u000eCQm\u001b\b6<\u0012", cRrrr007200720072, cR0072rrr00720072, (char) iR007200720072r00720072));
        sb.append(z);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        this.u0075uu00750075u.n006En006E006E006E006E(z);
    }

    public void addToVersionObject(@NonNull String str, @NonNull String str2) throws JSONException, IllegalArgumentException {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("7\u0002rS@\u0001+\r\u007f\u0003|Y\u0004fs\\", (char) (yylylll.r0072r0072r00720072() ^ (-1349847242)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329)));
        StringBuilder sb = new StringBuilder();
        int i = ff00660066006600660066f;
        if (((f006600660066006600660066f + i) * i) % fffffff0066 != ff0066ffff0066) {
            ff00660066006600660066f = 7;
            ff0066ffff0066 = f0066fffff0066();
        }
        sb.append(uuxuuuu.pppp0070ppp("\u0007\u000b\bx\u0011x\u0005\u0013!\u0018\u001b\u001bx\r\u0012\u000e\u0019+S", (char) (yylylll.r0072r0072r00720072() ^ (-1349847253)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800))));
        sb.append(str);
        sb.append(uuxuuuu.pppp0070ppp("\u000b\u007f", (char) (yyyllll.rrrr007200720072() ^ 383822040), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))));
        sb.append(str2);
        LogBridge.d(strPppp0070ppp, sb.toString());
        this.u0075uu00750075u.n006Ennn006En(str, str2);
    }

    public void registerField(@NonNull TextView textView, @NonNull String str, @NonNull String str2, boolean z) {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("Hlpj\u0001t{O\u0004\u0004\u0005\u0001\u0001fX`", (char) (ylyylll.r0072rrr00720072() ^ (-1691741203)), (char) (yllylll.r007200720072r00720072() ^ (-1146716681)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)));
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pp0070p0070ppp("2$%&//\u001f+} \u001b!\u0018R&\u0012\"\u0016\u0013!t\u000fc", (char) (yllylll.r007200720072r00720072() ^ (-1146716814)), (char) (yyyllll.rrrr007200720072() ^ 383821847), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))));
        sb.append(textView.getId());
        sb.append(uuxuuuu.pppp0070ppp("O", (char) (yylylll.r0072r0072r00720072() ^ (-1349847221)), (char) (yyyllll.rrrr007200720072() ^ 383821866)));
        sb.append(textView.toString());
        int iF0066fffff0066 = f0066fffff0066();
        if (((f006600660066006600660066f + iF0066fffff0066) * iF0066fffff0066) % fffffff0066 != 0) {
            ff00660066006600660066f = 23;
            f006600660066006600660066f = f0066fffff0066();
        }
        sb.append(uuxuuuu.pppp0070ppp("\\$.2`h", (char) (yyyllll.rrrr007200720072() ^ 383821847), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))));
        sb.append(str);
        sb.append(uuxuuuu.pppp0070ppp("Rf", (char) (yllylll.r007200720072r00720072() ^ (-1146716893)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))));
        sb.append(str2);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        this.u0075uu00750075u.n006E006E006E006En006E(textView, str, str2, z);
    }
}
