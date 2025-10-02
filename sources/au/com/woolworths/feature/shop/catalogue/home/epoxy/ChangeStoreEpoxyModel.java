package au.com.woolworths.feature.shop.catalogue.home.epoxy;

import android.text.SpannableStringBuilder;
import android.text.style.TtsSpan;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHomeChangeStoreBinding;
import au.com.woolworths.feature.shop.catalogue.home.c;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/epoxy/ChangeStoreEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/feature/shop/catalogue/home/epoxy/ChangeStoreEpoxyModel$Holder;", "Holder", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class ChangeStoreEpoxyModel extends EpoxyModelWithHolder<Holder> {
    public String n;
    public String o;
    public String p;
    public c q;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/epoxy/ChangeStoreEpoxyModel$Holder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Holder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemCatalogueHomeChangeStoreBinding f6852a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            int i = R.id.change_store_button;
            Button button = (Button) ViewBindings.a(R.id.change_store_button, itemView);
            if (button != null) {
                i = R.id.store_name_text_view;
                TextView textView = (TextView) ViewBindings.a(R.id.store_name_text_view, itemView);
                if (textView != null) {
                    this.f6852a = new ItemCatalogueHomeChangeStoreBinding((ConstraintLayout) itemView, button, textView);
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
        ItemCatalogueHomeChangeStoreBinding itemCatalogueHomeChangeStoreBinding = holder.f6852a;
        if (itemCatalogueHomeChangeStoreBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView textView = itemCatalogueHomeChangeStoreBinding.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = this.n;
        if (str == null) {
            Intrinsics.p("storeName");
            throw null;
        }
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) str);
        ItemCatalogueHomeChangeStoreBinding itemCatalogueHomeChangeStoreBinding2 = holder.f6852a;
        if (itemCatalogueHomeChangeStoreBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append(itemCatalogueHomeChangeStoreBinding2.d.getContext().getText(R.string.catalogue_home_change_store_location_separator));
        Intrinsics.g(spannableStringBuilderAppend2, "append(...)");
        String str2 = this.o;
        if (str2 == null) {
            Intrinsics.p("postcode");
            throw null;
        }
        TtsSpan ttsSpanBuild = new TtsSpan.DigitsBuilder(str2).build();
        Intrinsics.g(ttsSpanBuild, "build(...)");
        int length = spannableStringBuilderAppend2.length();
        String str3 = this.o;
        if (str3 == null) {
            Intrinsics.p("postcode");
            throw null;
        }
        spannableStringBuilderAppend2.append((CharSequence) str3);
        spannableStringBuilderAppend2.setSpan(ttsSpanBuild, length, spannableStringBuilderAppend2.length(), 17);
        textView.setText(spannableStringBuilderAppend2);
        ItemCatalogueHomeChangeStoreBinding itemCatalogueHomeChangeStoreBinding3 = holder.f6852a;
        if (itemCatalogueHomeChangeStoreBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        Button button = itemCatalogueHomeChangeStoreBinding3.e;
        String str4 = this.p;
        if (str4 == null) {
            Intrinsics.p("buttonLabel");
            throw null;
        }
        button.setText(str4);
        ItemCatalogueHomeChangeStoreBinding itemCatalogueHomeChangeStoreBinding4 = holder.f6852a;
        if (itemCatalogueHomeChangeStoreBinding4 != null) {
            itemCatalogueHomeChangeStoreBinding4.e.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 7));
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_catalogue_home_change_store;
    }
}
