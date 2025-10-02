package au.com.woolworths.feature.product.list.legacy;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdUnitKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.VideoAdUnitData;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0005²\u0006\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/VideoAdUnitComposeEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Landroidx/compose/ui/platform/ComposeView;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ViewState;", "viewState", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideoAdUnitComposeEpoxyModel extends EpoxyModelWithView<ComposeView> {
    public final ComposeEpoxyModel n;

    public VideoAdUnitComposeEpoxyModel(final ProductListViewModel viewModel, final ProductCardConfig productCardConfig, final VideoAdUnitData data) {
        Intrinsics.h(data, "data");
        Intrinsics.h(viewModel, "viewModel");
        this.n = new ComposeEpoxyModel(new Object[]{data}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.VideoAdUnitComposeEpoxyModel$wrappedModel$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final VideoAdUnitData videoAdUnitData = data;
                    final ProductCardConfig productCardConfig2 = productCardConfig;
                    final ProductListViewModel productListViewModel = viewModel;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1206104046, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.VideoAdUnitComposeEpoxyModel$wrappedModel$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            VideoAdPlayerState videoAdPlayerState;
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                MutableState mutableStateA = LiveDataAdapterKt.a(productListViewModel.F, composer2);
                                Modifier.Companion companion = Modifier.Companion.d;
                                Modifier modifierE = SizeKt.e(companion, 1.0f);
                                ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.m, composer2, 6);
                                int p = composer2.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
                                ComposeUiNode.e3.getClass();
                                Function0 function0 = ComposeUiNode.Companion.b;
                                if (composer2.w() == null) {
                                    ComposablesKt.b();
                                    throw null;
                                }
                                composer2.i();
                                if (composer2.getO()) {
                                    composer2.K(function0);
                                } else {
                                    composer2.e();
                                }
                                Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                Function2 function2 = ComposeUiNode.Companion.j;
                                if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                    androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                }
                                Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                VideoAdUnitData videoAdUnitData2 = videoAdUnitData;
                                VideoAdData videoAd = videoAdUnitData2.getVideoAd();
                                ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                                if (viewState == null || (videoAdPlayerState = viewState.u) == null) {
                                    videoAdPlayerState = VideoAdPlayerState.g;
                                }
                                composer2.o(5004770);
                                ProductListViewModel productListViewModel2 = productListViewModel;
                                boolean zI = composer2.I(productListViewModel2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    VideoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$1$1 videoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$1$1 = new VideoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$1$1(1, productListViewModel2, ProductListViewModel.class, "onDisplayVideoAdBottomSheet", "onDisplayVideoAdBottomSheet(Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdBottomSheet;)V", 0);
                                    composer2.A(videoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$1$1);
                                    objG = videoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(productListViewModel2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new VideoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$2$1(1, productListViewModel2, ProductListViewModel.class, "onVideoAdPlayerStateChanged", "onVideoAdPlayerStateChanged(Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdPlayerState;)V", 0);
                                    composer2.A(objG2);
                                }
                                KFunction kFunction2 = (KFunction) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(productListViewModel2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    VideoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$3$1 videoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$3$1 = new VideoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$3$1(3, productListViewModel2, ProductListViewModel.class, "onVideoAdPositionChange", "onVideoAdPositionChange(FFF)V", 0);
                                    composer2.A(videoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$3$1);
                                    objG3 = videoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$3$1;
                                }
                                KFunction kFunction3 = (KFunction) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(productListViewModel2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    objG4 = new VideoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$4$1(1, productListViewModel2, ProductListViewModel.class, "onVideoAdAnalyticsEvent", "onVideoAdAnalyticsEvent(Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(objG4);
                                }
                                composer2.l();
                                VideoAdUnitKt.b(videoAd, videoAdPlayerState, (Function1) kFunction, (Function3) kFunction3, (Function1) objG4, SizeKt.e(companion, 1.0f), (Function1) kFunction2, composer2, 196616);
                                ProductCard productCard = videoAdUnitData2.getProductCard();
                                composer2.o(-1642556395);
                                if (productCard != null) {
                                    ProductListContract.ViewState viewState2 = (ProductListContract.ViewState) mutableStateA.getD();
                                    List list = viewState2 != null ? viewState2.r : null;
                                    if (list == null) {
                                        list = EmptyList.d;
                                    }
                                    VideoAdUnitComposeEpoxyModelKt.a(productCard, productCardConfig2, productListViewModel2, list, composer2, ProductCard.$stable | (ProductCardConfig.$stable << 3));
                                }
                                composer2.l();
                                composer2.f();
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 285378742));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        return Intrinsics.c(this.n, obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        ComposeView view = (ComposeView) obj;
        Intrinsics.h(view, "view");
        this.n.h(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        return this.n.j(viewGroup);
    }
}
