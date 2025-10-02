package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.behaviosec.rl.android.BehavioSecClient;
import com.behaviosec.rl.android.BehavioSecCollector;
import com.behaviosec.rl.android.FlutterJavaInterfaceException;
import com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxlxlx;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public final class xxlxllx {
    private static boolean b00620062b0062bb = false;
    private static final String b0062bb0062bb;
    private static boolean bb0062b0062bb = false;
    public static final String bbb00620062bb;
    public static int p00700070pppp = 1;
    public static int p0070ppppp = 88;
    public static int pp0070pppp = 0;
    public static int ppp0070ppp = 2;
    private Context b0062b00620062bb = null;
    private Handler bb006200620062bb = null;
    private xxxlllx b0062006200620062bb = null;

    public interface xlllllx {
    }

    public interface xlllxxl {
    }

    public interface xllxxxl {
    }

    public interface xlxlllx {
    }

    public interface xlxlxxl {
    }

    public interface xlxxlxl {
    }

    public interface xlxxxxl {
    }

    public interface xxllllx {
    }

    public interface xxllxxl {
    }

    public interface xxlxxxl {
    }

    public static final class xxxlllx implements Application.ActivityLifecycleCallbacks {
        public static int p007000700070p0070p = 2;
        public static int p0070p0070p0070p = 0;
        public static int pp00700070p0070p = 1;
        public static int ppp0070p0070p = 70;
        private Activity b0062bbb0062b = null;

        public static int pppp00700070p() {
            return 86;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.b0062bbb0062b == null) {
                this.b0062bbb0062b = activity;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            this.b0062bbb0062b = activity;
            try {
                throw null;
            } catch (Exception unused) {
                ppp0070p0070p = 12;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            this.b0062bbb0062b = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        public Activity t0074t0074t00740074() {
            return this.b0062bbb0062b;
        }

        public void tt00740074t00740074(@Nonnull Activity activity) {
            int i = ppp0070p0070p;
            if (((pp00700070p0070p + i) * i) % p007000700070p0070p != p0070p0070p0070p) {
                ppp0070p0070p = 39;
                p0070p0070p0070p = pppp00700070p();
            }
            this.b0062bbb0062b = activity;
        }
    }

    public interface xxxlxxl {
    }

    public interface xxxxlxl {
    }

    public interface xxxxxxl {
    }

    static {
        char cRrr007200720072r = (char) (jkkkjjj.rrr007200720072r() ^ 1252464161);
        if ((p0070p0070ppp() * (p0070p0070ppp() + p00700070pppp)) % ppp0070ppp != pp0070pppp) {
            p0070ppppp = p0070p0070ppp();
            pp0070pppp = 94;
        }
        bbb00620062bb = xlxllxl.r0072r0072r0072r("]^RbXPi]aWKdFLQNESPF?N", cRrr007200720072r, (char) (jkkkjjj.rrr007200720072r() ^ 1252464209));
        b0062bb0062bb = xlxlxlx.t0074tt0074t0074(xxlxllx.class);
        bb0062b0062bb = false;
        b00620062b0062bb = false;
    }

    public static int p0070p00700070pp() {
        return 2;
    }

    public static int p0070p0070ppp() {
        return 91;
    }

    public static int pp00700070ppp() {
        return 1;
    }

    public static /* synthetic */ String t007400740074t00740074() {
        int i = 2;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                p0070ppppp = p0070p0070ppp();
                return b0062bb0062bb;
            }
        }
    }

    public static /* synthetic */ boolean tttt007400740074(boolean z) {
        int i = p0070ppppp;
        if (((p00700070pppp + i) * i) % ppp0070ppp != 0) {
            p0070ppppp = p0070p0070ppp();
            pp0070pppp = 46;
        }
        b00620062b0062bb = z;
        return z;
    }

    public xxxxlxl r007200720072rrr(Activity activity, String str) {
        xxxlllx xxxlllxVar;
        if (activity == null && (xxxlllxVar = this.b0062006200620062bb) != null && xxxlllxVar.t0074t0074t00740074() != null) {
            activity = this.b0062006200620062bb.t0074t0074t00740074();
        }
        if (activity == null) {
            return null;
        }
        BehavioSecClient.setPageName(activity, str);
        return null;
    }

    public xxxlxxl r00720072rrrr(String str, String str2, String str3, Activity activity) {
        xxxlllx xxxlllxVar;
        if (activity == null && (xxxlllxVar = this.b0062006200620062bb) != null && xxxlllxVar.t0074t0074t00740074() != null) {
            int i = p0070ppppp;
            if (((p00700070pppp + i) * i) % p0070p00700070pp() != pp0070pppp) {
                p0070ppppp = 42;
                pp0070pppp = p0070p0070ppp();
            }
            activity = this.b0062006200620062bb.t0074t0074t00740074();
        }
        if (activity == null) {
            return null;
        }
        BehavioSecClient.keyboardTargetTextChanged(str, str2, str3, activity);
        return null;
    }

    public xxllxxl r0072r0072rrr() {
        String str = b0062bb0062bb;
        char cRrr007200720072r = (char) (jkkkjjj.rrr007200720072r() ^ 1252464274);
        int iRrr007200720072r = jkkkjjj.rrr007200720072r();
        int i = p0070ppppp;
        if (((p00700070pppp + i) * i) % ppp0070ppp != 0) {
            p0070ppppp = p0070p0070ppp();
            pp0070pppp = 72;
        }
        xlxlxlx.xxllxlx.d(str, xlxllxl.r0072r0072r0072r("~q{rQuys\n}\u0005i|{]{\u0010}=\b\u0013@\u0005\u0004\u0010\u0011\u000b\u000b", cRrr007200720072r, (char) (iRrr007200720072r ^ 1252464213)));
        xxxlllx xxxlllxVar = this.b0062006200620062bb;
        if (xxxlllxVar == null || xxxlllxVar.t0074t0074t00740074() == null) {
            return null;
        }
        BehavioSecClient.sendData(this.b0062006200620062bb.t0074t0074t00740074());
        return null;
    }

    public xxlxxxl r0072rrrrr(int i, List<Long> list) {
        int i2 = p0070ppppp;
        if (((p00700070pppp + i2) * i2) % ppp0070ppp != pp0070pppp) {
            p0070ppppp = 19;
            pp0070pppp = p0070p0070ppp();
        }
        list.add(xxxlxlx.tt00740074tt0074(i));
        return null;
    }

    public xlllxxl rr00720072rrr(String str, String str2, Activity activity) {
        xxxlllx xxxlllxVar;
        if (activity == null && (xxxlllxVar = this.b0062006200620062bb) != null && xxxlllxVar.t0074t0074t00740074() != null) {
            activity = this.b0062006200620062bb.t0074t0074t00740074();
        }
        if (activity == null) {
            return null;
        }
        BehavioSecClient.setCurrentKeyboardTarget(str, str2, activity);
        return null;
    }

    public xllxxxl rr0072rrrr(List<String> list) {
        char cR00720072rrr0072 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858770);
        char cRrrrrr0072 = (char) (jjjjkjj.rrrrrr0072() ^ 2074272517);
        int i = p0070ppppp;
        if (((p00700070pppp + i) * i) % ppp0070ppp != pp0070pppp) {
            p0070ppppp = 75;
            pp0070pppp = 8;
        }
        list.add(xlxllxl.r0072r0072r0072r("M*1^\u0006)+\u0001B]X\r\u001c\u001d7Sq\u000bQ,bC", cR00720072rrr0072, cRrrrrr0072));
        return null;
    }

    public xlxlxxl rrr0072rrr(String str, boolean z, Activity activity) throws Exception {
        xxxlllx xxxlllxVar;
        if (activity == null && (xxxlllxVar = this.b0062006200620062bb) != null && xxxlllxVar.t0074t0074t00740074() != null) {
            activity = this.b0062006200620062bb.t0074t0074t00740074();
        }
        if (activity == null) {
            return null;
        }
        try {
            BehavioSecClient.registerKeyboardTarget(str, z, activity);
            return null;
        } catch (FlutterJavaInterfaceException e) {
            String str2 = b0062bb0062bb;
            StringBuilder sb = new StringBuilder();
            sb.append(xlxllxl.r0072r0072r0072r("\u0015I58DI?FF\u0013y", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105917), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105816)));
            int i = p0070ppppp;
            if (((p00700070pppp + i) * i) % ppp0070ppp != 0) {
                p0070ppppp = p0070p0070ppp();
                pp0070pppp = p0070p0070ppp();
            }
            sb.append(e.getMessage());
            sb.append(xlxllxl.r0072r0072r0072r("(\u001d", (char) (jkkkjjj.rrr007200720072r() ^ 1252464300), (char) (jkkkjjj.rrr007200720072r() ^ 1252464223)));
            sb.append(e.getErrorCode().getMessage());
            xlxlxlx.xxllxlx.d(str2, sb.toString());
            return null;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public xlxxlxl rrrr0072rr(Map<String, Object> map, Map<String, String> map2) {
        String str;
        char cRr0072rrr0072;
        char cR00720072rrr0072;
        String str2;
        String strR0072r0072r0072r;
        if (b00620062b0062bb) {
            Handler handler = this.bb006200620062bb;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            BehavioSecClient.stopCollection();
            b00620062b0062bb = false;
        }
        xlllxlx xlllxlxVar = new xlllxlx();
        xlllxlxVar.ttt00740074t0074(map);
        if (xlllxlxVar.t00740074t0074t0074()) {
            if (xlllxlxVar.vvvv0076v0076 == 0 || (xlllxlxVar.vvv0076vv0076 == 0 && xlllxlxVar.vvvvvv0076 == 0)) {
                str = b0062bb0062bb;
                cRr0072rrr0072 = (char) (jkjjkjj.rr0072rrr0072() ^ 1132105872);
                cR00720072rrr0072 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858859);
                str2 = ",HQUOO\fa]\u000fceSeh\u0015Yfde_^pflf ckrqjzyql*tzs}\u0002}r\u0007|\u0004\u0004B7Z\u0003\n\t\u0002\u0012\u0011\t\u0004A\t\t\u0006\u001a\u001c\u001a\u000eI\u0014\u001fL\u0012\u0018#\u0012\u0014\u001f\u0019\u0019";
            } else {
                long j = xlllxlxVar.vv0076007600760076v;
                if ((72061923364962304L & j) != 0 || (j & 60129542144L) != 0) {
                    if (!b00620062b0062bb) {
                        BehavioSecCollector.Builder builderDisableContextDataCollection = BehavioSecCollector.builder().sendInChunks(new xxlxxlx(xlllxlxVar), xlllxlxVar.vvvv0076v0076).setAdvancedConfig(xlllxlxVar.vv0076007600760076v, true).disableDeviceDataCollection().disableLocationCollection().disableContextDataCollection();
                        if ((xlllxlxVar.vv0076007600760076v & 25769803776L) == 0) {
                            builderDisableContextDataCollection.disableTouchDataCollection();
                        }
                        if ((xlllxlxVar.vv0076007600760076v & 34359738368L) == 0) {
                            builderDisableContextDataCollection.disableKeyboardDataCollection();
                        }
                        Set<String> set = xlllxlxVar.vvvvv00760076;
                        if (set != null && !set.isEmpty()) {
                            builderDisableContextDataCollection.withIncludedActivities(xlllxlxVar.vvvvv00760076);
                            builderDisableContextDataCollection.withoutSendingActivities(xlllxlxVar.vvvvv00760076);
                        }
                        if (xlllxlxVar.v0076v007600760076v) {
                            builderDisableContextDataCollection.useAnonymousMaskedCollection();
                        }
                        Set<String> set2 = xlllxlxVar.v0076vvv00760076;
                        if (set2 != null && !set2.isEmpty()) {
                            xlxlxlx.xxllxlx.d(b0062bb0062bb, xlxllxl.r007200720072r0072r("3PEIAxKFC:s@3D;42l24/5,:e", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105897), (char) (jjjjkjj.rrrrrr0072() ^ 2074272597), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105823)) + xlllxlxVar.v0076vvv00760076.toString());
                            builderDisableContextDataCollection.withMaskedFields(xlllxlxVar.v0076vvv00760076);
                        }
                        if (xlllxlxVar.vv0076vv00760076) {
                            builderDisableContextDataCollection.enableInjectJavascriptCollector();
                        }
                        String str3 = xlllxlxVar.v00760076vv00760076;
                        if (str3 != null) {
                            builderDisableContextDataCollection.withWebFieldIdentifierAttribute(str3);
                        }
                        Activity activityT0074t0074t00740074 = this.b0062006200620062bb.t0074t0074t00740074();
                        int i = p0070ppppp;
                        if (((pp00700070ppp() + i) * i) % ppp0070ppp != 0) {
                            p0070ppppp = 74;
                            pp0070pppp = p0070p0070ppp();
                        }
                        Activity activity = xlllxlxVar.vvv0076v00760076;
                        if (activity != null) {
                            this.b0062006200620062bb.tt00740074t00740074(activity);
                            activityT0074t0074t00740074 = activity;
                        }
                        BehavioSecClient.startCollection(builderDisableContextDataCollection.build(), (Application) this.b0062b00620062bb.getApplicationContext(), activityT0074t0074t00740074);
                        b00620062b0062bb = true;
                        long jMax = Math.max(xlllxlxVar.vvv0076vv0076, xlllxlxVar.vvvvvv0076);
                        this.bb006200620062bb = new Handler(Looper.getMainLooper());
                        this.bb006200620062bb.postDelayed(new Runnable() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xxlxllx.1
                            @Override // java.lang.Runnable
                            public void run() {
                                xlxlxlx.xxllxlx.d(xxlxllx.t007400740074t00740074(), xlxllxl.r0072r0072r0072r("\u001fAC;WIN1:7r6:L8u0;7663C742b5=776b`5\u001anaw\u001eYieSmafd\r^PKTXTR\u0013", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105856), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105810)));
                                BehavioSecClient.stopCollection();
                                xxlxllx.tttt007400740074(false);
                                try {
                                    throw null;
                                } catch (Exception unused) {
                                }
                            }
                        }, jMax * 1000);
                    }
                    return null;
                }
                str = b0062bb0062bb;
                cRr0072rrr0072 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858832);
                cR00720072rrr0072 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858853);
                str2 = "K,Hm!LWC\n\u001akN\u000b\u0016\u0010\u001924xt)~aZ[,F:7\u000flD;\u001fG~\u001fPvXi\u0014^8E*FlXo*\u001f\rZ\u0012`Xu\u001bU8X\u0002'Oh\u001b\t\u0001\u000f:V:!`PB\u001e|";
            }
            strR0072r0072r0072r = xlxllxl.r0072r0072r0072r(str2, cRr0072rrr0072, cR00720072rrr0072);
        } else {
            str = b0062bb0062bb;
            strR0072r0072r0072r = xlxllxl.r007200720072r0072r("|\u0019\"&  \\2._46$69e*7560/A7=7p4<CB;KJB=zEKDNRNCWMTT\u0013\b2XaMYWS\u0010TaaZ^]", (char) (jjjjkjj.rrrrrr0072() ^ 2074272591), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858759), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105821));
        }
        xlxlxlx.xxllxlx.e(str, strR0072r0072r0072r);
        return null;
    }

    public xlllllx t00740074t007400740074(Activity activity) {
        xxxlllx xxxlllxVar;
        if (activity == null && (xxxlllxVar = this.b0062006200620062bb) != null && xxxlllxVar.t0074t0074t00740074() != null) {
            activity = this.b0062006200620062bb.t0074t0074t00740074();
            int i = 1;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused) {
                    p0070ppppp = p0070p0070ppp();
                }
            }
        }
        if (activity == null) {
            return null;
        }
        BehavioSecClient.clearRegistrations(activity);
        return null;
    }

    public xlxxxxl t0074t0074007400740074(Set<String> set) {
        try {
            throw null;
        } catch (Exception unused) {
            p0070ppppp = 41;
            return null;
        }
    }

    public xlxlllx t0074tt007400740074() {
        BehavioSecClient.stopCollection();
        return null;
    }

    public Map<String, Object> tt00740074007400740074() throws SecurityException {
        char cRrr007200720072r;
        char cRrr007200720072r2;
        String str;
        char cRrr007200720072r3;
        char cRrr007200720072r4;
        char cRrrrrr0072;
        String str2;
        String strR0072r0072r0072r;
        HashMap map = new HashMap();
        map.put(xlxllxl.r007200720072r0072r("\u001e}\u0013]2U'\u0003+?R9NV", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105917), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858755), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105817)), this);
        int i = 4;
        for (Method method : xxlxllx.class.getDeclaredMethods()) {
            if (method.getReturnType().isAssignableFrom(xllxxxl.class)) {
                cRrr007200720072r3 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858840);
                cRrr007200720072r4 = (char) (jkjjkjj.rr0072rrr0072() ^ 1132105964);
                cRrrrrr0072 = (char) (jjjjkjj.rrrrrr0072() ^ 2074272514);
                str2 = "UTdEkcY=We\\e_m";
            } else {
                if (method.getReturnType().isAssignableFrom(xxxxxxl.class)) {
                    strR0072r0072r0072r = xlxllxl.r007200720072r0072r("aljac`mi[=UaV]Ua", (char) (jkkkjjj.rrr007200720072r() ^ 1252464221), (char) (jkkkjjj.rrr007200720072r() ^ 1252464291), (char) (1252464214 ^ jkkkjjj.rrr007200720072r()));
                } else if (method.getReturnType().isAssignableFrom(xlxxlxl.class)) {
                    cRrr007200720072r3 = (char) (jjjjkjj.rrrrrr0072() ^ 2074272675);
                    cRrr007200720072r4 = (char) (jkkkjjj.rrr007200720072r() ^ 1252464134);
                    cRrrrrr0072 = (char) (jkkkjjj.rrr007200720072r() ^ 1252464209);
                    str2 = "\u001cmhJ_}+\u0011\r?}KZ&4\u0014\u001cr\u007f*V28\u0013\u001bx";
                } else {
                    if (method.getReturnType().isAssignableFrom(xlxlllx.class)) {
                        cRrr007200720072r = (char) (jkkkjjj.rrr007200720072r() ^ 1252464331);
                        cRrr007200720072r2 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858856);
                        str = "\u0002\u0001\u000f\u0005\b\u0010l\u0007\u0015\f\u0015\u000f\u001d";
                    } else if (method.getReturnType().isAssignableFrom(xxlxxxl.class)) {
                        cRrr007200720072r = (char) (jkjjkjj.rr0072rrr0072() ^ 1132105824);
                        cRrr007200720072r2 = (char) (jkjjkjj.rr0072rrr0072() ^ 1132105823);
                        str = ";<0@6.\u0015,:&($6\"\b ,!( ,";
                    } else if (method.getReturnType().isAssignableFrom(xlxxxxl.class)) {
                        cRrr007200720072r = (char) (jkkkjjj.rrr007200720072r() ^ 1252464288);
                        cRrr007200720072r2 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858857);
                        str = "\u007f|\u000bYy\u0002{vt_s\u007fyt}|qvtxLdpeldp";
                    } else if (method.getReturnType().isAssignableFrom(xxllxxl.class)) {
                        cRrr007200720072r3 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858884);
                        cRrr007200720072r4 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858807);
                        cRrrrrr0072 = (char) (jkkkjjj.rrr007200720072r() ^ 1252464211);
                        str2 = "\u0004v\u0001wXv\u000bx`z\t\u007f\t\u0003\u0011";
                    } else {
                        if (method.getReturnType().isAssignableFrom(xxxxlxl.class)) {
                            map.put(xlxllxl.r007200720072r0072r("\u0006v\u0005_otqYkvmOgshogs", (char) (jjjjkjj.rrrrrr0072() ^ 2074272723), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105777), (char) (1132105823 ^ jkjjkjj.rr0072rrr0072())), method);
                            while (true) {
                                try {
                                    i /= 0;
                                } catch (Exception unused) {
                                    p0070ppppp = 79;
                                }
                            }
                        } else if (method.getReturnType().isAssignableFrom(xlllllx.class)) {
                            cRrr007200720072r3 = (char) (jkkkjjj.rrr007200720072r() ^ 1252464156);
                            cRrr007200720072r4 = (char) (jkkkjjj.rrr007200720072r() ^ 1252464272);
                            cRrrrrr0072 = (char) (jjjjkjj.rrrrrr0072() ^ 2074272519);
                            str2 = "\u0019_\u001cE\u001a7m=b*n\u0019M\u001c6\b,l\u0007K\u001eO{Br";
                        } else if (method.getReturnType().isAssignableFrom(xlxlxxl.class)) {
                            cRrr007200720072r = (char) (jjjjkjj.rrrrrr0072() ^ 2074272671);
                            cRrr007200720072r2 = (char) (jkjjkjj.rr0072rrr0072() ^ 1132105823);
                            str = "\u001e\u0010\u0011\u0012\u001b\u001b\u000b\u0017n\b\u001b\u0003\u000f\u007f\u0010\u0001o{\f\u007f|\u000b]u\u0002v}u\u0002";
                        } else if (method.getReturnType().isAssignableFrom(xxxlxxl.class)) {
                            cRrr007200720072r = (char) (jkkkjjj.rrr007200720072r() ^ 1252464140);
                            cRrr007200720072r2 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858863);
                            str = "\u0011\n\u001d\u0005\u0011\u0002\u0012\u0003q}\u000e\u0002~\rk{\u000e\tVzr~vsqTlxmtlx";
                        } else if (method.getReturnType().isAssignableFrom(xlllxxl.class)) {
                            cRrr007200720072r = (char) (jkkkjjj.rrr007200720072r() ^ 1252464253);
                            cRrr007200720072r2 = (char) (jjjjkjj.rrrrrr0072() ^ 2074272515);
                            str = "\u001d\u000e\u001ci\u001b\u0017\u0016\b\u0010\u0015j\u0004\u0017~\u000b{\f|kw\b{x\u0007Yq}ryq}";
                        } else if (method.getReturnType().isAssignableFrom(xxllllx.class)) {
                            cRrr007200720072r = (char) (jkkkjjj.rrr007200720072r() ^ 1252464327);
                            cRrr007200720072r2 = (char) (1252464214 ^ jkkkjjj.rrr007200720072r());
                            str = "Q[QN\\.][XLRY-HYCm`naN\\j`[k<V`W\\V@";
                        }
                    }
                    strR0072r0072r0072r = xlxllxl.r0072r0072r0072r(str, cRrr007200720072r, cRrr007200720072r2);
                }
                map.put(strR0072r0072r0072r, method);
            }
            strR0072r0072r0072r = xlxllxl.r007200720072r0072r(str2, cRrr007200720072r3, cRrr007200720072r4, cRrrrrr0072);
            map.put(strR0072r0072r0072r, method);
        }
        return map;
    }

    public xxllllx tt0074t007400740074(String str, String str2, Activity activity) {
        xxxlllx xxxlllxVar;
        if (activity == null && (xxxlllxVar = this.b0062006200620062bb) != null && xxxlllxVar.t0074t0074t00740074() != null) {
            activity = this.b0062006200620062bb.t0074t0074t00740074();
        }
        if (activity == null) {
            return null;
        }
        int i = p0070ppppp;
        if (((p00700070pppp + i) * i) % p0070p00700070pp() != 0) {
            p0070ppppp = p0070p0070ppp();
            pp0070pppp = p0070p0070ppp();
        }
        BehavioSecClient.unsetCurrentKeyboardTarget(str, str2, activity);
        return null;
    }

    public xxxxxxl ttt0074007400740074(@Nonnull Context context, Map<String, Object> map, List<String> list) throws Exception {
        try {
            Class.forName(xlxllxl.r0072r0072r0072r("_$\u0010,2~D\u001cZsj\"CQZq&&\u001fo(T{q\t(<\u001e$G|R-?OVk\u0015Ys|\u000e\t\u0015\u0019;#}M", (char) (jjjjkjj.rrrrrr0072() ^ 2074272766), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105818))).getMethod(xlxllxl.r007200720072r0072r(":{|\u0004\u0015\u007f\u0001\b\u0019\u0004\u0005\f\u001dG\t\n\u0011\"L", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105783), (char) (jjjjkjj.rrrrrr0072() ^ 2074272550), (char) (jjjjkjj.rrrrrr0072() ^ 2074272513)), null).invoke(null, null);
            if (bb0062b0062bb) {
                list.add(xlxllxl.r0072r0072r0072r("RNZbU", (char) (jkkkjjj.rrr007200720072r() ^ 1252464349), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105822)));
            } else {
                this.b0062b00620062bb = context;
                xxxlllx xxxlllxVar = new xxxlllx();
                this.b0062006200620062bb = xxxlllxVar;
                ((Application) context).registerActivityLifecycleCallbacks(xxxlllxVar);
                bb0062b0062bb = true;
                list.add(xlxllxl.r0072r0072r0072r("&%)\u001a", (char) (jjjjkjj.rrrrrr0072() ^ 2074272724), (char) (jkkkjjj.rrr007200720072r() ^ 1252464211)));
                int i = p0070ppppp;
                if (((p00700070pppp + i) * i) % ppp0070ppp != pp0070pppp) {
                    p0070ppppp = p0070p0070ppp();
                    pp0070pppp = p0070p0070ppp();
                }
            }
            return null;
        } catch (InvocationTargetException e) {
            throw e.getCause();
        } catch (Exception e2) {
            throw e2;
        }
    }
}
