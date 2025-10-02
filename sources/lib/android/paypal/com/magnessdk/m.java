package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class m extends lib.android.paypal.com.magnessdk.network.base.c implements SensorEventListener {
    public static final AtomicInteger l = new AtomicInteger(0);
    public final Sensor d;
    public final SensorManager e;
    public JSONObject f;
    public JSONArray g;
    public final Handler h;
    public JSONArray i;
    public final int j;
    public long k = 0;

    public m(Context context, lib.android.paypal.com.magnessdk.network.base.e eVar, int i) {
        this.h = eVar;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.e = sensorManager;
        this.j = i;
        this.d = sensorManager.getDefaultSensor(i);
    }

    public final JSONObject b() throws JSONException {
        Sensor sensor = this.d;
        if (sensor == null) {
            return new JSONObject();
        }
        this.e.unregisterListener(this, sensor);
        AtomicInteger atomicInteger = l;
        if (atomicInteger != null && atomicInteger.get() > 0) {
            atomicInteger.getAndDecrement();
        }
        try {
            this.f.put("p", this.i);
            this.g.put(this.f);
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, getClass());
        }
        return this.f;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.k <= 25 || this.i.length() >= 150) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(String.valueOf(sensorEvent.values[0]));
        jSONArray.put(String.valueOf(sensorEvent.values[1]));
        jSONArray.put(String.valueOf(sensorEvent.values[2]));
        jSONArray.put(jCurrentTimeMillis);
        this.i.put(jSONArray);
        this.k = jCurrentTimeMillis;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        Handler handler = this.h;
        if (handler == null) {
            return;
        }
        SensorManager sensorManager = this.e;
        Sensor sensor = this.d;
        if (sensor != null) {
            try {
                AtomicInteger atomicInteger = l;
                if (atomicInteger == null || atomicInteger.get() >= 120) {
                    return;
                }
                sensorManager.registerListener(this, sensor, 50000, handler);
                atomicInteger.getAndIncrement();
                JSONObject jSONObjectD = f.d(sensor);
                JSONObject jSONObject = this.f;
                Iterator<String> itKeys = jSONObjectD.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.has(next)) {
                        try {
                            jSONObject.put(next, jSONObjectD.opt(next));
                        } catch (JSONException e) {
                            lib.android.paypal.com.magnessdk.log.a.b(e, f.class);
                        }
                    }
                }
                this.f = jSONObject;
                int i = this.j;
                if (i == 1) {
                    jSONObject.put("t", "ac");
                }
                if (i == 4) {
                    this.f.put("t", "gy");
                }
                if (i == 2) {
                    this.f.put("t", "mg");
                }
            } catch (JSONException e2) {
                lib.android.paypal.com.magnessdk.log.a.b(e2, getClass());
            }
        }
    }
}
