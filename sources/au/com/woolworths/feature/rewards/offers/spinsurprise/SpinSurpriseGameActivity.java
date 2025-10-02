package au.com.woolworths.feature.rewards.offers.spinsurprise;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics;
import au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics$SpinSurprise$Action$Companion$serverError$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.feature.rewards.offers.databinding.ActivitySpinSurpriseGameBinding;
import au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameContract;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SpinSurpriseGameActivity extends Hilt_SpinSurpriseGameActivity {
    public static final /* synthetic */ int z = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(SpinSurpriseGameViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public ActivitySpinSurpriseGameBinding y;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameActivity$onCreate$3", f = "SpinSurpriseGameActivity.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameActivity$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameActivity$onCreate$3$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ SpinSurpriseGameActivity d;

            public AnonymousClass1(SpinSurpriseGameActivity spinSurpriseGameActivity) {
                this.d = spinSurpriseGameActivity;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, SpinSurpriseGameActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                SpinSurpriseGameContract.Action action = (SpinSurpriseGameContract.Action) obj;
                int i = SpinSurpriseGameActivity.z;
                boolean z = action instanceof SpinSurpriseGameContract.Action.LoadUrlInWebView;
                final SpinSurpriseGameActivity spinSurpriseGameActivity = this.d;
                if (z) {
                    SpinSurpriseGameContract.Action.LoadUrlInWebView loadUrlInWebView = (SpinSurpriseGameContract.Action.LoadUrlInWebView) action;
                    String str = loadUrlInWebView.f6399a;
                    final Set set = loadUrlInWebView.b;
                    ActivitySpinSurpriseGameBinding activitySpinSurpriseGameBinding = spinSurpriseGameActivity.y;
                    if (activitySpinSurpriseGameBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    final WebView webView = activitySpinSurpriseGameBinding.z;
                    webView.setWebViewClient(new WebViewClient() { // from class: au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameActivity$loadUrlInWebView$1$1
                        @Override // android.webkit.WebViewClient
                        public final void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            int i2 = SpinSurpriseGameActivity.z;
                            SpinSurpriseGameViewModel spinSurpriseGameViewModelO4 = spinSurpriseGameActivity.O4();
                            SpinSurpriseAnalytics.SpinSurprise.Action.Companion companion = SpinSurpriseAnalytics.SpinSurprise.Action.d;
                            String str2 = spinSurpriseGameViewModelO4.k;
                            companion.getClass();
                            spinSurpriseGameViewModelO4.p6(R.string.rewards_spin_surprise_server_error_message, new SpinSurpriseAnalytics$SpinSurprise$Action$Companion$serverError$1(str2));
                        }

                        @Override // android.webkit.WebViewClient
                        public final boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                            Uri url;
                            String lowerCase;
                            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                                return false;
                            }
                            String path = url.getPath();
                            if (path != null) {
                                lowerCase = path.toLowerCase(Locale.ROOT);
                                Intrinsics.g(lowerCase, "toLowerCase(...)");
                            } else {
                                lowerCase = null;
                            }
                            Set set2 = set;
                            boolean z2 = true;
                            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                Iterator it = set2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ROOT);
                                    Intrinsics.g(lowerCase2, "toLowerCase(...)");
                                    if (Intrinsics.c(lowerCase, lowerCase2)) {
                                        z2 = false;
                                        break;
                                    }
                                }
                            }
                            if (z2) {
                                String string = url.toString();
                                Intrinsics.g(string, "toString(...)");
                                boolean zW = StringsKt.W(string, "com.woolworths.rewards", false);
                                WebView webView3 = webView;
                                if (zW) {
                                    Context context = webView3.getContext();
                                    Intrinsics.g(context, "getContext(...)");
                                    ContextExtKt.e(context, string);
                                    return z2;
                                }
                                Context context2 = webView3.getContext();
                                Intrinsics.g(context2, "getContext(...)");
                                ContextExtKt.j(context2, string, null, null, null, 62);
                            }
                            return z2;
                        }
                    });
                    webView.setWebChromeClient(new WebChromeClient() { // from class: au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameActivity$loadUrlInWebView$1$2
                        @Override // android.webkit.WebChromeClient
                        public final void onReceivedTitle(WebView view, String str2) {
                            Intrinsics.h(view, "view");
                            super.onReceivedTitle(view, str2);
                            if (str2 != null) {
                                int i2 = SpinSurpriseGameActivity.z;
                                SpinSurpriseGameViewModel spinSurpriseGameViewModelO4 = spinSurpriseGameActivity.O4();
                                spinSurpriseGameViewModelO4.k = str2;
                                AnalyticsManager analyticsManager = spinSurpriseGameViewModelO4.f;
                                SpinSurpriseAnalytics.SpinSurprise.Action.d.getClass();
                                analyticsManager.g(new Event(str2) { // from class: au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics$SpinSurprise$Action$Companion$gamificationImpression$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(SpinSurpriseAnalytics.SpinSurprise.e);
                                        spreadBuilder.a(new Pair("event.Category", "gamification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        spreadBuilder.a(new Pair("event.Description", str2));
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "gamification_impression";
                                    }

                                    public final boolean equals(Object obj2) {
                                        if (!(obj2 instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj2;
                                        return "gamification_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                });
                            }
                        }
                    });
                    webView.loadUrl(str);
                } else if (action instanceof SpinSurpriseGameContract.Action.CloseScreenAndShowError) {
                    Toast.makeText(spinSurpriseGameActivity, ((SpinSurpriseGameContract.Action.CloseScreenAndShowError) action).f6398a.getText(spinSurpriseGameActivity), 0).show();
                    spinSurpriseGameActivity.finish();
                } else {
                    if (!Intrinsics.c(action, SpinSurpriseGameContract.Action.CloseScreen.f6397a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    spinSurpriseGameActivity.finish();
                }
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                return Unit.f24250a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SpinSurpriseGameActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = SpinSurpriseGameActivity.z;
                SpinSurpriseGameActivity spinSurpriseGameActivity = SpinSurpriseGameActivity.this;
                Flow flowA = FlowExtKt.a(spinSurpriseGameActivity.O4().j, spinSurpriseGameActivity.getD(), Lifecycle.State.g);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(spinSurpriseGameActivity);
                this.p = 1;
                if (((ChannelFlow) flowA).collect(anonymousClass1, this) == coroutineSingletons) {
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

    public final SpinSurpriseGameViewModel O4() {
        return (SpinSurpriseGameViewModel) this.x.getD();
    }

    @Override // au.com.woolworths.feature.rewards.offers.spinsurprise.Hilt_SpinSurpriseGameActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1280);
        ActivitySpinSurpriseGameBinding activitySpinSurpriseGameBinding = (ActivitySpinSurpriseGameBinding) DataBindingUtil.d(this, R.layout.activity_spin_surprise_game);
        activitySpinSurpriseGameBinding.D(this);
        activitySpinSurpriseGameBinding.L(O4());
        this.y = activitySpinSurpriseGameBinding;
        setSupportActionBar(activitySpinSurpriseGameBinding.y);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
        ActivitySpinSurpriseGameBinding activitySpinSurpriseGameBinding2 = this.y;
        if (activitySpinSurpriseGameBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activitySpinSurpriseGameBinding2.y.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: au.com.woolworths.feature.rewards.offers.spinsurprise.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
                int i = SpinSurpriseGameActivity.z;
                Intrinsics.h(view, "<unused var>");
                Intrinsics.h(insets, "insets");
                ActivitySpinSurpriseGameBinding activitySpinSurpriseGameBinding3 = this.f6405a.y;
                if (activitySpinSurpriseGameBinding3 == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = activitySpinSurpriseGameBinding3.y.getLayoutParams();
                Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, insets.getSystemWindowInsetTop(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                return insets;
            }
        });
        ActivitySpinSurpriseGameBinding activitySpinSurpriseGameBinding3 = this.y;
        if (activitySpinSurpriseGameBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        WebView webView = activitySpinSurpriseGameBinding3.z;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() != 16908332) {
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                Callback.q();
                return zOnOptionsItemSelected;
            }
            SpinSurpriseGameViewModel spinSurpriseGameViewModelO4 = O4();
            AnalyticsManager analyticsManager = spinSurpriseGameViewModelO4.f;
            SpinSurpriseAnalytics.SpinSurprise.Action.Companion companion = SpinSurpriseAnalytics.SpinSurprise.Action.d;
            final String str = spinSurpriseGameViewModelO4.k;
            companion.getClass();
            analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics$SpinSurprise$Action$Companion$gamificationClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(SpinSurpriseAnalytics.SpinSurprise.e);
                    spreadBuilder.a(new Pair("event.Category", "gamification"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Close", spreadBuilder);
                    spreadBuilder.a(new Pair("event.Description", str == null ? "" : str));
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "gamification_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "gamification_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            BuildersKt.c(ViewModelKt.a(spinSurpriseGameViewModelO4), null, null, new SpinSurpriseGameViewModel$closeScreen$1(spinSurpriseGameViewModelO4, null), 3);
            Callback.q();
            return true;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
