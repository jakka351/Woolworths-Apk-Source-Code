package com.behaviosec.rl;

import com.behaviosec.rl.android.LogBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class yyllyly {
    private static final String hhhh0068hh;
    public static int r0072007200720072rrr = 2;
    public static int rr00720072rrrr = 1;
    public static int rrr0072rrrr = 29;
    public static int rrrrr0072rr;
    private double h0068006800680068hh;
    private double h00680068h0068hh;
    private ArrayList<Long> h00680068hh0068h;
    private double h0068h00680068hh;
    private int h0068h0068h0068h;
    private long h0068hh0068hh;
    private double h0068hhh0068h;
    private double hh006800680068hh;
    private double hh0068h0068hh;
    private ArrayList<Double> hh0068hh0068h;
    private double hhh00680068hh;
    private HashMap<Long, Long> hhh0068h0068h;
    private double hhhhh0068h;

    static {
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383822070);
        int iR007200720072r00720072 = yllylll.r007200720072r00720072();
        if (((r0072rrr0072rr() + rrr0072rrrr) * rrr0072rrrr) % r007200720072rrrr() != rrrrr0072rr) {
            rrr0072rrrr = rrrr0072rrr();
            rrrrr0072rr = 68;
        }
        hhhh0068hh = uuxuuuu.pppp0070ppp("s\u0016\u000e\r\u0007\u000b\u0003m\u000ey\f\n", cRrrr007200720072, (char) (iR007200720072r00720072 ^ (-1146716786)));
    }

    public yyllyly() {
        this.hhhhh0068h = Double.MIN_VALUE;
        this.h0068hhh0068h = Double.MAX_VALUE;
        this.h0068h0068h0068h = 20;
        bb0062bb0062b();
    }

    private double b00620062bb0062b(HashMap<Double, Long> map) {
        long jLongValue = 0;
        double dDoubleValue = 0.0d;
        for (Map.Entry<Double, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() > jLongValue) {
                jLongValue = entry.getValue().longValue();
                int i = rrr0072rrrr;
                if (((rr00720072rrrr + i) * i) % r0072007200720072rrr != rrrrr0072rr) {
                    rrr0072rrrr = rrrr0072rrr();
                    rrrrr0072rr = rrrr0072rrr();
                }
                dDoubleValue = entry.getKey().doubleValue();
            }
        }
        return dDoubleValue;
    }

    private HashMap<Double, Long> b0062bbb0062b() {
        HashMap<Double, Long> map = new HashMap<>();
        double d = this.hh006800680068hh;
        double d2 = this.h0068006800680068hh;
        double d3 = this.h0068hhh0068h;
        if (d3 != Double.MAX_VALUE) {
            d2 = d3;
        }
        if (this.hhhhh0068h == Double.MIN_VALUE) {
            d3 = d2;
        }
        double d4 = (d3 - d) / this.h0068h0068h0068h;
        Iterator<Double> it = this.hh0068hh0068h.iterator();
        while (it.hasNext()) {
            int iDoubleValue = (int) ((it.next().doubleValue() - d) / d4);
            if (iDoubleValue < 0) {
                iDoubleValue = 0;
            } else {
                int i = this.h0068h0068h0068h;
                if (iDoubleValue >= i) {
                    iDoubleValue = i - 1;
                }
            }
            Double dValueOf = Double.valueOf((iDoubleValue + 1) * d4);
            int i2 = rrr0072rrrr;
            if (((r0072rrr0072rr() + i2) * i2) % r0072007200720072rrr != 0) {
                rrr0072rrrr = 38;
                rrrrr0072rr = 67;
            }
            Long l = map.get(dValueOf);
            map.put(dValueOf, l == null ? 1L : Long.valueOf(l.longValue() + 1));
        }
        return map;
    }

    private long bb00620062b0062b(HashMap<Long, Long> map) {
        if (((r0072rrr0072rr() + rrr0072rrrr) * rrr0072rrrr) % r0072007200720072rrr != r0072r0072rrrr()) {
            rrr0072rrrr = rrrr0072rrr();
            rrrrr0072rr = 97;
        }
        long jLongValue = 0;
        long jLongValue2 = 0;
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() > jLongValue2) {
                jLongValue2 = entry.getValue().longValue();
                jLongValue = entry.getKey().longValue();
            }
        }
        return jLongValue;
    }

    public static int r007200720072rrrr() {
        return 2;
    }

    public static int r0072r0072rrrr() {
        return 0;
    }

    public static int r0072rrr0072rr() {
        return 1;
    }

    public static int rrrr0072rrr() {
        return 24;
    }

    public JSONArray b00620062006200620062b(int i) throws JSONException {
        String str = uuxuuuu.pp0070p0070ppp("s4I7v?q5\b#m+k\u000b", (char) (yyyllll.rrrr007200720072() ^ 383822036), (char) (yllylll.r007200720072r00720072() ^ (-1146716851)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))) + i + uuxuuuu.pppp0070ppp("L", (char) (ylyylll.r0072rrr00720072() ^ (-1691741244)), (char) (yyyllll.rrrr007200720072() ^ 383821869));
        if (bbbbb0062b() < 2) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        try {
            throw null;
        } catch (Exception unused) {
            rrr0072rrrr = rrrr0072rrr();
            int i2 = 2;
            while (true) {
                try {
                    i2 /= 0;
                } catch (Exception unused2) {
                    rrr0072rrrr = 31;
                    try {
                        jSONArray.put(bbb0062b0062b(b006200620062b0062b(), 0.0d, i)).put(bbb0062b0062b(bb0062006200620062b(), 0.0d, i)).put(bbb0062b0062b(this.hh006800680068hh, 0.0d, i)).put(bbb0062b0062b(this.h0068006800680068hh, 0.0d, i)).put(bbb0062b0062b(b0062b006200620062b(), 0.0d, i)).put(bbb0062b0062b(b0062b0062b0062b(), 0.0d, i)).put(bbb0062b0062b(bbbb00620062b(), 0.0d, i)).put(bbb0062b0062b(b0062bb00620062b(false), 0.0d, i)).put(bbb0062b0062b(bb0062b00620062b(false), 0.0d, i));
                        return jSONArray;
                    } catch (JSONException e) {
                        LogBridge.e(uuxuuuu.pp0070p0070ppp("\r:4A=?I2TNbn", (char) (yylylll.r0072r0072r00720072() ^ (-1349847221)), (char) (yyyllll.rrrr007200720072() ^ 383822038), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), str, e);
                        return new JSONArray();
                    }
                }
            }
        }
    }

    public void b0062006200620062bb(long j) {
        this.h00680068hh0068h.add(Long.valueOf(j));
        Long l = this.hhh0068h0068h.get(Long.valueOf(j));
        if (l == null) {
            this.hhh0068h0068h.put(Long.valueOf(j), 1L);
        } else {
            this.hhh0068h0068h.put(Long.valueOf(j), Long.valueOf(l.longValue() + 1));
        }
        double d = j;
        if (d < this.hh006800680068hh) {
            this.hh006800680068hh = d;
        }
        if (d > this.h0068006800680068hh) {
            this.h0068006800680068hh = d;
        }
        long j2 = this.h0068hh0068hh;
        long j3 = 1 + j2;
        this.h0068hh0068hh = j3;
        double d2 = this.hh0068h0068hh;
        double d3 = d - d2;
        double d4 = d3 / j3;
        double d5 = d4 * d4;
        double d6 = d3 * d4 * j2;
        this.hh0068h0068hh = d2 + d4;
        double d7 = this.h0068h00680068hh;
        double d8 = (d5 * 6.0d * this.h00680068h0068hh) + (d6 * d5 * (((j3 * j3) - (j3 * 3)) + 3));
        double d9 = 4.0d * d4;
        int i = rrr0072rrrr;
        if (((rr00720072rrrr + i) * i) % r0072007200720072rrr != rrrrr0072rr) {
            rrr0072rrrr = rrrr0072rrr();
            rrrrr0072rr = rrrr0072rrr();
        }
        double d10 = this.hhh00680068hh;
        this.h0068h00680068hh = (d8 - (d9 * d10)) + d7;
        double d11 = this.h00680068h0068hh;
        this.hhh00680068hh = (((d6 * d4) * (this.h0068hh0068hh - 2)) - ((d4 * 3.0d) * d11)) + d10;
        this.h00680068h0068hh = d11 + d6;
    }

    public double b006200620062b0062b() {
        int i = rrr0072rrrr;
        if (((rr00720072rrrr + i) * i) % r0072007200720072rrr != rrrrr0072rr) {
            rrr0072rrrr = rrrr0072rrr();
            rrrrr0072rr = 43;
        }
        return this.hh0068h0068hh;
    }

    public double b00620062b00620062b(double d, int i) {
        return Math.round(Math.pow(10.0d, r0) * d) / Math.pow(10.0d, i);
    }

    public double b00620062bbb0062(yyllyly yyllylyVar) {
        return (b006200620062b0062b() - yyllylyVar.b006200620062b0062b()) / Math.sqrt((yyllylyVar.bb0062bbb0062() / yyllylyVar.bbbbb0062b()) + (bb0062bbb0062() / bbbbb0062b()));
    }

    public double b0062b006200620062b() {
        try {
            throw null;
        } catch (Exception unused) {
            rrr0072rrrr = 81;
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused2) {
                    rrr0072rrrr = 50;
                    return (Math.sqrt(this.h0068hh0068hh) * this.hhh00680068hh) / Math.pow(this.h00680068h0068hh, 1.5d);
                }
            }
        }
    }

    public double b0062b0062b0062b() {
        double d = this.h0068hh0068hh * this.h0068h00680068hh;
        int i = rrr0072rrrr;
        if (((rr00720072rrrr + i) * i) % r0072007200720072rrr != rrrrr0072rr) {
            rrr0072rrrr = rrrr0072rrr();
            rrrrr0072rr = 62;
        }
        double d2 = this.h00680068h0068hh;
        return (d / (d2 * d2)) - 3.0d;
    }

    public double b0062bb00620062b(boolean z) {
        int size = this.hh0068hh0068h.size();
        int i = rrr0072rrrr;
        if (((rr00720072rrrr + i) * i) % r0072007200720072rrr != 0) {
            rrr0072rrrr = 26;
            rrrrr0072rr = 5;
        }
        if (size <= 4) {
            return 0.0d;
        }
        if (z) {
            Collections.sort(this.hh0068hh0068h);
        }
        ArrayList<Double> arrayList = this.hh0068hh0068h;
        return arrayList.get(arrayList.size() / 5).doubleValue();
    }

    public String b0062bbbb0062(int i) throws Exception {
        JSONObject jSONObjectBbbbbb0062 = bbbbbb0062(i);
        int i2 = rrr0072rrrr;
        if (((rr00720072rrrr + i2) * i2) % r0072007200720072rrr != rrrrr0072rr) {
            rrr0072rrrr = 48;
            rrrrr0072rr = 34;
        }
        return jSONObjectBbbbbb0062.toString();
    }

    public double bb0062006200620062b() {
        int i = rrr0072rrrr;
        if (((rr00720072rrrr + i) * i) % r0072007200720072rrr != rrrrr0072rr) {
            rrr0072rrrr = 65;
            rrrrr0072rr = 25;
        }
        return Math.sqrt(bb0062bbb0062());
    }

    public void bb006200620062bb(double d) {
        this.hh0068hh0068h.add(Double.valueOf(d));
        if (d < this.hh006800680068hh) {
            this.hh006800680068hh = d;
        }
        if (d > this.h0068006800680068hh) {
            this.h0068006800680068hh = d;
        }
        long j = this.h0068hh0068hh;
        long j2 = 1 + j;
        this.h0068hh0068hh = j2;
        double d2 = this.hh0068h0068hh;
        double d3 = d - d2;
        double d4 = d3 / j2;
        double d5 = d4 * d4;
        double d6 = d3 * d4 * j;
        this.hh0068h0068hh = d2 + d4;
        this.h0068h00680068hh = ((((d5 * 6.0d) * this.h00680068h0068hh) + ((d6 * d5) * (((j2 * j2) - (j2 * 3)) + 3))) - ((4.0d * d4) * this.hhh00680068hh)) + this.h0068h00680068hh;
        int i = rrr0072rrrr;
        if (((rr00720072rrrr + i) * i) % r0072007200720072rrr != 0) {
            rrr0072rrrr = 92;
            rr00720072rrrr = rrrr0072rrr();
        }
        double d7 = this.h00680068h0068hh;
        this.hhh00680068hh = (((d6 * d4) * (this.h0068hh0068hh - 2)) - ((d4 * 3.0d) * d7)) + this.hhh00680068hh;
        this.h00680068h0068hh = d7 + d6;
    }

    public double bb0062b00620062b(boolean z) {
        if (this.hh0068hh0068h.size() <= 4) {
            return 0.0d;
        }
        if (z) {
            Collections.sort(this.hh0068hh0068h);
        }
        ArrayList<Double> arrayList = this.hh0068hh0068h;
        if ((rrrr0072rrr() * (rrrr0072rrr() + rr00720072rrrr)) % r0072007200720072rrr != rrrrr0072rr) {
            rrr0072rrrr = rrrr0072rrr();
            rrrrr0072rr = 26;
        }
        return arrayList.get((arrayList.size() * 4) / 5).doubleValue();
    }

    public void bb0062bb0062b() {
        this.hh0068hh0068h = new ArrayList<>();
        this.h00680068hh0068h = new ArrayList<>();
        this.hhh0068h0068h = new HashMap<>();
        this.h0068hh0068hh = 0L;
        this.h0068h00680068hh = 0.0d;
        this.hhh00680068hh = 0.0d;
        this.h00680068h0068hh = 0.0d;
        this.hh0068h0068hh = 0.0d;
        this.hh006800680068hh = Double.MAX_VALUE;
        this.h0068006800680068hh = Double.MIN_VALUE;
        int i = rrr0072rrrr;
        if (((rr00720072rrrr + i) * i) % r007200720072rrrr() != r0072r0072rrrr()) {
            rrr0072rrrr = rrrr0072rrr();
            rr00720072rrrr = rrrr0072rrr();
        }
    }

    public double bb0062bbb0062() {
        return this.h00680068h0068hh / (this.h0068hh0068hh - 1.0d);
    }

    public void bbb006200620062b(int i) {
        int i2 = 1;
        while (true) {
            try {
                i2 /= 0;
            } catch (Exception unused) {
                rrr0072rrrr = rrrr0072rrr();
                try {
                    throw null;
                } catch (Exception unused2) {
                    rrr0072rrrr = 16;
                    while (true) {
                        try {
                            int[] iArr = new int[-1];
                        } catch (Exception unused3) {
                            rrr0072rrrr = rrrr0072rrr();
                            this.h0068h0068h0068h = i;
                            return;
                        }
                    }
                }
            }
        }
    }

    public double bbb0062b0062b(double d, double d2, int i) {
        if (!Double.isNaN(d)) {
            int i2 = 0;
            while (true) {
                try {
                    i2 /= 0;
                } catch (Exception unused) {
                    rrr0072rrrr = rrrr0072rrr();
                    if (!Double.isInfinite(d)) {
                        return b00620062b00620062b(d, i);
                    }
                }
            }
        }
        return b00620062b00620062b(d2, i);
    }

    public double bbbb00620062b() {
        if (this.hh0068hh0068h.size() > 2) {
            Collections.sort(this.hh0068hh0068h);
            ArrayList<Double> arrayList = this.hh0068hh0068h;
            return arrayList.get(arrayList.size() / 2).doubleValue();
        }
        if (this.h00680068hh0068h.size() <= 2) {
            return 0.0d;
        }
        if (((r0072rrr0072rr() + rrr0072rrrr) * rrr0072rrrr) % r007200720072rrrr() != rrrrr0072rr) {
            rrr0072rrrr = 55;
            rrrrr0072rr = rrrr0072rrr();
        }
        Collections.sort(this.h00680068hh0068h);
        ArrayList<Long> arrayList2 = this.h00680068hh0068h;
        return arrayList2.get(arrayList2.size() / 2).longValue();
    }

    public long bbbbb0062b() {
        int i = rrr0072rrrr;
        if (((rr00720072rrrr + i) * i) % r0072007200720072rrr != r0072r0072rrrr()) {
            rrr0072rrrr = 96;
            rrrrr0072rr = rrrr0072rrr();
        }
        return this.h0068hh0068hh;
    }

    public JSONObject bbbbbb0062(int i) throws Exception {
        String str = uuxuuuu.pp0070p0070ppp("62\u000e\u0018\u0015\u0015o", (char) (yyyllll.rrrr007200720072() ^ 383822047), (char) (yyyllll.rrrr007200720072() ^ 383821920), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))) + i + uuxuuuu.pppp0070ppp("O", (char) (yylylll.r0072r0072r00720072() ^ (-1349847209)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331)));
        JSONObject jSONObject = new JSONObject();
        if (bbbbb0062b() > 0) {
            try {
                try {
                    try {
                        try {
                            jSONObject.put(uuxuuuu.pppp0070ppp("\u0010", (char) (yllylll.r007200720072r00720072() ^ (-1146716761)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), bbb0062b0062b(b006200620062b0062b(), 0.0d, i));
                        } catch (JSONException e) {
                            e = e;
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                try {
                    try {
                        jSONObject.put(uuxuuuu.pppp0070ppp("o", (char) (yyyllll.rrrr007200720072() ^ 383821856), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))), bbb0062b0062b(bb0062006200620062b(), 0.0d, i));
                        jSONObject.put(uuxuuuu.pppp0070ppp("#", (char) (yllylll.r007200720072r00720072() ^ (-1146716912)), (char) (yyyllll.rrrr007200720072() ^ 383821859)), bbb0062b0062b(bbbbb0062b(), 0.0d, i));
                        try {
                            jSONObject.put(uuxuuuu.pppp0070ppp("Q", (char) (yyyllll.rrrr007200720072() ^ 383822005), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), bbb0062b0062b(b0062b006200620062b(), 0.0d, i));
                            jSONObject.put(uuxuuuu.pppp0070ppp("U", (char) (yyyllll.rrrr007200720072() ^ 383821919), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))), bbb0062b0062b(b0062b0062b0062b(), 0.0d, i));
                            jSONObject.put(uuxuuuu.pppp0070ppp("id", (char) (yyyllll.rrrr007200720072() ^ 383821949), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))), bbb0062b0062b(this.hh006800680068hh, 0.0d, i));
                            jSONObject.put(uuxuuuu.pppp0070ppp("\u0016 ", (char) (ylyylll.r0072rrr00720072() ^ (-1691741195)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), bbb0062b0062b(this.h0068006800680068hh, 0.0d, i));
                            jSONObject.put(uuxuuuu.pppp0070ppp("?d", (char) (yllylll.r007200720072r00720072() ^ (-1146716897)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), bbb0062b0062b(bbbb00620062b(), 0.0d, i));
                            jSONObject.put(uuxuuuu.pppp0070ppp("5ur", (char) (ylyylll.r0072rrr00720072() ^ (-1691741353)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), bbb0062b0062b(b0062bb00620062b(false), 0.0d, i));
                            jSONObject.put(uuxuuuu.pppp0070ppp("\u001fe\\", (char) (yylylll.r0072r0072r00720072() ^ (-1349847275)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))), bbb0062b0062b(bb0062b00620062b(false), 0.0d, i));
                            if (!this.hh0068hh0068h.isEmpty()) {
                                HashMap<Double, Long> mapB0062bbb0062b = b0062bbb0062b();
                                jSONObject.put(uuxuuuu.pppp0070ppp("%(", (char) (yylylll.r0072r0072r00720072() ^ (-1349847228)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))), bbb0062b0062b(b00620062bb0062b(mapB0062bbb0062b), 0.0d, i));
                                JSONArray jSONArray = new JSONArray();
                                for (Map.Entry<Double, Long> entry : mapB0062bbb0062b.entrySet()) {
                                    JSONArray jSONArray2 = new JSONArray();
                                    jSONArray2.put(bbb0062b0062b(entry.getKey().doubleValue(), 0.0d, i));
                                    jSONArray2.put(entry.getValue());
                                    int iRrrr0072rrr = rrrr0072rrr();
                                    if (((rr00720072rrrr + iRrrr0072rrr) * iRrrr0072rrr) % r0072007200720072rrr != 0) {
                                        rrr0072rrrr = 20;
                                        rrrrr0072rr = 34;
                                    }
                                    jSONArray.put(jSONArray2);
                                }
                                jSONObject.put(uuxuuuu.pppp0070ppp("g", (char) (yyyllll.rrrr007200720072() ^ 383821909), (char) (383821864 ^ yyyllll.rrrr007200720072())), jSONArray);
                                while (true) {
                                    try {
                                        int[] iArr = new int[-1];
                                    } catch (Exception unused) {
                                        rrr0072rrrr = rrrr0072rrr();
                                    }
                                }
                            } else if (!this.h00680068hh0068h.isEmpty()) {
                                jSONObject.put(uuxuuuu.pppp0070ppp("pq", (char) (yylylll.r0072r0072r00720072() ^ (-1349847217)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))), bbb0062b0062b(bb00620062b0062b(this.hhh0068h0068h), 0.0d, i));
                                JSONArray jSONArray3 = new JSONArray();
                                for (Map.Entry<Long, Long> entry2 : this.hhh0068h0068h.entrySet()) {
                                    JSONArray jSONArray4 = new JSONArray();
                                    jSONArray4.put(entry2.getKey());
                                    jSONArray4.put(entry2.getValue());
                                    jSONArray3.put(jSONArray4);
                                }
                                jSONObject.put(uuxuuuu.pp0070p0070ppp("X", (char) (yyyllll.rrrr007200720072() ^ 383822035), (char) (yyyllll.rrrr007200720072() ^ 383821918), (char) (383821864 ^ yyyllll.rrrr007200720072())), jSONArray3);
                            }
                        } catch (Exception e5) {
                            e = e5;
                            throw e;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        throw e;
                    }
                } catch (JSONException e7) {
                    e = e7;
                    LogBridge.e(uuxuuuu.pppp0070ppp("Cgab^d^Km[oo", (char) (yllylll.r007200720072r00720072() ^ (-1146716679)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))), str, e);
                    return jSONObject;
                }
            } catch (JSONException e8) {
                e = e8;
            }
        }
        return jSONObject;
    }

    public yyllyly(double d, double d2, double d3, double d4, long j) {
        this.hhhhh0068h = Double.MIN_VALUE;
        this.h0068hhh0068h = Double.MAX_VALUE;
        this.h0068h0068h0068h = 20;
        bb0062bb0062b();
        this.hh0068h0068hh = d;
        this.h00680068h0068hh = d2;
        this.hhh00680068hh = d3;
        this.h0068h00680068hh = d4;
        this.h0068hh0068hh = j;
    }

    public yyllyly(int i, double d, double d2) {
        this.h0068h0068h0068h = i;
        this.hhhhh0068h = d;
        this.h0068hhh0068h = d2;
        bb0062bb0062b();
    }
}
