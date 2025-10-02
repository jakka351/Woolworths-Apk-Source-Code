package au.com.woolworths.shop.checkout.ui.components;

import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.epoxy.SimpleEpoxyModel;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/SectionDividerEpoxyModel;", "Lcom/airbnb/epoxy/SimpleEpoxyModel;", "Solid", "Dotted", "Lau/com/woolworths/shop/checkout/ui/components/SectionDividerEpoxyModel$Dotted;", "Lau/com/woolworths/shop/checkout/ui/components/SectionDividerEpoxyModel$Solid;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SectionDividerEpoxyModel extends SimpleEpoxyModel {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/SectionDividerEpoxyModel$Dotted;", "Lau/com/woolworths/shop/checkout/ui/components/SectionDividerEpoxyModel;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dotted extends SectionDividerEpoxyModel {
        public static final Dotted p = new Dotted(R.layout.item_divider_dotted);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/SectionDividerEpoxyModel$Solid;", "Lau/com/woolworths/shop/checkout/ui/components/SectionDividerEpoxyModel;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Solid extends SectionDividerEpoxyModel {
        public static final Solid p = new Solid(R.layout.item_divider_solid);
    }
}
