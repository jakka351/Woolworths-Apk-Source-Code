package au.com.woolworths.feature.rewards.account.closeaccount;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccount;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CloseAccountActivity$onCreate$1$2$3$1 extends FunctionReferenceImpl implements Function1<ContentCta, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((ContentCta) obj);
        return Unit.f24250a;
    }

    public final void m(ContentCta p0) {
        String str;
        Object value;
        Object objB;
        DeleteAccount deleteAccount;
        Intrinsics.h(p0, "p0");
        CloseAccountViewModel closeAccountViewModel = (CloseAccountViewModel) this.receiver;
        closeAccountViewModel.getClass();
        String url = p0.getUrl();
        if (url != null) {
            int iHashCode = url.hashCode();
            if (iHashCode != -2043999862) {
                if (iHashCode != -1892579699) {
                    if (iHashCode == 2073854099 && url.equals("FINISH")) {
                        closeAccountViewModel.q6();
                        return;
                    }
                } else if (url.equals("CONFIRM_DELETION")) {
                    MutableStateFlow mutableStateFlow = closeAccountViewModel.f;
                    Object value2 = mutableStateFlow.getValue();
                    CloseAccountContract.ViewState.ConsentPage consentPage = value2 instanceof CloseAccountContract.ViewState.ConsentPage ? (CloseAccountContract.ViewState.ConsentPage) value2 : null;
                    if (consentPage == null || (deleteAccount = consentPage.b) == null) {
                        Bark.Companion companion = Bark.f8483a;
                        Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.d), "Consent token is null", null);
                        str = "";
                    } else {
                        str = deleteAccount.f;
                    }
                    String str2 = str;
                    do {
                        value = mutableStateFlow.getValue();
                        objB = (CloseAccountContract.ViewState) value;
                        if (objB instanceof CloseAccountContract.ViewState.ConsentPage) {
                            objB = CloseAccountContract.ViewState.ConsentPage.b((CloseAccountContract.ViewState.ConsentPage) objB, false, true, 3);
                        }
                    } while (!mutableStateFlow.d(value, objB));
                    BuildersKt.c(ViewModelKt.a(closeAccountViewModel), null, null, new CloseAccountViewModel$closeAccount$2(closeAccountViewModel, str2, null), 3);
                    return;
                }
            } else if (url.equals("LOGOUT")) {
                closeAccountViewModel.q6();
                return;
            }
        }
        String url2 = p0.getUrl();
        if (url2 != null) {
            closeAccountViewModel.h.k(new CloseAccountContract.Action.OpenUrl(url2));
        }
    }
}
