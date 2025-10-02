package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.SlidingPercentile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@UnstableApi
/* loaded from: classes2.dex */
public class SlidingPercentile {
    public static final d h;
    public static final d i;

    /* renamed from: a, reason: collision with root package name */
    public final int f3184a;
    public int e;
    public int f;
    public int g;
    public final Sample[] c = new Sample[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    public static class Sample {

        /* renamed from: a, reason: collision with root package name */
        public int f3185a;
        public int b;
        public float c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.upstream.d] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.upstream.d] */
    static {
        final int i2 = 0;
        h = new Comparator() { // from class: androidx.media3.exoplayer.upstream.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
                SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
                switch (i2) {
                    case 0:
                        return sample.f3185a - sample2.f3185a;
                    default:
                        return Float.compare(sample.c, sample2.c);
                }
            }
        };
        final int i3 = 1;
        i = new Comparator() { // from class: androidx.media3.exoplayer.upstream.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
                SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
                switch (i3) {
                    case 0:
                        return sample.f3185a - sample2.f3185a;
                    default:
                        return Float.compare(sample.c, sample2.c);
                }
            }
        };
    }

    public SlidingPercentile(int i2) {
        this.f3184a = i2;
    }

    public final void a(float f, int i2) {
        Sample sample;
        int i3 = this.d;
        ArrayList arrayList = this.b;
        if (i3 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i4 = this.g;
        Sample[] sampleArr = this.c;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.g = i5;
            sample = sampleArr[i5];
        } else {
            sample = new Sample();
        }
        int i6 = this.e;
        this.e = i6 + 1;
        sample.f3185a = i6;
        sample.b = i2;
        sample.c = f;
        arrayList.add(sample);
        this.f += i2;
        while (true) {
            int i7 = this.f;
            int i8 = this.f3184a;
            if (i7 <= i8) {
                return;
            }
            int i9 = i7 - i8;
            Sample sample2 = (Sample) arrayList.get(0);
            int i10 = sample2.b;
            if (i10 <= i9) {
                this.f -= i10;
                arrayList.remove(0);
                int i11 = this.g;
                if (i11 < 5) {
                    this.g = i11 + 1;
                    sampleArr[i11] = sample2;
                }
            } else {
                sample2.b = i10 - i9;
                this.f -= i9;
            }
        }
    }

    public final float b() {
        int i2 = this.d;
        ArrayList arrayList = this.b;
        if (i2 != 0) {
            Collections.sort(arrayList, i);
            this.d = 0;
        }
        float f = 0.5f * this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Sample sample = (Sample) arrayList.get(i4);
            i3 += sample.b;
            if (i3 >= f) {
                return sample.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((Sample) YU.a.c(1, arrayList)).c;
    }
}
