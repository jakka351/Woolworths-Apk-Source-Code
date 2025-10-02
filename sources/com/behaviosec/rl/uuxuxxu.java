package com.behaviosec.rl;

import YU.a;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class uuxuxxu {
    public static int g006700670067gg0067g = 2;
    public static int g00670067ggg0067g = 1;
    public static int gg00670067gg0067g = 0;
    public static int gg0067ggg0067g = 7;
    public static String j006Aj006A006Aj006A = uuxuuuu.pppp0070ppp("?\u000fJB\u0012", (char) (ylyylll.r0072rrr00720072() ^ (-1691741350)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)));
    public static String jj006A006A006Aj006A;

    static {
        int i = gg0067ggg0067g;
        if (((g00670067ggg0067g + i) * i) % g006700670067gg0067g != 0) {
            gg0067ggg0067g = 31;
            gg00670067gg0067g = 35;
        }
        jj006A006A006Aj006A = uuxuuuu.pp0070p0070ppp("`N)?6\u0005BD^=", (char) (yylylll.r0072r0072r00720072() ^ (-1349847095)), (char) (yyyllll.rrrr007200720072() ^ 383821898), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)));
    }

    private uuxuxxu() {
    }

    public static int g0067g0067gg0067g() {
        return 62;
    }

    public static int g0067gg0067g0067g() {
        return 1;
    }

    public static int ggg0067gg0067g() {
        return 2;
    }

    public static int gggg0067g0067g() {
        return 0;
    }

    private static JSONArray p0070007000700070ppp(JSONArray jSONArray, String str) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            int i2 = gg0067ggg0067g;
            if (((g00670067ggg0067g + i2) * i2) % g006700670067gg0067g != gg00670067gg0067g) {
                gg0067ggg0067g = g0067g0067gg0067g();
                gg00670067gg0067g = g0067g0067gg0067g();
            }
            if (str.equals(jSONArray2.getString(0))) {
                return jSONArray2;
            }
        }
        return null;
    }

    private static Map<String, JSONArray> p007000700070p0070pp(List<String> list, boolean z) throws Exception {
        int i;
        boolean z2 = z;
        HashMap map = new HashMap();
        int i2 = gg0067ggg0067g;
        if (((g00670067ggg0067g + i2) * i2) % g006700670067gg0067g != 0) {
            gg0067ggg0067g = g0067g0067gg0067g();
            gg00670067gg0067g = 90;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator<String> it = list.iterator();
        long j = -1;
        while (it.hasNext()) {
            JSONArray jSONArray = new JSONArray(it.next());
            int i3 = -1349847050;
            JSONArray jSONArrayP0070007000700070ppp = p0070007000700070ppp(jSONArray, uuxuuuu.pppp0070ppp("9", (char) (yylylll.r0072r0072r00720072() ^ (-1349847246)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))));
            if (jSONArrayP0070007000700070ppp == null) {
                throw new Exception(uuxuuuu.pp0070p0070ppp("\u0018A\f\u0017D\u0013\u0010\u001b\u001c\u0013\u0019\u0013", (char) (yyyllll.rrrr007200720072() ^ 383821970), (char) (yllylll.r007200720072r00720072() ^ (-1146716692)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))));
            }
            String string = jSONArrayP0070007000700070ppp.getString(2);
            if (!p0070p007000700070pp(map3, string) || !pp0070pp0070pp(jSONArray)) {
                int iPpppp0070pp = ppppp0070pp(map2, string, pp007000700070ppp(jSONArray));
                int i4 = 0;
                long j2 = j;
                int i5 = 0;
                while (i5 < jSONArray.length()) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i5);
                    String string2 = jSONArray2.getString(i4);
                    JSONArray jSONArray3 = (JSONArray) map.get(string2);
                    int i6 = i3;
                    if (jSONArray3 == null) {
                        map.put(string2, jSONArray2);
                        if (string2.equals(uuxuuuu.pp0070p0070ppp("}", (char) (yyyllll.rrrr007200720072() ^ 383821869), (char) (yyyllll.rrrr007200720072() ^ 383822043), (char) (yllylll.r007200720072r00720072() ^ (-1146716789)))) || string2.equals(uuxuuuu.pppp0070ppp("=H", (char) (ylyylll.r0072rrr00720072() ^ (-1691741394)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)))) || string2.equals(uuxuuuu.pppp0070ppp("\u001f\u0012", (char) (ylyylll.r0072rrr00720072() ^ (-1691741251)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))))) {
                            p00700070p00700070pp(jSONArray2.getJSONArray(1), string, iPpppp0070pp, z2);
                        } else if (string2.equals(uuxuuuu.pppp0070ppp("\b", (char) (ylyylll.r0072rrr00720072() ^ (-1691741256)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))))) {
                            if (j2 != -1) {
                                throw new Exception(uuxuuuu.pppp0070ppp("\u001dAA\\>JM", (char) (ylyylll.r0072rrr00720072() ^ (-1691741308)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))));
                            }
                            j2 = jSONArray2.getJSONArray(3).getJSONArray(0).getLong(2);
                            pp0070p00700070pp(jSONArray2.getJSONArray(3), string);
                        } else if (string2.equals(uuxuuuu.pppp0070ppp("\u0018", (char) (yllylll.r007200720072r00720072() ^ (-1146716860)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)))) || string2.equals(uuxuuuu.pppp0070ppp("ga", (char) (yylylll.r0072r0072r00720072() ^ (-1349847053)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049)))) || string2.equals(uuxuuuu.pppp0070ppp("v~", (char) (yylylll.r0072r0072r00720072() ^ (-1349847046)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))))) {
                            jSONArray2.put(1, p0070ppp0070pp(jSONArray2.getString(1), string, iPpppp0070pp, z2));
                            int i7 = gg0067ggg0067g;
                            if (((g00670067ggg0067g + i7) * i7) % g006700670067gg0067g != gg00670067gg0067g) {
                                gg0067ggg0067g = g0067g0067gg0067g();
                                gg00670067gg0067g = 85;
                            }
                            map.put(string2, new JSONArray().put(jSONArray2));
                        }
                    } else {
                        if (!string2.equals(uuxuuuu.pppp0070ppp("\u0012\u001a", (char) (yylylll.r0072r0072r00720072() ^ (-1349847260)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046)))) && !string2.equals(uuxuuuu.pppp0070ppp("pm", (char) (yllylll.r007200720072r00720072() ^ (-1146716814)), (char) (yyyllll.rrrr007200720072() ^ 383821858))) && !string2.equals(uuxuuuu.pppp0070ppp("CA", (char) (yllylll.r007200720072r00720072() ^ (-1146716757)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)))) && !string2.equals(uuxuuuu.pp0070p0070ppp("\u0001\u0005", (char) (yylylll.r0072r0072r00720072() ^ (-1349847250)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741284)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))))) {
                            if (string2.equals(uuxuuuu.pppp0070ppp("\u001f", (char) (ylyylll.r0072rrr00720072() ^ (-1691741362)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332)))) || string2.equals(uuxuuuu.pp0070p0070ppp(":E", (char) (yllylll.r007200720072r00720072() ^ (-1146716862)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)), (char) (yyyllll.rrrr007200720072() ^ 383821864))) || string2.equals(uuxuuuu.pppp0070ppp("\u0004x", (char) (yylylll.r0072r0072r00720072() ^ (-1349847178)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))))) {
                                i = i5;
                                pppp00700070pp(jSONArray3.getJSONArray(1), jSONArray2.getJSONArray(1), string, iPpppp0070pp, string2.equals(uuxuuuu.pp0070p0070ppp("\u0015", (char) (yyyllll.rrrr007200720072() ^ 383821850), (char) (yylylll.r0072r0072r00720072() ^ (-1349847080)), (char) (yylylll.r0072r0072r00720072() ^ i6))), z2);
                            } else if (string2.equals(uuxuuuu.pppp0070ppp("\u0003", (char) (ylyylll.r0072rrr00720072() ^ (-1691741348)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))))) {
                                long j3 = jSONArray2.getJSONArray(3).getJSONArray(0).getLong(2) - j2;
                                if (j3 < 0) {
                                    throw new Exception(uuxuuuu.pp0070p0070ppp("kmu~lf-J/@", (char) (yllylll.r007200720072r00720072() ^ (-1146716781)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741189)), (char) (yyyllll.rrrr007200720072() ^ 383821866)));
                                }
                                ppp0070p0070pp(jSONArray3.getJSONArray(3), jSONArray2.getJSONArray(3), string, j3);
                            } else if (string2.equals(uuxuuuu.pppp0070ppp("!#", (char) (yllylll.r007200720072r00720072() ^ (-1146716749)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))))) {
                                p0070p0070p0070pp(jSONArray3.getJSONObject(1), jSONArray2.getJSONObject(1));
                            } else if (string2.equals(uuxuuuu.pppp0070ppp("=", (char) (yllylll.r007200720072r00720072() ^ (-1146716866)), (char) (yyyllll.rrrr007200720072() ^ 383821865))) || string2.equals(uuxuuuu.pppp0070ppp("qk", (char) (yylylll.r0072r0072r00720072() ^ (-1349847295)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)))) || string2.equals(uuxuuuu.pppp0070ppp("\b\u000e", (char) (ylyylll.r0072rrr00720072() ^ (-1691741370)), (char) (yyyllll.rrrr007200720072() ^ 383821867)))) {
                                pp00700070p0070pp(jSONArray3, jSONArray2, p0070ppp0070pp(jSONArray2.getString(1), string, iPpppp0070pp, z2), z2);
                            }
                        }
                        i5 = i + 1;
                        z2 = z;
                        i3 = i6;
                        i4 = 0;
                    }
                    i = i5;
                    i5 = i + 1;
                    z2 = z;
                    i3 = i6;
                    i4 = 0;
                }
                z2 = z;
                j = j2;
            }
        }
        return map;
    }

    private static void p00700070p00700070pp(JSONArray jSONArray, String str, int i, boolean z) throws JSONException {
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                int i3 = gg0067ggg0067g;
                if (((g00670067ggg0067g + i3) * i3) % g006700670067gg0067g != gg00670067gg0067g) {
                    gg0067ggg0067g = 87;
                    gg00670067gg0067g = g0067g0067gg0067g();
                }
                jSONObject2.put(p0070ppp0070pp(next, str, i, z), obj);
            }
            jSONArray.put(i2, jSONObject2);
        }
    }

    public static JSONArray p00700070pp0070pp(List<String> list, String str, boolean z) throws Exception {
        try {
            throw null;
        } catch (Exception unused) {
            gg0067ggg0067g = g0067g0067gg0067g();
            return null;
        }
    }

    private static boolean p0070p007000700070pp(Map<String, Boolean> map, String str) {
        if (map.containsKey(str)) {
            return true;
        }
        int i = gg0067ggg0067g;
        if (((g00670067ggg0067g + i) * i) % g006700670067gg0067g != 0) {
            gg0067ggg0067g = g0067g0067gg0067g();
            gg00670067gg0067g = 2;
        }
        map.put(str, Boolean.TRUE);
        return false;
    }

    private static JSONArray p0070p00700070ppp(Map<String, JSONArray> map, String str) throws JSONException {
        StringBuilder sbS = a.s(str);
        sbS.append(uuxuuuu.pp0070p0070ppp("nu|\nq 2", (char) (yllylll.r007200720072r00720072() ^ (-1146716906)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741301)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))));
        String string = sbS.toString();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(map.get(uuxuuuu.pppp0070ppp("{\u0002", (char) (ylyylll.r0072rrr00720072() ^ (-1691741221)), (char) (yyyllll.rrrr007200720072() ^ 383821867))));
        JSONArray jSONArray2 = map.get(uuxuuuu.pppp0070ppp("=~", (char) (yyyllll.rrrr007200720072() ^ 383821875), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))));
        if (jSONArray2 != null) {
            jSONArray.put(jSONArray2);
        }
        JSONArray jSONArray3 = map.get(uuxuuuu.pp0070p0070ppp("zz", (char) (yyyllll.rrrr007200720072() ^ 383821949), (char) (yllylll.r007200720072r00720072() ^ (-1146716876)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))));
        if (jSONArray3 != null) {
            jSONArray.put(jSONArray3);
        }
        JSONArray jSONArray4 = map.get(uuxuuuu.pp0070p0070ppp("cg", (char) (ylyylll.r0072rrr00720072() ^ (-1691741246)), (char) (yllylll.r007200720072r00720072() ^ (-1146716767)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))));
        if (jSONArray4 != null) {
            jSONArray.put(jSONArray4);
        }
        JSONArray jSONArray5 = map.get(uuxuuuu.pppp0070ppp("E", (char) (yyyllll.rrrr007200720072() ^ 383821920), (char) (yyyllll.rrrr007200720072() ^ 383821866)));
        if (jSONArray5 != null) {
            jSONArray.put(jSONArray5);
        }
        JSONArray jSONArray6 = map.get(uuxuuuu.pppp0070ppp("S", (char) (yyyllll.rrrr007200720072() ^ 383821960), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))));
        if (jSONArray6 != null) {
            jSONArray.put(jSONArray6);
            jSONArray6.put(2, string);
        }
        JSONArray jSONArray7 = map.get(uuxuuuu.pp0070p0070ppp("\u0019$", (char) (yylylll.r0072r0072r00720072() ^ (-1349847140)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741398)), (char) (yyyllll.rrrr007200720072() ^ 383821864)));
        if (jSONArray7 != null) {
            jSONArray.put(jSONArray7);
        }
        JSONArray jSONArray8 = map.get(uuxuuuu.pp0070p0070ppp("H;", (char) (yllylll.r007200720072r00720072() ^ (-1146716870)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741202)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))));
        if (jSONArray8 != null) {
            jSONArray.put(jSONArray8);
        }
        JSONArray jSONArray9 = map.get(uuxuuuu.pppp0070ppp("PP", (char) (yylylll.r0072r0072r00720072() ^ (-1349847193)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))));
        if (jSONArray9 != null) {
            jSONArray.put(jSONArray9);
            jSONArray9.getJSONObject(1).put(uuxuuuu.pppp0070ppp("?f(BY*\u0007m", (char) (yllylll.r007200720072r00720072() ^ (-1146716903)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))), string);
        }
        JSONArray jSONArray10 = map.get(uuxuuuu.pppp0070ppp("#", (char) (yllylll.r007200720072r00720072() ^ (-1146716878)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))));
        if (jSONArray10 != null) {
            p0070pp00700070pp(jSONArray, jSONArray10);
        }
        JSONArray jSONArray11 = map.get(uuxuuuu.pp0070p0070ppp("\n\u0006", (char) (ylyylll.r0072rrr00720072() ^ (-1691741239)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))));
        if (jSONArray11 != null) {
            p0070pp00700070pp(jSONArray, jSONArray11);
        }
        JSONArray jSONArray12 = map.get(uuxuuuu.pppp0070ppp("17", (char) (yyyllll.rrrr007200720072() ^ 383821937), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))));
        if (jSONArray12 != null) {
            p0070pp00700070pp(jSONArray, jSONArray12);
        }
        return jSONArray;
    }

    private static void p0070p0070p0070pp(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        p0070pp00700070pp(jSONObject.getJSONArray(uuxuuuu.pp0070p0070ppp("J9gh\u000e", (char) (yllylll.r007200720072r00720072() ^ (-1146716835)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847185)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)))), jSONObject2.getJSONArray(uuxuuuu.pp0070p0070ppp("f\u001eDRw", (char) (yyyllll.rrrr007200720072() ^ 383822043), (char) (ylyylll.r0072rrr00720072() ^ (-1691741257)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)))));
        p0070pp00700070pp(jSONObject.getJSONArray(uuxuuuu.pppp0070ppp("\u0016\u0010\u0019\u0006\u000ef\u001b\u000b\u0015", (char) (ylyylll.r0072rrr00720072() ^ (-1691741368)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049)))), jSONObject2.getJSONArray(uuxuuuu.pppp0070ppp("\u001b\u0015\u001a\u0007\u000bc\u0014\u0004\n", (char) (ylyylll.r0072rrr00720072() ^ (-1691741310)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335)))));
        p0070pp00700070pp(jSONObject.getJSONArray(uuxuuuu.pppp0070ppp("ak", (char) (yllylll.r007200720072r00720072() ^ (-1146716682)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)))), jSONObject2.getJSONArray(uuxuuuu.pp0070p0070ppp("\u0011\u001b", (char) (yllylll.r007200720072r00720072() ^ (-1146716766)), (char) (yyyllll.rrrr007200720072() ^ 383822066), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332)))));
        JSONArray jSONArray = jSONObject.getJSONArray(uuxuuuu.pp0070p0070ppp("7J", (char) (yylylll.r0072r0072r00720072() ^ (-1349847095)), (char) (yyyllll.rrrr007200720072() ^ 383821888), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))));
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821874);
        char cRrrr0072007200722 = (char) (yyyllll.rrrr007200720072() ^ 383821905);
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        if (((g0067gg0067g0067g() + gg0067ggg0067g) * gg0067ggg0067g) % g006700670067gg0067g != gg00670067gg0067g) {
            gg0067ggg0067g = g0067g0067gg0067g();
            gg00670067gg0067g = g0067g0067gg0067g();
        }
        p0070pp00700070pp(jSONArray, jSONObject2.getJSONArray(uuxuuuu.pp0070p0070ppp("\u0006\u0019", cRrrr007200720072, cRrrr0072007200722, (char) (iR0072r0072r00720072 ^ (-1349847053)))));
    }

    private static void p0070pp00700070pp(JSONArray jSONArray, JSONArray jSONArray2) throws JSONException {
        for (int i = 0; i < jSONArray2.length(); i++) {
            jSONArray.put(jSONArray2.get(i));
            int i2 = gg0067ggg0067g;
            if (((g00670067ggg0067g + i2) * i2) % g006700670067gg0067g != 0) {
                gg0067ggg0067g = 89;
                gg00670067gg0067g = g0067g0067gg0067g();
            }
        }
    }

    private static String p0070ppp0070pp(String str, String str2, int i, boolean z) {
        int iIndexOf = str.indexOf(uuxuuuu.pppp0070ppp("@\u0012!", (char) (yllylll.r007200720072r00720072() ^ (-1146716780)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))));
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int i2 = gg0067ggg0067g;
        if (((g00670067ggg0067g + i2) * i2) % ggg0067gg0067g() != 0) {
            gg0067ggg0067g = 71;
            g00670067ggg0067g = g0067g0067gg0067g();
        }
        return z ? String.format(jj006A006A006Aj006A, str2, str, Integer.valueOf(i)) : String.format(j006Aj006A006Aj006A, str2, str);
    }

    private static boolean pp007000700070ppp(JSONArray jSONArray) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = gg0067ggg0067g;
            if (((g00670067ggg0067g + i2) * i2) % g006700670067gg0067g != 0) {
                gg0067ggg0067g = 82;
                gg00670067gg0067g = 53;
            }
            String string = jSONArray.getJSONArray(i).getString(0);
            if (string.equals(uuxuuuu.pppp0070ppp(RequestConfiguration.MAX_AD_CONTENT_RATING_G, (char) (yllylll.r007200720072r00720072() ^ (-1146716906)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)))) || string.equals(uuxuuuu.pppp0070ppp("]W", (char) (yyyllll.rrrr007200720072() ^ 383821864), (char) (yyyllll.rrrr007200720072() ^ 383821865))) || string.equals(uuxuuuu.pp0070p0070ppp("+\u000f", (char) (ylyylll.r0072rrr00720072() ^ (-1691741395)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847176)), (char) (383821865 ^ yyyllll.rrrr007200720072())))) {
                return true;
            }
        }
        return false;
    }

    private static void pp00700070p0070pp(JSONArray jSONArray, JSONArray jSONArray2, String str, boolean z) throws JSONException {
        if (!z) {
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused) {
                    gg0067ggg0067g = 37;
                    try {
                        throw null;
                    } catch (Exception unused2) {
                        gg0067ggg0067g = 71;
                        try {
                            throw null;
                        } catch (Exception unused3) {
                            gg0067ggg0067g = 62;
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONArray jSONArray3 = jSONArray.getJSONArray(i);
                                if (str.equals(jSONArray3.getString(1))) {
                                    p0070pp00700070pp(jSONArray3.getJSONArray(2), jSONArray2.getJSONArray(2));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        jSONArray2.put(1, str);
        jSONArray.put(jSONArray2);
    }

    private static void pp0070p00700070pp(JSONArray jSONArray, String str) throws JSONException {
        int i = gg0067ggg0067g;
        if (((g00670067ggg0067g + i) * i) % g006700670067gg0067g != gggg0067g0067g()) {
            gg0067ggg0067g = 12;
            gg00670067gg0067g = 48;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
            String strOptString = jSONArray2.optString(0);
            if (strOptString.equals(uuxuuuu.pppp0070ppp("\b", (char) (yllylll.r007200720072r00720072() ^ (-1146716716)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053)))) || strOptString.equals(uuxuuuu.pp0070p0070ppp("S", (char) (yylylll.r0072r0072r00720072() ^ (-1349847241)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741346)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))))) {
                jSONArray2.put(2, String.format(j006Aj006A006Aj006A, str, jSONArray2.getString(2)));
            }
        }
    }

    private static boolean pp0070pp0070pp(JSONArray jSONArray) throws JSONException {
        if (pp007000700070ppp(jSONArray)) {
            return false;
        }
        JSONArray jSONArrayP0070007000700070ppp = p0070007000700070ppp(jSONArray, uuxuuuu.pppp0070ppp("{{", (char) (yyyllll.rrrr007200720072() ^ 383821907), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
        if (jSONArrayP0070007000700070ppp != null) {
            JSONObject jSONObject = jSONArrayP0070007000700070ppp.getJSONObject(1);
            if (jSONObject.getJSONArray(uuxuuuu.pppp0070ppp("kgn]c", (char) (yllylll.r007200720072r00720072() ^ (-1146716814)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053)))).length() > 0) {
                return false;
            }
            char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741347));
            int iRrrr007200720072 = yyyllll.rrrr007200720072() ^ 383821839;
            int i = gg0067ggg0067g;
            if (((g00670067ggg0067g + i) * i) % g006700670067gg0067g != gg00670067gg0067g) {
                gg0067ggg0067g = 8;
                gg00670067gg0067g = 19;
            }
            if (jSONObject.getJSONArray(uuxuuuu.pp0070p0070ppp(")\u007fr<\u000eCa.\u0002", cR0072rrr00720072, (char) iRrrr007200720072, (char) (yllylll.r007200720072r00720072() ^ (-1146716786)))).length() > 0 || jSONObject.getJSONArray(uuxuuuu.pp0070p0070ppp("AM", (char) (yyyllll.rrrr007200720072() ^ 383821960), (char) (yylylll.r0072r0072r00720072() ^ (-1349847095)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790)))).length() > 0 || jSONObject.getJSONArray(uuxuuuu.pp0070p0070ppp("BU", (char) (yylylll.r0072r0072r00720072() ^ (-1349847072)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847099)), (char) (yyyllll.rrrr007200720072() ^ 383821866))).length() > 0) {
                return false;
            }
        }
        return true;
    }

    private static JSONObject ppp007000700070pp(JSONArray jSONArray, String str) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            int i2 = gg0067ggg0067g;
            if (((g00670067ggg0067g + i2) * i2) % ggg0067gg0067g() != gggg0067g0067g()) {
                gg0067ggg0067g = g0067g0067gg0067g();
                gg00670067gg0067g = g0067g0067gg0067g();
            }
            if (jSONObject.opt(str) != null) {
                return jSONObject;
            }
        }
        return null;
    }

    private static void ppp0070p0070pp(JSONArray jSONArray, JSONArray jSONArray2, String str, long j) throws JSONException {
        pp0070p00700070pp(jSONArray2, str);
        if (jSONArray2.length() <= 1 || j <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray2.length(); i++) {
            if (((g0067gg0067g0067g() + gg0067ggg0067g) * gg0067ggg0067g) % ggg0067gg0067g() != gg00670067gg0067g) {
                gg0067ggg0067g = g0067g0067gg0067g();
                gg00670067gg0067g = 85;
            }
            JSONArray jSONArray3 = jSONArray2.getJSONArray(i);
            String string = jSONArray3.getString(0);
            if (uuxuuuu.pppp0070ppp("9", (char) (yylylll.r0072r0072r00720072() ^ (-1349847249)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))).equals(string) || uuxuuuu.pp0070p0070ppp("y", (char) (yylylll.r0072r0072r00720072() ^ (-1349847158)), (char) (yllylll.r007200720072r00720072() ^ (-1146716918)), (char) (yyyllll.rrrr007200720072() ^ 383821867)).equals(string) || uuxuuuu.pp0070p0070ppp("f", (char) (yllylll.r007200720072r00720072() ^ (-1146716706)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847252)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))).equals(string) || uuxuuuu.pppp0070ppp("V", (char) (yyyllll.rrrr007200720072() ^ 383821844), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))).equals(string)) {
                jSONArray3.put(1, jSONArray3.getLong(1) + j);
                jSONArray.put(jSONArray3);
            }
        }
    }

    private static void pppp00700070pp(JSONArray jSONArray, JSONArray jSONArray2, String str, int i, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObjectPpp007000700070pp;
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject = jSONArray2.getJSONObject(i2);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                String strP0070ppp0070pp = p0070ppp0070pp(next, str, i, z2);
                if (z2) {
                    jSONObjectPpp007000700070pp = null;
                } else {
                    jSONObjectPpp007000700070pp = ppp007000700070pp(jSONArray, strP0070ppp0070pp);
                    if (jSONObjectPpp007000700070pp != null) {
                        if (z) {
                            jSONObjectPpp007000700070pp.put(strP0070ppp0070pp, ((Integer) obj).intValue() + jSONObjectPpp007000700070pp.getInt(strP0070ppp0070pp));
                        } else {
                            jSONObjectPpp007000700070pp.put(strP0070ppp0070pp, obj);
                        }
                    }
                }
                if (jSONObjectPpp007000700070pp == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(strP0070ppp0070pp, obj);
                    jSONArray.put(i2, jSONObject2);
                }
                int i3 = gg0067ggg0067g;
                if (((g00670067ggg0067g + i3) * i3) % g006700670067gg0067g != 0) {
                    gg0067ggg0067g = 3;
                    gg00670067gg0067g = 4;
                }
            }
        }
    }

    private static int ppppp0070pp(Map<String, Integer> map, String str, boolean z) {
        if (!map.containsKey(str)) {
            map.put(str, 0);
        }
        Integer numValueOf = map.get(str);
        if (z) {
            int i = gg0067ggg0067g;
            if (((g00670067ggg0067g + i) * i) % g006700670067gg0067g != gg00670067gg0067g) {
                gg0067ggg0067g = 85;
                gg00670067gg0067g = 92;
            }
            numValueOf = Integer.valueOf(numValueOf.intValue() + 1);
            map.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }
}
