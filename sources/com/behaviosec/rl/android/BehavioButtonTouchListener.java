package com.behaviosec.rl.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.behaviosec.rl.odooood;
import com.behaviosec.rl.ooodddd;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.yllylyy;
import com.behaviosec.rl.ylyllly;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.ylyylyl;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yylyyly;
import com.behaviosec.rl.yyyllll;
import com.behaviosec.rl.yyyylly;
import com.behaviosec.rl.yyyyyyl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.medallia.digital.mobilesdk.l8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
/* loaded from: classes4.dex */
public class BehavioButtonTouchListener implements View.OnTouchListener {
    public static final int CLEAR_BUTTON = 3;
    public static final int CLEAR_KEY = -5;
    public static final int DELETE_BUTTON = 2;
    public static final int DEL_KEY = 127;
    public static final int INPUT_BUTTON = 1;
    public static int f006600660066f0066f0066 = 2;
    public static int f0066ff00660066f0066 = 0;
    public static int ff00660066f0066f0066 = 1;
    public static int fff0066f0066f0066 = 44;
    private static final String u00750075uuu0075;
    private static final int u0075u0075uu0075 = 60000;
    private static final float w00770077ww0077w = 0.5f;
    private static final float www0077w0077w = 1.0E-9f;
    private String u0075007500750075u0075;
    public yyyyyyl u007500750075u00750075;
    public yyyyyyl u00750075u007500750075;
    private HashMap<String, TextView> u00750075u0075u0075;
    private Context u00750075uu00750075;
    public yyyyyyl u0075u0075007500750075;
    private LinkedList<yylyyly<String, Integer>> u0075u00750075u0075;
    public yyyyyyl u0075u0075u00750075;
    public yyyyyyl u0075uu007500750075;
    public yyyyyyl uu00750075007500750075;
    private String uu007500750075u0075;
    public yyyyyyl uu00750075u00750075;
    public yyyyyyl uu0075u007500750075;
    private HashMap<View, ooooddo> uu0075u0075u0075;
    private odooood uu0075uu00750075;
    public yyyyyyl uuu0075007500750075;
    private LinkedList<yylyyly<String, TextView>> uuu00750075u0075;
    public yyyyyyl uuu0075u00750075;
    public yyyyyyl uuuu007500750075;
    private TextView uuuuu00750075;
    public yyyyyyl w007700770077www;
    public yyyyyyl w00770077wwww;
    public yyyyyyl w0077w0077www;
    public yyyyyyl w0077ww0077ww;
    private SensorManager w0077www0077w;
    public yyyyyyl w0077wwwww;
    public yyyyyyl ww00770077www;
    private long ww0077w00770077w;
    public yyyyyyl ww0077wwww;
    public yyyyyyl www0077www;
    public yyyyyyl wwww0077ww;
    private SyncedJSONArray wwwww0077w;
    private ylyylyl uuu0075uu0075 = null;
    private boolean uu00750075uu0075 = true;
    private boolean u007500750075uu0075 = true;
    private boolean uuuu0075u0075 = false;
    private boolean u0075uu0075u0075 = false;
    private int u0075uuu00750075 = -1;
    private yllylyy ww0077w0077ww = null;
    private boolean w00770077w0077ww = false;
    private String www00770077ww = null;
    private boolean w0077w00770077ww = false;
    private Boolean ww007700770077ww = null;
    private boolean w0077007700770077ww = false;
    private final SensorEventListener ww0077ww0077w = new SensorEventListener() { // from class: com.behaviosec.rl.android.BehavioButtonTouchListener.5
        public static int f00660066f0066006600660066 = 1;
        public static int f0066ff0066006600660066 = 95;
        public static int ff0066f0066006600660066 = 0;
        public static int fff00660066006600660066 = 2;
        public float[] wwwwww0077 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        public final float w0077wwww0077 = 0.8f;

        private float[] c006300630063c00630063(float[] fArr, float[] fArr2, float f, float f2) {
            float[] fArr3 = new float[3];
            fArr3[0] = (fArr[0] * f) + (fArr2[0] * f2);
            fArr3[1] = (fArr[1] * f) + (fArr2[1] * f2);
            if ((f0066f00660066006600660066() * (f0066f00660066006600660066() + f00660066f0066006600660066)) % fff00660066006600660066 != ff0066f0066006600660066) {
                f0066ff0066006600660066 = f0066f00660066006600660066();
                ff0066f0066006600660066 = f0066f00660066006600660066();
            }
            fArr3[2] = (f * fArr[2]) + (f2 * fArr2[2]);
            return fArr3;
        }

        private void c0063c0063c00630063(SensorEvent sensorEvent) {
            float[] fArr = new float[3];
            float f = sensorEvent.values[0];
            float[] fArr2 = this.wwwwww0077;
            float f2 = (f * 0.19999999f) + (fArr2[0] * 0.8f);
            fArr2[0] = f2;
            float f3 = f - f2;
            fArr[0] = f3;
            ccc0063c00630063(f3, BehavioButtonTouchListener.this.uuu0075u00750075);
            ccc0063c00630063(fArr[0], BehavioButtonTouchListener.this.u0075u0075u00750075);
            float f4 = sensorEvent.values[1];
            float[] fArr3 = this.wwwwww0077;
            fArr3[1] = (f4 * 0.19999999f) + (fArr3[1] * 0.8f);
            int i = f0066ff0066006600660066;
            if (((ff006600660066006600660066() + i) * i) % fff00660066006600660066 != 0) {
                f0066ff0066006600660066 = f0066f00660066006600660066();
                ff0066f0066006600660066 = f0066f00660066006600660066();
            }
            float f5 = f4 - this.wwwwww0077[1];
            fArr[1] = f5;
            ccc0063c00630063(f5, BehavioButtonTouchListener.this.uuuu007500750075);
            ccc0063c00630063(fArr[1], BehavioButtonTouchListener.this.u0075uu007500750075);
            float f6 = sensorEvent.values[2];
            float[] fArr4 = this.wwwwww0077;
            float f7 = (0.19999999f * f6) + (fArr4[2] * 0.8f);
            fArr4[2] = f7;
            float f8 = f6 - f7;
            fArr[2] = f8;
            ccc0063c00630063(f8, BehavioButtonTouchListener.this.uuu0075007500750075);
            ccc0063c00630063(fArr[2], BehavioButtonTouchListener.this.u0075u0075007500750075);
        }

        private float[] c0063cc006300630063(float[] fArr) {
            float[] fArr2 = new float[4];
            float fSqrt = ((float) Math.sqrt(fArr[0] + 1.0f + fArr[4] + fArr[8])) * 0.5f;
            fArr2[3] = fSqrt;
            float f = 0.25f / fSqrt;
            float f2 = fArr[7];
            float f3 = fArr[5];
            int i = f0066ff0066006600660066;
            if (((f00660066f0066006600660066 + i) * i) % fff00660066006600660066 != ff0066f0066006600660066) {
                f0066ff0066006600660066 = f0066f00660066006600660066();
                ff0066f0066006600660066 = 38;
            }
            fArr2[0] = (f2 - f3) * f;
            float f4 = fArr2[3];
            fArr2[1] = (fArr[2] - fArr[6]) * (0.25f / f4);
            fArr2[2] = (fArr[3] - fArr[1]) * (0.25f / f4);
            return fArr2;
        }

        private float[] cc00630063c00630063(float f) {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
            float[] fArr2 = new float[9];
            if (!SensorManager.getRotationMatrix(fArr2, null, BehavioButtonTouchListener.this.ww00770077w0077w, BehavioButtonTouchListener.n006Enn006Enn(BehavioButtonTouchListener.this))) {
                return fArr;
            }
            float[] fArrCccc006300630063 = cccc006300630063(c0063cc006300630063(fArr2), f);
            float[] fArr3 = {fArrCccc006300630063[0] / 20.0f, fArrCccc006300630063[1] / 20.0f, fArrCccc006300630063[2] / 20.0f};
            for (float[] fArr4 : BehavioButtonTouchListener.n006E006En006Enn(BehavioButtonTouchListener.this)) {
                fArr3[0] = (fArr4[0] / 20.0f) + fArr3[0];
                fArr3[1] = (fArr4[1] / 20.0f) + fArr3[1];
                fArr3[2] = (fArr4[2] / 20.0f) + fArr3[2];
            }
            BehavioButtonTouchListener.n006E006En006Enn(BehavioButtonTouchListener.this).add(fArrCccc006300630063);
            int i = ((int) 20.0f) - 1;
            if (BehavioButtonTouchListener.n006E006En006Enn(BehavioButtonTouchListener.this).size() > i) {
                BehavioButtonTouchListener.n006E006En006Enn(BehavioButtonTouchListener.this).remove();
            }
            float[] fArr5 = new float[3];
            fArr5[0] = fArr3[0] - BehavioButtonTouchListener.nnn006E006Enn(BehavioButtonTouchListener.this)[0];
            float f2 = fArr3[1];
            float f3 = BehavioButtonTouchListener.nnn006E006Enn(BehavioButtonTouchListener.this)[1];
            int i2 = f0066ff0066006600660066;
            if (((f00660066f0066006600660066 + i2) * i2) % fff00660066006600660066 != ff0066f0066006600660066) {
                f0066ff0066006600660066 = 16;
                ff0066f0066006600660066 = 72;
            }
            fArr5[1] = f2 - f3;
            fArr5[2] = fArr3[2] - BehavioButtonTouchListener.nnn006E006Enn(BehavioButtonTouchListener.this)[2];
            BehavioButtonTouchListener.n006En006E006Enn(BehavioButtonTouchListener.this, fArr3);
            float[] fArr6 = {fArr5[0] / 20.0f, fArr5[1] / 20.0f, fArr5[2] / 20.0f};
            for (float[] fArr7 : BehavioButtonTouchListener.ccc0063006300630063(BehavioButtonTouchListener.this)) {
                fArr6[0] = (fArr7[0] / 20.0f) + fArr6[0];
                fArr6[1] = (fArr7[1] / 20.0f) + fArr6[1];
                fArr6[2] = (fArr7[2] / 20.0f) + fArr6[2];
            }
            BehavioButtonTouchListener.ccc0063006300630063(BehavioButtonTouchListener.this).add(fArr5);
            if (BehavioButtonTouchListener.ccc0063006300630063(BehavioButtonTouchListener.this).size() > i) {
                BehavioButtonTouchListener.ccc0063006300630063(BehavioButtonTouchListener.this).remove();
            }
            return fArr6;
        }

        private void ccc0063c00630063(float f, yyyyyyl yyyyyylVar) {
            if (Float.isNaN(f) || Float.isInfinite(f)) {
                return;
            }
            int i = f0066ff0066006600660066;
            if (((f00660066f0066006600660066 + i) * i) % fff00660066006600660066 != 0) {
                f0066ff0066006600660066 = f0066f00660066006600660066();
                ff0066f0066006600660066 = f0066f00660066006600660066();
            }
            yyyyyylVar.kkk006B006Bkk(Math.abs(f), l8.b.b);
        }

        private float[] cccc006300630063(float[] fArr, float f) {
            float fAcos = (float) Math.acos(fArr[3]);
            int i = f0066ff0066006600660066;
            if (((f00660066f0066006600660066 + i) * i) % fff00660066006600660066 != ff0066f0066006600660066) {
                f0066ff0066006600660066 = f0066f00660066006600660066();
                ff0066f0066006600660066 = f0066f00660066006600660066();
            }
            float f2 = (fAcos / f) * 2.0f;
            float fSin = (float) Math.sin(fAcos);
            return new float[]{(fArr[0] / fSin) * f2, (fArr[1] / fSin) * f2, (fArr[2] / fSin) * f2};
        }

        public static int f0066f00660066006600660066() {
            return 12;
        }

        public static int ff006600660066006600660066() {
            return 1;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 10) {
                ccc0063c00630063(sensorEvent.values[0], BehavioButtonTouchListener.this.u0075u0075u00750075);
                ccc0063c00630063(sensorEvent.values[0], BehavioButtonTouchListener.this.uuu0075u00750075);
                ccc0063c00630063(sensorEvent.values[1], BehavioButtonTouchListener.this.u0075uu007500750075);
                ccc0063c00630063(sensorEvent.values[1], BehavioButtonTouchListener.this.uuuu007500750075);
                ccc0063c00630063(sensorEvent.values[2], BehavioButtonTouchListener.this.u0075u0075007500750075);
                ccc0063c00630063(sensorEvent.values[2], BehavioButtonTouchListener.this.uuu0075007500750075);
            }
            if (sensorEvent.sensor.getType() == 4) {
                float f = sensorEvent.values[0];
                if (((ff006600660066006600660066() + f0066ff0066006600660066) * f0066ff0066006600660066) % fff00660066006600660066 != ff0066f0066006600660066) {
                    f0066ff0066006600660066 = f0066f00660066006600660066();
                    ff0066f0066006600660066 = f0066f00660066006600660066();
                }
                ccc0063c00630063(f, BehavioButtonTouchListener.this.u007500750075u00750075);
                ccc0063c00630063(sensorEvent.values[0], BehavioButtonTouchListener.this.uu00750075u00750075);
                ccc0063c00630063(sensorEvent.values[1], BehavioButtonTouchListener.this.u00750075u007500750075);
                ccc0063c00630063(sensorEvent.values[1], BehavioButtonTouchListener.this.uu0075u007500750075);
                ccc0063c00630063(sensorEvent.values[2], BehavioButtonTouchListener.this.w0077wwwww);
                ccc0063c00630063(sensorEvent.values[2], BehavioButtonTouchListener.this.uu00750075007500750075);
            }
            if (sensorEvent.sensor.getType() == 1) {
                if (BehavioButtonTouchListener.this.u0075uu0075u0075) {
                    c0063c0063c00630063(sensorEvent);
                }
                if (BehavioButtonTouchListener.cc00630063006300630063(BehavioButtonTouchListener.this) && !Float.isNaN(sensorEvent.values[0]) && !Float.isNaN(sensorEvent.values[1]) && !Float.isNaN(sensorEvent.values[2])) {
                    BehavioButtonTouchListener behavioButtonTouchListener = BehavioButtonTouchListener.this;
                    BehavioButtonTouchListener.nnnn006Enn(behavioButtonTouchListener, c006300630063c00630063(sensorEvent.values, behavioButtonTouchListener.ww00770077w0077w, 0.5f, 0.5f));
                    float fN006Ennnnn = (sensorEvent.timestamp - BehavioButtonTouchListener.n006Ennnnn(BehavioButtonTouchListener.this)) * BehavioButtonTouchListener.www0077w0077w;
                    BehavioButtonTouchListener.nn006Ennnn(BehavioButtonTouchListener.this, sensorEvent.timestamp);
                    float[] fArrCc00630063c00630063 = cc00630063c00630063(fN006Ennnnn);
                    ccc0063c00630063(fArrCc00630063c00630063[0], BehavioButtonTouchListener.this.uu00750075u00750075);
                    ccc0063c00630063(fArrCc00630063c00630063[0], BehavioButtonTouchListener.this.u007500750075u00750075);
                    ccc0063c00630063(fArrCc00630063c00630063[1], BehavioButtonTouchListener.this.uu0075u007500750075);
                    ccc0063c00630063(fArrCc00630063c00630063[1], BehavioButtonTouchListener.this.u00750075u007500750075);
                    ccc0063c00630063(fArrCc00630063c00630063[2], BehavioButtonTouchListener.this.uu00750075007500750075);
                    ccc0063c00630063(fArrCc00630063c00630063[2], BehavioButtonTouchListener.this.w0077wwwww);
                }
            }
            if (sensorEvent.sensor.getType() != 2 || !BehavioButtonTouchListener.cc00630063006300630063(BehavioButtonTouchListener.this) || Float.isNaN(sensorEvent.values[0]) || Float.isNaN(sensorEvent.values[1]) || Float.isNaN(sensorEvent.values[2])) {
                return;
            }
            BehavioButtonTouchListener behavioButtonTouchListener2 = BehavioButtonTouchListener.this;
            BehavioButtonTouchListener.nn006En006Enn(behavioButtonTouchListener2, c006300630063c00630063(sensorEvent.values, BehavioButtonTouchListener.n006Enn006Enn(behavioButtonTouchListener2), 0.5f, 0.5f));
        }
    };
    private float[] w0077w0077w0077w = new float[3];
    private float[] ww00770077w0077w = new float[3];
    private float[] w007700770077w0077w = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private Queue<float[]> wwww00770077w = new LinkedList();
    private Queue<float[]> w0077ww00770077w = new LinkedList();

    /* renamed from: com.behaviosec.rl.android.BehavioButtonTouchListener$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public static int f00660066f0066f00660066 = 2;
        public static int f0066ff0066f00660066 = 0;
        public static int ff0066f0066f00660066 = 1;
        public static int ffff0066f00660066 = 36;

        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BehavioButtonTouchListener behavioButtonTouchListener = BehavioButtonTouchListener.this;
            String defaultUserAgent = WebSettings.getDefaultUserAgent(BehavioButtonTouchListener.c00630063c006300630063(behavioButtonTouchListener));
            int i = ffff0066f00660066;
            if (((ff0066f0066f00660066 + i) * i) % f00660066f0066f00660066 != f0066ff0066f00660066) {
                ffff0066f00660066 = 30;
                f0066ff0066f00660066 = 38;
            }
            BehavioButtonTouchListener.cc0063c006300630063(behavioButtonTouchListener, defaultUserAgent);
        }
    }

    /* renamed from: com.behaviosec.rl.android.BehavioButtonTouchListener$2, reason: invalid class name */
    public class AnonymousClass2 implements ooodddd.ooddddd {
        public static int f0066f00660066f00660066 = 1;
        public static int ff006600660066f00660066 = 2;
        public static int fff00660066f00660066 = 58;

        public AnonymousClass2() {
        }

        public static int f0066006600660066f00660066() {
            return 50;
        }

        @Override // com.behaviosec.rl.ooodddd.ooddddd
        public void onResult(boolean z) {
            BehavioButtonTouchListener.n006E006Ennnn(BehavioButtonTouchListener.this, z);
            int i = fff00660066f00660066;
            if (((f0066f00660066f00660066 + i) * i) % ff006600660066f00660066 != 0) {
                fff00660066f00660066 = f0066006600660066f00660066();
                f0066f00660066f00660066 = 84;
            }
        }
    }

    /* renamed from: com.behaviosec.rl.android.BehavioButtonTouchListener$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public static int f00660066ff006600660066 = 2;
        public static int f0066fff006600660066 = 0;
        public static int fffff006600660066 = 15;

        public AnonymousClass3() {
        }

        public static int ff0066ff006600660066() {
            return 1;
        }

        public static int fff0066f006600660066() {
            return 38;
        }

        @Override // java.lang.Runnable
        public void run() {
            BehavioButtonTouchListener behavioButtonTouchListener = BehavioButtonTouchListener.this;
            if (((ff0066ff006600660066() + fffff006600660066) * fffff006600660066) % f00660066ff006600660066 != f0066fff006600660066) {
                fffff006600660066 = fff0066f006600660066();
                f0066fff006600660066 = fff0066f006600660066();
            }
            BehavioButtonTouchListener.nnn006Ennn(behavioButtonTouchListener, Boolean.valueOf(yyyylly.yllylly.b0062bb006200620062(BehavioButtonTouchListener.c00630063c006300630063(behavioButtonTouchListener))));
        }
    }

    public class ooooddo {
        public static int a00610061aaaaa = 1;
        public static int a0061aaaaaa = 94;
        public static int aa0061aaaaa = 0;
        public static int aaa0061aaaa = 2;
        private int w00770077www0077;
        private int www0077ww0077;

        public ooooddo(int i, int i2) {
            this.w00770077www0077 = i;
            this.www0077ww0077 = i2;
        }

        public static int a0061a0061aaaa() {
            return 35;
        }

        public static int aa00610061aaaa() {
            return 1;
        }

        public int getKeyId() {
            int i = this.www0077ww0077;
            int i2 = a0061aaaaaa;
            if (((a00610061aaaaa + i2) * i2) % aaa0061aaaa != aa0061aaaaa) {
                a0061aaaaaa = a0061a0061aaaa();
                aa0061aaaaa = 79;
            }
            return i;
        }

        public String getLabel() {
            String string = Character.toString((char) this.www0077ww0077);
            int i = a0061aaaaaa;
            if (((aa00610061aaaa() + i) * i) % aaa0061aaaa != 0) {
                a0061aaaaaa = 95;
                aa0061aaaaa = a0061a0061aaaa();
            }
            return string;
        }

        public int getType() {
            int i = this.w00770077www0077;
            int i2 = a0061aaaaaa;
            if (((a00610061aaaaa + i2) * i2) % aaa0061aaaa != aa0061aaaaa) {
                a0061aaaaaa = a0061a0061aaaa();
                aa0061aaaaa = a0061a0061aaaa();
            }
            return i;
        }
    }

    static {
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741382));
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716835));
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821865);
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        u00750075uuu0075 = uuxuuuu.pp0070p0070ppp("\u0016`\u000e1\nqh`\u0007He2u6\b\u00136\u001e\u0003\u0001$ }X?Q", cR0072rrr00720072, cR007200720072r00720072, cRrrr007200720072);
    }

    public BehavioButtonTouchListener(@NonNull Context context) throws Exception {
        LogBridge.d(uuxuuuu.pppp0070ppp("%GME]OX*`^a[]B`eVZA]jj^f`l", (char) (yllylll.r007200720072r00720072() ^ (-1146716824)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))), uuxuuuu.pp0070p0070ppp("+UE<.jZ\nDW\r\t\u0001u0\u0015\u001d\u001f\u0019", (char) (yyyllll.rrrr007200720072() ^ 383821836), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))));
        this.uu0075uu00750075 = new odooood();
        this.uuu00750075u0075 = new LinkedList<>();
        this.u0075u00750075u0075 = new LinkedList<>();
        this.uu007500750075u0075 = context.getClass().getSimpleName();
        this.uu0075u0075u0075 = new HashMap<>();
        this.u00750075u0075u0075 = new HashMap<>();
        this.uuu0075u00750075 = new yyyyyyl();
        this.u0075u0075u00750075 = new yyyyyyl();
        this.uu00750075u00750075 = new yyyyyyl();
        this.u007500750075u00750075 = new yyyyyyl();
        this.uuuu007500750075 = new yyyyyyl();
        this.u0075uu007500750075 = new yyyyyyl();
        this.uu0075u007500750075 = new yyyyyyl();
        this.u00750075u007500750075 = new yyyyyyl();
        this.uuu0075007500750075 = new yyyyyyl();
        this.u0075u0075007500750075 = new yyyyyyl();
        this.uu00750075007500750075 = new yyyyyyl();
        this.w0077wwwww = new yyyyyyl();
        this.ww0077wwww = new yyyyyyl();
        this.w00770077wwww = new yyyyyyl();
        this.www0077www = new yyyyyyl();
        this.w0077w0077www = new yyyyyyl();
        this.ww00770077www = new yyyyyyl();
        this.w007700770077www = new yyyyyyl();
        this.wwww0077ww = new yyyyyyl();
        this.w0077ww0077ww = new yyyyyyl();
        this.u00750075uu00750075 = context;
        nnn006Enn006E();
    }

    public static /* synthetic */ Context c00630063c006300630063(BehavioButtonTouchListener behavioButtonTouchListener) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = 74;
            f0066ff00660066f0066 = 92;
        }
        return behavioButtonTouchListener.u00750075uu00750075;
    }

    public static /* synthetic */ boolean cc00630063006300630063(BehavioButtonTouchListener behavioButtonTouchListener) {
        boolean z = behavioButtonTouchListener.uuuu0075u0075;
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = 63;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        return z;
    }

    public static /* synthetic */ String cc0063c006300630063(BehavioButtonTouchListener behavioButtonTouchListener, String str) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % ff0066f00660066f0066() != 0) {
            fff0066f0066f0066 = 91;
            f0066ff00660066f0066 = 16;
        }
        behavioButtonTouchListener.www00770077ww = str;
        return str;
    }

    public static /* synthetic */ Queue ccc0063006300630063(BehavioButtonTouchListener behavioButtonTouchListener) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % ff0066f00660066f0066() != 0) {
            fff0066f0066f0066 = 91;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        return behavioButtonTouchListener.w0077ww00770077w;
    }

    public static int f00660066f00660066f0066() {
        return 1;
    }

    public static int f0066f0066f0066f0066() {
        return 0;
    }

    public static int ff0066f00660066f0066() {
        return 2;
    }

    public static int ffff00660066f0066() {
        return 32;
    }

    private int n006E006E006E006E006En() {
        TextView textView;
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        if (!this.uuu00750075u0075.isEmpty() && (textView = this.uuuuu00750075) != null) {
            return textView.getId();
        }
        int i2 = this.u0075uuu00750075;
        if (i2 != -1) {
            return i2;
        }
        return -1;
    }

    private void n006E006E006E006Enn(String str) {
        TextView textView;
        if (this.uuu00750075u0075.isEmpty() || (textView = this.uuuuu00750075) == null) {
            return;
        }
        textView.append(str);
        TextView textView2 = this.uuuuu00750075;
        if (textView2 instanceof EditText) {
            int i = fff0066f0066f0066;
            if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
                fff0066f0066f0066 = 76;
                f0066ff00660066f0066 = ffff00660066f0066();
            }
            ((EditText) textView2).setSelection(this.uuuuu00750075.getText().length());
        }
    }

    private float n006E006E006Enn006E(float f) {
        return f / TypedValue.applyDimension(5, 1.0f, this.u00750075uu00750075.getResources().getDisplayMetrics());
    }

    private void n006E006En006En006E(View view, int i, int i2) {
        if (view instanceof Button) {
            this.uu0075u0075u0075.put(view, new ooooddo(i, i2));
            view.setOnTouchListener(this);
            return;
        }
        LogBridge.w(uuxuuuu.pppp0070ppp("\t+-%9+0\u0002421+)\u000e(-\u001a\u001e\u0001\u001d&&\u0016\u001e\u0014 ", (char) (yllylll.r007200720072r00720072() ^ (-1146716715)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))), uuxuuuu.pppp0070ppp("\u0018++4_(1\\**Yz-+*$\"R\u001b\u001f##\u000f\u001b\u000f\u0010IeeF\u001d\nC\u000b\u0003\u0017\u0005>\u0012\f;\u0007\t\b\u00036{\u0004\u00062\u0005\u007f|s\u0002ttxp(~k%gdp!urc", (char) (yylylll.r0072r0072r00720072() ^ (-1349847185)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))));
        View viewNnn006En006E006E = nnn006En006E006E(view);
        if (viewNnn006En006E006E == null) {
            LogBridge.w(uuxuuuu.pppp0070ppp(":^b\\rfmAuuvrrYu|kqVt\u007f\u0002s}u\u0004", (char) (yllylll.r007200720072r00720072() ^ (-1146716840)), (char) (yyyllll.rrrr007200720072() ^ 383821866)), uuxuuuu.pp0070p0070ppp("moujlrl&|{np\u0001x-t~\u0006\u007fv?4\r{7y\f\u007f;\u0004\r\b\u000e\bA\u0017\u0013D\u001b\u001a\rH\u001e\u0013\u0011L\u0014\u0018\"$&R \u001a\u0017\u001d", (char) (yyyllll.rrrr007200720072() ^ 383822008), (char) (yylylll.r0072r0072r00720072() ^ (-1349847144)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))));
            viewNnn006En006E006E = n006E006Enn006E006E(view);
        }
        LogBridge.d(uuxuuuu.pp0070p0070ppp("0RTL`RW)[YXRP5OTAE(DMM=E;G", (char) (yyyllll.rrrr007200720072() ^ 383822014), (char) (yyyllll.rrrr007200720072() ^ 383822033), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), uuxuuuu.pppp0070ppp("^hoi`\u001d", (char) (yylylll.r0072r0072r00720072() ^ (-1349847261)), (char) (383821866 ^ yyyllll.rrrr007200720072())) + viewNnn006En006E006E);
        if (viewNnn006En006E006E != null) {
            this.uu0075u0075u0075.put(viewNnn006En006E006E, new ooooddo(1, i2));
            String strPppp0070ppp = uuxuuuu.pppp0070ppp("%IIC]QT(``]Y]D\\cV\\=[jlZd`n", (char) (yllylll.r007200720072r00720072() ^ (-1146716780)), (char) (yyyllll.rrrr007200720072() ^ 383821858));
            StringBuilder sb = new StringBuilder();
            sb.append(uuxuuuu.pppp0070ppp("+6*0-:385`2$%&//\u001f+!%\u001dT#\u0019Q", (char) (yyyllll.rrrr007200720072() ^ 383821982), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))));
            sb.append(viewNnn006En006E006E.toString());
            int iRrrr007200720072 = yyyllll.rrrr007200720072();
            int i3 = fff0066f0066f0066;
            if (((ff00660066f0066f0066 + i3) * i3) % f006600660066f0066f0066 != f0066ff00660066f0066) {
                fff0066f0066f0066 = 45;
                f0066ff00660066f0066 = ffff00660066f0066();
            }
            sb.append(uuxuuuu.pppp0070ppp("X\u001e&(T", (char) (iRrrr007200720072 ^ 383822025), (char) (yyyllll.rrrr007200720072() ^ 383821867)));
            sb.append((char) i2);
            LogBridge.w(strPppp0070ppp, sb.toString());
            viewNnn006En006E006E.setOnTouchListener(this);
        }
    }

    public static /* synthetic */ Queue n006E006En006Enn(BehavioButtonTouchListener behavioButtonTouchListener) {
        Queue<float[]> queue = behavioButtonTouchListener.wwww00770077w;
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = 10;
            f0066ff00660066f0066 = 57;
        }
        return queue;
    }

    private View n006E006Enn006E006E(View view) {
        if (!(view instanceof ViewGroup)) {
            return view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        return viewGroup.getChildCount() > 0 ? n006E006Enn006E006E(viewGroup.getChildAt(0)) : view;
    }

    private boolean n006E006Enn006En() {
        return false;
    }

    public static /* synthetic */ boolean n006E006Ennnn(BehavioButtonTouchListener behavioButtonTouchListener, boolean z) {
        behavioButtonTouchListener.w0077w00770077ww = z;
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % ff0066f00660066f0066() != f0066ff00660066f0066) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        return z;
    }

    private void n006En006E006E006En() {
        TextView textView;
        if (this.uuu00750075u0075.isEmpty() || (textView = this.uuuuu00750075) == null || textView.getText().length() <= 0) {
            return;
        }
        this.uuuuu00750075.setText(this.uuuuu00750075.getText().toString().substring(0, r0.length() - 1));
        TextView textView2 = this.uuuuu00750075;
        int iFfff00660066f0066 = ffff00660066f0066();
        if (((ff00660066f0066f0066 + iFfff00660066f0066) * iFfff00660066f0066) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = 3;
        }
        if (textView2 instanceof EditText) {
            TextView textView3 = this.uuuuu00750075;
            ((EditText) textView3).setSelection(textView3.getText().length());
        }
    }

    public static /* synthetic */ float[] n006En006E006Enn(BehavioButtonTouchListener behavioButtonTouchListener, float[] fArr) {
        int i = 2;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                fff0066f0066f0066 = ffff00660066f0066();
                behavioButtonTouchListener.w007700770077w0077w = fArr;
                return fArr;
            }
        }
    }

    private void n006En006En006En() {
        this.ww0077wwww = new yyyyyyl();
        this.www0077www = new yyyyyyl();
        this.uuu0075u00750075 = new yyyyyyl();
        this.uu00750075u00750075 = new yyyyyyl();
        this.uuuu007500750075 = new yyyyyyl();
        this.uu0075u007500750075 = new yyyyyyl();
        this.uuu0075007500750075 = new yyyyyyl();
        this.uu00750075007500750075 = new yyyyyyl();
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % ff0066f00660066f0066() != 0) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        this.ww00770077www = new yyyyyyl();
        this.w007700770077www = new yyyyyyl();
    }

    private void n006Enn006E006En() {
        TextView textView;
        if (this.uuu00750075u0075.isEmpty() || (textView = this.uuuuu00750075) == null || textView.getText().length() <= 0) {
            return;
        }
        this.uuuuu00750075.setText("");
        TextView textView2 = this.uuuuu00750075;
        if (textView2 instanceof EditText) {
            ((EditText) textView2).setSelection(0);
            int i = fff0066f0066f0066;
            if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
                fff0066f0066f0066 = 3;
                f0066ff00660066f0066 = ffff00660066f0066();
            }
        }
    }

    private void n006Enn006En006E(MotionEvent motionEvent) {
        this.ww0077wwww.kkk006B006Bkk(motionEvent.getPressure(), l8.b.b);
        yyyyyyl yyyyyylVar = this.w00770077wwww;
        double pressure = motionEvent.getPressure();
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = 58;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        yyyyyylVar.kkk006B006Bkk(pressure, l8.b.b);
        this.www0077www.kkk006B006Bkk(motionEvent.getSize(), l8.b.b);
        this.w0077w0077www.kkk006B006Bkk(motionEvent.getSize(), l8.b.b);
        this.ww00770077www.kkk006B006Bkk(n006E006E006Enn006E(motionEvent.getTouchMajor()), l8.b.b);
        this.wwww0077ww.kkk006B006Bkk(n006E006E006Enn006E(motionEvent.getTouchMajor()), l8.b.b);
        this.w007700770077www.kkk006B006Bkk(n006E006E006Enn006E(motionEvent.getTouchMinor()), l8.b.b);
        this.w0077ww0077ww.kkk006B006Bkk(n006E006E006Enn006E(motionEvent.getTouchMinor()), l8.b.b);
    }

    public static /* synthetic */ float[] n006Enn006Enn(BehavioButtonTouchListener behavioButtonTouchListener) {
        try {
            throw null;
        } catch (Exception unused) {
            fff0066f0066f0066 = ffff00660066f0066();
            return behavioButtonTouchListener.w0077w0077w0077w;
        }
    }

    public static /* synthetic */ long n006Ennnnn(BehavioButtonTouchListener behavioButtonTouchListener) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = 58;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        return behavioButtonTouchListener.ww0077w00770077w;
    }

    private void nn006E006E006Enn() {
    }

    private void nn006E006En006En() {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = 35;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        this.w00770077wwww = new yyyyyyl();
        this.w0077w0077www = new yyyyyyl();
        this.u0075u0075u00750075 = new yyyyyyl();
        this.u007500750075u00750075 = new yyyyyyl();
        this.u0075uu007500750075 = new yyyyyyl();
        this.u00750075u007500750075 = new yyyyyyl();
        this.u0075u0075007500750075 = new yyyyyyl();
        this.w0077wwwww = new yyyyyyl();
        this.wwww0077ww = new yyyyyyl();
        this.w0077ww0077ww = new yyyyyyl();
    }

    private boolean nn006E006Enn006E(@NonNull View view, @NonNull MotionEvent motionEvent, float f, float f2) throws Exception {
        String strPp0070p0070ppp;
        int keyId;
        if ((ffff00660066f0066() * (ffff00660066f0066() + ff00660066f0066f0066)) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = 2;
        }
        if (this.uuuuu00750075 != null && this.uuu0075uu0075 != null) {
            if (uuxuuuu.pp0070p0070ppp("s", (char) (ylyylll.r0072rrr00720072() ^ (-1691741400)), (char) (yyyllll.rrrr007200720072() ^ 383821855), (char) (yyyllll.rrrr007200720072() ^ 383821866)).equals(this.uu0075uu00750075.getTargetType(this.uuuuu00750075.getId()))) {
                this.uuu0075uu0075.rrr0072r0072r();
            } else {
                this.uuu0075uu0075.r0072r0072r0072r();
            }
        }
        ooooddo ooooddoVar = this.uu0075u0075u0075.get(view);
        int type = ooooddoVar.getType();
        if (type == 1) {
            keyId = ooooddoVar.getKeyId();
            strPp0070p0070ppp = ooooddoVar.getLabel();
        } else if (type == 2) {
            strPp0070p0070ppp = uuxuuuu.pppp0070ppp("99?", (char) (yyyllll.rrrr007200720072() ^ 383822079), (char) (yllylll.r007200720072r00720072() ^ (-1146716791)));
            keyId = 127;
        } else if (type == 3) {
            strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("/Q\u0003\u0018[", (char) (yylylll.r0072r0072r00720072() ^ (-1349847231)), (char) (yllylll.r007200720072r00720072() ^ (-1146716768)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335)));
            keyId = -5;
        } else {
            strPp0070p0070ppp = "";
            keyId = -1;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            n006Enn006En006E(motionEvent);
            nn006Enn006En(type, strPp0070p0070ppp, keyId, 0, f, f2, view);
            nn006E006En006En();
            return false;
        }
        String str = strPp0070p0070ppp;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return false;
            }
            nnnn006En006E(motionEvent);
            return false;
        }
        n006Enn006En006E(motionEvent);
        nn006Enn006En(type, str, keyId, 1, f, f2, view);
        n006En006En006En();
        if (!this.uu00750075uu0075) {
            return false;
        }
        view.performClick();
        return false;
    }

    public static /* synthetic */ TextView nn006E006Ennn(BehavioButtonTouchListener behavioButtonTouchListener) {
        TextView textView = behavioButtonTouchListener.uuuuu00750075;
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = 75;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        return textView;
    }

    public static /* synthetic */ float[] nn006En006Enn(BehavioButtonTouchListener behavioButtonTouchListener, float[] fArr) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = 87;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        behavioButtonTouchListener.w0077w0077w0077w = fArr;
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void nn006Enn006En(int r27, java.lang.String r28, int r29, int r30, double r31, double r33, android.view.View r35) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.android.BehavioButtonTouchListener.nn006Enn006En(int, java.lang.String, int, int, double, double, android.view.View):void");
    }

    public static /* synthetic */ long nn006Ennnn(BehavioButtonTouchListener behavioButtonTouchListener, long j) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = 9;
            f0066ff00660066f0066 = 39;
        }
        behavioButtonTouchListener.ww0077w00770077w = j;
        return j;
    }

    public static /* synthetic */ float[] nnn006E006Enn(BehavioButtonTouchListener behavioButtonTouchListener) {
        int i = 5;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                fff0066f0066f0066 = 86;
                return behavioButtonTouchListener.w007700770077w0077w;
            }
        }
    }

    private View nnn006En006E006E(View view) {
        if ((view instanceof TextView) || (view instanceof ImageView)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = 78;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View viewNnn006En006E006E = nnn006En006E006E(viewGroup.getChildAt(i2));
            if (viewNnn006En006E006E != null) {
                return viewNnn006En006E006E;
            }
        }
        return null;
    }

    private void nnn006Enn006E() throws Exception {
        this.w0077www0077w = (SensorManager) this.u00750075uu00750075.getSystemService(uuxuuuu.pppp0070ppp("&\u0017\u001f#\u001e ", (char) (ylyylll.r0072rrr00720072() ^ (-1691741404)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))));
        nnnnn006E006E();
    }

    public static /* synthetic */ Boolean nnn006Ennn(BehavioButtonTouchListener behavioButtonTouchListener, Boolean bool) {
        if ((ffff00660066f0066() * (ffff00660066f0066() + ff00660066f0066f0066)) % f006600660066f0066f0066 != f0066f0066f0066f0066()) {
            fff0066f0066f0066 = 74;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        behavioButtonTouchListener.ww007700770077ww = bool;
        return bool;
    }

    private void nnnn006En006E(MotionEvent motionEvent) {
        for (int i = 0; i < motionEvent.getHistorySize(); i++) {
            float historicalPressure = motionEvent.getHistoricalPressure(i);
            float historicalSize = motionEvent.getHistoricalSize(i);
            float historicalTouchMajor = motionEvent.getHistoricalTouchMajor(i);
            float historicalTouchMinor = motionEvent.getHistoricalTouchMinor(i);
            double d = historicalPressure;
            this.ww0077wwww.kkk006B006Bkk(d, l8.b.b);
            this.w00770077wwww.kkk006B006Bkk(d, l8.b.b);
            double d2 = historicalSize;
            this.www0077www.kkk006B006Bkk(d2, l8.b.b);
            this.w0077w0077www.kkk006B006Bkk(d2, l8.b.b);
            double d3 = historicalTouchMajor;
            this.ww00770077www.kkk006B006Bkk(d3, l8.b.b);
            this.wwww0077ww.kkk006B006Bkk(d3, l8.b.b);
            double d4 = historicalTouchMinor;
            this.w007700770077www.kkk006B006Bkk(d4, l8.b.b);
            this.w0077ww0077ww.kkk006B006Bkk(d4, l8.b.b);
        }
        this.ww0077wwww.kkk006B006Bkk(motionEvent.getPressure(), l8.b.b);
        this.w00770077wwww.kkk006B006Bkk(motionEvent.getPressure(), l8.b.b);
        this.www0077www.kkk006B006Bkk(motionEvent.getSize(), l8.b.b);
        this.w0077w0077www.kkk006B006Bkk(motionEvent.getSize(), l8.b.b);
        this.ww00770077www.kkk006B006Bkk(n006E006E006Enn006E(motionEvent.getTouchMajor()), l8.b.b);
        this.wwww0077ww.kkk006B006Bkk(n006E006E006Enn006E(motionEvent.getTouchMajor()), l8.b.b);
        this.w007700770077www.kkk006B006Bkk(n006E006E006Enn006E(motionEvent.getTouchMinor()), l8.b.b);
        this.w0077ww0077ww.kkk006B006Bkk(n006E006E006Enn006E(motionEvent.getTouchMinor()), l8.b.b);
    }

    public static /* synthetic */ float[] nnnn006Enn(BehavioButtonTouchListener behavioButtonTouchListener, float[] fArr) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % ff0066f00660066f0066() != f0066ff00660066f0066) {
            fff0066f0066f0066 = 54;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        behavioButtonTouchListener.ww00770077w0077w = fArr;
        return fArr;
    }

    private JSONArray nnnnnn006E() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(uuxuuuu.pppp0070ppp("z", (char) (yyyllll.rrrr007200720072() ^ 383821974), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))));
        JSONArray jSONArray2 = new JSONArray();
        Iterator<yylyyly<String, TextView>> it = this.uuu00750075u0075.iterator();
        while (it.hasNext()) {
            yylyyly<String, TextView> next = it.next();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(next.b0062bb0062bb(), next.bb0062b0062bb().length());
                jSONArray2.put(jSONObject);
                int i = fff0066f0066f0066;
                if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
                    fff0066f0066f0066 = 81;
                    f0066ff00660066f0066 = 7;
                }
            } catch (JSONException unused) {
            }
        }
        Iterator<yylyyly<String, Integer>> it2 = this.u0075u00750075u0075.iterator();
        while (it2.hasNext()) {
            yylyyly<String, Integer> next2 = it2.next();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(next2.b0062bb0062bb(), next2.bb0062b0062bb());
                jSONArray2.put(jSONObject2);
            } catch (JSONException unused2) {
            }
        }
        jSONArray.put(jSONArray2);
        String str = this.u0075007500750075u0075;
        jSONArray.put((str == null || str.isEmpty()) ? this.uu007500750075u0075 : this.u0075007500750075u0075);
        return jSONArray;
    }

    public void n006E006E006E006En006E(@NonNull TextView textView, @NonNull String str, @NonNull String str2, boolean z) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp(":\\^Vj\\a3ecb\\Z?Y^KO2NWWGOEQ", (char) (yllylll.r007200720072r00720072() ^ (-1146716799)), (char) (yyyllll.rrrr007200720072() ^ 383821868));
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pppp0070ppp("WKNQ\\^P^3WT\\U\u0012", (char) (yllylll.r007200720072r00720072() ^ (-1146716691)), (char) (yyyllll.rrrr007200720072() ^ 383821871)));
        sb.append(textView);
        sb.append(uuxuuuu.pp0070p0070ppp("n/@k", (char) (yllylll.r007200720072r00720072() ^ (-1146716734)), (char) (yllylll.r007200720072r00720072() ^ (-1146716912)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))));
        sb.append(str);
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847256));
        int iR007200720072r00720072 = (-1146716799) ^ yllylll.r007200720072r00720072();
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = 93;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        sb.append(uuxuuuu.pppp0070ppp("W!\u001b.\u0002,!43z", cR0072r0072r00720072, (char) iR007200720072r00720072));
        sb.append(textView.hasFocus());
        LogBridge.d(strPppp0070ppp, sb.toString());
        if (z && (textView instanceof EditText)) {
            textView.setInputType(0);
        }
        this.uu0075uu00750075.registerTarget(str, str2, textView.getId());
        this.uuu00750075u0075.add(new yylyyly<>(str, textView));
        this.u00750075u0075u0075.put(str, textView);
        if (textView.hasFocus()) {
            nn006E006En006E006E(textView);
        }
        final View.OnFocusChangeListener onFocusChangeListener = textView.getOnFocusChangeListener();
        textView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.behaviosec.rl.android.BehavioButtonTouchListener.4
            public static int f006600660066f006600660066 = 2;
            public static int f0066f0066f006600660066 = 84;
            public static int ff00660066f006600660066 = 1;

            public static int ffff0066006600660066() {
                return 15;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z2) {
                String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("l$%8\u0019-M:yT,\u0007s\u0018mW\u001fRB\u000f\u0014,:|#h", (char) (yllylll.r007200720072r00720072() ^ (-1146716832)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847247)), (char) (yyyllll.rrrr007200720072() ^ 383821871));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uuxuuuu.pppp0070ppp("31\b0#41\u007f$\u001c( \u001dV-\u001e(\u001bQ\u0007\u0019\u0014%L", (char) (yylylll.r0072r0072r00720072() ^ (-1349847185)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))));
                sb2.append(view);
                int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
                int i2 = f0066f0066f006600660066;
                if (((ff00660066f006600660066 + i2) * i2) % f006600660066f006600660066 != 0) {
                    f0066f0066f006600660066 = 10;
                    ff00660066f006600660066 = ffff0066006600660066();
                }
                sb2.append(uuxuuuu.pp0070p0070ppp(lllqqql.c0063ccc0063c, (char) (iR0072r0072r00720072 ^ (-1349847216)), (char) (yyyllll.rrrr007200720072() ^ 383821946), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))));
                sb2.append(z2);
                LogBridge.d(strPp0070p0070ppp, sb2.toString());
                View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                if (onFocusChangeListener2 != null) {
                    onFocusChangeListener2.onFocusChange(view, z2);
                }
                if (BehavioButtonTouchListener.this.u007500750075uu0075 && z2) {
                    BehavioButtonTouchListener.this.nn006E006En006E006E((TextView) view);
                } else if (BehavioButtonTouchListener.nn006E006Ennn(BehavioButtonTouchListener.this) == view) {
                    BehavioButtonTouchListener.this.nn006E006En006E006E(null);
                }
            }
        });
    }

    public void n006E006E006En006E006E(@NonNull String str) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = 30;
        }
        this.u0075007500750075u0075 = str;
    }

    public void n006E006E006En006En() {
        this.uu0075uu00750075.clearData();
        if (n006E006Enn006En()) {
            this.ww0077w0077ww.d00640064ddd0064();
        }
        this.uuu00750075u0075 = new LinkedList<>();
        this.uu0075u0075u0075.clear();
        HashMap<String, TextView> map = this.u00750075u0075u0075;
        int iFfff00660066f0066 = ffff00660066f0066();
        if (((ff00660066f0066f0066 + iFfff00660066f0066) * iFfff00660066f0066) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = 55;
        }
        map.clear();
    }

    public void n006E006En006E006E006E() {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = 18;
        }
        this.uu00750075uu0075 = true;
    }

    public void n006E006En006E006En(boolean z) {
        this.w0077007700770077ww = false;
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                fff0066f0066f0066 = ffff00660066f0066();
                try {
                    throw null;
                } catch (Exception unused2) {
                    fff0066f0066f0066 = 67;
                    return;
                }
            }
        }
    }

    @NonNull
    public JSONArray n006E006Ennn006E() throws JSONException {
        nn006E006E006Enn();
        JSONArray jSONArrayD0064d0064dd0064 = n006E006Enn006En() ? this.ww0077w0077ww.d0064d0064dd0064() : null;
        odooood odoooodVar = this.uu0075uu00750075;
        JSONArray jSONArrayNnnnnn006E = nnnnnn006E();
        if ((ffff00660066f0066() * (f00660066f00660066f0066() + ffff00660066f0066())) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = 84;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        return odoooodVar.getJSONTiming(jSONArrayNnnnnn006E, jSONArrayD0064d0064dd0064, null);
    }

    public void n006En006E006E006E006E(boolean z) {
        this.uu0075uu00750075.useCompactSensorFormat(z);
    }

    public void n006En006E006En006E(@NonNull View view) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        n006E006En006En006E(view, 1, 127);
    }

    public void n006En006En006E006E(ylyylyl ylyylylVar) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = 23;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        this.uuu0075uu0075 = ylyylylVar;
    }

    public boolean n006En006Enn006E(@NonNull View view) {
        boolean zContainsKey = this.uu0075u0075u0075.containsKey(view);
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = 50;
            f0066ff00660066f0066 = 13;
        }
        return zContainsKey;
    }

    public void n006Enn006E006E006E(int i) {
        this.u0075uuu00750075 = i;
        if (this.uuu0075uu0075 != null) {
            if (uuxuuuu.pppp0070ppp("\u0016\u001c", (char) (yylylll.r0072r0072r00720072() ^ (-1349847075)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))).equals(this.uu0075uu00750075.getTargetType(this.u0075uuu00750075))) {
                this.uuu0075uu0075.r0072r0072r0072r();
            } else {
                this.uuu0075uu0075.rrr0072r0072r();
            }
        }
        LogBridge.d(uuxuuuu.pppp0070ppp("7\u0002vS@\u0001\u0017!\u007f~|Y\bg\u001b~\"=H\u0002G\u007f\u0003\u0010\"G", (char) (yllylll.r007200720072r00720072() ^ (-1146716724)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), uuxuuuu.pp0070p0070ppp("]\u0001q{immqi!t`pdao4\u0019", (char) (yllylll.r007200720072r00720072() ^ (-1146716686)), (char) (yllylll.r007200720072r00720072() ^ (-1146716916)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + i);
    }

    public void n006Ennn006E006E(int i, @NonNull String str, @NonNull String str2) {
        this.u0075uuu00750075 = i;
        this.uu0075uu00750075.registerTarget(str, str2, i);
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp(":\\^Vj\\a3ecb\\Z?Y^KO2NWWGOEQ", (char) (yyyllll.rrrr007200720072() ^ 383822048), (char) (yylylll.r0072r0072r00720072() ^ (-1349847114)), (char) (yyyllll.rrrr007200720072() ^ 383821870));
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pppp0070ppp("Thkny{m{*_m\u007fut\u0005K2", (char) (ylyylll.r0072rrr00720072() ^ (-1691741208)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))));
        int iFfff00660066f0066 = ffff00660066f0066();
        if (((f00660066f00660066f0066() + iFfff00660066f0066) * iFfff00660066f0066) % ff0066f00660066f0066() != 0) {
            fff0066f0066f0066 = 83;
            f0066ff00660066f0066 = 63;
        }
        sb.append(str);
        sb.append(uuxuuuu.pppp0070ppp("$CCv#\u0007?5\n\\-v", (char) (yyyllll.rrrr007200720072() ^ 383822039), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))));
        sb.append(str2);
        LogBridge.d(strPp0070p0070ppp, sb.toString());
    }

    public void n006Ennn006En(@NonNull String str, @NonNull String str2) throws JSONException, IllegalArgumentException {
        if (!str.equals(uuxuuuu.pppp0070ppp("'(\u001c\u001c\"", (char) (ylyylll.r0072rrr00720072() ^ (-1691741393)), (char) (yyyllll.rrrr007200720072() ^ 383821868))) && !str.equals(uuxuuuu.pppp0070ppp("D2>>386", (char) (yyyllll.rrrr007200720072() ^ 383821969), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056)))) && !str.equals(uuxuuuu.pppp0070ppp("A@3A187AH", (char) (yylylll.r0072r0072r00720072() ^ (-1349847145)), (char) (yyyllll.rrrr007200720072() ^ 383821859))) && !str.equals(uuxuuuu.pppp0070ppp("t*Vs\u001bb)2S", (char) (yylylll.r0072r0072r00720072() ^ (-1349847227)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))))) {
            char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847243));
            int iR0072r0072r00720072 = yylylll.r0072r0072r00720072() ^ (-1349847052);
            if ((ffff00660066f0066() * (ffff00660066f0066() + ff00660066f0066f0066)) % f006600660066f0066f0066 != f0066ff00660066f0066) {
                fff0066f0066f0066 = 98;
                f0066ff00660066f0066 = ffff00660066f0066();
            }
            if (!str.equals(uuxuuuu.pppp0070ppp("a\u000eo\\", cR0072r0072r00720072, (char) iR0072r0072r00720072))) {
                try {
                    this.uu0075uu00750075.f006600660066f00660066.put(str, str2);
                    return;
                } catch (JSONException e) {
                    LogBridge.e(uuxuuuu.pp0070p0070ppp("\u001d&\u000ekx\u0011u&I`\u0014js\u001c\u0007$\u000ff*zs\bbGR\u001e", (char) (yllylll.r007200720072r00720072() ^ (-1146716840)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847243)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))), e.getMessage(), e);
                    return;
                }
            }
        }
        LogBridge.w(uuxuuuu.pppp0070ppp("\u0004t;\u0017}EaVL*\"\u0005R<E4vo\u000eE\u0012M\u0016%\u000fy", (char) (yllylll.r007200720072r00720072() ^ (-1146716778)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), uuxuuuu.pp0070p0070ppp("sI&^v%\u007f0~}Z\u0018\u001aZ/_1/\u00047_\u0018j\u0015ei4u\u0005", (char) (ylyylll.r0072rrr00720072() ^ (-1691741380)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847238)), (char) (yyyllll.rrrr007200720072() ^ 383821867)));
    }

    public String n006Ennnn006E(@NonNull TextView textView) {
        String fieldName = this.uu0075uu00750075.getFieldName(textView.getId());
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = 47;
        }
        return fieldName;
    }

    public void nn006E006E006E006En() {
        if (this.u007500750075uu0075) {
            LogBridge.w(uuxuuuu.pp0070p0070ppp("m\u001b \tL26\u001a6V.u\u000f}~@-\u001c\bLx\u00105N\u001ex", (char) (ylyylll.r0072rrr00720072() ^ (-1691741374)), (char) (yyyllll.rrrr007200720072() ^ 383822052), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), uuxuuuu.pppp0070ppp("\u001282@:9tJ8J@?O{?W~EWGQXX\u0006P[\tNT_NP[UU", (char) (ylyylll.r0072rrr00720072() ^ (-1691741362)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))));
        }
        this.u007500750075uu0075 = false;
    }

    public void nn006E006E006En006E(@NonNull TextView textView, @NonNull String str, @NonNull String str2) {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = 90;
            f0066ff00660066f0066 = 27;
        }
        n006E006E006E006En006E(textView, str, str2, true);
    }

    public void nn006E006En006E006E(TextView textView) {
        LogBridge.d(uuxuuuu.pppp0070ppp("Moqi\u0006w|NxvuouZty~\u0003e\u0002\u0013\u0013\u0003\u000bx\u0005", (char) (ylyylll.r0072rrr00720072() ^ (-1691741342)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), uuxuuuu.pppp0070ppp("4'7\u0007:89-7>\u001152:3o", (char) (yllylll.r007200720072r00720072() ^ (-1146716759)), (char) (yyyllll.rrrr007200720072() ^ 383821859)) + textView);
        this.uuuuu00750075 = textView;
        ylyylyl ylyylylVar = this.uuu0075uu0075;
        if (ylyylylVar != null) {
            if (textView == null) {
                ylyylylVar.rrr0072r0072r();
                return;
            }
            int iR007200720072r00720072 = yllylll.r007200720072r00720072();
            int i = fff0066f0066f0066;
            if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != f0066f0066f0066f0066()) {
                fff0066f0066f0066 = ffff00660066f0066();
                ff00660066f0066f0066 = 61;
            }
            if (uuxuuuu.pppp0070ppp("O", (char) (iR007200720072r00720072 ^ (-1146716872)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))).equals(this.uu0075uu00750075.getTargetType(this.uuuuu00750075.getId()))) {
                this.uuu0075uu0075.rrr0072r0072r();
            } else {
                this.uuu0075uu0075.r0072r0072r0072r();
            }
        }
    }

    public void nn006En006E006E006E() {
        this.uu00750075uu0075 = false;
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = 18;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
    }

    public void nn006En006E006En() {
        this.uu0075uu00750075.clearTimingData();
        if (n006E006Enn006En()) {
            this.ww0077w0077ww.d00640064ddd0064();
            int i = fff0066f0066f0066;
            if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
                fff0066f0066f0066 = 83;
                f0066ff00660066f0066 = 5;
            }
        }
        this.wwwww0077w.set(yyyylly.yylylly.bbbb006200620062(this.u00750075uu00750075));
        nn006E006En006En();
        n006En006En006En();
        this.uu0075uu00750075.clearDataIntegrity();
    }

    public void nn006En006En006E(@NonNull View view, int i) {
        if (i < 0 || i > 255) {
            LogBridge.w(uuxuuuu.pppp0070ppp(")KMEYKP\"TRQKI.HM:>!=FF6>4@", (char) (yyyllll.rrrr007200720072() ^ 383822048), (char) (yyyllll.rrrr007200720072() ^ 383821867)), uuxuuuu.pppp0070ppp("p\u0010\u0018\u001a\u001e\u0016\u001c\u0016O\u001a )\u0015!\u001f\u001bW\u001a-\u001e%&\u0014 ,6'b", (char) (yllylll.r007200720072r00720072() ^ (-1146716923)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))) + i);
            return;
        }
        int i2 = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i2) * i2) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = 88;
        }
        n006E006En006En006E(view, 1, i);
    }

    public void nn006Enn006E006E(@NonNull String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            if ((ffff00660066f0066() * (ffff00660066f0066() + ff00660066f0066f0066)) % f006600660066f0066f0066 != f0066ff00660066f0066) {
                fff0066f0066f0066 = ffff00660066f0066();
                f0066ff00660066f0066 = 61;
            }
            if (i >= length) {
                return;
            }
            String str = strArr[i];
            if (ylyllly.k006B006Bkkkk(str)) {
                this.uu0075uu00750075.ignoreFeatureSet.add(str);
            } else {
                LogBridge.w(uuxuuuu.pp0070p0070ppp("S/|HP\u001cpNS:\u000f;[y\u001aR\u0015\u001d&H\f6:j0@", (char) (yllylll.r007200720072r00720072() ^ (-1146716865)), (char) (yyyllll.rrrr007200720072() ^ 383821863), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))), uuxuuuu.pppp0070ppp("\u0015288:04,c,07!+'![!\u001f\u001a,,(\u001aS!\u0013\u001e\u0015", (char) (yllylll.r007200720072r00720072() ^ (-1146716912)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))));
            }
            i++;
        }
    }

    @NonNull
    public JSONArray nn006Ennn006E() throws JSONException {
        JSONArray jSONArrayN006E006Ennn006E = n006E006Ennn006E();
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741399));
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = 39;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        LogBridge.d(uuxuuuu.pppp0070ppp("\u0003\u0001\u0014*u\f{,\u0011AE\\\u0011f\u00189j_\t\fW\"7:Bi", cR0072rrr00720072, (char) (yyyllll.rrrr007200720072() ^ 383821864)), uuxuuuu.pp0070p0070ppp("gA0g\\<\u0014tM\u0011\u0012k>\u001fs\u0010pY\u001f", (char) (yylylll.r0072r0072r00720072() ^ (-1349847284)), (char) (yyyllll.rrrr007200720072() ^ 383821942), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))) + jSONArrayN006E006Ennn006E);
        return jSONArrayN006E006Ennn006E;
    }

    public void nnn006E006E006E006E() throws Exception {
        this.w0077www0077w.unregisterListener(this.ww0077ww0077w);
        if (n006E006Enn006En()) {
            this.ww0077w0077ww.dd0064d0064d0064();
            int i = fff0066f0066f0066;
            if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
                fff0066f0066f0066 = ffff00660066f0066();
                f0066ff00660066f0066 = 30;
            }
        }
    }

    public void nnn006E006E006En(boolean z) {
        int iFfff00660066f0066 = ffff00660066f0066();
        if (((ff00660066f0066f0066 + iFfff00660066f0066) * iFfff00660066f0066) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = 47;
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        this.w00770077w0077ww = false;
    }

    public void nnn006E006En006E(@NonNull View view) {
        int i = 4;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                fff0066f0066f0066 = 11;
                n006E006En006En006E(view, 1, 3);
                return;
            }
        }
    }

    public void nnn006En006En() {
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        this.uu0075uu00750075.y0079y00790079yy();
    }

    public void nnnn006E006E006E(@NonNull String str, int i) {
        LinkedList<yylyyly<String, Integer>> linkedList = this.u0075u00750075u0075;
        yylyyly<String, Integer> yylyylyVar = new yylyyly<>(str, Integer.valueOf(i));
        int i2 = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i2) * i2) % f006600660066f0066f0066 != f0066ff00660066f0066) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = ffff00660066f0066();
        }
        linkedList.add(yylyylyVar);
    }

    public void nnnn006E006En() {
        LinkedList<yylyyly<String, Integer>> linkedList = this.u0075u00750075u0075;
        int iFfff00660066f0066 = ffff00660066f0066();
        if (((ff00660066f0066f0066 + iFfff00660066f0066) * iFfff00660066f0066) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = 57;
            f0066ff00660066f0066 = 36;
        }
        linkedList.clear();
    }

    public void nnnnn006E006E() throws Exception {
        boolean zRegisterListener;
        SensorManager sensorManager = this.w0077www0077w;
        if (sensorManager.registerListener(this.ww0077ww0077w, sensorManager.getDefaultSensor(10), 1)) {
            zRegisterListener = false;
        } else {
            SensorManager sensorManager2 = this.w0077www0077w;
            zRegisterListener = sensorManager2.registerListener(this.ww0077ww0077w, sensorManager2.getDefaultSensor(1), 1);
            if (zRegisterListener) {
                this.u0075uu0075u0075 = true;
            } else {
                this.uu0075uu00750075.noAccSensor = true;
            }
        }
        SensorManager sensorManager3 = this.w0077www0077w;
        if (!sensorManager3.registerListener(this.ww0077ww0077w, sensorManager3.getDefaultSensor(4), 1)) {
            SensorManager sensorManager4 = this.w0077www0077w;
            int i = fff0066f0066f0066;
            if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
                fff0066f0066f0066 = ffff00660066f0066();
                f0066ff00660066f0066 = ffff00660066f0066();
            }
            boolean zRegisterListener2 = sensorManager4.registerListener(this.ww0077ww0077w, this.w0077www0077w.getDefaultSensor(2), 1);
            if (!zRegisterListener) {
                SensorManager sensorManager5 = this.w0077www0077w;
                zRegisterListener = sensorManager5.registerListener(this.ww0077ww0077w, sensorManager5.getDefaultSensor(1), 1);
            }
            if (zRegisterListener2 && zRegisterListener) {
                this.uuuu0075u0075 = true;
            } else {
                this.uu0075uu00750075.noGyroSensor = true;
                this.uuuu0075u0075 = false;
            }
        }
        if (n006E006Enn006En()) {
            this.ww0077w0077ww.d0064dd0064d0064();
        }
    }

    public void nnnnn006En(@NonNull String str, double d) throws Exception {
        if (!str.equals(uuxuuuu.pp0070p0070ppp("dK\u0005jF", (char) (ylyylll.r0072rrr00720072() ^ (-1691741344)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847208)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335)))) && !str.equals(uuxuuuu.pppp0070ppp("_MYYNSQ", (char) (yylylll.r0072r0072r00720072() ^ (-1349847240)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791)))) && !str.equals(uuxuuuu.pp0070p0070ppp("\\_h\u0012Kh\u0006\u0013-", (char) (yylylll.r0072r0072r00720072() ^ (-1349847239)), (char) (yyyllll.rrrr007200720072() ^ 383821928), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050)))) && !str.equals(uuxuuuu.pp0070p0070ppp("bipfZl`ec", (char) (yllylll.r007200720072r00720072() ^ (-1146716738)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741347)), (char) (yyyllll.rrrr007200720072() ^ 383821870)))) {
            int i = fff0066f0066f0066;
            if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
                fff0066f0066f0066 = 76;
                f0066ff00660066f0066 = ffff00660066f0066();
            }
            if (!str.equals(uuxuuuu.pp0070p0070ppp("rq5\u0006", (char) (yllylll.r007200720072r00720072() ^ (-1146716809)), (char) (yyyllll.rrrr007200720072() ^ 383821829), (char) (yyyllll.rrrr007200720072() ^ 383821865)))) {
                try {
                    this.uu0075uu00750075.f006600660066f00660066.put(str, d);
                    return;
                } catch (JSONException e) {
                    LogBridge.e(uuxuuuu.pppp0070ppp("Wy{s\by~P\u0003\u0001\u007fyw\\v{hlOkttdlbn", (char) (yylylll.r0072r0072r00720072() ^ (-1349847097)), (char) (yyyllll.rrrr007200720072() ^ 383821867)), e.getMessage(), e);
                    return;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        LogBridge.w(uuxuuuu.pp0070p0070ppp("\u0002&*$:.5\t==>::!=D39\u001e<GI;E=K", (char) (yylylll.r0072r0072r00720072() ^ (-1349847280)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741390)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), uuxuuuu.pppp0070ppp("(EOOMCKCv?GN4>>8n461???1f4*5(", (char) (yyyllll.rrrr007200720072() ^ 383822070), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))));
    }

    public boolean onAmbiguousTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        view.getLocationInWindow(new int[2]);
        float x = motionEvent.getX() - r0[0];
        float y = motionEvent.getY() - r0[1];
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = ffff00660066f0066();
            f0066ff00660066f0066 = 3;
        }
        return nn006E006Enn006E(view, motionEvent, x, y);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        return nn006E006Enn006E(view, motionEvent, motionEvent.getX(), motionEvent.getY());
    }

    public boolean setCurrentTarget(String str) {
        nn006E006E006E006En();
        if (str == null) {
            nn006E006En006E006E(null);
            return true;
        }
        TextView textView = this.u00750075u0075u0075.get(str);
        int i = fff0066f0066f0066;
        if (((ff00660066f0066f0066 + i) * i) % f006600660066f0066f0066 != 0) {
            fff0066f0066f0066 = 97;
            f0066ff00660066f0066 = 88;
        }
        if (textView != null) {
            nn006E006En006E006E(textView);
            return true;
        }
        LogBridge.w(uuxuuuu.pppp0070ppp("\u0002&*$:.5\t==>::!=D39\u001e<GI;E=K", (char) (yllylll.r007200720072r00720072() ^ (-1146716874)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))), uuxuuuu.pppp0070ppp("\u0011\u0004\u0014c\u000f\r\u000e\u0002\u0004\u000bky\u0004yx\t-bp\u0003po\u007f,|o{p!pdq#^", (char) (ylyylll.r0072rrr00720072() ^ (-1691741195)), (char) (yyyllll.rrrr007200720072() ^ 383821870)) + str + uuxuuuu.pppp0070ppp("\u0011[f\u0014jdbfhqi(\u001dakebthh%zom)~l~ts\u0004", (char) (yyyllll.rrrr007200720072() ^ 383821915), (char) (yyyllll.rrrr007200720072() ^ 383821871)));
        nn006E006En006E006E(null);
        return false;
    }
}
