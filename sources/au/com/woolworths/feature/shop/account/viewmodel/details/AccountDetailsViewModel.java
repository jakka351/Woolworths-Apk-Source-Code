package au.com.woolworths.feature.shop.account.viewmodel.details;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.account.domain.details.AccountDetailsInteractor;
import au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsContract;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.auth.ShopAuthManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountDetailsViewModel extends ViewModel {
    public final AccountDetailsInteractor e;
    public final FeatureToggleManager f;
    public final ShopAuthManager g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final SharedFlowImpl j;
    public final SharedFlowImpl k;

    public AccountDetailsViewModel(AccountDetailsInteractor accountDetailsInteractor, FeatureToggleManager featureToggleManager, ShopAuthManager authManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(authManager, "authManager");
        this.e = accountDetailsInteractor;
        this.f = featureToggleManager;
        this.g = authManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(AccountDetailsContract.ViewState.Loading.f6599a);
        this.h = mutableStateFlowA;
        this.i = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.j = sharedFlowImplB;
        this.k = sharedFlowImplB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel$openMagicLinkWithAuthUpliftCheck$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel$openMagicLinkWithAuthUpliftCheck$1 r0 = (au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel$openMagicLinkWithAuthUpliftCheck$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel$openMagicLinkWithAuthUpliftCheck$1 r0 = new au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel$openMagicLinkWithAuthUpliftCheck$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.p
            kotlin.ResultKt.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.shop.auth.ShopAuthManager r6 = r4.g
            r0.p = r5
            r0.s = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L57
            au.com.woolworths.feature.shop.weblink.model.Cookie r6 = new au.com.woolworths.feature.shop.weblink.model.Cookie
            r6.<init>()
            au.com.woolworths.feature.shop.weblink.model.Cookie[] r6 = new au.com.woolworths.feature.shop.weblink.model.Cookie[]{r6}
            java.util.ArrayList r6 = kotlin.collections.CollectionsKt.k(r6)
            goto L58
        L57:
            r6 = 0
        L58:
            kotlinx.coroutines.flow.SharedFlowImpl r4 = r4.j
            au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsContract$Action$OpenLink r0 = new au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsContract$Action$OpenLink
            r0.<init>(r5, r6)
            r4.f(r0)
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel.p6(au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void q6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new AccountDetailsViewModel$fetchAccountDetails$1(this, null), 3);
    }

    public final void r6(ActionData actionData) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new AccountDetailsViewModel$onButtonClick$1(actionData, this, null), 3);
    }
}
