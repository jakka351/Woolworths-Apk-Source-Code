package au.com.woolworths.shop.buyagain.ui.composable;

import au.com.woolworths.shop.buyagain.ui.BuyAgainContract;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainScreenKt$BuyAgainScreen$11$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        BuyAgainViewModel buyAgainViewModel = (BuyAgainViewModel) this.receiver;
        buyAgainViewModel.getClass();
        MutableStateFlow mutableStateFlow = buyAgainViewModel.m;
        BuyAgainViewModel.x6(buyAgainViewModel, mutableStateFlow, false, false, null, null, SetsKt.h(((BuyAgainContract.ViewState) mutableStateFlow.getValue()).f, p0), null, false, null, false, null, null, false, false, false, 16367);
        return Unit.f24250a;
    }
}
