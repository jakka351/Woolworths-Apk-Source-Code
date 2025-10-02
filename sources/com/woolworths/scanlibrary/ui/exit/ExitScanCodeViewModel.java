package com.woolworths.scanlibrary.ui.exit;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver;
import com.woolworths.scanlibrary.base.mvvm.BaseViewModel;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.data.firebase.firestore.FireStoreCartDocumentEventListener;
import com.woolworths.scanlibrary.data.firebase.firestore.FireStoreDataRepository;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.login.GetProfileUC;
import com.woolworths.scanlibrary.domain.receipt.GetReceiptWithCartIdUC;
import com.woolworths.scanlibrary.domain.transfertopos.RecallConfirmAtPosUC;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.profile.KioskFlags;
import com.woolworths.scanlibrary.models.profile.ProfileResponse;
import com.woolworths.scanlibrary.models.store.StoreCheckoutInstruction;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeAction;
import com.woolworths.scanlibrary.ui.exit.analytics.ExitActionData;
import com.woolworths.scanlibrary.util.event.Event;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeViewModel;", "Lcom/woolworths/scanlibrary/base/mvvm/BaseViewModel;", "Lcom/woolworths/scanlibrary/data/firebase/firestore/FireStoreCartDocumentEventListener;", "GetUserProfileSingle", "GetFullReceiptObserver", "ConfirmRecallPOSObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExitScanCodeViewModel extends BaseViewModel implements FireStoreCartDocumentEventListener {
    public StoreCheckoutInstruction A;
    public final CartSessionManager h;
    public final SessionInfo i;
    public final GetProfileUC j;
    public final FireStoreDataRepository k;
    public final GetReceiptWithCartIdUC l;
    public final RecallConfirmAtPosUC m;
    public final AnalyticsManager n;
    public final ResourceResolverImpl o;
    public final FeatureToggleManager p;
    public final FirebaseCrashlytics q;
    public final MutableLiveData r;
    public final MutableLiveData s;
    public final MutableLiveData t;
    public final MutableLiveData u;
    public final MutableLiveData v;
    public final MutableLiveData w;
    public String x;
    public ExitDTO y;
    public final Lazy z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeViewModel$ConfirmRecallPOSObserver;", "Lcom/woolworths/scanlibrary/base/mvvm/ApiSingleDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/transfertopos/RecallConfirmAtPosUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ConfirmRecallPOSObserver extends ApiSingleDisposableObserver<RecallConfirmAtPosUC.ResponseValue> {
        public ConfirmRecallPOSObserver() {
            super(25, ExitScanCodeViewModel.this.f);
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver
        public final void a(int i, ApigeeErrorResponse apigeeErrorResponse, int i2) {
            String string;
            ExitScanCodeViewModel exitScanCodeViewModel = ExitScanCodeViewModel.this;
            exitScanCodeViewModel.p6();
            MutableLiveData mutableLiveData = exitScanCodeViewModel.w;
            if (apigeeErrorResponse == null || (string = apigeeErrorResponse.getDescription()) == null) {
                string = exitScanCodeViewModel.o.getString(R.string.sng_error_unhandled);
            }
            mutableLiveData.j(new Event(new ExitScanCodeAction.ErrorConfirmingTransferToPos(string)));
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver
        public final void c(MvpView.ErrorType errorType) {
            ExitScanCodeViewModel exitScanCodeViewModel = ExitScanCodeViewModel.this;
            exitScanCodeViewModel.p6();
            exitScanCodeViewModel.w.j(new Event(new ExitScanCodeAction.ErrorConfirmingTransferToPos(exitScanCodeViewModel.o.getString(R.string.sng_error_unhandled))));
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            RecallConfirmAtPosUC.ResponseValue response = (RecallConfirmAtPosUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            ExitScanCodeViewModel exitScanCodeViewModel = ExitScanCodeViewModel.this;
            exitScanCodeViewModel.p6();
            SessionInfo sessionInfo = exitScanCodeViewModel.i;
            sessionInfo.d.setValue(sessionInfo, SessionInfo.k[3], Boolean.TRUE);
            exitScanCodeViewModel.h.b();
            exitScanCodeViewModel.w.j(new Event(ExitScanCodeAction.TransferToPosCompleted.f21263a));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeViewModel$GetFullReceiptObserver;", "Lcom/woolworths/scanlibrary/base/mvvm/ApiSingleDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/receipt/GetReceiptWithCartIdUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class GetFullReceiptObserver extends ApiSingleDisposableObserver<GetReceiptWithCartIdUC.ResponseValue> {
        public GetFullReceiptObserver() {
            super(12, ExitScanCodeViewModel.this.f);
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver
        public final void a(int i, ApigeeErrorResponse apigeeErrorResponse, int i2) {
            ExitScanCodeViewModel exitScanCodeViewModel = ExitScanCodeViewModel.this;
            exitScanCodeViewModel.p6();
            exitScanCodeViewModel.w.j(new Event(ExitScanCodeAction.ErrorGeneratingReceipt.f21258a));
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver
        public final void c(MvpView.ErrorType errorType) {
            ExitScanCodeViewModel exitScanCodeViewModel = ExitScanCodeViewModel.this;
            exitScanCodeViewModel.p6();
            exitScanCodeViewModel.w.j(new Event(ExitScanCodeAction.ErrorGeneratingReceipt.f21258a));
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetReceiptWithCartIdUC.ResponseValue response = (GetReceiptWithCartIdUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            ExitScanCodeViewModel exitScanCodeViewModel = ExitScanCodeViewModel.this;
            exitScanCodeViewModel.p6();
            exitScanCodeViewModel.w.j(new Event(new ExitScanCodeAction.ShowReceipt(response.f21203a)));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeViewModel$GetUserProfileSingle;", "Lcom/woolworths/scanlibrary/base/mvvm/ApiSingleDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/login/GetProfileUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class GetUserProfileSingle extends ApiSingleDisposableObserver<GetProfileUC.ResponseValue> {
        public GetUserProfileSingle() {
            super(9, ExitScanCodeViewModel.this.f);
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetProfileUC.ResponseValue response = (GetProfileUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            ProfileResponse profileResponse = response.f21184a;
            CartStatus status = profileResponse.getStatus().getStatus();
            KioskFlags kioskFlags = profileResponse.getKioskFlags();
            ExitScanCodeViewModel exitScanCodeViewModel = ExitScanCodeViewModel.this;
            exitScanCodeViewModel.r6(status, kioskFlags);
            exitScanCodeViewModel.p6();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21265a;

        static {
            int[] iArr = new int[CartStatus.values().length];
            try {
                iArr[CartStatus.PAID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartStatus.KIOSK_CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CartStatus.NO_ACTIVE_CART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CartStatus.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CartStatus.PAID_AND_TAP_OFF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CartStatus.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CartStatus.KIOSK_COMPLETED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CartStatus.CANCELLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CartStatus.VOIDED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f21265a = iArr;
        }
    }

    public ExitScanCodeViewModel(AuthenticatedUser user, CartSessionManager cartSessionManager, SessionInfo sessionInfo, GetProfileUC getProfileUC, FireStoreDataRepository fireStoreDataRepository, GetReceiptWithCartIdUC getReceiptWithCartIdUC, RecallConfirmAtPosUC recallConfirmAtPosUC, AnalyticsManager analyticsManager, ResourceResolverImpl resourceResolverImpl, FeatureToggleManager featureToggleManager, FirebaseCrashlytics firebaseCrashlytics) {
        Intrinsics.h(user, "user");
        Intrinsics.h(cartSessionManager, "cartSessionManager");
        Intrinsics.h(sessionInfo, "sessionInfo");
        Intrinsics.h(getProfileUC, "getProfileUC");
        Intrinsics.h(fireStoreDataRepository, "fireStoreDataRepository");
        Intrinsics.h(getReceiptWithCartIdUC, "getReceiptWithCartIdUC");
        Intrinsics.h(recallConfirmAtPosUC, "recallConfirmAtPosUC");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.h = cartSessionManager;
        this.i = sessionInfo;
        this.j = getProfileUC;
        this.k = fireStoreDataRepository;
        this.l = getReceiptWithCartIdUC;
        this.m = recallConfirmAtPosUC;
        this.n = analyticsManager;
        this.o = resourceResolverImpl;
        this.p = featureToggleManager;
        this.q = firebaseCrashlytics;
        this.r = new MutableLiveData();
        this.s = new MutableLiveData();
        this.t = new MutableLiveData();
        this.u = new MutableLiveData();
        this.v = new MutableLiveData();
        this.w = new MutableLiveData();
        this.x = "";
        this.z = LazyKt.b(new b(this, 7));
    }

    public static final void s6(ExitScanCodeViewModel exitScanCodeViewModel) {
        exitScanCodeViewModel.k.d();
        exitScanCodeViewModel.q6();
        CompositeDisposable compositeDisposable = exitScanCodeViewModel.e;
        SingleObserveOn singleObserveOnF = exitScanCodeViewModel.l.b(new GetReceiptWithCartIdUC.RequestValues(exitScanCodeViewModel.x)).f(AndroidSchedulers.a());
        GetFullReceiptObserver getFullReceiptObserver = exitScanCodeViewModel.new GetFullReceiptObserver();
        singleObserveOnF.a(getFullReceiptObserver);
        compositeDisposable.d(getFullReceiptObserver);
        SessionInfo sessionInfo = exitScanCodeViewModel.i;
        sessionInfo.d.setValue(sessionInfo, SessionInfo.k[3], Boolean.TRUE);
        exitScanCodeViewModel.h.b();
    }

    @Override // com.woolworths.scanlibrary.base.mvvm.BaseViewModel, androidx.lifecycle.ViewModel
    public final void o6() {
        this.k.a();
        super.o6();
    }

    public final void r6(CartStatus cartStatus, KioskFlags kioskFlags) {
        int i = cartStatus == null ? -1 : WhenMappings.f21265a[cartStatus.ordinal()];
        ExitScanCodeAction.ScanNotComplete scanNotComplete = ExitScanCodeAction.ScanNotComplete.f21260a;
        MutableLiveData mutableLiveData = this.w;
        switch (i) {
            case 2:
            case 7:
                s6(this);
                break;
            case 3:
            case 9:
                mutableLiveData.j(new Event(ExitScanCodeAction.VoidedTransaction.f21264a));
                break;
            case 4:
            default:
                mutableLiveData.j(new Event(scanNotComplete));
                break;
            case 5:
            case 6:
                if (kioskFlags != null && kioskFlags.isBagCheckCompleted()) {
                    s6(this);
                    break;
                } else {
                    mutableLiveData.j(new Event(scanNotComplete));
                    break;
                }
                break;
            case 8:
                mutableLiveData.j(new Event(ExitScanCodeAction.TransactionCancelled.f21262a));
                break;
        }
    }

    public final boolean t6() {
        return ((Boolean) this.z.getD()).booleanValue();
    }

    public final void u6() {
        if (t6()) {
            this.w.j(new Event(ExitScanCodeAction.RequestToConfirmBarCodeScanByStaffMember.f21259a));
            return;
        }
        q6();
        q6();
        SingleObserveOn singleObserveOnF = this.j.b(new GetProfileUC.RequestValues()).f(AndroidSchedulers.a());
        GetUserProfileSingle getUserProfileSingle = new GetUserProfileSingle();
        singleObserveOnF.a(getUserProfileSingle);
        this.e.d(getUserProfileSingle);
        this.n.c(ExitActionData.e);
    }
}
