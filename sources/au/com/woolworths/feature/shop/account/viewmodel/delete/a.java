package au.com.woolworths.feature.shop.account.viewmodel.delete;

import android.content.SharedPreferences;
import androidx.camera.lifecycle.ProcessCameraProvider;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.events.ForcedLogoutEvent;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerFragment;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.feature.shop.onboarding.OnboardingContract;
import au.com.woolworths.feature.shop.onboarding.OnboardingViewModel;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor$requestLocationIfEmptyCache$1;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemPresenter;
import io.reactivex.functions.Action;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Action {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.d) {
            case 0:
                DeleteAccountViewModel.p6((DeleteAccountViewModel) this.e);
                return;
            case 1:
                ProcessCameraProvider processCameraProvider = ((BarcodeScannerFragment) this.e).e;
                if (processCameraProvider != null) {
                    processCameraProvider.g();
                    return;
                } else {
                    Intrinsics.p("cameraProvider");
                    throw null;
                }
            case 2:
                SharedPreferences.Editor editorEdit = ((GuestLoginInteractorImpl) this.e).d.b.b.edit();
                editorEdit.putBoolean("forced_logged_out", true);
                editorEdit.apply();
                RxBus.a().f4592a.onNext(new ForcedLogoutEvent());
                return;
            case 3:
                OnboardingViewModel onboardingViewModel = (OnboardingViewModel) this.e;
                BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl = onboardingViewModel.f;
                PublishSubject publishSubject = onboardingViewModel.n;
                onboardingViewModel.h.a();
                String str = onboardingViewModel.p;
                boolean zO = str != null ? StringsKt.o(str, "lists/boostedOffers", false) : false;
                boolean z = !zO;
                if (!branchDeepLinkInteractorImpl.e(branchDeepLinkInteractorImpl.b()) || zO) {
                    publishSubject.onNext(new OnboardingContract.NavigationActions.ContinueAsGuest(z));
                    return;
                } else {
                    publishSubject.onNext(new OnboardingContract.NavigationActions.NavigateToBranchLink(branchDeepLinkInteractorImpl.b()));
                    return;
                }
            case 4:
                LocationInteractor locationInteractor = (LocationInteractor) this.e;
                LocationInteractor$requestLocationIfEmptyCache$1 locationInteractor$requestLocationIfEmptyCache$1 = locationInteractor.d;
                if (locationInteractor$requestLocationIfEmptyCache$1 != null) {
                    locationInteractor.c.removeLocationUpdates(locationInteractor$requestLocationIfEmptyCache$1);
                }
                locationInteractor.d = null;
                return;
            default:
                ((AddItemContract.View) ((AddItemPresenter) this.e).f21139a).N2();
                return;
        }
    }
}
