package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RadialGradient extends ShaderBrush {
    public final List c;
    public final long d;
    public final float e;

    public RadialGradient(List list, long j, float f) {
        this.c = list;
        this.d = j;
        this.e = f;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.d;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jB = SizeKt.b(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fC = this.e;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = Size.c(j) / 2;
        }
        float f = fC;
        List list = this.c;
        AndroidShader_androidKt.b(list, null);
        return new android.graphics.RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f, AndroidShader_androidKt.a(list), (float[]) null, AndroidTileMode_androidKt.a(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        return this.c.equals(radialGradient.c) && Offset.c(this.d, radialGradient.d) && this.e == radialGradient.e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + android.support.v4.media.session.a.b(this.e, androidx.camera.core.impl.b.b(this.c.hashCode() * 961, 31, this.d), 31);
    }

    public final String toString() {
        String str;
        long j = this.d;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) Offset.j(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.e;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) TileMode.a(0)) + ')';
    }
}
