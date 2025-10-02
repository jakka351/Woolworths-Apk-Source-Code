package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class llllqql {
    public static final int r007200720072r0072r = 1;
    public static final int r00720072r00720072r = 5;
    private static final String r0072r007200720072r = lqlqqll.u00750075u00750075u(llllqql.class);
    public static final int r0072rr00720072r = 3;
    public static final int rr00720072r0072r = 0;
    public static final int rr0072r00720072r = 4;
    public static final int rrr007200720072r = -99;
    public static final int rrrr00720072r = 2;

    @Nullable
    private String r00720072rrr0072;

    @Nullable
    private String rr0072rrr0072;

    @Nullable
    private String rrr0072rr0072;

    @Nullable
    private String rr0072007200720072r = null;

    @Nullable
    private String r00720072007200720072r = null;

    @Nullable
    private String rrrrrr0072 = null;

    @Nullable
    private String r0072rrrr0072 = null;

    @Nullable
    private String r0072r0072rr0072 = null;

    @Nullable
    private String rr00720072rr0072 = null;

    @Nullable
    private String r007200720072rr0072 = null;

    public enum llqlqql {
        BLUETOOTH("bluetooth tethering"),
        CELLULAR("cellular"),
        MOBILE("mobile"),
        WIFI("wifi"),
        ETHERNET("ethernet"),
        VPN("vpn"),
        MOBILE_DUN("mobile_dun");

        public final String r00720072r0072r0072;

        llqlqql(String str) {
            this.r00720072r0072r0072 = str;
        }

        public static llqlqql valueOf(String str) {
            return (llqlqql) nlnnnnn.ooo006F006Foo(llqlqql.class, str);
        }

        public String getValue() {
            return this.r00720072r0072r0072;
        }
    }

    public static class lqllqql {

        @Nullable
        public final String r0072rr0072r0072;

        @Nonnull
        public final InetAddress[] rr0072r0072r0072;

        @Nonnull
        public final String rrrr0072r0072;

        public lqllqql(@Nonnull String str, @Nullable String str2, @Nonnull InetAddress[] inetAddressArr) {
            this.rrrr0072r0072 = str;
            this.r0072rr0072r0072 = str2;
            this.rr0072r0072r0072 = inetAddressArr;
        }
    }

    public llllqql() {
        this.rr0072rrr0072 = null;
        this.r00720072rrr0072 = null;
        this.rrr0072rr0072 = null;
        Map<String, Object> treeMap = new TreeMap<>();
        Map<String, Object> treeMap2 = new TreeMap<>();
        TreeMap treeMap3 = new TreeMap();
        lqllqql[] lqllqqlVarArrH00680068h00680068h = lllqlql.h00680068h00680068h();
        if (lqllqqlVarArrH00680068h00680068h == null || lqllqqlVarArrH00680068h00680068h.length <= 0) {
            j006Ajjjjj(treeMap, treeMap2, treeMap3);
        } else {
            for (lqllqql lqllqqlVar : lqllqqlVarArrH00680068h00680068h) {
                if (llqllqq.gg00670067006700670067g(lqllqqlVar.r0072rr0072r0072)) {
                    treeMap3.put(lqllqqlVar.r0072rr0072r0072, lqllqqlVar.rrrr0072r0072);
                }
                if (!lqllqqlVar.rrrr0072r0072.startsWith("dummy")) {
                    hh0068h006800680068(lqllqqlVar.rr0072r0072r0072, lqllqqlVar.rrrr0072r0072, treeMap, treeMap2);
                }
            }
        }
        this.rr0072rrr0072 = llqllqq.ggggg00670067g(treeMap);
        this.r00720072rrr0072 = llqllqq.gg0067gg00670067g(treeMap2, false, -1);
        this.rrr0072rr0072 = llqllqq.ggggg00670067g(treeMap3);
    }

    private void h0068hh006800680068(Enumeration<InetAddress> enumeration, String str, Map<String, Object> map, Map<String, Object> map2) {
        if (enumeration == null) {
            return;
        }
        while (enumeration.hasMoreElements()) {
            hhhh006800680068(enumeration.nextElement(), str, map, map2);
        }
    }

    private void hh0068h006800680068(InetAddress[] inetAddressArr, String str, Map<String, Object> map, Map<String, Object> map2) {
        if (inetAddressArr == null || inetAddressArr.length == 0) {
            return;
        }
        for (InetAddress inetAddress : inetAddressArr) {
            hhhh006800680068(inetAddress, str, map, map2);
        }
    }

    private void hhhh006800680068(InetAddress inetAddress, String str, Map<String, Object> map, Map<String, Object> map2) {
        if (inetAddress.isLoopbackAddress()) {
            return;
        }
        if (inetAddress instanceof Inet4Address) {
            map.put(inetAddress.getHostAddress(), str);
            return;
        }
        if (inetAddress instanceof Inet6Address) {
            String hostAddress = inetAddress.getHostAddress();
            int iIndexOf = hostAddress.indexOf("%");
            if (iIndexOf > 0) {
                hostAddress = hostAddress.substring(0, iIndexOf);
            }
            map2.put(hostAddress, str);
        }
    }

    @Nullable
    public String h00680068h006800680068() {
        return this.r00720072007200720072r;
    }

    @Nullable
    public String h0068h0068006800680068() {
        return this.r00720072rrr0072;
    }

    @Nullable
    public String hh00680068006800680068() {
        return this.rrr0072rr0072;
    }

    @Nullable
    public String hhh0068006800680068() {
        return this.rr0072rrr0072;
    }

    @Nullable
    public String j006A006A006Ajjj() {
        return this.rr00720072rr0072;
    }

    public void j006A006Aj006Ajj(String str) {
        this.rrrrrr0072 = str;
    }

    @Nullable
    public String j006A006Ajjjj() {
        return this.r0072r0072rr0072;
    }

    public void j006Aj006A006Ajj(String str) {
        this.rr00720072rr0072 = str;
    }

    @Nullable
    public String j006Aj006Ajjj() {
        return this.rr0072007200720072r;
    }

    public void j006Ajj006Ajj(String str) {
        this.r0072r0072rr0072 = str;
    }

    public void j006Ajjjjj(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    String name = networkInterfaceNextElement.getName();
                    if (networkInterfaceNextElement.getHardwareAddress() != null) {
                        String strG0067006700670067g0067g = llqllqq.g0067006700670067g0067g(networkInterfaceNextElement.getHardwareAddress());
                        if (llqllqq.gg00670067006700670067g(strG0067006700670067g0067g)) {
                            map3.put(strG0067006700670067g0067g, name);
                        }
                    }
                    if (!name.startsWith("dummy")) {
                        h0068hh006800680068(networkInterfaceNextElement.getInetAddresses(), name, map, map2);
                    }
                }
            }
        } catch (SocketException e) {
            lqlqqll.llqqqll.u0075u0075uuu(r0072r007200720072r, "Declared exception: Can't get IP Addresses due to SocketException :{} ", e.toString());
        } catch (Throwable th) {
            lqlqqll.llqqqll.uuu0075uuu(r0072r007200720072r, "Unexpected exception happened " + th);
        }
    }

    @Nullable
    public String jj006A006Ajjj() {
        return this.rrrrrr0072;
    }

    public void jj006Aj006Ajj(String str) {
        this.r007200720072rr0072 = str;
    }

    @Nullable
    public String jj006Ajjjj() {
        return this.r0072rrrr0072;
    }

    public boolean jjj006A006Ajj(@Nullable String[] strArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (strArr != null && strArr.length >= 5) {
            if (this.r00720072007200720072r == null && (str5 = strArr[0]) != null) {
                this.r00720072007200720072r = lqqlqql.j006Aj006Aj006Aj(str5);
            }
            if (this.rr0072007200720072r == null && (str4 = strArr[1]) != null) {
                this.rr0072007200720072r = lqqlqql.jj006A006Aj006Aj(str4);
            }
            if (this.r0072rrrr0072 == null && (str3 = strArr[2]) != null) {
                this.r0072rrrr0072 = str3;
            }
            if (this.rrrrrr0072 == null && (str2 = strArr[3]) != null) {
                this.rrrrrr0072 = str2;
            }
            if (this.rr00720072rr0072 == null && (str = strArr[4]) != null) {
                this.rr00720072rr0072 = str;
            }
        }
        return (this.r00720072007200720072r == null || this.rr0072007200720072r == null || this.r0072rrrr0072 == null || this.rrrrrr0072 == null) ? false : true;
    }

    @Nullable
    public String jjj006Ajjj() {
        return this.r007200720072rr0072;
    }

    public void jjjj006Ajj() {
        this.r00720072007200720072r = null;
        this.rr0072007200720072r = null;
        this.r0072rrrr0072 = null;
    }
}
