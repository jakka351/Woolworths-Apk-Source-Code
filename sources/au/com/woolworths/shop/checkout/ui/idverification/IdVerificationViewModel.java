package au.com.woolworths.shop.checkout.ui.idverification;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class IdVerificationViewModel extends ViewModel {
    public final IdVerificationInteractor e;
    public final AnalyticsManager f;
    public final MutableStateFlow g;
    public final MutableStateFlow h;
    public final SharedFlowImpl i;
    public final SharedFlowImpl j;

    public IdVerificationViewModel(IdVerificationInteractor idVerificationInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = idVerificationInteractor;
        this.f = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new IdVerificationViewState(IdVerificationViewState.Content.Loading.f10805a));
        this.g = mutableStateFlowA;
        this.h = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = sharedFlowImplB;
    }

    public final boolean p6(Uri uri) {
        IdVerificationInitData idVerificationInitData;
        IdVerificationViewState.Content content = ((IdVerificationViewState) this.g.getValue()).f10802a;
        IdVerificationViewState.Content.Loaded loaded = content instanceof IdVerificationViewState.Content.Loaded ? (IdVerificationViewState.Content.Loaded) content : null;
        String str = (loaded == null || (idVerificationInitData = loaded.f10804a) == null) ? null : idVerificationInitData.b;
        if (str == null || uri == null) {
            return false;
        }
        String string = uri.toString();
        Intrinsics.g(string, "toString(...)");
        boolean zW = StringsKt.W(StringsKt.k0(string).toString(), str, false);
        if (zW) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new IdVerificationViewModel$launchIdVerificationCompletes$1(this, uri, null), 3);
        }
        return zW;
    }

    public final void q6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new IdVerificationViewModel$initIdVerification$1(this, null), 3);
    }
}
