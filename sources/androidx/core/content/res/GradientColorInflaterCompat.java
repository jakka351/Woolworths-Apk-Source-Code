package androidx.core.content.res;

import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes.dex */
final class GradientColorInflaterCompat {

    public static final class ColorStops {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f2422a;
        public final float[] b;

        public ColorStops(ArrayList arrayList, ArrayList arrayList2) {
            int size = arrayList.size();
            this.f2422a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f2422a[i] = ((Integer) arrayList.get(i)).intValue();
                this.b[i] = ((Float) arrayList2.get(i)).floatValue();
            }
        }

        public ColorStops(int i, int i2) {
            this.f2422a = new int[]{i, i2};
            this.b = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
        }

        public ColorStops(int i, int i2, int i3) {
            this.f2422a = new int[]{i, i2, i3};
            this.b = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        }
    }
}
