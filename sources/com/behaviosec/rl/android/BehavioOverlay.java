package com.behaviosec.rl.android;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
public class BehavioOverlay {
    public static int a006100610061a00610061a = 45;
    public static int a0061a0061006100610061a = 1;
    public static int aa0061a006100610061a = 2;
    public static int aaaa006100610061a;
    private static final String ff0066ffff = uuxuuuu.pp0070p0070ppp("Ri\u0016EAYXY+R{\u000b)\u0013", (char) (yllylll.r007200720072r00720072() ^ (-1146716775)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847062)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333)));
    private long f00660066ffff = -1;
    private double fff0066fff = -1.0d;
    private View f0066f0066fff = null;
    private final Object ff00660066fff = new Object();
    private Context f006600660066fff = null;
    private final Object ffff0066ff = new Object();
    private View f0066ff0066ff = null;

    public interface odddddo {
        void onLastDown(long j);
    }

    public static int a006100610061006100610061a() {
        return 2;
    }

    public static /* synthetic */ View a006100610061a0061a(BehavioOverlay behavioOverlay) {
        int i = a006100610061a00610061a;
        if (((a0061a0061006100610061a + i) * i) % aa0061a006100610061a != aaaa006100610061a) {
            a006100610061a00610061a = 85;
            aaaa006100610061a = 62;
        }
        return behavioOverlay.f0066f0066fff;
    }

    public static int a0061aa006100610061a() {
        return 1;
    }

    private final boolean a0061aa00610061a(View view) {
        boolean z;
        synchronized (this.ffff0066ff) {
            z = view == this.f0066ff0066ff;
        }
        return z;
    }

    public static int aa00610061006100610061a() {
        return 99;
    }

    private synchronized void aa0061a00610061a() {
        this.f00660066ffff = -1L;
        this.f0066f0066fff = null;
        this.f0066ff0066ff = null;
        setActivity(null);
    }

    private final boolean aaaa00610061a() {
        if (this.f0066ff0066ff == null) {
            return false;
        }
        int i = a006100610061a00610061a;
        if (((a0061aa006100610061a() + i) * i) % aa0061a006100610061a != 0) {
            a006100610061a00610061a = aa00610061006100610061a();
            aaaa006100610061a = 60;
        }
        return true;
    }

    public final void addViewListener(int i, int i2, int i3, int i4, View view) {
        final String str = uuxuuuu.pp0070p0070ppp("\"$#\u0014&!2\u0006\"++\u001b#\u0019%Y", (char) (yyyllll.rrrr007200720072() ^ 383821879), (char) (yyyllll.rrrr007200720072() ^ 383821961), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))) + i + uuxuuuu.pppp0070ppp("7,", (char) (yyyllll.rrrr007200720072() ^ 383822040), (char) (yyyllll.rrrr007200720072() ^ 383821858)) + i2 + uuxuuuu.pppp0070ppp("p,", (char) (ylyylll.r0072rrr00720072() ^ (-1691741388)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))) + i3 + uuxuuuu.pppp0070ppp("\u0012\u0005", (char) (yyyllll.rrrr007200720072() ^ 383821873), (char) (yyyllll.rrrr007200720072() ^ 383821868)) + i4 + uuxuuuu.pp0070p0070ppp("9", (char) (yllylll.r007200720072r00720072() ^ (-1146716708)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847057)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))) + view + uuxuuuu.pp0070p0070ppp(")", (char) (yyyllll.rrrr007200720072() ^ 383821850), (char) (ylyylll.r0072rrr00720072() ^ (-1691741276)), (char) (yyyllll.rrrr007200720072() ^ 383821864));
        synchronized (this.ffff0066ff) {
            try {
                boolean zAaaa00610061a = aaaa00610061a();
                if (zAaaa00610061a && !a0061aa00610061a(view)) {
                    removeViewListener();
                    zAaaa00610061a = false;
                }
                final Context activity = getActivity();
                LogBridge.i(uuxuuuu.pp0070p0070ppp("g%Um<}\u0011)9PT\u0002:M", (char) (yllylll.r007200720072r00720072() ^ (-1146716891)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741341)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))), str + uuxuuuu.pppp0070ppp("ZRc;W``PXNZ!\u0006", (char) (yyyllll.rrrr007200720072() ^ 383821997), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + zAaaa00610061a + uuxuuuu.pp0070p0070ppp("@[O}\u001fpU\u001d~(ZJ", (char) (yyyllll.rrrr007200720072() ^ 383821918), (char) (ylyylll.r0072rrr00720072() ^ (-1691741290)), (char) (yyyllll.rrrr007200720072() ^ 383821871)) + activity);
                if (!zAaaa00610061a && activity != null) {
                    final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1000, 262200, -3);
                    layoutParams.gravity = 17;
                    layoutParams.width = 1;
                    layoutParams.height = 1;
                    if (Build.VERSION.SDK_INT > 30) {
                        layoutParams.alpha = BitmapDescriptorFactory.HUE_RED;
                    }
                    Activity activity2 = (Activity) activity;
                    if (view == null && (activity instanceof Activity)) {
                        view = activity2.getCurrentFocus();
                    }
                    layoutParams.token = view != null ? view.getWindowToken() : activity2.getWindow().getDecorView().getWindowToken();
                    this.f0066f0066fff = new DrawView(activity, null);
                    LogBridge.d(uuxuuuu.pppp0070ppp("t\u0017\u0019\u0011-\u001f$\u00031\u001f+$ 7", (char) (ylyylll.r0072rrr00720072() ^ (-1691741275)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344))), uuxuuuu.pp0070p0070ppp("\u0019,2)5>\u0015*8,32@|\u001c2KBII&8J:GN\u0016|", (char) (yllylll.r007200720072r00720072() ^ (-1146716709)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847069)), (char) (yyyllll.rrrr007200720072() ^ 383821866)) + layoutParams + uuxuuuu.pppp0070ppp(":-{\u0002o{th\u007f[mhy; ", (char) (yyyllll.rrrr007200720072() ^ 383822052), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))) + this.f0066f0066fff + uuxuuuu.pppp0070ppp("I<~\u0010\f\u000b|\u0005\nUv\u0007z\u0007x\u0003\u0007F+", (char) (yylylll.r0072r0072r00720072() ^ (-1349847230)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + activity2);
                    activity2.getWindow().getDecorView().post(new Runnable() { // from class: com.behaviosec.rl.android.BehavioOverlay.1
                        public static int a0061aaaaa0061 = 0;
                        public static int aa0061aaaa0061 = 1;
                        public static int aaaaaaa0061 = 88;

                        public static int a00610061aaaa0061() {
                            return 2;
                        }

                        public static int aaa0061aaa0061() {
                            return 84;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                Context context = activity;
                                int i5 = aaaaaaa0061;
                                if (((aa0061aaaa0061 + i5) * i5) % a00610061aaaa0061() != a0061aaaaa0061) {
                                    aaaaaaa0061 = aaa0061aaa0061();
                                    a0061aaaaa0061 = aaa0061aaa0061();
                                }
                                ((WindowManager) context.getSystemService(uuxuuuu.pppp0070ppp("paeZdk", (char) (yylylll.r0072r0072r00720072() ^ (-1349847180)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))))).addView(BehavioOverlay.a006100610061a0061a(BehavioOverlay.this), layoutParams);
                                LogBridge.d(uuxuuuu.pppp0070ppp("K<On6M=\be\u0007\u0018*\u000b\u0019", (char) (yylylll.r0072r0072r00720072() ^ (-1349847224)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), str + uuxuuuu.pp0070p0070ppp("VaIR1t,;\u001a\u000f\u0011m\u0006.\u001c", (char) (yyyllll.rrrr007200720072() ^ 383821985), (char) (yyyllll.rrrr007200720072() ^ 383821986), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))) + BehavioOverlay.a006100610061a0061a(BehavioOverlay.this) + uuxuuuu.pppp0070ppp("\u000e\u0001ABRFRDNR\u0012", (char) (yylylll.r0072r0072r00720072() ^ (-1349847043)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + activity);
                            } catch (Exception e) {
                                LogBridge.d(uuxuuuu.pppp0070ppp(">bf`vjqRzjxsi\u0003", (char) (ylyylll.r0072rrr00720072() ^ (-1691741291)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))), uuxuuuu.pp0070p0070ppp("\"\tl\\1\u001d4uLh\u0007uRy-\fdbf xoL*\u000fq[t", (char) (yylylll.r0072r0072r00720072() ^ (-1349847095)), (char) (yllylll.r007200720072r00720072() ^ (-1146716779)), (char) ((-1691741330) ^ ylyylll.r0072rrr00720072())) + e);
                            }
                        }
                    });
                    String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("H\u001cvAX\u0003^dTIn\u0019S\u0016", (char) (yyyllll.rrrr007200720072() ^ 383821998), (char) (yyyllll.rrrr007200720072() ^ 383822040), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333)));
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(uuxuuuu.pp0070p0070ppp("BPEA,1/MXPZ\u0019v", (char) (yllylll.r007200720072r00720072() ^ (-1146716760)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741204)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))));
                    sb.append(view);
                    LogBridge.d(strPp0070p0070ppp, sb.toString());
                    this.f0066ff0066ff = view;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean destroy(Context context, int i) {
        uuxuuuu.pp0070p0070ppp("\u0018\u0005}o\u001c@wn.\u001f", (char) (yyyllll.rrrr007200720072() ^ 383821848), (char) (yllylll.r007200720072r00720072() ^ (-1146716912)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789)));
        LogBridge.i(uuxuuuu.pppp0070ppp("}\"& 6*1\u0012:*83)B", (char) (ylyylll.r0072rrr00720072() ^ (-1691741358)), (char) (yyyllll.rrrr007200720072() ^ 383821871)), uuxuuuu.pppp0070ppp("UUbb_[d\u0012\u0012\b", (char) (yylylll.r0072r0072r00720072() ^ (-1349847172)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
        Context activity = getActivity();
        if (context == null || !context.equals(activity)) {
            return false;
        }
        if ((aa00610061006100610061a() * (a0061aa006100610061a() + aa00610061006100610061a())) % a006100610061006100610061a() != aaaa006100610061a) {
            a006100610061a00610061a = 16;
            aaaa006100610061a = 8;
        }
        removeKeyDownListener(context, i);
        aa0061a00610061a();
        return true;
    }

    public void enable() {
        Context activity = getActivity();
        if (activity instanceof Activity) {
            addViewListener(0, 0, -1, -1, ((Activity) activity).getCurrentFocus());
        }
    }

    public final Context getActivity() {
        Context context;
        synchronized (this.ff00660066fff) {
            context = this.f006600660066fff;
        }
        return context;
    }

    public final long getLastDown() {
        int i = a006100610061a00610061a;
        if (((a0061a0061006100610061a + i) * i) % aa0061a006100610061a != 0) {
            a006100610061a00610061a = 32;
            aaaa006100610061a = 67;
        }
        return this.f00660066ffff;
    }

    public final double getLastPressure() {
        int i = a006100610061a00610061a;
        if (((a0061a0061006100610061a + i) * i) % aa0061a006100610061a != aaaa006100610061a) {
            a006100610061a00610061a = 24;
            aaaa006100610061a = aa00610061006100610061a();
        }
        return this.fff0066fff;
    }

    public synchronized void init(Context context) {
        try {
            String strPppp0070ppp = uuxuuuu.pppp0070ppp("EgiauglKq_kdXo", (char) (ylyylll.r0072rrr00720072() ^ (-1691741353)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791)));
            StringBuilder sb = new StringBuilder();
            int i = a006100610061a00610061a;
            if (((a0061a0061006100610061a + i) * i) % aa0061a006100610061a != aaaa006100610061a) {
                a006100610061a00610061a = 37;
                aaaa006100610061a = 76;
            }
            sb.append(uuxuuuu.pppp0070ppp("\u0014\u0018\u0012\u001cN\u0011\u001c\u001a\u0017\u0007\u0019\u0014`", (char) (yylylll.r0072r0072r00720072() ^ (-1349847258)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344))));
            sb.append(context);
            LogBridge.i(strPppp0070ppp, sb.toString());
            aa0061a00610061a();
            setActivity(context);
            enable();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean removeKeyDownListener(Context context, int i) {
        Context activity = getActivity();
        if (activity == null) {
            String strPppp0070ppp = uuxuuuu.pppp0070ppp("v\u001b\u001f\u0019/#*\u000b3#1,\";", (char) (yylylll.r0072r0072r00720072() ^ (-1349847273)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336)));
            int i2 = a006100610061a00610061a;
            if (((a0061a0061006100610061a + i2) * i2) % aa0061a006100610061a != 0) {
                a006100610061a00610061a = 3;
                aaaa006100610061a = 48;
            }
            LogBridge.d(strPppp0070ppp, uuxuuuu.pppp0070ppp("\u001b\u000f\u0018\u001b#\u0013y\u0015*u\"+#\u0002 +-\u001f)!/eg_4\u0003&8.<0<Bi\b\tl<D<=", (char) (yyyllll.rrrr007200720072() ^ 383822026), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))));
            return false;
        }
        if (!context.equals(activity) && i > 1) {
            return false;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(uuxuuuu.pp0070p0070ppp("\t{\u0002x\u0005\u000e", (char) (ylyylll.r0072rrr00720072() ^ (-1691741282)), (char) (yyyllll.rrrr007200720072() ^ 383822012), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))));
        LogBridge.d(uuxuuuu.pppp0070ppp("wK@\u0016zH^VF\u0006\u0011lv\u0019", (char) (yyyllll.rrrr007200720072() ^ 383821983), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), uuxuuuu.pppp0070ppp("p\u0018\fz2K\u0011\u0014`Ot#J&Kw\u001f\u001e_J\u0010\u0012=,\b/@\u0010\u0018?wXZ", (char) (ylyylll.r0072rrr00720072() ^ (-1691741420)), (char) (yyyllll.rrrr007200720072() ^ 383821864)) + this.f0066f0066fff + uuxuuuu.pppp0070ppp(")\u001evm;\"", (char) (yllylll.r007200720072r00720072() ^ (-1146716681)), (char) ((-1349847053) ^ yylylll.r0072r0072r00720072())) + windowManager + uuxuuuu.pp0070p0070ppp("\u0004x;>PFTHTZ\u001c", (char) (yyyllll.rrrr007200720072() ^ 383821850), (char) (ylyylll.r0072rrr00720072() ^ (-1691741361)), (char) (yyyllll.rrrr007200720072() ^ 383821864)) + context);
        View view = this.f0066f0066fff;
        if (view != null && windowManager != null) {
            try {
                windowManager.removeView(view);
            } catch (Throwable th) {
                LogBridge.d(uuxuuuu.pppp0070ppp("\u000b-3+C5>\u001d7%5.&=", (char) (yyyllll.rrrr007200720072() ^ 383821981), (char) (yyyllll.rrrr007200720072() ^ 383821858)), uuxuuuu.pp0070p0070ppp("P\"%~2\f>m#*wE\u0004`b(\u001dC4#\u0004\u001f%\b5A\t\\!|dHy]\u0006", (char) (yylylll.r0072r0072r00720072() ^ (-1349847270)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741247)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))) + th);
            }
        }
        resetLastDown();
        this.f0066f0066fff = null;
        return true;
    }

    public final void removeViewListener() {
        synchronized (this.ffff0066ff) {
            try {
                Context activity = getActivity();
                WindowManager windowManager = activity != null ? (WindowManager) activity.getSystemService(uuxuuuu.pp0070p0070ppp("'\u001a \u0017#,", (char) (yllylll.r007200720072r00720072() ^ (-1146716910)), (char) (yllylll.r007200720072r00720072() ^ (-1146716830)), (char) (yyyllll.rrrr007200720072() ^ 383821866))) : null;
                LogBridge.d(uuxuuuu.pp0070p0070ppp("Qsum\u0002sxW}kwpd{", (char) (yllylll.r007200720072r00720072() ^ (-1146716758)), (char) (yyyllll.rrrr007200720072() ^ 383821926), (char) (yyyllll.rrrr007200720072() ^ 383821869)), uuxuuuu.pp0070p0070ppp("\u001e\u0010\u0017\u0018\u001e\f{\u000e\t\u001am\n\u0013\u0013\u0003\u000b\u0001\rA", (char) (ylyylll.r0072rrr00720072() ^ (-1691741266)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847167)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + aaaa00610061a() + uuxuuuu.pppp0070ppp("\u0016\u000e^fVd_Un0\u0017", (char) (yyyllll.rrrr007200720072() ^ 383821895), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))) + this.f0066f0066fff + uuxuuuu.pppp0070ppp(":u[uj\r", (char) (yllylll.r007200720072r00720072() ^ (-1146716687)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))) + windowManager + uuxuuuu.pppp0070ppp("I>\u0001\u0004\u000e\u0004\u0012\u0006\n\u0010Q", (char) (ylyylll.r0072rrr00720072() ^ (-1691741195)), (char) (yyyllll.rrrr007200720072() ^ 383821870)) + activity);
                if (this.f0066f0066fff != null && aaaa00610061a()) {
                    if (windowManager != null) {
                        try {
                            windowManager.removeView(this.f0066f0066fff);
                        } catch (Throwable th) {
                            LogBridge.d(uuxuuuu.pp0070p0070ppp("'LS7\u0015{yq\u0003\u0002|I#\r", (char) (yllylll.r007200720072r00720072() ^ (-1146716691)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741383)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), uuxuuuu.pp0070p0070ppp("Hz{se\u001aN\u0018\fq=%&]]At\u0003j_fH\n\u007f~9\u001f!\rSu", (char) (yylylll.r0072r0072r00720072() ^ (-1349847185)), (char) (yyyllll.rrrr007200720072() ^ 383821907), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + th);
                        }
                    }
                    this.f0066ff0066ff = null;
                    resetLastDown();
                }
                this.f0066f0066fff = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void resetLastDown() {
        setLastDown(getActivity(), -1L, -1.0d);
        int iAa00610061006100610061a = aa00610061006100610061a();
        if (((a0061a0061006100610061a + iAa00610061006100610061a) * iAa00610061006100610061a) % aa0061a006100610061a != 0) {
            a006100610061a00610061a = 76;
            aaaa006100610061a = 23;
        }
    }

    public final void setActivity(Context context) {
        synchronized (this.ff00660066fff) {
            this.f006600660066fff = context;
        }
    }

    public final boolean setLastDown(Context context, long j, double d) {
        LogBridge.d(uuxuuuu.pppp0070ppp("\u001e@B:VHM,J8D=9P", (char) (yyyllll.rrrr007200720072() ^ 383821839), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344))), uuxuuuu.pp0070p0070ppp(",\u001f/\b\u001e13\u0004091km\u007ff", (char) (yllylll.r007200720072r00720072() ^ (-1146716714)), (char) (yllylll.r007200720072r00720072() ^ (-1146716834)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))) + j);
        Object activity = getActivity();
        if ((activity == null || activity == context) && (j == -1 || Math.abs(j - this.f00660066ffff) >= 5)) {
            this.f00660066ffff = j;
            this.fff0066fff = d;
            if (!(activity instanceof odddddo)) {
                return true;
            }
            ((odddddo) activity).onLastDown(j);
            return true;
        }
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("\u0014\r\u001fjv|R%c%!.x\u0004", (char) (yyyllll.rrrr007200720072() ^ 383821958), (char) (ylyylll.r0072rrr00720072() ^ (-1691741284)), (char) (yyyllll.rrrr007200720072() ^ 383821867));
        StringBuilder sb = new StringBuilder();
        int i = a006100610061a00610061a;
        if (((a0061a0061006100610061a + i) * i) % aa0061a006100610061a != 0) {
            a006100610061a00610061a = 82;
            aaaa006100610061a = 94;
        }
        sb.append(uuxuuuu.pppp0070ppp("H9G\u001e2CC\u0012<C9i<3065)'m`$($#uZ", (char) (yllylll.r007200720072r00720072() ^ (-1146716766)), (char) (yyyllll.rrrr007200720072() ^ 383821868)));
        sb.append(Math.abs(j - this.f00660066ffff));
        LogBridge.d(strPp0070p0070ppp, sb.toString());
        return false;
    }
}
