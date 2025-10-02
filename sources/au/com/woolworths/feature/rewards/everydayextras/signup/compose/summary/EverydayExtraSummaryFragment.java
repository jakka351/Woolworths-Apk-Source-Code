package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.core.processing.g;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.core.state.a;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.wallet.digipay.framesview.CardDetails;
import au.com.woolworths.base.wallet.digipay.framesview.ClearFormCommand;
import au.com.woolworths.base.wallet.digipay.framesview.EpoxyCardCaptureFramesView;
import au.com.woolworths.base.wallet.digipay.framesview.JavaScriptCommand;
import au.com.woolworths.base.wallet.digipay.framesview.SubmitFormCommand;
import au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogFragment;
import au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler;
import au.com.woolworths.base.wallet.ocr.utils.CardDetailsUtils;
import au.com.woolworths.base.wallet.ocr.utils.CardIOLaunchHelper;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.ChangePlanModalBottomSheetKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.databinding.LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryFragment;", "Landroidx/fragment/app/Fragment;", "Lau/com/woolworths/base/wallet/ocr/CameraPermissionRationaleDialogHandler;", "<init>", "()V", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EverydayExtraSummaryFragment extends Hilt_EverydayExtraSummaryFragment implements CameraPermissionRationaleDialogHandler {
    public final ViewModelLazy i;
    public final ViewModelLazy j;
    public LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding k;
    public PaymentsClient l;
    public final ActivityResultLauncher m;
    public final ActivityResultLauncher n;
    public final ActivityResultLauncher o;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "KEY_PLAN_IDENTIFIER", "", "SCAN_CARD_AUTO_LAUNCH_DELAY_MS", "J", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public EverydayExtraSummaryFragment() {
        final EverydayExtraSummaryFragment$special$$inlined$viewModels$default$1 everydayExtraSummaryFragment$special$$inlined$viewModels$default$1 = new EverydayExtraSummaryFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        final Lazy lazyA = LazyKt.a(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) everydayExtraSummaryFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.i = new ViewModelLazy(reflectionFactory.b(EverydayExtraSummaryViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        final EverydayExtraSummaryFragment$special$$inlined$viewModels$default$6 everydayExtraSummaryFragment$special$$inlined$viewModels$default$6 = new EverydayExtraSummaryFragment$special$$inlined$viewModels$default$6(this);
        final Lazy lazyA2 = LazyKt.a(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) everydayExtraSummaryFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.j = new ViewModelLazy(reflectionFactory.b(EverydayExtraChoosePlanBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA2.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA2.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA2.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        final int i = 0;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.a
            public final /* synthetic */ EverydayExtraSummaryFragment e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                PaymentCardRecognitionResult fromIntent;
                CreditCard creditCard;
                switch (i) {
                    case 0:
                        Boolean isGranted = (Boolean) obj;
                        Intrinsics.h(isGranted, "isGranted");
                        boolean zBooleanValue = isGranted.booleanValue();
                        EverydayExtraSummaryFragment everydayExtraSummaryFragment = this.e;
                        if (!zBooleanValue) {
                            everydayExtraSummaryFragment.I1().i.g(EdxSummaryAnalytics.Summary.Action.h);
                            if (!ActivityCompat.m(everydayExtraSummaryFragment.requireActivity(), "android.permission.CAMERA")) {
                                CameraPermissionRationaleDialogFragment.Companion.a(1, everydayExtraSummaryFragment.getString(R.string.everyday_extras_sign_up_request_camera_permission_message_to_settings), true).show(everydayExtraSummaryFragment.getParentFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                                break;
                            }
                        } else {
                            EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI1 = everydayExtraSummaryFragment.I1();
                            everydayExtraSummaryViewModelI1.n.f(EverydayExtraSummaryContract.Action.ShowGoogleWalletScanner.f6128a);
                            everydayExtraSummaryViewModelI1.i.g(EdxSummaryAnalytics.Summary.Action.g);
                            break;
                        }
                        break;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        Intrinsics.h(result, "result");
                        Intent intent = result.e;
                        if (intent != null && (fromIntent = PaymentCardRecognitionResult.getFromIntent(intent)) != null) {
                            EverydayExtraSummaryFragment everydayExtraSummaryFragment2 = this.e;
                            everydayExtraSummaryFragment2.I1().x6(CardDetailsUtils.a(fromIntent), everydayExtraSummaryFragment2.getD().getD().compareTo(Lifecycle.State.g) >= 0);
                            break;
                        }
                        break;
                    default:
                        ActivityResult result2 = (ActivityResult) obj;
                        Intrinsics.h(result2, "result");
                        Intent intent2 = result2.e;
                        if (intent2 != null && (creditCard = (CreditCard) intent2.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT)) != null) {
                            EverydayExtraSummaryFragment everydayExtraSummaryFragment3 = this.e;
                            EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI12 = everydayExtraSummaryFragment3.I1();
                            String cardNumber = creditCard.cardNumber;
                            Intrinsics.g(cardNumber, "cardNumber");
                            everydayExtraSummaryViewModelI12.x6(CardDetailsUtils.b(cardNumber, Integer.valueOf(creditCard.expiryMonth), Integer.valueOf(creditCard.expiryYear), creditCard.cvv), everydayExtraSummaryFragment3.getD().getD().compareTo(Lifecycle.State.g) >= 0);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.m = activityResultLauncherRegisterForActivityResult;
        final int i2 = 1;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.a
            public final /* synthetic */ EverydayExtraSummaryFragment e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                PaymentCardRecognitionResult fromIntent;
                CreditCard creditCard;
                switch (i2) {
                    case 0:
                        Boolean isGranted = (Boolean) obj;
                        Intrinsics.h(isGranted, "isGranted");
                        boolean zBooleanValue = isGranted.booleanValue();
                        EverydayExtraSummaryFragment everydayExtraSummaryFragment = this.e;
                        if (!zBooleanValue) {
                            everydayExtraSummaryFragment.I1().i.g(EdxSummaryAnalytics.Summary.Action.h);
                            if (!ActivityCompat.m(everydayExtraSummaryFragment.requireActivity(), "android.permission.CAMERA")) {
                                CameraPermissionRationaleDialogFragment.Companion.a(1, everydayExtraSummaryFragment.getString(R.string.everyday_extras_sign_up_request_camera_permission_message_to_settings), true).show(everydayExtraSummaryFragment.getParentFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                                break;
                            }
                        } else {
                            EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI1 = everydayExtraSummaryFragment.I1();
                            everydayExtraSummaryViewModelI1.n.f(EverydayExtraSummaryContract.Action.ShowGoogleWalletScanner.f6128a);
                            everydayExtraSummaryViewModelI1.i.g(EdxSummaryAnalytics.Summary.Action.g);
                            break;
                        }
                        break;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        Intrinsics.h(result, "result");
                        Intent intent = result.e;
                        if (intent != null && (fromIntent = PaymentCardRecognitionResult.getFromIntent(intent)) != null) {
                            EverydayExtraSummaryFragment everydayExtraSummaryFragment2 = this.e;
                            everydayExtraSummaryFragment2.I1().x6(CardDetailsUtils.a(fromIntent), everydayExtraSummaryFragment2.getD().getD().compareTo(Lifecycle.State.g) >= 0);
                            break;
                        }
                        break;
                    default:
                        ActivityResult result2 = (ActivityResult) obj;
                        Intrinsics.h(result2, "result");
                        Intent intent2 = result2.e;
                        if (intent2 != null && (creditCard = (CreditCard) intent2.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT)) != null) {
                            EverydayExtraSummaryFragment everydayExtraSummaryFragment3 = this.e;
                            EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI12 = everydayExtraSummaryFragment3.I1();
                            String cardNumber = creditCard.cardNumber;
                            Intrinsics.g(cardNumber, "cardNumber");
                            everydayExtraSummaryViewModelI12.x6(CardDetailsUtils.b(cardNumber, Integer.valueOf(creditCard.expiryMonth), Integer.valueOf(creditCard.expiryYear), creditCard.cvv), everydayExtraSummaryFragment3.getD().getD().compareTo(Lifecycle.State.g) >= 0);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.n = activityResultLauncherRegisterForActivityResult2;
        final int i3 = 2;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.a
            public final /* synthetic */ EverydayExtraSummaryFragment e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                PaymentCardRecognitionResult fromIntent;
                CreditCard creditCard;
                switch (i3) {
                    case 0:
                        Boolean isGranted = (Boolean) obj;
                        Intrinsics.h(isGranted, "isGranted");
                        boolean zBooleanValue = isGranted.booleanValue();
                        EverydayExtraSummaryFragment everydayExtraSummaryFragment = this.e;
                        if (!zBooleanValue) {
                            everydayExtraSummaryFragment.I1().i.g(EdxSummaryAnalytics.Summary.Action.h);
                            if (!ActivityCompat.m(everydayExtraSummaryFragment.requireActivity(), "android.permission.CAMERA")) {
                                CameraPermissionRationaleDialogFragment.Companion.a(1, everydayExtraSummaryFragment.getString(R.string.everyday_extras_sign_up_request_camera_permission_message_to_settings), true).show(everydayExtraSummaryFragment.getParentFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                                break;
                            }
                        } else {
                            EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI1 = everydayExtraSummaryFragment.I1();
                            everydayExtraSummaryViewModelI1.n.f(EverydayExtraSummaryContract.Action.ShowGoogleWalletScanner.f6128a);
                            everydayExtraSummaryViewModelI1.i.g(EdxSummaryAnalytics.Summary.Action.g);
                            break;
                        }
                        break;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        Intrinsics.h(result, "result");
                        Intent intent = result.e;
                        if (intent != null && (fromIntent = PaymentCardRecognitionResult.getFromIntent(intent)) != null) {
                            EverydayExtraSummaryFragment everydayExtraSummaryFragment2 = this.e;
                            everydayExtraSummaryFragment2.I1().x6(CardDetailsUtils.a(fromIntent), everydayExtraSummaryFragment2.getD().getD().compareTo(Lifecycle.State.g) >= 0);
                            break;
                        }
                        break;
                    default:
                        ActivityResult result2 = (ActivityResult) obj;
                        Intrinsics.h(result2, "result");
                        Intent intent2 = result2.e;
                        if (intent2 != null && (creditCard = (CreditCard) intent2.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT)) != null) {
                            EverydayExtraSummaryFragment everydayExtraSummaryFragment3 = this.e;
                            EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI12 = everydayExtraSummaryFragment3.I1();
                            String cardNumber = creditCard.cardNumber;
                            Intrinsics.g(cardNumber, "cardNumber");
                            everydayExtraSummaryViewModelI12.x6(CardDetailsUtils.b(cardNumber, Integer.valueOf(creditCard.expiryMonth), Integer.valueOf(creditCard.expiryYear), creditCard.cvv), everydayExtraSummaryFragment3.getD().getD().compareTo(Lifecycle.State.g) >= 0);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.o = activityResultLauncherRegisterForActivityResult3;
    }

    public final EverydayExtraSummaryViewModel I1() {
        return (EverydayExtraSummaryViewModel) this.i.getD();
    }

    public final void Q1() {
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        this.o.a(CardIOLaunchHelper.a(contextRequireContext, Activities.RewardsWalletOcr.Origin.d), null);
        I1().i.g(EdxSummaryAnalytics.Summary.Action.l);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l = Wallet.getPaymentsClient((Activity) requireActivity(), new Wallet.WalletOptions.Builder().setEnvironment(1).build());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final EverydayExtraSummaryFragment everydayExtraSummaryFragment = this.d;
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(682556100, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (objG == composer$Companion$Empty$1) {
                                    objG = android.support.v4.media.session.a.i(composer2.y(), composer2);
                                }
                                final CoroutineScope coroutineScope = (CoroutineScope) objG;
                                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.d;
                                composer2.o(1849434622);
                                Object objG2 = composer2.G();
                                if (objG2 == composer$Companion$Empty$1) {
                                    objG2 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(1);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(modalBottomSheetValue, (Function1) objG2, composer2, 3462, 2);
                                final EverydayExtraSummaryFragment everydayExtraSummaryFragment2 = everydayExtraSummaryFragment;
                                EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI1 = everydayExtraSummaryFragment2.I1();
                                Bundle arguments = everydayExtraSummaryFragment2.getArguments();
                                String string = arguments != null ? arguments.getString("KEY_PLAN_IDENTIFIER") : null;
                                if (string == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                composer2.o(5004770);
                                boolean zI = composer2.I(everydayExtraSummaryFragment2);
                                Object objG3 = composer2.G();
                                if (zI || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new c(everydayExtraSummaryFragment2, 4);
                                    composer2.A(objG3);
                                }
                                Function1 function1 = (Function1) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(everydayExtraSummaryFragment2);
                                Object objG4 = composer2.G();
                                if (zI2 || objG4 == composer$Companion$Empty$1) {
                                    final int i = 2;
                                    objG4 = new Function0() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView;
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView2;
                                            int i2 = i;
                                            int i3 = 0;
                                            Unit unit = Unit.f24250a;
                                            EverydayExtraSummaryFragment everydayExtraSummaryFragment3 = everydayExtraSummaryFragment2;
                                            switch (i2) {
                                                case 0:
                                                    CameraPermissionRationaleDialogFragment.Companion.a(1, everydayExtraSummaryFragment3.getString(R.string.everyday_extras_sign_up_request_camera_permission_message), false).show(everydayExtraSummaryFragment3.getParentFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                                                    return unit;
                                                case 1:
                                                    PaymentCardRecognitionIntentRequest defaultInstance = PaymentCardRecognitionIntentRequest.getDefaultInstance();
                                                    Intrinsics.g(defaultInstance, "getDefaultInstance(...)");
                                                    PaymentsClient paymentsClient = everydayExtraSummaryFragment3.l;
                                                    if (paymentsClient != null) {
                                                        paymentsClient.getPaymentCardRecognitionIntent(defaultInstance).addOnSuccessListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(new c(everydayExtraSummaryFragment3, i3), 24)).addOnFailureListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(everydayExtraSummaryFragment3, 25));
                                                        return unit;
                                                    }
                                                    Intrinsics.p("googlePaymentsClient");
                                                    throw null;
                                                case 2:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding != null && (epoxyCardCaptureFramesView = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding.y) != null) {
                                                        Bark.f8483a.a("Frames SDK: form cleared");
                                                        JavaScriptCommand.a(ClearFormCommand.b, epoxyCardCaptureFramesView);
                                                    }
                                                    return unit;
                                                case 3:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 != null && (epoxyCardCaptureFramesView2 = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2.y) != null) {
                                                        Bark.Companion companion = Bark.f8483a;
                                                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Frames SDK: submit form command posted", null, 12);
                                                        epoxyCardCaptureFramesView2.post(new g(12, epoxyCardCaptureFramesView2, SubmitFormCommand.b, new au.com.woolworths.base.wallet.digipay.framesview.c(epoxyCardCaptureFramesView2, 0)));
                                                    }
                                                    return unit;
                                                case 4:
                                                    EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI12 = everydayExtraSummaryFragment3.I1();
                                                    boolean z = ContextCompat.a(everydayExtraSummaryFragment3.requireContext(), "android.permission.CAMERA") == 0;
                                                    boolean zM = ActivityCompat.m(everydayExtraSummaryFragment3.requireActivity(), "android.permission.CAMERA");
                                                    SharedFlowImpl sharedFlowImpl = everydayExtraSummaryViewModelI12.n;
                                                    if (z) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowGoogleWalletScanner.f6128a);
                                                    } else if (zM) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowCameraPermissionRationale.f6126a);
                                                    } else {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.RequestCameraPermission.f6123a);
                                                    }
                                                    AnalyticsManager analyticsManager = everydayExtraSummaryViewModelI12.i;
                                                    EdxSummaryAnalytics.Summary.Action.d.getClass();
                                                    analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics$Summary$Action$Companion$scanCardClick$1
                                                        public final Object d;

                                                        {
                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                            spreadBuilder.b(EdxSummaryAnalytics.Summary.f);
                                                            spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                                                            spreadBuilder.a(new Pair("event.Action", "button_click"));
                                                            a.z("event.Label", "scan card", spreadBuilder, "event.Description", "Scan Library OCR");
                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                        }

                                                        @Override // au.com.woolworths.analytics.Event
                                                        /* renamed from: d */
                                                        public final String getD() {
                                                            return "scan_card_click";
                                                        }

                                                        public final boolean equals(Object obj5) {
                                                            if (!(obj5 instanceof Event)) {
                                                                return false;
                                                            }
                                                            Event event = (Event) obj5;
                                                            return "scan_card_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                        }

                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                        @Override // au.com.woolworths.analytics.Event
                                                        public final Map getData() {
                                                            return this.d;
                                                        }
                                                    });
                                                    return unit;
                                                default:
                                                    everydayExtraSummaryFragment3.m.a("android.permission.CAMERA", null);
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG4);
                                }
                                Function0 function0 = (Function0) objG4;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(everydayExtraSummaryFragment2);
                                Object objG5 = composer2.G();
                                if (zI3 || objG5 == composer$Companion$Empty$1) {
                                    final int i2 = 3;
                                    objG5 = new Function0() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView;
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView2;
                                            int i22 = i2;
                                            int i3 = 0;
                                            Unit unit = Unit.f24250a;
                                            EverydayExtraSummaryFragment everydayExtraSummaryFragment3 = everydayExtraSummaryFragment2;
                                            switch (i22) {
                                                case 0:
                                                    CameraPermissionRationaleDialogFragment.Companion.a(1, everydayExtraSummaryFragment3.getString(R.string.everyday_extras_sign_up_request_camera_permission_message), false).show(everydayExtraSummaryFragment3.getParentFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                                                    return unit;
                                                case 1:
                                                    PaymentCardRecognitionIntentRequest defaultInstance = PaymentCardRecognitionIntentRequest.getDefaultInstance();
                                                    Intrinsics.g(defaultInstance, "getDefaultInstance(...)");
                                                    PaymentsClient paymentsClient = everydayExtraSummaryFragment3.l;
                                                    if (paymentsClient != null) {
                                                        paymentsClient.getPaymentCardRecognitionIntent(defaultInstance).addOnSuccessListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(new c(everydayExtraSummaryFragment3, i3), 24)).addOnFailureListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(everydayExtraSummaryFragment3, 25));
                                                        return unit;
                                                    }
                                                    Intrinsics.p("googlePaymentsClient");
                                                    throw null;
                                                case 2:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding != null && (epoxyCardCaptureFramesView = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding.y) != null) {
                                                        Bark.f8483a.a("Frames SDK: form cleared");
                                                        JavaScriptCommand.a(ClearFormCommand.b, epoxyCardCaptureFramesView);
                                                    }
                                                    return unit;
                                                case 3:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 != null && (epoxyCardCaptureFramesView2 = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2.y) != null) {
                                                        Bark.Companion companion = Bark.f8483a;
                                                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Frames SDK: submit form command posted", null, 12);
                                                        epoxyCardCaptureFramesView2.post(new g(12, epoxyCardCaptureFramesView2, SubmitFormCommand.b, new au.com.woolworths.base.wallet.digipay.framesview.c(epoxyCardCaptureFramesView2, 0)));
                                                    }
                                                    return unit;
                                                case 4:
                                                    EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI12 = everydayExtraSummaryFragment3.I1();
                                                    boolean z = ContextCompat.a(everydayExtraSummaryFragment3.requireContext(), "android.permission.CAMERA") == 0;
                                                    boolean zM = ActivityCompat.m(everydayExtraSummaryFragment3.requireActivity(), "android.permission.CAMERA");
                                                    SharedFlowImpl sharedFlowImpl = everydayExtraSummaryViewModelI12.n;
                                                    if (z) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowGoogleWalletScanner.f6128a);
                                                    } else if (zM) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowCameraPermissionRationale.f6126a);
                                                    } else {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.RequestCameraPermission.f6123a);
                                                    }
                                                    AnalyticsManager analyticsManager = everydayExtraSummaryViewModelI12.i;
                                                    EdxSummaryAnalytics.Summary.Action.d.getClass();
                                                    analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics$Summary$Action$Companion$scanCardClick$1
                                                        public final Object d;

                                                        {
                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                            spreadBuilder.b(EdxSummaryAnalytics.Summary.f);
                                                            spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                                                            spreadBuilder.a(new Pair("event.Action", "button_click"));
                                                            a.z("event.Label", "scan card", spreadBuilder, "event.Description", "Scan Library OCR");
                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                        }

                                                        @Override // au.com.woolworths.analytics.Event
                                                        /* renamed from: d */
                                                        public final String getD() {
                                                            return "scan_card_click";
                                                        }

                                                        public final boolean equals(Object obj5) {
                                                            if (!(obj5 instanceof Event)) {
                                                                return false;
                                                            }
                                                            Event event = (Event) obj5;
                                                            return "scan_card_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                        }

                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                        @Override // au.com.woolworths.analytics.Event
                                                        public final Map getData() {
                                                            return this.d;
                                                        }
                                                    });
                                                    return unit;
                                                default:
                                                    everydayExtraSummaryFragment3.m.a("android.permission.CAMERA", null);
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG5);
                                }
                                Function0 function02 = (Function0) objG5;
                                composer2.l();
                                composer2.o(-1746271574);
                                boolean zI4 = composer2.I(coroutineScope) | composer2.I(everydayExtraSummaryFragment2) | composer2.I(modalBottomSheetStateC);
                                Object objG6 = composer2.G();
                                if (zI4 || objG6 == composer$Companion$Empty$1) {
                                    objG6 = new Function1() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            String it = (String) obj5;
                                            Intrinsics.h(it, "it");
                                            BuildersKt.c(coroutineScope, null, null, new EverydayExtraSummaryFragment$onCreateView$1$1$1$4$1$1(everydayExtraSummaryFragment2, it, modalBottomSheetStateC, null), 3);
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG6);
                                }
                                Function1 function12 = (Function1) objG6;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(everydayExtraSummaryFragment2);
                                Object objG7 = composer2.G();
                                if (zI5 || objG7 == composer$Companion$Empty$1) {
                                    final int i3 = 4;
                                    objG7 = new Function0() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView;
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView2;
                                            int i22 = i3;
                                            int i32 = 0;
                                            Unit unit = Unit.f24250a;
                                            EverydayExtraSummaryFragment everydayExtraSummaryFragment3 = everydayExtraSummaryFragment2;
                                            switch (i22) {
                                                case 0:
                                                    CameraPermissionRationaleDialogFragment.Companion.a(1, everydayExtraSummaryFragment3.getString(R.string.everyday_extras_sign_up_request_camera_permission_message), false).show(everydayExtraSummaryFragment3.getParentFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                                                    return unit;
                                                case 1:
                                                    PaymentCardRecognitionIntentRequest defaultInstance = PaymentCardRecognitionIntentRequest.getDefaultInstance();
                                                    Intrinsics.g(defaultInstance, "getDefaultInstance(...)");
                                                    PaymentsClient paymentsClient = everydayExtraSummaryFragment3.l;
                                                    if (paymentsClient != null) {
                                                        paymentsClient.getPaymentCardRecognitionIntent(defaultInstance).addOnSuccessListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(new c(everydayExtraSummaryFragment3, i32), 24)).addOnFailureListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(everydayExtraSummaryFragment3, 25));
                                                        return unit;
                                                    }
                                                    Intrinsics.p("googlePaymentsClient");
                                                    throw null;
                                                case 2:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding != null && (epoxyCardCaptureFramesView = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding.y) != null) {
                                                        Bark.f8483a.a("Frames SDK: form cleared");
                                                        JavaScriptCommand.a(ClearFormCommand.b, epoxyCardCaptureFramesView);
                                                    }
                                                    return unit;
                                                case 3:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 != null && (epoxyCardCaptureFramesView2 = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2.y) != null) {
                                                        Bark.Companion companion = Bark.f8483a;
                                                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Frames SDK: submit form command posted", null, 12);
                                                        epoxyCardCaptureFramesView2.post(new g(12, epoxyCardCaptureFramesView2, SubmitFormCommand.b, new au.com.woolworths.base.wallet.digipay.framesview.c(epoxyCardCaptureFramesView2, 0)));
                                                    }
                                                    return unit;
                                                case 4:
                                                    EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI12 = everydayExtraSummaryFragment3.I1();
                                                    boolean z = ContextCompat.a(everydayExtraSummaryFragment3.requireContext(), "android.permission.CAMERA") == 0;
                                                    boolean zM = ActivityCompat.m(everydayExtraSummaryFragment3.requireActivity(), "android.permission.CAMERA");
                                                    SharedFlowImpl sharedFlowImpl = everydayExtraSummaryViewModelI12.n;
                                                    if (z) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowGoogleWalletScanner.f6128a);
                                                    } else if (zM) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowCameraPermissionRationale.f6126a);
                                                    } else {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.RequestCameraPermission.f6123a);
                                                    }
                                                    AnalyticsManager analyticsManager = everydayExtraSummaryViewModelI12.i;
                                                    EdxSummaryAnalytics.Summary.Action.d.getClass();
                                                    analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics$Summary$Action$Companion$scanCardClick$1
                                                        public final Object d;

                                                        {
                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                            spreadBuilder.b(EdxSummaryAnalytics.Summary.f);
                                                            spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                                                            spreadBuilder.a(new Pair("event.Action", "button_click"));
                                                            a.z("event.Label", "scan card", spreadBuilder, "event.Description", "Scan Library OCR");
                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                        }

                                                        @Override // au.com.woolworths.analytics.Event
                                                        /* renamed from: d */
                                                        public final String getD() {
                                                            return "scan_card_click";
                                                        }

                                                        public final boolean equals(Object obj5) {
                                                            if (!(obj5 instanceof Event)) {
                                                                return false;
                                                            }
                                                            Event event = (Event) obj5;
                                                            return "scan_card_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                        }

                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                        @Override // au.com.woolworths.analytics.Event
                                                        public final Map getData() {
                                                            return this.d;
                                                        }
                                                    });
                                                    return unit;
                                                default:
                                                    everydayExtraSummaryFragment3.m.a("android.permission.CAMERA", null);
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG7);
                                }
                                Function0 function03 = (Function0) objG7;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(everydayExtraSummaryFragment2);
                                Object objG8 = composer2.G();
                                if (zI6 || objG8 == composer$Companion$Empty$1) {
                                    final int i4 = 5;
                                    objG8 = new Function0() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView;
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView2;
                                            int i22 = i4;
                                            int i32 = 0;
                                            Unit unit = Unit.f24250a;
                                            EverydayExtraSummaryFragment everydayExtraSummaryFragment3 = everydayExtraSummaryFragment2;
                                            switch (i22) {
                                                case 0:
                                                    CameraPermissionRationaleDialogFragment.Companion.a(1, everydayExtraSummaryFragment3.getString(R.string.everyday_extras_sign_up_request_camera_permission_message), false).show(everydayExtraSummaryFragment3.getParentFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                                                    return unit;
                                                case 1:
                                                    PaymentCardRecognitionIntentRequest defaultInstance = PaymentCardRecognitionIntentRequest.getDefaultInstance();
                                                    Intrinsics.g(defaultInstance, "getDefaultInstance(...)");
                                                    PaymentsClient paymentsClient = everydayExtraSummaryFragment3.l;
                                                    if (paymentsClient != null) {
                                                        paymentsClient.getPaymentCardRecognitionIntent(defaultInstance).addOnSuccessListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(new c(everydayExtraSummaryFragment3, i32), 24)).addOnFailureListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(everydayExtraSummaryFragment3, 25));
                                                        return unit;
                                                    }
                                                    Intrinsics.p("googlePaymentsClient");
                                                    throw null;
                                                case 2:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding != null && (epoxyCardCaptureFramesView = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding.y) != null) {
                                                        Bark.f8483a.a("Frames SDK: form cleared");
                                                        JavaScriptCommand.a(ClearFormCommand.b, epoxyCardCaptureFramesView);
                                                    }
                                                    return unit;
                                                case 3:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 != null && (epoxyCardCaptureFramesView2 = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2.y) != null) {
                                                        Bark.Companion companion = Bark.f8483a;
                                                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Frames SDK: submit form command posted", null, 12);
                                                        epoxyCardCaptureFramesView2.post(new g(12, epoxyCardCaptureFramesView2, SubmitFormCommand.b, new au.com.woolworths.base.wallet.digipay.framesview.c(epoxyCardCaptureFramesView2, 0)));
                                                    }
                                                    return unit;
                                                case 4:
                                                    EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI12 = everydayExtraSummaryFragment3.I1();
                                                    boolean z = ContextCompat.a(everydayExtraSummaryFragment3.requireContext(), "android.permission.CAMERA") == 0;
                                                    boolean zM = ActivityCompat.m(everydayExtraSummaryFragment3.requireActivity(), "android.permission.CAMERA");
                                                    SharedFlowImpl sharedFlowImpl = everydayExtraSummaryViewModelI12.n;
                                                    if (z) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowGoogleWalletScanner.f6128a);
                                                    } else if (zM) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowCameraPermissionRationale.f6126a);
                                                    } else {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.RequestCameraPermission.f6123a);
                                                    }
                                                    AnalyticsManager analyticsManager = everydayExtraSummaryViewModelI12.i;
                                                    EdxSummaryAnalytics.Summary.Action.d.getClass();
                                                    analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics$Summary$Action$Companion$scanCardClick$1
                                                        public final Object d;

                                                        {
                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                            spreadBuilder.b(EdxSummaryAnalytics.Summary.f);
                                                            spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                                                            spreadBuilder.a(new Pair("event.Action", "button_click"));
                                                            a.z("event.Label", "scan card", spreadBuilder, "event.Description", "Scan Library OCR");
                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                        }

                                                        @Override // au.com.woolworths.analytics.Event
                                                        /* renamed from: d */
                                                        public final String getD() {
                                                            return "scan_card_click";
                                                        }

                                                        public final boolean equals(Object obj5) {
                                                            if (!(obj5 instanceof Event)) {
                                                                return false;
                                                            }
                                                            Event event = (Event) obj5;
                                                            return "scan_card_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                        }

                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                        @Override // au.com.woolworths.analytics.Event
                                                        public final Map getData() {
                                                            return this.d;
                                                        }
                                                    });
                                                    return unit;
                                                default:
                                                    everydayExtraSummaryFragment3.m.a("android.permission.CAMERA", null);
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG8);
                                }
                                Function0 function04 = (Function0) objG8;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI7 = composer2.I(everydayExtraSummaryFragment2);
                                Object objG9 = composer2.G();
                                if (zI7 || objG9 == composer$Companion$Empty$1) {
                                    final int i5 = 0;
                                    objG9 = new Function0() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView;
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView2;
                                            int i22 = i5;
                                            int i32 = 0;
                                            Unit unit = Unit.f24250a;
                                            EverydayExtraSummaryFragment everydayExtraSummaryFragment3 = everydayExtraSummaryFragment2;
                                            switch (i22) {
                                                case 0:
                                                    CameraPermissionRationaleDialogFragment.Companion.a(1, everydayExtraSummaryFragment3.getString(R.string.everyday_extras_sign_up_request_camera_permission_message), false).show(everydayExtraSummaryFragment3.getParentFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                                                    return unit;
                                                case 1:
                                                    PaymentCardRecognitionIntentRequest defaultInstance = PaymentCardRecognitionIntentRequest.getDefaultInstance();
                                                    Intrinsics.g(defaultInstance, "getDefaultInstance(...)");
                                                    PaymentsClient paymentsClient = everydayExtraSummaryFragment3.l;
                                                    if (paymentsClient != null) {
                                                        paymentsClient.getPaymentCardRecognitionIntent(defaultInstance).addOnSuccessListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(new c(everydayExtraSummaryFragment3, i32), 24)).addOnFailureListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(everydayExtraSummaryFragment3, 25));
                                                        return unit;
                                                    }
                                                    Intrinsics.p("googlePaymentsClient");
                                                    throw null;
                                                case 2:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding != null && (epoxyCardCaptureFramesView = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding.y) != null) {
                                                        Bark.f8483a.a("Frames SDK: form cleared");
                                                        JavaScriptCommand.a(ClearFormCommand.b, epoxyCardCaptureFramesView);
                                                    }
                                                    return unit;
                                                case 3:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 != null && (epoxyCardCaptureFramesView2 = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2.y) != null) {
                                                        Bark.Companion companion = Bark.f8483a;
                                                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Frames SDK: submit form command posted", null, 12);
                                                        epoxyCardCaptureFramesView2.post(new g(12, epoxyCardCaptureFramesView2, SubmitFormCommand.b, new au.com.woolworths.base.wallet.digipay.framesview.c(epoxyCardCaptureFramesView2, 0)));
                                                    }
                                                    return unit;
                                                case 4:
                                                    EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI12 = everydayExtraSummaryFragment3.I1();
                                                    boolean z = ContextCompat.a(everydayExtraSummaryFragment3.requireContext(), "android.permission.CAMERA") == 0;
                                                    boolean zM = ActivityCompat.m(everydayExtraSummaryFragment3.requireActivity(), "android.permission.CAMERA");
                                                    SharedFlowImpl sharedFlowImpl = everydayExtraSummaryViewModelI12.n;
                                                    if (z) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowGoogleWalletScanner.f6128a);
                                                    } else if (zM) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowCameraPermissionRationale.f6126a);
                                                    } else {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.RequestCameraPermission.f6123a);
                                                    }
                                                    AnalyticsManager analyticsManager = everydayExtraSummaryViewModelI12.i;
                                                    EdxSummaryAnalytics.Summary.Action.d.getClass();
                                                    analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics$Summary$Action$Companion$scanCardClick$1
                                                        public final Object d;

                                                        {
                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                            spreadBuilder.b(EdxSummaryAnalytics.Summary.f);
                                                            spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                                                            spreadBuilder.a(new Pair("event.Action", "button_click"));
                                                            a.z("event.Label", "scan card", spreadBuilder, "event.Description", "Scan Library OCR");
                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                        }

                                                        @Override // au.com.woolworths.analytics.Event
                                                        /* renamed from: d */
                                                        public final String getD() {
                                                            return "scan_card_click";
                                                        }

                                                        public final boolean equals(Object obj5) {
                                                            if (!(obj5 instanceof Event)) {
                                                                return false;
                                                            }
                                                            Event event = (Event) obj5;
                                                            return "scan_card_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                        }

                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                        @Override // au.com.woolworths.analytics.Event
                                                        public final Map getData() {
                                                            return this.d;
                                                        }
                                                    });
                                                    return unit;
                                                default:
                                                    everydayExtraSummaryFragment3.m.a("android.permission.CAMERA", null);
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG9);
                                }
                                Function0 function05 = (Function0) objG9;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI8 = composer2.I(everydayExtraSummaryFragment2);
                                Object objG10 = composer2.G();
                                if (zI8 || objG10 == composer$Companion$Empty$1) {
                                    final int i6 = 1;
                                    objG10 = new Function0() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView;
                                            EpoxyCardCaptureFramesView epoxyCardCaptureFramesView2;
                                            int i22 = i6;
                                            int i32 = 0;
                                            Unit unit = Unit.f24250a;
                                            EverydayExtraSummaryFragment everydayExtraSummaryFragment3 = everydayExtraSummaryFragment2;
                                            switch (i22) {
                                                case 0:
                                                    CameraPermissionRationaleDialogFragment.Companion.a(1, everydayExtraSummaryFragment3.getString(R.string.everyday_extras_sign_up_request_camera_permission_message), false).show(everydayExtraSummaryFragment3.getParentFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                                                    return unit;
                                                case 1:
                                                    PaymentCardRecognitionIntentRequest defaultInstance = PaymentCardRecognitionIntentRequest.getDefaultInstance();
                                                    Intrinsics.g(defaultInstance, "getDefaultInstance(...)");
                                                    PaymentsClient paymentsClient = everydayExtraSummaryFragment3.l;
                                                    if (paymentsClient != null) {
                                                        paymentsClient.getPaymentCardRecognitionIntent(defaultInstance).addOnSuccessListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(new c(everydayExtraSummaryFragment3, i32), 24)).addOnFailureListener(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(everydayExtraSummaryFragment3, 25));
                                                        return unit;
                                                    }
                                                    Intrinsics.p("googlePaymentsClient");
                                                    throw null;
                                                case 2:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding != null && (epoxyCardCaptureFramesView = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding.y) != null) {
                                                        Bark.f8483a.a("Frames SDK: form cleared");
                                                        JavaScriptCommand.a(ClearFormCommand.b, epoxyCardCaptureFramesView);
                                                    }
                                                    return unit;
                                                case 3:
                                                    LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 = everydayExtraSummaryFragment3.k;
                                                    if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 != null && (epoxyCardCaptureFramesView2 = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2.y) != null) {
                                                        Bark.Companion companion = Bark.f8483a;
                                                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Frames SDK: submit form command posted", null, 12);
                                                        epoxyCardCaptureFramesView2.post(new g(12, epoxyCardCaptureFramesView2, SubmitFormCommand.b, new au.com.woolworths.base.wallet.digipay.framesview.c(epoxyCardCaptureFramesView2, 0)));
                                                    }
                                                    return unit;
                                                case 4:
                                                    EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI12 = everydayExtraSummaryFragment3.I1();
                                                    boolean z = ContextCompat.a(everydayExtraSummaryFragment3.requireContext(), "android.permission.CAMERA") == 0;
                                                    boolean zM = ActivityCompat.m(everydayExtraSummaryFragment3.requireActivity(), "android.permission.CAMERA");
                                                    SharedFlowImpl sharedFlowImpl = everydayExtraSummaryViewModelI12.n;
                                                    if (z) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowGoogleWalletScanner.f6128a);
                                                    } else if (zM) {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.ShowCameraPermissionRationale.f6126a);
                                                    } else {
                                                        sharedFlowImpl.f(EverydayExtraSummaryContract.Action.RequestCameraPermission.f6123a);
                                                    }
                                                    AnalyticsManager analyticsManager = everydayExtraSummaryViewModelI12.i;
                                                    EdxSummaryAnalytics.Summary.Action.d.getClass();
                                                    analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics$Summary$Action$Companion$scanCardClick$1
                                                        public final Object d;

                                                        {
                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                            spreadBuilder.b(EdxSummaryAnalytics.Summary.f);
                                                            spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                                                            spreadBuilder.a(new Pair("event.Action", "button_click"));
                                                            a.z("event.Label", "scan card", spreadBuilder, "event.Description", "Scan Library OCR");
                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                        }

                                                        @Override // au.com.woolworths.analytics.Event
                                                        /* renamed from: d */
                                                        public final String getD() {
                                                            return "scan_card_click";
                                                        }

                                                        public final boolean equals(Object obj5) {
                                                            if (!(obj5 instanceof Event)) {
                                                                return false;
                                                            }
                                                            Event event = (Event) obj5;
                                                            return "scan_card_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                        }

                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                        @Override // au.com.woolworths.analytics.Event
                                                        public final Map getData() {
                                                            return this.d;
                                                        }
                                                    });
                                                    return unit;
                                                default:
                                                    everydayExtraSummaryFragment3.m.a("android.permission.CAMERA", null);
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG10);
                                }
                                Function0 function06 = (Function0) objG10;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI9 = composer2.I(everydayExtraSummaryFragment2);
                                Object objG11 = composer2.G();
                                if (zI9 || objG11 == composer$Companion$Empty$1) {
                                    objG11 = new c(everydayExtraSummaryFragment2, 1);
                                    composer2.A(objG11);
                                }
                                Function1 function13 = (Function1) objG11;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI10 = composer2.I(everydayExtraSummaryFragment2);
                                Object objG12 = composer2.G();
                                if (zI10 || objG12 == composer$Companion$Empty$1) {
                                    objG12 = new c(everydayExtraSummaryFragment2, 2);
                                    composer2.A(objG12);
                                }
                                Function1 function14 = (Function1) objG12;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI11 = composer2.I(everydayExtraSummaryFragment2);
                                Object objG13 = composer2.G();
                                if (zI11 || objG13 == composer$Companion$Empty$1) {
                                    objG13 = new au.com.woolworths.design.core.ui.component.experimental.chip.e(everydayExtraSummaryFragment2, 15);
                                    composer2.A(objG13);
                                }
                                Function2 function2 = (Function2) objG13;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI12 = composer2.I(everydayExtraSummaryFragment2);
                                Object objG14 = composer2.G();
                                if (zI12 || objG14 == composer$Companion$Empty$1) {
                                    objG14 = new c(everydayExtraSummaryFragment2, 3);
                                    composer2.A(objG14);
                                }
                                composer2.l();
                                SummaryScreenKt.d(everydayExtraSummaryViewModelI1, string, function1, function0, function02, function12, function03, function04, function05, function06, function13, function14, function2, (Function1) objG14, ComposableLambdaKt.c(-675065864, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment.onCreateView.1.1.1.13
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        Composer composer3 = (Composer) obj5;
                                        if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            EverydayExtraSummaryFragment everydayExtraSummaryFragment3 = everydayExtraSummaryFragment2;
                                            EverydayExtraChoosePlanBottomSheetViewModel everydayExtraChoosePlanBottomSheetViewModel = (EverydayExtraChoosePlanBottomSheetViewModel) everydayExtraSummaryFragment3.j.getD();
                                            composer3.o(5004770);
                                            boolean zI13 = composer3.I(everydayExtraSummaryFragment3);
                                            Object objG15 = composer3.G();
                                            if (zI13 || objG15 == Composer.Companion.f1624a) {
                                                objG15 = new c(everydayExtraSummaryFragment3, 5);
                                                composer3.A(objG15);
                                            }
                                            composer3.l();
                                            ChangePlanModalBottomSheetKt.a(everydayExtraChoosePlanBottomSheetViewModel, modalBottomSheetStateC, (Function1) objG15, composer3, 64);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 25089463));
        return composeView;
    }

    @Override // au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler
    public final void onDismiss() {
        I1().i.g(EdxSummaryAnalytics.Summary.Action.i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        CardDetails cardDetails;
        super.onResume();
        EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI1 = I1();
        EverydayExtraSummaryContract.ViewState.Content contentB = ((EverydayExtraSummaryContract.ViewState) everydayExtraSummaryViewModelI1.q.getValue()).b();
        if (contentB == null || (cardDetails = contentB.i) == null) {
            return;
        }
        everydayExtraSummaryViewModelI1.n.f(new EverydayExtraSummaryContract.Action.InjectCardDetails(cardDetails));
    }

    @Override // au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler
    public final void s4() {
        I1().i.g(EdxSummaryAnalytics.Summary.Action.i);
    }

    @Override // au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler
    public final void w0() {
        I1().i.g(EdxSummaryAnalytics.Summary.Action.k);
    }

    @Override // au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler
    public final void x4() {
        this.m.a("android.permission.CAMERA", null);
        I1().i.g(EdxSummaryAnalytics.Summary.Action.j);
    }
}
