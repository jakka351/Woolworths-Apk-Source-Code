package com.behaviosec.rl;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Pair;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class yylllly implements SensorEventListener {
    private static final long l006C006C006Cl006Cl = 1000000;
    private static final float l006C006Cl006Cl006C = 1.0E-9f;
    public static AtomicBoolean l006C006Cll006C006C = null;
    private static final String ll006C006Cl006Cl;
    private static final float ll006Cl006Cl006C = 0.5f;
    public static AtomicBoolean lll006Cl006C006C = null;
    public static boolean llll006C006Cl = false;
    public static int r0072007200720072rr0072 = 2;
    public static int r00720072rr0072r0072 = 0;
    public static int r0072r00720072rr0072 = 22;
    public static int rr007200720072rr0072 = 1;
    private Context l006C006C006Cl006C006C;
    public ViewGroup l006Cl006Cl006C006C;
    private long l006Clll006C006C;
    public ViewGroup ll006C006Cl006C006C;
    public JSONArray l006Cll006C006Cl = new JSONArray();
    public JSONArray ll006Cl006C006Cl = new JSONArray();
    public yyllyly l006C006Cl006C006Cl = new yyllyly(20, -2.0d, 2.0d);
    public yyllyly lll006C006C006Cl = new yyllyly(20, -2.0d, 2.0d);
    public yyllyly l006Cl006C006C006Cl = new yyllyly(20, -2.0d, 2.0d);
    public yyllyly ll006C006C006C006Cl = new yyllyly(20, -10.0d, 10.0d);
    public yyllyly l006C006C006C006C006Cl = new yyllyly(20, -10.0d, 10.0d);
    public yyllyly llllll006C = new yyllyly(20, -10.0d, 10.0d);
    public ylllyly l006Cllll006C = new ylllyly();
    public ylllyly ll006Clll006C = new ylllyly();
    public ylllyly l006C006Clll006C = new ylllyly();
    public ylllyly lll006Cll006C = new ylllyly();
    public ylllyly l006Cl006Cll006C = new ylllyly();
    public ylllyly ll006C006Cll006C = new ylllyly();
    public float l006C006C006Cll006C = -1.0f;
    public Queue<Pair<yllylyl<Double, Double, Double>, Long>> llll006Cl006C = new yylylyy(50);
    public Queue<Pair<yllylyl<Double, Double, Double>, Long>> l006Cll006Cl006C = new yylylyy(50);
    private float[] lll006C006Cl006C = new float[3];
    private float[] l006Cl006C006Cl006C = new float[3];
    private float[] ll006C006C006Cl006C = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private Queue<float[]> l006C006C006C006Cl006C = new LinkedList();
    private Queue<float[]> lllll006C006C = new LinkedList();
    private float[] ll006Cll006C006C = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    static {
        int i = r0072r00720072rr0072;
        if (((rr007200720072rr0072 + i) * i) % r0072007200720072rr0072 != r00720072rr0072r0072) {
            r0072r00720072rr0072 = 61;
            r00720072rr0072r0072 = 77;
        }
        ll006C006Cl006Cl = uuxuuuu.pp0070p0070ppp("\u0004Sd\b.\u0013iN\u001b[WaCOl\u0014O*xo\u0018T,6\f\u0007", (char) (yylylll.r0072r0072r00720072() ^ (-1349847147)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741342)), (char) (yyyllll.rrrr007200720072() ^ 383821871));
        llll006C006Cl = false;
        l006C006Cll006C006C = new AtomicBoolean(false);
        lll006Cl006C006C = new AtomicBoolean(false);
    }

    public yylllly(Context context, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.l006C006C006Cl006C006C = context;
        this.l006Cl006Cl006C006C = viewGroup;
        this.ll006C006Cl006C006C = viewGroup2;
    }

    private void k006Bk006Bkkk(double d, yyllyly yyllylyVar) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return;
        }
        yyllylyVar.bb006200620062bb(d);
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                r0072r00720072rr0072 = 25;
                return;
            }
        }
    }

    private float[] k006Bkk006Bkk(float f) {
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        float[] fArr2 = new float[9];
        if (!SensorManager.getRotationMatrix(fArr2, null, this.l006Cl006C006Cl006C, this.lll006C006Cl006C)) {
            return fArr;
        }
        float[] fArrDdd006400640064d = ylllyyy.ddd006400640064d(ylllyyy.d0064d006400640064d(fArr2), f);
        float[] fArr3 = {fArrDdd006400640064d[0] / 20.0f, fArrDdd006400640064d[1] / 20.0f, fArrDdd006400640064d[2] / 20.0f};
        int i = 3;
        for (float[] fArr4 : this.l006C006C006C006Cl006C) {
            fArr3[0] = (fArr4[0] / 20.0f) + fArr3[0];
            fArr3[1] = (fArr4[1] / 20.0f) + fArr3[1];
            fArr3[2] = (fArr4[2] / 20.0f) + fArr3[2];
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused) {
                    r0072r00720072rr0072 = 16;
                }
            }
        }
        this.l006C006C006C006Cl006C.add(fArrDdd006400640064d);
        int i2 = ((int) 20.0f) - 1;
        if (this.l006C006C006C006Cl006C.size() > i2) {
            this.l006C006C006C006Cl006C.remove();
        }
        float f2 = fArr3[0];
        float[] fArr5 = this.ll006C006C006Cl006C;
        float[] fArr6 = {f2 - fArr5[0], fArr3[1] - fArr5[1], fArr3[2] - fArr5[2]};
        this.ll006C006C006Cl006C = fArr3;
        float[] fArr7 = {fArr6[0] / 20.0f, fArr6[1] / 20.0f, fArr6[2] / 20.0f};
        for (float[] fArr8 : this.lllll006C006C) {
            fArr7[0] = (fArr8[0] / 20.0f) + fArr7[0];
            fArr7[1] = (fArr8[1] / 20.0f) + fArr7[1];
            fArr7[2] = (fArr8[2] / 20.0f) + fArr7[2];
        }
        this.lllll006C006C.add(fArr6);
        if (this.lllll006C006C.size() > i2) {
            this.lllll006C006C.remove();
        }
        return fArr7;
    }

    private void kk006B006Bkkk(double d, ylllyly ylllylyVar) {
        if (Double.isNaN(d)) {
            return;
        }
        boolean zIsInfinite = Double.isInfinite(d);
        if ((rrrrr0072r0072() * (rrrrr0072r0072() + rr007200720072rr0072)) % r0072007200720072rr0072 != r00720072rr0072r0072) {
            r0072r00720072rr0072 = rrrrr0072r0072();
            r00720072rr0072r0072 = rrrrr0072r0072();
        }
        if (zIsInfinite) {
            return;
        }
        ylllylyVar.b0062b0062bb0062(d);
    }

    private void kkkk006Bkk(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        float[] fArr = this.ll006Cll006C006C;
        float f2 = (0.19999999f * f) + (fArr[0] * 0.8f);
        fArr[0] = f2;
        float f3 = f - f2;
        k006Bk006Bkkk(f3, this.ll006C006C006C006Cl);
        float f4 = sensorEvent.values[1];
        float[] fArr2 = this.ll006Cll006C006C;
        float f5 = (0.19999999f * f4) + (fArr2[1] * 0.8f);
        fArr2[1] = f5;
        float f6 = f4 - f5;
        k006Bk006Bkkk(f6, this.l006C006C006C006C006Cl);
        float f7 = sensorEvent.values[2];
        float[] fArr3 = this.ll006Cll006C006C;
        float f8 = (0.19999999f * f7) + (fArr3[2] * 0.8f);
        fArr3[2] = f8;
        float f9 = f7 - f8;
        float[] fArr4 = {f3, f6, f9};
        k006Bk006Bkkk(f9, this.llllll006C);
        if (llll006C006Cl) {
            JSONArray jSONArray = new JSONArray();
            int i = r0072r00720072rr0072;
            if (((rr007200720072rr0072 + i) * i) % r0072007200720072rr0072 != 0) {
                r0072r00720072rr0072 = 74;
                r00720072rr0072r0072 = rrrrr0072r0072();
            }
            jSONArray.put(Double.valueOf(fArr4[0]));
            jSONArray.put(Double.valueOf(fArr4[1]));
            jSONArray.put(Double.valueOf(fArr4[2]));
            jSONArray.put(Long.valueOf(sensorEvent.timestamp / l006C006C006Cl006Cl));
            this.ll006Cl006C006Cl.put(jSONArray);
        }
    }

    public static int r00720072r00720072r0072() {
        return 1;
    }

    public static int rr0072r00720072r0072() {
        return 2;
    }

    public static int rrrrr0072r0072() {
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0ebd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x103e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0613  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject k006B006B006Bkkk(java.util.List<com.behaviosec.rl.yylyyyy> r81) {
        /*
            Method dump skipped, instructions count: 4323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.yylllly.k006B006B006Bkkk(java.util.List):org.json.JSONObject");
    }

    public void kk006Bk006Bkk() {
        this.l006C006Cl006C006Cl = new yyllyly(20, -2.0d, 2.0d);
        this.lll006C006C006Cl = new yyllyly(20, -2.0d, 2.0d);
        this.l006Cl006C006C006Cl = new yyllyly(20, -2.0d, 2.0d);
        this.ll006C006C006C006Cl = new yyllyly(20, -10.0d, 10.0d);
        this.l006C006C006C006C006Cl = new yyllyly(20, -10.0d, 10.0d);
        this.llllll006C = new yyllyly(20, -10.0d, 10.0d);
        this.l006Cllll006C = new ylllyly();
        int i = r0072r00720072rr0072;
        if (((rr007200720072rr0072 + i) * i) % r0072007200720072rr0072 != 0) {
            r0072r00720072rr0072 = rrrrr0072r0072();
            rr007200720072rr0072 = 57;
        }
        this.ll006Clll006C = new ylllyly();
        this.l006C006Clll006C = new ylllyly();
        this.lll006Cll006C = new ylllyly();
        this.l006Cl006Cll006C = new ylllyly();
        this.ll006C006Cll006C = new ylllyly();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void kkk006Bkkk() {
        if (llll006C006Cl) {
            this.l006Cll006C006Cl = new JSONArray();
            this.ll006Cl006C006Cl = new JSONArray();
        }
        for (Pair<yllylyl<Double, Double, Double>, Long> pair : this.llll006Cl006C) {
            yllylyl yllylylVar = (yllylyl) pair.first;
            Long l = (Long) pair.second;
            k006Bk006Bkkk(((Double) yllylylVar.first).doubleValue(), this.l006C006Cl006C006Cl);
            k006Bk006Bkkk(((Double) yllylylVar.second).doubleValue(), this.lll006C006C006Cl);
            k006Bk006Bkkk(((Double) yllylylVar.third).doubleValue(), this.l006Cl006C006C006Cl);
            if (llll006C006Cl) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(yllylylVar.first);
                jSONArray.put(yllylylVar.second);
                jSONArray.put(yllylylVar.third);
                jSONArray.put(l);
                this.l006Cll006C006Cl.put(jSONArray);
            }
        }
        for (Pair<yllylyl<Double, Double, Double>, Long> pair2 : this.l006Cll006Cl006C) {
            yllylyl yllylylVar2 = (yllylyl) pair2.first;
            Long l2 = (Long) pair2.second;
            k006Bk006Bkkk(((Double) yllylylVar2.first).doubleValue(), this.ll006C006C006C006Cl);
            k006Bk006Bkkk(((Double) yllylylVar2.second).doubleValue(), this.l006C006C006C006C006Cl);
            k006Bk006Bkkk(((Double) yllylylVar2.third).doubleValue(), this.llllll006C);
            if (llll006C006Cl) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(yllylylVar2.first);
                jSONArray2.put(yllylylVar2.second);
                int i = r0072r00720072rr0072;
                if (((rr007200720072rr0072 + i) * i) % r0072007200720072rr0072 != r00720072rr0072r0072) {
                    r0072r00720072rr0072 = rrrrr0072r0072();
                    r00720072rr0072r0072 = 57;
                }
                jSONArray2.put(yllylylVar2.third);
                jSONArray2.put(l2);
                this.ll006Cl006C006Cl.put(jSONArray2);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 10) {
            if (sensorEvent.sensor.getType() == 4) {
                this.l006Cll006Cl006C.add(new Pair<>(new yllylyl(Double.valueOf(sensorEvent.values[0]), Double.valueOf(sensorEvent.values[1]), Double.valueOf(sensorEvent.values[2])), Long.valueOf(sensorEvent.timestamp / l006C006C006Cl006Cl)));
                k006Bk006Bkkk(sensorEvent.values[0], this.ll006C006C006C006Cl);
                k006Bk006Bkkk(sensorEvent.values[1], this.l006C006C006C006C006Cl);
                k006Bk006Bkkk(sensorEvent.values[2], this.llllll006C);
                kk006B006Bkkk(sensorEvent.values[0], this.lll006Cll006C);
                kk006B006Bkkk(sensorEvent.values[1], this.l006Cl006Cll006C);
                kk006B006Bkkk(sensorEvent.values[2], this.ll006C006Cll006C);
                if (llll006C006Cl) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(Double.valueOf(sensorEvent.values[0]));
                    jSONArray.put(Double.valueOf(sensorEvent.values[1]));
                    jSONArray.put(Double.valueOf(sensorEvent.values[2]));
                    jSONArray.put(Long.valueOf(sensorEvent.timestamp / l006C006C006Cl006Cl));
                    this.ll006Cl006C006Cl.put(jSONArray);
                    return;
                }
                return;
            }
            if (sensorEvent.sensor.getType() != 1) {
                if (sensorEvent.sensor.getType() != 2) {
                    if (sensorEvent.sensor.getType() == 5) {
                        this.l006C006C006Cll006C = sensorEvent.values[0];
                        return;
                    }
                    return;
                } else {
                    if (!l006C006Cll006C006C.get() || Float.isNaN(sensorEvent.values[0]) || Float.isNaN(sensorEvent.values[1]) || Float.isNaN(sensorEvent.values[2])) {
                        return;
                    }
                    this.lll006C006Cl006C = ylllyyy.dd0064d00640064d(sensorEvent.values, this.lll006C006Cl006C, 0.5f, 0.5f);
                    return;
                }
            }
            if (lll006Cl006C006C.get()) {
                kkkk006Bkk(sensorEvent);
            }
            if (!l006C006Cll006C006C.get() || Float.isNaN(sensorEvent.values[0]) || Float.isNaN(sensorEvent.values[1]) || Float.isNaN(sensorEvent.values[2])) {
                return;
            }
            this.l006Cl006C006Cl006C = ylllyyy.dd0064d00640064d(sensorEvent.values, this.l006Cl006C006Cl006C, 0.5f, 0.5f);
            long j = sensorEvent.timestamp;
            float f = (j - this.l006Clll006C006C) * l006C006Cl006Cl006C;
            this.l006Clll006C006C = j;
            float[] fArrK006Bkk006Bkk = k006Bkk006Bkk(f);
            this.l006Cll006Cl006C.add(new Pair<>(new yllylyl(Double.valueOf(fArrK006Bkk006Bkk[0]), Double.valueOf(fArrK006Bkk006Bkk[1]), Double.valueOf(fArrK006Bkk006Bkk[2])), Long.valueOf(sensorEvent.timestamp / l006C006C006Cl006Cl)));
            k006Bk006Bkkk(fArrK006Bkk006Bkk[0], this.ll006C006C006C006Cl);
            k006Bk006Bkkk(fArrK006Bkk006Bkk[1], this.l006C006C006C006C006Cl);
            k006Bk006Bkkk(fArrK006Bkk006Bkk[2], this.llllll006C);
            kk006B006Bkkk(fArrK006Bkk006Bkk[0], this.lll006Cll006C);
            kk006B006Bkkk(fArrK006Bkk006Bkk[1], this.l006Cl006Cll006C);
            kk006B006Bkkk(fArrK006Bkk006Bkk[2], this.ll006C006Cll006C);
            if (llll006C006Cl) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(Double.valueOf(fArrK006Bkk006Bkk[0]));
                jSONArray2.put(Double.valueOf(fArrK006Bkk006Bkk[1]));
                jSONArray2.put(Double.valueOf(fArrK006Bkk006Bkk[2]));
                jSONArray2.put(Long.valueOf(sensorEvent.timestamp / l006C006C006Cl006Cl));
                this.ll006Cl006C006Cl.put(jSONArray2);
                return;
            }
            return;
        }
        this.llll006Cl006C.add(new Pair<>(new yllylyl(Double.valueOf(sensorEvent.values[0]), Double.valueOf(sensorEvent.values[1]), Double.valueOf(sensorEvent.values[2])), Long.valueOf(sensorEvent.timestamp / l006C006C006Cl006Cl)));
        k006Bk006Bkkk(sensorEvent.values[0], this.l006C006Cl006C006Cl);
        k006Bk006Bkkk(sensorEvent.values[1], this.lll006C006C006Cl);
        k006Bk006Bkkk(sensorEvent.values[2], this.l006Cl006C006C006Cl);
        kk006B006Bkkk(sensorEvent.values[0], this.l006Cllll006C);
        kk006B006Bkkk(sensorEvent.values[1], this.ll006Clll006C);
        kk006B006Bkkk(sensorEvent.values[2], this.l006C006Clll006C);
        if (!llll006C006Cl) {
            return;
        }
        JSONArray jSONArray3 = new JSONArray();
        jSONArray3.put(Double.valueOf(sensorEvent.values[0]));
        try {
            throw null;
        } catch (Exception unused) {
            r0072r00720072rr0072 = rrrrr0072r0072();
            try {
                throw null;
            } catch (Exception unused2) {
                r0072r00720072rr0072 = 83;
                while (true) {
                    try {
                        int[] iArr = new int[-1];
                    } catch (Exception unused3) {
                        r0072r00720072rr0072 = 95;
                        jSONArray3.put(Double.valueOf(sensorEvent.values[1]));
                        jSONArray3.put(Double.valueOf(sensorEvent.values[2]));
                        if (((r0072r00720072rr0072 + rr007200720072rr0072) * r0072r00720072rr0072) % r0072007200720072rr0072 != r00720072rr0072r0072) {
                            r0072r00720072rr0072 = 59;
                            r00720072rr0072r0072 = rrrrr0072r0072();
                        }
                        jSONArray3.put(Long.valueOf(sensorEvent.timestamp / l006C006C006Cl006Cl));
                        this.l006Cll006C006Cl.put(jSONArray3);
                        return;
                    }
                }
            }
        }
    }
}
