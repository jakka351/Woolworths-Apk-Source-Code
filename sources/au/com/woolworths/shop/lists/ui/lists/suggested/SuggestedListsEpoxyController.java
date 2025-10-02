package au.com.woolworths.shop.lists.ui.lists.suggested;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.ui.lists.compose.SuggestedListItemCardKt;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.paging3.PagedListEpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsEpoxyController;", "Lcom/airbnb/epoxy/paging3/PagedListEpoxyController;", "Lau/com/woolworths/shop/lists/data/model/SuggestedListItem;", "onSuggestedListItemClicked", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "Lau/com/woolworths/pagingutils/NetworkState;", "networkState", "getNetworkState", "()Lau/com/woolworths/pagingutils/NetworkState;", "setNetworkState", "(Lau/com/woolworths/pagingutils/NetworkState;)V", "buildItemModel", "Lcom/airbnb/epoxy/EpoxyModel;", "currentPosition", "", "item", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SuggestedListsEpoxyController extends PagedListEpoxyController<SuggestedListItem> {
    public static final int $stable = 8;

    @Nullable
    private NetworkState networkState;

    @NotNull
    private final Function1<SuggestedListItem, Unit> onSuggestedListItemClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuggestedListsEpoxyController(@NotNull Function1<? super SuggestedListItem, Unit> onSuggestedListItemClicked) {
        super(null, null, null, 7, null);
        Intrinsics.h(onSuggestedListItemClicked, "onSuggestedListItemClicked");
        this.onSuggestedListItemClicked = onSuggestedListItemClicked;
    }

    @Nullable
    public final NetworkState getNetworkState() {
        return this.networkState;
    }

    public final void setNetworkState(@Nullable NetworkState networkState) {
        this.networkState = networkState;
        requestModelBuild();
    }

    @Override // com.airbnb.epoxy.paging3.PagedListEpoxyController
    @NotNull
    public EpoxyModel<?> buildItemModel(int currentPosition, @Nullable final SuggestedListItem item) {
        if (item == null) {
            throw new IllegalStateException("Unknown type or null paging item");
        }
        ComposeEpoxyModel composeEpoxyModel = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsEpoxyController$buildItemModel$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SuggestedListItem suggestedListItem = item;
                    final SuggestedListsEpoxyController suggestedListsEpoxyController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-894781941, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsEpoxyController$buildItemModel$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7);
                                composer2.o(-1633490746);
                                SuggestedListsEpoxyController suggestedListsEpoxyController2 = suggestedListsEpoxyController;
                                boolean zI = composer2.I(suggestedListsEpoxyController2);
                                SuggestedListItem suggestedListItem2 = suggestedListItem;
                                boolean zI2 = zI | composer2.I(suggestedListItem2);
                                Object objG = composer2.G();
                                if (zI2 || objG == Composer.Companion.f1624a) {
                                    objG = new l(18, suggestedListsEpoxyController2, suggestedListItem2);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                SuggestedListItemCardKt.a(suggestedListItem2, (Function1) objG, modifierJ, composer2, KyberEngine.KyberPolyBytes, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1378181181));
        composeEpoxyModel.r(Integer.valueOf(currentPosition));
        return composeEpoxyModel;
    }
}
