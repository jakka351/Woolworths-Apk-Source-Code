package au.com.woolworths.feature.shop.storelocator.details;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.storelocator.details.ComposableSingletons$StoreDetailsScreenKt$lambda$-1480509164$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$StoreDetailsScreenKt$lambda$1480509164$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$StoreDetailsScreenKt$lambda$1480509164$1 d = new ComposableSingletons$StoreDetailsScreenKt$lambda$1480509164$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope TertiaryButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(TertiaryButton, "$this$TertiaryButton");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            TextKt.b(StringResources_androidKt.c(composer, R.string.try_again_button_text), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
        }
        return Unit.f24250a;
    }
}
