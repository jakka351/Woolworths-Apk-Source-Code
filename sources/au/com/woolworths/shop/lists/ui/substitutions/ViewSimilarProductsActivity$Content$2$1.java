package au.com.woolworths.shop.lists.ui.substitutions;

import au.com.woolworths.shop.lists.data.model.AlternativeProductsDisclaimer;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ViewSimilarProductsActivity$Content$2$1 extends FunctionReferenceImpl implements Function1<AlternativeProductsDisclaimer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AlternativeProductsDisclaimer p0 = (AlternativeProductsDisclaimer) obj;
        Intrinsics.h(p0, "p0");
        ViewSimilarProductsViewModel viewSimilarProductsViewModel = (ViewSimilarProductsViewModel) this.receiver;
        viewSimilarProductsViewModel.getClass();
        MutableStateFlow mutableStateFlow = viewSimilarProductsViewModel.k;
        Object value = mutableStateFlow.getValue();
        ViewSimilarProductsContract.ViewState.Content content = value instanceof ViewSimilarProductsContract.ViewState.Content ? (ViewSimilarProductsContract.ViewState.Content) value : null;
        if (content != null) {
            mutableStateFlow.f(ViewSimilarProductsContract.ViewState.Content.d(content, null, null, p0, 59));
        }
        return Unit.f24250a;
    }
}
