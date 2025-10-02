package au.com.woolworths.feature.shop.account.ui.details;

import au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AccountDetailsActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function1<ActionData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((AccountDetailsViewModel) this.receiver).r6((ActionData) obj);
        return Unit.f24250a;
    }
}
