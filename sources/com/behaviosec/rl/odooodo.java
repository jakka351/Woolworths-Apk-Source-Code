package com.behaviosec.rl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.behaviosec.rl.android.FlutterJavaInterfaceException;
import com.behaviosec.rl.android.IBehavioSecChunkConnector;
import com.behaviosec.rl.android.IBehavioSecConnector;
import com.behaviosec.rl.android.LogBridge;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class odooodo implements Application.ActivityLifecycleCallbacks {
    public static int f006600660066f0066ff = 1;
    public static int f00660066f00660066ff = 0;
    public static int f0066ff00660066ff = 59;
    public static int ffff00660066ff = 2;
    private static odooodo g0067g00670067g0067;
    private static final String ggg00670067g0067;
    private IBehavioSecConnector g0067006700670067g0067;
    public Activity g006700670067g00670067;
    private oddoodo gg006700670067g0067;
    public String gg00670067g00670067;
    private AtomicInteger gg0067gg00670067;
    private boolean ggg0067g00670067;
    private IBehavioSecChunkConnector ggggg00670067;
    private final WeakHashMap<Activity, oodddoo> g0067ggg00670067 = new WeakHashMap<>();
    private boolean g00670067gg00670067 = false;
    public final List<oodoodo> g0067g0067g00670067 = new ArrayList();

    public static class oodoodo {
        public static int f00660066006600660066ff = 71;
        public static int f0066ffff0066f = 1;
        public static int ff0066fff0066f = 2;
        private final boolean g0067gg006700670067;
        private final WeakReference<Activity> gg0067g006700670067;
        private final String gggg006700670067;

        public oodoodo(@NonNull String str, boolean z, @NonNull Activity activity) {
            this.gggg006700670067 = str;
            this.g0067gg006700670067 = z;
            this.gg0067g006700670067 = new WeakReference<>(activity);
        }

        public static int f00660066fff0066f() {
            return 80;
        }

        public static int ffffff0066f() {
            return 0;
        }

        public WeakReference<Activity> v00760076vv00760076() {
            WeakReference<Activity> weakReference = this.gg0067g006700670067;
            int i = f00660066006600660066ff;
            if (((f0066ffff0066f + i) * i) % ff0066fff0066f != ffffff0066f()) {
                f00660066006600660066ff = 93;
                f0066ffff0066f = f00660066fff0066f();
            }
            return weakReference;
        }

        public boolean v0076v0076v00760076() {
            int i = f00660066006600660066ff;
            if (((f0066ffff0066f + i) * i) % ff0066fff0066f != ffffff0066f()) {
                f00660066006600660066ff = f00660066fff0066f();
                f0066ffff0066f = 3;
            }
            return this.g0067gg006700670067;
        }

        public String vvv0076v00760076() {
            return this.gggg006700670067;
        }
    }

    static {
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741209));
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847166));
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821866);
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = 96;
            f00660066f00660066ff = 0;
        }
        ggg00670067g0067 = uuxuuuu.pp0070p0070ppp("`\u0005\t\u0003\u0019\r\u0014f\u0015\f\u001b\u0019\u0014\u0010\u007fqyx\u001e\"\u001f", cR0072rrr00720072, cR0072r0072r00720072, cRrrr007200720072);
    }

    private odooodo() {
        if (g0067g00670067g0067 != null) {
            return;
        }
        this.gg0067gg00670067 = new AtomicInteger(0);
    }

    private void c006300630063ccc(@NonNull Activity activity) throws Exception {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("\u0015!mQpM\u001cW\u000foG-1\u0016O*;\"\u0010}\u0004", (char) (yyyllll.rrrr007200720072() ^ 383821945), (char) (yllylll.r007200720072r00720072() ^ (-1146716831)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))), uuxuuuu.pppp0070ppp("\u0005w\u0002xVy\f\u0002\u0010\u0004\u0010\u0016a\u007f\u0014\u0002[B", (char) (yylylll.r0072r0072r00720072() ^ (-1349847069)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))) + this + uuxuuuu.pp0070p0070ppp("%\u0018", (char) (yllylll.r007200720072r00720072() ^ (-1146716907)), (char) (yyyllll.rrrr007200720072() ^ 383821885), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + activity);
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 == null) {
            return;
        }
        String strV0076vvvv0076 = oodddooVarV00760076v007600760076.v0076vvvv0076(activity);
        if (this.g0067006700670067g0067 == null || ContextCompat.a(activity, uuxuuuu.pppp0070ppp("U\bqe<\u0004\t\fyp}T\u007f\u0006\u001cq-D-^\u001fb_r\n\u001bM", (char) (yllylll.r007200720072r00720072() ^ (-1146716916)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785)))) != 0) {
            return;
        }
        String strPppp0070ppp = uuxuuuu.pppp0070ppp(":\\^Vj\\a2^S`\\UO=-30SUP", (char) (yllylll.r007200720072r00720072() ^ (-1146716764)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789)));
        StringBuilder sb = new StringBuilder();
        String strPppp0070ppp2 = uuxuuuu.pppp0070ppp("x\n\u0012\u0007\u000b\u000f\u0007>\u0002}\u0010{9~\u0007\t5", (char) (ylyylll.r0072rrr00720072() ^ (-1691741389)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)));
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != 0) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f00660066f00660066ff = 20;
        }
        sb.append(strPppp0070ppp2);
        sb.append(this);
        sb.append(uuxuuuu.pppp0070ppp("{@", (char) (yylylll.r0072r0072r00720072() ^ (-1349847236)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))));
        sb.append(activity);
        LogBridge.i(strPppp0070ppp, sb.toString());
        this.g0067006700670067g0067.sendData(strV0076vvvv0076);
    }

    private void c00630063cc0063c(@NonNull Activity activity) throws Exception {
        LogBridge.d(uuxuuuu.pppp0070ppp("Ace]qch9eZgc\\VD4:7Z\\W", (char) (yllylll.r007200720072r00720072() ^ (-1146716835)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))), uuxuuuu.pppp0070ppp("\r\u000f\u0007\tW>", (char) (yylylll.r0072r0072r00720072() ^ (-1349847273)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344))) + this + uuxuuuu.pp0070p0070ppp("7*", (char) (yyyllll.rrrr007200720072() ^ 383822047), (char) (yylylll.r0072r0072r00720072() ^ (-1349847182)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + activity);
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 == null) {
            return;
        }
        oodddooVarV00760076v007600760076.vvvvv00760076();
        oodddooVarV00760076v007600760076.v0076vvv00760076();
        if (!this.gg006700670067g0067.getNoSendingActivities().contains(activity.getClass().getSimpleName())) {
            if (this.gg006700670067g0067.sendInChunks()) {
                if (this.ggg0067g00670067) {
                    int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
                    int i = f0066ff00660066ff;
                    if (((f006600660066f0066ff + i) * i) % ffff00660066ff != 0) {
                        f0066ff00660066ff = f0066f0066f0066ff();
                        f00660066f00660066ff = f0066f0066f0066ff();
                    }
                    LogBridge.w(uuxuuuu.pppp0070ppp("p\u0013\u0019\u0011!\u0013\u001cl\u0015\n\u001b\u0017\f\u0006wg\n\u0007.0'", (char) (iR0072r0072r00720072 ^ (-1349847201)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), uuxuuuu.pppp0070ppp("6^VQiHZ[dmmj`rfkQU\u0001!7/\u0005[L]\t]bSQ\u0018rF95I;;CM?xLGCOAb+4_55d%@>850B6/R(\u001a\u0015.~\u0019S$(\u001c*$+\"*\u0017A\u0007\u000f\u0019E", (char) (ylyylll.r0072rrr00720072() ^ (-1691741211)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))) + this + uuxuuuu.pp0070p0070ppp(")a", (char) (yylylll.r0072r0072r00720072() ^ (-1349847154)), (char) (yllylll.r007200720072r00720072() ^ (-1146716875)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))) + activity);
                } else {
                    c0063cc0063cc(activity);
                }
            } else if (this.g0067006700670067g0067 != null) {
                c006300630063ccc(activity);
            }
        }
        if (!this.gg006700670067g0067.sendInChunks()) {
            oodddooVarV00760076v007600760076.vv0076v0076v0076();
        }
        oodddooVarV00760076v007600760076.v00760076v0076v0076(activity);
        ooodood.cleanAll(activity, false);
    }

    private oodddoo c0063cc0063cc(@NonNull Activity activity) {
        LogBridge.d(uuxuuuu.pppp0070ppp("\u000f371G;B\u0015C:IGB>. ('LPM", (char) (yyyllll.rrrr007200720072() ^ 383821893), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))), uuxuuuu.pppp0070ppp("\u001b\u000e\u0018\u000fq\u0016\u001c\u0010\fc\n\u0018\u0012\u0010_F", (char) (ylyylll.r0072rrr00720072() ^ (-1691741250)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800))) + this + uuxuuuu.pppp0070ppp("bW", (char) (ylyylll.r0072rrr00720072() ^ (-1691741345)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))) + activity);
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 == null) {
            return null;
        }
        if (!this.g00670067gg00670067) {
            oodddooVarV00760076v007600760076.v0076vvv00760076();
            if (this.gg006700670067g0067.sendSeparateChunks()) {
                sendChunkData(activity, 1, false);
                sendChunkData(activity, 2, false);
            } else {
                sendChunkData(activity, 0, false);
            }
            this.g00670067gg00670067 = true;
            return oodddooVarV00760076v007600760076;
        }
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("#GKE[OV)WN][VRB4<;`da", (char) (ylyylll.r0072rrr00720072() ^ (-1691741196)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847218)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)));
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pp0070p0070ppp("u!k#F\u001fe\u001afrY(b\u0015%L", (char) (yllylll.r007200720072r00720072() ^ (-1146716811)), (char) (yyyllll.rrrr007200720072() ^ 383821844), (char) (yyyllll.rrrr007200720072() ^ 383821867)));
        sb.append(this);
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("h,7;0944|q", (char) (yyyllll.rrrr007200720072() ^ 383821960), (char) (yyyllll.rrrr007200720072() ^ 383821859));
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != 0) {
            f0066ff00660066ff = 42;
            f00660066f00660066ff = 54;
        }
        sb.append(strPppp0070ppp);
        sb.append(activity);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        return oodddooVarV00760076v007600760076;
    }

    private boolean c0063ccc0063c(@NonNull Activity activity) {
        boolean zContains;
        if (this.gg006700670067g0067.getIgnoredActivities().isEmpty()) {
            zContains = false;
        } else {
            Set<String> ignoredActivities = this.gg006700670067g0067.getIgnoredActivities();
            int i = f0066ff00660066ff;
            if (((f006600660066f0066ff + i) * i) % ffff00660066ff != ff00660066f0066ff()) {
                f0066ff00660066ff = f0066f0066f0066ff();
                f00660066f00660066ff = 24;
            }
            zContains = ignoredActivities.contains(activity.getClass().getSimpleName());
        }
        if (!zContains) {
            return !(!this.gg006700670067g0067.getIncludedActivities().isEmpty() ? this.gg006700670067g0067.getIncludedActivities().contains(activity.getClass().getSimpleName()) : true);
        }
        LogBridge.v(uuxuuuu.pp0070p0070ppp("\\\u0001\u0005~\u0015\t\u0010b\u0011\b\u0017\u0015\u0010\f{mut\u001a\u001e\u001b", (char) (ylyylll.r0072rrr00720072() ^ (-1691741404)), (char) (yllylll.r007200720072r00720072() ^ (-1146716742)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), uuxuuuu.pp0070p0070ppp(".QcYg[gm\u0015_^fhl``7\u001e", (char) (yylylll.r0072r0072r00720072() ^ (-1349847053)), (char) (yllylll.r007200720072r00720072() ^ (-1146716771)), (char) (yyyllll.rrrr007200720072() ^ 383821866)) + this + uuxuuuu.pp0070p0070ppp("\u0015\n", (char) (yllylll.r007200720072r00720072() ^ (-1146716714)), (char) (yllylll.r007200720072r00720072() ^ (-1146716804)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))) + activity);
        return true;
    }

    private void cc00630063ccc(@NonNull Activity activity) {
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("F{\t\u0014CHX<\u0004\f$3GTMPq\u00020E[", (char) (yllylll.r007200720072r00720072() ^ (-1146716787)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847072)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)));
        StringBuilder sb = new StringBuilder();
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741421));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = 54;
            f00660066f00660066ff = f0066f0066f0066ff();
        }
        sb.append(uuxuuuu.pppp0070ppp("cWfib[1\u0018", cR0072rrr00720072, (char) (iR0072r0072r00720072 ^ (-1349847053))));
        sb.append(this);
        sb.append(uuxuuuu.pppp0070ppp("D9", (char) (yyyllll.rrrr007200720072() ^ 383821863), (char) (yyyllll.rrrr007200720072() ^ 383821859)));
        sb.append(activity);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 == null) {
            return;
        }
        oodddooVarV00760076v007600760076.vvv00760076v0076();
    }

    private void cc0063c0063cc(@NonNull Activity activity, boolean z) {
        oodddoo oodddooVarC0063cc0063cc;
        int i = 5;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                f0066ff00660066ff = f0066f0066f0066ff();
                if (this.g00670067gg00670067 || (oodddooVarC0063cc0063cc = c0063cc0063cc(activity)) == null) {
                    return;
                }
                oodddooVarC0063cc0063cc.v0076007600760076v0076(activity, true, z ? this.gg0067gg00670067.getAndIncrement() : this.gg0067gg00670067.get() - 1);
                return;
            }
        }
    }

    private void cc0063cc0063c(@NonNull Activity activity) {
        LogBridge.d(uuxuuuu.pppp0070ppp("W Sr\"aImY\u0012\u001c9]Xav*<\u000b$^", (char) (yylylll.r0072r0072r00720072() ^ (-1349847226)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))), uuxuuuu.pppp0070ppp("LL8HI\u000er", (char) (ylyylll.r0072rrr00720072() ^ (-1691741340)), (char) (yyyllll.rrrr007200720072() ^ 383821865)) + this + uuxuuuu.pp0070p0070ppp("k\u001f", (char) (ylyylll.r0072rrr00720072() ^ (-1691741399)), (char) (yyyllll.rrrr007200720072() ^ 383822059), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))) + activity);
        oodddoo oodddooVarV007600760076v00760076 = this.g0067ggg00670067.get(activity);
        if (oodddooVarV007600760076v00760076 == null) {
            oodddooVarV007600760076v00760076 = v007600760076v00760076(activity);
        }
        if (this.gg006700670067g0067.sendInChunks()) {
            if (oodddooVarV007600760076v00760076.vv00760076vv0076()) {
                return;
            }
            String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("\u0018`\u00182a\"uA\u001aM[x\"\u0019\u001e.j|Jg\u001f", (char) (yylylll.r0072r0072r00720072() ^ (-1349847065)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787)));
            StringBuilder sb = new StringBuilder();
            sb.append(uuxuuuu.pppp0070ppp("44 01[b\u001d!-%!\u001e\"\u001aZjO", (char) (yylylll.r0072r0072r00720072() ^ (-1349847220)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))));
            sb.append(this);
            sb.append(uuxuuuu.pppp0070ppp("m`", (char) (yllylll.r007200720072r00720072() ^ (-1146716778)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))));
            sb.append(activity);
            sb.append(uuxuuuu.pp0070p0070ppp("\u0012x", (char) (yyyllll.rrrr007200720072() ^ 383821873), (char) (ylyylll.r0072rrr00720072() ^ (-1691741227)), (char) ((-1691741335) ^ ylyylll.r0072rrr00720072())));
            sb.append(this.gg0067gg00670067);
            int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
            int i = f0066ff00660066ff;
            if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
                f0066ff00660066ff = 29;
                f00660066f00660066ff = f0066f0066f0066ff();
            }
            sb.append(uuxuuuu.pp0070p0070ppp("\u0017\f", (char) (iR0072rrr00720072 ^ (-1691741191)), (char) (yyyllll.rrrr007200720072() ^ 383821938), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))));
            sb.append(this.ggg0067g00670067);
            LogBridge.d(strPp0070p0070ppp, sb.toString());
            if (this.ggg0067g00670067 && this.gg0067gg00670067.get() == 0) {
                this.gg0067gg00670067.set(1);
            }
            oodddooVarV007600760076v00760076.v0076007600760076v0076(activity, false, this.ggg0067g00670067 ? this.gg0067gg00670067.get() - 1 : this.gg0067gg00670067.getAndIncrement());
        }
        oodddooVarV007600760076v00760076.vv007600760076v0076(activity);
        try {
            c00630063cccc(activity);
        } catch (Exception e) {
            LogBridge.e(uuxuuuu.pppp0070ppp("'IKCWIN\u001fK@MIB<*\u001a \u001d@B=", (char) (yyyllll.rrrr007200720072() ^ 383821872), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), uuxuuuu.pppp0070ppp("td? xGfjF", (char) (ylyylll.r0072rrr00720072() ^ (-1691741370)), (char) (yyyllll.rrrr007200720072() ^ 383821864)), e);
        }
    }

    public static int f0066f0066f0066ff() {
        return 4;
    }

    public static int ff00660066f0066ff() {
        return 0;
    }

    public static int ff0066f00660066ff() {
        return 2;
    }

    public static int fff006600660066ff() {
        return 1;
    }

    private oodddoo v007600760076v00760076(@NonNull Activity activity) {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("`\u0005\t\u0003\u0019\r\u0014f\u0015\f\u001b\u0019\u0014\u0010\u007fqyx\u001e\"\u001f", (char) (yylylll.r0072r0072r00720072() ^ (-1349847116)), (char) (yyyllll.rrrr007200720072() ^ 383821948), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))), uuxuuuu.pppp0070ppp("aqebvh>%", (char) (ylyylll.r0072rrr00720072() ^ (-1691741420)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))) + this + uuxuuuu.pppp0070ppp("\u000eO", (char) (yyyllll.rrrr007200720072() ^ 383821860), (char) (yyyllll.rrrr007200720072() ^ 383821869)) + activity);
        if (this.g0067ggg00670067.containsKey(activity)) {
            return this.g0067ggg00670067.get(activity);
        }
        oodddoo oodddooVar = new oodddoo(g0067g00670067g0067, this.gg006700670067g0067);
        WeakHashMap<Activity, oodddoo> weakHashMap = this.g0067ggg00670067;
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f00660066f00660066ff = 56;
        }
        weakHashMap.put(activity, oodddooVar);
        return oodddooVar;
    }

    private void vv00760076007600760076(@NonNull Activity activity) {
        LogBridge.d(uuxuuuu.pppp0070ppp("\u00137;5K?F\u0019G>MKFB2$\f\u000b041", (char) (yyyllll.rrrr007200720072() ^ 383821828), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344))), uuxuuuu.pp0070p0070ppp("|l\u007f|mA&", (char) (ylyylll.r0072rrr00720072() ^ (-1691741208)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847169)), (char) (yyyllll.rrrr007200720072() ^ 383821870)) + this + uuxuuuu.pp0070p0070ppp("E8", (char) (yyyllll.rrrr007200720072() ^ 383821921), (char) (yylylll.r0072r0072r00720072() ^ (-1349847151)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + activity);
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 == null) {
            return;
        }
        oodddooVarV00760076v007600760076.vvvv0076v0076();
    }

    public static odooodo vv0076v007600760076() {
        odooodo odooodoVar = g0067g00670067g0067;
        if (odooodoVar != null) {
            return odooodoVar;
        }
        synchronized (odooodo.class) {
            try {
                if (g0067g00670067g0067 == null) {
                    g0067g00670067g0067 = new odooodo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g0067g00670067g0067;
    }

    public void c0063006300630063cc(@NonNull String str) {
        LogBridge.v(uuxuuuu.pppp0070ppp("j\r\u000f\u0007\u001b\r\u0012b\u000f\u0004\u0011\r\u0006\u007fm]c`\u0004\u0006\u0001", (char) (yylylll.r0072r0072r00720072() ^ (-1349847057)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))), uuxuuuu.pppp0070ppp("\u0017\n\u001ap\u0017\u001e\u001c\u0019\u0011&v\u0013iP", (char) (ylyylll.r0072rrr00720072() ^ (-1691741237)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))) + this + uuxuuuu.pp0070p0070ppp("\u0013\b", (char) (yyyllll.rrrr007200720072() ^ 383822021), (char) (yyyllll.rrrr007200720072() ^ 383821917), (char) (yyyllll.rrrr007200720072() ^ 383821864)) + str);
        IBehavioSecConnector iBehavioSecConnector = this.g0067006700670067g0067;
        int i = f0066ff00660066ff;
        if (((fff006600660066ff() + i) * i) % ff0066f00660066ff() != 0) {
            f0066ff00660066ff = 88;
            f00660066f00660066ff = f0066f0066f0066ff();
        }
        if (iBehavioSecConnector != null) {
            this.g0067006700670067g0067.setNewJourneyId(str);
        }
    }

    public void c00630063c0063cc(@Nullable IBehavioSecChunkConnector iBehavioSecChunkConnector) {
        this.ggggg00670067 = iBehavioSecChunkConnector;
    }

    public void c00630063cccc(Activity activity) throws FlutterJavaInterfaceException {
        LogBridge.i(uuxuuuu.pp0070p0070ppp(".RVPfZa4bYhfa]M?GFkol", (char) (yylylll.r0072r0072r00720072() ^ (-1349847081)), (char) (yyyllll.rrrr007200720072() ^ 383821971), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))), uuxuuuu.pp0070p0070ppp("\"\u0014\u0015\u0016\u001f\u001f\u000f\u001b{\f\u0013\u0015w\u0004\u0014\b\u0005\u0013\u0011", (char) (yyyllll.rrrr007200720072() ^ 383821864), (char) (yyyllll.rrrr007200720072() ^ 383822055), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))));
        synchronized (this.g0067g0067g00670067) {
            try {
                if (!this.g0067g0067g00670067.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (oodoodo oodoodoVar : this.g0067g0067g00670067) {
                        Activity activity2 = oodoodoVar.v00760076vv00760076().get();
                        LogBridge.d(uuxuuuu.pppp0070ppp("<\u0018\ra>\u0005#\u0004Sgy\u0017E@5B{\u0006`m*", (char) (ylyylll.r0072rrr00720072() ^ (-1691741295)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), String.format(uuxuuuu.pppp0070ppp("9+,-66&2#3:<\u001f+;/<JHswE|o\u0004Q", (char) (ylyylll.r0072rrr00720072() ^ (-1691741231)), (char) (yyyllll.rrrr007200720072() ^ 383821858)), oodoodoVar.vvv0076v00760076(), activity2));
                        if (activity2 == null || (activity2 == activity && cc0063cccc(oodoodoVar.vvv0076v00760076(), oodoodoVar.v0076v0076v00760076(), activity2, false))) {
                            arrayList.add(oodoodoVar);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.g0067g0067g00670067.remove((oodoodo) it.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String str = this.gg00670067g00670067;
        if (str != null) {
            cc006300630063cc(str, this.g006700670067g00670067);
        }
        this.gg00670067g00670067 = null;
        this.g006700670067g00670067 = null;
        LogBridge.i(uuxuuuu.pppp0070ppp("Nrvp\u0007z\u0002T\u0003y\t\u0007\u0002}m_gf\f\u0010\r", (char) (yllylll.r007200720072r00720072() ^ (-1146716926)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))), uuxuuuu.pppp0070ppp("\u0005x{~\n\f}\fn\u0001\n\u000er\u0001\u0013\t\b\u0018\u0018E\u000b\u0017\u0017\u000f", (char) (yyyllll.rrrr007200720072() ^ 383821987), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343))));
    }

    public void c0063c00630063cc(@Nullable IBehavioSecConnector iBehavioSecConnector) {
        this.g0067006700670067g0067 = iBehavioSecConnector;
    }

    public void c0063c0063c0063c(String str, @NonNull Activity activity) {
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 == null) {
            this.gg00670067g00670067 = null;
            this.g006700670067g00670067 = null;
            return;
        }
        LogBridge.d(uuxuuuu.pppp0070ppp("MIZo-RHbdZj\u0006PQ(;\rtqX\u0019", (char) (yyyllll.rrrr007200720072() ^ 383821985), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))), uuxuuuu.pppp0070ppp("*\"&\u0017%r$ \u001f\u0011\u0019\u001es\r \b\u0014\u0005\u0015\u0006t\u0001\u0011\u0005\u0002\u0010:\u000ey\n}z\t\\vK", (char) (ylyylll.r0072rrr00720072() ^ (-1691741428)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + str);
        ooodood.sensorCollector.stopGatherSensorData();
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != ff00660066f0066ff()) {
            f0066ff00660066ff = 34;
            f00660066f00660066ff = f0066f0066f0066ff();
        }
        oodddooVarV00760076v007600760076.vv0076vv00760076(str);
    }

    public void c0063c0063ccc(@NonNull Activity activity) {
        oodddoo oodddooVarV00760076v007600760076;
        LogBridge.v(uuxuuuu.pp0070p0070ppp("gX7\u0013y\u0018\u00167\niS@PGPU;C(O:", (char) (yllylll.r007200720072r00720072() ^ (-1146716891)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847158)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))), uuxuuuu.pppp0070ppp("Ik\u001c5dyz]\u001e\n\u0006", (char) (yllylll.r007200720072r00720072() ^ (-1146716838)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))) + this + uuxuuuu.pp0070p0070ppp("\u000eA", (char) (yyyllll.rrrr007200720072() ^ 383822027), (char) (ylyylll.r0072rrr00720072() ^ (-1691741436)), (char) (yyyllll.rrrr007200720072() ^ 383821865)) + activity);
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != ff00660066f0066ff()) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f00660066f00660066ff = 58;
        }
        if (c0063ccc0063c(activity) || (oodddooVarV00760076v007600760076 = v00760076v007600760076(activity)) == null) {
            return;
        }
        oodddooVarV00760076v007600760076.v00760076007600760076v(activity);
    }

    public void c0063ccccc(String str, boolean z, @NonNull Activity activity) throws FlutterJavaInterfaceException {
        if ((f0066f0066f0066ff() * (f0066f0066f0066ff() + f006600660066f0066ff)) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = 95;
            f00660066f00660066ff = 30;
        }
        cc0063cccc(str, z, activity, true);
    }

    public void cc006300630063cc(String str, @NonNull Activity activity) {
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 == null) {
            int i = f0066ff00660066ff;
            if (((f006600660066f0066ff + i) * i) % ffff00660066ff != 0) {
                f0066ff00660066ff = 59;
                f00660066f00660066ff = 87;
            }
            this.gg00670067g00670067 = str;
            this.g006700670067g00670067 = activity;
            return;
        }
        LogBridge.d(uuxuuuu.pppp0070ppp("\u007f\"( 0\"+{$\u0019*&\u001b\u0015\u0007vxu\u001d\u001f\u0016", (char) (yllylll.r007200720072r00720072() ^ (-1146716748)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), uuxuuuu.pppp0070ppp("dWg7jhi]gnFav`nasfWewml|)~l~ts\u0004YuL", (char) (ylyylll.r0072rrr00720072() ^ (-1691741218)), (char) (yyyllll.rrrr007200720072() ^ 383821859)) + str);
        ooodood.sensorCollector.startGatherSensorData();
        oodddooVarV00760076v007600760076.v0076v00760076v0076(str);
    }

    public boolean cc0063cccc(String str, boolean z, @NonNull Activity activity, boolean z2) throws FlutterJavaInterfaceException {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("\u0017\u0017\u0004W6\u0002q\u001eU% v;\u0010g2C\u001c*\nO", (char) (yylylll.r0072r0072r00720072() ^ (-1349847208)), (char) (yllylll.r007200720072r00720072() ^ (-1146716819)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))), uuxuuuu.pppp0070ppp("vjmp{}o}Wr\bq\u007fr\u0005whv\t~}\u000e:\u0010}\u0010\u0006\u0005\u0015j\u0007]", (char) (yylylll.r0072r0072r00720072() ^ (-1349847132)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))) + str + uuxuuuu.pp0070p0070ppp("\u0005wD7H?86\u000b", (char) (ylyylll.r0072rrr00720072() ^ (-1691741211)), (char) (yllylll.r007200720072r00720072() ^ (-1146716692)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + z + uuxuuuu.pppp0070ppp("\u001b\u0010RUg]k_kq3", (char) (ylyylll.r0072rrr00720072() ^ (-1691741346)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))) + activity);
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 != null && oodddooVarV00760076v007600760076.v0076vv0076v0076(str, z)) {
            return true;
        }
        if (!z2) {
            return false;
        }
        synchronized (this.g0067g0067g00670067) {
            LogBridge.w(uuxuuuu.pp0070p0070ppp("Oqsk\u007fqvGshuqjdRBHEhje", (char) (ylyylll.r0072rrr00720072() ^ (-1691741323)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847206)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), uuxuuuu.pp0070p0070ppp("ZNMPWYGU;VgQ[N\\OLZh^Yi\u0012Yajjd`\u001d`j:h:(6,'7\u00195\b", (char) (yylylll.r0072r0072r00720072() ^ (-1349847276)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)), (char) (yyyllll.rrrr007200720072() ^ 383821868)) + str);
            this.g0067g0067g00670067.add(new oodoodo(str, z, activity));
        }
        return false;
    }

    public void ccc00630063cc(@NonNull oddoodo oddoodoVar) {
        this.gg006700670067g0067 = oddoodoVar;
        ooodood.y0079yy007900790079(oddoodoVar.collectLocationData());
        boolean zCollectContextData = this.gg006700670067g0067.collectContextData();
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = 75;
            f00660066f00660066ff = 26;
        }
        ooodood.yyyy007900790079(zCollectContextData);
        ooodood.ss0073s0073ss(this.gg006700670067g0067.getBhsOptions(), this.gg006700670067g0067.getExcludeData());
    }

    public void ccc0063c0063c() {
        for (Map.Entry<Activity, oodddoo> entry : this.g0067ggg00670067.entrySet()) {
            c00630063cc0063c(entry.getKey());
            int i = f0066ff00660066ff;
            if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
                f0066ff00660066ff = 5;
                f00660066f00660066ff = 40;
            }
            entry.getValue().vvvvvv0076();
        }
        this.g0067ggg00670067.clear();
    }

    public void ccc0063ccc() {
        if (this.gg006700670067g0067.sendInChunks()) {
            this.gg0067gg00670067 = new AtomicInteger(0);
            ooodood.resetCounters();
            oododoo.resetCounters();
            ylyylyl.r0072rrr0072r();
        }
    }

    public void cccc0063cc(@NonNull Activity activity) {
        LogBridge.v(uuxuuuu.pp0070p0070ppp("UFic\t+A[:U)o\u0005X$V=Ae8\u0003", (char) (ylyylll.r0072rrr00720072() ^ (-1691741220)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741391)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))), uuxuuuu.pp0070p0070ppp("\u0004t|qPl~jB'", (char) (ylyylll.r0072rrr00720072() ^ (-1691741221)), (char) (yyyllll.rrrr007200720072() ^ 383821847), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))) + this + uuxuuuu.pppp0070ppp("\u000e\u0003", (char) (yllylll.r007200720072r00720072() ^ (-1146716826)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))) + activity + uuxuuuu.pp0070p0070ppp("^0\")(c3'4-h", (char) (yylylll.r0072r0072r00720072() ^ (-1349847256)), (char) (yllylll.r007200720072r00720072() ^ (-1146716907)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))) + ooodood.ss0073ssss(activity));
        if (c0063ccc0063c(activity)) {
            return;
        }
        if (this.gg006700670067g0067.sendInChunks()) {
            cc0063c0063cc(activity, false);
            this.g00670067gg00670067 = false;
            return;
        }
        if (this.g0067006700670067g0067 != null) {
            c006300630063ccc(activity);
            return;
        }
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741386));
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821857);
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f00660066f00660066ff = 71;
        }
        LogBridge.v(uuxuuuu.pp0070p0070ppp(",PTNdX_2`Wfd_[K=EDimj", cR0072rrr00720072, cRrrr007200720072, (char) (iR0072r0072r00720072 ^ (-1349847055))), uuxuuuu.pppp0070ppp("\u0019\n\u0012\u0007e\u0002\u0014\u007fW<~\n\b\u0007|y\n\u0004\u00062z\u0004/|\u0003xw8", (char) (ylyylll.r0072rrr00720072() ^ (-1691741264)), (char) (yyyllll.rrrr007200720072() ^ 383821868)));
    }

    public boolean ccccc0063c(@NonNull Activity activity, @NonNull ViewGroup viewGroup) {
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != 0) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f00660066f00660066ff = 21;
        }
        oodddoo oodddooVar = this.g0067ggg00670067.get(activity);
        ylyylyl ylyylylVarV0076v0076vv0076 = oodddooVar != null ? oodddooVar.v0076v0076vv0076() : null;
        if (ylyylylVarV0076v0076vv0076 == null) {
            return false;
        }
        ylyylylVarV0076v0076vv0076.r00720072rr0072r(viewGroup);
        return true;
    }

    @NonNull
    public oddoodo getConfiguration() {
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ff0066f00660066ff() != 0) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f006600660066f0066ff = f0066f0066f0066ff();
        }
        return this.gg006700670067g0067;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        LogBridge.i(uuxuuuu.pp0070p0070ppp("4\u0015\u001c\u001e\u00063Q\u0004\u0015V6a:Q:_\r\u0013Py\t", (char) (yylylll.r0072r0072r00720072() ^ (-1349847180)), (char) (yyyllll.rrrr007200720072() ^ 383822011), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))), uuxuuuu.pp0070p0070ppp("#RU(j\u0010Mp-b\\<`\rPq\"(>", (char) (ylyylll.r0072rrr00720072() ^ (-1691741350)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741383)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))) + this + uuxuuuu.pppp0070ppp("XK", (char) (ylyylll.r0072rrr00720072() ^ (-1691741246)), (char) (yyyllll.rrrr007200720072() ^ 383821870)) + activity);
        if (c0063ccc0063c(activity)) {
            return;
        }
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = 25;
            f00660066f00660066ff = 65;
        }
        v007600760076v00760076(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        LogBridge.i(uuxuuuu.pp0070p0070ppp("god\u000b\u0011910Nii\u0014~/\u0010.&\n_O|", (char) (yylylll.r0072r0072r00720072() ^ (-1349847081)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741370)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))), uuxuuuu.pp0070p0070ppp("<R[\u0015\\g,5v\u0013\u0014L\u0011(]p14iVr", (char) (yllylll.r007200720072r00720072() ^ (-1146716742)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741247)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))) + this + uuxuuuu.pppp0070ppp("zA", (char) (yllylll.r007200720072r00720072() ^ (-1146716729)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))) + activity);
        if (c0063ccc0063c(activity)) {
            int iF0066f0066f0066ff = f0066f0066f0066ff();
            if (((f006600660066f0066ff + iF0066f0066f0066ff) * iF0066f0066f0066ff) % ffff00660066ff != 0) {
                f0066ff00660066ff = f0066f0066f0066ff();
                f00660066f00660066ff = 63;
                return;
            }
            return;
        }
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 == null) {
            return;
        }
        oodddooVarV00760076v007600760076.vvvvvv0076();
        ooodood.cleanAll(activity, true);
        this.g0067ggg00670067.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741237));
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f00660066f00660066ff = f0066f0066f0066ff();
        }
        LogBridge.i(uuxuuuu.pp0070p0070ppp("eB$$\u0010\u0002\u0005;b*-s;Rzj\u0011\u0004n|\u0018", cR0072rrr00720072, (char) (yllylll.r007200720072r00720072() ^ (-1146716841)), (char) (yyyllll.rrrr007200720072() ^ 383821865)), uuxuuuu.pp0070p0070ppp("2EW5\u000b{\u000bgMQ^mi\bCEL\u0010", (char) (yylylll.r0072r0072r00720072() ^ (-1349847245)), (char) (yllylll.r007200720072r00720072() ^ (-1146716848)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))) + this + uuxuuuu.pppp0070ppp("bU", (char) (yllylll.r007200720072r00720072() ^ (-1146716691)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))) + activity);
        if (c0063ccc0063c(activity)) {
            return;
        }
        vv00760076007600760076(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("9]a[qel?mdsqlhXJRQvzw", (char) (ylyylll.r0072rrr00720072() ^ (-1691741419)), (char) (yyyllll.rrrr007200720072() ^ 383821866));
        StringBuilder sb = new StringBuilder();
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = 32;
            f00660066f00660066ff = 78;
        }
        sb.append(uuxuuuu.pp0070p0070ppp("xvHiymykuyQcpqh_]2\u0017", (char) (ylyylll.r0072rrr00720072() ^ (-1691741232)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741269)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))));
        sb.append(this);
        sb.append(uuxuuuu.pppp0070ppp("XM", (char) (yllylll.r007200720072r00720072() ^ (-1146716710)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800))));
        sb.append(activity);
        LogBridge.i(strPppp0070ppp, sb.toString());
        if (c0063ccc0063c(activity)) {
            return;
        }
        cc00630063ccc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741308));
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != 0) {
            f0066ff00660066ff = 85;
            f00660066f00660066ff = f0066f0066f0066ff();
        }
        LogBridge.i(uuxuuuu.pppp0070ppp("1'w\\A\u007f&~\u0006?G*unE\u0018fRNh\u001d", cR0072rrr00720072, (char) (iRrrr007200720072 ^ 383821864)), uuxuuuu.pp0070p0070ppp("}}Qt\u0007|\u000b~\u000b\u0011k\u000e{\u000e\u0011\u0003\u0003Y@", (char) (yylylll.r0072r0072r00720072() ^ (-1349847053)), (char) (yyyllll.rrrr007200720072() ^ 383822042), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))) + this + uuxuuuu.pp0070p0070ppp("\u000f\u0002", (char) (yllylll.r007200720072r00720072() ^ (-1146716840)), (char) (yyyllll.rrrr007200720072() ^ 383821983), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))) + activity);
        if (c0063ccc0063c(activity)) {
            return;
        }
        cc0063cc0063c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) throws Exception {
        LogBridge.i(uuxuuuu.pppp0070ppp("]\u0002\u0006\u007f\u0016\n\u0011c\u0012\t\u0018\u0016\u0011\r|nvu\u001b\u001f\u001c", (char) (yyyllll.rrrr007200720072() ^ 383821987), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), uuxuuuu.pp0070p0070ppp("ssGj|r\u0001t\u0001\u0007a\u0004\u007f\u0002\u0003xxO6", (char) (yllylll.r007200720072r00720072() ^ (-1146716917)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741207)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))) + this + uuxuuuu.pppp0070ppp("D9", (char) (yllylll.r007200720072r00720072() ^ (-1146716783)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))) + activity);
        boolean zC0063ccc0063c = c0063ccc0063c(activity);
        int i = f0066ff00660066ff;
        if (((fff006600660066ff() + i) * i) % ff0066f00660066ff() != 0) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f00660066f00660066ff = 43;
        }
        if (zC0063ccc0063c) {
            return;
        }
        c00630063cc0063c(activity);
    }

    public void sendChunkData(@NonNull Activity activity, int i, boolean z) {
        oodddoo oodddooVarV00760076v007600760076;
        LogBridge.v(uuxuuuu.pppp0070ppp("p\u0015\u0019\u0013)\u001d$v%\u001c+)$ \u0010\u0002\n\t.2/", (char) (yllylll.r007200720072r00720072() ^ (-1146716770)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))), uuxuuuu.pp0070p0070ppp("\t\u000el&UiLR5s\u00154\u0015\nY", (char) (yylylll.r0072r0072r00720072() ^ (-1349847226)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741199)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))) + this + uuxuuuu.pp0070p0070ppp("&<", (char) (yyyllll.rrrr007200720072() ^ 383821906), (char) (yllylll.r007200720072r00720072() ^ (-1146716821)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))) + activity + uuxuuuu.pppp0070ppp("\u001a\u0018xd44-)\rV\u0015", (char) (yylylll.r0072r0072r00720072() ^ (-1349847184)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))) + ooodood.ss0073ssss(activity));
        this.g00670067gg00670067 = false;
        if (this.ggggg00670067 == null) {
            LogBridge.v(uuxuuuu.pp0070p0070ppp("\"FJDZNU(VM\\ZUQA3;:_c`", (char) (yllylll.r007200720072r00720072() ^ (-1146716832)), (char) (yllylll.r007200720072r00720072() ^ (-1146716806)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))), uuxuuuu.pppp0070ppp("1HE\u001eFHsvNu\u0013\u0006A&\u00126fy4E}I$-Etc@\u0003^c\u0002]s", (char) (yyyllll.rrrr007200720072() ^ 383821834), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))) + this);
            return;
        }
        if (c0063ccc0063c(activity) || (oodddooVarV00760076v007600760076 = v00760076v007600760076(activity)) == null) {
            return;
        }
        int iF0066f0066f0066ff = f0066f0066f0066ff();
        if (((f006600660066f0066ff + iF0066f0066f0066ff) * iF0066f0066f0066ff) % ffff00660066ff != 0) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f00660066f00660066ff = 97;
        }
        Map<String, String> mapVv0076vvv0076 = oodddooVarV00760076v007600760076.vv0076vvv0076(activity, i, z);
        if (ContextCompat.a(activity, uuxuuuu.pppp0070ppp("o}p\u007fytl7vlvrkvsj\u000e\u000eJfho]kd\\h", (char) (yyyllll.rrrr007200720072() ^ 383821861), (char) (yyyllll.rrrr007200720072() ^ 383821870))) == 0) {
            LogBridge.i(uuxuuuu.pp0070p0070ppp("\u0018<@:PDK\u001eLCRPKG7)10UYV", (char) (ylyylll.r0072rrr00720072() ^ (-1691741229)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847189)), (char) ((-1146716790) ^ yllylll.r007200720072r00720072())), uuxuuuu.pppp0070ppp("\u0011$.%+1+d*(<*i1;?m", (char) (yyyllll.rrrr007200720072() ^ 383821890), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))) + this + uuxuuuu.pppp0070ppp("az", (char) (ylyylll.r0072rrr00720072() ^ (-1691741235)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))) + activity);
            this.ggggg00670067.sendData(mapVv0076vvv0076);
        }
    }

    public void setPageName(@NonNull Activity activity, @NonNull String str) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("\u00126:4J>E\u0018F=LJEA1#+*OSP", (char) (yllylll.r007200720072r00720072() ^ (-1146716817)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799)));
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pppp0070ppp("o`nIY^[CU`W+\u0010", (char) (ylyylll.r0072rrr00720072() ^ (-1691741377)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))));
        sb.append(this);
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != ff00660066f0066ff()) {
            f0066ff00660066ff = 30;
            f00660066f00660066ff = f0066f0066f0066ff();
        }
        sb.append(uuxuuuu.pppp0070ppp("uF", (char) (iR0072r0072r00720072 ^ (-1349847109)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))));
        sb.append(activity);
        sb.append(uuxuuuu.pp0070p0070ppp("F9", (char) (ylyylll.r0072rrr00720072() ^ (-1691741427)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741290)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))));
        sb.append(str);
        LogBridge.d(strPppp0070ppp, sb.toString());
        ooodood.sss00730073ss(str, activity);
    }

    public oodddoo v00760076v007600760076(@NonNull Activity activity) {
        oodddoo oodddooVar = this.g0067ggg00670067.get(activity);
        if (oodddooVar != null) {
            return oodddooVar;
        }
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716817));
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741280));
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072() ^ (-1691741335);
        if ((f0066f0066f0066ff() * (f0066f0066f0066ff() + f006600660066f0066ff)) % ffff00660066ff != ff00660066f0066ff()) {
            f006600660066f0066ff = f0066f0066f0066ff();
        }
        LogBridge.w(uuxuuuu.pp0070p0070ppp("Z6q\u001f-X\u0017\u001d3](\u001aL{'\r<n\fG{", cR007200720072r00720072, cR0072rrr00720072, (char) iR0072rrr00720072), uuxuuuu.pp0070p0070ppp("\u0017\u0019\u0007\u001b\rHfgK\u001b#\u001b\u001cP", (char) (yylylll.r0072r0072r00720072() ^ (-1349847284)), (char) (yyyllll.rrrr007200720072() ^ 383822064), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))) + this);
        return null;
    }

    public void v0076v0076007600760076(String str, String str2, String str3, @NonNull Activity activity) {
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 == null) {
            return;
        }
        oodddooVarV00760076v007600760076.v007600760076vv0076(str, str2, str3);
    }

    @NonNull
    public String v0076vv007600760076(@NonNull Activity activity) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("3UWOcUZ+WLYUNH6&,)LNI", (char) (ylyylll.r0072rrr00720072() ^ (-1691741332)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333)));
        String str = uuxuuuu.pp0070p0070ppp("033\b6N,\n\u0001", (char) (yylylll.r0072r0072r00720072() ^ (-1349847228)), (char) (yyyllll.rrrr007200720072() ^ 383821999), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))) + this + uuxuuuu.pp0070p0070ppp("}r", (char) (yyyllll.rrrr007200720072() ^ 383821863), (char) (yyyllll.rrrr007200720072() ^ 383821934), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))) + activity;
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = 24;
            f00660066f00660066ff = f0066f0066f0066ff();
        }
        LogBridge.v(strPppp0070ppp, str);
        if (c0063ccc0063c(activity)) {
            return "";
        }
        if (this.g0067006700670067g0067 != null) {
            LogBridge.v(uuxuuuu.pppp0070ppp("\u000b}\u0003\u001ft\rz<\u001dB'\u000eVC2\nUI65s", (char) (yylylll.r0072r0072r00720072() ^ (-1349847127)), (char) (yyyllll.rrrr007200720072() ^ 383821869)), uuxuuuu.pppp0070ppp("/r\u0012\u0003Z\u001bm8|\u001f'\nTKC9\u0001sk/wz5< !P\u0014zKr", (char) (ylyylll.r0072rrr00720072() ^ (-1691741323)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))));
            return "";
        }
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        return oodddooVarV00760076v007600760076 == null ? "" : oodddooVarV00760076v007600760076.v0076vvvv0076(activity);
    }

    public void vv00760076v00760076(@NonNull Activity activity) {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("\u000b:Y}/=O<\u0006'QZo\u0007!.PZ\u001aI`", (char) (yyyllll.rrrr007200720072() ^ 383821852), (char) (yyyllll.rrrr007200720072() ^ 383822006), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))), uuxuuuu.pppp0070ppp("\u007f\n\u0004\u0001\u0013s\b\u000b\u000e\u0019\u001b\u001a\n\u001e\u0014\u001b\u001b!hO", (char) (yyyllll.rrrr007200720072() ^ 383821990), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))) + this + uuxuuuu.pppp0070ppp("G<", (char) (yylylll.r0072r0072r00720072() ^ (-1349847234)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))) + activity + uuxuuuu.pppp0070ppp("!<}W8{\u00059Mv}X\u0001\u0007i", (char) (yyyllll.rrrr007200720072() ^ 383822063), (char) (yyyllll.rrrr007200720072() ^ 383821869)) + this.gg006700670067g0067.sendInChunks());
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ff0066f00660066ff() != 0) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f00660066f00660066ff = 42;
        }
        if (!this.gg006700670067g0067.getNoSendingActivities().contains(activity.getClass().getSimpleName())) {
            if (this.gg006700670067g0067.sendInChunks()) {
                this.ggg0067g00670067 = true;
                cc0063c0063cc(activity, true);
            } else {
                c006300630063ccc(activity);
            }
        }
        oodddoo oodddooVarV00760076v007600760076 = v00760076v007600760076(activity);
        if (oodddooVarV00760076v007600760076 == null) {
            return;
        }
        oodddooVarV00760076v007600760076.vv0076v0076v0076();
        ooodood.cleanAll(activity, true);
    }

    public void vvv0076007600760076(@Nullable Activity activity) {
        if (activity == null) {
            return;
        }
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("#GKE[OV)WN][VRB4<;`da", (char) (yyyllll.rrrr007200720072() ^ 383822029), (char) (yyyllll.rrrr007200720072() ^ 383821868), (char) (yyyllll.rrrr007200720072() ^ 383821866));
        StringBuilder sb = new StringBuilder();
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741282));
        int iR007200720072r00720072 = yllylll.r007200720072r00720072() ^ (-1146716697);
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff != f00660066f00660066ff) {
            f0066ff00660066ff = f0066f0066f0066ff();
            f00660066f00660066ff = f0066f0066f0066ff();
        }
        sb.append(uuxuuuu.pp0070p0070ppp("\u0002\u0006\u007f\nN3", cR0072rrr00720072, (char) iR007200720072r00720072, (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))));
        sb.append(this);
        sb.append(uuxuuuu.pp0070p0070ppp("6\u001e", (char) (yllylll.r007200720072r00720072() ^ (-1146716928)), (char) (yllylll.r007200720072r00720072() ^ (-1146716676)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))));
        sb.append(activity);
        LogBridge.v(strPp0070p0070ppp, sb.toString());
        if (c0063ccc0063c(activity)) {
            return;
        }
        cc0063cc0063c(activity);
    }

    public boolean vvvv007600760076(@NonNull Activity activity) {
        oodddoo oodddooVar = this.g0067ggg00670067.get(activity);
        ylyylyl ylyylylVarV0076v0076vv0076 = oodddooVar != null ? oodddooVar.v0076v0076vv0076() : null;
        if (ylyylylVarV0076v0076vv0076 == null) {
            return false;
        }
        ylyylylVarV0076v0076vv0076.rrrr0072rr();
        int i = f0066ff00660066ff;
        if (((f006600660066f0066ff + i) * i) % ffff00660066ff == 0) {
            return true;
        }
        f0066ff00660066ff = 79;
        f00660066f00660066ff = f0066f0066f0066ff();
        return true;
    }
}
