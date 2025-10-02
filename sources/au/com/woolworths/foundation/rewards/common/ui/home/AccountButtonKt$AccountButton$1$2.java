package au.com.woolworths.foundation.rewards.common.ui.home;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.foundation.rewards.common.ui.iconasset.IconAssetUiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AccountButtonKt$AccountButton$1$2 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        IconAssetUiKt.b(null, Color.k, null, composer, 48, 4);
        throw null;
    }
}
