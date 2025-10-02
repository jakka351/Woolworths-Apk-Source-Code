package au.com.woolworths.feature.shop.catalogue.termsandconditions;

import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemTermsAndConditionsBinding;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/termsandconditions/TermEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/feature/shop/catalogue/termsandconditions/TermEpoxyModel$Holder;", "Holder", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TermEpoxyModel extends EpoxyModelWithHolder<Holder> {
    public String n;
    public String o;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/termsandconditions/TermEpoxyModel$Holder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Holder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemTermsAndConditionsBinding f6957a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            int i = R.id.catalogue_term_body_text_view;
            TextView textView = (TextView) ViewBindings.a(R.id.catalogue_term_body_text_view, itemView);
            if (textView != null) {
                i = R.id.catalogue_term_title_text_view;
                TextView textView2 = (TextView) ViewBindings.a(R.id.catalogue_term_title_text_view, itemView);
                if (textView2 != null) {
                    this.f6957a = new ItemTermsAndConditionsBinding((ConstraintLayout) itemView, textView, textView2);
                    return;
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
        ItemTermsAndConditionsBinding itemTermsAndConditionsBinding = holder.f6957a;
        if (itemTermsAndConditionsBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView textView = itemTermsAndConditionsBinding.e;
        String str = this.n;
        if (str == null) {
            Intrinsics.p("title");
            throw null;
        }
        textView.setText(str);
        TextView textView2 = itemTermsAndConditionsBinding.d;
        String str2 = this.o;
        if (str2 != null) {
            textView2.setText(str2);
        } else {
            Intrinsics.p("body");
            throw null;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_terms_and_conditions;
    }
}
