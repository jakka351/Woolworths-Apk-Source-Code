package au.com.woolworths.shop.checkout.ui.contactdetails;

import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ContactDetailsFragment$onCreateView$1$1$2$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ContactDetailsContentViewModel contactDetailsContentViewModel = (ContactDetailsContentViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = contactDetailsContentViewModel.e;
        if (StringsKt.D(((ContactDetailsContract.ViewState) contactDetailsContentViewModel.f.getValue()).f10727a)) {
            mutableStateFlow.setValue(ContactDetailsContract.ViewState.a((ContactDetailsContract.ViewState) mutableStateFlow.getValue(), null, true, 3));
        } else {
            mutableStateFlow.setValue(ContactDetailsContract.ViewState.a((ContactDetailsContract.ViewState) mutableStateFlow.getValue(), null, false, 3));
            contactDetailsContentViewModel.g.k(ContactDetailsContract.Action.Dismiss.f10726a);
        }
        return Unit.f24250a;
    }
}
