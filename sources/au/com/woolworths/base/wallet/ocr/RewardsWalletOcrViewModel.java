package au.com.woolworths.base.wallet.ocr;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.wallet.digipay.framesview.CardDetails;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import timber.log.Timber;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrViewModel;", "Landroidx/lifecycle/ViewModel;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsWalletOcrViewModel extends ViewModel {
    public final AnalyticsManager e;
    public final SharedFlowImpl f;
    public final Flow g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4698a;

        static {
            int[] iArr = new int[Activities.RewardsWalletOcr.Origin.values().length];
            try {
                Activities.RewardsWalletOcr.Origin origin = Activities.RewardsWalletOcr.Origin.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Activities.RewardsWalletOcr.Origin origin2 = Activities.RewardsWalletOcr.Origin.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Activities.RewardsWalletOcr.Origin origin3 = Activities.RewardsWalletOcr.Origin.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4698a = iArr;
        }
    }

    public RewardsWalletOcrViewModel(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.f = sharedFlowImplB;
        this.g = FlowKt.a(sharedFlowImplB);
    }

    public final void p6(CardDetails cardDetails, Activities.RewardsWalletOcr.Origin origin) {
        Timber.Forest forest = Timber.f27013a;
        String str = cardDetails.d;
        String str2 = cardDetails.e;
        String str3 = cardDetails.f;
        StringBuilder sbV = YU.a.v("onCardScanSuccess ", str, " ", str2, " ");
        sbV.append(str3);
        forest.b(sbV.toString(), new Object[0]);
        int i = origin == null ? -1 : WhenMappings.f4698a[origin.ordinal()];
        AnalyticsManager analyticsManager = this.e;
        if (i == 1) {
            analyticsManager.c(RewardsWalletOcrActionData.g);
        } else if (i == 2) {
            analyticsManager.c(RewardsGiftingOcrActionData.g);
        }
        this.f.f(new RewardsWalletOcrContract.Actions.ReturnScannedValuesToCallee(cardDetails));
    }
}
