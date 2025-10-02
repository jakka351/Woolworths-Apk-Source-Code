package com.woolworths.scanlibrary.ui.weighted;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.ui.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.databinding.ActivityWeightedArticleSelectionBinding;
import com.woolworths.scanlibrary.databinding.ContentWeightedArticleSelectionBinding;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.weighted.WeightedListContract;
import com.woolworths.scanlibrary.util.adapter.RecyclerAdapter;
import com.woolworths.scanlibrary.util.extensions.ImageViewExtKt;
import com.woolworths.scanlibrary.util.widget.PriceView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/weighted/WeightedArticleSelectionActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/weighted/WeightedListContract$Presenter;", "Lcom/woolworths/scanlibrary/di/session/CartSessionScopedActivity;", "Lcom/woolworths/scanlibrary/ui/weighted/WeightedListContract$View;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WeightedArticleSelectionActivity extends DaggerBaseActivity<WeightedListContract.Presenter> implements CartSessionScopedActivity, WeightedListContract.View {
    public static final /* synthetic */ int J = 0;
    public List G = new ArrayList();
    public float H;
    public ActivityWeightedArticleSelectionBinding I;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/weighted/WeightedArticleSelectionActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_weighted_article_selection;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        this.I = (ActivityWeightedArticleSelectionBinding) DataBindingUtil.d(this, R.layout.activity_weighted_article_selection);
        String stringExtra = getIntent().getStringExtra("itemWeightBarCode");
        if (stringExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.H = ((WeightedListContract.Presenter) S4()).X(stringExtra);
        ActivityWeightedArticleSelectionBinding activityWeightedArticleSelectionBinding = this.I;
        if (activityWeightedArticleSelectionBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityWeightedArticleSelectionBinding.z.y);
        ActivityWeightedArticleSelectionBinding activityWeightedArticleSelectionBinding2 = this.I;
        if (activityWeightedArticleSelectionBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityWeightedArticleSelectionBinding2.z.z.setText(getString(R.string.sng_title_activity_assign_weight));
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
        supportActionBar.t();
        supportActionBar.s(true);
        this.G = ((WeightedListContract.Presenter) S4()).j();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        ActivityWeightedArticleSelectionBinding activityWeightedArticleSelectionBinding3 = this.I;
        if (activityWeightedArticleSelectionBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityWeightedArticleSelectionBinding3.y.A.setLayoutManager(linearLayoutManager);
        if (((WeightedListContract.Presenter) S4()).j().isEmpty()) {
            ActivityWeightedArticleSelectionBinding activityWeightedArticleSelectionBinding4 = this.I;
            if (activityWeightedArticleSelectionBinding4 == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            ContentWeightedArticleSelectionBinding contentWeightedArticleSelectionBinding = activityWeightedArticleSelectionBinding4.y;
            contentWeightedArticleSelectionBinding.A.setVisibility(8);
            contentWeightedArticleSelectionBinding.z.setVisibility(0);
            contentWeightedArticleSelectionBinding.C.setVisibility(8);
            contentWeightedArticleSelectionBinding.y.setVisibility(0);
        } else {
            ActivityWeightedArticleSelectionBinding activityWeightedArticleSelectionBinding5 = this.I;
            if (activityWeightedArticleSelectionBinding5 == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            ContentWeightedArticleSelectionBinding contentWeightedArticleSelectionBinding2 = activityWeightedArticleSelectionBinding5.y;
            contentWeightedArticleSelectionBinding2.A.setVisibility(0);
            contentWeightedArticleSelectionBinding2.C.setVisibility(0);
            contentWeightedArticleSelectionBinding2.y.setVisibility(8);
            contentWeightedArticleSelectionBinding2.z.setVisibility(8);
        }
        ActivityWeightedArticleSelectionBinding activityWeightedArticleSelectionBinding6 = this.I;
        if (activityWeightedArticleSelectionBinding6 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        RecyclerView recyclerView = activityWeightedArticleSelectionBinding6.y.A;
        final List list = this.G;
        recyclerView.setAdapter(new RecyclerAdapter<Item, RecyclerView.ViewHolder>(list) { // from class: com.woolworths.scanlibrary.ui.weighted.WeightedArticleSelectionActivity$getShoppingCartView$1
            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter
            public final void G(RecyclerView.ViewHolder viewHolder, Object obj, int i) {
                Item model = (Item) obj;
                Intrinsics.h(model, "model");
                if (viewHolder instanceof WeightedItemViewHolder) {
                    WeightedItemViewHolder weightedItemViewHolder = (WeightedItemViewHolder) viewHolder;
                    ImageViewExtKt.a(weightedItemViewHolder.c, model.getImages().getThumbnail());
                    PriceView priceView = weightedItemViewHolder.f21360a;
                    int dollars = model.getUnitPrice().getDollars();
                    int cents = model.getUnitPrice().getCents();
                    priceView.d = dollars;
                    priceView.e = cents;
                    priceView.b();
                    priceView.setUnit(priceView.getContext().getString(R.string.sng_label_uom, model.getInstoreprice().getUom()));
                    weightedItemViewHolder.b.setText(model.getDescription());
                    viewHolder.itemView.setOnClickListener(new a(26, this.j, model));
                }
            }

            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_item_to_weigh, viewGroup, false);
                Intrinsics.e(viewInflate);
                return new WeightedItemViewHolder(viewInflate);
            }
        });
        ActivityWeightedArticleSelectionBinding activityWeightedArticleSelectionBinding7 = this.I;
        if (activityWeightedArticleSelectionBinding7 != null) {
            activityWeightedArticleSelectionBinding7.y.y.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 14));
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.ui.weighted.WeightedListContract.View
    public final void m(Item cartItem) {
        Intrinsics.h(cartItem, "cartItem");
        Intent intent = new Intent();
        intent.putExtra("cartItemLineNo", cartItem.getLinenumber());
        intent.putExtra("productWeight", this.H);
        setResult(-1, intent);
        finish();
    }

    @Override // com.woolworths.scanlibrary.ui.weighted.WeightedListContract.View
    public final String t0() {
        return getIntent().getStringExtra("eanItemWeightRequired");
    }
}
