package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import com.woolworths.product.list.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/data/ContentCta;", "Lcom/woolworths/product/list/ProductListQuery$ButtonCta;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryButtonCtaExtKt {
    @NotNull
    public static final ContentCta toUiModel(@NotNull ProductListQuery.ButtonCta buttonCta) {
        Intrinsics.h(buttonCta, "<this>");
        return new ContentCta(buttonCta.getLabel(), (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
    }
}
