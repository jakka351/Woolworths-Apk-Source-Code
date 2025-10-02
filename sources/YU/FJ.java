package YU;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import au.com.woolworths.android.onesite.app.BaseShopApplication;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.util.Observable;

/* loaded from: classes.dex */
class FJ extends Observable implements SensorEventListener {
    public static String A;
    public static String B;
    public static String C;
    public static String t = CircleProgressBar.a("VwvjC]M_KNNSoWVFD\\J");
    public static String u = CircleProgressBar.a("Z\\Y@_@IEV@TviJnJYM]YKO");
    public static String v = CircleProgressBar.a("LkmjA@MIND\u0000ptMGM^XL^AS\u001cHW_C@D\u0015PRnH&)\u0013");
    public static String w;
    public static String x;
    public static String y;
    public static String z;
    public final AX d;
    public final SensorManager e;
    public Sensor f;
    public Sensor g;
    public Sensor h;
    public HandlerThread i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public long p = 0;
    public float[] q = new float[3];
    public float[] r = new float[3];
    public boolean s = true;

    static {
        CircleProgressBar.a("VwvjC]M_KNN?jMQWOW]E\u000eSSO\u0012X^FB\\U_sSmc");
        w = CircleProgressBar.a("Tll|DGK\u000bo@GqcPMNOM]E");
        x = CircleProgressBar.a("\\}|j]]EDL\u0001Iq&TPLI\\KDGS[\u001b]CYJXAUGsFf'X_iev");
        y = CircleProgressBar.a("Tll|DGK\u000beSAioP[");
        z = CircleProgressBar.a("Tll|DGK\u000bcBCzjAPLG\\LR\\");
        A = CircleProgressBar.a("j`q|B[");
        B = CircleProgressBar.a("\\}|j]]EDL\u0001Oq&CGW^PVP\u000eNYUA^B\u000fEPFEsJm");
        C = CircleProgressBar.a("_dvcHM\f_M\u0001RzaMQWOK\u0018X\\TYUFPDFY[\u0014_sZ|bSL~");
    }

    public FJ(BaseShopApplication baseShopApplication, AX ax) {
        this.d = ax;
        try {
            this.e = (SensorManager) baseShopApplication.getSystemService(A);
        } catch (NullPointerException e) {
            O.a(t, B, e);
            UB.a(e);
        }
    }

    public final void a() {
        boolean z2 = this.k;
        SensorManager sensorManager = this.e;
        if (z2) {
            sensorManager.unregisterListener(this, this.g);
            this.k = false;
        }
        if (this.l) {
            sensorManager.unregisterListener(this, this.h);
            this.l = false;
        }
        if (this.j) {
            sensorManager.unregisterListener(this, this.f);
            this.j = false;
        }
        this.o = false;
        HandlerThread handlerThread = this.i;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.i.quitSafely();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.o && sensorEvent.accuracy == 0) {
                O.e(t, v, new Throwable[0]);
                this.o = true;
            }
            int type = sensorEvent.sensor.getType();
            if (type == 9 || type == 1) {
                this.q = (float[]) sensorEvent.values.clone();
                this.m = true;
                if (this.m) {
                    return;
                } else {
                    return;
                }
            }
            if (type == 2) {
                this.r = (float[]) sensorEvent.values.clone();
                this.n = true;
            }
            if (this.m || !this.n) {
                return;
            }
            long j = jUptimeMillis - this.p;
            if (j >= 100 || Q.d == 1) {
                this.p = jUptimeMillis;
                int i = Q.c;
                Q.d = 0;
                setChanged();
                notifyObservers(new UT(this.q, this.r, this.p, this.s, j));
                this.m = false;
                this.n = false;
                this.s = false;
            }
        } catch (Exception e) {
            O.e(t, x, e);
            UB.a(e);
        }
    }
}
