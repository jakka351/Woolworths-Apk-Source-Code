package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SliderKt$RangeSlider$9 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj3).intValue();
        SliderDefaults.f1497a.b((RangeSliderState) obj, null, false, null, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Composer) obj2, (iIntValue & 14) | 100663296, 242);
        return Unit.f24250a;
    }
}
