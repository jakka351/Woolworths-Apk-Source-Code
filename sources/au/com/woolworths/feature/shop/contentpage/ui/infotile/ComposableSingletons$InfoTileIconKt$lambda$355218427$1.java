package au.com.woolworths.feature.shop.contentpage.ui.infotile;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIcon;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIconSlot;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIconSlotSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$InfoTileIconKt$lambda$355218427$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            InfoTileIconKt.b(new InfoTileIconSlot(new InfoTileIcon.InfoTileBadge("1"), InfoTileIconSlotSize.d), null, composer, 0, 2);
        }
        return Unit.f24250a;
    }
}
