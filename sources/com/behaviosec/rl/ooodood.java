package com.behaviosec.rl;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.EditText;
import com.behaviosec.rl.android.BehavioOverlay;
import com.behaviosec.rl.android.LogBridge;
import com.behaviosec.rl.android.NonEditTextInputHandler;
import com.behaviosec.rl.android.SyncedJSONArray;
import com.behaviosec.rl.android.SyncedWeakHashMap;
import com.behaviosec.rl.ooodddd;
import com.behaviosec.rl.yyyylly;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ooodood {
    public static boolean collectTmxData = false;
    private static final AtomicInteger m006D006D006Dmm006D;
    private static long m006D006Dmmm006D = 0;
    private static final long m006Dm006Dmm006D = 1099511627776L;
    private static final AtomicInteger m006Dmm006Dm006D;
    private static boolean m006Dmmmm006D = false;
    private static final long mm006D006Dmm006D = 2199023255552L;
    private static SyncedJSONArray mm006Dmmm006D = null;
    private static final long mmm006Dmm006D = 68719476736L;
    private static final long mmmm006D006Dm = 60000;
    private static final AtomicInteger mmmm006Dm006D;
    public static final SensorCollector sensorCollector;
    public static int x00780078x0078xxx = 1;
    public static int x0078xx0078xxx = 83;
    public static int xx007800780078xxx = 2;
    public static int xx0078x0078xxx;
    private static final String mmm006Dm006Dm = uuxuuuu.pp0070p0070ppp("II7\u000f\u000frS''\nnR61", (char) (yylylll.r0072r0072r00720072() ^ (-1349847180)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741300)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)));
    public static final String m006Dm006Dm006Dm = uuxuuuu.pp0070p0070ppp("}79)t", (char) (yllylll.r007200720072r00720072() ^ (-1146716733)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741340)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333)));
    public static final String mm006D006Dm006Dm = uuxuuuu.pppp0070ppp("0", (char) (yllylll.r007200720072r00720072() ^ (-1146716863)), (char) (yyyllll.rrrr007200720072() ^ 383821871));
    public static final String m006D006D006Dm006Dm = uuxuuuu.pppp0070ppp("W\u0019", (char) (yllylll.r007200720072r00720072() ^ (-1146716826)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334)));
    public static final SyncedWeakHashMap<Context, NonEditTextInputHandler> nonEditTextInputHandlerMap = new SyncedWeakHashMap<>();
    public static final SyncedWeakHashMap<Context, odooddd> editTextDelegateMap = new SyncedWeakHashMap<>();
    public static final ArrayList<odododd> behavioCustomJSONArrayList = new ArrayList<>();
    public static yllllyy lastKeyFlightAcc = new yllllyy(60000);
    public static yllllyy lastKeyFlightGyro = new yllllyy(60000);
    private static JSONObject m006Dmm006D006Dm = ss00730073sss();
    public static HashSet<String> ignoreFeaturesSet = new HashSet<>();
    private static final WeakHashMap<Context, String> mm006Dm006D006Dm = new WeakHashMap<>();
    private static final BehavioOverlay m006D006Dm006D006Dm = new BehavioOverlay();
    public static AtomicBoolean noAccSensor = new AtomicBoolean(false);
    public static AtomicBoolean noGyroSensor = new AtomicBoolean(false);
    public static boolean useCompactSensorFormat = false;
    public static boolean monitoringEnabled = true;
    private static yllylyy mmm006D006D006Dm = null;
    private static boolean m006Dm006D006D006Dm = false;
    private static String mm006D006D006D006Dm = null;
    private static boolean m006D006D006D006D006Dm = false;
    private static Boolean mmmmmm006D = null;

    /* renamed from: com.behaviosec.rl.ooodood$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public static int x0078xxx00780078x = 1;
        public static int xx0078xx00780078x = 2;
        public static int xxxxx00780078x;
        public final /* synthetic */ Context mm006Dm006Dm006D;

        public AnonymousClass1(Context context) {
            this.mm006Dm006Dm006D = context;
        }

        public static int x0078007800780078x0078x() {
            return 81;
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((x0078007800780078x0078x() * (x0078007800780078x0078x() + x0078xxx00780078x)) % xx0078xx00780078x != xxxxx00780078x) {
                xxxxx00780078x = x0078007800780078x0078x();
            }
            ooodood.y0079y00790079y0079(WebSettings.getDefaultUserAgent(this.mm006Dm006Dm006D));
        }
    }

    /* renamed from: com.behaviosec.rl.ooodood$2, reason: invalid class name */
    public class AnonymousClass2 implements ooodddd.ooddddd {
        public static int x00780078xx00780078x = 76;
        public static int x0078x0078x00780078x = 1;
        public static int xx00780078x00780078x = 2;
        public static int xxx0078x00780078x;

        public static int x007800780078x00780078x() {
            return 36;
        }

        @Override // com.behaviosec.rl.ooodddd.ooddddd
        public void onResult(boolean z) {
            ooodood.yy007900790079y0079(z);
            int i = x00780078xx00780078x;
            if (((x0078x0078x00780078x + i) * i) % xx00780078x00780078x != xxx0078x00780078x) {
                x00780078xx00780078x = x007800780078x00780078x();
                xxx0078x00780078x = x007800780078x00780078x();
            }
        }
    }

    /* renamed from: com.behaviosec.rl.ooodood$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public static int x00780078x007800780078x = 2;
        public static int x0078xx007800780078x = 0;
        public static int xx0078x007800780078x = 1;
        public static int xxxx007800780078x = 2;
        public final /* synthetic */ Context m006D006Dm006Dm006D;

        public AnonymousClass3(Context context) {
            this.m006D006Dm006Dm006D = context;
        }

        public static int xxx0078007800780078x() {
            return 71;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean boolValueOf = Boolean.valueOf(yyyylly.yllylly.b0062bb006200620062(this.m006D006Dm006Dm006D));
            int i = xxxx007800780078x;
            if (((xx0078x007800780078x + i) * i) % x00780078x007800780078x != x0078xx007800780078x) {
                xxxx007800780078x = xxx0078007800780078x();
                x0078xx007800780078x = 70;
            }
            ooodood.y0079007900790079y0079(boolValueOf);
        }
    }

    public static class SensorCollector {
        private static final int m006D006D006D006Dm006D = 3;
        private static final int m006Dm006D006Dm006D = 1;
        private static final float m006Dmmm006D006D = 0.5f;
        private static final int mm006D006D006Dm006D = 2;
        private static final int mmm006D006Dm006D = 0;
        private static final float mmmmm006D006D = 1.0E-9f;
        public static int x00780078xxxx0078 = 97;
        public static int x0078x0078xxx0078 = 1;
        public static int xx00780078xxx0078 = 2;
        public static int xxxx0078xx0078;
        private long m006Dmm006D006D006D;
        public yllllyy keyPressAcc = new yllllyy(60000);
        public yllllyy keyPressGyro = new yllllyy(60000);
        public yllllyy keyFlightAcc = new yllllyy(60000);
        public yllllyy keyFlightGyro = new yllllyy(60000);
        private boolean mm006Dmm006D006D = false;
        private boolean m006D006Dmm006D006D = false;
        private float[] mmm006Dm006D006D = new float[3];
        private float[] m006Dm006Dm006D006D = new float[3];
        private float[] mm006D006Dm006D006D = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        private Queue<float[]> m006D006D006Dm006D006D = new LinkedList();
        private Queue<float[]> mmmm006D006D006D = new LinkedList();
        private boolean mm006Dm006D006D006D = false;
        private final SensorEventListener m006D006Dm006D006D006D = new SensorEventListener() { // from class: com.behaviosec.rl.ooodood.SensorCollector.1
            public static int x00780078xx0078x0078 = 1;
            public static int x0078x0078x0078x0078 = 0;
            public static int xx00780078x0078x0078 = 2;
            public static int xx0078xx0078x0078 = 81;
            public final float[] mmm006D006D006D006D = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
            public final float m006Dm006D006D006D006D = 0.8f;

            public static int x007800780078x0078x0078() {
                return 77;
            }

            public static int xxx0078x0078x0078() {
                return 2;
            }

            private void y0079yy00790079y(SensorEvent sensorEvent) {
                float[] fArr = new float[3];
                float[] fArr2 = sensorEvent.values;
                float f = fArr2[0];
                float[] fArr3 = this.mmm006D006D006D006D;
                float f2 = (f * 0.19999999f) + (fArr3[0] * 0.8f);
                fArr3[0] = f2;
                fArr[0] = f - f2;
                float f3 = fArr2[1];
                float f4 = (f3 * 0.19999999f) + (fArr3[1] * 0.8f);
                fArr3[1] = f4;
                fArr[1] = f3 - f4;
                float f5 = fArr2[2];
                int i = xx0078xx0078x0078;
                if (((x00780078xx0078x0078 + i) * i) % xx00780078x0078x0078 != x0078x0078x0078x0078) {
                    xx0078xx0078x0078 = x007800780078x0078x0078();
                    x0078x0078x0078x0078 = 54;
                }
                float[] fArr4 = this.mmm006D006D006D006D;
                fArr3[2] = (0.19999999f * f5) + (fArr4[2] * 0.8f);
                fArr[2] = f5 - fArr4[2];
                SensorCollector.this.keyPressAcc.ddddd00640064(fArr);
                SensorCollector.this.keyFlightAcc.ddddd00640064(fArr);
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                if (SensorCollector.yy0079yyy0079(SensorCollector.this)) {
                    if (sensorEvent.sensor.getType() == 4) {
                        SensorCollector.this.keyPressGyro.d0064006400640064d0064(sensorEvent);
                        SensorCollector.this.keyFlightGyro.d0064006400640064d0064(sensorEvent);
                        return;
                    }
                    if (sensorEvent.sensor.getType() == 10) {
                        SensorCollector.this.keyPressAcc.d0064006400640064d0064(sensorEvent);
                        SensorCollector.this.keyFlightAcc.d0064006400640064d0064(sensorEvent);
                        return;
                    }
                    if (sensorEvent.sensor.getType() != 1) {
                        if (sensorEvent.sensor.getType() != 2 || !SensorCollector.this.mm006Dmm006D006D || Float.isNaN(sensorEvent.values[0]) || Float.isNaN(sensorEvent.values[1]) || Float.isNaN(sensorEvent.values[2])) {
                            return;
                        }
                        SensorCollector sensorCollector = SensorCollector.this;
                        int i = xx0078xx0078x0078;
                        if (((x00780078xx0078x0078 + i) * i) % xxx0078x0078x0078() != 0) {
                            xx0078xx0078x0078 = 31;
                            x00780078xx0078x0078 = 8;
                        }
                        SensorCollector.yyyyyy0079(sensorCollector, SensorCollector.y00790079y00790079y(sensorCollector, sensorEvent.values, SensorCollector.y00790079007900790079y(SensorCollector.this), 0.5f, 0.5f));
                        return;
                    }
                    if (SensorCollector.y00790079yyy0079(SensorCollector.this)) {
                        y0079yy00790079y(sensorEvent);
                    }
                    if (!SensorCollector.this.mm006Dmm006D006D || Float.isNaN(sensorEvent.values[0]) || Float.isNaN(sensorEvent.values[1]) || Float.isNaN(sensorEvent.values[2])) {
                        return;
                    }
                    SensorCollector sensorCollector2 = SensorCollector.this;
                    SensorCollector.yy00790079yy0079(sensorCollector2, SensorCollector.y00790079y00790079y(sensorCollector2, sensorEvent.values, sensorCollector2.m006Dm006Dm006D006D, 0.5f, 0.5f));
                    float fYyy007900790079y = (sensorEvent.timestamp - SensorCollector.yyy007900790079y(SensorCollector.this)) * SensorCollector.mmmmm006D006D;
                    SensorCollector.y0079y007900790079y(SensorCollector.this, sensorEvent.timestamp);
                    float[] fArrYy0079007900790079y = SensorCollector.yy0079007900790079y(SensorCollector.this, fYyy007900790079y);
                    SensorCollector.this.keyPressGyro.ddddd00640064(fArrYy0079007900790079y);
                    SensorCollector.this.keyFlightGyro.ddddd00640064(fArrYy0079007900790079y);
                }
            }
        };

        public static int x007800780078xxx0078() {
            return 97;
        }

        public static int x0078xx0078xx0078() {
            return 1;
        }

        public static int xxx0078xxx0078() {
            return 0;
        }

        public static /* synthetic */ float[] y00790079007900790079y(SensorCollector sensorCollector) {
            float[] fArr = sensorCollector.mmm006Dm006D006D;
            int i = x00780078xxxx0078;
            if (((x0078x0078xxx0078 + i) * i) % xx00780078xxx0078 != xxxx0078xx0078) {
                x00780078xxxx0078 = 48;
                xxxx0078xx0078 = 74;
            }
            return fArr;
        }

        private float[] y007900790079yy0079(float f) {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
            float[] fArr2 = new float[9];
            if (!SensorManager.getRotationMatrix(fArr2, null, this.m006Dm006Dm006D006D, this.mmm006Dm006D006D)) {
                return fArr;
            }
            float[] fArrY0079yy0079y0079 = y0079yy0079y0079(y00790079y0079y0079(fArr2), f);
            float[] fArr3 = {fArrY0079yy0079y0079[0] / 20.0f, fArrY0079yy0079y0079[1] / 20.0f, fArrY0079yy0079y0079[2] / 20.0f};
            for (float[] fArr4 : this.m006D006D006Dm006D006D) {
                fArr3[0] = (fArr4[0] / 20.0f) + fArr3[0];
                fArr3[1] = (fArr4[1] / 20.0f) + fArr3[1];
                fArr3[2] = (fArr4[2] / 20.0f) + fArr3[2];
            }
            this.m006D006D006Dm006D006D.add(fArrY0079yy0079y0079);
            int i = ((int) 20.0f) - 1;
            if (this.m006D006D006Dm006D006D.size() > i) {
                this.m006D006D006Dm006D006D.remove();
            }
            float f2 = fArr3[0];
            float[] fArr5 = this.mm006D006Dm006D006D;
            float[] fArr6 = {f2 - fArr5[0], fArr3[1] - fArr5[1], fArr3[2] - fArr5[2]};
            this.mm006D006Dm006D006D = fArr3;
            float[] fArr7 = new float[3];
            fArr7[0] = fArr6[0] / 20.0f;
            fArr7[1] = fArr6[1] / 20.0f;
            float f3 = fArr6[2];
            int i2 = x00780078xxxx0078;
            if (((x0078x0078xxx0078 + i2) * i2) % xx00780078xxx0078 != xxxx0078xx0078) {
                x00780078xxxx0078 = x007800780078xxx0078();
                xxxx0078xx0078 = x007800780078xxx0078();
            }
            fArr7[2] = f3 / 20.0f;
            for (float[] fArr8 : this.mmmm006D006D006D) {
                fArr7[0] = (fArr8[0] / 20.0f) + fArr7[0];
                fArr7[1] = (fArr8[1] / 20.0f) + fArr7[1];
                fArr7[2] = (fArr8[2] / 20.0f) + fArr7[2];
            }
            this.mmmm006D006D006D.add(fArr6);
            if (this.mmmm006D006D006D.size() > i) {
                this.mmmm006D006D006D.remove();
            }
            return fArr7;
        }

        public static /* synthetic */ float[] y00790079y00790079y(SensorCollector sensorCollector, float[] fArr, float[] fArr2, float f, float f2) {
            int iX007800780078xxx0078 = x007800780078xxx0078();
            if (((x0078x0078xxx0078 + iX007800780078xxx0078) * iX007800780078xxx0078) % xx00780078xxx0078 != 0) {
                x00780078xxxx0078 = 93;
                xxxx0078xx0078 = 72;
            }
            return sensorCollector.yyyy0079y0079(fArr, fArr2, f, f2);
        }

        private float[] y00790079y0079y0079(float[] fArr) {
            float[] fArr2 = new float[4];
            float f = fArr[0] + 1.0f;
            int i = x00780078xxxx0078;
            if (((x0078xx0078xx0078() + i) * i) % xx00780078xxx0078 != 0) {
                x00780078xxxx0078 = x007800780078xxx0078();
                xxxx0078xx0078 = 72;
            }
            float fSqrt = ((float) Math.sqrt(f + fArr[4] + fArr[8])) * 0.5f;
            fArr2[3] = fSqrt;
            fArr2[0] = (fArr[7] - fArr[5]) * (0.25f / fSqrt);
            fArr2[1] = (fArr[2] - fArr[6]) * (0.25f / fSqrt);
            fArr2[2] = (fArr[3] - fArr[1]) * (0.25f / fSqrt);
            return fArr2;
        }

        public static /* synthetic */ boolean y00790079yyy0079(SensorCollector sensorCollector) {
            int i = x00780078xxxx0078;
            if (((x0078xx0078xx0078() + i) * i) % xx00780078xxx0078 != 0) {
                x00780078xxxx0078 = 54;
                xxxx0078xx0078 = 20;
            }
            return sensorCollector.m006D006Dmm006D006D;
        }

        public static /* synthetic */ long y0079y007900790079y(SensorCollector sensorCollector, long j) {
            int i = x00780078xxxx0078;
            if (((x0078x0078xxx0078 + i) * i) % xx00780078xxx0078 != 0) {
                x00780078xxxx0078 = x007800780078xxx0078();
                xxxx0078xx0078 = 90;
            }
            sensorCollector.m006Dmm006D006D006D = j;
            return j;
        }

        private float[] y0079yy0079y0079(float[] fArr, float f) {
            float fAcos = (float) Math.acos(fArr[3]);
            float f2 = (fAcos / f) * 2.0f;
            float fSin = (float) Math.sin(fAcos);
            float f3 = (fArr[0] / fSin) * f2;
            float f4 = (fArr[1] / fSin) * f2;
            float f5 = (fArr[2] / fSin) * f2;
            if ((x007800780078xxx0078() * (x007800780078xxx0078() + x0078x0078xxx0078)) % xx00780078xxx0078 != xxx0078xxx0078()) {
                x00780078xxxx0078 = x007800780078xxx0078();
                xxxx0078xx0078 = 44;
            }
            return new float[]{f3, f4, f5};
        }

        public static /* synthetic */ float[] yy0079007900790079y(SensorCollector sensorCollector, float f) {
            int i = x00780078xxxx0078;
            if (((x0078x0078xxx0078 + i) * i) % xx00780078xxx0078 != xxx0078xxx0078()) {
                x00780078xxxx0078 = x007800780078xxx0078();
                xxxx0078xx0078 = x007800780078xxx0078();
            }
            return sensorCollector.y007900790079yy0079(f);
        }

        public static /* synthetic */ float[] yy00790079yy0079(SensorCollector sensorCollector, float[] fArr) {
            int i = 4;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused) {
                    x00780078xxxx0078 = 65;
                    sensorCollector.m006Dm006Dm006D006D = fArr;
                    return fArr;
                }
            }
        }

        public static /* synthetic */ void yy0079y00790079y(SensorCollector sensorCollector, Context context) {
            int i = x00780078xxxx0078;
            if (((x0078x0078xxx0078 + i) * i) % xx00780078xxx0078 != xxxx0078xx0078) {
                x00780078xxxx0078 = x007800780078xxx0078();
                xxxx0078xx0078 = x007800780078xxx0078();
            }
            sensorCollector.yy0079y0079y0079(context);
        }

        private void yy0079y0079y0079(Context context) {
            boolean zRegisterListener;
            uuxuuuu.pppp0070ppp(", #&13%3\u0005\u0018\"(%)+`RJ", (char) (yyyllll.rrrr007200720072() ^ 383821971), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332)));
            SensorManager sensorManager = (SensorManager) (context != null ? context.getSystemService(uuxuuuu.pppp0070ppp("RCKOJL", (char) (yyyllll.rrrr007200720072() ^ 383821834), (char) (yllylll.r007200720072r00720072() ^ (-1146716786)))) : null);
            LogBridge.i(uuxuuuu.pppp0070ppp("7\r\u007fV9\b \u001axNF/<R", (char) (yylylll.r0072r0072r00720072() ^ (-1349847162)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))), uuxuuuu.pppp0070ppp("\u001d\u0011\u0010\u0013\"$\u0012 u\t\u000f\u0015\u0016\u001a\u0018Mc[,\u001f-3,0\u007f\u0015\u001f\u0013\u001e\u001d'o*", (char) (yllylll.r007200720072r00720072() ^ (-1146716708)), (char) (yyyllll.rrrr007200720072() ^ 383821858)) + sensorManager);
            if (sensorManager != null) {
                if ((ooodood.m006D006Dmmm006D & 68719476736L) != 68719476736L || sensorManager.registerListener(this.m006D006Dm006D006D006D, sensorManager.getDefaultSensor(10), 1)) {
                    zRegisterListener = false;
                } else {
                    try {
                        throw null;
                    } catch (Exception unused) {
                        while (true) {
                            try {
                                int[] iArr = new int[-1];
                            } catch (Exception unused2) {
                                int i = 2;
                                while (true) {
                                    try {
                                        i /= 0;
                                    } catch (Exception unused3) {
                                        zRegisterListener = sensorManager.registerListener(this.m006D006Dm006D006D006D, sensorManager.getDefaultSensor(1), 1);
                                        if (zRegisterListener) {
                                            this.m006D006Dmm006D006D = true;
                                        } else {
                                            ooodood.noAccSensor.set(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if ((ooodood.m006D006Dmmm006D & 1099511627776L) == 1099511627776L ? sensorManager.registerListener(this.m006D006Dm006D006D006D, sensorManager.getDefaultSensor(4), 1) : false) {
                    return;
                }
                boolean zRegisterListener2 = (ooodood.m006D006Dmmm006D & 2199023255552L) == 2199023255552L ? sensorManager.registerListener(this.m006D006Dm006D006D006D, sensorManager.getDefaultSensor(2), 1) : false;
                if (!zRegisterListener && (ooodood.m006D006Dmmm006D & 68719476736L) == 68719476736L) {
                    zRegisterListener = sensorManager.registerListener(this.m006D006Dm006D006D006D, sensorManager.getDefaultSensor(1), 1);
                }
                if (zRegisterListener2 && zRegisterListener) {
                    this.mm006Dmm006D006D = true;
                } else {
                    ooodood.noGyroSensor.set(true);
                    this.mm006Dmm006D006D = false;
                }
            }
        }

        public static /* synthetic */ boolean yy0079yyy0079(SensorCollector sensorCollector) {
            boolean z = sensorCollector.mm006Dm006D006D006D;
            int i = x00780078xxxx0078;
            if (((x0078x0078xxx0078 + i) * i) % xx00780078xxx0078 != xxxx0078xx0078) {
                x00780078xxxx0078 = 89;
                xxxx0078xx0078 = x007800780078xxx0078();
            }
            return z;
        }

        public static /* synthetic */ long yyy007900790079y(SensorCollector sensorCollector) {
            long j = sensorCollector.m006Dmm006D006D006D;
            if ((x007800780078xxx0078() * (x007800780078xxx0078() + x0078x0078xxx0078)) % xx00780078xxx0078 != xxx0078xxx0078()) {
                x00780078xxxx0078 = x007800780078xxx0078();
                xxxx0078xx0078 = x007800780078xxx0078();
            }
            return j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void yyy00790079y0079(Context context) {
            Object systemService;
            uuxuuuu.pp0070p0070ppp("P\u0001B%d\u001e\u0015Wsz\u0017Z`\u001dFIwca\n", (char) (yllylll.r007200720072r00720072() ^ (-1146716717)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847239)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786)));
            stopGatherSensorData();
            if (context != null) {
                int i = x00780078xxxx0078;
                if (((x0078x0078xxx0078 + i) * i) % xx00780078xxx0078 != xxx0078xxx0078()) {
                    x00780078xxxx0078 = x007800780078xxx0078();
                    x0078x0078xxx0078 = 12;
                }
                systemService = context.getSystemService(uuxuuuu.pppp0070ppp("0#-304", (char) (yllylll.r007200720072r00720072() ^ (-1146716771)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))));
            } else {
                systemService = null;
            }
            SensorManager sensorManager = (SensorManager) systemService;
            LogBridge.i(uuxuuuu.pppp0070ppp("\n.2,B6=#).+1+8", (char) (yyyllll.rrrr007200720072() ^ 383821980), (char) (yyyllll.rrrr007200720072() ^ 383821858)), uuxuuuu.pp0070p0070ppp("(\u001am'&A\u001d()\f\u001c`HGh+>$\fu\tc\u0003n7DM`#\u0010Z)[0s", (char) (ylyylll.r0072rrr00720072() ^ (-1691741425)), (char) (yyyllll.rrrr007200720072() ^ 383822055), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))) + sensorManager);
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.m006D006Dm006D006D006D);
            }
        }

        private float[] yyyy0079y0079(float[] fArr, float[] fArr2, float f, float f2) {
            float[] fArr3 = new float[3];
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused) {
                    x00780078xxxx0078 = x007800780078xxx0078();
                    fArr3[0] = (fArr[0] * f) + (fArr2[0] * f2);
                    fArr3[1] = (fArr[1] * f) + (fArr2[1] * f2);
                    fArr3[2] = (f * fArr[2]) + (f2 * fArr2[2]);
                    return fArr3;
                }
            }
        }

        public static /* synthetic */ float[] yyyyyy0079(SensorCollector sensorCollector, float[] fArr) {
            int i = x00780078xxxx0078;
            if (((x0078x0078xxx0078 + i) * i) % xx00780078xxx0078 != xxxx0078xx0078) {
                x00780078xxxx0078 = x007800780078xxx0078();
                xxxx0078xx0078 = x007800780078xxx0078();
            }
            sensorCollector.mmm006Dm006D006D = fArr;
            return fArr;
        }

        public void resetKeyFlightStatistics() {
            this.keyFlightAcc.d0064d0064d00640064();
            this.keyFlightGyro.d0064d0064d00640064();
            int i = x00780078xxxx0078;
            if (((x0078x0078xxx0078 + i) * i) % xx00780078xxx0078 != xxxx0078xx0078) {
                x00780078xxxx0078 = 49;
                xxxx0078xx0078 = x007800780078xxx0078();
            }
        }

        public void resetKeyPressStatistics() {
            this.keyPressAcc.d0064d0064d00640064();
            yllllyy yllllyyVar = this.keyPressGyro;
            int i = x00780078xxxx0078;
            if (((x0078xx0078xx0078() + i) * i) % xx00780078xxx0078 != 0) {
                x00780078xxxx0078 = x007800780078xxx0078();
                xxxx0078xx0078 = 42;
            }
            yllllyyVar.d0064d0064d00640064();
        }

        public void resetSensorStatistics() {
            resetKeyPressStatistics();
            resetKeyFlightStatistics();
            int i = x00780078xxxx0078;
            if (((x0078x0078xxx0078 + i) * i) % xx00780078xxx0078 != 0) {
                x00780078xxxx0078 = 19;
                xxxx0078xx0078 = 23;
            }
        }

        public void startGatherSensorData() {
            if (this.mm006Dm006D006D006D) {
                return;
            }
            this.mm006Dm006D006D006D = true;
            resetSensorStatistics();
            if (((x0078xx0078xx0078() + x00780078xxxx0078) * x00780078xxxx0078) % xx00780078xxx0078 != xxxx0078xx0078) {
                x00780078xxxx0078 = x007800780078xxx0078();
                xxxx0078xx0078 = 28;
            }
        }

        public void stopGatherSensorData() {
            this.mm006Dm006D006D006D = false;
            try {
                throw null;
            } catch (Exception unused) {
                x00780078xxxx0078 = x007800780078xxx0078();
            }
        }
    }

    static {
        int i = 0;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                x0078xx0078xxx = 84;
                m006Dmmmm006D = false;
                mm006Dmmm006D = new SyncedJSONArray();
                collectTmxData = true;
                m006D006Dmmm006D = -1L;
                m006D006D006Dmm006D = new AtomicInteger(0);
                mmmm006Dm006D = new AtomicInteger(0);
                m006Dmm006Dm006D = new AtomicInteger(0);
                sensorCollector = new SensorCollector();
                return;
            }
        }
    }

    public static JSONArray addDataIntegrity(JSONArray jSONArray, odooddo odooddoVar, oddoddd oddodddVar) {
        JSONArray jSONArrayYy00790079007900790079 = yy00790079007900790079(odooddoVar.aaaa0061aa(), odooddoVar.getFieldName(), oddodddVar, oddodddVar.filteredValues);
        jSONArray.put(oddodddVar.getDataIntegrityTarget());
        return jSONArrayYy00790079007900790079;
    }

    public static synchronized void addField(odooddo odooddoVar, Context context) {
        try {
            int iX0078x00780078xxx = x0078x00780078xxx();
            if (((x00780078xx0078xx() + iX0078x00780078xxx) * iX0078x00780078xxx) % xx007800780078xxx != 0) {
                x0078xx0078xxx = 63;
                xx0078x0078xxx = x0078x00780078xxx();
            }
            y0079y0079007900790079(context).editTextDelegates.add(odooddoVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void addFieldProps(JSONArray jSONArray, odooddo odooddoVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(odooddoVar.getFieldName(), odooddoVar.getEditTextProperties());
        } catch (JSONException e) {
            LogBridge.e(uuxuuuu.pppp0070ppp("Dhhb|psYsxqwu\u0003", (char) (ylyylll.r0072rrr00720072() ^ (-1691741420)), (char) (yyyllll.rrrr007200720072() ^ 383821858)), uuxuuuu.pp0070p0070ppp("\u0010\u0014\u0015w\u001c\u0019!\u001a\u0007*(*.", (char) (yylylll.r0072r0072r00720072() ^ (-1349847078)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), e);
        }
        jSONArray.put(jSONObject);
    }

    public static void addKeyDownListener(Context context) {
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072() ^ (-1691741381);
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx00780078x0078xx()) {
            x0078xx0078xxx = 48;
            xx0078x0078xxx = x0078x00780078xxx();
        }
        LogBridge.i(uuxuuuu.pppp0070ppp("\u001do!=b\u001b\u0011=*=;^#%", (char) iR0072rrr00720072, (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), uuxuuuu.pppp0070ppp("\u0017?/|pQ>{B<\u0016\u0013GHSAd\u0006e|Ll", (char) (yyyllll.rrrr007200720072() ^ 383821967), (char) ((-1146716785) ^ yllylll.r007200720072r00720072())) + context);
        s007300730073sss(context);
    }

    public static synchronized void addNonEditTextInputHandler(NonEditTextInputHandler nonEditTextInputHandler, Context context) {
        try {
            throw null;
        } catch (Exception unused) {
            x0078xx0078xxx = 22;
            nonEditTextInputHandlerMap.put(context, nonEditTextInputHandler);
        }
    }

    public static void addViewListener(int i, int i2, int i3, int i4, View view) {
        if (monitoringEnabled) {
            m006D006Dm006D006Dm.addViewListener(i, i2, i3, i4, view);
            int i5 = x0078xx0078xxx;
            if (((x00780078x0078xxx + i5) * i5) % xx007800780078xxx != xx0078x0078xxx) {
                x0078xx0078xxx = 9;
                xx0078x0078xxx = x0078x00780078xxx();
            }
        }
    }

    public static void cleanAll(Context context, boolean z) {
        try {
            LogBridge.i(uuxuuuu.pppp0070ppp("?ag_oajN^a`dXc", (char) (yyyllll.rrrr007200720072() ^ 383821993), (char) (yyyllll.rrrr007200720072() ^ 383821858)), uuxuuuu.pp0070p0070ppp("/7/*6\b21", (char) (yylylll.r0072r0072r00720072() ^ (-1349847285)), (char) (yyyllll.rrrr007200720072() ^ 383821971), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))));
            SyncedWeakHashMap<Context, odooddd> syncedWeakHashMap = editTextDelegateMap;
            odooddd odoodddVar = syncedWeakHashMap.get(context);
            if (odoodddVar == null) {
                LogBridge.i(uuxuuuu.pppp0070ppp("\u001c@D>THO5KPMSMZ", (char) (yllylll.r007200720072r00720072() ^ (-1146716720)), (char) (yyyllll.rrrr007200720072() ^ 383821871)), uuxuuuu.pppp0070ppp("\u0014\u001e\u0018\u0015#v#$rY\t+\\2$85a)-*2+g/9@:1mF9E:rH=;vC>Sz", (char) (yllylll.r007200720072r00720072() ^ (-1146716890)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))) + context.toString());
                if (z) {
                    NonEditTextInputHandler nonEditTextInputHandler = nonEditTextInputHandlerMap.get(context);
                    if (nonEditTextInputHandler != null) {
                        nonEditTextInputHandler.bbbb0062bb();
                    }
                    mm006Dm006D006Dm.remove(context);
                }
                syncedWeakHashMap.remove(context);
                return;
            }
            for (odooddo odooddoVar : odoodddVar.editTextDelegates) {
                if (odooddoVar != null) {
                    odooddoVar.aaa00610061aa().clear();
                }
            }
            if (z) {
                NonEditTextInputHandler nonEditTextInputHandler2 = nonEditTextInputHandlerMap.get(context);
                if (nonEditTextInputHandler2 != null) {
                    nonEditTextInputHandler2.bbbb0062bb();
                }
                mm006Dm006D006Dm.remove(context);
            }
            editTextDelegateMap.remove(context);
        } catch (Throwable th) {
            if (z) {
                NonEditTextInputHandler nonEditTextInputHandler3 = nonEditTextInputHandlerMap.get(context);
                if (nonEditTextInputHandler3 != null) {
                    nonEditTextInputHandler3.bbbb0062bb();
                }
                mm006Dm006D006Dm.remove(context);
                int i = x0078xx0078xxx;
                if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
                    x0078xx0078xxx = 97;
                    xx0078x0078xxx = 53;
                }
            }
            editTextDelegateMap.remove(context);
            throw th;
        }
    }

    public static void cleanNtfTimings(NonEditTextInputHandler nonEditTextInputHandler) {
        Iterator<ylylyly> it = nonEditTextInputHandler.b0062b0062bbb().iterator();
        while (it.hasNext()) {
            it.next().editTextTimings.clear();
            int iX0078x00780078xxx = x0078x00780078xxx();
            if (((x00780078x0078xxx + iX0078x00780078xxx) * iX0078x00780078xxx) % xx007800780078xxx != 0) {
                x0078xx0078xxx = 39;
                xx0078x0078xxx = x0078x00780078xxx();
            }
        }
    }

    public static void cleanTfTimings(odooddd odoodddVar, boolean z) {
        for (odooddo odooddoVar : odoodddVar.editTextDelegates) {
            if (odooddoVar != null) {
                if (z) {
                    odooddoVar.aaa00610061aa().clearChunk();
                } else {
                    odooddoVar.aaa00610061aa().clear();
                    odooddoVar.aaa00610061aa().setRegistered();
                    int i = x0078xx0078xxx;
                    if (((x00780078x0078xxx + i) * i) % xxx00780078xxx() != xx0078x0078xxx) {
                        x0078xx0078xxx = 71;
                        xx0078x0078xxx = x0078x00780078xxx();
                    }
                }
            }
        }
    }

    public static void cleanTimings(Context context, boolean z) {
        odooddd odoodddVar = editTextDelegateMap.get(context);
        NonEditTextInputHandler nonEditTextInputHandler = nonEditTextInputHandlerMap.get(context);
        if (odoodddVar != null || nonEditTextInputHandler != null) {
            if (odoodddVar != null) {
                cleanTfTimings(odoodddVar, z);
            }
            if (nonEditTextInputHandler != null) {
                cleanNtfTimings(nonEditTextInputHandler);
                return;
            }
            return;
        }
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("\"DF>RDI-AD?C;F", (char) (yylylll.r0072r0072r00720072() ^ (-1349847141)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847225)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785)));
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = 63;
        }
        LogBridge.i(strPp0070p0070ppp, uuxuuuu.pppp0070ppp("+5/,:!7<9?9F\u000et$FwM?SP|DHEMF\u0003JT[UL\taT`U\u000ecXV\u0012^Yn\u0016", (char) (ylyylll.r0072rrr00720072() ^ (-1691741301)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))) + context.toString());
    }

    public static void clearAll(Context context) {
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = 8;
        }
        yyy0079y00790079(context, false);
    }

    public static boolean collectTargetArrays(Context context, boolean z, List<JSONArray> list, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3) throws JSONException {
        JSONArray jSONArraySss0073sss;
        JSONArray jSONArrayS00730073ssss;
        Iterator<Context> it = editTextDelegateMap.iterator();
        boolean zShouldSendEditTextProperties = false;
        while (it.hasNext()) {
            Context next = it.next();
            if (context == null || next == context) {
                odooddd odoodddVar = editTextDelegateMap.get(next);
                if (odoodddVar != null) {
                    for (odooddo odooddoVar : odoodddVar.editTextDelegates) {
                        if (odooddoVar != null && (jSONArrayS00730073ssss = s00730073ssss(odooddoVar, z)) != null) {
                            list.add(jSONArrayS00730073ssss);
                            oddoddo oddoddoVarAaa00610061aa = odooddoVar.aaa00610061aa();
                            if (oddoddoVarAaa00610061aa != null) {
                                JSONArray jSONArrayAddDataIntegrity = addDataIntegrity(jSONArray, odooddoVar, oddoddoVarAaa00610061aa);
                                if (jSONArrayAddDataIntegrity != null) {
                                    jSONArray3.put(jSONArrayAddDataIntegrity);
                                }
                                addFieldProps(jSONArray2, odooddoVar);
                                zShouldSendEditTextProperties |= odooddoVar.shouldSendEditTextProperties();
                            }
                        }
                    }
                }
            }
        }
        Iterator<Context> it2 = nonEditTextInputHandlerMap.iterator();
        int i = 5;
        while (it2.hasNext()) {
            Context next2 = it2.next();
            if (context == null || next2 == context) {
                NonEditTextInputHandler nonEditTextInputHandler = nonEditTextInputHandlerMap.get(next2);
                if (nonEditTextInputHandler != null) {
                    for (ylylyly ylylylyVar : nonEditTextInputHandler.b0062b0062bbb()) {
                        if (ylylylyVar != null && (jSONArraySss0073sss = sss0073sss(ylylylyVar, z)) != null) {
                            list.add(jSONArraySss0073sss);
                            JSONArray jSONArrayAddDataIntegrity2 = addDataIntegrity(jSONArray, ylylylyVar);
                            if (jSONArrayAddDataIntegrity2 != null) {
                                jSONArray3.put(jSONArrayAddDataIntegrity2);
                            }
                            addFieldProps(jSONArray2, ylylylyVar);
                            zShouldSendEditTextProperties |= ylylylyVar.shouldSendEditTextProperties();
                        }
                    }
                }
            } else {
                while (true) {
                    try {
                        i /= 0;
                    } catch (Exception unused) {
                        x0078xx0078xxx = x0078x00780078xxx();
                    }
                }
            }
        }
        return zShouldSendEditTextProperties;
    }

    public static JSONObject getFilteredValuesObject() throws Exception {
        Object objPppp0070ppp;
        JSONArray jSONArray = new JSONArray();
        if (noAccSensor.get()) {
            if (useCompactSensorFormat) {
                objPppp0070ppp = 4;
                int i = x0078xx0078xxx;
                if (((x00780078x0078xxx + i) * i) % xxx00780078xxx() != 0) {
                    x0078xx0078xxx = 16;
                    xx0078x0078xxx = x0078x00780078xxx();
                }
            } else {
                objPppp0070ppp = uuxuuuu.pppp0070ppp("\u000e\u000f", (char) (yylylll.r0072r0072r00720072() ^ (-1349847264)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)));
            }
            jSONArray.put(objPppp0070ppp);
        }
        if (noGyroSensor.get()) {
            jSONArray.put(useCompactSensorFormat ? 8 : uuxuuuu.pp0070p0070ppp("6V", (char) (yyyllll.rrrr007200720072() ^ 383821979), (char) (ylyylll.r0072rrr00720072() ^ (-1691741317)), (char) (yyyllll.rrrr007200720072() ^ 383821867)));
        }
        JSONObject jSONObject = new JSONObject();
        if (jSONArray.length() > 0) {
            try {
                try {
                    try {
                        jSONObject.put(uuxuuuu.pppp0070ppp("z\u0002", (char) (yylylll.r0072r0072r00720072() ^ (-1349847241)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))), jSONArray);
                        return jSONObject;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (JSONException e2) {
                    LogBridge.e(uuxuuuu.pp0070p0070ppp("|\u001f!\u0019-\u001f$\b\u001c\u001f\u001a\u001e\u0016!", (char) (yylylll.r0072r0072r00720072() ^ (-1349847232)), (char) (yyyllll.rrrr007200720072() ^ 383821881), (char) (yyyllll.rrrr007200720072() ^ 383821869)), uuxuuuu.pppp0070ppp("{x\u0007Wy{\u0003r~pn_is{jwRdkebr\u001d", (char) (yllylll.r007200720072r00720072() ^ (-1146716676)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))), e2);
                }
            } catch (Exception e3) {
                throw e3;
            }
        }
        return jSONObject;
    }

    public static long getLastDown() {
        BehavioOverlay behavioOverlay = m006D006Dm006D006Dm;
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = 96;
            xx0078x0078xxx = 79;
        }
        return behavioOverlay.getLastDown();
    }

    public static double getLastPressure() {
        double lastPressure = m006D006Dm006D006Dm.getLastPressure();
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = 66;
        }
        return lastPressure;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0183 A[PHI: r0
  0x0183: PHI (r0v8 android.view.View) = (r0v7 android.view.View), (r0v13 android.view.View) binds: [B:3:0x0063, B:21:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.View getParentView(android.view.View r11) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.ooodood.getParentView(android.view.View):android.view.View");
    }

    public static JSONArray getTimingsAsJSON(String str, Context context) throws Exception {
        String str2 = uuxuuuu.pppp0070ppp("\u0006\u0005\u0015u\f\u0011\u000e\u0014\u000e\u001bi\u001dt~{{V", (char) (ylyylll.r0072rrr00720072() ^ (-1691741341)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))) + str + uuxuuuu.pppp0070ppp("8", (char) (yylylll.r0072r0072r00720072() ^ (-1349847267)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800)));
        LogBridge.i(uuxuuuu.pppp0070ppp("+MSKcU^BJMLPLW", (char) (yllylll.r007200720072r00720072() ^ (-1146716897)), (char) (yyyllll.rrrr007200720072() ^ 383821858)), str2);
        JSONArray jSONArray = new JSONArray();
        JSONObject filteredValuesObject = getFilteredValuesObject();
        JSONArray jSONArrayS0073sssss = s0073sssss();
        jSONArrayS0073sssss.put(filteredValuesObject);
        jSONArray.put(jSONArrayS0073sssss);
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArrayInitDataIntegrityArray = initDataIntegrityArray(jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArrayInitFieldPropsArray = initFieldPropsArray(jSONArray3);
        JSONArray jSONArray4 = new JSONArray();
        ArrayList arrayList = new ArrayList();
        collectTargetArrays(context, false, arrayList, jSONArrayInitDataIntegrityArray, jSONArrayInitFieldPropsArray, jSONArray4);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONArray) it.next());
        }
        synchronized (behavioCustomJSONArrayList) {
            int i = 0;
            while (true) {
                try {
                    ArrayList<odododd> arrayList2 = behavioCustomJSONArrayList;
                    if (i >= arrayList2.size()) {
                        break;
                    }
                    odododd odododdVar = arrayList2.get(i);
                    JSONArray jSONArray5 = new JSONArray();
                    jSONArray5.put(odododdVar.s0073s0073s0073s());
                    jSONArray5.put(odododdVar.sss0073s0073s());
                    jSONArray5.put(odododdVar.s00730073ss0073s());
                    jSONArray.put(jSONArray5);
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (jSONArray4.length() > 0) {
            try {
                filteredValuesObject.put(uuxuuuu.pppp0070ppp("0?", (char) (yllylll.r007200720072r00720072() ^ (-1146716737)), (char) ((-1146716800) ^ yllylll.r007200720072r00720072())), jSONArray4);
            } catch (JSONException e) {
                LogBridge.e(uuxuuuu.pp0070p0070ppp("\f04.D8?%;@=C=J", (char) (ylyylll.r0072rrr00720072() ^ (-1691741283)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847264)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))), str2, e);
            }
        }
        jSONArray.put(jSONArray3);
        jSONArray2.put(str);
        jSONArray.put(jSONArray2);
        return jSONArray;
    }

    public static Map<String, String> getTimingsAsMap(String str, Context context, int i, boolean z) throws Exception {
        String str2 = uuxuuuu.pp0070p0070ppp("85C\"69480;\b9\u0012%3i", (char) (ylyylll.r0072rrr00720072() ^ (-1691741246)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847154)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + str + uuxuuuu.pp0070p0070ppp("6", (char) (ylyylll.r0072rrr00720072() ^ (-1691741297)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847047)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329)));
        LogBridge.i(uuxuuuu.pp0070p0070ppp("Du\u0003\n12B5\\nt\b\u0013-", (char) (yylylll.r0072r0072r00720072() ^ (-1349847056)), (char) (yyyllll.rrrr007200720072() ^ 383821990), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), str2);
        HashMap map = new HashMap();
        JSONObject filteredValuesObject = getFilteredValuesObject();
        if (z) {
            JSONArray jSONArrayS0073sssss = s0073sssss();
            jSONArrayS0073sssss.put(filteredValuesObject);
            map.put(uuxuuuu.pp0070p0070ppp(" '3#+", (char) (ylyylll.r0072rrr00720072() ^ (-1691741198)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847249)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), jSONArrayS0073sssss.toString());
        }
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArrayInitDataIntegrityArray = initDataIntegrityArray(jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        ArrayList arrayList = new ArrayList();
        boolean zCollectTargetArrays = collectTargetArrays(context, true, arrayList, jSONArrayInitDataIntegrityArray, jSONArray2, jSONArray3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            JSONArray jSONArray5 = (JSONArray) it.next();
            JSONArray jSONArrayOptJSONArray = jSONArray5.optJSONArray(1);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONArray4.put(jSONArray5);
            }
        }
        if (jSONArray3.length() > 0) {
            try {
                filteredValuesObject.put(uuxuuuu.pppp0070ppp("\u000e\u001d", (char) (ylyylll.r0072rrr00720072() ^ (-1691741250)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))), jSONArray3);
            } catch (JSONException e) {
                LogBridge.e(uuxuuuu.pppp0070ppp("i\u000e\u0012\f\"\u0016\u001d\u0003\u0019\u001e\u001b!\u001b(", (char) (yylylll.r0072r0072r00720072() ^ (-1349847041)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))), str2, e);
            }
        }
        if (jSONArray4.length() > 0) {
            JSONArray jSONArrayPut = new JSONArray().put(new JSONArray().put(i).put(jSONArray4));
            char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847181));
            int iRrrr007200720072 = yyyllll.rrrr007200720072() ^ 383821910;
            int i2 = x0078xx0078xxx;
            if (((x00780078x0078xxx + i2) * i2) % xx007800780078xxx != xx0078x0078xxx) {
                x0078xx0078xxx = x0078x00780078xxx();
                xx0078x0078xxx = 85;
            }
            map.put(uuxuuuu.pp0070p0070ppp("d\u001a\u0018l=\u0007", cR0072r0072r00720072, (char) iRrrr007200720072, (char) ((-1349847056) ^ yylylll.r0072r0072r00720072())), jSONArrayPut.toString());
            map.put(uuxuuuu.pp0070p0070ppp("HO[T]_KV\\SUi", (char) (yllylll.r007200720072r00720072() ^ (-1146716825)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847290)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))), String.valueOf(m006D006D006Dmm006D.getAndIncrement()));
            char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716714));
            int i3 = x0078xx0078xxx;
            if (((x00780078x0078xxx + i3) * i3) % xx007800780078xxx != xx0078x0078xxx) {
                x0078xx0078xxx = 28;
                xx0078x0078xxx = x0078x00780078xxx();
            }
            LogBridge.d(uuxuuuu.pppp0070ppp("#EG?SEJ.BE@D<G", cR007200720072r00720072, (char) (yyyllll.rrrr007200720072() ^ 383821865)), uuxuuuu.pppp0070ppp(";p*Ia(Y", (char) (yllylll.r007200720072r00720072() ^ (-1146716837)), (char) (yyyllll.rrrr007200720072() ^ 383821869)) + jSONArrayPut);
        }
        if (jSONArray2.length() > 0 && (zCollectTargetArrays || z)) {
            JSONArray jSONArrayPut2 = new JSONArray().put(new JSONArray().put(i).put(jSONArray2));
            map.put(uuxuuuu.pp0070p0070ppp("\u0018\u001f+\u001f*", (char) ((-1691741297) ^ ylyylll.r0072rrr00720072()), (char) (ylyylll.r0072rrr00720072() ^ (-1691741275)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))), jSONArrayPut2.toString());
            map.put(uuxuuuu.pppp0070ppp("<o\u001f3_\u0014\u0004Z$2]", (char) (yyyllll.rrrr007200720072() ^ 383821880), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), String.valueOf(i));
            LogBridge.d(uuxuuuu.pppp0070ppp("\u0010280@2;\u001f/215)4", (char) (yylylll.r0072r0072r00720072() ^ (-1349847104)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800))), uuxuuuu.pppp0070ppp("RYeYd/", (char) (ylyylll.r0072rrr00720072() ^ (-1691741235)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))) + jSONArrayPut2);
        }
        jSONArray.put(ss0073ssss(context));
        JSONArray jSONArrayPut3 = new JSONArray().put(new JSONArray().put(i).put(jSONArray));
        map.put(uuxuuuu.pp0070p0070ppp("\u0018\u001f+0", (char) ((-1146716837) ^ yllylll.r007200720072r00720072()), (char) (yyyllll.rrrr007200720072() ^ 383821877), (char) (yyyllll.rrrr007200720072() ^ 383821866)), jSONArrayPut3.toString());
        map.put(uuxuuuu.pp0070p0070ppp("4\u000e,\u0003]zS\\P6", (char) (yllylll.r007200720072r00720072() ^ (-1146716761)), (char) (yyyllll.rrrr007200720072() ^ 383821919), (char) (yyyllll.rrrr007200720072() ^ 383821867)), String.valueOf(i));
        LogBridge.d(uuxuuuu.pppp0070ppp("?cgawkrXnspvp}", (char) (ylyylll.r0072rrr00720072() ^ (-1691741353)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))), uuxuuuu.pppp0070ppp("~\u0006\u0012\u0017Z", (char) (yyyllll.rrrr007200720072() ^ 383821879), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))) + jSONArrayPut3);
        return map;
    }

    public static JSONArray initDataIntegrityArray(JSONArray jSONArray) {
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847163));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        if (((x00780078xx0078xx() + x0078xx0078xxx) * x0078xx0078xxx) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = 91;
            xx0078x0078xxx = x0078x00780078xxx();
        }
        jSONArray.put(uuxuuuu.pppp0070ppp("o", cR0072r0072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847050))));
        JSONArray jSONArray2 = new JSONArray();
        jSONArray.put(jSONArray2);
        return jSONArray2;
    }

    public static JSONArray initFieldPropsArray(JSONArray jSONArray) {
        jSONArray.put(uuxuuuu.pppp0070ppp("\u0014\u001f", (char) (yllylll.r007200720072r00720072() ^ (-1146716891)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))));
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = 28;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray.put(jSONArray2);
        return jSONArray2;
    }

    public static boolean isUseDefaultInputConnection() {
        int i = 1;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                x0078xx0078xxx = x0078x00780078xxx();
                return false;
            }
        }
    }

    public static boolean removeKeyDownListener(Context context) {
        BehavioOverlay behavioOverlay = m006D006Dm006D006Dm;
        int size = editTextDelegateMap.size();
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xxx00780078xxx() != xx00780078x0078xx()) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = 79;
        }
        if (!behavioOverlay.removeKeyDownListener(context, size)) {
            return false;
        }
        sensorCollector.yyy00790079y0079(context);
        return true;
    }

    public static void removeViewListener() {
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = 46;
        }
        m006D006Dm006D006Dm.removeViewListener();
    }

    public static void resetCounters() {
        m006D006D006Dmm006D.set(0);
        mmmm006Dm006D.set(0);
        m006Dmm006Dm006D.set(0);
        try {
            throw null;
        } catch (Exception unused) {
            x0078xx0078xxx = x0078x00780078xxx();
        }
    }

    public static void resetLastDown() {
        m006D006Dm006D006Dm.resetLastDown();
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                x0078xx0078xxx = x0078x00780078xxx();
                try {
                    throw null;
                } catch (Exception unused2) {
                    x0078xx0078xxx = x0078x00780078xxx();
                    return;
                }
            }
        }
    }

    private static synchronized void s007300730073sss(Context context) {
        try {
            if (monitoringEnabled) {
                m006D006Dm006D006Dm.init(context);
                SensorCollector sensorCollector2 = sensorCollector;
                SensorCollector.yy0079y00790079y(sensorCollector2, context);
                SyncedWeakHashMap<Context, odooddd> syncedWeakHashMap = editTextDelegateMap;
                int i = x0078xx0078xxx;
                if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
                    x0078xx0078xxx = 75;
                    xx0078x0078xxx = 11;
                }
                odooddd odoodddVar = syncedWeakHashMap.get(context);
                if (odoodddVar != null && odoodddVar.editTextDelegates.size() == 1) {
                    sensorCollector2.startGatherSensorData();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void s00730073s0073ss(Context context) {
        WeakHashMap<Context, String> weakHashMap = mm006Dm006D006Dm;
        if ((x0078x00780078xxx() * (x0078x00780078xxx() + x00780078x0078xxx)) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = 20;
            xx0078x0078xxx = x0078x00780078xxx();
        }
        weakHashMap.remove(context);
    }

    private static JSONArray s00730073ssss(odooddo odooddoVar, boolean z) {
        if (odooddoVar.a00610061a0061aa() == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        if (z) {
            jSONArray.put(odooddoVar.getId());
        } else {
            jSONArray.put(odooddoVar.aaaa0061aa());
            jSONArray.put(odooddoVar.getFieldName());
        }
        JSONArray jSONArrayA00610061a0061aa = odooddoVar.a00610061a0061aa();
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = x0078x00780078xxx();
        }
        jSONArray.put(jSONArrayA00610061a0061aa);
        return jSONArray;
    }

    public static void s0073s00730073ss(boolean z) {
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = x0078x00780078xxx();
        }
        useCompactSensorFormat = z;
    }

    public static String s0073s0073sss() {
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
            x0078xx0078xxx = 9;
            xx0078x0078xxx = x0078x00780078xxx();
        }
        return mm006D006D006D006Dm;
    }

    public static void s0073ss0073ss(EditText editText) {
        Iterator<Context> it = editTextDelegateMap.iterator();
        while (it.hasNext()) {
            Context next = it.next();
            String strPppp0070ppp = uuxuuuu.pppp0070ppp("6\u000e\u0001WB\t!\u001buOG0vS", (char) (yylylll.r0072r0072r00720072() ^ (-1349847167)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334)));
            StringBuilder sb = new StringBuilder();
            sb.append(uuxuuuu.pppp0070ppp("U\u0015`WJ%6Y&x", (char) (yllylll.r007200720072r00720072() ^ (-1146716921)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))));
            int i = x0078xx0078xxx;
            if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
                x0078xx0078xxx = 17;
                xx0078x0078xxx = 91;
            }
            sb.append(next);
            LogBridge.d(strPppp0070ppp, sb.toString());
            for (odooddo odooddoVar : editTextDelegateMap.get(next).editTextDelegates) {
                if (odooddoVar.a006100610061aaa() == editText) {
                    odooddoVar.aaaaa0061a();
                    LogBridge.d(uuxuuuu.pppp0070ppp("?ac[oafJ^a\\`Xc", (char) (yylylll.r0072r0072r00720072() ^ (-1349847184)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))), uuxuuuu.pp0070p0070ppp("NBKNVF(USR+KQ]>Pda;P`\u0011dXadl\\\\\u0019", (char) (ylyylll.r0072rrr00720072() ^ (-1691741379)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))) + next + uuxuuuu.pppp0070ppp("5(", (char) (yllylll.r007200720072r00720072() ^ (-1146716814)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))) + editText);
                }
            }
        }
    }

    private static JSONArray s0073sssss() {
        uuxuuuu.pppp0070ppp("hgwLjgkm{K}~n\b79", (char) (ylyylll.r0072rrr00720072() ^ (-1691741207)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049)));
        JSONArray jSONArray = new JSONArray();
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716924));
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = x0078x00780078xxx();
        }
        jSONArray.put(uuxuuuu.pp0070p0070ppp("p\u0016", cR007200720072r00720072, (char) (ylyylll.r0072rrr00720072() ^ (-1691741240)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))));
        jSONArray.put(uuxuuuu.pp0070p0070ppp("\u000b\u0019\u0010\u001f\u001d\u0018\u0014", (char) (yllylll.r007200720072r00720072() ^ (-1146716792)), (char) (yllylll.r007200720072r00720072() ^ (-1146716767)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))));
        jSONArray.put(m006Dmm006D006Dm);
        return jSONArray;
    }

    public static void setExtraData(JSONArray jSONArray) {
        mm006Dmmm006D.set(jSONArray);
    }

    public static void setKeyFlightStatistics() {
        SensorCollector sensorCollector2 = sensorCollector;
        lastKeyFlightAcc = sensorCollector2.keyFlightAcc;
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = x0078x00780078xxx();
        }
        lastKeyFlightGyro = sensorCollector2.keyFlightGyro;
        sensorCollector2.resetKeyFlightStatistics();
    }

    public static void setLastDown(Context context, long j, double d) {
        BehavioOverlay behavioOverlay = m006D006Dm006D006Dm;
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = x0078x00780078xxx();
        }
        if (behavioOverlay.setLastDown(context, j, d)) {
            setKeyFlightStatistics();
        }
    }

    public static void setLocationCollector(yllylyy yllylyyVar) {
    }

    private static JSONObject ss00730073sss() throws JSONException {
        uuxuuuu.pp0070p0070ppp("FEU8HVXOVV8LUQPb\u0017\u0019\u0011", (char) (ylyylll.r0072rrr00720072() ^ (-1691741255)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741340)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334)));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(uuxuuuu.pppp0070ppp("^N\\^U\\\\", (char) (yylylll.r0072r0072r00720072() ^ (-1349847292)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), uuxuuuu.pppp0070ppp("\t\u0005\b\u0007\n", (char) (yyyllll.rrrr007200720072() ^ 383822043), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))));
            return jSONObject;
        } catch (JSONException e) {
            String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("\u0018<@:PDK1GLIOIV", (char) (yllylll.r007200720072r00720072() ^ (-1146716684)), (char) (yyyllll.rrrr007200720072() ^ 383821827), (char) ((-1146716792) ^ yllylll.r007200720072r00720072()));
            int iR0072r0072r00720072 = yylylll.r0072r0072r00720072() ^ (-1349847109);
            if (((x00780078xx0078xx() + x0078xx0078xxx) * x0078xx0078xxx) % xx007800780078xxx != xx0078x0078xxx) {
                x0078xx0078xxx = x0078x00780078xxx();
                xx0078x0078xxx = 79;
            }
            LogBridge.e(strPp0070p0070ppp, uuxuuuu.pp0070p0070ppp("1iUqM5rD\u0015P\f[.\u0005?++f:", (char) iR0072r0072r00720072, (char) (yylylll.r0072r0072r00720072() ^ (-1349847240)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))), e);
            return jSONObject;
        }
    }

    public static void ss0073s0073ss(long j, boolean z) {
        boolean z2;
        m006D006Dmmm006D = j;
        if (z) {
            z2 = false;
        } else {
            int i = x0078xx0078xxx;
            if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
                x0078xx0078xxx = x0078x00780078xxx();
                xx0078x0078xxx = 33;
            }
            z2 = true;
        }
        collectTmxData = z2;
    }

    public static String ss0073ssss(Context context) {
        String str = mm006Dm006D006Dm.get(context);
        if (str != null) {
            int i = 3;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused) {
                    x0078xx0078xxx = 76;
                    while (true) {
                        try {
                            int[] iArr = new int[-1];
                        } catch (Exception unused2) {
                            x0078xx0078xxx = 91;
                            while (true) {
                                try {
                                    int[] iArr2 = new int[-1];
                                } catch (Exception unused3) {
                                    x0078xx0078xxx = x0078x00780078xxx();
                                    if (!str.isEmpty()) {
                                        return str;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return context.getClass().getSimpleName();
    }

    public static void sss00730073ss(String str, Context context) {
        WeakHashMap<Context, String> weakHashMap = mm006Dm006D006Dm;
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
            x0078xx0078xxx = 73;
            xx0078x0078xxx = x0078x00780078xxx();
        }
        weakHashMap.put(context, str);
    }

    private static JSONArray sss0073sss(ylylyly ylylylyVar, boolean z) {
        String strPppp0070ppp;
        if (ylylylyVar.getJSONArrayTimings() == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        if (z) {
            jSONArray.put(ylylylyVar.getId());
        } else {
            if (ylylylyVar.getAnonymous().booleanValue()) {
                strPppp0070ppp = uuxuuuu.pppp0070ppp("I+", (char) (yylylll.r0072r0072r00720072() ^ (-1349847152)), (char) (yyyllll.rrrr007200720072() ^ 383821864));
                int i = x0078xx0078xxx;
                if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
                    x0078xx0078xxx = x0078x00780078xxx();
                    xx0078x0078xxx = x0078x00780078xxx();
                }
            } else {
                strPppp0070ppp = uuxuuuu.pppp0070ppp("\u001c", (char) (yylylll.r0072r0072r00720072() ^ (-1349847112)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)));
            }
            jSONArray.put(strPppp0070ppp);
            jSONArray.put(ylylylyVar.getFieldName());
        }
        jSONArray.put(ylylylyVar.getJSONArrayTimings());
        return jSONArray;
    }

    public static void ssss0073ss(String... strArr) {
        for (String str : strArr) {
            HashSet<String> hashSet = ignoreFeaturesSet;
            if ((x0078x00780078xxx() * (x0078x00780078xxx() + x00780078x0078xxx)) % xx007800780078xxx != xx00780078x0078xx()) {
                x0078xx0078xxx = 91;
                xx0078x0078xxx = x0078x00780078xxx();
            }
            hashSet.add(str);
        }
    }

    public static int x00780078xx0078xx() {
        return 1;
    }

    public static int x0078x00780078xxx() {
        return 80;
    }

    public static int xx00780078x0078xx() {
        return 0;
    }

    public static int xxx00780078xxx() {
        return 2;
    }

    public static /* synthetic */ Boolean y0079007900790079y0079(Boolean bool) {
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = 1;
        }
        mmmmmm006D = bool;
        return bool;
    }

    public static void y007900790079y00790079() {
        ignoreFeaturesSet.clear();
    }

    public static void y00790079y007900790079() {
        monitoringEnabled = false;
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xxx00780078xxx() != xx0078x0078xxx) {
            x0078xx0078xxx = 6;
            xx0078x0078xxx = x0078x00780078xxx();
        }
    }

    public static void y00790079yy00790079(String str, String str2) throws JSONException, IllegalArgumentException {
        String str3 = uuxuuuu.pp0070p0070ppp("?N\u001a\u0015{2M&rsIT\u0001_r=\u0007$#", (char) (yllylll.r007200720072r00720072() ^ (-1146716843)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741347)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))) + str + uuxuuuu.pp0070p0070ppp("\u0004", (char) (yyyllll.rrrr007200720072() ^ 383821964), (char) (yllylll.r007200720072r00720072() ^ (-1146716851)), (char) (yyyllll.rrrr007200720072() ^ 383821867)) + str2 + uuxuuuu.pp0070p0070ppp("]", (char) (yyyllll.rrrr007200720072() ^ 383822058), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329)));
        if (!str.equals(uuxuuuu.pppp0070ppp("}\u0001vx\u0001", (char) (yllylll.r007200720072r00720072() ^ (-1146716914)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343)))) && !str.equals(uuxuuuu.pp0070p0070ppp("\u001f\r\u0019\u0019\u000e\u0013\u0011", (char) (yllylll.r007200720072r00720072() ^ (-1146716855)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847270)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332)))) && !str.equals(uuxuuuu.pp0070p0070ppp("bPmF\u001df\u0010dR", (char) (ylyylll.r0072rrr00720072() ^ (-1691741310)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741218)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330)))) && !str.equals(uuxuuuu.pppp0070ppp("JS\\TJ^T[[", (char) (yllylll.r007200720072r00720072() ^ (-1146716741)), (char) (yyyllll.rrrr007200720072() ^ 383821859))) && !str.equals(uuxuuuu.pppp0070ppp("\u0015\u0011\u0010\u0014", (char) (ylyylll.r0072rrr00720072() ^ (-1691741259)), (char) ((-1349847045) ^ yylylll.r0072r0072r00720072())))) {
            try {
                m006Dmm006D006Dm.put(str, str2);
                return;
            } catch (JSONException e) {
                LogBridge.e(uuxuuuu.pp0070p0070ppp("S%5\u000ey\u001f\u0010/\u0019w&.BI", (char) (yyyllll.rrrr007200720072() ^ 383821852), (char) (yllylll.r007200720072r00720072() ^ (-1146716803)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))), str3, e);
                return;
            }
        }
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821888);
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716725));
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = 99;
            xx0078x0078xxx = x0078x00780078xxx();
        }
        LogBridge.w(uuxuuuu.pp0070p0070ppp("j\u0010#D\u0013'KB[=vYb\u001d", cRrrr007200720072, cR007200720072r00720072, (char) (iR0072rrr00720072 ^ (-1691741331))), uuxuuuu.pppp0070ppp("=ab\\_Zf\u001br^phacnh$sgtm5*nm{|~\u00051tx4\n~|8\r{\t\u0002=\u007f\u0013@\u0016\u000b\tD\u001c\b\u001a\u0012\u000b\r\u0018\u0012M\u001d\u0011\u001e\u0017&S\u001b%)W-\" [02 .%#5(d<(4>/>", (char) (yllylll.r007200720072r00720072() ^ (-1146716688)), (char) (yyyllll.rrrr007200720072() ^ 383821859)));
    }

    private static odooddd y0079y0079007900790079(Context context) {
        SyncedWeakHashMap<Context, odooddd> syncedWeakHashMap = editTextDelegateMap;
        odooddd odoodddVar = syncedWeakHashMap.get(context);
        if (odoodddVar == null) {
            odoodddVar = new odooddd();
            int i = x0078xx0078xxx;
            if (((x00780078x0078xxx + i) * i) % xxx00780078xxx() != 0) {
                x0078xx0078xxx = 35;
                xx0078x0078xxx = x0078x00780078xxx();
            }
            syncedWeakHashMap.put(context, odoodddVar);
        }
        return odoodddVar;
    }

    public static /* synthetic */ String y0079y00790079y0079(String str) {
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = 95;
            xx0078x0078xxx = 30;
        }
        mm006D006D006D006Dm = str;
        return str;
    }

    public static void y0079y0079y00790079() {
        uuxuuuu.pp0070p0070ppp(".mgR,\fja\ro\\0h5\r!N", (char) (yllylll.r007200720072r00720072() ^ (-1146716717)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847139)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050)));
        LogBridge.i(uuxuuuu.pp0070p0070ppp("]\u007f\u0002y\u000e\u007f\u0005h|\u007fz~v\u0002", (char) (yylylll.r0072r0072r00720072() ^ (-1349847187)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741395)), (char) (yyyllll.rrrr007200720072() ^ 383821869)), uuxuuuu.pp0070p0070ppp("\u0014\u001c\u0014\u000f\u001fl\u0017\u0016k\u001d\u001a\u001a\u0014\u0011JJ@", (char) (yyyllll.rrrr007200720072() ^ 383821946), (char) (yyyllll.rrrr007200720072() ^ 383821910), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))));
        ArrayList<odododd> arrayList = behavioCustomJSONArrayList;
        synchronized (arrayList) {
            arrayList.clear();
        }
    }

    public static void y0079yy007900790079(boolean z) {
        m006Dm006D006D006Dm = false;
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                x0078xx0078xxx = 79;
                return;
            }
        }
    }

    public static void y0079yyy00790079(String str, String str2, JSONArray jSONArray) {
        odododd odododdVar = new odododd(str2, str, jSONArray);
        ArrayList<odododd> arrayList = behavioCustomJSONArrayList;
        synchronized (arrayList) {
            arrayList.add(odododdVar);
        }
    }

    private static JSONArray yy00790079007900790079(String str, String str2, oddodoo oddodooVar, yyylyyy yyylyyyVar) {
        String str3 = uuxuuuu.pp0070p0070ppp("ON^1UYbTbVVIUak\\k:lm]v&", (char) (yllylll.r007200720072r00720072() ^ (-1146716909)), (char) (yyyllll.rrrr007200720072() ^ 383822048), (char) (yyyllll.rrrr007200720072() ^ 383821864)) + str + uuxuuuu.pp0070p0070ppp("M", (char) (ylyylll.r0072rrr00720072() ^ (-1691741260)), (char) (yllylll.r007200720072r00720072() ^ (-1146716924)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))) + str2 + uuxuuuu.pppp0070ppp("\"", (char) (yyyllll.rrrr007200720072() ^ 383822044), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332)));
        try {
            JSONArray jSONArrayDdd0064d0064d = yyylyyyVar.ddd0064d0064d(oddodooVar.getJSONArrayEditTextTimings().length(), useCompactSensorFormat);
            int length = jSONArrayDdd0064d0064d.getJSONArray(0).length();
            int i = x0078xx0078xxx;
            if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != 0) {
                x0078xx0078xxx = 88;
                xx0078x0078xxx = x0078x00780078xxx();
            }
            if (length <= 0 && jSONArrayDdd0064d0064d.getJSONArray(1).length() <= 0) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONArray.put(str2);
            jSONArray.put(jSONArrayDdd0064d0064d);
            return jSONArray;
        } catch (JSONException e) {
            LogBridge.e(uuxuuuu.pp0070p0070ppp("d\t\r\u0007\u001d\u0011\u0018}\u0014\u0019\u0016\u001c\u0016#", (char) (ylyylll.r0072rrr00720072() ^ (-1691741274)), (char) (yllylll.r007200720072r00720072() ^ (-1146716761)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), str3, e);
            return null;
        }
    }

    public static /* synthetic */ boolean yy007900790079y0079(boolean z) {
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = x0078x00780078xxx();
        }
        m006D006D006D006D006Dm = z;
        return z;
    }

    public static void yy00790079y00790079() {
        m006Dmm006D006Dm = ss00730073sss();
    }

    public static void yy0079y007900790079(Context context) {
        boolean zDestroy = m006D006Dm006D006Dm.destroy(context, editTextDelegateMap.size());
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xxx00780078xxx() != 0) {
            x0078xx0078xxx = 34;
            xx0078x0078xxx = x0078x00780078xxx();
        }
        if (zDestroy) {
            sensorCollector.yyy00790079y0079(context);
            y0079y0079y00790079();
            yyy0079y00790079(context, true);
        }
    }

    public static void yy0079yy00790079(String str, double d) throws JSONException, IllegalArgumentException {
        y00790079yy00790079(str, String.valueOf(d));
        try {
            throw null;
        } catch (Exception unused) {
            x0078xx0078xxx = x0078x00780078xxx();
            int i = 0;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused2) {
                    x0078xx0078xxx = 52;
                    while (true) {
                        try {
                            int[] iArr = new int[-1];
                        } catch (Exception unused3) {
                            x0078xx0078xxx = 92;
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void yyy0079007900790079() {
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = 27;
            xx0078x0078xxx = 82;
        }
        monitoringEnabled = true;
    }

    private static void yyy0079y00790079(Context context, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pp0070p0070ppp("'\\\t8|wV\nx", (char) (yllylll.r007200720072r00720072() ^ (-1146716747)), (char) (yyyllll.rrrr007200720072() ^ 383821976), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))));
        sb.append(z);
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072() ^ (-1349847296);
        int i = x0078xx0078xxx;
        if (((x00780078x0078xxx + i) * i) % xx007800780078xxx != xx0078x0078xxx) {
            x0078xx0078xxx = 56;
            xx0078x0078xxx = x0078x00780078xxx();
        }
        sb.append(uuxuuuu.pp0070p0070ppp("\u0003x", (char) iR0072r0072r00720072, (char) (yylylll.r0072r0072r00720072() ^ (-1349847105)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))));
        LogBridge.i(uuxuuuu.pp0070p0070ppp("[?}:w++\u0019\u001a3$\t{{", (char) (ylyylll.r0072rrr00720072() ^ (-1691741328)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847142)), (char) (yyyllll.rrrr007200720072() ^ 383821865)), sb.toString());
        Context activity = m006D006Dm006D006Dm.getActivity();
        if (activity == null || activity == context) {
            odooddd odoodddVar = editTextDelegateMap.get(context);
            if (odoodddVar == null) {
                LogBridge.i(uuxuuuu.pp0070p0070ppp("}djl9|\u00149\u0015\u0010\u0019\u0013G\u0006", (char) (yllylll.r007200720072r00720072() ^ (-1146716750)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741416)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), uuxuuuu.pp0070p0070ppp("y\u0004}z\r\\\t\nF\u0002\u0010\u0011\u000f\t\u0006\u0014OGv\u0019J \u0012&#O\u0017\u001b\u0018 \u0019U\u001d'.(\u001f[4'3(`6+)d1,Ah", (char) (yyyllll.rrrr007200720072() ^ 383821832), (char) (ylyylll.r0072rrr00720072() ^ (-1691741288)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))) + context.toString());
                return;
            }
            try {
                for (odooddo odooddoVar : odoodddVar.editTextDelegates) {
                    if (odooddoVar != null) {
                        odooddoVar.aaa00610061aa().clear();
                    }
                }
            } finally {
                if (z) {
                    mm006Dm006D006Dm.remove(context);
                }
            }
        }
    }

    public static void yyyy007900790079(boolean z) {
        m006Dmmmm006D = false;
        try {
            throw null;
        } catch (Exception unused) {
            x0078xx0078xxx = 75;
        }
    }

    public static JSONArray addDataIntegrity(JSONArray jSONArray, ylylyly ylylylyVar) {
        char cRrrr007200720072;
        char cR0072r0072r00720072;
        String str;
        if (ylylylyVar.getAnonymous().booleanValue()) {
            cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821963);
            cR0072r0072r00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741343));
            int i = x0078xx0078xxx;
            if (((x00780078xx0078xx() + i) * i) % xx007800780078xxx != 0) {
                x0078xx0078xxx = x0078x00780078xxx();
                xx0078x0078xxx = 97;
            }
            str = ")1";
        } else {
            cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821918);
            cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847050));
            str = "\\";
        }
        JSONArray jSONArrayYy00790079007900790079 = yy00790079007900790079(uuxuuuu.pppp0070ppp(str, cRrrr007200720072, cR0072r0072r00720072), ylylylyVar.getFieldName(), ylylylyVar, ylylylyVar.filteredValues);
        jSONArray.put(ylylylyVar.getDataIntegrityTarget());
        return jSONArrayYy00790079007900790079;
    }

    public static void addFieldProps(JSONArray jSONArray, ylylyly ylylylyVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ylylylyVar.getFieldName(), ylylylyVar.getNonEditTextInputProperties());
        } catch (JSONException e) {
            LogBridge.e(uuxuuuu.pp0070p0070ppp("\u0013\u001d\bIF .zXD'4\u0015\n", (char) (yyyllll.rrrr007200720072() ^ 383821947), (char) (yyyllll.rrrr007200720072() ^ 383822029), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))), uuxuuuu.pp0070p0070ppp("~vg~\u0013\u0004<)F]K}u", (char) (yyyllll.rrrr007200720072() ^ 383822026), (char) (yylylll.r0072r0072r00720072() ^ (-1349847170)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))), e);
        }
        int iX0078x00780078xxx = x0078x00780078xxx();
        if (((x00780078x0078xxx + iX0078x00780078xxx) * iX0078x00780078xxx) % xx007800780078xxx != 0) {
            x0078xx0078xxx = x0078x00780078xxx();
            xx0078x0078xxx = 58;
        }
        jSONArray.put(jSONObject);
    }
}
