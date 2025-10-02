package au.com.woolworths.foundation.rewards.common.ui.borderedmetricitem;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class BorderedMetricGroupUiKt$BorderedMetricGroupUi$1$1$1$1 implements Function3<Integer, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        Composer composer = (Composer) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= composer.r(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 19) == 18 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        FillElement fillElement = SizeKt.c;
        float f = iIntValue >= 0 ? BorderedMetricGroupUiKt.f8576a * 2 : 0;
        int i = iIntValue % 2;
        PaddingKt.j(fillElement, i != 0 ? BorderedMetricGroupUiKt.f8576a : 0, f, i == 0 ? BorderedMetricGroupUiKt.f8576a : 0, BitmapDescriptorFactory.HUE_RED, 8);
        throw null;
    }
}
