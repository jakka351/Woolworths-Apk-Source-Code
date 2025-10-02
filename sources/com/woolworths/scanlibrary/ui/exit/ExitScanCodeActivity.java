package com.woolworths.scanlibrary.ui.exit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.WindowManager;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.data.firebase.firestore.FireStoreDataRepository;
import com.woolworths.scanlibrary.databinding.ActivityExitScanCodeBinding;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.login.LogoutManager;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import com.woolworths.scanlibrary.models.store.StoreCheckoutInstruction;
import com.woolworths.scanlibrary.ui.dto.BarCodeDTO;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeAction;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeViewModel;
import com.woolworths.scanlibrary.ui.exit.analytics.SngExitEvents;
import com.woolworths.scanlibrary.ui.receipt.ReceiptActivity;
import com.woolworths.scanlibrary.util.event.Event;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableTimer;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmActivity;", "Lcom/woolworths/scanlibrary/di/user/UserScopedActivity;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ExitScanCodeActivity extends DaggerBaseMvvmActivity implements UserScopedActivity {
    public static final /* synthetic */ int I = 0;
    public LogoutManager E;
    public ActivityExitScanCodeBinding G;
    public final ViewModelLazy F = new ViewModelLazy(Reflection.f24268a.b(ExitScanCodeViewModel.class), new Function0<ViewModelStore>() { // from class: com.woolworths.scanlibrary.ui.exit.ExitScanCodeActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new b(this, 1), new Function0<CreationExtras>() { // from class: com.woolworths.scanlibrary.ui.exit.ExitScanCodeActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy H = LazyKt.b(new b(this, 2));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeActivity$Companion;", "", "", "KEY_CART_ID", "Ljava/lang/String;", "KEY_CART_STATUS", "KEY_TRANSFER_TO_POS", "KEY_EXIT_EXTRA_DATA", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(DaggerBaseActivity daggerBaseActivity, ExitDTO exitDTO) {
            Pair[] pairArr = {new Pair("key.transfer.to.pos", Boolean.valueOf(exitDTO.e)), new Pair("key.exit_extra_data", exitDTO), new Pair("key.back.button.allowed", Boolean.FALSE)};
            Intent intent = new Intent(daggerBaseActivity, (Class<?>) ExitScanCodeActivity.class);
            intent.addFlags(0);
            intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 3)));
            daggerBaseActivity.startActivity(intent);
            daggerBaseActivity.finish();
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final int O4() {
        return R.layout.activity_exit_scan_code;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final void R4() {
        String strC;
        String string;
        String string2;
        ActivityExitScanCodeBinding activityExitScanCodeBinding = (ActivityExitScanCodeBinding) DataBindingUtil.d(this, R.layout.activity_exit_scan_code);
        this.G = activityExitScanCodeBinding;
        if (activityExitScanCodeBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        ConstraintLayout rootContainer = activityExitScanCodeBinding.B;
        Intrinsics.g(rootContainer, "rootContainer");
        ViewExtKt.b(rootContainer, new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(11));
        Parcelable parcelableExtra = getIntent().getParcelableExtra("key.exit_extra_data");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ExitDTO exitDTO = (ExitDTO) parcelableExtra;
        ActivityExitScanCodeBinding activityExitScanCodeBinding2 = this.G;
        if (activityExitScanCodeBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityExitScanCodeBinding2.L(V4());
        ActivityExitScanCodeBinding activityExitScanCodeBinding3 = this.G;
        if (activityExitScanCodeBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityExitScanCodeBinding3.D(this);
        V4().w.f(this, new Observer() { // from class: com.woolworths.scanlibrary.ui.exit.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Event event = (Event) obj;
                int i = ExitScanCodeActivity.I;
                ExitScanCodeAction exitScanCodeAction = event != null ? (ExitScanCodeAction) event.a() : null;
                if (exitScanCodeAction instanceof ExitScanCodeAction.MoveToThankYouPage) {
                    throw new IllegalStateException("Thank you scenario deprecated");
                }
                boolean z = exitScanCodeAction instanceof ExitScanCodeAction.ShowReceipt;
                ExitScanCodeActivity exitScanCodeActivity = this.d;
                if (z) {
                    int i2 = ReceiptActivity.N;
                    ReceiptActivity.Companion.a(exitScanCodeActivity, ((ExitScanCodeAction.ShowReceipt) exitScanCodeAction).f21261a, 8);
                    return;
                }
                if (exitScanCodeAction instanceof ExitScanCodeAction.TransactionCancelled) {
                    String string3 = exitScanCodeActivity.getString(R.string.sng_label_ok);
                    Intrinsics.g(string3, "getString(...)");
                    String string4 = exitScanCodeActivity.getString(R.string.sng_label_transaction_cancelled_on_kiosk_msg);
                    Intrinsics.g(string4, "getString(...)");
                    AppCompatActivityExtKt.c(exitScanCodeActivity, "", string4, string3, new b(exitScanCodeActivity, 3), false);
                    return;
                }
                if (exitScanCodeAction instanceof ExitScanCodeAction.ScanNotComplete) {
                    String string5 = exitScanCodeActivity.getString(R.string.sng_label_qr_code_not_scan_title);
                    Intrinsics.g(string5, "getString(...)");
                    String string6 = exitScanCodeActivity.getString(R.string.sng_label_ok);
                    Intrinsics.g(string6, "getString(...)");
                    String string7 = exitScanCodeActivity.getString(R.string.sng_label_qr_code_not_scan_msg);
                    Intrinsics.g(string7, "getString(...)");
                    AppCompatActivityExtKt.c(exitScanCodeActivity, string5, string7, string6, new com.woolworths.scanlibrary.domain.payment.b(2), false);
                    return;
                }
                if (exitScanCodeAction instanceof ExitScanCodeAction.VoidedTransaction) {
                    String string8 = exitScanCodeActivity.getString(R.string.sng_label_ok);
                    Intrinsics.g(string8, "getString(...)");
                    String string9 = exitScanCodeActivity.getString(R.string.sng_label_cart_session_expired_msg);
                    Intrinsics.g(string9, "getString(...)");
                    AppCompatActivityExtKt.c(exitScanCodeActivity, "", string9, string8, new b(exitScanCodeActivity, 4), false);
                    return;
                }
                if (exitScanCodeAction instanceof ExitScanCodeAction.ErrorGeneratingReceipt) {
                    String string10 = exitScanCodeActivity.getString(R.string.sng_label_receipt_generate_error_title);
                    Intrinsics.g(string10, "getString(...)");
                    String string11 = exitScanCodeActivity.getString(R.string.sng_label_ok);
                    Intrinsics.g(string11, "getString(...)");
                    String string12 = exitScanCodeActivity.getString(R.string.sng_label_receipt_generate_error);
                    Intrinsics.g(string12, "getString(...)");
                    AppCompatActivityExtKt.c(exitScanCodeActivity, string10, string12, string11, new b(exitScanCodeActivity, 5), false);
                    return;
                }
                if (exitScanCodeAction instanceof ExitScanCodeAction.RequestToConfirmBarCodeScanByStaffMember) {
                    String string13 = exitScanCodeActivity.getString(R.string.sng_label_yes);
                    Intrinsics.g(string13, "getString(...)");
                    String string14 = exitScanCodeActivity.getString(R.string.sng_label_no);
                    Intrinsics.g(string14, "getString(...)");
                    String string15 = exitScanCodeActivity.getString(R.string.sng_label_barcode_scanned_confirm);
                    Intrinsics.g(string15, "getString(...)");
                    AppCompatActivityExtKt.b(exitScanCodeActivity, "", string15, string13, new b(exitScanCodeActivity, 0), string14, new com.woolworths.scanlibrary.domain.payment.b(2), false);
                    return;
                }
                if (exitScanCodeAction instanceof ExitScanCodeAction.TransferToPosCompleted) {
                    throw new IllegalStateException("Guest thank you scenario deprecated");
                }
                if (!(exitScanCodeAction instanceof ExitScanCodeAction.ErrorConfirmingTransferToPos)) {
                    if (exitScanCodeAction != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    String string16 = exitScanCodeActivity.getString(R.string.sng_label_ok);
                    Intrinsics.g(string16, "getString(...)");
                    AppCompatActivityExtKt.c(exitScanCodeActivity, "", ((ExitScanCodeAction.ErrorConfirmingTransferToPos) exitScanCodeAction).f21257a, string16, new b(exitScanCodeActivity, 6), false);
                }
            }
        });
        U4(V4().f, V4().g);
        final ExitScanCodeViewModel exitScanCodeViewModelV4 = V4();
        MutableLiveData mutableLiveData = exitScanCodeViewModelV4.r;
        FeatureToggleManager featureToggleManager = exitScanCodeViewModelV4.p;
        AnalyticsManager analyticsManager = exitScanCodeViewModelV4.n;
        MutableLiveData mutableLiveData2 = exitScanCodeViewModelV4.v;
        MutableLiveData mutableLiveData3 = exitScanCodeViewModelV4.s;
        ResourceResolverImpl resourceResolverImpl = exitScanCodeViewModelV4.o;
        CartSessionManager cartSessionManager = exitScanCodeViewModelV4.h;
        FireStoreDataRepository fireStoreDataRepository = exitScanCodeViewModelV4.k;
        MutableLiveData mutableLiveData4 = exitScanCodeViewModelV4.t;
        exitScanCodeViewModelV4.y = exitDTO;
        exitScanCodeViewModelV4.x = exitDTO.d;
        exitScanCodeViewModelV4.A = exitDTO.h;
        if (exitScanCodeViewModelV4.t6()) {
            mutableLiveData4.m(new BarCodeDTO(exitScanCodeViewModelV4.x, BarcodeType.d));
        } else {
            fireStoreDataRepository.c(exitScanCodeViewModelV4);
            fireStoreDataRepository.b();
            if (StringsKt.D(exitScanCodeViewModelV4.x)) {
                exitScanCodeViewModelV4.q.a("W/InvalidCartId: Invalid cartId, using cartSessionManager cartId=" + cartSessionManager.c());
                strC = cartSessionManager.c();
            } else {
                strC = exitScanCodeViewModelV4.x;
            }
            mutableLiveData4.m(new BarCodeDTO(YU.a.A("EXT-", strC), featureToggleManager.c(ScanAndGoFeature.h) ? BarcodeType.d : BarcodeType.g));
        }
        exitScanCodeViewModelV4.u.m(Boolean.FALSE);
        CartStatus cartStatus = exitDTO.f;
        int i = cartStatus == null ? -1 : ExitScanCodeViewModel.WhenMappings.f21265a[cartStatus.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            StoreCheckoutInstruction storeCheckoutInstruction = exitScanCodeViewModelV4.A;
            if (storeCheckoutInstruction == null) {
                Intrinsics.p("storeCheckoutInstruction");
                throw null;
            }
            if (StringsKt.D(storeCheckoutInstruction.getTitle())) {
                string = resourceResolverImpl.getString(R.string.sng_label_proceed_to_exit_scanner_title);
            } else {
                StoreCheckoutInstruction storeCheckoutInstruction2 = exitScanCodeViewModelV4.A;
                if (storeCheckoutInstruction2 == null) {
                    Intrinsics.p("storeCheckoutInstruction");
                    throw null;
                }
                string = storeCheckoutInstruction2.getTitle();
            }
            StoreCheckoutInstruction storeCheckoutInstruction3 = exitScanCodeViewModelV4.A;
            if (storeCheckoutInstruction3 == null) {
                Intrinsics.p("storeCheckoutInstruction");
                throw null;
            }
            if (StringsKt.D(storeCheckoutInstruction3.getMessage())) {
                string2 = resourceResolverImpl.getString(R.string.sng_label_proceed_to_exit_scanner_instruction);
            } else {
                StoreCheckoutInstruction storeCheckoutInstruction4 = exitScanCodeViewModelV4.A;
                if (storeCheckoutInstruction4 == null) {
                    Intrinsics.p("storeCheckoutInstruction");
                    throw null;
                }
                string2 = storeCheckoutInstruction4.getMessage();
            }
            mutableLiveData.m(string);
            mutableLiveData3.m(string2);
            mutableLiveData2.m(Boolean.TRUE);
            analyticsManager.g(SngExitEvents.d);
        } else {
            String string3 = resourceResolverImpl.getString(R.string.sng_label_proceed_to_exit_scanner_pending_payment_title);
            String string4 = featureToggleManager.c(ScanAndGoFeature.e) ? resourceResolverImpl.getString(R.string.sng_label_proceed_to_exit_scanner_kiosk_payment_instruction) : resourceResolverImpl.getString(R.string.sng_label_proceed_to_exit_scanner_pending_payment_instruction);
            if (exitScanCodeViewModelV4.t6()) {
                string3 = resourceResolverImpl.getString(R.string.sng_label_scan_barcode_at_checkout);
                string4 = resourceResolverImpl.getString(R.string.sng_label_scan_barcode_at_checkout_instructions);
            }
            StoreCheckoutInstruction storeCheckoutInstruction5 = exitScanCodeViewModelV4.A;
            if (storeCheckoutInstruction5 == null) {
                Intrinsics.p("storeCheckoutInstruction");
                throw null;
            }
            if (!StringsKt.D(storeCheckoutInstruction5.getTitle())) {
                StoreCheckoutInstruction storeCheckoutInstruction6 = exitScanCodeViewModelV4.A;
                if (storeCheckoutInstruction6 == null) {
                    Intrinsics.p("storeCheckoutInstruction");
                    throw null;
                }
                string3 = storeCheckoutInstruction6.getTitle();
            }
            StoreCheckoutInstruction storeCheckoutInstruction7 = exitScanCodeViewModelV4.A;
            if (storeCheckoutInstruction7 == null) {
                Intrinsics.p("storeCheckoutInstruction");
                throw null;
            }
            if (!StringsKt.D(storeCheckoutInstruction7.getMessage())) {
                StoreCheckoutInstruction storeCheckoutInstruction8 = exitScanCodeViewModelV4.A;
                if (storeCheckoutInstruction8 == null) {
                    Intrinsics.p("storeCheckoutInstruction");
                    throw null;
                }
                string4 = storeCheckoutInstruction8.getMessage();
            }
            mutableLiveData.m(string3);
            mutableLiveData3.m(string4);
            mutableLiveData2.m(Boolean.valueOf(exitScanCodeViewModelV4.t6()));
            analyticsManager.g(SngExitEvents.e);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Scheduler schedulerA = AndroidSchedulers.a();
        ObjectHelper.b(timeUnit, "unit is null");
        new CompletableTimer(3L, schedulerA).a(new CallbackCompletableObserver(new Action() { // from class: com.woolworths.scanlibrary.ui.exit.c
            @Override // io.reactivex.functions.Action
            public final void run() {
                exitScanCodeViewModelV4.u.j(Boolean.TRUE);
            }
        }));
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final boolean S4() {
        return false;
    }

    public final ExitScanCodeViewModel V4() {
        return (ExitScanCodeViewModel) this.F.getD();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(4);
        super.onCreate(bundle);
        getF().a(this, new OnBackPressedCallback() { // from class: com.woolworths.scanlibrary.ui.exit.ExitScanCodeActivity.onCreate.1
            @Override // androidx.activity.OnBackPressedCallback
            public final void e() {
                ExitScanCodeActivity exitScanCodeActivity = ExitScanCodeActivity.this;
                if (((Boolean) exitScanCodeActivity.H.getD()).booleanValue()) {
                    exitScanCodeActivity.finish();
                }
            }
        });
    }
}
