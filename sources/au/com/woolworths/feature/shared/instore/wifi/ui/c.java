package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import au.com.woolworths.feature.shop.bundles.BundlesUiEvent;
import au.com.woolworths.feature.shop.bundles.ui.ComposableSingletons$BundlesLoadingSkeletonUiKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.product.models.ProductCard;
import coil3.compose.AsyncImagePainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InstoreWifiContract.ErrorType it = (InstoreWifiContract.ErrorType) obj;
                Intrinsics.h(it, "it");
                break;
            case 1:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                break;
            case 2:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                break;
            case 3:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                break;
            case 4:
                break;
            case 5:
                AsyncImagePainter.State.Loading it2 = (AsyncImagePainter.State.Loading) obj;
                Intrinsics.h(it2, "it");
                Timber.f27013a.b("Loading Image", new Object[0]);
                break;
            case 6:
                AsyncImagePainter.State.Success it3 = (AsyncImagePainter.State.Success) obj;
                Intrinsics.h(it3, "it");
                Timber.f27013a.b("Loading Image Success", new Object[0]);
                break;
            case 7:
                AsyncImagePainter.State.Error it4 = (AsyncImagePainter.State.Error) obj;
                Intrinsics.h(it4, "it");
                Timber.Forest forest = Timber.f27013a;
                forest.b("Loading Image Failed", new Object[0]);
                forest.b(it4.b.c.getLocalizedMessage(), new Object[0]);
                break;
            case 8:
                BroadcastBannerData it5 = (BroadcastBannerData) obj;
                Intrinsics.h(it5, "it");
                break;
            case 9:
                BroadcastBannerData it6 = (BroadcastBannerData) obj;
                Intrinsics.h(it6, "it");
                break;
            case 10:
                BroadcastBannerData it7 = (BroadcastBannerData) obj;
                Intrinsics.h(it7, "it");
                break;
            case 11:
                BroadcastBannerData it8 = (BroadcastBannerData) obj;
                Intrinsics.h(it8, "it");
                break;
            case 12:
                BroadcastBannerData it9 = (BroadcastBannerData) obj;
                Intrinsics.h(it9, "it");
                break;
            case 13:
                BroadcastBannerData it10 = (BroadcastBannerData) obj;
                Intrinsics.h(it10, "it");
                break;
            case 14:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                break;
            case 15:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                break;
            case 16:
                SemanticsPropertyReceiver clearAndSetSemantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics2, "$this$clearAndSetSemantics");
                break;
            case 17:
                ProductCard it11 = (ProductCard) obj;
                Intrinsics.h(it11, "it");
                break;
            case 18:
                SemanticsPropertyReceiver clearAndSetSemantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics3, "$this$clearAndSetSemantics");
                break;
            case 19:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.u(semantics3);
                break;
            case 20:
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.h(LazyRow, "$this$LazyRow");
                LazyListScope.g(LazyRow, 3, null, ComposableSingletons$BundlesLoadingSkeletonUiKt.c, 6);
                break;
            case 21:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                LazyListScope.g(LazyColumn, 4, null, ComposableSingletons$BundlesLoadingSkeletonUiKt.f6775a, 6);
                break;
            case 22:
                BundlesUiEvent it12 = (BundlesUiEvent) obj;
                Intrinsics.h(it12, "it");
                break;
            case 23:
                ProductCard it13 = (ProductCard) obj;
                Intrinsics.h(it13, "it");
                break;
            case 24:
                ProductCard it14 = (ProductCard) obj;
                Intrinsics.h(it14, "it");
                break;
            case 25:
                ProductCard it15 = (ProductCard) obj;
                Intrinsics.h(it15, "it");
                break;
            case 26:
                ProductCard it16 = (ProductCard) obj;
                Intrinsics.h(it16, "it");
                break;
            case 27:
                ProductCard it17 = (ProductCard) obj;
                Intrinsics.h(it17, "it");
                break;
            case 28:
                ProductCard it18 = (ProductCard) obj;
                Intrinsics.h(it18, "it");
                break;
            default:
                ProductCard it19 = (ProductCard) obj;
                Intrinsics.h(it19, "it");
                break;
        }
        return Unit.f24250a;
    }
}
