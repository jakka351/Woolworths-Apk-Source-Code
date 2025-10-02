package au.com.woolworths.feature.shop.more;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "topBarHeightDp", "more_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MoreMenuScreenKt {
    public static final void a(ContentPageViewModel contentPageViewModel, Function0 function0, Composer composer, int i) {
        Flow flow;
        int i2;
        int i3;
        float f;
        ComposerImpl composerImpl;
        ContentPageViewModel viewModel = contentPageViewModel;
        Function0 onPageRefresh = function0;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onPageRefresh, "onPageRefresh");
        ComposerImpl composerImplV = composer.v(142693010);
        int i4 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onPageRefresh) ? 32 : 16);
        if ((i4 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            MutableState mutableStateA = SnapshotStateKt.a(viewModel.s, composerImplV);
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(new Dp(0));
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            Flow flow2 = viewModel.r;
            composerImplV.o(5004770);
            int i5 = i4 & 14;
            boolean z = true;
            boolean z2 = i5 == 4 || composerImplV.I(viewModel);
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                flow = flow2;
                i2 = 5004770;
                i3 = i5;
                MoreMenuScreenKt$MoreMenuScreen$1$1 moreMenuScreenKt$MoreMenuScreen$1$1 = new MoreMenuScreenKt$MoreMenuScreen$1$1(1, viewModel, ContentPageViewModel.class, "onDynamicSizeCardClicked", "onDynamicSizeCardClicked(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                composerImplV.A(moreMenuScreenKt$MoreMenuScreen$1$1);
                objG2 = moreMenuScreenKt$MoreMenuScreen$1$1;
            } else {
                flow = flow2;
                i2 = 5004770;
                i3 = i5;
            }
            KFunction kFunction = (KFunction) objG2;
            composerImplV.V(false);
            float f2 = ((Dp) mutableState.getD()).d;
            composerImplV.o(i2);
            boolean z3 = i3 == 4 || composerImplV.I(viewModel);
            Object objG3 = composerImplV.G();
            if (z3 || objG3 == composer$Companion$Empty$1) {
                f = f2;
                MoreMenuScreenKt$MoreMenuScreen$2$1 moreMenuScreenKt$MoreMenuScreen$2$1 = new MoreMenuScreenKt$MoreMenuScreen$2$1(1, viewModel, ContentPageViewModel.class, "processActivityResult", "processActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
                composerImplV.A(moreMenuScreenKt$MoreMenuScreen$2$1);
                objG3 = moreMenuScreenKt$MoreMenuScreen$2$1;
            } else {
                f = f2;
            }
            KFunction kFunction2 = (KFunction) objG3;
            composerImplV.V(false);
            au.com.woolworths.feature.shop.contentpage.c cVar = viewModel.u;
            composerImplV.o(i2);
            boolean z4 = i3 == 4 || composerImplV.I(viewModel);
            Object objG4 = composerImplV.G();
            if (z4 || objG4 == composer$Companion$Empty$1) {
                MoreMenuScreenKt$MoreMenuScreen$3$1 moreMenuScreenKt$MoreMenuScreen$3$1 = new MoreMenuScreenKt$MoreMenuScreen$3$1(1, viewModel, ContentPageViewModel.class, "onBroadcastBannerClicked", "onBroadcastBannerClicked(Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;)V", 0);
                composerImplV.A(moreMenuScreenKt$MoreMenuScreen$3$1);
                objG4 = moreMenuScreenKt$MoreMenuScreen$3$1;
            }
            KFunction kFunction3 = (KFunction) objG4;
            composerImplV.V(false);
            composerImplV.o(i2);
            if (i3 != 4 && !composerImplV.I(viewModel)) {
                z = false;
            }
            Object objG5 = composerImplV.G();
            if (z || objG5 == composer$Companion$Empty$1) {
                objG5 = new MoreMenuScreenKt$MoreMenuScreen$4$1(1, viewModel, ContentPageViewModel.class, "onBroadcastDismissClicked", "onBroadcastDismissClicked(Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;)V", 0);
                composerImplV.A(objG5);
            }
            KFunction kFunction4 = (KFunction) objG5;
            composerImplV.V(false);
            Function1 function1 = (Function1) kFunction;
            Function1 function12 = (Function1) kFunction2;
            composerImplV.o(1849434622);
            Object objG6 = composerImplV.G();
            if (objG6 == composer$Companion$Empty$1) {
                objG6 = new au.com.woolworths.feature.shop.modeselector.ui.c(4);
                composerImplV.A(objG6);
            }
            Function1 function13 = (Function1) objG6;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = new au.com.woolworths.feature.shop.modeselector.ui.c(5);
                composerImplV.A(objD);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            ContentPageScreenKt.a(mutableStateA, flow, onPageRefresh, null, null, null, function1, contentPageViewModel, lazyListStateA, null, f, function12, function13, cVar, (Function1) objD, null, false, null, null, null, null, null, (Function1) kFunction3, (Function1) kFunction4, null, null, null, null, null, composerImpl, ((i4 << 3) & 896) | 822307840 | ((i4 << 21) & 29360128), 24960, 0, 524255232);
            onPageRefresh = onPageRefresh;
            viewModel = contentPageViewModel;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(viewModel, onPageRefresh, i, 0);
        }
    }
}
