package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option;

/* loaded from: classes.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a, reason: collision with root package name */
    public static final DownsampleStrategy f13909a = new FitCenter();
    public static final DownsampleStrategy b = new CenterInside();
    public static final DownsampleStrategy c;
    public static final DownsampleStrategy d;
    public static final DownsampleStrategy e;
    public static final Option f;
    public static final boolean g;

    public static class AtLeast extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.e;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i, int i2, int i3, int i4) {
            if (Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    public static class AtMost extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.d;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    public static class CenterInside extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return b(i, i2, i3, i4) == 1.0f ? SampleSizeRounding.e : DownsampleStrategy.f13909a.a(i, i2, i3, i4);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f13909a.b(i, i2, i3, i4));
        }
    }

    public static class CenterOutside extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.e;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    public static class FitCenter extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return DownsampleStrategy.g ? SampleSizeRounding.e : SampleSizeRounding.d;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.g) {
                return Math.min(i3 / i, i4 / i2);
            }
            if (Math.max(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    public static class None extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.e;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class SampleSizeRounding {
        public static final SampleSizeRounding d;
        public static final SampleSizeRounding e;
        public static final /* synthetic */ SampleSizeRounding[] f;

        static {
            SampleSizeRounding sampleSizeRounding = new SampleSizeRounding("MEMORY", 0);
            d = sampleSizeRounding;
            SampleSizeRounding sampleSizeRounding2 = new SampleSizeRounding("QUALITY", 1);
            e = sampleSizeRounding2;
            f = new SampleSizeRounding[]{sampleSizeRounding, sampleSizeRounding2};
        }

        public static SampleSizeRounding valueOf(String str) {
            return (SampleSizeRounding) Enum.valueOf(SampleSizeRounding.class, str);
        }

        public static SampleSizeRounding[] values() {
            return (SampleSizeRounding[]) f.clone();
        }
    }

    static {
        CenterOutside centerOutside = new CenterOutside();
        c = centerOutside;
        d = new None();
        e = centerOutside;
        f = Option.a(centerOutside, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        g = true;
    }

    public abstract SampleSizeRounding a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
