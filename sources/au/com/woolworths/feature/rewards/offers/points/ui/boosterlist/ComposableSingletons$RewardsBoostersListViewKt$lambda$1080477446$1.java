package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.ComposableSingletons$RewardsBoostersListViewKt$lambda$-1080477446$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$RewardsBoostersListViewKt$lambda$1080477446$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$RewardsBoostersListViewKt$lambda$1080477446$1 d = new ComposableSingletons$RewardsBoostersListViewKt$lambda$1080477446$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            SpacerKt.a((float) 0.01d, composer, 6);
        }
        return Unit.f24250a;
    }
}
