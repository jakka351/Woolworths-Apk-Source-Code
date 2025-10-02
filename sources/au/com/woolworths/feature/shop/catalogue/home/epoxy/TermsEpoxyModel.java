package au.com.woolworths.feature.shop.catalogue.home.epoxy;

import android.view.View;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHomeTermsBinding;
import au.com.woolworths.feature.shop.catalogue.home.c;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/epoxy/TermsEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/feature/shop/catalogue/home/epoxy/TermsEpoxyModel$Holder;", "Holder", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TermsEpoxyModel extends EpoxyModelWithHolder<Holder> {
    public c n;
    public String o;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/epoxy/TermsEpoxyModel$Holder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Holder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemCatalogueHomeTermsBinding f6854a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            Button button = (Button) ViewBindings.a(R.id.terms_and_conditions_button, itemView);
            if (button == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(R.id.terms_and_conditions_button)));
            }
            this.f6854a = new ItemCatalogueHomeTermsBinding((ConstraintLayout) itemView, button);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void h(Holder holder) {
        Intrinsics.h(holder, "holder");
        ItemCatalogueHomeTermsBinding itemCatalogueHomeTermsBinding = holder.f6854a;
        if (itemCatalogueHomeTermsBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        itemCatalogueHomeTermsBinding.d.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 8));
        ItemCatalogueHomeTermsBinding itemCatalogueHomeTermsBinding2 = holder.f6854a;
        if (itemCatalogueHomeTermsBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        Button button = itemCatalogueHomeTermsBinding2.d;
        String str = this.o;
        if (str != null) {
            button.setText(str);
        } else {
            Intrinsics.p(AnnotatedPrivateKey.LABEL);
            throw null;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_catalogue_home_terms;
    }
}
