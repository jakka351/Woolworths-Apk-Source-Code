package au.com.woolworths.feature.shop.catalogue.browse.page.category;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.f;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.android.onesite.extensions.IntExtKt;
import au.com.woolworths.base.shopapp.customviews.a;
import au.com.woolworths.feature.shop.catalogue.databinding.ViewCatalogueBrowseCategoryPageProductCardBinding;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductPriceView;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/category/ProductCardEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/feature/shop/catalogue/browse/page/category/ProductCardEpoxyModel$Holder;", "Holder", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class ProductCardEpoxyModel extends EpoxyModelWithHolder<Holder> {
    public static int q;
    public boolean n;
    public ProductCard o;
    public f p;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/category/ProductCardEpoxyModel$Companion;", "", "", "maxPromotionWidth", "I", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/category/ProductCardEpoxyModel$Holder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Holder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ViewCatalogueBrowseCategoryPageProductCardBinding f6814a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            int i = R.id.badge_guideline;
            if (((Guideline) ViewBindings.a(R.id.badge_guideline, itemView)) != null) {
                i = R.id.badge_image;
                ImageView imageView = (ImageView) ViewBindings.a(R.id.badge_image, itemView);
                if (imageView != null) {
                    i = R.id.card_view;
                    MaterialCardView materialCardView = (MaterialCardView) ViewBindings.a(R.id.card_view, itemView);
                    if (materialCardView != null) {
                        i = R.id.constraint_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.a(R.id.constraint_layout, itemView);
                        if (constraintLayout != null) {
                            i = R.id.member_price_view;
                            TextView textView = (TextView) ViewBindings.a(R.id.member_price_view, itemView);
                            if (textView != null) {
                                i = R.id.multi_buy_view;
                                TextView textView2 = (TextView) ViewBindings.a(R.id.multi_buy_view, itemView);
                                if (textView2 != null) {
                                    i = R.id.new_label_view;
                                    TextView textView3 = (TextView) ViewBindings.a(R.id.new_label_view, itemView);
                                    if (textView3 != null) {
                                        i = R.id.price_bottom_guideline;
                                        if (((Guideline) ViewBindings.a(R.id.price_bottom_guideline, itemView)) != null) {
                                            i = R.id.price_top_guideline;
                                            if (((Guideline) ViewBindings.a(R.id.price_top_guideline, itemView)) != null) {
                                                i = R.id.product_guideline;
                                                if (((Guideline) ViewBindings.a(R.id.product_guideline, itemView)) != null) {
                                                    i = R.id.product_image;
                                                    ImageView imageView2 = (ImageView) ViewBindings.a(R.id.product_image, itemView);
                                                    if (imageView2 != null) {
                                                        i = R.id.product_price_view;
                                                        ProductPriceView productPriceView = (ProductPriceView) ViewBindings.a(R.id.product_price_view, itemView);
                                                        if (productPriceView != null) {
                                                            i = R.id.promotion_view;
                                                            TextView textView4 = (TextView) ViewBindings.a(R.id.promotion_view, itemView);
                                                            if (textView4 != null) {
                                                                i = R.id.was_price_view;
                                                                TextView textView5 = (TextView) ViewBindings.a(R.id.was_price_view, itemView);
                                                                if (textView5 != null) {
                                                                    this.f6814a = new ViewCatalogueBrowseCategoryPageProductCardBinding((ConstraintLayout) itemView, imageView, materialCardView, constraintLayout, textView, textView2, textView3, imageView2, productPriceView, textView4, textView5);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
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
    public final void h(Holder holder) throws Resources.NotFoundException {
        Intrinsics.h(holder, "holder");
        ViewCatalogueBrowseCategoryPageProductCardBinding viewCatalogueBrowseCategoryPageProductCardBinding = holder.f6814a;
        if (viewCatalogueBrowseCategoryPageProductCardBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ProductPriceView productPriceView = viewCatalogueBrowseCategoryPageProductCardBinding.l;
        TextView textView = viewCatalogueBrowseCategoryPageProductCardBinding.n;
        TextView textView2 = viewCatalogueBrowseCategoryPageProductCardBinding.h;
        ImageView imageView = viewCatalogueBrowseCategoryPageProductCardBinding.e;
        ImageView imageView2 = viewCatalogueBrowseCategoryPageProductCardBinding.k;
        ConstraintLayout constraintLayout = viewCatalogueBrowseCategoryPageProductCardBinding.d;
        MaterialCardView materialCardView = viewCatalogueBrowseCategoryPageProductCardBinding.f;
        TextView textView3 = viewCatalogueBrowseCategoryPageProductCardBinding.i;
        TextView textView4 = viewCatalogueBrowseCategoryPageProductCardBinding.m;
        if (this.n) {
            constraintLayout.setVisibility(4);
            final ViewCatalogueBrowseCategoryPageProductCardBinding viewCatalogueBrowseCategoryPageProductCardBinding2 = holder.f6814a;
            if (viewCatalogueBrowseCategoryPageProductCardBinding2 != null) {
                viewCatalogueBrowseCategoryPageProductCardBinding2.g.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.category.ProductCardEpoxyModel$deducePromotionWidth$1$1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        ViewCatalogueBrowseCategoryPageProductCardBinding viewCatalogueBrowseCategoryPageProductCardBinding3 = viewCatalogueBrowseCategoryPageProductCardBinding2;
                        ConstraintLayout constraintLayout2 = viewCatalogueBrowseCategoryPageProductCardBinding3.g;
                        constraintLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        ProductCardEpoxyModel.q = (constraintLayout2.getWidth() - ((int) viewCatalogueBrowseCategoryPageProductCardBinding3.n.getX())) - constraintLayout2.getPaddingEnd();
                    }
                });
                return;
            } else {
                Intrinsics.p("binding");
                throw null;
            }
        }
        constraintLayout.setVisibility(0);
        ((RequestBuilder) Glide.e(imageView2).l(K().getProductImage()).e(R.drawable.ic_product_image_unavailable)).H(imageView2);
        Glide.e(imageView).l(K().getBadgeImage()).H(imageView);
        productPriceView.setVisibility(K().getPrice() != null ? 0 : 8);
        Integer price = K().getPrice();
        if (price != null) {
            int iIntValue = price.intValue();
            productPriceView.d(IntExtKt.b(iIntValue), IntExtKt.a(iIntValue), null);
        }
        textView3.setVisibility(8);
        textView4.setVisibility(0);
        if (K().isAvailable()) {
            MultiBuyPriceInfo multiBuyPriceInfo = K().getMultiBuyPriceInfo();
            if (multiBuyPriceInfo != null) {
                textView3.setText(multiBuyPriceInfo.getPrice());
                textView3.setVisibility(0);
                textView4.setVisibility(8);
            } else {
                ExentsionsKt.a(textView4, K());
            }
        } else {
            ExentsionsKt.b(textView4);
        }
        ConstraintLayout constraintLayout2 = viewCatalogueBrowseCategoryPageProductCardBinding.g;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.g(constraintLayout2);
        textView4.measure(-2, -2);
        if (textView4.getMeasuredWidth() > q) {
            constraintSet.f(6);
            constraintSet.h(R.id.promotion_view, 7, 0, 7);
        } else {
            constraintSet.f(7);
            constraintSet.h(R.id.promotion_view, 6, R.id.was_price_view, 6);
        }
        constraintSet.c(constraintLayout2);
        MemberPriceInfo memberPriceInfo = K().getMemberPriceInfo();
        if (memberPriceInfo != null) {
            textView2.setText(memberPriceInfo.getHeader() + "\n" + memberPriceInfo.getTitle());
            textView.setText((CharSequence) null);
        } else {
            textView.setText(K().getWasPrice());
            textView2.setText((CharSequence) null);
        }
        viewCatalogueBrowseCategoryPageProductCardBinding.j.setVisibility((K().isNew() && K().isAvailable()) ? 0 : 8);
        materialCardView.setOnClickListener(new a(this, 5));
        ProductCard productCardK = K();
        Context context = materialCardView.getContext();
        Intrinsics.g(context, "getContext(...)");
        materialCardView.setContentDescription(ExentsionsKt.c(productCardK, context));
    }

    public final ProductCard K() {
        ProductCard productCard = this.o;
        if (productCard != null) {
            return productCard;
        }
        Intrinsics.p("productCard");
        throw null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.view_catalogue_browse_category_page_product_card;
    }
}
