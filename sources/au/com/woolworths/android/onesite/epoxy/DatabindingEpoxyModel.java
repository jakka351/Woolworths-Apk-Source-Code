package au.com.woolworths.android.onesite.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.EpoxyModel;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/epoxy/DatabindingEpoxyModel;", "Landroidx/databinding/ViewDataBinding;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DatabindingEpoxyModel<T extends ViewDataBinding> extends EpoxyModel<View> {
    public final int n;
    public ViewDataBinding o;

    public DatabindingEpoxyModel(int i) {
        this.n = i;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        View view = (View) obj;
        Intrinsics.h(view, "view");
        this.o = null;
    }

    public abstract void C();

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatabindingEpoxyModel) || !super.equals(obj)) {
            return false;
        }
        ViewDataBinding viewDataBinding = this.o;
        return ((viewDataBinding == null && ((DatabindingEpoxyModel) obj).o == null) || viewDataBinding == null || viewDataBinding.equals(((DatabindingEpoxyModel) obj).o)) ? false : true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        View view = (View) obj;
        Intrinsics.h(view, "view");
        this.o = DataBindingUtil.b(view);
        C();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        ViewDataBinding viewDataBinding = this.o;
        return iHashCode + (viewDataBinding != null ? viewDataBinding.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        View view = DataBindingUtil.c(LayoutInflater.from(viewGroup.getContext()), this.n, viewGroup, false, null).h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k, reason: from getter */
    public final int getN() {
        return this.n;
    }
}
