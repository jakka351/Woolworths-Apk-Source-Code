package au.com.woolworths.feature.shop.catalogue.browse.page.category;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePageButton;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePageHeader;
import au.com.woolworths.feature.shop.catalogue.browse.page.a;
import au.com.woolworths.feature.shop.catalogue.databinding.ViewCatalogueBrowseCategoryPageBinding;
import au.com.woolworths.product.models.ProductCard;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/category/CategoryPageEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/feature/shop/catalogue/browse/page/category/CategoryPageEpoxyModel$Holder;", "Holder", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class CategoryPageEpoxyModel extends EpoxyModelWithHolder<Holder> {
    public static int s;
    public int n;
    public BrowsePage.Category o;
    public a p;
    public Function1 q;
    public e r;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/category/CategoryPageEpoxyModel$Companion;", "", "", "maxProductCards", "I", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/category/CategoryPageEpoxyModel$Holder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Holder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ViewCatalogueBrowseCategoryPageBinding f6811a;
        public ProductCardsEpoxyController b;

        public Holder() {
        }

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            int i = R.id.background_image;
            ImageView imageView = (ImageView) ViewBindings.a(R.id.background_image, itemView);
            if (imageView != null) {
                i = R.id.button;
                Button button = (Button) ViewBindings.a(R.id.button, itemView);
                if (button != null) {
                    i = R.id.content;
                    View viewA = ViewBindings.a(R.id.content, itemView);
                    if (viewA != null) {
                        i = R.id.icon;
                        ImageView imageView2 = (ImageView) ViewBindings.a(R.id.icon, itemView);
                        if (imageView2 != null) {
                            i = R.id.icon_guideline;
                            if (((Guideline) ViewBindings.a(R.id.icon_guideline, itemView)) != null) {
                                i = R.id.overlay_guideline;
                                if (((Guideline) ViewBindings.a(R.id.overlay_guideline, itemView)) != null) {
                                    i = R.id.page_number;
                                    TextView textView = (TextView) ViewBindings.a(R.id.page_number, itemView);
                                    if (textView != null) {
                                        i = R.id.products_recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.a(R.id.products_recycler_view, itemView);
                                        if (recyclerView != null) {
                                            i = R.id.title;
                                            TextView textView2 = (TextView) ViewBindings.a(R.id.title, itemView);
                                            if (textView2 != null) {
                                                ViewCatalogueBrowseCategoryPageBinding viewCatalogueBrowseCategoryPageBinding = new ViewCatalogueBrowseCategoryPageBinding((ConstraintLayout) itemView, imageView, button, viewA, imageView2, textView, recyclerView, textView2);
                                                a aVar = CategoryPageEpoxyModel.this.p;
                                                if (aVar == null) {
                                                    Intrinsics.p("onProductCardClickListener");
                                                    throw null;
                                                }
                                                ProductCardsEpoxyController productCardsEpoxyController = new ProductCardsEpoxyController(aVar);
                                                this.b = productCardsEpoxyController;
                                                recyclerView.setAdapter(productCardsEpoxyController.getAdapter());
                                                ProductCardsEpoxyController productCardsEpoxyController2 = this.b;
                                                if (productCardsEpoxyController2 == null) {
                                                    Intrinsics.p("productCardsEpoxyController");
                                                    throw null;
                                                }
                                                Context context = itemView.getContext();
                                                Intrinsics.g(context, "getContext(...)");
                                                recyclerView.setLayoutManager(productCardsEpoxyController2.getLayoutManager(context));
                                                this.f6811a = viewCatalogueBrowseCategoryPageBinding;
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
    public final void h(final Holder holder) {
        int color;
        Intrinsics.h(holder, "holder");
        if (s <= 0) {
            ViewCatalogueBrowseCategoryPageBinding viewCatalogueBrowseCategoryPageBinding = holder.f6811a;
            if (viewCatalogueBrowseCategoryPageBinding == null) {
                Intrinsics.p("binding");
                throw null;
            }
            final RecyclerView recyclerView = viewCatalogueBrowseCategoryPageBinding.i;
            final ProductCardsEpoxyController productCardsEpoxyController = holder.b;
            if (productCardsEpoxyController == null) {
                Intrinsics.p("productCardsEpoxyController");
                throw null;
            }
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.category.CategoryPageEpoxyModel$deduceMaxProductCards$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    RecyclerView recyclerView2 = recyclerView;
                    RecyclerView.ViewHolder viewHolderJ = recyclerView2.J(0);
                    if (viewHolderJ != null) {
                        recyclerView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        CategoryPageEpoxyModel.s = productCardsEpoxyController.getSpanCount() * (recyclerView2.getHeight() / viewHolderJ.itemView.getHeight());
                        CategoryPageEpoxyModel categoryPageEpoxyModel = this;
                        if (categoryPageEpoxyModel.n == 4) {
                            e eVar = categoryPageEpoxyModel.r;
                            if (eVar == null) {
                                Intrinsics.p("onPageImpressionListener");
                                throw null;
                            }
                            eVar.invoke(categoryPageEpoxyModel.K(), Integer.valueOf(categoryPageEpoxyModel.M().size()));
                        }
                        categoryPageEpoxyModel.h(holder);
                    }
                }
            });
            productCardsEpoxyController.setData(null);
            return;
        }
        ViewCatalogueBrowseCategoryPageBinding viewCatalogueBrowseCategoryPageBinding2 = holder.f6811a;
        if (viewCatalogueBrowseCategoryPageBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ImageView imageView = viewCatalogueBrowseCategoryPageBinding2.g;
        TextView textView = viewCatalogueBrowseCategoryPageBinding2.h;
        ImageView imageView2 = viewCatalogueBrowseCategoryPageBinding2.d;
        Button button = viewCatalogueBrowseCategoryPageBinding2.e;
        RequestBuilder requestBuilderL = Glide.e(imageView2).l(K().c);
        String str = K().d;
        if (str == null || str.length() == 0) {
            color = 0;
        } else {
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        ((RequestBuilder) requestBuilderL.f(new ColorDrawable(color))).H(imageView2);
        List list = K().e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof BrowsePageHeader) {
                arrayList.add(obj);
            }
        }
        BrowsePageHeader browsePageHeader = (BrowsePageHeader) CollectionsKt.F(arrayList);
        if (browsePageHeader != null) {
            String str2 = browsePageHeader.f6809a;
            textView.setText(textView.getContext().getString(R.string.catalogue_browse_browse_page_number, Integer.valueOf(K().b), Integer.valueOf(K().f)));
            viewCatalogueBrowseCategoryPageBinding2.j.setText(str2);
            Glide.e(imageView).l(browsePageHeader.b).H(imageView);
            Context context = textView.getContext();
            Intrinsics.g(context, "getContext(...)");
            String string = context.getString(R.string.catalogue_browse_category_page_content_description, Integer.valueOf(K().b), Integer.valueOf(K().f), str2, K().b == 1 ? context.getString(R.string.catalogue_browse_category_page_swipe_up_content_description) : "");
            Intrinsics.g(string, "getString(...)");
            textView.setContentDescription(string);
        }
        ProductCardsEpoxyController productCardsEpoxyController2 = holder.b;
        if (productCardsEpoxyController2 == null) {
            Intrinsics.p("productCardsEpoxyController");
            throw null;
        }
        productCardsEpoxyController2.setData(M());
        List list2 = K().e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof BrowsePageButton) {
                arrayList2.add(obj2);
            }
        }
        BrowsePageButton browsePageButton = (BrowsePageButton) CollectionsKt.F(arrayList2);
        button.setVisibility(browsePageButton == null ? 8 : 0);
        if (browsePageButton != null) {
            button.setText(browsePageButton.f6808a.getLabel());
            button.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 4));
        }
    }

    public final BrowsePage.Category K() {
        BrowsePage.Category category = this.o;
        if (category != null) {
            return category;
        }
        Intrinsics.p("page");
        throw null;
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void x(int i, Holder holder) {
        Intrinsics.h(holder, "holder");
        this.n = i;
        if (i == 4) {
            ViewCatalogueBrowseCategoryPageBinding viewCatalogueBrowseCategoryPageBinding = holder.f6811a;
            if (viewCatalogueBrowseCategoryPageBinding == null) {
                Intrinsics.p("binding");
                throw null;
            }
            viewCatalogueBrowseCategoryPageBinding.h.sendAccessibilityEvent(8);
            if (s > 0) {
                e eVar = this.r;
                if (eVar != null) {
                    eVar.invoke(K(), Integer.valueOf(M().size()));
                } else {
                    Intrinsics.p("onPageImpressionListener");
                    throw null;
                }
            }
        }
    }

    public final List M() {
        List list = K().e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProductCard) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.x0(s, CollectionsKt.l0(arrayList));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.view_catalogue_browse_category_page;
    }
}
