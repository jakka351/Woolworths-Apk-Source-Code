package au.com.woolworths.shop.checkout.ui.epoxy.controller;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.domain.model.breakdown.DetailsSectionValueType;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsTotal;
import au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionPanelMarkdownEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.SectionDividerEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/epoxy/controller/CheckoutOrderTotalDetailsEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/shop/checkout/domain/model/breakdown/CheckoutOrderTotalDetails;", "<init>", "()V", "buildModels", "", "data", "toOrderTotalDetailsSection", "Lau/com/woolworths/shop/checkout/domain/model/breakdown/OrderTotalDetailsSection;", "Lau/com/woolworths/shop/checkout/domain/model/breakdown/OrderTotalDetailsTotal;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutOrderTotalDetailsEpoxyController extends TypedEpoxyController<CheckoutOrderTotalDetails> {
    public static final int $stable = 8;

    private final OrderTotalDetailsSection toOrderTotalDetailsSection(OrderTotalDetailsTotal orderTotalDetailsTotal) {
        return new OrderTotalDetailsSection(orderTotalDetailsTotal.f10648a, DetailsSectionValueType.j, orderTotalDetailsTotal.b, DetailsSectionValueType.f, null, null);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable CheckoutOrderTotalDetails data) {
        String str;
        OrderTotalDetailsSection orderTotalDetailsSection;
        if (data != null) {
            int i = 0;
            for (Object obj : data.b) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                for (OrderTotalDetailsSection orderTotalDetailsSection2 : (List) obj) {
                    OrderTotalSectionEpoxyModel_ orderTotalSectionEpoxyModel_ = new OrderTotalSectionEpoxyModel_();
                    orderTotalSectionEpoxyModel_.M("details_" + orderTotalDetailsSection2.hashCode());
                    orderTotalSectionEpoxyModel_.t();
                    orderTotalSectionEpoxyModel_.n = orderTotalDetailsSection2;
                    add(orderTotalSectionEpoxyModel_);
                }
                EpoxyModel<?> epoxyModel = SectionDividerEpoxyModel.Solid.p;
                epoxyModel.p("divider_section_" + i);
                add(epoxyModel);
                i = i2;
            }
        }
        if (data != null && (orderTotalDetailsSection = toOrderTotalDetailsSection(data.c)) != null) {
            OrderTotalSectionEpoxyModel_ orderTotalSectionEpoxyModel_2 = new OrderTotalSectionEpoxyModel_();
            orderTotalSectionEpoxyModel_2.M("total_" + orderTotalDetailsSection.hashCode());
            orderTotalSectionEpoxyModel_2.t();
            orderTotalSectionEpoxyModel_2.n = orderTotalDetailsSection;
            add(orderTotalSectionEpoxyModel_2);
        }
        if (data == null || (str = data.f) == null) {
            return;
        }
        EpoxyModel<?> epoxyModel2 = SectionDividerEpoxyModel.Solid.p;
        epoxyModel2.p("panel_markdown_section_divider");
        add(epoxyModel2);
        OrderTotalSectionPanelMarkdownEpoxyModel_ orderTotalSectionPanelMarkdownEpoxyModel_ = new OrderTotalSectionPanelMarkdownEpoxyModel_();
        orderTotalSectionPanelMarkdownEpoxyModel_.K();
        orderTotalSectionPanelMarkdownEpoxyModel_.t();
        orderTotalSectionPanelMarkdownEpoxyModel_.n = str;
        add(orderTotalSectionPanelMarkdownEpoxyModel_);
    }
}
