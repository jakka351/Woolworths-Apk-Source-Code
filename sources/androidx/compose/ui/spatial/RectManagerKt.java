package androidx.compose.ui.spatial;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RectManagerKt {
    public static final int a(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == BitmapDescriptorFactory.HUE_RED && fArr[2] == BitmapDescriptorFactory.HUE_RED && fArr[4] == BitmapDescriptorFactory.HUE_RED && fArr[5] == 1.0f && fArr[6] == BitmapDescriptorFactory.HUE_RED && fArr[8] == BitmapDescriptorFactory.HUE_RED && fArr[9] == BitmapDescriptorFactory.HUE_RED && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == BitmapDescriptorFactory.HUE_RED && fArr[13] == BitmapDescriptorFactory.HUE_RED && fArr[14] == BitmapDescriptorFactory.HUE_RED && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }
}
