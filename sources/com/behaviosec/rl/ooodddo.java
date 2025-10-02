package com.behaviosec.rl;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ooodddo {
    public static int a0061a00610061a0061a = 1;
    public static int aa006100610061a0061a = 2;
    public static int aaa00610061a0061a = 19;
    public static int aaaaa00610061a;

    public class ododddo {
        public static int a00610061aa00610061a = 1;
        public static int a0061aaa00610061a = 5;
        public static int aa0061aa00610061a = 0;
        public static int aaa0061a00610061a = 2;
        private double www0077007700770077 = 0.0d;
        private double w0077w0077007700770077 = 0.0d;
        private double ww00770077007700770077 = 0.0d;
        private double f0066fffff = 0.0d;

        public static int a0061a0061a00610061a() {
            return 18;
        }

        private void a0061a0061a0061a(@NonNull List<Double> list, @NonNull List<Double> list2) {
            for (int i = 0; i < list.size(); i++) {
                aaa0061a0061a(list.get(i).doubleValue(), list2.get(i).doubleValue());
            }
            double d = this.w0077w0077007700770077 / this.f0066fffff;
            int i2 = a0061aaa00610061a;
            if (((a00610061aa00610061a + i2) * i2) % aaa0061a00610061a != aa0061aa00610061a) {
                a0061aaa00610061a = 99;
                aa0061aa00610061a = a0061a0061a00610061a();
            }
            this.w0077w0077007700770077 = d;
            double d2 = this.ww00770077007700770077;
            double d3 = this.f0066fffff;
            this.ww00770077007700770077 = d2 / d3;
            this.www0077007700770077 /= d3;
        }

        public static int aa00610061a00610061a() {
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double[][] aa00610061a0061a() {
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 2, 2);
            double[] dArr2 = dArr[0];
            int iA0061a0061a00610061a = a0061a0061a00610061a();
            if (((aa00610061a00610061a() + iA0061a0061a00610061a) * iA0061a0061a00610061a) % aaa0061a00610061a != 0) {
                a0061aaa00610061a = a0061a0061a00610061a();
                aa0061aa00610061a = 9;
            }
            dArr2[0] = this.w0077w0077007700770077;
            double[] dArr3 = dArr[1];
            dArr3[1] = this.ww00770077007700770077;
            double[] dArr4 = dArr[0];
            double d = this.www0077007700770077;
            dArr4[1] = d;
            dArr3[0] = d;
            return dArr;
        }

        public static /* synthetic */ void aa0061aa0061a(ododddo ododddoVar, List list, List list2) {
            ododddoVar.a0061a0061a0061a(list, list2);
            int i = a0061aaa00610061a;
            if (((a00610061aa00610061a + i) * i) % aaa0061a00610061a != aa0061aa00610061a) {
                a0061aaa00610061a = 97;
                aa0061aa00610061a = 36;
            }
        }

        private void aaa0061a0061a(double d, double d2) {
            this.www0077007700770077 = (d * d2) + this.www0077007700770077;
            int i = a0061aaa00610061a;
            if (((a00610061aa00610061a + i) * i) % aaa0061a00610061a != aa0061aa00610061a) {
                a0061aaa00610061a = 87;
                aa0061aa00610061a = 22;
            }
            this.w0077w0077007700770077 = (d * d) + this.w0077w0077007700770077;
            this.ww00770077007700770077 = (d2 * d2) + this.ww00770077007700770077;
            this.f0066fffff += 1.0d;
        }
    }

    private ooodddo() {
    }

    public static int a0061006100610061a0061a() {
        return 58;
    }

    public static double[][] covariance(@NonNull List<Double> list, @NonNull List<Double> list2) {
        double dMean = mean(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, Double.valueOf(list.get(i2).doubleValue() - dMean));
        }
        double dMean2 = mean(list2);
        while (true) {
            int i3 = aaa00610061a0061a;
            if (((a0061a00610061a0061a + i3) * i3) % aa006100610061a0061a != aaaaa00610061a) {
                aaa00610061a0061a = 99;
                aaaaa00610061a = a0061006100610061a0061a();
            }
            if (i >= list2.size()) {
                ododddo ododddoVar = new ododddo();
                ododddo.aa0061aa0061a(ododddoVar, list, list2);
                return ododddoVar.aa00610061a0061a();
            }
            list2.set(i, Double.valueOf(list2.get(i).doubleValue() - dMean2));
            i++;
        }
    }

    public static double[] eigenValues2X2(double[][] dArr) {
        double[] dArr2 = dArr[0];
        double d = dArr2[0];
        double[] dArr3 = dArr[1];
        double d2 = dArr3[1];
        double d3 = d + d2;
        double d4 = (d * d2) - (dArr2[1] * dArr3[0]);
        int i = aaa00610061a0061a;
        if (((a0061a00610061a0061a + i) * i) % aa006100610061a0061a != aaaaa00610061a) {
            aaa00610061a0061a = a0061006100610061a0061a();
            aaaaa00610061a = 78;
        }
        double d5 = (d3 * d3) - (d4 * 4.0d);
        return new double[]{(Math.sqrt(d5) + d3) / 2.0d, (d3 - Math.sqrt(d5)) / 2.0d};
    }

    public static double mean(@NonNull List<Double> list) {
        int i = aaa00610061a0061a;
        if (((a0061a00610061a0061a + i) * i) % aa006100610061a0061a != 0) {
            aaa00610061a0061a = 36;
            a0061a00610061a0061a = a0061006100610061a0061a();
        }
        double size = list.size();
        Iterator<Double> it = list.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue / size;
    }
}
