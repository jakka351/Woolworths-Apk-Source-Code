package au.com.woolworths.sdui.rewards.appmodal.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.sdui.rewards.appmodal.ui.ComposableSingletons$AppModalBulletItemUiKt$lambda$-1951368955$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$AppModalBulletItemUiKt$lambda$1951368955$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            AppModalBulletItemUiKt.a(new FeatureInfoBulletItem("", "Savings and discounts", "Count every dollar you save the next time you shop or fill up."), composer, 0);
        }
        return Unit.f24250a;
    }
}
