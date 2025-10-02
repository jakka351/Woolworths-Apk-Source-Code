package au.com.woolworths.feature.shared.receipt.details;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsContract;
import au.com.woolworths.feature.shared.receipt.details.analytics.SharedEReceiptClickAction;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetails;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDownload;
import au.com.woolworths.shop.receipt.details.ShopReceiptUiProvider;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsClickHandler;", "Companion", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EReceiptDetailsViewModel extends ViewModel implements FullPageErrorStateClickHandler, EReceiptDetailsClickHandler {
    public final EReceiptDetailsInteractor e;
    public final AnalyticsManager f;
    public String g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final PublishSubject j;
    public final PublishSubject k;
    public final Screen l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsViewModel$Companion;", "", "", "FILE_TYPE", "Ljava/lang/String;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6554a;

        static {
            int[] iArr = new int[EReceiptDetailsFullPageErrorState.values().length];
            try {
                iArr[EReceiptDetailsFullPageErrorState.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EReceiptDetailsFullPageErrorState.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EReceiptDetailsFullPageErrorState.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6554a = iArr;
        }
    }

    public EReceiptDetailsViewModel(EReceiptDetailsInteractor eReceiptDetailsInteractor, AnalyticsManager analyticsManager, ShopReceiptUiProvider shopReceiptUiProvider) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = eReceiptDetailsInteractor;
        this.f = analyticsManager;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.h = mutableLiveData;
        this.i = mutableLiveData;
        PublishSubject publishSubject = new PublishSubject();
        this.j = publishSubject;
        this.k = publishSubject;
        this.l = shopReceiptUiProvider.f12791a;
    }

    public static void r6(EReceiptDetailsViewModel eReceiptDetailsViewModel, MutableLiveData mutableLiveData, boolean z, boolean z2, EReceiptDetails eReceiptDetails, boolean z3, EReceiptDetailsFullPageErrorState eReceiptDetailsFullPageErrorState, int i) {
        if ((i & 1) != 0) {
            EReceiptDetailsContract.ViewState viewState = (EReceiptDetailsContract.ViewState) mutableLiveData.e();
            z = viewState != null ? viewState.f6552a : false;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            EReceiptDetailsContract.ViewState viewState2 = (EReceiptDetailsContract.ViewState) mutableLiveData.e();
            z2 = viewState2 != null ? viewState2.b : false;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            EReceiptDetailsContract.ViewState viewState3 = (EReceiptDetailsContract.ViewState) mutableLiveData.e();
            eReceiptDetails = viewState3 != null ? viewState3.c : null;
        }
        EReceiptDetails eReceiptDetails2 = eReceiptDetails;
        boolean z6 = (i & 8) != 0 ? false : z3;
        EReceiptDetailsFullPageErrorState eReceiptDetailsFullPageErrorState2 = (i & 16) != 0 ? null : eReceiptDetailsFullPageErrorState;
        eReceiptDetailsViewModel.getClass();
        mutableLiveData.m(new EReceiptDetailsContract.ViewState(z4, z5, eReceiptDetails2, z6, eReceiptDetailsFullPageErrorState2));
    }

    @Override // au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsClickHandler
    public final void P() {
        if (((EReceiptDetailsContract.ViewState) this.i.e()) != null) {
            r6(this, this.h, false, false, null, !r0.d, null, 23);
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        EReceiptDetailsContract.ViewState viewState = (EReceiptDetailsContract.ViewState) this.i.e();
        EReceiptDetailsFullPageErrorState eReceiptDetailsFullPageErrorState = viewState != null ? viewState.e : null;
        int i = eReceiptDetailsFullPageErrorState == null ? -1 : WhenMappings.f6554a[eReceiptDetailsFullPageErrorState.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("No error should mean no button, so can't click it.");
        }
        if (i == 1) {
            String str = this.g;
            if (str != null) {
                p6(str);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.j.onNext(EReceiptDetailsContract.Actions.CloseScreen.f6548a);
        } else {
            String str2 = this.g;
            if (str2 != null) {
                p6(str2);
            }
        }
    }

    public final void p6(String receiptId) {
        Intrinsics.h(receiptId, "receiptId");
        this.g = receiptId;
        r6(this, this.h, true, false, null, false, null, 30);
        BuildersKt.c(ViewModelKt.a(this), null, null, new EReceiptDetailsViewModel$fetchEReceiptDetails$1(this, receiptId, null), 3);
    }

    public final void q6() {
        EReceiptDetails eReceiptDetails;
        EReceiptDownload download;
        MutableLiveData mutableLiveData = this.i;
        EReceiptDetailsContract.ViewState viewState = (EReceiptDetailsContract.ViewState) mutableLiveData.e();
        if (viewState == null || !viewState.b) {
            this.f.j(new SharedEReceiptClickAction(this.l), TrackingMetadata.Companion.a(TrackableValue.o0, "Share"));
            EReceiptDetailsContract.ViewState viewState2 = (EReceiptDetailsContract.ViewState) mutableLiveData.e();
            if (viewState2 != null && (eReceiptDetails = viewState2.c) != null && (download = eReceiptDetails.getDownload()) != null) {
                r6(this, this.h, false, true, null, false, null, 29);
                BuildersKt.c(ViewModelKt.a(this), null, null, new EReceiptDetailsViewModel$startEReceiptDownload$1(this, download, null), 3);
            }
        }
    }

    @Override // au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsClickHandler
    public final void x0(String division, String storeNo) {
        Intrinsics.h(division, "division");
        Intrinsics.h(storeNo, "storeNo");
        this.j.onNext(new EReceiptDetailsContract.Actions.OpenStoreLocationSheet(division, storeNo));
    }
}
