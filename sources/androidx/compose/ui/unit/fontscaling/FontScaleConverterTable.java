package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class FontScaleConverterTable implements FontScaleConverter {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f2208a;
    public final float[] b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static final float a(float f, float[] fArr, float[] fArr2) {
            float f2;
            float f3;
            float f4;
            float fAbs = Math.abs(f);
            float fSignum = Math.signum(f);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                return fSignum * fArr2[iBinarySearch];
            }
            int i = -(iBinarySearch + 1);
            int i2 = i - 1;
            int length = fArr.length - 1;
            float f5 = BitmapDescriptorFactory.HUE_RED;
            if (i2 >= length) {
                float f6 = fArr[fArr.length - 1];
                return f6 == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : (fArr2[fArr.length - 1] / f6) * f;
            }
            if (i2 == -1) {
                f2 = fArr[0];
                f3 = fArr2[0];
                f4 = 0.0f;
            } else {
                float f7 = fArr[i2];
                f2 = fArr[i];
                f5 = fArr2[i2];
                f3 = fArr2[i];
                f4 = f7;
            }
            return MathUtils.a(f5, f3, f4, f2, fAbs) * fSignum;
        }
    }

    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f2208a = fArr;
        this.b = fArr2;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float a(float f) {
        return Companion.a(f, this.b, this.f2208a);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float b(float f) {
        return Companion.a(f, this.f2208a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        return Arrays.equals(this.f2208a, fontScaleConverterTable.f2208a) && Arrays.equals(this.b, fontScaleConverterTable.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.f2208a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f2208a);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.b);
        Intrinsics.g(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
