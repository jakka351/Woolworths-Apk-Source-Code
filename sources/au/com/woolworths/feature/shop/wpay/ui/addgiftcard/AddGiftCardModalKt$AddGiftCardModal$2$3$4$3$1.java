package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AddGiftCardModalKt$AddGiftCardModal$2$3$4$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        MutableStateFlow mutableStateFlow = ((AddGiftCardViewModel) this.receiver).h;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, AddGiftCardContract.ViewState.a((AddGiftCardContract.ViewState) value, null, false, false, 1)));
        return Unit.f24250a;
    }
}
