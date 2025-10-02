package au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.experimental.ratingbar.StarRatingBarKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopBarLiftOnScrollElevationKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.rewards.offers.listpage.ui.e;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails.ReviewSection;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsContract;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsViewModel;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsDetailsItemEntry;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetails;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewCardKt;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewItemInfoKt;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewItemRecommendationKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\b²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$ViewState;", "viewState", "", "showLoadMoreReviewsButton", "showLoadingMoreReviews", "expanded", "Lau/com/woolworths/shop/ratings/and/reviews/ui/reviewsdetailsscreen/SortingOption;", "selectedSortOption", "ratings-and-reviews_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ReviewsDetailsScreenKt {
    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(214130713);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CircularProgressIndicatorKt.b(BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e), 0L, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 14);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(i, 0);
        }
    }

    public static final void b(LoadState.Error error, final Function0 function0, Function1 function1, Composer composer, int i) {
        String strC;
        final FullPageMessage.Error error2;
        ComposerImpl composerImplV = composer.v(-212409691);
        int i2 = (composerImplV.I(error) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (error.b instanceof NoConnectivityException) {
                composerImplV.o(-1409950490);
                strC = StringResources_androidKt.c(composerImplV, R.string.default_connection_error_title);
                composerImplV.V(false);
                error2 = FullPageMessage.Error.ConnectionError.f8919a;
            } else {
                composerImplV.o(-1409751346);
                strC = StringResources_androidKt.c(composerImplV, R.string.default_server_error_title);
                composerImplV.V(false);
                error2 = FullPageMessage.Error.ServerError.f8920a;
            }
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1893809427, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsFullScreenError$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, fillElement);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        String strC2 = StringResources_androidKt.c(composer2, R.string.review_details_full_screen_error);
                        FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(error2, StringResources_androidKt.c(composer2, R.string.review_details_full_screen_error), strC2, function0, composer2, 1572864, 6), null, null, composer2, 0, 6);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            function1.invoke(strC);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 26, error, function0, function1, false);
        }
    }

    public static final void c(final LazyPagingItems ratingsAndReviewsItems, final RatingReviewHandler ratingReviewHandler, final ReviewsContract.ViewState viewState, Modifier modifier, LazyListState lazyListState, Composer composer, int i) {
        int i2;
        LazyListState lazyListState2;
        ComposerImpl composerImpl;
        Intrinsics.h(ratingsAndReviewsItems, "ratingsAndReviewsItems");
        Intrinsics.h(viewState, "viewState");
        ComposerImpl composerImplV = composer.v(-485155829);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(ratingsAndReviewsItems) : composerImplV.I(ratingsAndReviewsItems) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(ratingReviewHandler) : composerImplV.I(ratingReviewHandler) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(viewState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            lazyListState2 = lazyListState;
            i2 |= composerImplV.n(lazyListState2) ? 16384 : 8192;
        } else {
            lazyListState2 = lazyListState;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(modifier, 1.0f), BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            composerImplV.o(-1224400529);
            boolean z = true;
            boolean zI = ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerImplV.I(ratingsAndReviewsItems))) | composerImplV.I(viewState);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !composerImplV.I(ratingReviewHandler))) {
                z = false;
            }
            boolean zI2 = zI | z | composerImplV.I(coroutineScope);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == obj) {
                objG2 = new Function1() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LazyListScope LazyColumn = (LazyListScope) obj2;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final LazyPagingItems lazyPagingItems = ratingsAndReviewsItems;
                        ArrayList arrayList = lazyPagingItems.c().f;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (obj3 instanceof RatingsAndReviewsDetailsItemEntry.RatingsDetails) {
                                arrayList2.add(obj3);
                            }
                        }
                        RatingsAndReviewsDetailsItemEntry.RatingsDetails ratingsDetails = (RatingsAndReviewsDetailsItemEntry.RatingsDetails) CollectionsKt.F(arrayList2);
                        final RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails = ratingsDetails != null ? ratingsDetails.f12762a : null;
                        if (ratingsAndReviewsRatingsDetails != null) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsPagingContent$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    LazyItemScope item = (LazyItemScope) obj4;
                                    Composer composer2 = (Composer) obj5;
                                    int iIntValue = ((Number) obj6).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        RatingsDistributionUIKt.a(ratingsAndReviewsRatingsDetails, composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 744066229), 3);
                        }
                        if (lazyPagingItems.c().getF() > 3) {
                            final RatingReviewHandler ratingReviewHandler2 = ratingReviewHandler;
                            final ReviewsContract.ViewState viewState2 = viewState;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsPagingContent$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    LazyItemScope item = (LazyItemScope) obj4;
                                    Composer composer2 = (Composer) obj5;
                                    int iIntValue = ((Number) obj6).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        Modifier.Companion companion = Modifier.Companion.d;
                                        Modifier modifierH = PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2);
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                        int p = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierH);
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
                                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function2 = ComposeUiNode.Companion.j;
                                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                        }
                                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                        composer2.o(1849434622);
                                        Object objG3 = composer2.G();
                                        Object obj7 = Composer.Companion.f1624a;
                                        if (objG3 == obj7) {
                                            objG3 = SnapshotStateKt.f(Boolean.FALSE);
                                            composer2.A(objG3);
                                        }
                                        final MutableState mutableState = (MutableState) objG3;
                                        composer2.l();
                                        List list = SortingOption.k;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it = ((AbstractList) list).iterator();
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            if (((SortingOption) next).f == viewState2.f12756a) {
                                                arrayList3.add(next);
                                            }
                                        }
                                        SortingOption sortingOption = (SortingOption) CollectionsKt.F(arrayList3);
                                        if (sortingOption == null) {
                                            sortingOption = SortingOption.g;
                                        }
                                        composer2.o(1849434622);
                                        Object objG4 = composer2.G();
                                        if (objG4 == obj7) {
                                            objG4 = SnapshotStateKt.f(sortingOption);
                                            composer2.A(objG4);
                                        }
                                        final MutableState mutableState2 = (MutableState) objG4;
                                        composer2.l();
                                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                                        int p2 = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function02 = ComposeUiNode.Companion.b;
                                        if (composer2.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer2.i();
                                        if (composer2.getO()) {
                                            composer2.K(function02);
                                        } else {
                                            composer2.e();
                                        }
                                        Function2 function22 = ComposeUiNode.Companion.g;
                                        Updater.b(composer2, columnMeasurePolicyA, function22);
                                        Function2 function23 = ComposeUiNode.Companion.f;
                                        Updater.b(composer2, persistentCompositionLocalMapD2, function23);
                                        Function2 function24 = ComposeUiNode.Companion.j;
                                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                                            androidx.camera.core.impl.b.z(p2, composer2, p2, function24);
                                        }
                                        Function2 function25 = ComposeUiNode.Companion.d;
                                        Updater.b(composer2, modifierD2, function25);
                                        composer2.o(-1633490746);
                                        final RatingReviewHandler ratingReviewHandler3 = ratingReviewHandler2;
                                        boolean zI3 = composer2.I(ratingReviewHandler3);
                                        Object objG5 = composer2.G();
                                        if (zI3 || objG5 == obj7) {
                                            objG5 = new au.com.woolworths.shop.checkout.ui.details.c(20, ratingReviewHandler3, mutableState);
                                            composer2.A(objG5);
                                        }
                                        composer2.l();
                                        SortingDropDownButtonKt.b((Function0) objG5, (SortingOption) mutableState2.getD(), composer2, 0);
                                        composer2.f();
                                        Modifier modifierG = BoxScopeInstance.f944a.g(companion, Alignment.Companion.c);
                                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                                        int p3 = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierG);
                                        if (composer2.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer2.i();
                                        if (composer2.getO()) {
                                            composer2.K(function02);
                                        } else {
                                            composer2.e();
                                        }
                                        Updater.b(composer2, columnMeasurePolicyA2, function22);
                                        Updater.b(composer2, persistentCompositionLocalMapD3, function23);
                                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                                            androidx.camera.core.impl.b.z(p3, composer2, p3, function24);
                                        }
                                        Updater.b(composer2, modifierD3, function25);
                                        boolean zBooleanValue = ((Boolean) mutableState.getD()).booleanValue();
                                        List listR = CollectionsKt.R(SortingOption.g, SortingOption.h, SortingOption.i);
                                        composer2.o(5004770);
                                        Object objG6 = composer2.G();
                                        if (objG6 == obj7) {
                                            objG6 = new e(mutableState, 18);
                                            composer2.A(objG6);
                                        }
                                        Function0 function03 = (Function0) objG6;
                                        composer2.l();
                                        composer2.o(-1224400529);
                                        boolean zI4 = composer2.I(ratingReviewHandler3);
                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                        boolean zI5 = zI4 | composer2.I(coroutineScope3);
                                        final LazyPagingItems lazyPagingItems2 = lazyPagingItems;
                                        boolean zI6 = zI5 | composer2.I(lazyPagingItems2);
                                        Object objG7 = composer2.G();
                                        if (zI6 || objG7 == obj7) {
                                            Object obj8 = new Function1() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.c
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    SortingOption it2 = (SortingOption) obj9;
                                                    Intrinsics.h(it2, "it");
                                                    MutableState mutableState3 = mutableState2;
                                                    mutableState3.setValue(it2);
                                                    ratingReviewHandler3.w3(((SortingOption) mutableState3.getD()).f);
                                                    BuildersKt.c(coroutineScope3, null, null, new ReviewsDetailsScreenKt$RatingsAndReviewsPagingContent$1$1$2$1$2$2$1$1(lazyPagingItems2, null), 3);
                                                    mutableState.setValue(Boolean.FALSE);
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(obj8);
                                            objG7 = obj8;
                                        }
                                        composer2.l();
                                        SortingDropDownButtonKt.a(390, composer2, listR, function03, (Function1) objG7, zBooleanValue);
                                        composer2.f();
                                        composer2.f();
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -1459634981), 3);
                        }
                        LazyListScope.i(LazyColumn, null, null, ComposableSingletons$ReviewsDetailsScreenKt.b, 3);
                        LazyListScope.g(LazyColumn, lazyPagingItems.b(), null, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsPagingContent$1$1$3
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                LazyItemScope items = (LazyItemScope) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Composer composer2 = (Composer) obj6;
                                int iIntValue2 = ((Number) obj7).intValue();
                                Intrinsics.h(items, "$this$items");
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if ((iIntValue2 & 145) == 144 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    RatingsAndReviewsDetailsItemEntry ratingsAndReviewsDetailsItemEntry = (RatingsAndReviewsDetailsItemEntry) lazyPagingItems.a(iIntValue);
                                    composer2.o(168161596);
                                    if (ratingsAndReviewsDetailsItemEntry instanceof RatingsAndReviewsDetailsItemEntry.ReviewItem) {
                                        ReviewsDetailsScreenKt.f((RatingsAndReviewsDetailsItemEntry.ReviewItem) ratingsAndReviewsDetailsItemEntry, composer2, 0);
                                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.b(composer2).e.b.e, composer2, PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2));
                                    }
                                    composer2.l();
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1412463917), 6);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.b(modifierJ, lazyListState2, null, false, null, Alignment.Companion.n, null, false, null, (Function1) objG2, composerImpl, ((i2 >> 9) & 112) | 196608, 476);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0((Object) ratingsAndReviewsItems, (Object) ratingReviewHandler, (Object) viewState, modifier, (Object) lazyListState, i, 23);
        }
    }

    public static final void d(final ReviewsViewModel reviewsViewModel, final Function0 onNavigateUp, final ReviewsContract.ViewState viewState, Composer composer, int i) {
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(viewState, "viewState");
        ComposerImpl composerImplV = composer.v(-465195656);
        if (((i | (composerImplV.n(reviewsViewModel) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(viewState) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final LazyPagingItems lazyPagingItemsA = LazyPagingItemsKt.a(reviewsViewModel.l, composerImplV);
            final LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            ScaffoldKt.a(null, ComposableLambdaKt.c(1867967548, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsScaffoldUI$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        CoreElevation coreElevationA = TopBarLiftOnScrollElevationKt.a(lazyListStateA, composer2);
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-560077138, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsScaffoldUI$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final LazyPagingItems lazyPagingItems = lazyPagingItemsA;
                        final ReviewsViewModel reviewsViewModel2 = reviewsViewModel;
                        TopNavBarKt.a("Reviews", null, 0L, 0L, 0L, null, coreElevationA, composableLambdaImplC, ComposableLambdaKt.c(934127333, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsScaffoldUI$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ArrayList arrayList = lazyPagingItems.c().f;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj6 : arrayList) {
                                        if (obj6 instanceof RatingsAndReviewsDetailsItemEntry.Cta) {
                                            arrayList2.add(obj6);
                                        }
                                    }
                                    final RatingsAndReviewsDetailsItemEntry.Cta cta = (RatingsAndReviewsDetailsItemEntry.Cta) CollectionsKt.F(arrayList2);
                                    if (cta != null) {
                                        composer3.o(-1633490746);
                                        ReviewsViewModel reviewsViewModel3 = reviewsViewModel2;
                                        boolean zN = composer3.n(reviewsViewModel3) | composer3.I(cta);
                                        Object objG = composer3.G();
                                        if (zN || objG == Composer.Companion.f1624a) {
                                            objG = new au.com.woolworths.shop.checkout.ui.details.c(21, reviewsViewModel3, cta);
                                            composer3.A(objG);
                                        }
                                        composer3.l();
                                        ButtonKt.c((Function0) objG, null, false, null, null, null, null, null, ComposableLambdaKt.c(-1198860979, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsScaffoldUI$1$2$1$2
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                RowScope TextButton = (RowScope) obj7;
                                                Composer composer4 = (Composer) obj8;
                                                int iIntValue2 = ((Number) obj9).intValue();
                                                Intrinsics.h(TextButton, "$this$TextButton");
                                                if ((iIntValue2 & 17) == 16 && composer4.c()) {
                                                    composer4.j();
                                                } else {
                                                    TextKt.a(cta.b.d, CoreTheme.f(composer4).e.b.b, null, CoreTheme.b(composer4).e.d.f4856a, null, 0, 0, false, 0, null, composer4, 0, 1012);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer3), composer3, 805306368, 510);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969670, 126);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(1269687685, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsScaffoldUI$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        ReviewsDetailsScreenKt.e(it, lazyPagingItemsA, lazyListStateA, reviewsViewModel, viewState, composer2, (iIntValue & 14) | 64);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582960, 125);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.product.details.ui.linkdedicatedviews.a(reviewsViewModel, onNavigateUp, viewState, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0489  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.foundation.layout.PaddingValues r27, androidx.paging.compose.LazyPagingItems r28, androidx.compose.foundation.lazy.LazyListState r29, au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler r30, au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsContract.ViewState r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt.e(androidx.compose.foundation.layout.PaddingValues, androidx.paging.compose.LazyPagingItems, androidx.compose.foundation.lazy.LazyListState, au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler, au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsContract$ViewState, androidx.compose.runtime.Composer, int):void");
    }

    public static final void f(RatingsAndReviewsDetailsItemEntry.ReviewItem reviewItem, Composer composer, int i) {
        Iterator it;
        boolean z;
        float f;
        float f2;
        char c;
        int i2;
        ComposerImpl composerImplV = composer.v(1697590265);
        int i3 = 4;
        if (((i | (composerImplV.I(reviewItem) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f3 = 12;
            float f4 = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, f4, 5);
            Modifier.Companion companion2 = companion;
            float f5 = f3;
            float f6 = f4;
            boolean z2 = false;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-466846186);
            Iterator it2 = reviewItem.f12763a.iterator();
            while (it2.hasNext()) {
                ReviewSection reviewSection = (ReviewSection) it2.next();
                if (reviewSection instanceof ReviewSection.Rating) {
                    composerImplV.o(192758778);
                    composerImplV.o(-1102159958);
                    StringBuilder sb = new StringBuilder();
                    ReviewSection.Rating rating = (ReviewSection.Rating) reviewSection;
                    String str = rating.c;
                    int i5 = rating.f12740a;
                    sb.append(StringResources_androidKt.b(R.string.reviews_card_rating_talkback_text, new Object[]{Integer.valueOf(i5), 5}, composerImplV));
                    composerImplV.o(-1102149316);
                    String lowerCase = "verified".toLowerCase(Locale.ROOT);
                    Intrinsics.g(lowerCase, "toLowerCase(...)");
                    if (StringsKt.y(str, lowerCase, true)) {
                        sb.append(", " + StringResources_androidKt.c(composerImplV, R.string.reviews_card_rating_verified_talkback_text));
                    }
                    composerImplV.V(z2);
                    String string = sb.toString();
                    composerImplV.V(z2);
                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
                    int i6 = composerImplV.P;
                    PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                    Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion2);
                    ComposeUiNode.e3.getClass();
                    Function0 function02 = ComposeUiNode.Companion.b;
                    composerImplV.i();
                    if (composerImplV.O) {
                        composerImplV.K(function02);
                    } else {
                        composerImplV.e();
                    }
                    Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                    Updater.b(composerImplV, persistentCompositionLocalMapQ2, ComposeUiNode.Companion.f);
                    Function2 function22 = ComposeUiNode.Companion.j;
                    if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                        androidx.camera.core.impl.b.B(i6, composerImplV, i6, function22);
                    }
                    Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
                    StarRatingBarKt.b(i5, string, PaddingKt.j(PaddingKt.h(companion2, BitmapDescriptorFactory.HUE_RED, i3, 1), f6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 0L, composerImplV, 3120);
                    it = it2;
                    f = f6;
                    z = false;
                    TextKt.a(str == null ? "" : str, CoreTheme.f(composerImplV).f5120a.b.f5123a, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
                    composerImplV.V(true);
                    composerImplV.V(false);
                    companion2 = companion2;
                } else {
                    it = it2;
                    z = z2;
                    Modifier.Companion companion3 = companion2;
                    f = f6;
                    if (reviewSection instanceof ReviewSection.Recommendation) {
                        composerImplV.o(194169309);
                        companion2 = companion3;
                        Modifier modifierG = PaddingKt.g(companion2, f, 8);
                        String str2 = ((ReviewSection.Recommendation) reviewSection).f12741a;
                        ReviewItemRecommendationKt.a(null, str2 == null ? "" : str2, true, modifierG, composerImplV, 390);
                        composerImplV.V(z);
                    } else {
                        companion2 = companion3;
                        if (reviewSection instanceof ReviewSection.Body) {
                            composerImplV.o(194517780);
                            ReviewCardKt.a(48, composerImplV, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), ((ReviewSection.Body) reviewSection).f12738a);
                            composerImplV.V(z);
                        } else {
                            if (reviewSection instanceof ReviewSection.Title) {
                                composerImplV.o(194755829);
                                f2 = f5;
                                c = 2;
                                ReviewCardKt.c(48, composerImplV, PaddingKt.h(PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 8, 5), f, BitmapDescriptorFactory.HUE_RED, 2), ((ReviewSection.Title) reviewSection).f12742a);
                                composerImplV.V(z);
                                i2 = 4;
                            } else {
                                f2 = f5;
                                c = 2;
                                if (!(reviewSection instanceof ReviewSection.Info)) {
                                    throw au.com.woolworths.android.onesite.a.w(-1102161227, composerImplV, z);
                                }
                                composerImplV.o(195083778);
                                i2 = 4;
                                ReviewSection.Info info = (ReviewSection.Info) reviewSection;
                                ReviewItemInfoKt.a(info.f12739a, info.b, PaddingKt.g(companion2, f, 4), composerImplV, z ? 1 : 0);
                                composerImplV.V(z);
                            }
                            i3 = i2;
                            f6 = f;
                            f5 = f2;
                            it2 = it;
                            z2 = z;
                        }
                    }
                }
                f2 = f5;
                i2 = 4;
                c = 2;
                i3 = i2;
                f6 = f;
                f5 = f2;
                it2 = it;
                z2 = z;
            }
            composerImplV.V(z2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.substitutions.c(i, 2, reviewItem);
        }
    }

    public static final void g(ReviewsViewModel reviewsViewModel, Function0 onNavigateUp, Composer composer, int i) {
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(569329507);
        int i2 = (composerImplV.n(reviewsViewModel) ? 4 : 2) | i | (composerImplV.I(onNavigateUp) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Flow flow = reviewsViewModel.i;
            composerImplV.o(-1633490746);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new ReviewsDetailsScreenKt$ReviewsDetailsScreen$1$1(reviewsViewModel, onNavigateUp, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
            d(reviewsViewModel, onNavigateUp, (ReviewsContract.ViewState) FlowExtKt.a(reviewsViewModel.k, composerImplV).getD(), composerImplV, i2 & 126);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.productcard.ui.components.b(reviewsViewModel, i, 2, onNavigateUp);
        }
    }
}
