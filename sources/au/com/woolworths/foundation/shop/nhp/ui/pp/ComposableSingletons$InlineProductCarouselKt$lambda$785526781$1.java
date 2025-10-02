package au.com.woolworths.foundation.shop.nhp.ui.pp;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$InlineProductCarouselKt$lambda$785526781$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$InlineProductCarouselKt$lambda$785526781$1 d = new ComposableSingletons$InlineProductCarouselKt$lambda$785526781$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        }
        return Unit.f24250a;
    }
}
