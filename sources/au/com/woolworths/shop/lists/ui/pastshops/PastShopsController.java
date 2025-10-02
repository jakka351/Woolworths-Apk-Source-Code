package au.com.woolworths.shop.lists.ui.pastshops;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.LoadState;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.lists.ItemPastShopsEntryBindingModel_;
import au.com.woolworths.shop.lists.ItemPastShopsPaginationErrorStateBindingModel_;
import au.com.woolworths.shop.lists.ItemPastShopsPaginationLoadingStateBindingModel_;
import au.com.woolworths.shop.lists.data.model.PurchaseHistoryEvent;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0016H\u0016J\u0010\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018H\u0002J\u0018\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\f\u0010\u001e\u001a\u00020\u001f*\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Lau/com/woolworths/shop/lists/data/model/PurchaseHistoryEvent;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsClickListener;", "<init>", "(Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsClickListener;)V", "value", "Landroidx/paging/LoadState;", "networkState", "getNetworkState", "()Landroidx/paging/LoadState;", "setNetworkState", "(Landroidx/paging/LoadState;)V", "buildItemModel", "Lcom/airbnb/epoxy/EpoxyModel;", "currentPosition", "", "item", "addModels", "", "models", "", "buildLoadingState", "Lau/com/woolworths/shop/lists/ItemPastShopsPaginationLoadingStateBindingModel_;", "kotlin.jvm.PlatformType", "buildErrorState", "Lau/com/woolworths/shop/lists/ItemPastShopsPaginationErrorStateBindingModel_;", "throwable", "", "buildErrorStateLabel", "Lau/com/woolworths/android/onesite/models/text/ResText;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PastShopsController extends PagingDataEpoxyController<PurchaseHistoryEvent> {
    public static final int $stable = 8;

    @NotNull
    private final PastShopsClickListener listener;

    @Nullable
    private LoadState networkState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PastShopsController(@NotNull PastShopsClickListener listener) {
        super(null, null, null, 7, null);
        Intrinsics.h(listener, "listener");
        this.listener = listener;
    }

    private final ItemPastShopsPaginationErrorStateBindingModel_ buildErrorState(Throwable throwable) {
        ItemPastShopsPaginationErrorStateBindingModel_ itemPastShopsPaginationErrorStateBindingModel_ = new ItemPastShopsPaginationErrorStateBindingModel_();
        itemPastShopsPaginationErrorStateBindingModel_.M();
        ResText resTextBuildErrorStateLabel = buildErrorStateLabel(throwable);
        itemPastShopsPaginationErrorStateBindingModel_.t();
        itemPastShopsPaginationErrorStateBindingModel_.n = resTextBuildErrorStateLabel;
        PastShopsClickListener pastShopsClickListener = this.listener;
        itemPastShopsPaginationErrorStateBindingModel_.t();
        itemPastShopsPaginationErrorStateBindingModel_.o = pastShopsClickListener;
        return itemPastShopsPaginationErrorStateBindingModel_;
    }

    private final ResText buildErrorStateLabel(Throwable th) {
        if (th instanceof NoConnectivityException) {
            return new ResText(R.string.past_shops_connection_error_message);
        }
        if (th instanceof ServerErrorException) {
            return new ResText(R.string.past_shops_server_error_message);
        }
        throw new IllegalStateException("Unexpected exception: " + th, th);
    }

    private final ItemPastShopsPaginationLoadingStateBindingModel_ buildLoadingState() {
        ItemPastShopsPaginationLoadingStateBindingModel_ itemPastShopsPaginationLoadingStateBindingModel_ = new ItemPastShopsPaginationLoadingStateBindingModel_();
        itemPastShopsPaginationLoadingStateBindingModel_.M();
        return itemPastShopsPaginationLoadingStateBindingModel_;
    }

    @Override // com.airbnb.epoxy.paging3.PagingDataEpoxyController
    public void addModels(@NotNull List<? extends EpoxyModel<?>> models) {
        Intrinsics.h(models, "models");
        List<? extends EpoxyModel<?>> list = models;
        ArrayList arrayListJ0 = CollectionsKt.J0(list);
        if (!list.isEmpty()) {
            LoadState loadState = this.networkState;
            LoadState.Error error = loadState instanceof LoadState.Error ? (LoadState.Error) loadState : null;
            Throwable th = error != null ? error.b : null;
            if (th != null) {
                ItemPastShopsPaginationErrorStateBindingModel_ itemPastShopsPaginationErrorStateBindingModel_BuildErrorState = buildErrorState(th);
                Intrinsics.g(itemPastShopsPaginationErrorStateBindingModel_BuildErrorState, "buildErrorState(...)");
                arrayListJ0.add(itemPastShopsPaginationErrorStateBindingModel_BuildErrorState);
            } else if (loadState instanceof LoadState.Loading) {
                ItemPastShopsPaginationLoadingStateBindingModel_ itemPastShopsPaginationLoadingStateBindingModel_BuildLoadingState = buildLoadingState();
                Intrinsics.g(itemPastShopsPaginationLoadingStateBindingModel_BuildLoadingState, "buildLoadingState(...)");
                arrayListJ0.add(itemPastShopsPaginationLoadingStateBindingModel_BuildLoadingState);
            }
        }
        super.addModels(arrayListJ0);
    }

    @Nullable
    public final LoadState getNetworkState() {
        return this.networkState;
    }

    public final void setNetworkState(@Nullable LoadState loadState) {
        this.networkState = loadState;
        requestModelBuild();
    }

    @Override // com.airbnb.epoxy.paging3.PagingDataEpoxyController
    @NotNull
    public EpoxyModel<?> buildItemModel(int currentPosition, @Nullable PurchaseHistoryEvent item) {
        if (item == null) {
            throw new IllegalStateException("Paged past shops cannot be empty");
        }
        ItemPastShopsEntryBindingModel_ itemPastShopsEntryBindingModel_ = new ItemPastShopsEntryBindingModel_();
        itemPastShopsEntryBindingModel_.M(item.getBasketId());
        itemPastShopsEntryBindingModel_.t();
        itemPastShopsEntryBindingModel_.n = item;
        PastShopsClickListener pastShopsClickListener = this.listener;
        itemPastShopsEntryBindingModel_.t();
        itemPastShopsEntryBindingModel_.o = pastShopsClickListener;
        return itemPastShopsEntryBindingModel_;
    }
}
