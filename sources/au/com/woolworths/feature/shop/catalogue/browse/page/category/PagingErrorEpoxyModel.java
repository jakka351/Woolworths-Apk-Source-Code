package au.com.woolworths.feature.shop.catalogue.browse.page.category;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.feature.shop.catalogue.browse.page.PageEpoxyController;
import au.com.woolworths.feature.shop.catalogue.databinding.ViewCatalogueBrowsePagingErrorBinding;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/category/PagingErrorEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/feature/shop/catalogue/browse/page/category/PagingErrorEpoxyModel$Holder;", "Holder", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PagingErrorEpoxyModel extends EpoxyModelWithHolder<Holder> {
    public FullPageErrorCause n;
    public PageEpoxyController o;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/category/PagingErrorEpoxyModel$Holder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Holder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ViewCatalogueBrowsePagingErrorBinding f6813a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            int i = R.id.error_view;
            View viewA = ViewBindings.a(R.id.error_view, itemView);
            if (viewA != null) {
                int i2 = IncludeGenericErrorStateBinding.F;
                IncludeGenericErrorStateBinding includeGenericErrorStateBinding = (IncludeGenericErrorStateBinding) DataBindingUtil.f2545a.b(null, viewA, R.layout.include_generic_error_state);
                if (((Guideline) ViewBindings.a(R.id.overlay_guideline, itemView)) != null) {
                    this.f6813a = new ViewCatalogueBrowsePagingErrorBinding((ConstraintLayout) itemView, includeGenericErrorStateBinding);
                    return;
                }
                i = R.id.overlay_guideline;
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
        ViewCatalogueBrowsePagingErrorBinding viewCatalogueBrowsePagingErrorBinding = holder.f6813a;
        if (viewCatalogueBrowsePagingErrorBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = viewCatalogueBrowsePagingErrorBinding.d;
        FullPageErrorCause fullPageErrorCause = this.n;
        if (fullPageErrorCause == null) {
            Intrinsics.p("errorState");
            throw null;
        }
        includeGenericErrorStateBinding.M(fullPageErrorCause);
        PageEpoxyController pageEpoxyController = this.o;
        if (pageEpoxyController != null) {
            includeGenericErrorStateBinding.L(pageEpoxyController);
        } else {
            Intrinsics.p("clickHandler");
            throw null;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.view_catalogue_browse_paging_error;
    }
}
