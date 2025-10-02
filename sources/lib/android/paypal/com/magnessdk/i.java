package lib.android.paypal.com.magnessdk;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.io.File;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
final class i extends g {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public ArrayList G;
    public ArrayList H;
    public ArrayList I;
    public long J;
    public long K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public NetworkInfo X;
    public WifiInfo Y;
    public long Z;
    public int a0;
    public int b0;
    public int c;
    public int c0;
    public long d;
    public int d0;
    public int e;
    public TelephonyManager e0;
    public int f;
    public WifiManager f0;
    public int g;
    public ConnectivityManager g0;
    public int h;
    public BatteryManager h0;
    public String i;
    public LocationManager i0;
    public String j;
    public PowerManager j0;
    public String k;
    public PackageManager k0;
    public String l;
    public Location l0;
    public String m;
    public JSONObject m0;
    public String n;
    public JSONObject n0;
    public String o;
    public JSONObject o0;
    public String p;
    public JSONObject p0;
    public String q;
    public JSONObject q0;
    public String r;
    public boolean r0;
    public String s;
    public e s0;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public static Location i(LocationManager locationManager) {
        Location lastKnownLocation = null;
        if (locationManager == null) {
            return null;
        }
        try {
            List<String> providers = locationManager.getProviders(true);
            for (int size = providers.size() - 1; size >= 0; size--) {
                lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
                if (lastKnownLocation != null) {
                    return lastKnownLocation;
                }
            }
            return lastKnownLocation;
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
            return null;
        }
    }

    public static String j(long j, String str, String str2, String str3) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        String strG;
        if (f.h(str) && f.h(str2) && f.h(Long.valueOf(j))) {
            strG = "invalid_input";
        } else {
            if (f.h(str)) {
                str = "";
            }
            if (f.h(str2)) {
                str2 = "";
            }
            strG = f.h(Long.valueOf(j)) ? YU.a.g(str, str2) : str + j + str2;
        }
        String str4 = new String(Base64.decode("SG1hY1NIQTI1Ng==", 2), "UTF-8");
        String str5 = f.h(Long.valueOf(j)) ? new String(Base64.decode(str3, 2), "UTF-8") : au.com.woolworths.shop.checkout.ui.confirmation.c.m(j, new String(Base64.decode(str3, 2), "UTF-8"), new StringBuilder());
        Mac mac = Mac.getInstance(str4);
        mac.init(new SecretKeySpec(str5.getBytes(), str4));
        byte[] bArrDoFinal = mac.doFinal(strG.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDoFinal) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString().substring(0, 32);
    }

    public static ArrayList k(WifiManager wifiManager) {
        String bssid;
        int i;
        if (wifiManager == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (scanResults == null || scanResults.size() == 0 || (bssid = wifiManager.getConnectionInfo().getBSSID()) == null || bssid.equals("00:00:00:00:00:00")) {
            return null;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < scanResults.size(); i4++) {
            if (!bssid.equals(scanResults.get(i4).BSSID) && i2 < (i = scanResults.get(i4).level)) {
                i3 = i4;
                i2 = i;
            }
        }
        arrayList.add(bssid);
        if (i3 != -1) {
            arrayList.add(scanResults.get(i3).BSSID);
        }
        return arrayList;
    }

    public static ArrayList l(boolean z) throws SocketException {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses != null && inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (z || !inetAddressNextElement.isLinkLocalAddress())) {
                        String hostAddress = inetAddressNextElement.getHostAddress();
                        if (inetAddressNextElement instanceof Inet6Address) {
                            arrayList3.add(hostAddress);
                        } else {
                            arrayList2.add(hostAddress);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                arrayList.addAll(arrayList3);
            }
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static JSONObject m(Context context, BatteryManager batteryManager, PowerManager powerManager) throws JSONException {
        int intExtra;
        int intExtra2;
        int intExtra3;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        JSONObject jSONObject = new JSONObject();
        int i = 12345;
        double d = 12345.0d;
        if (intentRegisterReceiver != null) {
            double intExtra4 = intentRegisterReceiver.getIntExtra("level", 12345);
            int intExtra5 = intentRegisterReceiver.getIntExtra("scale", 12345);
            intExtra2 = intentRegisterReceiver.getIntExtra("temperature", 12345);
            int intExtra6 = intentRegisterReceiver.getIntExtra("voltage", 12345);
            intExtra3 = intentRegisterReceiver.getIntExtra("status", 12345);
            intExtra = intentRegisterReceiver.getIntExtra("plugged", 12345);
            d = (intExtra4 == 12345.0d || intExtra5 == 12345) ? intExtra4 : intExtra4 / intExtra5;
            i = intExtra6;
        } else {
            intExtra = 12345;
            intExtra2 = 12345;
            intExtra3 = 12345;
        }
        int intProperty = batteryManager.getIntProperty(2);
        boolean zIsPowerSaveMode = powerManager.isPowerSaveMode();
        try {
            jSONObject.put("current", g.b(Integer.valueOf(intProperty)));
            jSONObject.put("level", new DecimalFormat(".##").format(g.b(Double.valueOf(d))));
            jSONObject.put("method", g.b(Integer.valueOf(intExtra)));
            jSONObject.put("low_power", g.b(Integer.valueOf(zIsPowerSaveMode ? 1 : 0)));
            jSONObject.put("state", g.b(Integer.valueOf(intExtra3)));
            jSONObject.put("temp", g.b(Integer.valueOf(intExtra2)));
            jSONObject.put("voltage", g.b(Integer.valueOf(i)));
            return jSONObject;
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
            return jSONObject;
        }
    }

    public static JSONObject n(Location location) {
        if (location != null) {
            try {
                return new JSONObject("{\"lat\":" + location.getLatitude() + ",\"lng\":" + location.getLongitude() + ",\"acc\":" + location.getAccuracy() + ",\"timestamp\":" + location.getTime() + "}");
            } catch (Exception e) {
                lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
            }
        }
        return null;
    }

    public static String p(String str) throws NoSuchAlgorithmException {
        if (str == null || str.isEmpty()) {
            str = "invalid input in dc method";
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes());
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString().substring(0, 32);
    }

    public static String s(Context context) {
        return context.getSharedPreferences("RiskManagerCT", 0).getInt("RiskManagerCT", 0) + "";
    }

    public static JSONObject v(Context context) throws JSONException {
        long j;
        long j2;
        JSONObject jSONObject = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long j3 = runtime.totalMemory();
        long jFreeMemory = runtime.freeMemory();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            j = memoryInfo.availMem;
            j2 = memoryInfo.totalMem;
        } else {
            j = 12345;
            j2 = 12345;
        }
        try {
            jSONObject.put("free", g.b(Long.valueOf(j)));
            jSONObject.put("total", g.b(Long.valueOf(j2)));
            jSONObject.put("free_runtime", g.b(Long.valueOf(jFreeMemory)));
            jSONObject.put("total_runtime", g.b(Long.valueOf(j3)));
            jSONObject.put("max_runtime", g.b(Long.valueOf(jMaxMemory)));
            return jSONObject;
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
            return jSONObject;
        }
    }

    public static String w() {
        String property;
        String property2 = System.getProperty("http.proxyHost");
        if (property2 == null || (property = System.getProperty("http.proxyPort")) == null) {
            return null;
        }
        return YU.a.i("host=", property2, ",port=", property);
    }

    public static String x() {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp() && !networkInterface.getInterfaceAddresses().isEmpty()) {
                    String name = networkInterface.getName();
                    String[] strArr = {"ppp", "tun", "tap", "ipsec", "utun"};
                    for (int i = 0; i < 5; i++) {
                        if (name.toLowerCase().startsWith(strArr[i])) {
                            return name;
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
            return null;
        }
    }

    public static JSONObject y(Context context) throws JSONException, Settings.SettingNotFoundException {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            i = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
            i = -403;
        }
        try {
            jSONObject.put("brightness", g.b(Integer.valueOf(i)));
        } catch (JSONException e2) {
            lib.android.paypal.com.magnessdk.log.a.b(e2, i.class);
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject z(android.content.Context r5) throws org.json.JSONException {
        /*
            java.lang.String r0 = "sensor"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.hardware.SensorManager r5 = (android.hardware.SensorManager) r5
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ac"
            r2 = 0
            r3 = 1
            if (r5 == 0) goto L1d
            android.hardware.Sensor r4 = r5.getDefaultSensor(r3)     // Catch: org.json.JSONException -> L1b
            if (r4 == 0) goto L1d
            r4 = r3
            goto L1e
        L1b:
            r5 = move-exception
            goto L42
        L1d:
            r4 = r2
        L1e:
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L1b
            java.lang.String r1 = "gy"
            if (r5 == 0) goto L2e
            r4 = 4
            android.hardware.Sensor r4 = r5.getDefaultSensor(r4)     // Catch: org.json.JSONException -> L1b
            if (r4 == 0) goto L2e
            r4 = r3
            goto L2f
        L2e:
            r4 = r2
        L2f:
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L1b
            java.lang.String r1 = "mg"
            if (r5 == 0) goto L3e
            r4 = 2
            android.hardware.Sensor r5 = r5.getDefaultSensor(r4)     // Catch: org.json.JSONException -> L1b
            if (r5 == 0) goto L3e
            r2 = r3
        L3e:
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1b
            return r0
        L42:
            java.lang.Class<lib.android.paypal.com.magnessdk.i> r1 = lib.android.paypal.com.magnessdk.i.class
            lib.android.paypal.com.magnessdk.log.a.b(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.i.z(android.content.Context):org.json.JSONObject");
    }

    public final void o(int i, MagnesSettings magnesSettings) {
        Context context;
        WifiInfo wifiInfo;
        TelephonyManager telephonyManager;
        WifiInfo wifiInfo2;
        TelephonyManager telephonyManager2;
        TelephonyManager telephonyManager3;
        String meid;
        try {
            try {
                context = magnesSettings.c;
            } catch (AssertionError e) {
                e = e;
                lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
            }
        } catch (Exception e2) {
            e = e2;
            lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
        }
        if (i == 4) {
            this.s0.getClass();
            if (e.e(i)) {
                this.c = this.b0;
                return;
            }
            return;
        }
        int i2 = 1;
        String bssid = null;
        simOperatorName = null;
        String networkOperator = null;
        ArrayList arrayList = null;
        String str = null;
        ssid = null;
        String ssid = null;
        String simOperatorName = null;
        bssid = null;
        if (i == 5) {
            this.s0.getClass();
            if (e.e(i)) {
                if (this.T && this.O) {
                    z = true;
                }
                if (z && (wifiInfo = this.Y) != null) {
                    bssid = wifiInfo.getBSSID();
                }
                this.i = bssid;
                return;
            }
            return;
        }
        if (i == 6) {
            this.s0.getClass();
            if (e.e(i)) {
                this.d = this.Z;
                return;
            }
            return;
        }
        if (i == 42) {
            this.s0.getClass();
            if (e.b.get(i)) {
                this.x = f.b(true);
                return;
            }
            return;
        }
        if (i == 43) {
            this.s0.getClass();
            if (e.b.get(i)) {
                this.L = new ServiceState().getRoaming();
                return;
            }
            return;
        }
        if (i == 45) {
            this.s0.getClass();
            if (e.b.get(i)) {
                TelephonyManager telephonyManager4 = this.e0;
                if (telephonyManager4 != null) {
                    try {
                        simOperatorName = telephonyManager4.getSimOperatorName();
                    } catch (Exception e3) {
                        lib.android.paypal.com.magnessdk.log.a.b(e3, i.class);
                    }
                }
                this.D = simOperatorName;
                return;
            }
            return;
        }
        if (i == 46) {
            this.s0.getClass();
            if (e.b.get(i) && this.Q && (telephonyManager = this.e0) != null) {
                if (Build.VERSION.SDK_INT < 29 || this.N) {
                    this.y = telephonyManager.getSimSerialNumber();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 48) {
            this.s0.getClass();
            if (e.b.get(i)) {
                if (this.T && this.O) {
                    z = true;
                }
                if (z && (wifiInfo2 = this.Y) != null) {
                    ssid = wifiInfo2.getSSID();
                }
                this.z = ssid;
                return;
            }
            return;
        }
        if (i == 49) {
            this.s0.getClass();
            if (e.b.get(i) && this.Q && (telephonyManager2 = this.e0) != null) {
                if (Build.VERSION.SDK_INT < 29 || this.N) {
                    this.A = telephonyManager2.getSubscriberId();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 71) {
            this.s0.getClass();
            if (e.b.get(i)) {
                this.n = x();
                return;
            }
            return;
        }
        if (i == 72) {
            this.s0.getClass();
            if (e.b.get(i)) {
                this.m = w();
                return;
            }
            return;
        }
        if (i == 84) {
            this.s0.getClass();
            if (e.b.get(i)) {
                if (this.T && this.P) {
                    z = true;
                }
                this.I = z ? k(this.f0) : null;
                return;
            }
            return;
        }
        if (i == 85) {
            this.C = j(this.J, this.F, this.k, this.s0.f24893a.optString("m", "QW5kcm9pZE1hZ25lcw=="));
            return;
        }
        if (i == 11) {
            this.s0.getClass();
            if (e.e(i)) {
                this.q = r();
                return;
            }
            return;
        }
        if (i == 13) {
            this.s0.getClass();
            if (e.e(i) && this.Q && (telephonyManager3 = this.e0) != null) {
                if (Build.VERSION.SDK_INT < 29 || this.N) {
                    if (telephonyManager3.getPhoneType() == 1) {
                        meid = this.e0.getImei();
                    } else if (this.e0.getPhoneType() != 2) {
                        return;
                    } else {
                        meid = this.e0.getMeid();
                    }
                    this.r = meid;
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            this.s0.getClass();
            if (e.e(i)) {
                this.K = SystemClock.uptimeMillis();
                return;
            }
            return;
        }
        if (i == 21) {
            this.s0.getClass();
            if (e.b.get(i)) {
                ArrayList arrayListL = l(false);
                if (arrayListL != null) {
                    str = (String) arrayListL.get(0);
                }
                this.s = str;
                return;
            }
            return;
        }
        if (i == 23) {
            this.s0.getClass();
            if (e.b.get(i)) {
                ArrayList arrayListQ = q();
                if (!arrayListQ.isEmpty()) {
                    arrayList = arrayListQ;
                }
                this.H = arrayList;
                return;
            }
            return;
        }
        if (i == 53) {
            this.s0.getClass();
            if (e.b.get(i)) {
                this.t = TimeZone.getDefault().getDisplayName(TimeZone.getDefault().inDaylightTime(new Date()), 1, Locale.ENGLISH);
                return;
            }
            return;
        }
        if (i == 68) {
            this.s0.getClass();
            if (e.b.get(i) && this.Q && this.e0 != null) {
                if (Build.VERSION.SDK_INT < 29 || this.N) {
                    this.l = Build.getSerial();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 75) {
            this.s0.getClass();
            if (e.b.get(i)) {
                this.G = l(true);
                return;
            }
            return;
        }
        if (i == 87) {
            this.E = u();
            return;
        }
        if (i == 89) {
            this.s0.getClass();
            if (e.b.get(i)) {
                this.m0 = m(context, this.h0, this.j0);
                return;
            }
            return;
        }
        if (i == 98) {
            this.s0.getClass();
            if (e.b.get(i)) {
                this.q0 = z(context);
                return;
            }
            return;
        }
        if (i == 99) {
            this.s0.getClass();
            if (e.b.get(i)) {
                this.W = Settings.Global.getInt(context.getContentResolver(), nnlllnn.nnlllln.www00770077ww, 0) != 0;
                return;
            }
            return;
        }
        switch (i) {
            case 27:
                this.s0.getClass();
                if (e.b.get(i)) {
                    this.u = Locale.getDefault().getCountry();
                    break;
                }
                break;
            case 28:
                this.s0.getClass();
                if (e.b.get(i)) {
                    this.v = Locale.getDefault().getLanguage();
                    break;
                }
                break;
            case 29:
                this.s0.getClass();
                if (e.b.get(i)) {
                    if (this.T && this.O) {
                        z = true;
                    }
                    this.l0 = z ? i(this.i0) : null;
                    break;
                }
                break;
            case 30:
                this.s0.getClass();
                if (e.b.get(i)) {
                    this.h = this.a0;
                    break;
                }
                break;
            default:
                switch (i) {
                    case 56:
                        this.s0.getClass();
                        if (e.b.get(i)) {
                            TelephonyManager telephonyManager5 = this.e0;
                            if (telephonyManager5 != null) {
                                networkOperator = telephonyManager5.getNetworkOperator();
                            }
                            this.j = networkOperator;
                            break;
                        }
                        break;
                    case 57:
                        this.s0.getClass();
                        if (e.b.get(i)) {
                            this.g = this.d0;
                            break;
                        }
                        break;
                    case 58:
                        this.s0.getClass();
                        if (e.b.get(i)) {
                            this.f = this.c0;
                            break;
                        }
                        break;
                    default:
                        switch (i) {
                            case 79:
                                this.s0.getClass();
                                if (e.b.get(i)) {
                                    this.M = TimeZone.getDefault().inDaylightTime(new Date());
                                    break;
                                }
                                break;
                            case 80:
                                this.s0.getClass();
                                if (e.b.get(i)) {
                                    this.e = TimeZone.getDefault().getOffset(new Date().getTime());
                                    break;
                                }
                                break;
                            case 81:
                                this.p = p(this.F + this.J);
                                break;
                            case 82:
                                this.s0.getClass();
                                if (e.b.get(i) && MagnesSDK.b().b.f24889a == 10) {
                                    SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerCT", 0);
                                    int i3 = sharedPreferences.getInt("RiskManagerCT", 0);
                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                    if (i3 > 0 && i3 < Integer.MAX_VALUE) {
                                        i2 = 1 + i3;
                                    }
                                    editorEdit.putInt("RiskManagerCT", i2);
                                    editorEdit.apply();
                                    this.o = s(context);
                                    break;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 91:
                                        this.s0.getClass();
                                        if (e.b.get(i)) {
                                            this.p0 = y(context);
                                            break;
                                        }
                                        break;
                                    case 92:
                                        this.s0.getClass();
                                        if (e.b.get(i)) {
                                            this.n0 = v(context);
                                            break;
                                        }
                                        break;
                                    case 93:
                                        this.s0.getClass();
                                        if (e.b.get(i)) {
                                            this.o0 = t(context);
                                            break;
                                        }
                                        break;
                                }
                        }
                }
        }
    }

    public final ArrayList q() {
        ArrayList arrayList = new ArrayList();
        try {
            e eVar = this.s0;
            eVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = eVar.f24893a.optJSONArray("android_apps_to_check");
            for (int i = 0; jSONArrayOptJSONArray != null && i < jSONArrayOptJSONArray.length(); i++) {
                arrayList2.add(jSONArrayOptJSONArray.getString(i));
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List<ResolveInfo> listQueryIntentActivities = this.k0.queryIntentActivities(new Intent().setComponent(ComponentName.unflattenFromString(str)), 65536);
                if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
            return arrayList;
        }
    }

    public final String r() {
        if (Build.VERSION.SDK_INT >= 29) {
            ConnectivityManager connectivityManager = this.g0;
            if (connectivityManager != null) {
                NetworkCapabilities networkCapabilities = this.V ? connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()) : null;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(0)) {
                        return "MOBILE";
                    }
                    if (networkCapabilities.hasTransport(1)) {
                        return "WIFI";
                    }
                    if (networkCapabilities.hasTransport(3)) {
                        return "Ethernet";
                    }
                    if (networkCapabilities.hasTransport(4)) {
                        return "VPN";
                    }
                    if (networkCapabilities.hasTransport(2)) {
                        return "Bluetooth Tethering";
                    }
                    if (networkCapabilities.hasTransport(5)) {
                        return "WIFI AWARE";
                    }
                    if (networkCapabilities.hasTransport(6)) {
                        return "LOW PAN";
                    }
                }
            }
        } else {
            NetworkInfo networkInfo = this.X;
            if (networkInfo != null) {
                return networkInfo.getTypeName();
            }
        }
        return null;
    }

    public final JSONObject t(Context context) throws JSONException {
        File file;
        JSONObject jSONObject = new JSONObject();
        boolean zEquals = android.os.Environment.getExternalStorageState().equals("mounted");
        File[] externalFilesDirs = context.getExternalFilesDirs("");
        boolean z = false;
        if (externalFilesDirs != null && externalFilesDirs.length > 1 && externalFilesDirs[0] != null && (file = externalFilesDirs[1]) != null && zEquals && android.os.Environment.isExternalStorageRemovable(file)) {
            z = true;
        }
        StatFs statFs = new StatFs(android.os.Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize() * statFs.getAvailableBlocks();
        long jA = a(600);
        try {
            jSONObject.put("mounted", z);
            jSONObject.put("free_sd", g.b(Long.valueOf(jA)));
            jSONObject.put("free", g.b(Long.valueOf(blockSize)));
            return jSONObject;
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, i.class);
            return jSONObject;
        }
    }

    public final String u() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.O ? 1 : 0);
        sb.append(this.Q ? 1 : 0);
        sb.append(this.U ? 1 : 0);
        sb.append(this.V ? 1 : 0);
        sb.append(this.R ? 1 : 0);
        sb.append(this.S ? 1 : 0);
        return sb.toString();
    }
}
