package au.com.woolworths.shop.rewards.priming.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.rewards.priming.data.TitleItem;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.rewards.priming.ui.ComposableSingletons$PrimingTitleUiKt$lambda$-432352221$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$PrimingTitleUiKt$lambda$432352221$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            PrimingTitleUiKt.a(new TitleItem(R.string.priming_title_generic, R.string.priming_subtitle_generic), null, composer, 0, 2);
        }
        return Unit.f24250a;
    }
}
