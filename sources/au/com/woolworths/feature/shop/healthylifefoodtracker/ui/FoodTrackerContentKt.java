package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.base.shopapp.modules.iconwithtext.IconListItemApiData;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.base.shopapp.modules.text.ParagraphTextApiData;
import au.com.woolworths.base.shopapp.modules.text.TextWithLinkApiData;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerContentFeed;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerPage;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerWebView;
import au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"healthy-life-food-tracker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FoodTrackerContentKt {
    public static final void a(FoodTrackerPage foodTrackerPage, LazyListState lazyListState, FoodTrackerEventListener eventListener, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(foodTrackerPage, "foodTrackerPage");
        Intrinsics.h(lazyListState, "lazyListState");
        Intrinsics.h(eventListener, "eventListener");
        ComposerImpl composerImplV = composer.v(-229768127);
        int i2 = (composerImplV.n(foodTrackerPage) ? 4 : 2) | i | (composerImplV.n(lazyListState) ? 32 : 16) | (composerImplV.n(eventListener) ? 256 : 128);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else if (foodTrackerPage instanceof FoodTrackerContentFeed) {
            composerImplV.o(1155869495);
            b((FoodTrackerContentFeed) foodTrackerPage, lazyListState, eventListener, modifier.x0(SizeKt.c), composerImplV, i2 & 1008);
            composerImplV.V(false);
        } else if (foodTrackerPage instanceof FoodTrackerWebView) {
            composerImplV.o(-1763821708);
            d((FoodTrackerWebView) foodTrackerPage, modifier.x0(SizeKt.c), composerImplV, 0);
            composerImplV.V(false);
        } else {
            composerImplV.o(1156218369);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(foodTrackerPage, lazyListState, eventListener, modifier, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerContentFeed r34, androidx.compose.foundation.lazy.LazyListState r35, final au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener r36, androidx.compose.ui.Modifier r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerContentKt.b(au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerContentFeed, androidx.compose.foundation.lazy.LazyListState, au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(Object obj, FoodTrackerEventListener foodTrackerEventListener, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1103536670);
        int i2 = (composerImplV.I(obj) ? 4 : 2) | i | (composerImplV.n(foodTrackerEventListener) ? 32 : 16);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (obj instanceof DownloadableAsset) {
                composerImplV.o(-358174237);
                DownloadableAssetUiKt.b((DownloadableAsset) obj, PaddingKt.h(modifier, BitmapDescriptorFactory.HUE_RED, 8, 1), false, false, false, null, null, composerImplV, 0, 124);
                composerImplV.V(false);
            } else if (obj instanceof ListSectionHeaderApiData) {
                composerImplV.o(-358168689);
                ListSectionHeaderKt.a((ListSectionHeaderApiData) obj, modifier, composerImplV, 48);
                composerImplV.V(false);
            } else if (obj instanceof ParagraphTextApiData) {
                composerImplV.o(-358163897);
                ParagraphTextKt.a((ParagraphTextApiData) obj, modifier, composerImplV, 48);
                composerImplV.V(false);
            } else if (obj instanceof IconListItemApiData) {
                composerImplV.o(-358159387);
                IconListItemKt.a((IconListItemApiData) obj, modifier, composerImplV, 48);
                composerImplV.V(false);
            } else if (obj instanceof TextWithLinkApiData) {
                composerImplV.o(-358154872);
                TextWithLinkApiData textWithLinkApiData = (TextWithLinkApiData) obj;
                composerImplV.o(5004770);
                boolean z = (i2 & 112) == 32;
                Object objG = composerImplV.G();
                if (z || objG == Composer.Companion.f1624a) {
                    objG = new l(foodTrackerEventListener, 24);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                TextWithLinkKt.a(textWithLinkApiData, modifier, (Function1) objG, composerImplV, 48);
                composerImplV.V(false);
            } else {
                composerImplV.o(1782270180);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(obj, foodTrackerEventListener, modifier, i);
        }
    }

    public static final void d(final FoodTrackerWebView foodTrackerWebView, Modifier modifier, Composer composer, final int i) {
        final Modifier modifier2;
        ComposerImpl composerImplV = composer.v(2039530716);
        int i2 = (composerImplV.n(foodTrackerWebView) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new l(foodTrackerWebView, 25);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier2 = modifier;
            AndroidView_androidKt.a((Function1) objG, modifier2, null, composerImplV, i2 & 112, 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(modifier2, i) { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.d
                public final /* synthetic */ Modifier e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    FoodTrackerContentKt.d(this.d, this.e, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
