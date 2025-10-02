package au.com.woolworths.feature.rewards.account.authentication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.receiver.SmsConsentBroadcastReceiver;
import au.com.woolworths.feature.product.list.legacy.a0;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContract;
import au.com.woolworths.feature.rewards.account.databinding.ActivityRewardsAuthenicationBinding;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.rewards.base.DeferredIntentHelper;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.subjects.PublishSubject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsAuthenticationActivity extends Hilt_RewardsAuthenticationActivity {
    public static final /* synthetic */ int J = 0;
    public FeatureToggleManager A;
    public RewardsAccountInteractor B;
    public ActivityRewardsAuthenicationBinding D;
    public LambdaObserver H;
    public AnalyticsManager x;
    public BranchDeepLinkInteractorImpl y;
    public AppIdentifier z;
    public final ViewModelLazy C = new ViewModelLazy(Reflection.f24268a.b(RewardsAuthenticationViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final String E = "Everyday";
    public final SmsConsentBroadcastReceiver F = new SmsConsentBroadcastReceiver(new i(this, 2));
    public final Lazy G = LazyKt.b(new d(this, 0));
    public final ActivityResultLauncher I = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: au.com.woolworths.feature.rewards.account.authentication.e
        @Override // androidx.activity.result.ActivityResultCallback
        public final void a(Object obj) {
            Intent intent;
            String stringExtra;
            ActivityResult result = (ActivityResult) obj;
            int i = RewardsAuthenticationActivity.J;
            Intrinsics.h(result, "result");
            if (result.d != -1 || (intent = result.e) == null || (stringExtra = intent.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)) == null) {
                return;
            }
            final RewardsAuthenticationActivity rewardsAuthenticationActivity = this.d;
            rewardsAuthenticationActivity.O4();
            MatchResult matchResultB = new Regex("\\b\\d{6}\\b").b(0, stringExtra);
            String value = matchResultB != null ? matchResultB.getValue() : null;
            if (value == null) {
                return;
            }
            String jsCodeString = StringsKt.m0("\n                var otpField = document.getElementById('otp');\n                otpField.value = \"" + value + "\";\n                otpField.dispatchEvent(new Event('focus'));\n                otpField.dispatchEvent(new Event('input'));\n            ");
            ActivityRewardsAuthenicationBinding activityRewardsAuthenicationBinding = rewardsAuthenticationActivity.D;
            if (activityRewardsAuthenicationBinding == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            WebView webView = activityRewardsAuthenicationBinding.B;
            Intrinsics.g(webView, "webView");
            ValueCallback valueCallback = new ValueCallback() { // from class: au.com.woolworths.feature.rewards.account.authentication.f
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj2) {
                    if (((String) obj2) == null) {
                        int i2 = RewardsAuthenticationActivity.J;
                        return;
                    }
                    ActivityRewardsAuthenicationBinding activityRewardsAuthenicationBinding2 = rewardsAuthenticationActivity.D;
                    Object obj3 = null;
                    if (activityRewardsAuthenicationBinding2 == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    WebView webView2 = activityRewardsAuthenicationBinding2.B;
                    Intrinsics.g(webView2, "webView");
                    webView2.postDelayed(new androidx.camera.core.processing.g(10, webView2, "var buttonElement = document.querySelector('.otp-form__submit__button');\nif (buttonElement) {\n    buttonElement.click();\n}", obj3), 200L);
                }
            };
            Intrinsics.h(jsCodeString, "jsCodeString");
            webView.postDelayed(new androidx.camera.core.processing.g(10, webView, jsCodeString, valueCallback), 200L);
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationActivity$Companion;", "", "", "REWARDS_AUTH_REQUEST_CODE", "I", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(Activity activity) {
            activity.startActivityForResult(new Intent(activity, (Class<?>) RewardsAuthenticationActivity.class), 10005);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity$onCreate$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<RewardsAuthenticationContract.Actions, Unit> {
        /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity.AnonymousClass2.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public final RewardsAuthenticationViewModel O4() {
        return (RewardsAuthenticationViewModel) this.C.getD();
    }

    public final boolean P4() {
        AppIdentifier appIdentifier = this.z;
        if (appIdentifier != null) {
            return appIdentifier == AppIdentifier.e;
        }
        Intrinsics.p("appIdentifier");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityRewardsAuthenicationBinding activityRewardsAuthenicationBinding = this.D;
        if (activityRewardsAuthenicationBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        if (!activityRewardsAuthenicationBinding.B.canGoBack()) {
            super.onBackPressed();
            return;
        }
        ActivityRewardsAuthenicationBinding activityRewardsAuthenicationBinding2 = this.D;
        if (activityRewardsAuthenicationBinding2 != null) {
            activityRewardsAuthenicationBinding2.B.goBack();
        } else {
            Intrinsics.p("activityBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.feature.rewards.account.authentication.Hilt_RewardsAuthenticationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activities.Authentication.Extras extras = (Activities.Authentication.Extras) getIntent().getParcelableExtra("EXTRA_AUTH_CONFIG");
        if (extras == null) {
            extras = new Activities.Authentication.Extras(3);
        }
        Activities.Authentication.ExtrasStepUp extrasStepUp = (Activities.Authentication.ExtrasStepUp) getIntent().getParcelableExtra("EXTRA_2FA_STEP_UP_CONFIG");
        boolean booleanExtra = false;
        if (extras.d) {
            new AlertDialog.Builder(this).setTitle(R.string.rewards_force_logout_title).setMessage(R.string.rewards_force_logout_message).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).setCancelable(false).show();
        }
        ActivityRewardsAuthenicationBinding activityRewardsAuthenicationBinding = (ActivityRewardsAuthenicationBinding) DataBindingUtil.d(this, R.layout.activity_rewards_authenication);
        this.D = activityRewardsAuthenicationBinding;
        if (activityRewardsAuthenicationBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityRewardsAuthenicationBinding.D(this);
        activityRewardsAuthenicationBinding.L(O4());
        ActivityRewardsAuthenicationBinding activityRewardsAuthenicationBinding2 = this.D;
        if (activityRewardsAuthenicationBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityRewardsAuthenicationBinding2.A);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
        PublishSubject publishSubject = O4().o;
        c cVar = new c(0, new AnonymousClass2(1, this, RewardsAuthenticationActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions;)V", 0));
        publishSubject.getClass();
        LambdaObserver lambdaObserver = new LambdaObserver(cVar, Functions.e);
        publishSubject.a(lambdaObserver);
        this.H = lambdaObserver;
        ActivityRewardsAuthenicationBinding activityRewardsAuthenicationBinding3 = this.D;
        if (activityRewardsAuthenicationBinding3 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        WebView webView = activityRewardsAuthenicationBinding3.B;
        Intrinsics.e(webView);
        ViewExtKt.b(webView, new a0(8));
        webView.setWebViewClient((WebViewClient) this.G.getD());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        FeatureToggleManager featureToggleManager = this.A;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(RewardsBaseFeature.k)) {
            webView.getSettings().setSupportMultipleWindows(true);
            webView.setWebChromeClient(new WebChromeClient() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity$onCreate$3$3
                @Override // android.webkit.WebChromeClient
                public final boolean onCreateWindow(WebView webView2, boolean z, boolean z2, Message message) {
                    WebView.HitTestResult hitTestResult;
                    String extra;
                    if (webView2 == null || (hitTestResult = webView2.getHitTestResult()) == null || (extra = hitTestResult.getExtra()) == null) {
                        return true;
                    }
                    ContextExtKt.e(this.f5648a, extra);
                    return false;
                }
            });
        }
        O4().p6(extras, extrasStepUp, P4());
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        Intent intentA = DeferredIntentHelper.a(intent);
        if (intentA != null) {
            try {
                booleanExtra = new Intent(intentA).getBooleanExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.ANONYMOUS", false);
            } catch (BadParcelableException e) {
                Timber.f27013a.p(e);
            }
            if (booleanExtra) {
                startActivity(intentA);
            }
        }
        if (O4().j.c(RewardsBaseFeature.d)) {
            SmsRetriever.getClient((Activity) this).startSmsUserConsent(this.E);
        }
    }

    @Override // au.com.woolworths.feature.rewards.account.authentication.Hilt_RewardsAuthenticationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        LambdaObserver lambdaObserver = this.H;
        if (lambdaObserver != null) {
            DisposableHelper.a(lambdaObserver);
        }
        ActivityRewardsAuthenicationBinding activityRewardsAuthenicationBinding = this.D;
        if (activityRewardsAuthenicationBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityRewardsAuthenicationBinding.B.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (O4().j.c(RewardsBaseFeature.d)) {
            try {
                unregisterReceiver(this.F);
            } catch (IllegalArgumentException unused) {
            }
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (O4().j.c(RewardsBaseFeature.d)) {
            ContextCompat.e(this, this.F, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION), SmsRetriever.SEND_PERMISSION, null, 2);
        }
    }
}
