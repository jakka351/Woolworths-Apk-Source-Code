package YU;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import au.com.woolworths.android.onesite.app.BaseShopApplication;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Observable;

/* loaded from: classes.dex */
class UJ extends Observable implements SensorEventListener {
    public static String B = CircleProgressBar.a("j`q|B[");
    public static String C = CircleProgressBar.a("9dqk\rhOHGMEmiIGWOK\u0018DZ\\HNA\u0011");
    public static String D = CircleProgressBar.a("LkmjA@MIND\u0000riPKLD\u0019KR@NSIA\u0011TNBT\u001a\u001d4");
    public static String E = CircleProgressBar.a("Z\\YBB]EDLmIlrALFX");
    public static String F;
    public static String G;
    public static String H;
    public static String I;
    public static String J;
    public final AX d;
    public final SensorManager e;
    public Sensor f;
    public Sensor g;
    public HandlerThread h;
    public long i = 0;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public float o = -1.0f;
    public float p = -1.0f;
    public float q = -1.0f;
    public float r = -1.0f;
    public float s = -1.0f;
    public float t = -1.0f;
    public float u = -1.0f;
    public float v = -1.0f;
    public float w = -1.0f;
    public float x = BitmapDescriptorFactory.HUE_RED;
    public final float[] y = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    public int z = 0;
    public boolean A = true;

    static {
        CircleProgressBar.a("VwvjC]M_KNN?jMQWOW]E\u000eSSO\u0012X^FB\\U_sSmc");
        F = CircleProgressBar.a("TjkfBG`BQUEqcV");
        G = CircleProgressBar.a("_dvcHM\f_M\u0001RzaMQWOK\u0018ZAIUT\\\u0011\\FEAQ]\u007f[");
        H = CircleProgressBar.a("^|m`~JC[G\u0001SkgPWP\n");
        I = CircleProgressBar.a("\\}|j]]EDL\u0001Oq&CGW^PVP\u000eNYUA^B\u000fEPFEsJm");
        J = CircleProgressBar.a("\\}|j]]EDL\u0001Iq&TPLI\\KDGS[\u001b_^DFY[\u0014VlLfs");
    }

    public UJ(BaseShopApplication baseShopApplication, AX ax) {
        this.d = ax;
        try {
            this.e = (SensorManager) baseShopApplication.getSystemService(B);
        } catch (Exception e) {
            O.a(F, I, e);
            UB.a(e);
        }
    }

    public final float[] a(float[] fArr) {
        float fNanoTime = System.nanoTime();
        int i = this.z + 1;
        this.z = i;
        float f = 1.0f / (i / ((fNanoTime - this.x) / 1.0E9f));
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            f = 0.0f;
        }
        float f2 = 0.18f / (f + 0.18f);
        float[] fArr2 = this.y;
        float f3 = 1.0f - f2;
        fArr2[0] = (fArr[0] * f3) + (fArr2[0] * f2);
        fArr2[1] = (fArr[1] * f3) + (fArr2[1] * f2);
        fArr2[2] = (f3 * fArr[2]) + (f2 * fArr2[2]);
        float[] fArr3 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        float f4 = fArr[0] - fArr2[0];
        fArr3[0] = f4;
        fArr3[1] = fArr[1] - fArr2[1];
        fArr3[2] = fArr[2] - fArr2[2];
        if (Float.isNaN(f4) || Float.isInfinite(fArr3[0])) {
            fArr3[0] = 0.0f;
        }
        if (Float.isNaN(fArr3[1]) || Float.isInfinite(fArr3[1])) {
            fArr3[1] = 0.0f;
        }
        if (!Float.isNaN(fArr3[2]) && !Float.isInfinite(fArr3[2])) {
            return fArr3;
        }
        fArr3[2] = 0.0f;
        return fArr3;
    }

    public final void b() {
        boolean z = this.k;
        SensorManager sensorManager = this.e;
        if (z) {
            sensorManager.unregisterListener(this, this.g);
            this.k = false;
        }
        if (this.j) {
            sensorManager.unregisterListener(this, this.f);
            this.j = false;
        }
        this.n = false;
        HandlerThread handlerThread = this.h;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.h.quitSafely();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.n && sensorEvent.accuracy == 0) {
                O.e(F, D, new Throwable[0]);
                this.n = true;
            }
            int type = sensorEvent.sensor.getType();
            if (type == 4) {
                if (this.k) {
                    float[] fArr = sensorEvent.values;
                    this.u = fArr[0];
                    this.v = fArr[1];
                    this.w = fArr[2];
                    this.l = true;
                }
            } else if (type == 1 && this.j) {
                float[] fArr2 = sensorEvent.values;
                this.o = fArr2[0];
                this.p = fArr2[1];
                this.q = fArr2[2];
                float[] fArrA = a(fArr2);
                float f = fArrA[0];
                this.r = f;
                float f2 = fArrA[1];
                this.s = f2;
                float f3 = fArrA[2];
                this.o *= -1.0f;
                this.p *= -1.0f;
                this.q *= -1.0f;
                this.r = f * (-1.0f);
                this.s = f2 * (-1.0f);
                this.t = f3 * (-1.0f);
                this.m = true;
            }
            if (this.l && this.m) {
                long j = jUptimeMillis - this.i;
                if (j >= 100 || Q.c == 1) {
                    this.i = jUptimeMillis;
                    int i = Q.c;
                    Q.c = 0;
                    setChanged();
                    notifyObservers(new FA(this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.i, this.A, j));
                    this.l = !this.k;
                    this.m = !this.j;
                    this.A = false;
                }
            }
        } catch (Exception e) {
            O.e(F, J, e);
            UB.a(e);
        }
    }
}
