package au.com.woolworths.shop.checkout.ui.components;

import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.shop.checkout.databinding.ItemCheckoutOrderTotalPanelMarkdownSectionBinding;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/OrderTotalSectionPanelMarkdownEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/shop/checkout/ui/components/OrderTotalSectionPanelMarkdownEpoxyModel$ViewHolder;", "ViewHolder", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OrderTotalSectionPanelMarkdownEpoxyModel extends EpoxyModelWithHolder<ViewHolder> {
    public String n;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/OrderTotalSectionPanelMarkdownEpoxyModel$ViewHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewHolder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemCheckoutOrderTotalPanelMarkdownSectionBinding f10690a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            ComposeView composeView = (ComposeView) itemView;
            this.f10690a = new ItemCheckoutOrderTotalPanelMarkdownSectionBinding(composeView, composeView);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void h(ViewHolder holder) {
        Intrinsics.h(holder, "holder");
        ItemCheckoutOrderTotalPanelMarkdownSectionBinding itemCheckoutOrderTotalPanelMarkdownSectionBinding = holder.f10690a;
        if (itemCheckoutOrderTotalPanelMarkdownSectionBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ComposeView composeView = itemCheckoutOrderTotalPanelMarkdownSectionBinding.d;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionPanelMarkdownEpoxyModel$bind$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OrderTotalSectionPanelMarkdownEpoxyModel orderTotalSectionPanelMarkdownEpoxyModel = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(1103769803, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionPanelMarkdownEpoxyModel$bind$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                String str = orderTotalSectionPanelMarkdownEpoxyModel.n;
                                if (str == null) {
                                    Intrinsics.p("panelMarkdown");
                                    throw null;
                                }
                                MarkdownCompatKt.a(str, SizeKt.e(PaddingKt.f(Modifier.Companion.d, 16), 1.0f), new MarkdownTextViewStyle((Density) composer2.x(CompositionLocalsKt.h), CoreTheme.b(composer2).e.d.d, CoreTheme.f(composer2).f5120a.c.b, new TextAlign(1), 16), null, false, null, null, false, null, null, composer2, 48, 1016);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1702862759));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_checkout_order_total_panel_markdown_section;
    }
}
