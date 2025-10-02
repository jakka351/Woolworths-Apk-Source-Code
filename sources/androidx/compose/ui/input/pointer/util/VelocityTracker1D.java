package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "Strategy", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class VelocityTracker1D {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1868a;
    public final Strategy b;
    public final int c;
    public final DataPointAtTime[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Strategy {
        public static final Strategy d;
        public static final Strategy e;
        public static final /* synthetic */ Strategy[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            Strategy strategy = new Strategy("Lsq2", 0);
            d = strategy;
            Strategy strategy2 = new Strategy("Impulse", 1);
            e = strategy2;
            Strategy[] strategyArr = {strategy, strategy2};
            f = strategyArr;
            g = EnumEntriesKt.a(strategyArr);
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) f.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Strategy strategy = Strategy.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VelocityTracker1D(boolean z, Strategy strategy) {
        int i;
        this.f1868a = z;
        this.b = strategy;
        if (z && strategy.equals(Strategy.d)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = strategy.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        this.c = i;
        this.d = new DataPointAtTime[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        DataPointAtTime[] dataPointAtTimeArr = this.d;
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime != null) {
            dataPointAtTime.f1865a = j;
            dataPointAtTime.b = f;
        } else {
            DataPointAtTime dataPointAtTime2 = new DataPointAtTime();
            dataPointAtTime2.f1865a = j;
            dataPointAtTime2.b = f;
            dataPointAtTimeArr[i] = dataPointAtTime2;
        }
    }

    public final float b() {
        boolean z;
        Strategy strategy;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.e;
        DataPointAtTime[] dataPointAtTimeArr = this.d;
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i3];
        if (dataPointAtTime == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i4 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        do {
            DataPointAtTime dataPointAtTime3 = dataPointAtTimeArr[i3];
            z = this.f1868a;
            strategy = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (dataPointAtTime3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                long j = dataPointAtTime.f1865a;
                i = i4;
                f = BitmapDescriptorFactory.HUE_RED;
                long j2 = dataPointAtTime3.f1865a;
                float f3 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float fAbs = Math.abs(j2 - dataPointAtTime2.f1865a);
                dataPointAtTime2 = (strategy == Strategy.d || z) ? dataPointAtTime3 : dataPointAtTime;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i] = dataPointAtTime3.b;
                    fArr[i] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int iOrdinal = strategy.ordinal();
        if (iOrdinal == 0) {
            try {
                float[] fArr4 = this.h;
                VelocityTrackerKt.c(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iOrdinal != i2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = i4 - i2;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2));
        }
        return fSignum * 1000;
    }

    public final float c(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            InlineClassHelperKt.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fB = b();
        if (fB == BitmapDescriptorFactory.HUE_RED || Float.isNaN(fB)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (fB <= BitmapDescriptorFactory.HUE_RED) {
            float f2 = -f;
            if (fB < f2) {
                return f2;
            }
        } else if (fB > f) {
            return f;
        }
        return fB;
    }

    public /* synthetic */ VelocityTracker1D() {
        this(false, Strategy.d);
    }

    public VelocityTracker1D(boolean z) {
        this(z, Strategy.e);
    }
}
