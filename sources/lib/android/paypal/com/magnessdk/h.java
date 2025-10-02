package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.regex.Pattern;
import lib.android.paypal.com.magnessdk.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
final class h extends g {
    public JSONObject A;
    public JSONObject B;
    public JSONObject C;
    public JSONArray D;
    public JSONObject E;
    public JSONArray F;
    public e G;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public String s;
    public boolean t;
    public String u;
    public long v = -1;
    public long w = -1;
    public long x = -1;
    public JSONObject y;
    public JSONObject z;

    class a implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24895a;

        static {
            int[] iArr = new int[c.k.b.values().length];
            f24895a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24895a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24895a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24895a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24895a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24895a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24895a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static Boolean[] f24896a;

        /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String a(android.content.Context r10) throws android.content.pm.PackageManager.NameNotFoundException {
            /*
                Method dump skipped, instructions count: 393
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.h.c.a(android.content.Context):java.lang.String");
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static Boolean[] f24897a;

        public static String a(Context context) throws PackageManager.NameNotFoundException {
            boolean zExists;
            if (f24897a == null) {
                f24897a = new Boolean[7];
                int i = 0;
                while (i < 7) {
                    c.k.b bVar = i == 0 ? c.k.b.d : i == 1 ? c.k.b.e : i == 2 ? c.k.b.f : i == 3 ? c.k.b.g : i == 4 ? c.k.b.h : i == 5 ? c.k.b.i : i == 6 ? c.k.b.j : null;
                    if (bVar == null) {
                        return null;
                    }
                    int i2 = b.f24895a[bVar.ordinal()];
                    c.k kVar = c.k.SU_PATHS;
                    switch (i2) {
                        case 1:
                            String str = Build.TAGS;
                            zExists = str != null && str.contains("test-keys");
                            continue;
                            f24897a[i] = Boolean.valueOf(zExists);
                            i++;
                            break;
                        case 2:
                            try {
                                zExists = new File(b("suFileName")).exists();
                                continue;
                            } catch (Exception e) {
                                lib.android.paypal.com.magnessdk.log.a.b(e, d.class);
                                break;
                            }
                            f24897a[i] = Boolean.valueOf(zExists);
                            i++;
                        case 3:
                            try {
                                zExists = new File(b("superUserApk")).exists();
                                continue;
                            } catch (Exception e2) {
                                lib.android.paypal.com.magnessdk.log.a.b(e2, d.class);
                                break;
                            }
                            f24897a[i] = Boolean.valueOf(zExists);
                            i++;
                        case 4:
                            zExists = lib.android.paypal.com.magnessdk.filesystem.d.a(context, new ArrayList(Arrays.asList(c.k.KNOWN_ROOT_APPS_PACKAGES.d)));
                            continue;
                            f24897a[i] = Boolean.valueOf(zExists);
                            i++;
                        case 5:
                            zExists = lib.android.paypal.com.magnessdk.filesystem.c.c("su", kVar.d);
                            continue;
                            f24897a[i] = Boolean.valueOf(zExists);
                            i++;
                        case 6:
                            zExists = lib.android.paypal.com.magnessdk.filesystem.c.c("busybox", kVar.d);
                            continue;
                            f24897a[i] = Boolean.valueOf(zExists);
                            i++;
                        case 7:
                            zExists = lib.android.paypal.com.magnessdk.filesystem.c.c("magisk", kVar.d);
                            continue;
                            f24897a[i] = Boolean.valueOf(zExists);
                            i++;
                    }
                    zExists = false;
                    f24897a[i] = Boolean.valueOf(zExists);
                    i++;
                }
            }
            return f.c(f24897a);
        }

        public static String b(String str) throws IOException {
            Properties properties = new Properties();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("suFileName=/system/xbin/su\nsuperUserApk=/system/app/Superuser.apk\nemptyIp=0.0.0.0".getBytes("UTF-8"));
            try {
                try {
                    properties.load(byteArrayInputStream);
                } catch (Exception e) {
                    lib.android.paypal.com.magnessdk.log.a.b(e, d.class);
                }
                byteArrayInputStream.close();
                return properties.getProperty(str);
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        }
    }

    public static JSONArray i(MagnesSettings magnesSettings) throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            SensorManager sensorManager = (SensorManager) magnesSettings.c.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(4);
            Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
            if (defaultSensor != null) {
                JSONObject jSONObjectD = f.d(defaultSensor);
                jSONObjectD.put("t", "ac");
                jSONArray.put(jSONObjectD);
            }
            if (defaultSensor2 != null) {
                JSONObject jSONObjectD2 = f.d(defaultSensor2);
                jSONObjectD2.put("t", "gy");
                jSONArray.put(jSONObjectD2);
            }
            if (defaultSensor3 != null) {
                JSONObject jSONObjectD3 = f.d(defaultSensor3);
                jSONObjectD3.put("t", "mg");
                jSONArray.put(jSONObjectD3);
            }
            return jSONArray;
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, h.class);
            return null;
        }
    }

    public static int m(int i) throws Throwable {
        int length;
        int i2;
        File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
        if (fileArrListFiles == null) {
            length = 12345;
        } else if (i == 3) {
            length = fileArrListFiles.length;
        } else {
            int i3 = 0;
            if (i == 2) {
                int length2 = fileArrListFiles.length;
                i2 = Integer.MAX_VALUE;
                while (i3 < length2) {
                    String strE = lib.android.paypal.com.magnessdk.filesystem.c.e(new File(fileArrListFiles[i3].getPath() + "/cpufreq/cpuinfo_min_freq"));
                    if (strE == null || strE.equals("-403")) {
                        length = -403;
                        break;
                    }
                    int i4 = Integer.parseInt(strE);
                    if (i4 < i2) {
                        i2 = i4;
                    }
                    i3++;
                }
                length = i2;
            } else {
                if (i == 1) {
                    int length3 = fileArrListFiles.length;
                    i2 = 0;
                    while (i3 < length3) {
                        File file = new File(fileArrListFiles[i3].getPath() + "/cpufreq/cpuinfo_max_freq");
                        String strE2 = lib.android.paypal.com.magnessdk.filesystem.c.e(file);
                        if (strE2 == null || strE2.equals("-403")) {
                            length = -403;
                            break;
                        }
                        int i5 = Integer.parseInt(lib.android.paypal.com.magnessdk.filesystem.c.e(file));
                        if (i5 > i2) {
                            i2 = i5;
                        }
                        i3++;
                    }
                    length = i2;
                }
                length = 12345;
            }
        }
        if (length == 0 || length == Integer.MAX_VALUE) {
            return 12345;
        }
        return length;
    }

    public static JSONObject n() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        try {
            int iM = m(3);
            int iM2 = m(2);
            int iM3 = m(1);
            jSONObject.put("minFreq", g.b(Integer.valueOf(iM2)));
            jSONObject.put("maxFreq", g.b(Integer.valueOf(iM3)));
            jSONObject.put("cores", g.b(Integer.valueOf(iM)));
            return jSONObject;
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, h.class);
            return jSONObject;
        }
    }

    public static JSONObject p() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            String property = System.getProperty("os.name");
            String property2 = System.getProperty("os.version");
            if (TextUtils.isEmpty(property)) {
                property = "";
            }
            if (TextUtils.isEmpty(property2)) {
                property2 = "";
            }
            String str = property + " " + property2;
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("version", g.b(str.trim()));
            }
            jSONObject.put("board", g.b(Build.BOARD));
            jSONObject.put("bootloader", g.b(Build.BOOTLOADER));
            jSONObject.put("cpu_abi1", g.b(Build.SUPPORTED_ABIS[0]));
            jSONObject.put("display", g.b(Build.DISPLAY));
            jSONObject.put("radio", g.b(Build.getRadioVersion()));
            jSONObject.put("fingerprint", g.b(Build.FINGERPRINT));
            jSONObject.put("hardware", g.b(Build.HARDWARE));
            jSONObject.put("manufacturer", g.b(Build.MANUFACTURER));
            jSONObject.put("product", g.b(Build.PRODUCT));
            jSONObject.put("time", g.b(Long.valueOf(Build.TIME)));
            jSONObject.put("system_type", g.b(System.getProperty("os.arch")));
            return jSONObject;
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, h.class);
            return jSONObject;
        }
    }

    public static JSONObject r(Context context) throws JSONException {
        int iHeight;
        float f;
        int iWidth;
        int i;
        float f2;
        float f3;
        float f4;
        JSONObject jSONObject = new JSONObject();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                iWidth = bounds.width();
                iHeight = bounds.height();
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                int i2 = point.x;
                int i3 = point.y;
                iWidth = i2;
                iHeight = i3;
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f = displayMetrics.density;
            i = displayMetrics.densityDpi;
            f3 = displayMetrics.scaledDensity;
            f4 = displayMetrics.xdpi;
            f2 = displayMetrics.ydpi;
        } else {
            iHeight = 12345;
            f = 12345.0f;
            iWidth = 12345;
            i = 12345;
            f2 = 12345.0f;
            f3 = 12345.0f;
            f4 = 12345.0f;
        }
        try {
            jSONObject.put("width", g.b(Integer.valueOf(iWidth)));
            jSONObject.put("height", g.b(Integer.valueOf(iHeight)));
            jSONObject.put("density", g.b(Float.valueOf(f)));
            jSONObject.put("densityDpi", g.b(Integer.valueOf(i)));
            jSONObject.put("scale", g.b(Float.valueOf(f3)));
            jSONObject.put("xdpi", g.b(Float.valueOf(f4)));
            jSONObject.put("ydpi", g.b(Float.valueOf(f2)));
            return jSONObject;
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, h.class);
            return jSONObject;
        }
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_guid", this.c);
            jSONObject.put("app_id", this.d);
            jSONObject.put(nnlllnn.nnlllln.w007700770077www, this.i);
            jSONObject.put(k.a.q, this.e);
            long j = this.w;
            Long lValueOf = null;
            jSONObject.put("app_first_install_time", j == -1 ? null : Long.valueOf(j));
            long j2 = this.x;
            jSONObject.put("app_last_update_time", j2 == -1 ? null : Long.valueOf(j2));
            jSONObject.put("conf_url", this.n);
            jSONObject.put("comp_version", this.o);
            jSONObject.put("device_model", this.f);
            jSONObject.put(nnlllnn.nnlllln.ww0077w0077ww, this.g);
            jSONObject.put("gsf_id", this.j);
            jSONObject.put("is_emulator", this.r);
            jSONObject.put("ef", this.s);
            jSONObject.put("is_rooted", this.t);
            jSONObject.put("rf", this.u);
            jSONObject.put("os_type", "Android");
            jSONObject.put("os_version", this.h);
            jSONObject.put("payload_type", this.l);
            jSONObject.put("sms_enabled", this.q);
            jSONObject.put("mac_addrs", this.k);
            jSONObject.put("magnes_guid", this.y);
            int i = this.p;
            jSONObject.put("magnes_source", i == 0 ? null : Integer.valueOf(i));
            jSONObject.put("notif_token", (Object) null);
            jSONObject.put("source_app_version", this.m);
            long j3 = this.v;
            if (j3 != -1) {
                lValueOf = Long.valueOf(j3);
            }
            jSONObject.put("total_storage_space", lValueOf);
            jSONObject.put("nc", this.D);
            jSONObject.put("smd", this.F);
            jSONObject.put("screen", this.z);
            jSONObject.put("cpu", this.A);
            jSONObject.put("disk", this.B);
            jSONObject.put("system", this.C);
            jSONObject.put("user_agent", this.E);
            jSONObject.put("t", g.f24894a);
            return jSONObject;
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, h.class);
            return jSONObject;
        }
    }

    public final void k(int i, MagnesSettings magnesSettings) throws JSONException {
        try {
            Context context = magnesSettings.c;
            boolean z = true;
            switch (i) {
                case 1:
                    String strB = magnesSettings.b;
                    SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerAG", 0);
                    String string = sharedPreferences.getString("RiskManagerAG", "");
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (strB != null && !strB.equals(string)) {
                        editorEdit.putString("RiskManagerAG", strB);
                        editorEdit.apply();
                    } else if (string.equals("")) {
                        strB = f.b(true);
                        editorEdit.putString("RiskManagerAG", strB);
                        editorEdit.apply();
                    } else {
                        strB = string;
                    }
                    this.c = strB;
                    return;
                case 2:
                    this.d = context.getPackageName();
                    return;
                case 3:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.e = f.a(context);
                        return;
                    }
                    return;
                case 8:
                    this.o = "5.5.1.release";
                    return;
                case 9:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.n = "https://www.paypalobjects.com/rdaAssets/magnes/magnes_android_rec.json";
                        return;
                    }
                    return;
                case 14:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.f = Build.MODEL;
                        return;
                    }
                    return;
                case 15:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.g = Build.DEVICE;
                        return;
                    }
                    return;
                case 32:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                        boolean zD = d(context, "android.permission.ACCESS_WIFI_STATE");
                        String macAddress = null;
                        WifiInfo connectionInfo = zD ? wifiManager.getConnectionInfo() : null;
                        if (connectionInfo != null) {
                            macAddress = connectionInfo.getMacAddress();
                        }
                        this.k = macAddress;
                        return;
                    }
                    return;
                case 34:
                    this.G.getClass();
                    e.b.get(i);
                    return;
                case 37:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.h = Build.VERSION.RELEASE;
                        return;
                    }
                    return;
                case 38:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.l = "full";
                        return;
                    }
                    return;
                case 47:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.q = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
                        return;
                    }
                    return;
                case 52:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        StatFs statFs = new StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
                        this.v = statFs.getBlockSize() * statFs.getBlockCount();
                        return;
                    }
                    return;
                case 59:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        String strA = c.a(context);
                        if (strA == null || !strA.contains("1")) {
                            z = false;
                        }
                        this.r = z;
                        return;
                    }
                    return;
                case 60:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        String strA2 = d.a(context);
                        this.t = strA2 != null ? strA2.contains("1") : false;
                        return;
                    }
                    return;
                case 62:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.p = magnesSettings.f24889a;
                        return;
                    }
                    return;
                case 63:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.m = f.a(context);
                        return;
                    }
                    return;
                case 65:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.w = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                        return;
                    }
                    return;
                case 66:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.x = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
                        return;
                    }
                    return;
                case 69:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.i = Settings.Secure.getString(context.getContentResolver(), nnlllnn.nnlllln.w007700770077www);
                        return;
                    }
                    return;
                case 70:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.j = q(context);
                        return;
                    }
                    return;
                case 86:
                    JSONObject jSONObjectH = g.h(context);
                    this.y = jSONObjectH;
                    g.b = jSONObjectH.optString("id");
                    return;
                case 88:
                    this.G.getClass();
                    if (e.c) {
                        this.G.getClass();
                        this.D = e.d;
                        return;
                    }
                    return;
                case 90:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.A = n();
                        return;
                    }
                    return;
                case 91:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.z = r(context);
                        return;
                    }
                    return;
                case 93:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.B = o();
                        return;
                    }
                    return;
                case 94:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.C = p();
                        return;
                    }
                    return;
                case 95:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("dua", g.b(WebSettings.getDefaultUserAgent(context)));
                        } catch (Exception e) {
                            lib.android.paypal.com.magnessdk.log.a.b(e, h.class);
                        }
                        this.E = jSONObject;
                        return;
                    }
                    return;
                case 100:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.u = d.a(context);
                        return;
                    }
                    return;
                case 101:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.F = i(magnesSettings);
                        return;
                    }
                    return;
                case 103:
                    this.G.getClass();
                    if (e.b.get(i)) {
                        this.s = c.a(context);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.b(e2, h.class);
        }
        lib.android.paypal.com.magnessdk.log.a.b(e2, h.class);
    }

    public final void l(MagnesSettings magnesSettings, lib.android.paypal.com.magnessdk.d dVar, e eVar) {
        this.G = eVar;
        lib.android.paypal.com.magnessdk.log.a.a("collecting RiskBlobCoreData", 0, h.class);
        k(1, magnesSettings);
        k(2, magnesSettings);
        k(3, magnesSettings);
        k(65, magnesSettings);
        k(66, magnesSettings);
        k(69, magnesSettings);
        k(8, magnesSettings);
        k(9, magnesSettings);
        k(14, magnesSettings);
        k(15, magnesSettings);
        k(70, magnesSettings);
        k(59, magnesSettings);
        k(103, magnesSettings);
        k(60, magnesSettings);
        k(100, magnesSettings);
        k(32, magnesSettings);
        k(86, magnesSettings);
        k(62, magnesSettings);
        k(34, magnesSettings);
        k(37, magnesSettings);
        k(38, magnesSettings);
        k(63, magnesSettings);
        k(47, magnesSettings);
        k(52, magnesSettings);
        k(88, magnesSettings);
        g.f24894a = false;
        if (f(dVar, magnesSettings.f24889a, g.b, "hw", magnesSettings.c)) {
            k(91, magnesSettings);
            k(90, magnesSettings);
            k(93, magnesSettings);
            k(94, magnesSettings);
            k(95, magnesSettings);
            k(101, magnesSettings);
        }
        j();
    }

    public final JSONObject o() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        StatFs statFs = new StatFs(android.os.Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize() * statFs.getBlockCount();
        try {
            jSONObject.put("total_sd", g.b(Long.valueOf(a(601))));
            jSONObject.put("total", g.b(Long.valueOf(blockSize)));
            return jSONObject;
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, h.class);
            return jSONObject;
        }
    }

    public final String q(Context context) {
        Uri uri;
        try {
            uri = Uri.parse("content://com.google.android.gsf.gservices");
        } catch (Exception unused) {
            uri = null;
        }
        if (uri != null && d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES")) {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, new String[]{nnlllnn.nnlllln.w007700770077www}, null);
            try {
                if (cursorQuery != null) {
                    if (cursorQuery.moveToFirst() && cursorQuery.getColumnCount() >= 2) {
                        return Long.toHexString(Long.parseLong(cursorQuery.getString(1)));
                    }
                    return null;
                }
            } catch (NumberFormatException e) {
                lib.android.paypal.com.magnessdk.log.a.b(e, h.class);
                return null;
            } finally {
                cursorQuery.close();
            }
        }
        return null;
    }
}
