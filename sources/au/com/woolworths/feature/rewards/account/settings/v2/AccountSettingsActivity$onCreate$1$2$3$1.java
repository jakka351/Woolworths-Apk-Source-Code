package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AccountSettingsActivity$onCreate$1$2$3$1 extends FunctionReferenceImpl implements Function1<AccountHomeOption, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccountHomeOption p0 = (AccountHomeOption) obj;
        Intrinsics.h(p0, "p0");
        ((AccountSettingsViewModel) this.receiver).R4(p0);
        return Unit.f24250a;
    }
}
