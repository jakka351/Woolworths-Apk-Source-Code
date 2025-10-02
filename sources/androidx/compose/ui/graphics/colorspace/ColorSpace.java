package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class ColorSpace {

    /* renamed from: a, reason: collision with root package name */
    public final String f1790a;
    public final long b;
    public final int c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace$Companion;", "", "", "MaxId", "I", "MinId", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public ColorSpace(String str, long j, int i) {
        this.f1790a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i);

    public abstract float c(int i);

    /* renamed from: d */
    public boolean getQ() {
        return false;
    }

    public long e(float f, float f2, float f3) {
        float[] fArrF = f(new float[]{f, f2, f3});
        return (Float.floatToRawIntBits(fArrF[0]) << 32) | (Float.floatToRawIntBits(fArrF[1]) & 4294967295L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.c == colorSpace.c && Intrinsics.c(this.f1790a, colorSpace.f1790a)) {
            return ColorModel.a(this.b, colorSpace.b);
        }
        return false;
    }

    public abstract float[] f(float[] fArr);

    public float g(float f, float f2, float f3) {
        return f(new float[]{f, f2, f3})[2];
    }

    public long h(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i = ColorModel.e;
        float[] fArr = new float[(int) (this.b >> 32)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] fArrA = a(fArr);
        return ColorKt.a(fArrA[0], fArrA[1], fArrA[2], f4, colorSpace);
    }

    public int hashCode() {
        int iHashCode = this.f1790a.hashCode() * 31;
        int i = ColorModel.e;
        return androidx.camera.core.impl.b.b(iHashCode, 31, this.b) + this.c;
    }

    public final String toString() {
        return this.f1790a + " (id=" + this.c + ", model=" + ((Object) ColorModel.b(this.b)) + ')';
    }
}
