package au.com.woolworths.feature.product.list;

import androidx.compose.ui.geometry.Rect;
import androidx.lifecycle.MediatorLiveData;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.product.list.ProductListContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadComposeUi$1$1$1$1$1$1$5$1 extends FunctionReferenceImpl implements Function1<Rect, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductListContract.CoachMark coachMark;
        ProductListContract.CoachMark coachMark2;
        Rect p0 = (Rect) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        MediatorLiveData mediatorLiveData = productListViewModel.C;
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
        if (viewState == null || (coachMark2 = viewState.l) == null) {
            coachMark = null;
        } else {
            String tag = coachMark2.f5241a;
            ResText title = coachMark2.b;
            ResText message = coachMark2.c;
            Function0 seen = coachMark2.d;
            Intrinsics.h(tag, "tag");
            Intrinsics.h(title, "title");
            Intrinsics.h(message, "message");
            Intrinsics.h(seen, "seen");
            coachMark = new ProductListContract.CoachMark(tag, title, message, seen, p0);
        }
        ProductListViewModel.H6(productListViewModel, mediatorLiveData, 0, null, null, coachMark, null, null, null, null, null, null, null, null, null, null, null, null, 67107839);
        return Unit.f24250a;
    }
}
