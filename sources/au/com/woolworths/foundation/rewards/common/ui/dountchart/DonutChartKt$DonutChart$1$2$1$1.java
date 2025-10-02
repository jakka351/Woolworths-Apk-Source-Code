package au.com.woolworths.foundation.rewards.common.ui.dountchart;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.rewards.common.ui.iconasset.IconAssetUiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DonutChartKt$DonutChart$1$2$1$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconAssetUiKt.b(null, CoreTheme.a(composer).b.f4775a.c, null, composer, 0, 4);
        }
        return Unit.f24250a;
    }
}
