package au.com.woolworths.feature.shop.account.ui.delete;

import au.com.woolworths.analytics.supers.more.accountdeletion.AccountDeletionAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DeleteAccountViewModel e;

    public /* synthetic */ a(DeleteAccountViewModel deleteAccountViewModel, int i) {
        this.d = i;
        this.e = deleteAccountViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AnalyticsManager analyticsManager = this.e.e;
                if (((Boolean) obj).booleanValue()) {
                    AccountDeletionAnalytics.CloseAccount.Action action = AccountDeletionAnalytics.CloseAccount.Action.f;
                    Intrinsics.h(action, "action");
                    analyticsManager.g(action);
                } else {
                    AccountDeletionAnalytics.CloseAccount.Action action2 = AccountDeletionAnalytics.CloseAccount.Action.g;
                    Intrinsics.h(action2, "action");
                    analyticsManager.g(action2);
                }
                break;
            default:
                DeleteAccountViewModel.p6(this.e);
                break;
        }
        return Unit.f24250a;
    }
}
