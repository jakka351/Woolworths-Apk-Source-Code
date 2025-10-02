package au.com.woolworths.feature.shop.catalogue.browse.contents.epoxy;

import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.feature.rewards.card.overlay.ui.b;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueBrowseContentsCategoryCardBinding;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/contents/epoxy/CategoryCardEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/feature/shop/catalogue/browse/contents/epoxy/CategoryCardEpoxyModel$Holder;", "Holder", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CategoryCardEpoxyModel extends EpoxyModelWithHolder<Holder> {
    public String n;
    public String o;
    public b p;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/contents/epoxy/CategoryCardEpoxyModel$Holder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Holder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemCatalogueBrowseContentsCategoryCardBinding f6801a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            int i = R.id.category_card_image;
            ImageView imageView = (ImageView) ViewBindings.a(R.id.category_card_image, itemView);
            if (imageView != null) {
                i = R.id.category_card_title;
                TextView textView = (TextView) ViewBindings.a(R.id.category_card_title, itemView);
                if (textView != null) {
                    i = R.id.category_card_view;
                    MaterialCardView materialCardView = (MaterialCardView) ViewBindings.a(R.id.category_card_view, itemView);
                    if (materialCardView != null) {
                        this.f6801a = new ItemCatalogueBrowseContentsCategoryCardBinding((ConstraintLayout) itemView, imageView, textView, materialCardView);
                        return;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(i)));
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final EpoxyHolder D(ViewParent parent) {
        Intrinsics.h(parent, "parent");
        return new Holder();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void h(Holder holder) {
        Intrinsics.h(holder, "holder");
        ItemCatalogueBrowseContentsCategoryCardBinding itemCatalogueBrowseContentsCategoryCardBinding = holder.f6801a;
        if (itemCatalogueBrowseContentsCategoryCardBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ImageView imageView = itemCatalogueBrowseContentsCategoryCardBinding.d;
        TextView textView = itemCatalogueBrowseContentsCategoryCardBinding.e;
        String str = this.n;
        if (str == null) {
            Intrinsics.p("title");
            throw null;
        }
        textView.setText(str);
        RequestManager requestManagerE = Glide.e(imageView);
        String str2 = this.o;
        if (str2 == null) {
            Intrinsics.p("image");
            throw null;
        }
        requestManagerE.l(str2).H(imageView);
        itemCatalogueBrowseContentsCategoryCardBinding.f.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 3));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_catalogue_browse_contents_category_card;
    }
}
