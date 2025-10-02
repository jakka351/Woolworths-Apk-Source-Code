package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import androidx.compose.ui.input.pointer.a;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjx;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llllqql;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lqqlqql {
    private static final String r0072007200720072r0072 = "SecurityType";
    private static final String r00720072rr00720072 = "Open";
    private static final String r0072r00720072r0072 = lqlqqll.u00750075u00750075u(lqqlqql.class);
    private static final String r0072rrr00720072 = "WPA Compliant";
    private static final String rr007200720072r0072 = "WifiScan";
    private static final String rr0072rr00720072 = "WEP";
    private static final String rrrrr00720072 = "WPA";

    private lqqlqql() {
    }

    public static void j006A006A006A006Ajj(@Nonnull Context context) {
        nnlllnn.nnnllln nnnlllnVar = new nnlllnn.nnnllln(context);
        if (nnlllnn.nlnnlln.f0066f0066f0066f() && nnnlllnVar.fff006600660066f("android.permission.CHANGE_WIFI_STATE", context.getPackageName())) {
            try {
                WifiManager wifiManagerJjjj006A006Aj = jjjj006A006Aj(context);
                if (wifiManagerJjjj006A006Aj != null) {
                    wifiManagerJjjj006A006Aj.startScan();
                }
            } catch (SecurityException unused) {
                nlnnlnl.dd00640064d0064d("android.permission.CHANGE_WIFI_STATE", r0072r00720072r0072);
            } catch (Exception e) {
                lqlqqll.uuu007500750075u(r0072r00720072r0072, e.toString());
            }
        }
    }

    @Nullable
    private static Map<String, String> j006A006A006Aj006Aj(@Nonnull Context context, @Nullable String str) {
        WifiManager wifiManagerJjjj006A006Aj;
        String str2;
        nnlllnn.nnnllln nnnlllnVar = new nnlllnn.nnnllln(context);
        if (!nnlllnn.nlnnlln.ff00660066f0066f() || !nnnlllnVar.fff006600660066f("android.permission.ACCESS_WIFI_STATE", context.getPackageName()) || (wifiManagerJjjj006A006Aj = jjjj006A006Aj(context)) == null) {
            return null;
        }
        List<ScanResult> scanResults = wifiManagerJjjj006A006Aj.getScanResults();
        StringBuilder sb = new StringBuilder(scanResults.size() * 30);
        HashMap map = new HashMap(2);
        try {
            boolean z = true;
            for (ScanResult scanResult : scanResults) {
                String strJ006Aj006Aj006Aj = j006Aj006Aj006Aj(scanResult.BSSID);
                if (strJ006Aj006Aj006Aj != null) {
                    if (strJ006Aj006Aj006Aj.equals(str)) {
                        String str3 = scanResult.capabilities;
                        if (str3.contains(rrrrr00720072)) {
                            str2 = r0072rrr00720072;
                        } else if (str3.contains(rr0072rr00720072)) {
                            map.put(r0072007200720072r0072, rr0072rr00720072);
                        } else {
                            str2 = r00720072rr00720072;
                        }
                        map.put(r0072007200720072r0072, str2);
                    } else {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(":");
                        }
                        sb.append(strJ006Aj006Aj006Aj.replace(":", ""));
                        sb.append(";");
                        sb.append(scanResult.level);
                    }
                }
            }
            map.put(rr007200720072r0072, sb.toString());
            return map;
        } catch (SecurityException unused) {
            nlnnlnl.dd00640064d0064d("android.permission.ACCESS_WIFI_STATE", r0072r00720072r0072);
            return null;
        } catch (Exception e) {
            lqlqqll.uuu007500750075u(r0072r00720072r0072, e.toString());
            return null;
        }
    }

    @Nullable
    private static String j006A006Ajj006Aj(int i) {
        llllqql.llqlqql llqlqqlVar;
        if (i == -99) {
            return null;
        }
        if (i == 4) {
            llqlqqlVar = llllqql.llqlqql.MOBILE_DUN;
        } else if (i == 7) {
            llqlqqlVar = llllqql.llqlqql.BLUETOOTH;
        } else if (i == 9) {
            llqlqqlVar = llllqql.llqlqql.ETHERNET;
        } else if (i == 0) {
            llqlqqlVar = llllqql.llqlqql.CELLULAR;
        } else if (i == 1) {
            llqlqqlVar = llllqql.llqlqql.WIFI;
        } else {
            if (nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 < nnlllnn.nnnnnln.nnlnnln.ss00730073s00730073 || !llllqll.yy0079y007900790079(i)) {
                Field[] fieldArrSss0073ssss = jjxjxjx.sss0073ssss(jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.CONNECTIVITY_MANAGER));
                if (fieldArrSss0073ssss == null) {
                    return null;
                }
                for (Field field : fieldArrSss0073ssss) {
                    if (field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers())) {
                        try {
                            if (field.getInt(null) == i) {
                                String name = field.getName();
                                if (llqllqq.g006700670067006700670067g(name) && name.startsWith("TYPE_")) {
                                    return jj006A006A006Ajj(name);
                                }
                            } else {
                                continue;
                            }
                        } catch (Throwable unused) {
                            continue;
                        }
                    }
                }
                return null;
            }
            llqlqqlVar = llllqql.llqlqql.VPN;
        }
        return llqlqqlVar.getValue();
    }

    @Nullable
    public static String j006Aj006Aj006Aj(@Nullable String str) {
        if (llqllqq.ggggggg0067(str)) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    @Nullable
    public static String[] j006Ajjj006Aj(@Nonnull Context context) {
        if (!nnlllnn.nlnnlln.f00660066ff0066f()) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
        if (intentRegisterReceiver == null) {
            return null;
        }
        String[] strArr = new String[5];
        WifiInfo wifiInfo = (WifiInfo) intentRegisterReceiver.getParcelableExtra("wifiInfo");
        if (wifiInfo != null) {
            String strJ006Aj006Aj006Aj = j006Aj006Aj006Aj(wifiInfo.getBSSID());
            String strJj006A006Aj006Aj = jj006A006Aj006Aj(wifiInfo.getSSID());
            int rssi = wifiInfo.getRssi();
            if (strJ006Aj006Aj006Aj != null) {
                strArr[0] = strJ006Aj006Aj006Aj;
            }
            if (strJj006A006Aj006Aj != null) {
                strArr[1] = strJj006A006Aj006Aj;
            }
            strArr[2] = String.valueOf(rssi);
            strArr[3] = llllqql.llqlqql.WIFI.getValue();
            return strArr;
        }
        Bundle extras = intentRegisterReceiver.getExtras();
        NetworkInfo networkInfo = (NetworkInfo) extras.get("networkInfo");
        if (networkInfo == null) {
            return null;
        }
        if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
            String strJj006A006Aj006Aj2 = jj006A006Aj006Aj(networkInfo.getExtraInfo());
            String strJ006Aj006Aj006Aj2 = j006Aj006Aj006Aj((String) extras.get("bssid"));
            if (strJ006Aj006Aj006Aj2 != null) {
                strArr[0] = strJ006Aj006Aj006Aj2;
            }
            if (strJj006A006Aj006Aj2 != null) {
                strArr[1] = strJj006A006Aj006Aj2;
            }
            strArr[3] = llllqql.llqlqql.WIFI.getValue();
        }
        return strArr;
    }

    @Nullable
    public static String jj006A006A006Ajj(String str) {
        if (llqllqq.ggggggg0067(str)) {
            return null;
        }
        String strTrim = str.trim();
        if (llqllqq.ggggggg0067(strTrim)) {
            return null;
        }
        String lowerCase = strTrim.toLowerCase(Locale.US);
        if (lowerCase.startsWith("type")) {
            lowerCase = lowerCase.replaceFirst("type", "");
        }
        return lowerCase.replace("_", " ").trim();
    }

    @Nullable
    public static String jj006A006Aj006Aj(@Nullable String str) {
        if (str != null && !str.contains("unknown ssid") && str.length() >= 1) {
            if (str.charAt(0) == '\"') {
                str = str.substring(1);
            }
            if (str.length() >= 1 && str.charAt(str.length() - 1) == '\"') {
                str = a.h(1, 0, str);
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        return null;
    }

    @Nonnull
    public static llllqql jj006Ajj006Aj(@Nonnull Context context) throws InterruptedException {
        int dataState;
        jjxjjjx jjxjjjxVarWw0077w0077007700770077 = jjjjxjx.w00770077w0077007700770077().ww0077w0077007700770077();
        if (jjxjjjxVarWw0077w0077007700770077 != null) {
            jjxjjjxVarWw0077w0077007700770077.fetchVPNInfo(context);
        }
        llllqql llllqqlVar = new llllqql();
        boolean z = false;
        if (!llllqqlVar.jjj006A006Ajj(lllqlql.h0068hhhh0068().h00680068hhh0068()) && !llllqqlVar.jjj006A006Ajj(jjj006Aj006Aj(context))) {
            if (!llllqqlVar.jjj006A006Ajj(j006Ajjj006Aj(context))) {
                llllqqlVar.jjj006A006Ajj(jjjjj006Aj(context));
                z = true;
            }
            if (llllqqlVar.jj006A006Ajjj() == null) {
                try {
                    if (nnlllnn.nnlnnnl.f00660066f006600660066()) {
                        try {
                            Object systemService = context.getSystemService("phone");
                            if ((systemService instanceof TelephonyManager) && ((dataState = ((TelephonyManager) systemService).getDataState()) == 2 || dataState == 1 || dataState == 3)) {
                                llllqqlVar.j006A006Aj006Ajj(llllqql.llqlqql.CELLULAR.getValue());
                            }
                        } catch (SecurityException unused) {
                            nlnnlnl.dd00640064d0064d("phone", r0072r00720072r0072);
                        } catch (Exception e) {
                            lqlqqll.uuu007500750075u(r0072r00720072r0072, e.toString());
                        }
                    }
                } finally {
                    llllqqlVar.jjjj006Ajj();
                }
            }
        }
        if (llllqqlVar.j006A006A006Ajjj() == null && jjxjjjxVarWw0077w0077007700770077 != null && jjxjjjxVarWw0077w0077007700770077.isConnected()) {
            llllqqlVar.j006Aj006A006Ajj("true");
        }
        if (!z && llllqqlVar.j006A006A006Ajjj() == null) {
            llllqqlVar.jjj006A006Ajj(jjjjj006Aj(context));
        }
        Map<String, String> mapJ006A006A006Aj006Aj = j006A006A006Aj006Aj(context, llllqqlVar.h00680068h006800680068());
        if (mapJ006A006A006Aj006Aj != null && !mapJ006A006A006Aj006Aj.isEmpty()) {
            llllqqlVar.j006Ajj006Ajj(mapJ006A006A006Aj006Aj.get(rr007200720072r0072));
            llllqqlVar.jj006Aj006Ajj(mapJ006A006A006Aj006Aj.get(r0072007200720072r0072));
        }
        lqlqqll.llqqqll.yy00790079007900790079(r0072r00720072r0072, "Network Info (Final values) BSSID: " + llllqqlVar.h00680068h006800680068() + " SSID: " + llllqqlVar.j006Aj006Ajjj() + " RSSI: " + llllqqlVar.jj006Ajjjj() + " Type: " + llllqqlVar.jj006A006Ajjj());
        return llllqqlVar;
    }

    @Nullable
    public static String[] jjj006Aj006Aj(@Nonnull Context context) {
        String strJj006A006Aj006Aj;
        if (nnlllnn.nlnnlln.fff0066f0066f() && new nnlllnn.nnnllln(context).fff006600660066f("android.permission.ACCESS_WIFI_STATE", context.getPackageName())) {
            try {
                WifiManager wifiManagerJjjj006A006Aj = jjjj006A006Aj(context);
                if (wifiManagerJjjj006A006Aj == null) {
                    return null;
                }
                WifiInfo connectionInfo = wifiManagerJjjj006A006Aj.getConnectionInfo();
                String strJ006Aj006Aj006Aj = j006Aj006Aj006Aj(connectionInfo.getBSSID());
                if (strJ006Aj006Aj006Aj == null || (strJj006A006Aj006Aj = jj006A006Aj006Aj(connectionInfo.getSSID())) == null) {
                    return null;
                }
                int rssi = connectionInfo.getRssi();
                String[] strArr = new String[5];
                strArr[0] = strJ006Aj006Aj006Aj;
                strArr[1] = strJj006A006Aj006Aj;
                strArr[2] = String.valueOf(rssi);
                strArr[3] = llllqql.llqlqql.WIFI.getValue();
                return strArr;
            } catch (SecurityException unused) {
                nlnnlnl.dd00640064d0064d("android.permission.ACCESS_WIFI_STATE", r0072r00720072r0072);
            } catch (Exception e) {
                lqlqqll.uuu007500750075u(r0072r00720072r0072, e.toString());
            }
        }
        return null;
    }

    @Nullable
    private static WifiManager jjjj006A006Aj(@Nonnull Context context) {
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        if (systemService instanceof WifiManager) {
            return (WifiManager) systemService;
        }
        return null;
    }

    @Nullable
    public static String[] jjjjj006Aj(@Nonnull Context context) {
        if (!nnlllnn.nlnnlln.ff0066ff0066f()) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
        if (intentRegisterReceiver == null) {
            return null;
        }
        String[] strArr = new String[5];
        int intExtra = intentRegisterReceiver.getIntExtra("networkType", -99);
        Bundle extras = intentRegisterReceiver.getExtras();
        if (extras == null) {
            return null;
        }
        NetworkInfo networkInfo = (NetworkInfo) extras.get("networkInfo");
        if (networkInfo != null) {
            if (networkInfo.getState() != NetworkInfo.State.CONNECTED) {
                return null;
            }
            if (intExtra == -99) {
                try {
                    intExtra = networkInfo.getType();
                } catch (SecurityException e) {
                    nlnnlnl.ddd0064d0064d(e, r0072r00720072r0072);
                    return null;
                } catch (Exception e2) {
                    lqlqqll.uuu007500750075u(r0072r00720072r0072, e2.toString());
                    return null;
                }
            }
        }
        String strJ006A006Ajj006Aj = j006A006Ajj006Aj(intExtra);
        strArr[3] = strJ006A006Ajj006Aj;
        if (strJ006A006Ajj006Aj == null) {
            return null;
        }
        if (strJ006A006Ajj006Aj.equals(llllqql.llqlqql.WIFI.getValue())) {
            String strJj006A006Aj006Aj = networkInfo != null ? jj006A006Aj006Aj(networkInfo.getExtraInfo()) : null;
            String strJ006Aj006Aj006Aj = j006Aj006Aj006Aj((String) extras.get("bssid"));
            if (strJ006Aj006Aj006Aj != null) {
                strArr[0] = strJ006Aj006Aj006Aj;
            }
            if (strJj006A006Aj006Aj != null) {
                strArr[1] = strJj006A006Aj006Aj;
                return strArr;
            }
        } else if (strArr[3].equals(llllqql.llqlqql.VPN.getValue())) {
            strArr[4] = "true";
        }
        return strArr;
    }
}
