package au.com.woolworths.shop.checkout.ui.contactdetails;

import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ContactDetailsFragment$onCreateView$1$1$2$1$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        ContactDetailsContentViewModel contactDetailsContentViewModel = (ContactDetailsContentViewModel) this.receiver;
        contactDetailsContentViewModel.getClass();
        MutableStateFlow mutableStateFlow = contactDetailsContentViewModel.e;
        mutableStateFlow.setValue(ContactDetailsContract.ViewState.a((ContactDetailsContract.ViewState) mutableStateFlow.getValue(), p0, false, 2));
        return Unit.f24250a;
    }
}
