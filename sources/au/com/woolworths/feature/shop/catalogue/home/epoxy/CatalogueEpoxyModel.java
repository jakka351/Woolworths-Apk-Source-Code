package au.com.woolworths.feature.shop.catalogue.home.epoxy;

import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.feature.shop.catalogue.common.SimpleRequestListener;
import au.com.woolworths.feature.shop.catalogue.databinding.IncludeCatalogueHomeSneakPeekBinding;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHomeCardBinding;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/epoxy/CatalogueEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/feature/shop/catalogue/home/epoxy/CatalogueEpoxyModel$Holder;", "Holder", "SneakPeekDecoration", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueEpoxyModel extends EpoxyModelWithHolder<Holder> {
    public String n;
    public String o;
    public String p;
    public SneakPeekDecoration q;
    public String r;
    public float s;
    public au.com.woolworths.feature.rewards.card.overlay.ui.b t;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/epoxy/CatalogueEpoxyModel$Holder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Holder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemCatalogueHomeCardBinding f6850a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            int i = R.id.catalogue_home_card_view;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.a(R.id.catalogue_home_card_view, itemView);
            if (relativeLayout != null) {
                i = R.id.catalogue_home_image_progress_bar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.a(R.id.catalogue_home_image_progress_bar, itemView);
                if (progressBar != null) {
                    i = R.id.catalogue_home_image_view;
                    ImageView imageView = (ImageView) ViewBindings.a(R.id.catalogue_home_image_view, itemView);
                    if (imageView != null) {
                        i = R.id.catalogue_home_title_text_view;
                        TextView textView = (TextView) ViewBindings.a(R.id.catalogue_home_title_text_view, itemView);
                        if (textView != null) {
                            i = R.id.catalogue_home_validity_text_view;
                            TextView textView2 = (TextView) ViewBindings.a(R.id.catalogue_home_validity_text_view, itemView);
                            if (textView2 != null) {
                                i = R.id.decoration_end_guideline;
                                if (((Guideline) ViewBindings.a(R.id.decoration_end_guideline, itemView)) != null) {
                                    i = R.id.decoration_start_guideline;
                                    if (((Guideline) ViewBindings.a(R.id.decoration_start_guideline, itemView)) != null) {
                                        i = R.id.sneak_peek_decoration;
                                        View viewA = ViewBindings.a(R.id.sneak_peek_decoration, itemView);
                                        if (viewA != null) {
                                            int i2 = IncludeCatalogueHomeSneakPeekBinding.C;
                                            this.f6850a = new ItemCatalogueHomeCardBinding((ConstraintLayout) itemView, relativeLayout, progressBar, imageView, textView, textView2, (IncludeCatalogueHomeSneakPeekBinding) DataBindingUtil.f2545a.b(null, viewA, R.layout.include_catalogue_home_sneak_peek));
                                            return;
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

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/epoxy/CatalogueEpoxyModel$SneakPeekDecoration;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SneakPeekDecoration {

        /* renamed from: a, reason: collision with root package name */
        public final String f6851a;
        public final String b;
        public final String c;

        public SneakPeekDecoration(String str, String str2, String str3) {
            this.f6851a = str;
            this.b = str2;
            this.c = str3;
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
        ItemCatalogueHomeCardBinding itemCatalogueHomeCardBinding = holder.f6850a;
        if (itemCatalogueHomeCardBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView textView = itemCatalogueHomeCardBinding.h;
        TextView textView2 = itemCatalogueHomeCardBinding.g;
        ImageView imageView = itemCatalogueHomeCardBinding.f;
        RelativeLayout relativeLayout = itemCatalogueHomeCardBinding.d;
        IncludeCatalogueHomeSneakPeekBinding includeCatalogueHomeSneakPeekBinding = itemCatalogueHomeCardBinding.i;
        final int i = 0;
        relativeLayout.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.epoxy.a
            public final /* synthetic */ CatalogueEpoxyModel e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        CatalogueEpoxyModel catalogueEpoxyModel = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar = catalogueEpoxyModel.t;
                            if (bVar == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar.invoke();
                            Callback.h();
                            return;
                        } finally {
                            Callback.h();
                        }
                    case 1:
                        CatalogueEpoxyModel catalogueEpoxyModel2 = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar2 = catalogueEpoxyModel2.t;
                            if (bVar2 == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar2.invoke();
                            Callback.h();
                            return;
                        } finally {
                        }
                    default:
                        CatalogueEpoxyModel catalogueEpoxyModel3 = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar3 = catalogueEpoxyModel3.t;
                            if (bVar3 == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar3.invoke();
                            Callback.h();
                            return;
                        } finally {
                        }
                }
            }
        });
        String str = this.p;
        if (str == null) {
            Intrinsics.p("contentDescription");
            throw null;
        }
        relativeLayout.setContentDescription(str);
        imageView.setAlpha(this.s);
        SneakPeekDecoration sneakPeekDecoration = this.q;
        if (sneakPeekDecoration == null) {
            includeCatalogueHomeSneakPeekBinding.y.setVisibility(8);
        } else {
            includeCatalogueHomeSneakPeekBinding.y.setVisibility(0);
            includeCatalogueHomeSneakPeekBinding.B.setText(sneakPeekDecoration.f6851a);
            includeCatalogueHomeSneakPeekBinding.A.setText(sneakPeekDecoration.b);
            includeCatalogueHomeSneakPeekBinding.z.setText(sneakPeekDecoration.c);
        }
        String str2 = this.n;
        if (str2 == null) {
            Intrinsics.p("title");
            throw null;
        }
        textView2.setText(str2);
        final int i2 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.epoxy.a
            public final /* synthetic */ CatalogueEpoxyModel e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        CatalogueEpoxyModel catalogueEpoxyModel = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar = catalogueEpoxyModel.t;
                            if (bVar == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar.invoke();
                            Callback.h();
                            return;
                        } finally {
                            Callback.h();
                        }
                    case 1:
                        CatalogueEpoxyModel catalogueEpoxyModel2 = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar2 = catalogueEpoxyModel2.t;
                            if (bVar2 == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar2.invoke();
                            Callback.h();
                            return;
                        } finally {
                        }
                    default:
                        CatalogueEpoxyModel catalogueEpoxyModel3 = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar3 = catalogueEpoxyModel3.t;
                            if (bVar3 == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar3.invoke();
                            Callback.h();
                            return;
                        } finally {
                        }
                }
            }
        });
        String str3 = this.o;
        if (str3 == null) {
            Intrinsics.p("validity");
            throw null;
        }
        textView.setText(str3);
        final int i3 = 2;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.epoxy.a
            public final /* synthetic */ CatalogueEpoxyModel e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        CatalogueEpoxyModel catalogueEpoxyModel = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar = catalogueEpoxyModel.t;
                            if (bVar == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar.invoke();
                            Callback.h();
                            return;
                        } finally {
                            Callback.h();
                        }
                    case 1:
                        CatalogueEpoxyModel catalogueEpoxyModel2 = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar2 = catalogueEpoxyModel2.t;
                            if (bVar2 == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar2.invoke();
                            Callback.h();
                            return;
                        } finally {
                        }
                    default:
                        CatalogueEpoxyModel catalogueEpoxyModel3 = this.e;
                        Callback.g(view);
                        try {
                            au.com.woolworths.feature.rewards.card.overlay.ui.b bVar3 = catalogueEpoxyModel3.t;
                            if (bVar3 == null) {
                                Intrinsics.p("onCardClickListener");
                                throw null;
                            }
                            bVar3.invoke();
                            Callback.h();
                            return;
                        } finally {
                        }
                }
            }
        });
        final ProgressBar progressBar = itemCatalogueHomeCardBinding.e;
        progressBar.setVisibility(0);
        RequestManager requestManagerE = Glide.e(imageView);
        String str4 = this.r;
        if (str4 != null) {
            ((RequestBuilder) ((RequestBuilder) requestManagerE.l(str4).m()).e(R.drawable.catalogue_home_card_placeholder)).C(new SimpleRequestListener() { // from class: au.com.woolworths.feature.shop.catalogue.home.epoxy.CatalogueEpoxyModel$load$1
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
        return R.layout.item_catalogue_home_card;
    }
}
