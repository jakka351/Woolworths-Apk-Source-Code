package au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen;

import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ComposableSingletons$ReviewsDetailsScreenKt$lambda$-74661815$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ReviewsDetailsScreenKt$lambda$74661815$1 implements Function3<SnackbarData, Composer, Integer, Unit> {
    public static final ComposableSingletons$ReviewsDetailsScreenKt$lambda$74661815$1 d = new ComposableSingletons$ReviewsDetailsScreenKt$lambda$74661815$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarData snackbarData = (SnackbarData) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(snackbarData, "snackbarData");
        SnackbarKt.b(snackbarData, null, null, CoreTheme.b(composer).e.f4848a.b.f4851a, CoreTheme.b(composer).e.d.c.b, 0L, BitmapDescriptorFactory.HUE_RED, composer, iIntValue & 14, 206);
        return Unit.f24250a;
    }
}
