package au.com.woolworths.feature.shop.catalogue.browse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseContract;
import au.com.woolworths.feature.shop.catalogue.browse.contents.epoxy.ContentsEpoxyController;
import au.com.woolworths.feature.shop.catalogue.browse.page.PageEpoxyController;
import au.com.woolworths.feature.shop.catalogue.databinding.ViewCatalogueBrowseTabBinding;
import au.com.woolworths.feature.shop.catalogue.databinding.ViewCatalogueContentsTabBinding;
import com.airbnb.epoxy.EpoxyVisibilityTracker;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "BrowseViewHolder", "ContentsViewHolder", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueBrowseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final CatalogueBrowseViewModel g;
    public final PageEpoxyController h;
    public final ContentsEpoxyController i;
    public RecyclerView j;
    public CatalogueBrowseContract.BrowseViewState k;
    public CatalogueBrowseContract.ContentsViewState l;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseAdapter$BrowseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BrowseViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final ViewCatalogueBrowseTabBinding f6786a;

        public BrowseViewHolder(ViewCatalogueBrowseTabBinding viewCatalogueBrowseTabBinding) {
            super(viewCatalogueBrowseTabBinding.d);
            this.f6786a = viewCatalogueBrowseTabBinding;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseAdapter$ContentsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentsViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final ViewCatalogueContentsTabBinding f6787a;

        public ContentsViewHolder(ViewCatalogueContentsTabBinding viewCatalogueContentsTabBinding) {
            super(viewCatalogueContentsTabBinding.d);
            this.f6787a = viewCatalogueContentsTabBinding;
        }
    }

    public CatalogueBrowseAdapter(CatalogueBrowseViewModel viewModel, PageEpoxyController pageEpoxyController, ContentsEpoxyController contentsEpoxyController) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(pageEpoxyController, "pageEpoxyController");
        Intrinsics.h(contentsEpoxyController, "contentsEpoxyController");
        this.g = viewModel;
        this.h = pageEpoxyController;
        this.i = contentsEpoxyController;
        this.k = new CatalogueBrowseContract.BrowseViewState(null, null, 7);
        this.l = new CatalogueBrowseContract.ContentsViewState(null, null, 7);
    }

    public final void G(CatalogueBrowsePageTab catalogueBrowsePageTab) {
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            Intrinsics.p("recyclerView");
            throw null;
        }
        RecyclerView.ViewHolder viewHolderJ = recyclerView.J(catalogueBrowsePageTab.ordinal());
        if (viewHolderJ != null) {
            v(viewHolderJ, catalogueBrowsePageTab.ordinal());
        } else {
            m(catalogueBrowsePageTab.ordinal());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return ((AbstractCollection) CatalogueBrowsePageTab.h).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void u(RecyclerView recyclerView) {
        this.j = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z = viewHolder instanceof BrowseViewHolder;
        CatalogueBrowseViewModel catalogueBrowseViewModel = this.g;
        if (z) {
            ((BrowseViewHolder) viewHolder).f6786a.e.setVisibility(this.k.f6793a ? 0 : 8);
            this.h.setError$catalogue_release(this.k.c);
            PagingData pagingData = this.k.b;
            if (pagingData != null) {
                BuildersKt.c(ViewModelKt.a(catalogueBrowseViewModel), null, null, new CatalogueBrowseAdapter$onBindViewHolder$2$1(this, pagingData, null), 3);
                return;
            }
            return;
        }
        if (viewHolder instanceof ContentsViewHolder) {
            ViewCatalogueContentsTabBinding viewCatalogueContentsTabBinding = ((ContentsViewHolder) viewHolder).f6787a;
            ProgressBar progressBar = viewCatalogueContentsTabBinding.f;
            IncludeGenericErrorStateBinding includeGenericErrorStateBinding = viewCatalogueContentsTabBinding.e;
            progressBar.setVisibility(this.l.f6794a ? 0 : 8);
            View view = includeGenericErrorStateBinding.h;
            Intrinsics.g(view, "getRoot(...)");
            view.setVisibility(this.l.c != null ? 0 : 8);
            includeGenericErrorStateBinding.M(this.l.c);
            includeGenericErrorStateBinding.L(catalogueBrowseViewModel);
            this.i.setData(this.l.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        CatalogueBrowsePageTab catalogueBrowsePageTab = CatalogueBrowsePageTab.e;
        int i2 = R.id.progress_bar;
        if (i == 0) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_catalogue_browse_tab, viewGroup, false);
            if (((Guideline) ViewBindings.a(R.id.overlay_guideline, viewInflate)) != null) {
                ProgressBar progressBar = (ProgressBar) ViewBindings.a(R.id.progress_bar, viewInflate);
                if (progressBar != null) {
                    i2 = R.id.view_pager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.a(R.id.view_pager, viewInflate);
                    if (viewPager2 != null) {
                        ViewCatalogueBrowseTabBinding viewCatalogueBrowseTabBinding = new ViewCatalogueBrowseTabBinding((ConstraintLayout) viewInflate, progressBar, viewPager2);
                        viewPager2.setOffscreenPageLimit(1);
                        View childAt = viewPager2.getChildAt(0);
                        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                        RecyclerView recyclerView = (RecyclerView) childAt;
                        recyclerView.setPadding(0, 0, 0, recyclerView.getResources().getDimensionPixelSize(R.dimen.catalogue_browse_next_page_preview_height));
                        recyclerView.setClipToPadding(false);
                        viewPager2.setAdapter(this.h.getAdapter());
                        viewPager2.c(new ViewPager2.OnPageChangeCallback() { // from class: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseAdapter$getBrowseTabBinding$1$1$2
                            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                            public final void c(int i3) {
                                this.f6788a.h.onPageSelected(i3 + 1);
                            }
                        });
                        new EpoxyVisibilityTracker().a(recyclerView);
                        return new BrowseViewHolder(viewCatalogueBrowseTabBinding);
                    }
                }
            } else {
                i2 = R.id.overlay_guideline;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        }
        if (i != 1) {
            throw new IllegalArgumentException(YU.a.d(i, "Unexpected view type "));
        }
        View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_catalogue_contents_tab, viewGroup, false);
        View viewA = ViewBindings.a(R.id.error_view, viewInflate2);
        if (viewA != null) {
            int i3 = IncludeGenericErrorStateBinding.F;
            IncludeGenericErrorStateBinding includeGenericErrorStateBinding = (IncludeGenericErrorStateBinding) DataBindingUtil.f2545a.b(null, viewA, R.layout.include_generic_error_state);
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.a(R.id.progress_bar, viewInflate2);
            if (progressBar2 != null) {
                i2 = R.id.recycler_view;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.a(R.id.recycler_view, viewInflate2);
                if (recyclerView2 != null) {
                    ViewCatalogueContentsTabBinding viewCatalogueContentsTabBinding = new ViewCatalogueContentsTabBinding((ConstraintLayout) viewInflate2, includeGenericErrorStateBinding, progressBar2, recyclerView2);
                    ContentsEpoxyController contentsEpoxyController = this.i;
                    recyclerView2.setAdapter(contentsEpoxyController.getAdapter());
                    Context context = viewGroup.getContext();
                    Intrinsics.g(context, "getContext(...)");
                    recyclerView2.setLayoutManager(contentsEpoxyController.getLayoutManager(context));
                    return new ContentsViewHolder(viewCatalogueContentsTabBinding);
                }
            }
        } else {
            i2 = R.id.error_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
    }
}
