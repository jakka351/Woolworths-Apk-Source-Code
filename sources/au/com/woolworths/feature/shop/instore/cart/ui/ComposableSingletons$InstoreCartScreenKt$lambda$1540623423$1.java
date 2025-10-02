package au.com.woolworths.feature.shop.instore.cart.ui;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.instore.cart.ui.ComposableSingletons$InstoreCartScreenKt$lambda$-1540623423$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$InstoreCartScreenKt$lambda$1540623423$1 implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final ComposableSingletons$InstoreCartScreenKt$lambda$1540623423$1 d = new ComposableSingletons$InstoreCartScreenKt$lambda$1540623423$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaddingValues it = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(it, "it");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.g(PainterResources_androidKt.a(R.drawable.ic_no_products, 0, composer), StringResources_androidKt.c(composer, R.string.cart_page_no_product_error_title), StringResources_androidKt.c(composer, R.string.cart_page_no_product_error_body_instore)), TestTagKt.a(Modifier.Companion.d, "empty_instore_cart_screen"), null, composer, 48, 4);
        }
        return Unit.f24250a;
    }
}
