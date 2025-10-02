package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.base.rewards.account.data.IconListItemAction;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AccountSettingsActivity$onCreate$1$2$8$1 extends FunctionReferenceImpl implements Function1<IconListItemAction, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IconListItemAction p0 = (IconListItemAction) obj;
        Intrinsics.h(p0, "p0");
        AccountSettingsViewModel accountSettingsViewModel = (AccountSettingsViewModel) this.receiver;
        accountSettingsViewModel.getClass();
        accountSettingsViewModel.m.k(new AccountSettingsContract.Action.OpenUrl(p0.getUrl()));
        return Unit.f24250a;
    }
}
