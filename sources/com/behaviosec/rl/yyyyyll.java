package com.behaviosec.rl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.behaviosec.rl.android.LogBridge;
import com.behaviosec.rl.ooooodd;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class yyyyyll implements SensorEventListener {
    public static int c00630063cc0063c0063 = 0;
    public static int c0063c0063c0063c0063 = 2;
    public static int cc0063cc0063c0063 = 77;
    public static int ccc0063c0063c0063 = 1;
    private static final int q0071007100710071qq = 20;
    private static final float q00710071q00710071q = 0.02f;
    private static final int q0071qqq0071q = 5;
    private static final long qq0071qq0071q = 500;
    private static final float qqq007100710071q = 50.0f;
    private static final int qqqqq0071q = 5000;
    private Runnable q00710071007100710071q;
    private List<yyyylll> q007100710071q0071q;
    private final int q00710071qq0071q;
    private AtomicBoolean q0071q007100710071q;
    private final ExecutorService q0071q0071q0071q;
    private final AtomicBoolean q0071qq00710071q;
    private Runnable qq0071007100710071q;
    private final String qq007100710071qq;
    private final Runnable qq00710071q0071q;
    private long qq0071q00710071q;
    private final Handler qqq0071q0071q = new Handler(Looper.getMainLooper());
    private final Queue<JSONArray> qqqq00710071q;
    private Runnable qqqqqq0071;

    public class ylllyll implements Runnable {
        private final long qqqq0071q0071;

        private ylllyll(long j) {
            this.qqqq0071q0071 = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogBridge.d(yyyyyll.r0072rrrr0072(yyyyyll.this), uuxuuuu.pp0070p0070ppp("o\u0018\u001a\u001d\u000e~\u0010\u0014\t\u0013\u001aA", (char) (yylylll.r0072r0072r00720072() ^ (-1349847062)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847224)), (char) (yyyllll.rrrr007200720072() ^ 383821869)) + this);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.qqqq0071q0071);
            Iterator it = yyyyyll.rr00720072rr0072(yyyyyll.this).iterator();
            boolean z = true;
            while (it.hasNext()) {
                JSONArray jSONArrayRr0072007200720072r = ((yyyylll) it.next()).rr0072007200720072r();
                if (jSONArrayRr0072007200720072r.length() > 0) {
                    z = false;
                }
                jSONArray.put(jSONArrayRr0072007200720072r);
            }
            if (!z) {
                synchronized (yyyyyll.rrrr0072r0072(yyyyyll.this)) {
                    yyyyyll.rrrr0072r0072(yyyyyll.this).add(jSONArray);
                }
            }
            yyyyyll.this.q0071q0071q0071q.submit(yyyyyll.r0072rr0072r0072(yyyyyll.this));
        }
    }

    public class yyllyll implements Runnable {
        private final SensorEvent qq00710071qq0071;

        private yyllyll(SensorEvent sensorEvent) {
            this.qq00710071qq0071 = sensorEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = yyyyyll.rr00720072rr0072(yyyyyll.this).iterator();
            while (it.hasNext()) {
                ((yyyylll) it.next()).r0072r007200720072r(this.qq00710071qq0071);
                while (true) {
                    try {
                        int[] iArr = new int[-1];
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public static class yyyylll {
        public static int c0063ccc006300630063 = 1;
        public static int cc0063cc006300630063 = 2;
        public static int ccccc006300630063 = 55;
        private final ooooodd q00710071q0071q0071;
        private final int qq0071q0071q0071;
        public final List<Float> qqq00710071q0071;

        private yyyylll(int i, ooooodd oooooddVar) {
            this.qqq00710071q0071 = new ArrayList();
            this.qq0071q0071q0071 = i;
            this.q00710071q0071q0071 = oooooddVar;
        }

        public static int c00630063cc006300630063() {
            return 50;
        }

        public static int ccc0063c006300630063() {
            return 2;
        }

        public void r0072r007200720072r(SensorEvent sensorEvent) {
            float fS0073sss0073s = sensorEvent.values[this.qq0071q0071q0071];
            int i = ccccc006300630063;
            if (((c0063ccc006300630063 + i) * i) % cc0063cc006300630063 != 0) {
                ccccc006300630063 = c00630063cc006300630063();
                c0063ccc006300630063 = c00630063cc006300630063();
            }
            ooooodd oooooddVar = this.q00710071q0071q0071;
            if (oooooddVar != null) {
                fS0073sss0073s = oooooddVar.s0073sss0073s(fS0073sss0073s);
            }
            this.qqq00710071q0071.add(Float.valueOf(fS0073sss0073s));
        }

        public JSONArray rr0072007200720072r() {
            if (this.qqq00710071q0071.size() < 2) {
                return new JSONArray();
            }
            yyllyly yyllylyVar = new yyllyly(40, -20.0d, 20.0d);
            int size = this.qqq00710071q0071.size();
            while (true) {
                size--;
                int i = ccccc006300630063;
                if (((c0063ccc006300630063 + i) * i) % ccc0063c006300630063() != 0) {
                    ccccc006300630063 = c00630063cc006300630063();
                    c0063ccc006300630063 = c00630063cc006300630063();
                }
                if (size < 0) {
                    return yyllylyVar.b00620062006200620062b(5);
                }
                float fFloatValue = this.qqq00710071q0071.get(size).floatValue();
                ooooodd oooooddVar = this.q00710071q0071q0071;
                if (oooooddVar != null) {
                    fFloatValue = oooooddVar.s0073sss0073s(fFloatValue);
                }
                yyllylyVar.bb006200620062bb(fFloatValue);
            }
        }
    }

    public yyyyyll(String str, int i) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.q0071q0071q0071q = executorServiceNewSingleThreadExecutor;
        this.qq00710071q0071q = new Runnable() { // from class: com.behaviosec.rl.yyyyyll.1
            public static int c00630063006300630063c0063 = 2;
            public static int c0063c006300630063c0063 = 83;
            public static int cc0063006300630063c0063 = 1;

            @Override // java.lang.Runnable
            public void run() {
                yyyyyll.this.q0071q0071q0071q.submit(yyyyyll.r00720072007200720072r(yyyyyll.this));
                int i2 = c0063c006300630063c0063;
                if (((cc0063006300630063c0063 + i2) * i2) % c00630063006300630063c0063 != 0) {
                    c0063c006300630063c0063 = 85;
                    cc0063006300630063c0063 = 45;
                }
            }
        };
        this.qqqq00710071q = new yylylyy(20);
        this.q0071qq00710071q = new AtomicBoolean(false);
        this.qq0071q00710071q = 0L;
        this.q0071q007100710071q = new AtomicBoolean(false);
        this.qq0071007100710071q = new Runnable() { // from class: com.behaviosec.rl.yyyyyll.2
            public static int c00630063ccc00630063 = 2;
            public static int c0063cccc00630063 = 0;
            public static int cc0063ccc00630063 = 1;
            public static int cccccc00630063 = 87;

            public static int ccc0063cc00630063() {
                return 99;
            }

            @Override // java.lang.Runnable
            public void run() {
                LogBridge.d(yyyyyll.r0072rrrr0072(yyyyyll.this), uuxuuuu.pp0070p0070ppp("\u000e\u0010}\u0010\u0013r\u0002\u000f\u0013\u0010\u000e\u0014\u000eG", (char) (ylyylll.r0072rrr00720072() ^ (-1691741305)), (char) (yllylll.r007200720072r00720072() ^ (-1146716835)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))) + this);
                yyyyyll yyyyyllVar = yyyyyll.this;
                int i2 = cccccc00630063;
                if (((cc0063ccc00630063 + i2) * i2) % c00630063ccc00630063 != c0063cccc00630063) {
                    cccccc00630063 = 0;
                    c0063cccc00630063 = ccc0063cc00630063();
                }
                yyyyyll.rr0072rrr0072(yyyyyllVar).set(true);
                yyyyyll.r00720072rrr0072(yyyyyll.this, SystemClock.uptimeMillis());
                if (yyyyyll.rrr0072rr0072(yyyyyll.this).get()) {
                    return;
                }
                yyyyyll.r0072r0072rr0072(yyyyyll.this).postDelayed(this, 5000L);
            }
        };
        this.q00710071007100710071q = new Runnable() { // from class: com.behaviosec.rl.yyyyyll.3
            @Override // java.lang.Runnable
            public void run() {
                byte b;
                byte b2;
                LogBridge.d(yyyyyll.r0072rrrr0072(yyyyyll.this), uuxuuuu.pp0070p0070ppp("\u001a3C_7ZsZz\u0014KB", (char) (ylyylll.r0072rrr00720072() ^ (-1691741273)), (char) (yyyllll.rrrr007200720072() ^ 383822046), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + this);
                yyyyyll.rr0072rrr0072(yyyyyll.this).set(false);
                yyyyyll.r007200720072rr0072(yyyyyll.this, new ArrayList());
                int i2 = 0;
                while (true) {
                    ooooodd oooooddVar = null;
                    b2 = 0;
                    b = 0;
                    byte b3 = 0;
                    if (i2 >= 3) {
                        break;
                    }
                    yyyyyll.rr00720072rr0072(yyyyyll.this).add(new yyyylll(i2, oooooddVar));
                    i2++;
                }
                int i3 = 2;
                int i4 = 0;
                while (i4 < 3) {
                    yyyyyll.rr00720072rr0072(yyyyyll.this).add(new yyyylll(i4, new ooooodd(ooooodd.oodoodd.HIGH_PASS, 15.0f, 50.0f, 1.0f)));
                    i4++;
                    try {
                        throw null;
                    } catch (Exception unused) {
                        while (true) {
                            try {
                                i3 /= 0;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
                for (int i5 = 0; i5 < 3; i5++) {
                    yyyyyll.rr00720072rr0072(yyyyyll.this).add(new yyyylll(i5, new ooooodd(ooooodd.oodoodd.LOW_PASS, 7.0f, 50.0f, 1.0f)));
                }
            }
        };
        this.qqqqqq0071 = new Runnable() { // from class: com.behaviosec.rl.yyyyyll.4
            @Override // java.lang.Runnable
            public void run() {
                synchronized (yyyyyll.rrrr0072r0072(yyyyyll.this)) {
                    yyyyyll.rrrr0072r0072(yyyyyll.this).clear();
                }
            }
        };
        String str2 = uuxuuuu.pppp0070ppp("s8o\u0002\u0015?Mt\u0018\u000f\u0016|%*\t!6I\bcE\u007ffW!\u007fkg9", (char) (ylyylll.r0072rrr00720072() ^ (-1691741198)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))) + str + uuxuuuu.pp0070p0070ppp(RequestConfiguration.MAX_AD_CONTENT_RATING_G, (char) (ylyylll.r0072rrr00720072() ^ (-1691741321)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847084)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)));
        this.qq007100710071qq = str2;
        LogBridge.d(str2, uuxuuuu.pppp0070ppp("{\u000e\n\u000e<", (char) (yylylll.r0072r0072r00720072() ^ (-1349847195)), (char) (yyyllll.rrrr007200720072() ^ 383821871)) + this + uuxuuuu.pppp0070ppp("*N", (char) (yllylll.r007200720072r00720072() ^ (-1146716811)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))) + str);
        this.q00710071qq0071q = i;
        executorServiceNewSingleThreadExecutor.submit(this.q00710071007100710071q);
    }

    public static int c006300630063c0063c0063() {
        return 15;
    }

    public static int cc00630063c0063c0063() {
        return 2;
    }

    public static int ccc006300630063c0063() {
        return 0;
    }

    public static /* synthetic */ Runnable r00720072007200720072r(yyyyyll yyyyyllVar) {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                cc0063cc0063c0063 = 13;
                return yyyyyllVar.qq0071007100710071q;
            }
        }
    }

    public static /* synthetic */ List r007200720072rr0072(yyyyyll yyyyyllVar, List list) {
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != c00630063cc0063c0063) {
            cc0063cc0063c0063 = c006300630063c0063c0063();
            c00630063cc0063c0063 = c006300630063c0063c0063();
        }
        yyyyyllVar.q007100710071q0071q = list;
        return list;
    }

    public static /* synthetic */ long r00720072rrr0072(yyyyyll yyyyyllVar, long j) {
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != c00630063cc0063c0063) {
            cc0063cc0063c0063 = 85;
            c00630063cc0063c0063 = c006300630063c0063c0063();
        }
        yyyyyllVar.qq0071q00710071q = j;
        return j;
    }

    public static /* synthetic */ Handler r0072r0072rr0072(yyyyyll yyyyyllVar) {
        Handler handler = yyyyyllVar.qqq0071q0071q;
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != 0) {
            cc0063cc0063c0063 = 93;
            c00630063cc0063c0063 = c006300630063c0063c0063();
        }
        return handler;
    }

    public static /* synthetic */ Runnable r0072rr0072r0072(yyyyyll yyyyyllVar) {
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != c00630063cc0063c0063) {
            cc0063cc0063c0063 = c006300630063c0063c0063();
            c00630063cc0063c0063 = 32;
        }
        return yyyyyllVar.q00710071007100710071q;
    }

    public static /* synthetic */ String r0072rrrr0072(yyyyyll yyyyyllVar) {
        String str = yyyyyllVar.qq007100710071qq;
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != 0) {
            cc0063cc0063c0063 = c006300630063c0063c0063();
            c00630063cc0063c0063 = 85;
        }
        return str;
    }

    public static /* synthetic */ List rr00720072rr0072(yyyyyll yyyyyllVar) {
        List<yyyylll> list = yyyyyllVar.q007100710071q0071q;
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != ccc006300630063c0063()) {
            cc0063cc0063c0063 = c006300630063c0063c0063();
            c00630063cc0063c0063 = c006300630063c0063c0063();
        }
        return list;
    }

    public static /* synthetic */ AtomicBoolean rr0072rrr0072(yyyyyll yyyyyllVar) {
        AtomicBoolean atomicBoolean = yyyyyllVar.q0071qq00710071q;
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != c00630063cc0063c0063) {
            cc0063cc0063c0063 = 42;
            c00630063cc0063c0063 = 67;
        }
        return atomicBoolean;
    }

    public static /* synthetic */ AtomicBoolean rrr0072rr0072(yyyyyll yyyyyllVar) {
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != 0) {
            cc0063cc0063c0063 = c006300630063c0063c0063();
            c00630063cc0063c0063 = 44;
        }
        return yyyyyllVar.q0071q007100710071q;
    }

    public static /* synthetic */ Queue rrrr0072r0072(yyyyyll yyyyyllVar) {
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != ccc006300630063c0063()) {
            cc0063cc0063c0063 = c006300630063c0063c0063();
            c00630063cc0063c0063 = c006300630063c0063c0063();
        }
        return yyyyyllVar.qqqq00710071q;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.q0071qq00710071q.get()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis < this.qq0071q00710071q + qq0071qq0071q) {
                this.q0071q0071q0071q.submit(new yyllyll(sensorEvent));
                return;
            }
            ExecutorService executorService = this.q0071q0071q0071q;
            ylllyll ylllyllVar = new ylllyll(jUptimeMillis);
            int i = cc0063cc0063c0063;
            if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != c00630063cc0063c0063) {
                cc0063cc0063c0063 = 31;
                c00630063cc0063c0063 = 53;
            }
            executorService.submit(ylllyllVar);
        }
    }

    public void r00720072r0072r0072(SensorManager sensorManager) {
        String str = this.qq007100710071qq;
        StringBuilder sb = new StringBuilder();
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847106));
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % cc00630063c0063c0063() != c00630063cc0063c0063) {
            cc0063cc0063c0063 = c006300630063c0063c0063();
            c00630063cc0063c0063 = 71;
        }
        sb.append(uuxuuuu.pp0070p0070ppp("?X\u0018a)q t\u0013L\u0013_\u0019ch\u0016", cR0072r0072r00720072, (char) (iRrrr007200720072 ^ 383821845), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
        sb.append(this);
        LogBridge.d(str, sb.toString());
        this.q0071q007100710071q.set(false);
        boolean zRegisterListener = sensorManager.registerListener(this, sensorManager.getDefaultSensor(this.q00710071qq0071q), 1);
        LogBridge.d(this.qq007100710071qq, uuxuuuu.pppp0070ppp("U^+L\\P\\J\u001e\u0003", (char) (yllylll.r007200720072r00720072() ^ (-1146716902)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))) + this + uuxuuuu.pp0070p0070ppp("mb", (char) (ylyylll.r0072rrr00720072() ^ (-1691741299)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741261)), (char) (yyyllll.rrrr007200720072() ^ 383821864)) + zRegisterListener);
        if (zRegisterListener) {
            this.qqq0071q0071q.postDelayed(this.qq00710071q0071q, 5000L);
        }
    }

    public JSONArray r0072r00720072r0072() {
        try {
            return (JSONArray) this.q0071q0071q0071q.submit(new Callable<JSONArray>() { // from class: com.behaviosec.rl.yyyyyll.5
                public static int c00630063c0063c00630063 = 1;
                public static int c0063cc0063c00630063 = 57;
                public static int cc0063c0063c00630063 = 0;
                public static int ccc00630063c00630063 = 2;

                public static int c0063c00630063c00630063() {
                    return 95;
                }

                @Override // java.util.concurrent.Callable
                public /* bridge */ /* synthetic */ JSONArray call() throws Exception {
                    int i = c0063cc0063c00630063;
                    if (((c00630063c0063c00630063 + i) * i) % ccc00630063c00630063 != cc0063c0063c00630063) {
                        c0063cc0063c00630063 = c0063c00630063c00630063();
                        cc0063c0063c00630063 = c0063c00630063c00630063();
                    }
                    return call2();
                }

                @Override // java.util.concurrent.Callable
                /* renamed from: call, reason: avoid collision after fix types in other method */
                public JSONArray call2() {
                    JSONArray jSONArray;
                    synchronized (yyyyyll.rrrr0072r0072(yyyyyll.this)) {
                        try {
                            jSONArray = new JSONArray();
                            Iterator it = yyyyyll.rrrr0072r0072(yyyyyll.this).iterator();
                            while (it.hasNext()) {
                                jSONArray.put((JSONArray) it.next());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return jSONArray;
                }
            }).get();
        } catch (InterruptedException e) {
            LogBridge.e(this.qq007100710071qq, e.getMessage(), e);
            int i = cc0063cc0063c0063;
            if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != 0) {
                cc0063cc0063c0063 = c006300630063c0063c0063();
                c00630063cc0063c0063 = 15;
            }
            return new JSONArray();
        } catch (ExecutionException e2) {
            LogBridge.e(this.qq007100710071qq, e2.getMessage(), e2);
            return new JSONArray();
        }
    }

    public void rr007200720072r0072(SensorManager sensorManager) {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                cc0063cc0063c0063 = 86;
                LogBridge.d(this.qq007100710071qq, uuxuuuu.pppp0070ppp("\u0017\u0011\u0016\n\r\u0010\u001b\u001d\u000f\u001d~\u0012\u001c\"\u001f#kR", (char) (yllylll.r007200720072r00720072() ^ (-1146716798)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))) + this);
                sensorManager.unregisterListener(this);
                this.qqq0071q0071q.removeCallbacks(this.qq00710071q0071q);
                this.q0071q0071q0071q.submit(this.q00710071007100710071q);
                this.q0071q007100710071q.set(true);
                return;
            }
        }
    }

    public void rr0072r0072r0072() {
        this.q0071q0071q0071q.submit(this.q00710071007100710071q);
        ExecutorService executorService = this.q0071q0071q0071q;
        Runnable runnable = this.qqqqqq0071;
        int i = cc0063cc0063c0063;
        if (((ccc0063c0063c0063 + i) * i) % c0063c0063c0063c0063 != c00630063cc0063c0063) {
            cc0063cc0063c0063 = 22;
            c00630063cc0063c0063 = 80;
        }
        executorService.submit(runnable);
    }

    public void rrr00720072r0072() {
    }
}
