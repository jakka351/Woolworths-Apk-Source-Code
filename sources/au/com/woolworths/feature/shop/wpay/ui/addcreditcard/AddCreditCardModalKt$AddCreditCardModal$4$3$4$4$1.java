package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AddCreditCardModalKt$AddCreditCardModal$4$3$4$4$1 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        String str = (String) obj;
        String str2 = (String) obj2;
        AddCreditCardViewModel addCreditCardViewModel = (AddCreditCardViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = addCreditCardViewModel.l;
        int iOrdinal = addCreditCardViewModel.k.ordinal();
        if (iOrdinal == 0) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value, LoadingState.d, new PageResult.Fail(new NoConnectivityException()), null, false, 12)));
            addCreditCardViewModel.i.c(addCreditCardViewModel.e);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value2, LoadingState.d, null, null, false, 14)));
            addCreditCardViewModel.m.k(AddCreditCardContract.Action.SnackBarConnectionError.f8324a);
        }
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), YU.a.i("Connection error encountered while loading the WebView url: ", str, " errorReason: ", str2), null, 12);
        return Unit.f24250a;
    }
}
