package au.com.woolworths.feature.product.list.legacy.ui;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.camera.core.impl.utils.futures.e;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.feature.product.list.legacy.ItemProductCardTileListLegacyBindingModel_;
import au.com.woolworths.product.models.ProductCard;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ui/ProductSlideInItemAnimator;", "Landroidx/recyclerview/widget/DefaultItemAnimator;", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductSlideInItemAnimator extends DefaultItemAnimator {
    public String t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ui/ProductSlideInItemAnimator$Companion;", "", "", "ACCESSIBILITY_DELAY_TIME", "J", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public static String x(RecyclerView.ViewHolder viewHolder) {
        EpoxyModel epoxyModel;
        ProductCard productCard;
        EpoxyViewHolder epoxyViewHolder = viewHolder instanceof EpoxyViewHolder ? (EpoxyViewHolder) viewHolder : null;
        if (epoxyViewHolder != null) {
            epoxyViewHolder.c();
            epoxyModel = epoxyViewHolder.f13318a;
        } else {
            epoxyModel = null;
        }
        ItemProductCardTileListLegacyBindingModel_ itemProductCardTileListLegacyBindingModel_ = epoxyModel instanceof ItemProductCardTileListLegacyBindingModel_ ? (ItemProductCardTileListLegacyBindingModel_) epoxyModel : null;
        if (itemProductCardTileListLegacyBindingModel_ == null || (productCard = itemProductCardTileListLegacyBindingModel_.p) == null) {
            return null;
        }
        return productCard.getName();
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final void m(RecyclerView.ViewHolder holder) {
        Intrinsics.h(holder, "holder");
        View view = holder.itemView;
        view.setAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.item_animation_slide_in));
        super.m(holder);
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final void p(RecyclerView.ViewHolder holder) {
        Intrinsics.h(holder, "holder");
        View view = holder.itemView;
        view.setAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.item_animation_slide_out));
        super.p(holder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void q(RecyclerView.ViewHolder item) {
        Intrinsics.h(item, "item");
        View view = item.itemView;
        String strX = x(item);
        if (this.t == null || strX == null) {
            return;
        }
        Context context = view.getContext();
        Intrinsics.g(context, "getContext(...)");
        if (ContextExtKt.d(context)) {
            String string = view.getContext().getString(R.string.product_list_swap_product_content_description, this.t, strX);
            Intrinsics.g(string, "getString(...)");
            view.postDelayed(new e(22, view, string), 500L);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void r(RecyclerView.ViewHolder viewHolder) {
        this.t = x(viewHolder);
    }
}
