package YU;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.pm.ApplicationInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.format.Formatter;
import android.webkit.WebSettings;
import androidx.core.content.ContextCompat;
import au.com.woolworths.android.onesite.app.BaseShopApplication;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class Fl {
    public static int h = 3659;
    public static int i = 2390;

    /* renamed from: a, reason: collision with root package name */
    public final BaseShopApplication f8a;
    public final TelephonyManager b;
    public volatile Boolean c;
    public volatile Boolean d;
    public String e;
    public String f;
    public String g;

    class Ae implements Runnable {
        public Ae() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fl fl = Fl.this;
            Boolean bool = Boolean.FALSE;
            int i = Fl.h;
            fl.e(bool);
            Fl fl2 = Fl.this;
            Boolean bool2 = Boolean.TRUE;
            fl2.c = bool2;
            Fl.this.f();
            Fl.this.d = bool2;
        }
    }

    /* loaded from: classes2.dex */
    class Fm implements Runnable {
        public Fm() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fl fl = Fl.this;
            int i = Fl.h;
            try {
                fl.g = WebSettings.getDefaultUserAgent(fl.f8a);
            } catch (Exception unused) {
                fl.g = CircleProgressBar.a("44");
            }
            fl.e(Boolean.TRUE);
        }
    }

    public Fl(BaseShopApplication baseShopApplication) {
        Boolean bool = Boolean.FALSE;
        this.c = bool;
        this.d = bool;
        this.e = null;
        this.f = null;
        this.g = CircleProgressBar.a("44");
        this.f8a = baseShopApplication;
        this.b = (TelephonyManager) baseShopApplication.getSystemService(CircleProgressBar.a("impaH"));
        try {
            new Thread(new Ae()).start();
        } catch (Exception unused) {
        }
    }

    public static boolean j(BaseShopApplication baseShopApplication) {
        if (ContextCompat.a(baseShopApplication, CircleProgressBar.a("xk{}B@H\u0005RDRroWQJEW\u0016ubhyo}~dg")) != 0) {
            return false;
        }
        if ((h ^ 3659) == 0) {
            return true;
        }
        while (h + 26 != 15) {
        }
        while (true) {
            h = ((h * 45) >> 69) ^ 3710;
        }
    }

    public final String a() {
        try {
            if (j(this.f8a)) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                String str = "";
                if (defaultAdapter != null) {
                    Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
                    if (bondedDevices.size() > 0) {
                        Iterator<BluetoothDevice> it = bondedDevices.iterator();
                        while (it.hasNext()) {
                            str = str + "#" + it.next().getAddress();
                        }
                        return str.substring(1);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return CircleProgressBar.a("44");
    }

    public final String b() {
        try {
            return String.valueOf(Settings.Global.getInt(this.f8a.getContentResolver(), CircleProgressBar.a("xpk`r]EFG~ZphA"), 0) == 1);
        } catch (Exception unused) {
            return CircleProgressBar.a("44");
        }
    }

    public final String c() {
        try {
            List<ApplicationInfo> installedApplications = this.f8a.getPackageManager().getInstalledApplications(0);
            if (installedApplications.size() > 0) {
                String str = "";
                for (ApplicationInfo applicationInfo : installedApplications) {
                    if ((1 & applicationInfo.flags) == 0) {
                        str = str + "#" + applicationInfo.packageName;
                    }
                }
                return M.b(str.substring(1));
            }
        } catch (Exception unused) {
        }
        return CircleProgressBar.a("44");
    }

    public final String d() {
        try {
            return String.valueOf(Settings.Global.getFloat(this.f8a.getContentResolver(), CircleProgressBar.a("mw~a^@XBMO\u007f~hMOB^PWYqN_Z^T"), 1.0f));
        } catch (Exception unused) {
            return CircleProgressBar.a("44");
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:169)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException: Index 458 out of bounds for length 426
    	at jadx.core.dex.visitors.blocks.DominatorTree.build(DominatorTree.java:54)
    	at jadx.core.dex.visitors.blocks.PostDominatorTree.compute(PostDominatorTree.java:32)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:92)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
     */
    public final void e(java.lang.Boolean r22) {
        /*
            Method dump skipped, instructions count: 2292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: YU.Fl.e(java.lang.Boolean):void");
    }

    public final void f() {
        String strA;
        String strA2;
        String strA3;
        String strA4;
        String strA5;
        BluetoothAdapter defaultAdapter;
        StringBuilder sb = new StringBuilder();
        try {
            strA = CircleProgressBar.a("Xk{}B@H\u000b") + Build.VERSION.CODENAME + " " + Build.VERSION.RELEASE + CircleProgressBar.a("9DOF\r") + Build.VERSION.SDK_INT;
        } catch (Exception unused) {
            strA = CircleProgressBar.a("44");
        }
        a.y(sb, strA, ",");
        try {
            strA2 = Locale.getDefault().getLanguage() + Locale.getDefault().getCountry();
        } catch (Exception unused2) {
            strA2 = CircleProgressBar.a("44");
        }
        a.y(sb, strA2, ",");
        try {
            strA3 = String.valueOf(TimeZone.getDefault().getRawOffset() / 60000);
        } catch (Exception unused3) {
            strA3 = CircleProgressBar.a("44");
        }
        a.y(sb, strA3, ",");
        if (j(this.f8a) && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
            strA4 = defaultAdapter.getName();
            a.y(sb, strA4, ",");
            strA5 = Formatter.formatIpAddress(((WifiManager) this.f8a.getSystemService(CircleProgressBar.a("nlyf"))).getConnectionInfo().getIpAddress());
            sb.append(M.a(strA5));
            this.f = sb.toString();
            this.d = Boolean.TRUE;
        }
        if (i <= 2389) {
            while (true) {
                int i2 = i;
                int i3 = i2 + 26;
                if (i3 == 28) {
                    i = (i2 * 71) ^ 1135;
                    if ((h ^ 3659) != 0) {
                        while (true) {
                            int i4 = h;
                            int i5 = i4 + 39;
                            if (i5 == 9) {
                                while (true) {
                                    h = ((h + i4) + i4) >> 60;
                                }
                            } else if (i5 == 200) {
                                h = (i4 + i4) >> 100;
                            } else if (i5 == 246) {
                                while (true) {
                                    h = ((h >> 14) >> 123) % 23;
                                }
                            }
                        }
                    }
                } else if (i3 == 178) {
                    i = ((i2 % 118) >> 21) + i2;
                    if (h <= 3658) {
                        while (true) {
                            int i6 = h;
                            int i7 = i6 + 78;
                            if (i7 != 82) {
                                if (i7 == 174) {
                                    h = (i6 >> 20) + i6 + i6;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            h = (h * 62) ^ 3675;
                        }
                    }
                } else if (i3 == 307) {
                    break;
                } else if (i3 == 467) {
                    while (true) {
                        i = (i ^ 4169) >> 86;
                    }
                }
            }
            i = (i % 107) ^ 3639;
        }
        strA4 = CircleProgressBar.a("44");
        a.y(sb, strA4, ",");
        try {
            strA5 = Formatter.formatIpAddress(((WifiManager) this.f8a.getSystemService(CircleProgressBar.a("nlyf"))).getConnectionInfo().getIpAddress());
        } catch (Exception unused4) {
            strA5 = CircleProgressBar.a(")+/!\u001d\u0007\u001c");
        }
        sb.append(M.a(strA5));
        this.f = sb.toString();
        this.d = Boolean.TRUE;
    }

    public final synchronized String g() {
        String str;
        Boolean bool = Boolean.TRUE;
        synchronized (this) {
            try {
                if (!this.c.booleanValue() || this.e == null) {
                    e(bool);
                }
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final synchronized String h() {
        try {
            if (!this.d.booleanValue() || this.f == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f;
    }

    public final String i() {
        try {
            return String.valueOf(Settings.Secure.getInt(this.f8a.getContentResolver(), CircleProgressBar.a("kqkPNH@GKOG@kKFF"), 0));
        } catch (Exception unused) {
            return CircleProgressBar.a("44");
        }
    }

    public final String k(Boolean bool) {
        try {
            if (!bool.booleanValue()) {
                try {
                    this.g = WebSettings.getDefaultUserAgent(this.f8a);
                } catch (Exception unused) {
                    this.g = CircleProgressBar.a("44");
                }
            } else if (Objects.equals(this.g, CircleProgressBar.a("44"))) {
                new Thread(new Fm()).start();
            }
        } catch (Exception unused2) {
        }
        return this.g;
    }

    public final String l() {
        try {
            return String.valueOf(Settings.System.getInt(this.f8a.getContentResolver(), CircleProgressBar.a("{ijjYFC_J~DvuGMUOKYUGQUOK"), 0));
        } catch (Exception unused) {
            return CircleProgressBar.a("44");
        }
    }

    public final String m() {
        try {
            return String.valueOf(Settings.Global.getInt(this.f8a.getContentResolver(), CircleProgressBar.a("ndv{rOCY}EE}sCEFX"), 0));
        } catch (Exception unused) {
            return CircleProgressBar.a("44");
        }
    }
}
