package au.com.woolworths.feature.rewards.card.overlay.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.rewards.card.overlay.ui.ComposableSingletons$RewardsCardOverlayScreenKt$lambda$-959621988$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$RewardsCardOverlayScreenKt$lambda$959621988$1 implements Function3<BoxScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$RewardsCardOverlayScreenKt$lambda$959621988$1 d = new ComposableSingletons$RewardsCardOverlayScreenKt$lambda$959621988$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope BarcodeUi = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(BarcodeUi, "$this$BarcodeUi");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            TextKt.b(StringResources_androidKt.c(composer, R.string.barcode_error_message), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
        }
        return Unit.f24250a;
    }
}
