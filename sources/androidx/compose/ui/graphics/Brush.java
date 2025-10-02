package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Brush {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static LinearGradient a(List list, long j, long j2, int i) {
            if ((i & 2) != 0) {
                j = 0;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = 9187343241974906880L;
            }
            return new LinearGradient(list, null, j3, j2);
        }

        public static LinearGradient b(List list) {
            return new LinearGradient(list, null, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
        }

        public static LinearGradient c(Pair[] pairArr) {
            Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
            long jFloatToRawIntBits = (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L);
            ArrayList arrayList = new ArrayList(pairArr2.length);
            for (Pair pair : pairArr2) {
                arrayList.add(new Color(((Color) pair.e).f1766a));
            }
            ArrayList arrayList2 = new ArrayList(pairArr2.length);
            for (Pair pair2 : pairArr2) {
                arrayList2.add(Float.valueOf(((Number) pair2.d).floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2);
        }
    }

    public abstract void a(float f, long j, Paint paint);
}
