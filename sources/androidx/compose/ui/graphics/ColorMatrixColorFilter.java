package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrixColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ColorMatrixColorFilter extends ColorFilter {
    public float[] b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorMatrixColorFilter)) {
            return false;
        }
        float[] array = this.b;
        if (array == null) {
            android.graphics.ColorFilter colorFilter = this.f1767a;
            if (!(colorFilter instanceof android.graphics.ColorMatrixColorFilter)) {
                throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            }
            android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
            ((android.graphics.ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
            array = colorMatrix.getArray();
            this.b = array;
        }
        ColorMatrixColorFilter colorMatrixColorFilter = (ColorMatrixColorFilter) obj;
        float[] array2 = colorMatrixColorFilter.b;
        if (array2 == null) {
            android.graphics.ColorFilter colorFilter2 = colorMatrixColorFilter.f1767a;
            if (!(colorFilter2 instanceof android.graphics.ColorMatrixColorFilter)) {
                throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            }
            android.graphics.ColorMatrix colorMatrix2 = new android.graphics.ColorMatrix();
            ((android.graphics.ColorMatrixColorFilter) colorFilter2).getColorMatrix(colorMatrix2);
            array2 = colorMatrix2.getArray();
            colorMatrixColorFilter.b = array2;
        }
        return Arrays.equals(array, array2);
    }

    public final int hashCode() {
        float[] fArr = this.b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
