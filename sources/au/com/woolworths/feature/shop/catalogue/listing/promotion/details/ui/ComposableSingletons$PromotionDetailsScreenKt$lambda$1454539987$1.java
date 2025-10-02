package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui;

import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.ComposableSingletons$PromotionDetailsScreenKt$lambda$-1454539987$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PromotionDetailsScreenKt$lambda$1454539987$1 implements Function3<SnackbarData, Composer, Integer, Unit> {
    public static final ComposableSingletons$PromotionDetailsScreenKt$lambda$1454539987$1 d = new ComposableSingletons$PromotionDetailsScreenKt$lambda$1454539987$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarData data = (SnackbarData) obj;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(data, "data");
        SnackbarKt.b(data, null, null, 0L, 0L, 0L, BitmapDescriptorFactory.HUE_RED, (Composer) obj2, iIntValue & 14, 254);
        return Unit.f24250a;
    }
}
