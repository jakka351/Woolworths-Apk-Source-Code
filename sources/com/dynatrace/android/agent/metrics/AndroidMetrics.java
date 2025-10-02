package com.dynatrace.android.agent.metrics;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.util.SdkVersionProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;

/* loaded from: classes.dex */
public class AndroidMetrics {
    public static final String u;
    public static volatile AndroidMetrics v;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14130a;
    public final BatteryTracker b;
    public final AppVersionTracker c;
    public Long d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public String l;
    public String m;
    public String n;
    public Long p;
    public String q;
    public String s;
    public AppVersion t;
    public volatile ConnectionType i = ConnectionType.OFFLINE;
    public String j = null;
    public int k = 0;
    public int o = Integer.MIN_VALUE;
    public ScreenMetrics r = null;

    /* renamed from: com.dynatrace.android.agent.metrics.AndroidMetrics$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14131a;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            f14131a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14131a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14131a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        boolean z = Global.f14077a;
        u = "dtxAndroidMetrics";
        v = null;
    }

    public AndroidMetrics(Context context) {
        BatteryTracker batteryTracker = null;
        this.f14130a = context;
        if (context == null) {
            this.c = null;
            this.b = null;
            return;
        }
        this.c = new AppVersionTracker(context, new SdkVersionProviderImpl());
        try {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            if (batteryManager != null) {
                batteryTracker = new BatteryTracker(batteryManager);
            } else if (Global.f14077a) {
                Utility.h("BatteryTracker", "unable to track the battery service");
            }
        } catch (Exception e) {
            if (Global.f14077a) {
                Utility.g(e, "BatteryTracker", "unable to track the battery service");
            }
        }
        this.b = batteryTracker;
    }

    public static AndroidMetrics a() {
        if (v == null) {
            synchronized (AndroidMetrics.class) {
                try {
                    if (v == null) {
                        v = new AndroidMetrics(AdkSettings.l.e);
                        v.c();
                    }
                } finally {
                }
            }
        }
        return v;
    }

    public final NetworkInfo b() {
        Context context = this.f14130a;
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            if (!Global.f14077a) {
                return null;
            }
            Utility.l(u, e.toString());
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public final void c() {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.metrics.AndroidMetrics.c():void");
    }

    public final void d() {
        Long lValueOf = Global.f14077a ? Long.valueOf(TimeLineProvider.b.a()) : 0L;
        String str = u;
        Context context = this.f14130a;
        if (context != null) {
            this.h = null;
            try {
                String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                if (networkOperatorName != null) {
                    this.h = Utility.e(250, networkOperatorName);
                }
            } catch (Exception e) {
                if (Global.f14077a) {
                    Utility.l(str, e.toString());
                }
            }
        }
        if (Global.f14077a) {
            Utility.h(str, "Basic metrics updated in " + (TimeLineProvider.b.a() - lValueOf.longValue()) + " ms");
        }
    }

    public final void e() {
        ConnectionType connectionType;
        String subtypeName;
        ActivityManager activityManager;
        Long lValueOf = Global.f14077a ? Long.valueOf(TimeLineProvider.b.a()) : 0L;
        NetworkInfo networkInfoB = b();
        if (networkInfoB != null && networkInfoB.isAvailable() && networkInfoB.isConnected()) {
            switch (networkInfoB.getType()) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                    connectionType = ConnectionType.MOBILE;
                    break;
                case 1:
                case 13:
                    connectionType = ConnectionType.WIFI;
                    break;
                case 6:
                case 7:
                case 8:
                default:
                    connectionType = ConnectionType.OTHER;
                    break;
                case 9:
                    connectionType = ConnectionType.LAN;
                    break;
            }
        } else {
            connectionType = ConnectionType.OFFLINE;
        }
        this.i = connectionType;
        int iOrdinal = this.i.ordinal();
        AppVersion appVersion = null;
        if (iOrdinal == 1) {
            switch (networkInfoB.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    subtypeName = "2G";
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    subtypeName = "3G";
                    break;
                case 13:
                case 18:
                case 19:
                    subtypeName = "4G";
                    break;
                case 20:
                    subtypeName = "5G";
                    break;
                default:
                    subtypeName = networkInfoB.getSubtypeName();
                    break;
            }
            this.j = subtypeName;
        } else if (iOrdinal == 2) {
            this.j = "802.11x";
        } else if (iOrdinal != 3) {
            this.j = null;
        } else {
            this.j = "Ethernet";
        }
        Context context = this.f14130a;
        if (context != null) {
            this.k = context.getResources().getConfiguration().orientation;
        }
        BatteryTracker batteryTracker = this.b;
        if (batteryTracker != null) {
            int i = Integer.MIN_VALUE;
            try {
                int intProperty = batteryTracker.f14134a.getIntProperty(4);
                if (intProperty >= 0 && intProperty <= 100) {
                    i = intProperty;
                } else if (Global.f14077a) {
                    Utility.h("BatteryTracker", "invalid battery level '" + intProperty + "' detected");
                }
            } catch (Exception e) {
                if (Global.f14077a) {
                    Utility.g(e, "BatteryTracker", "unable to determine the battery level");
                }
            }
            this.o = i;
        }
        try {
            activityManager = (ActivityManager) this.f14130a.getSystemService("activity");
        } catch (Exception e2) {
            if (Global.f14077a) {
                Utility.l(u, e2.toString());
            }
            activityManager = null;
        }
        if (activityManager == null) {
            this.p = null;
        } else {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.p = Long.valueOf(memoryInfo.availMem / llqqqql.c0063c0063c00630063);
        }
        AppVersionTracker appVersionTracker = this.c;
        if (appVersionTracker != null) {
            Context context2 = appVersionTracker.f14133a;
            try {
                PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? context2.getPackageManager().getPackageInfo(context2.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
                if (packageInfo != null) {
                    long longVersionCode = packageInfo.getLongVersionCode();
                    String str = packageInfo.versionName;
                    if (longVersionCode >= 1 && str != null) {
                        appVersion = new AppVersion(longVersionCode, str);
                    }
                }
            } catch (PackageManager.NameNotFoundException e3) {
                if (Global.f14077a) {
                    Utility.g(e3, AppVersionTracker.b, "Failed to determine app version from PackageInfo");
                }
            }
            this.t = appVersion;
        }
        if (Global.f14077a) {
            Utility.h(u, "Common metrics updated in " + (TimeLineProvider.b.a() - lValueOf.longValue()) + " ms");
        }
    }
}
