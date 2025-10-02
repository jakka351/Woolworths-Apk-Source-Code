package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BezierKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PathSegment.Type type = PathSegment.Type.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PathSegment.Type type2 = PathSegment.Type.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PathSegment.Type type3 = PathSegment.Type.d;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PathSegment.Type type4 = PathSegment.Type.d;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PathSegment.Type type5 = PathSegment.Type.d;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PathSegment.Type type6 = PathSegment.Type.d;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final int a(float f, float[] fArr, int i) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            f2 = f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }
}
