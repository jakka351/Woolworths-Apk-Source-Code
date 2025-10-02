package au.com.woolworths.base.wallet.ocr;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.e;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogFragment;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrContract;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrViewModel;
import au.com.woolworths.base.wallet.ocr.utils.CardDetailsUtils;
import au.com.woolworths.base.wallet.ocr.utils.CardIOLaunchHelper;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.salesforce.marketingcloud.UrlHandler;
import dagger.hilt.android.AndroidEntryPoint;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/base/wallet/ocr/CameraPermissionRationaleDialogHandler;", "<init>", "()V", "Companion", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsWalletOcrActivity extends Hilt_RewardsWalletOcrActivity implements CameraPermissionRationaleDialogHandler {
    public static final /* synthetic */ int E = 0;
    public final ActivityResultLauncher A;
    public final ActivityResultLauncher B;
    public final ActivityResultLauncher C;
    public PaymentsClient D;
    public FeatureToggleManager x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(RewardsWalletOcrViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy z = LazyKt.b(new androidx.lifecycle.a(this, 10));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrActivity$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRA_CARD_DETAILS", "EXTRA_ORIGIN", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity$onCreate$1", f = "RewardsWalletOcrActivity.kt", l = {168}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity$onCreate$1$1", f = "RewardsWalletOcrActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final class C00911 extends SuspendLambda implements Function2<RewardsWalletOcrContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ RewardsWalletOcrActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00911(RewardsWalletOcrActivity rewardsWalletOcrActivity, Continuation continuation) {
                super(2, continuation);
                this.q = rewardsWalletOcrActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00911 c00911 = new C00911(this.q, continuation);
                c00911.p = obj;
                return c00911;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C00911 c00911 = (C00911) create((RewardsWalletOcrContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c00911.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                RewardsWalletOcrContract.Actions actions = (RewardsWalletOcrContract.Actions) this.p;
                int i = RewardsWalletOcrActivity.E;
                RewardsWalletOcrActivity rewardsWalletOcrActivity = this.q;
                rewardsWalletOcrActivity.getClass();
                if (actions instanceof RewardsWalletOcrContract.Actions.ReturnScannedValuesToCallee) {
                    Intent intent = new Intent();
                    intent.putExtra("EXTRA_CARD_DETAILS", ((RewardsWalletOcrContract.Actions.ReturnScannedValuesToCallee) actions).f4696a);
                    rewardsWalletOcrActivity.setResult(-1, intent);
                    rewardsWalletOcrActivity.finish();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsWalletOcrActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = RewardsWalletOcrActivity.E;
                RewardsWalletOcrActivity rewardsWalletOcrActivity = RewardsWalletOcrActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C00911(rewardsWalletOcrActivity, null), ((RewardsWalletOcrViewModel) rewardsWalletOcrActivity.y.getD()).g);
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public RewardsWalletOcrActivity() {
        final int i = 0;
        this.A = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback(this) { // from class: au.com.woolworths.base.wallet.ocr.b
            public final /* synthetic */ RewardsWalletOcrActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i2 = i;
                RewardsWalletOcrActivity rewardsWalletOcrActivity = this.e;
                switch (i2) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i3 = RewardsWalletOcrActivity.E;
                        if (zBooleanValue) {
                            rewardsWalletOcrActivity.P4();
                            return;
                        } else {
                            CameraPermissionRationaleDialogFragment.Companion.a(3, null, true).show(rewardsWalletOcrActivity.getSupportFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                            return;
                        }
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i4 = RewardsWalletOcrActivity.E;
                        Intrinsics.h(result, "result");
                        Timber.f27013a.b("cardIOCardLauncher result " + result, new Object[0]);
                        Intent intent = result.e;
                        if (intent == null) {
                            rewardsWalletOcrActivity.finish();
                            return;
                        }
                        CreditCard creditCard = Build.VERSION.SDK_INT >= 33 ? (CreditCard) intent.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT, CreditCard.class) : (CreditCard) intent.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);
                        if (creditCard == null) {
                            rewardsWalletOcrActivity.finish();
                            return;
                        }
                        RewardsWalletOcrViewModel rewardsWalletOcrViewModel = (RewardsWalletOcrViewModel) rewardsWalletOcrActivity.y.getD();
                        String cardNumber = creditCard.cardNumber;
                        Intrinsics.g(cardNumber, "cardNumber");
                        rewardsWalletOcrViewModel.p6(CardDetailsUtils.b(cardNumber, Integer.valueOf(creditCard.expiryMonth), Integer.valueOf(creditCard.expiryYear), creditCard.cvv), (Activities.RewardsWalletOcr.Origin) rewardsWalletOcrActivity.z.getD());
                        return;
                    default:
                        Lazy lazy = rewardsWalletOcrActivity.z;
                        ViewModelLazy viewModelLazy = rewardsWalletOcrActivity.y;
                        ActivityResult scanResult = (ActivityResult) obj;
                        int i5 = RewardsWalletOcrActivity.E;
                        Intrinsics.h(scanResult, "scanResult");
                        Timber.f27013a.b("googleWalletLauncher scanResult " + scanResult, new Object[0]);
                        if (scanResult.d != 0) {
                            Intent intent2 = scanResult.e;
                            if (intent2 == null) {
                                rewardsWalletOcrActivity.finish();
                                return;
                            }
                            PaymentCardRecognitionResult fromIntent = PaymentCardRecognitionResult.getFromIntent(intent2);
                            if (fromIntent != null) {
                                ((RewardsWalletOcrViewModel) viewModelLazy.getD()).p6(CardDetailsUtils.a(fromIntent), (Activities.RewardsWalletOcr.Origin) lazy.getD());
                                return;
                            } else {
                                rewardsWalletOcrActivity.finish();
                                return;
                            }
                        }
                        RewardsWalletOcrViewModel rewardsWalletOcrViewModel2 = (RewardsWalletOcrViewModel) viewModelLazy.getD();
                        Activities.RewardsWalletOcr.Origin origin = (Activities.RewardsWalletOcr.Origin) lazy.getD();
                        AnalyticsManager analyticsManager = rewardsWalletOcrViewModel2.e;
                        int i6 = origin == null ? -1 : RewardsWalletOcrViewModel.WhenMappings.f4698a[origin.ordinal()];
                        if (i6 != -1) {
                            if (i6 == 1) {
                                analyticsManager.c(RewardsWalletOcrActionData.f);
                            } else if (i6 == 2) {
                                analyticsManager.c(RewardsGiftingOcrActionData.f);
                            } else if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        rewardsWalletOcrActivity.finish();
                        return;
                }
            }
        });
        final int i2 = 1;
        this.B = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.base.wallet.ocr.b
            public final /* synthetic */ RewardsWalletOcrActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i22 = i2;
                RewardsWalletOcrActivity rewardsWalletOcrActivity = this.e;
                switch (i22) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i3 = RewardsWalletOcrActivity.E;
                        if (zBooleanValue) {
                            rewardsWalletOcrActivity.P4();
                            return;
                        } else {
                            CameraPermissionRationaleDialogFragment.Companion.a(3, null, true).show(rewardsWalletOcrActivity.getSupportFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                            return;
                        }
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i4 = RewardsWalletOcrActivity.E;
                        Intrinsics.h(result, "result");
                        Timber.f27013a.b("cardIOCardLauncher result " + result, new Object[0]);
                        Intent intent = result.e;
                        if (intent == null) {
                            rewardsWalletOcrActivity.finish();
                            return;
                        }
                        CreditCard creditCard = Build.VERSION.SDK_INT >= 33 ? (CreditCard) intent.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT, CreditCard.class) : (CreditCard) intent.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);
                        if (creditCard == null) {
                            rewardsWalletOcrActivity.finish();
                            return;
                        }
                        RewardsWalletOcrViewModel rewardsWalletOcrViewModel = (RewardsWalletOcrViewModel) rewardsWalletOcrActivity.y.getD();
                        String cardNumber = creditCard.cardNumber;
                        Intrinsics.g(cardNumber, "cardNumber");
                        rewardsWalletOcrViewModel.p6(CardDetailsUtils.b(cardNumber, Integer.valueOf(creditCard.expiryMonth), Integer.valueOf(creditCard.expiryYear), creditCard.cvv), (Activities.RewardsWalletOcr.Origin) rewardsWalletOcrActivity.z.getD());
                        return;
                    default:
                        Lazy lazy = rewardsWalletOcrActivity.z;
                        ViewModelLazy viewModelLazy = rewardsWalletOcrActivity.y;
                        ActivityResult scanResult = (ActivityResult) obj;
                        int i5 = RewardsWalletOcrActivity.E;
                        Intrinsics.h(scanResult, "scanResult");
                        Timber.f27013a.b("googleWalletLauncher scanResult " + scanResult, new Object[0]);
                        if (scanResult.d != 0) {
                            Intent intent2 = scanResult.e;
                            if (intent2 == null) {
                                rewardsWalletOcrActivity.finish();
                                return;
                            }
                            PaymentCardRecognitionResult fromIntent = PaymentCardRecognitionResult.getFromIntent(intent2);
                            if (fromIntent != null) {
                                ((RewardsWalletOcrViewModel) viewModelLazy.getD()).p6(CardDetailsUtils.a(fromIntent), (Activities.RewardsWalletOcr.Origin) lazy.getD());
                                return;
                            } else {
                                rewardsWalletOcrActivity.finish();
                                return;
                            }
                        }
                        RewardsWalletOcrViewModel rewardsWalletOcrViewModel2 = (RewardsWalletOcrViewModel) viewModelLazy.getD();
                        Activities.RewardsWalletOcr.Origin origin = (Activities.RewardsWalletOcr.Origin) lazy.getD();
                        AnalyticsManager analyticsManager = rewardsWalletOcrViewModel2.e;
                        int i6 = origin == null ? -1 : RewardsWalletOcrViewModel.WhenMappings.f4698a[origin.ordinal()];
                        if (i6 != -1) {
                            if (i6 == 1) {
                                analyticsManager.c(RewardsWalletOcrActionData.f);
                            } else if (i6 == 2) {
                                analyticsManager.c(RewardsGiftingOcrActionData.f);
                            } else if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        rewardsWalletOcrActivity.finish();
                        return;
                }
            }
        });
        final int i3 = 2;
        this.C = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.base.wallet.ocr.b
            public final /* synthetic */ RewardsWalletOcrActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i22 = i3;
                RewardsWalletOcrActivity rewardsWalletOcrActivity = this.e;
                switch (i22) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i32 = RewardsWalletOcrActivity.E;
                        if (zBooleanValue) {
                            rewardsWalletOcrActivity.P4();
                            return;
                        } else {
                            CameraPermissionRationaleDialogFragment.Companion.a(3, null, true).show(rewardsWalletOcrActivity.getSupportFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
                            return;
                        }
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i4 = RewardsWalletOcrActivity.E;
                        Intrinsics.h(result, "result");
                        Timber.f27013a.b("cardIOCardLauncher result " + result, new Object[0]);
                        Intent intent = result.e;
                        if (intent == null) {
                            rewardsWalletOcrActivity.finish();
                            return;
                        }
                        CreditCard creditCard = Build.VERSION.SDK_INT >= 33 ? (CreditCard) intent.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT, CreditCard.class) : (CreditCard) intent.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);
                        if (creditCard == null) {
                            rewardsWalletOcrActivity.finish();
                            return;
                        }
                        RewardsWalletOcrViewModel rewardsWalletOcrViewModel = (RewardsWalletOcrViewModel) rewardsWalletOcrActivity.y.getD();
                        String cardNumber = creditCard.cardNumber;
                        Intrinsics.g(cardNumber, "cardNumber");
                        rewardsWalletOcrViewModel.p6(CardDetailsUtils.b(cardNumber, Integer.valueOf(creditCard.expiryMonth), Integer.valueOf(creditCard.expiryYear), creditCard.cvv), (Activities.RewardsWalletOcr.Origin) rewardsWalletOcrActivity.z.getD());
                        return;
                    default:
                        Lazy lazy = rewardsWalletOcrActivity.z;
                        ViewModelLazy viewModelLazy = rewardsWalletOcrActivity.y;
                        ActivityResult scanResult = (ActivityResult) obj;
                        int i5 = RewardsWalletOcrActivity.E;
                        Intrinsics.h(scanResult, "scanResult");
                        Timber.f27013a.b("googleWalletLauncher scanResult " + scanResult, new Object[0]);
                        if (scanResult.d != 0) {
                            Intent intent2 = scanResult.e;
                            if (intent2 == null) {
                                rewardsWalletOcrActivity.finish();
                                return;
                            }
                            PaymentCardRecognitionResult fromIntent = PaymentCardRecognitionResult.getFromIntent(intent2);
                            if (fromIntent != null) {
                                ((RewardsWalletOcrViewModel) viewModelLazy.getD()).p6(CardDetailsUtils.a(fromIntent), (Activities.RewardsWalletOcr.Origin) lazy.getD());
                                return;
                            } else {
                                rewardsWalletOcrActivity.finish();
                                return;
                            }
                        }
                        RewardsWalletOcrViewModel rewardsWalletOcrViewModel2 = (RewardsWalletOcrViewModel) viewModelLazy.getD();
                        Activities.RewardsWalletOcr.Origin origin = (Activities.RewardsWalletOcr.Origin) lazy.getD();
                        AnalyticsManager analyticsManager = rewardsWalletOcrViewModel2.e;
                        int i6 = origin == null ? -1 : RewardsWalletOcrViewModel.WhenMappings.f4698a[origin.ordinal()];
                        if (i6 != -1) {
                            if (i6 == 1) {
                                analyticsManager.c(RewardsWalletOcrActionData.f);
                            } else if (i6 == 2) {
                                analyticsManager.c(RewardsGiftingOcrActionData.f);
                            } else if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        rewardsWalletOcrActivity.finish();
                        return;
                }
            }
        });
    }

    public final void O4() {
        this.B.a(CardIOLaunchHelper.a(this, (Activities.RewardsWalletOcr.Origin) this.z.getD()), null);
    }

    public final void P4() {
        FeatureToggleManager featureToggleManager = this.x;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (!featureToggleManager.c(RewardsBaseFeature.h)) {
            O4();
            return;
        }
        PaymentCardRecognitionIntentRequest defaultInstance = PaymentCardRecognitionIntentRequest.getDefaultInstance();
        Intrinsics.g(defaultInstance, "getDefaultInstance(...)");
        PaymentsClient paymentsClient = this.D;
        if (paymentsClient != null) {
            paymentsClient.getPaymentCardRecognitionIntent(defaultInstance).addOnSuccessListener(new e(new androidx.navigation.fragment.e(this, 9), 22)).addOnFailureListener(new e(this, 23));
        } else {
            Intrinsics.p("googlePaymentsClient");
            throw null;
        }
    }

    @Override // au.com.woolworths.base.wallet.ocr.Hilt_RewardsWalletOcrActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.D = Wallet.getPaymentsClient((Activity) this, new Wallet.WalletOptions.Builder().setEnvironment(1).build());
        boolean z = ContextCompat.a(this, "android.permission.CAMERA") == 0;
        Timber.Forest forest = Timber.f27013a;
        forest.b("isCameraPermissionGranted: " + z, new Object[0]);
        if (z) {
            P4();
        } else if (ActivityCompat.m(this, "android.permission.CAMERA")) {
            CameraPermissionRationaleDialogFragment.Companion.a(3, null, false).show(getSupportFragmentManager(), "_addBankCardCameraPermissionRationaleDialog");
        } else {
            forest.b("Requesting Camera permission...", new Object[0]);
            this.A.a("android.permission.CAMERA", null);
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler
    public final void x4() {
        Timber.f27013a.b("Requesting Camera permission...", new Object[0]);
        this.A.a("android.permission.CAMERA", null);
    }
}
