package au.com.woolworths.product.details.models;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import com.woolworths.product.details.ProductDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/data/ContentCta;", "Lcom/woolworths/product/details/ProductDetailsQuery$SecondaryCta;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQuerySecondaryCtaExtKt {
    @NotNull
    public static final ContentCta toUiModel(@NotNull ProductDetailsQuery.SecondaryCta secondaryCta) {
        Intrinsics.h(secondaryCta, "<this>");
        return new ContentCta(secondaryCta.getLabel(), (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
    }
}
