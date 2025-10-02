package com.woolworths.shop.product.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.woolworths.shop.product.ui.ComposableSingletons$ProductCardHorizontalKt$lambda$-556181033$1, reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ProductCardHorizontalKt$lambda$556181033$1 implements Function3<String, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductCardHorizontalKt$lambda$556181033$1 d = new ComposableSingletons$ProductCardHorizontalKt$lambda$556181033$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String it = (String) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(it, "it");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            IconKt.a(PainterResources_androidKt.a(R.drawable.product_aisle_location_icon_active, 0, composer), null, null, 0L, composer, 48, 12);
        }
        return Unit.f24250a;
    }
}
