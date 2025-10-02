package com.behaviosec.rl;

import com.behaviosec.rl.android.LogBridge;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ylllyly {
    private static final String hh00680068h0068h;
    private static final int hhh006800680068h = 2;
    public static int r00720072007200720072rr = 0;
    public static int r0072rrrr0072r = 2;
    public static int rr0072007200720072rr = 47;
    public static int rrrrrr0072r = 1;
    private ArrayList<Double> h006800680068h0068h = new ArrayList<>();
    private int h00680068h00680068h;
    private double[] h0068hh00680068h;
    private int hh0068h00680068h;
    private double[] hhhh00680068h;

    static {
        int i = rr0072007200720072rr;
        if (((rrrrrr0072r + i) * i) % rrr0072rr0072r() != r00720072007200720072rr) {
            rr0072007200720072rr = rr0072rrr0072r();
            r00720072007200720072rr = rr0072rrr0072r();
        }
        hh00680068h0068h = uuxuuuu.pppp0070ppp("/SMNJPJ7YG[[/P_", (char) (ylyylll.r0072rrr00720072() ^ (-1691741408)), (char) (yyyllll.rrrr007200720072() ^ 383821866));
    }

    public ylllyly() {
        b006200620062bb0062();
    }

    public static int r007200720072rr0072r() {
        return 1;
    }

    public static int r00720072rrr0072r() {
        return 0;
    }

    public static int rr0072rrr0072r() {
        return 17;
    }

    public static int rrr0072rr0072r() {
        return 2;
    }

    public double b0062006200620062b0062(boolean z) {
        if (this.h00680068h00680068h <= 4) {
            return 0.0d;
        }
        int i = rr0072007200720072rr;
        if (((rrrrrr0072r + i) * i) % r0072rrrr0072r != 0) {
            rr0072007200720072rr = rr0072rrr0072r();
            r00720072007200720072rr = rr0072rrr0072r();
        }
        if (z) {
            Arrays.sort(this.h0068hh00680068h);
        }
        return this.h0068hh00680068h[(this.h00680068h00680068h * 4) / 5];
    }

    public void b006200620062bb0062() {
        int i = rr0072007200720072rr;
        if (((rrrrrr0072r + i) * i) % r0072rrrr0072r != r00720072007200720072rr) {
            rr0072007200720072rr = 65;
            r00720072007200720072rr = rr0072rrr0072r();
        }
        this.h006800680068h0068h.clear();
    }

    public double b00620062b0062b0062() {
        int i;
        double d = 0.0d;
        int i2 = 0;
        while (true) {
            i = this.h00680068h00680068h;
            if (i2 >= i) {
                break;
            }
            d += this.h0068hh00680068h[i2];
            i2++;
        }
        int i3 = rr0072007200720072rr;
        if (((rrrrrr0072r + i3) * i3) % r0072rrrr0072r != r00720072007200720072rr) {
            rr0072007200720072rr = 28;
            r00720072007200720072rr = 74;
        }
        return d / i;
    }

    public double b00620062bb00620062() {
        double[] dArr = new double[this.h00680068h00680068h];
        double d = 0.0d;
        int i = 0;
        while (true) {
            if (i >= this.h00680068h00680068h) {
                return ((Math.sqrt((r4 - 1) * r4) / (this.h00680068h00680068h - 2)) * d) / (Math.pow(bbb0062b00620062(), 3.0d) * this.h00680068h00680068h);
            }
            double dPow = Math.pow(this.h0068hh00680068h[i] - b00620062b0062b0062(), 3.0d);
            dArr[i] = dPow;
            try {
                throw null;
            } catch (Exception unused) {
                rr0072007200720072rr = 90;
                d += dPow;
                i++;
            }
        }
    }

    public double b0062b00620062b0062() {
        double d = this.h0068hh00680068h[0];
        for (int i = 1; i < this.h00680068h00680068h; i++) {
            double d2 = this.h0068hh00680068h[i];
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    public JSONObject b0062b0062b00620062(int i) throws JSONException {
        String str = uuxuuuu.pppp0070ppp("&\"}\b\u0005\u0005_", (char) (yyyllll.rrrr007200720072() ^ 383821902), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))) + i + uuxuuuu.pp0070p0070ppp("F", (char) (yllylll.r007200720072r00720072() ^ (-1146716871)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741393)), (char) (yyyllll.rrrr007200720072() ^ 383821871));
        JSONObject jSONObject = new JSONObject();
        if (this.h006800680068h0068h.size() > 2) {
            try {
                bb00620062bb0062();
                this.h00680068h00680068h = this.h0068hh00680068h.length;
                char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716914));
                int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
                int iRr0072rrr0072r = rr0072rrr0072r();
                if (((r007200720072rr0072r() + iRr0072rrr0072r) * iRr0072rrr0072r) % r0072rrrr0072r != 0) {
                    rr0072007200720072rr = 3;
                    r00720072007200720072rr = rr0072rrr0072r();
                }
                jSONObject.put(uuxuuuu.pppp0070ppp("Q", cR007200720072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847054))), b0062bb0062b0062(b00620062b0062b0062(), 0.0d, i));
                jSONObject.put(uuxuuuu.pppp0070ppp(">", (char) (yllylll.r007200720072r00720072() ^ (-1146716847)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))), b0062bb0062b0062(bbb0062b00620062(), 0.0d, i));
                jSONObject.put(uuxuuuu.pp0070p0070ppp("=", (char) (yylylll.r0072r0072r00720072() ^ (-1349847263)), (char) (yllylll.r007200720072r00720072() ^ (-1146716806)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))), b0062bb0062b0062(b00620062bb00620062(), 0.0d, i));
                jSONObject.put(uuxuuuu.pp0070p0070ppp("S", (char) (ylyylll.r0072rrr00720072() ^ (-1691741410)), (char) (yyyllll.rrrr007200720072() ^ 383821988), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), b0062bb0062b0062(bb0062b0062b0062(), 0.0d, i));
                jSONObject.put(uuxuuuu.pp0070p0070ppp("x\u0003\n", (char) (yllylll.r007200720072r00720072() ^ (-1146716797)), (char) (yllylll.r007200720072r00720072() ^ (-1146716927)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))), b0062bb0062b0062(b0062bbb00620062(), 0.0d, i));
                jSONObject.put(uuxuuuu.pppp0070ppp("9C=", (char) (yllylll.r007200720072r00720072() ^ (-1146716721)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), b0062bb0062b0062(bbbbb00620062(), 0.0d, i));
                jSONObject.put(uuxuuuu.pp0070p0070ppp("\u0013\n", (char) (yllylll.r007200720072r00720072() ^ (-1146716704)), (char) (yllylll.r007200720072r00720072() ^ (-1146716921)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))), b0062bb0062b0062(bbb00620062b0062(), 0.0d, i));
                jSONObject.put(uuxuuuu.pp0070p0070ppp("\tKJ", (char) (yyyllll.rrrr007200720072() ^ 383821906), (char) (ylyylll.r0072rrr00720072() ^ (-1691741432)), (char) ((-1349847053) ^ yylylll.r0072r0072r00720072())), b0062bb0062b0062(bb006200620062b0062(false), 0.0d, i));
                jSONObject.put(uuxuuuu.pppp0070ppp("\u0018^U", (char) (yylylll.r0072r0072r00720072() ^ (-1349847259)), (char) (yyyllll.rrrr007200720072() ^ 383821868)), b0062bb0062b0062(b0062006200620062b0062(false), 0.0d, i));
                return jSONObject;
            } catch (JSONException e) {
                LogBridge.e(uuxuuuu.pppp0070ppp("\u0005)\u001f  &\u001c\t/\u001d--\u0005&1", (char) (ylyylll.r0072rrr00720072() ^ (-1691741349)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), str, e);
            }
        }
        return jSONObject;
    }

    public void b0062b0062bb0062(double d) {
        int i = rr0072007200720072rr;
        if (((rrrrrr0072r + i) * i) % r0072rrrr0072r != 0) {
            rr0072007200720072rr = 9;
            r00720072007200720072rr = rr0072rrr0072r();
        }
        this.h006800680068h0068h.add(Double.valueOf(d));
    }

    public double b0062bb0062b0062(double d, double d2, int i) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return bb0062bb00620062(d, i);
        }
        double dBb0062bb00620062 = bb0062bb00620062(d2, i);
        int i2 = rr0072007200720072rr;
        if (((rrrrrr0072r + i2) * i2) % r0072rrrr0072r != r00720072007200720072rr) {
            rr0072007200720072rr = 28;
            r00720072007200720072rr = rr0072rrr0072r();
        }
        return dBb0062bb00620062;
    }

    public double b0062bbb00620062() {
        int i = this.h00680068h00680068h;
        double[] dArr = new double[i];
        double[] dArr2 = new double[i];
        double d = 0.0d;
        for (int i2 = 0; i2 < this.h00680068h00680068h; i2++) {
            double d2 = this.h0068hh00680068h[i2];
            double dBbb00620062b0062 = bbb00620062b0062();
            int i3 = rr0072007200720072rr;
            if (((rrrrrr0072r + i3) * i3) % r0072rrrr0072r != 0) {
                rr0072007200720072rr = rr0072rrr0072r();
                r00720072007200720072rr = rr0072rrr0072r();
            }
            if (d2 > dBbb00620062b0062) {
                double dPow = (Math.pow(this.h0068hh00680068h[i2], 2.0d) / this.h00680068h00680068h) / bbbbb00620062();
                dArr[i2] = dPow;
                dArr2[i2] = Math.log(dPow);
            } else {
                dArr[i2] = 0.0d;
                dArr2[i2] = 0.0d;
            }
            d += dArr[i2] * dArr2[i2];
        }
        return -d;
    }

    public double bb006200620062b0062(boolean z) {
        if (this.h00680068h00680068h <= 4) {
            return 0.0d;
        }
        if (z) {
            Arrays.sort(this.h0068hh00680068h);
        }
        return this.h0068hh00680068h[this.h00680068h00680068h / 5];
    }

    public String bb00620062b00620062(int i) {
        int i2 = rr0072007200720072rr;
        if (((rrrrrr0072r + i2) * i2) % r0072rrrr0072r != 0) {
            rr0072007200720072rr = rr0072rrr0072r();
            r00720072007200720072rr = 69;
        }
        return b0062b0062b00620062(i).toString();
    }

    public double[] bb00620062bb0062() {
        double[] dArr;
        double[] dArr2;
        if (this.h006800680068h0068h.isEmpty()) {
            return null;
        }
        int length = bbb0062bb0062().length;
        int length2 = bbb0062bb0062().length;
        ooododd ooododdVar = new ooododd();
        oddoodd oddooddVar = new oddoodd();
        ylyyyyl ylyyyylVar = new ylyyyyl();
        double[] dArr3 = new double[101];
        double[] dArr4 = new double[101];
        double[] dArr5 = new double[length];
        double[] dArr6 = new double[101];
        double[] dArr7 = new double[length];
        double[] dArr8 = new double[101];
        Class cls = Double.TYPE;
        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) cls, 101, length2);
        double[][] dArr10 = (double[][]) Array.newInstance((Class<?>) cls, 101, length2);
        double[] dArr11 = new double[101];
        int i = 0;
        while (true) {
            dArr = dArr4;
            dArr2 = dArr5;
            if (i >= 101) {
                break;
            }
            dArr11[i] = i;
            i++;
            dArr4 = dArr;
            dArr5 = dArr2;
        }
        for (int i2 = 0; i2 < length; i2++) {
            double d = i2 * (360.0d / length);
            dArr2[i2] = d;
            dArr7[i2] = d * 0.017453292519943295d;
        }
        int i3 = 0;
        while (i3 < 101) {
            int i4 = i3 + 1;
            dArr10[i3] = ooododdVar.ss0073ss0073s(dArr7, this.hhhh00680068h, i4);
            i3 = i4;
        }
        int i5 = 0;
        while (i5 < 101) {
            dArr8[i5] = ylyyyylVar.kkk006Bk006Bk(dArr10[i5], length2);
            i5++;
            int i6 = rr0072007200720072rr;
            if (((rrrrrr0072r + i6) * i6) % r0072rrrr0072r != r00720072007200720072rr) {
                rr0072007200720072rr = rr0072rrr0072r();
                r00720072007200720072rr = rr0072rrr0072r();
            }
        }
        int i7 = 0;
        while (i7 < 101) {
            int i8 = i7 + 1;
            dArr9[i7] = oddooddVar.calc(dArr7, this.hhhh00680068h, i8);
            i7 = i8;
        }
        for (int i9 = 0; i9 < 101; i9++) {
            dArr6[i9] = ylyyyylVar.kkk006Bk006Bk(dArr9[i9], length2);
        }
        for (int i10 = 0; i10 < 101; i10++) {
            dArr3[i10] = Math.sqrt(Math.pow(dArr6[i10], 2.0d) + Math.pow(dArr8[i10], 2.0d)) * 2.0d;
        }
        for (int i11 = 0; i11 < 101; i11++) {
            dArr[i11] = Math.atan(Math.sqrt(Math.pow(dArr6[i11], 2.0d) / Math.pow(dArr8[i11], 2.0d)));
        }
        double[] dArr12 = new double[101];
        for (int i12 = 1; i12 < 101; i12++) {
            dArr12[i12] = Math.sqrt(1.0d / (Math.pow(31.41592653589793d * i12, 6) + 1.0d)) * dArr3[i12];
        }
        double d2 = dArr12[0];
        for (int i13 = 1; i13 < 101; i13++) {
            if (dArr12[i13] > d2) {
                int i14 = rr0072007200720072rr;
                if (((rrrrrr0072r + i14) * i14) % rrr0072rr0072r() != r00720072rrr0072r()) {
                    rr0072007200720072rr = 60;
                    r00720072007200720072rr = rr0072rrr0072r();
                }
                d2 = dArr12[i13];
            }
        }
        this.h0068hh00680068h = new double[101];
        for (int i15 = 0; i15 < 101; i15++) {
            this.h0068hh00680068h[i15] = dArr12[i15] / d2;
        }
        return this.h0068hh00680068h;
    }

    public double bb0062b0062b0062() {
        int i;
        double[] dArr = new double[this.h00680068h00680068h];
        double d = 0.0d;
        int i2 = 0;
        while (true) {
            i = this.h00680068h00680068h;
            if (i2 >= i) {
                break;
            }
            double dPow = Math.pow(this.h0068hh00680068h[i2] - b00620062b0062b0062(), 4.0d);
            dArr[i2] = dPow;
            d += dPow;
            i2++;
        }
        int i3 = (i + 1) * i;
        int i4 = rr0072007200720072rr;
        if (((rrrrrr0072r + i4) * i4) % r0072rrrr0072r != r00720072007200720072rr) {
            rr0072007200720072rr = 63;
            r00720072007200720072rr = 3;
        }
        double dPow2 = (d / Math.pow(bbb0062b00620062(), 4.0d)) * (i3 / ((i - 2) * ((i - 2) * (i - 1))));
        double dPow3 = Math.pow(this.h00680068h00680068h - 1, 2.0d) * 3.0d;
        int i5 = this.h00680068h00680068h;
        return dPow2 - (dPow3 / ((i5 - 3) * ((i5 - 2) * 2)));
    }

    public double bb0062bb00620062(double d, int i) {
        return Math.round(Math.pow(10.0d, r0) * d) / Math.pow(10.0d, i);
    }

    public double bbb00620062b0062() {
        if (this.h00680068h00680068h <= 2) {
            return this.h0068hh00680068h[1];
        }
        Arrays.sort(this.h0068hh00680068h);
        int i = this.h00680068h00680068h;
        if (i % 2 != 0) {
            return this.h0068hh00680068h[i / 2];
        }
        double d = this.h0068hh00680068h[i / 2];
        int i2 = rr0072007200720072rr;
        if (((rrrrrr0072r + i2) * i2) % r0072rrrr0072r != r00720072rrr0072r()) {
            rr0072007200720072rr = 77;
            r00720072007200720072rr = 8;
        }
        return (this.h0068hh00680068h[(this.h00680068h00680068h / 2) - 1] / 2.0d) + d;
    }

    public double bbb0062b00620062() {
        double dSqrt = 0.0d;
        int i = 0;
        while (true) {
            int i2 = rr0072007200720072rr;
            if (((rrrrrr0072r + i2) * i2) % r0072rrrr0072r != r00720072007200720072rr) {
                rr0072007200720072rr = 70;
                r00720072007200720072rr = 63;
            }
            if (i >= this.h00680068h00680068h) {
                return Math.sqrt(dSqrt);
            }
            dSqrt += Math.sqrt(Math.abs(this.h0068hh00680068h[i] - b00620062b0062b0062())) / this.h00680068h00680068h;
            i++;
        }
    }

    public double[] bbb0062bb0062() {
        if (!this.h006800680068h0068h.isEmpty()) {
            this.hh0068h00680068h = this.h006800680068h0068h.size();
        }
        this.hhhh00680068h = new double[this.hh0068h00680068h];
        for (int i = 0; i < this.hh0068h00680068h; i++) {
            this.hhhh00680068h[i] = this.h006800680068h0068h.get(i).doubleValue();
        }
        return this.hhhh00680068h;
    }

    public double bbbb0062b0062() {
        ArrayList arrayList = new ArrayList();
        for (double d : this.h0068hh00680068h) {
            arrayList.add(Double.valueOf(d));
        }
        double dDoubleValue = ((Double) arrayList.get(0)).doubleValue();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            double dDoubleValue2 = ((Double) it.next()).doubleValue();
            if (dDoubleValue2 > dDoubleValue) {
                dDoubleValue = dDoubleValue2;
            }
            int i = rr0072007200720072rr;
            if (((rrrrrr0072r + i) * i) % r0072rrrr0072r != r00720072rrr0072r()) {
                rr0072007200720072rr = 87;
                r00720072007200720072rr = 16;
            }
        }
        return arrayList.indexOf(Double.valueOf(dDoubleValue));
    }

    public double bbbbb00620062() {
        double[] dArr = new double[this.h00680068h00680068h];
        double d = 0.0d;
        for (int i = 0; i < this.h00680068h00680068h; i++) {
            double dPow = Math.pow(this.h0068hh00680068h[i], 2.0d) / this.h00680068h00680068h;
            dArr[i] = dPow;
            d += dPow;
            int i2 = rr0072007200720072rr;
            if (((rrrrrr0072r + i2) * i2) % r0072rrrr0072r != r00720072007200720072rr) {
                rr0072007200720072rr = rr0072rrr0072r();
                r00720072007200720072rr = rr0072rrr0072r();
            }
        }
        return d;
    }
}
