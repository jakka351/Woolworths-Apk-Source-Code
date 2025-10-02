package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class OrientationListener implements SensorEventListener {
    public final float[] d = new float[16];
    public final float[] e = new float[16];
    public final float[] f = new float[16];
    public final float[] g = new float[3];
    public final Display h;
    public final Listener[] i;
    public boolean j;

    public interface Listener {
        void a(float[] fArr, float f);
    }

    public OrientationListener(Display display, Listener... listenerArr) {
        this.h = display;
        this.i = listenerArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.h.getRotation();
        float[] fArr3 = this.e;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = 130;
                    i = 1;
                }
            } else {
                i = 129;
                i2 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.g;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        boolean z = this.j;
        float[] fArr5 = this.f;
        if (!z) {
            FrameRotationQueue.a(fArr5, fArr2);
            this.j = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (Listener listener : this.i) {
            listener.a(fArr2, f);
        }
    }
}
