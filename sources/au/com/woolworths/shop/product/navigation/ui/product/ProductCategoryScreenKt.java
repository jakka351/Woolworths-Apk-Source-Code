package au.com.woolworths.shop.product.navigation.ui.product;

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
import au.com.woolworths.feature.shop.contentpage.c;
import au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt;
import au.com.woolworths.feature.shop.more.h;
import au.com.woolworths.shop.product.details.ui.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "topBarHeightDp", "shop-product-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCategoryScreenKt {
    public static final void a(ContentPageViewModel contentPageViewModel, Function0 function0, Composer composer, int i) {
        float f;
        ComposerImpl composerImpl;
        ContentPageViewModel viewModel = contentPageViewModel;
        Function0 onPageRefresh = function0;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onPageRefresh, "onPageRefresh");
        ComposerImpl composerImplV = composer.v(1209343227);
        int i2 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onPageRefresh) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
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
            Flow flow = viewModel.r;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new a(14);
                composerImplV.A(objG2);
            }
            Function1 function1 = (Function1) objG2;
            composerImplV.V(false);
            float f2 = ((Dp) mutableState.getD()).d;
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4 || composerImplV.I(viewModel);
            Object objG3 = composerImplV.G();
            if (z || objG3 == composer$Companion$Empty$1) {
                f = f2;
                ProductCategoryScreenKt$ProductCategoryScreen$2$1 productCategoryScreenKt$ProductCategoryScreen$2$1 = new ProductCategoryScreenKt$ProductCategoryScreen$2$1(1, viewModel, ContentPageViewModel.class, "processActivityResult", "processActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
                composerImplV.A(productCategoryScreenKt$ProductCategoryScreen$2$1);
                objG3 = productCategoryScreenKt$ProductCategoryScreen$2$1;
            } else {
                f = f2;
            }
            composerImplV.V(false);
            Function1 function12 = (Function1) ((KFunction) objG3);
            composerImplV.o(1849434622);
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = new a(15);
                composerImplV.A(objG4);
            }
            Function1 function13 = (Function1) objG4;
            composerImplV.V(false);
            c cVar = viewModel.u;
            composerImplV.o(1849434622);
            Object objG5 = composerImplV.G();
            if (objG5 == composer$Companion$Empty$1) {
                objG5 = new a(16);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            ContentPageScreenKt.a(mutableStateA, flow, onPageRefresh, null, null, null, function1, viewModel, lazyListStateA, null, f, function12, function13, cVar, (Function1) objG5, null, false, null, null, null, null, null, null, null, null, null, null, null, null, composerImpl, ((i2 << 3) & 896) | 823880704 | ((i2 << 21) & 29360128), 24960, 0, 536838144);
            onPageRefresh = onPageRefresh;
            viewModel = viewModel;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(viewModel, onPageRefresh, i, 1);
        }
    }
}
