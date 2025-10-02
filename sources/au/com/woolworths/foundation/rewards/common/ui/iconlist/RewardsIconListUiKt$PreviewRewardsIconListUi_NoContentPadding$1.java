package au.com.woolworths.foundation.rewards.common.ui.iconlist;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class RewardsIconListUiKt$PreviewRewardsIconListUi_NoContentPadding$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(5004770);
            boolean zI = composer.I(null);
            Object objG = composer.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(5);
                composer.A(objG);
            }
            composer.l();
            LazyDslKt.b(null, null, null, false, null, null, null, false, null, (Function1) objG, composer, 0, 511);
        }
        return Unit.f24250a;
    }
}
