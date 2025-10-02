package com.behaviosec.rl;

import android.hardware.SensorEvent;

/* loaded from: classes4.dex */
public class yllllyy {
    public static int h00680068h0068hh0068 = 34;
    public static int h0068h00680068hh0068 = 1;
    public static int hh006800680068hh0068 = 2;
    public static int hhh00680068hh0068 = 0;
    private static final int x0078007800780078x0078 = 3;
    private static final int x0078x00780078x0078 = 1;
    private static final int xx007800780078x0078 = 2;
    private static final int xxx00780078x0078 = 0;
    public final yyyyyyl[] x0078xxx00780078 = new yyyyyyl[3];
    public long xxxxx00780078;

    public yllllyy(long j) {
        d0064d0064d00640064();
        this.xxxxx00780078 = j;
    }

    public static int h0068006800680068hh0068() {
        return 22;
    }

    public void d0064006400640064d0064(SensorEvent sensorEvent) {
        int i = h00680068h0068hh0068;
        if (((h0068h00680068hh0068 + i) * i) % hh006800680068hh0068 != hhh00680068hh0068) {
            h00680068h0068hh0068 = 73;
            hhh00680068hh0068 = 91;
        }
        ddddd00640064(sensorEvent.values);
    }

    public synchronized yyyyyyl d00640064dd00640064() {
        yyyyyyl[] yyyyyylVarArr;
        try {
            yyyyyylVarArr = this.x0078xxx00780078;
            int i = h00680068h0068hh0068;
            if (((h0068h00680068hh0068 + i) * i) % hh006800680068hh0068 != hhh00680068hh0068) {
                h00680068h0068hh0068 = 51;
                hhh00680068hh0068 = h0068006800680068hh0068();
            }
        } catch (Exception e) {
            throw e;
        }
        return yyyyyylVarArr[1];
    }

    public synchronized void d0064d0064d00640064() {
        int i = 1;
        while (true) {
            try {
                try {
                    i /= 0;
                } catch (Exception unused) {
                    this.x0078xxx00780078[0] = new yyyyyyl();
                    try {
                        this.x0078xxx00780078[1] = new yyyyyyl();
                        this.x0078xxx00780078[2] = new yyyyyyl();
                        return;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public void d0064ddd00640064(float f, yyyyyyl yyyyyylVar) {
        if (Float.isNaN(f)) {
            return;
        }
        int i = h00680068h0068hh0068;
        if (((h0068h00680068hh0068 + i) * i) % hh006800680068hh0068 != hhh00680068hh0068) {
            h00680068h0068hh0068 = 31;
            hhh00680068hh0068 = h0068006800680068hh0068();
        }
        if (Float.isInfinite(f)) {
            return;
        }
        yyyyyylVar.kkk006B006Bkk(Math.abs(f), this.xxxxx00780078);
    }

    public synchronized yyyyyyl dd0064dd00640064() {
        yyyyyyl[] yyyyyylVarArr;
        try {
            yyyyyylVarArr = this.x0078xxx00780078;
            int i = h00680068h0068hh0068;
            if (((h0068h00680068hh0068 + i) * i) % hh006800680068hh0068 != hhh00680068hh0068) {
                h00680068h0068hh0068 = 10;
                hhh00680068hh0068 = h0068006800680068hh0068();
            }
        } catch (Throwable th) {
            throw th;
        }
        return yyyyyylVarArr[0];
    }

    public synchronized yyyyyyl ddd0064d00640064() {
        yyyyyyl[] yyyyyylVarArr;
        try {
            yyyyyylVarArr = this.x0078xxx00780078;
            int i = h00680068h0068hh0068;
            if (((h0068h00680068hh0068 + i) * i) % hh006800680068hh0068 != hhh00680068hh0068) {
                h00680068h0068hh0068 = 28;
                hhh00680068hh0068 = h0068006800680068hh0068();
            }
        } catch (Throwable th) {
            throw th;
        }
        return yyyyyylVarArr[2];
    }

    public synchronized void ddddd00640064(float[] fArr) {
        try {
            throw null;
        } catch (Exception unused) {
            h00680068h0068hh0068 = 80;
            d0064ddd00640064(fArr[0], this.x0078xxx00780078[0]);
            d0064ddd00640064(fArr[1], this.x0078xxx00780078[1]);
            d0064ddd00640064(fArr[2], this.x0078xxx00780078[2]);
        }
    }
}
