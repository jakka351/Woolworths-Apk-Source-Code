package au.com.woolworths.feature.shop.catalogue.home.epoxy;

import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.feature.shop.catalogue.common.SimpleRequestListener;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHomeSpecialsCardBinding;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/epoxy/SpecialsEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/feature/shop/catalogue/home/epoxy/SpecialsEpoxyModel$Holder;", "Holder", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SpecialsEpoxyModel extends EpoxyModelWithHolder<Holder> {
    public String n;
    public String o;
    public String p;
    public au.com.woolworths.feature.rewards.card.overlay.ui.b q;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/epoxy/SpecialsEpoxyModel$Holder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Holder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemCatalogueHomeSpecialsCardBinding f6853a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            int i = R.id.catalogue_home_specials_card_view;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.a(R.id.catalogue_home_specials_card_view, itemView);
            if (materialCardView != null) {
                i = R.id.catalogue_home_specials_image_progress_bar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.a(R.id.catalogue_home_specials_image_progress_bar, itemView);
                if (progressBar != null) {
                    i = R.id.catalogue_home_specials_image_view;
                    ImageView imageView = (ImageView) ViewBindings.a(R.id.catalogue_home_specials_image_view, itemView);
                    if (imageView != null) {
                        i = R.id.catalogue_home_specials_title_text_view;
                        TextView textView = (TextView) ViewBindings.a(R.id.catalogue_home_specials_title_text_view, itemView);
                        if (textView != null) {
                            this.f6853a = new ItemCatalogueHomeSpecialsCardBinding((ConstraintLayout) itemView, materialCardView, progressBar, imageView, textView);
                            return;
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
    public final void h(Holder holder) {
        Intrinsics.h(holder, "holder");
        ItemCatalogueHomeSpecialsCardBinding itemCatalogueHomeSpecialsCardBinding = holder.f6853a;
        if (itemCatalogueHomeSpecialsCardBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView textView = itemCatalogueHomeSpecialsCardBinding.g;
        MaterialCardView materialCardView = itemCatalogueHomeSpecialsCardBinding.d;
        final int i = 0;
        materialCardView.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.epoxy.b
            public final /* synthetic */ SpecialsEpoxyModel e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        SpecialsEpoxyModel specialsEpoxyModel = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar = specialsEpoxyModel.q;
                            if (bVar == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar.invoke();
                            Callback.h();
                            return;
                        } finally {
                        }
                    default:
                        SpecialsEpoxyModel specialsEpoxyModel2 = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar2 = specialsEpoxyModel2.q;
                            if (bVar2 == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar2.invoke();
                            Callback.h();
                            return;
                        } finally {
                        }
                }
            }
        });
        String str = this.o;
        if (str == null) {
            Intrinsics.p("contentDescription");
            throw null;
        }
        materialCardView.setContentDescription(str);
        String str2 = this.n;
        if (str2 == null) {
            Intrinsics.p("title");
            throw null;
        }
        textView.setText(str2);
        final int i2 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.epoxy.b
            public final /* synthetic */ SpecialsEpoxyModel e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        SpecialsEpoxyModel specialsEpoxyModel = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar = specialsEpoxyModel.q;
                            if (bVar == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar.invoke();
                            Callback.h();
                            return;
                        } finally {
                        }
                    default:
                        SpecialsEpoxyModel specialsEpoxyModel2 = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar2 = specialsEpoxyModel2.q;
                            if (bVar2 == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar2.invoke();
                            Callback.h();
                            return;
                        } finally {
                        }
                }
            }
        });
        ImageView imageView = itemCatalogueHomeSpecialsCardBinding.f;
        final ProgressBar progressBar = itemCatalogueHomeSpecialsCardBinding.e;
        progressBar.setVisibility(0);
        RequestManager requestManagerE = Glide.e(imageView);
        String str3 = this.p;
        if (str3 != null) {
            ((RequestBuilder) ((RequestBuilder) requestManagerE.l(str3).m()).e(R.drawable.catalogue_home_card_placeholder)).C(new SimpleRequestListener() { // from class: au.com.woolworths.feature.shop.catalogue.home.epoxy.SpecialsEpoxyModel$load$1
                @Override // au.com.woolworths.feature.shop.catalogue.common.SimpleRequestListener
                public final void a() {
                    progressBar.setVisibility(8);
                }

                @Override // au.com.woolworths.feature.shop.catalogue.common.SimpleRequestListener
                public final void b() {
                    progressBar.setVisibility(8);
                }
            }).H(imageView);
        } else {
            Intrinsics.p("image");
            throw null;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_catalogue_home_specials_card;
    }
}
