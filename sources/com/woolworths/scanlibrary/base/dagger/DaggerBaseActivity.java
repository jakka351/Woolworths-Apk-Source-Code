package com.woolworths.scanlibrary.base.dagger;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.rewards.base.d;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.base.message.MessageReceiverListener;
import com.woolworths.scanlibrary.base.message.NotificationMessageReceiver;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.configuration.OnSngAppCloseHandler;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.di.ComponentAndroidInjection;
import com.woolworths.scanlibrary.di.component.SnGAppProvider;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.ui.cart.ShoppingCartActivity;
import com.woolworths.scanlibrary.ui.splash.SngInitializerActivity;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import com.woolworths.scanlibrary.util.exceptions.ErrorHandlingDelegate;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.widget.LoadingViewDelegate;
import dagger.android.AndroidInjection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "P", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/base/message/MessageReceiverListener;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class DaggerBaseActivity<P extends MvpPresenter> extends AppCompatActivity implements MvpView<P>, MessageReceiverListener {
    public static final /* synthetic */ int F = 0;
    public ScanAndGoFeatureConfig A;
    public OnSngAppCloseHandler B;
    public boolean C;
    public NotificationMessageReceiver D;
    public final Lazy E = LazyKt.b(new a(this, 0));
    public MvpPresenter t;
    public UserManager u;
    public LoadingViewDelegate v;
    public FeatureToggleManager w;
    public AnalyticsProvider x;
    public AnalyticsManager y;
    public PayClient z;

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void D0() {
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void E1() {
        b5();
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final int F0() {
        return T4();
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void J() {
        b5();
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpView
    public void N3(boolean z) {
        if (z) {
            LoadingViewDelegate loadingViewDelegate = this.v;
            if (loadingViewDelegate != null) {
                loadingViewDelegate.c();
                return;
            }
            return;
        }
        LoadingViewDelegate loadingViewDelegate2 = this.v;
        if (loadingViewDelegate2 != null) {
            loadingViewDelegate2.b();
        }
    }

    public final AnalyticsProvider N4() {
        AnalyticsProvider analyticsProvider = this.x;
        if (analyticsProvider != null) {
            return analyticsProvider;
        }
        Intrinsics.p("analyticsAggregator");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void O0(String str) {
        ContextExtKt.e(this, str);
    }

    public final AnalyticsManager O4() {
        AnalyticsManager analyticsManager = this.y;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.p("analyticsManager");
        throw null;
    }

    public OnBackPressedCallback P4() {
        return null;
    }

    public final FeatureToggleManager Q4() {
        FeatureToggleManager featureToggleManager = this.w;
        if (featureToggleManager != null) {
            return featureToggleManager;
        }
        Intrinsics.p("featureToggleManager");
        throw null;
    }

    public abstract int R4();

    public final MvpPresenter S4() {
        MvpPresenter mvpPresenter = this.t;
        if (mvpPresenter != null) {
            return mvpPresenter;
        }
        Intrinsics.p("mPresenter");
        throw null;
    }

    public int T4() {
        return 39;
    }

    public final UserManager U4() {
        UserManager userManager = this.u;
        if (userManager != null) {
            return userManager;
        }
        Intrinsics.p("userManager");
        throw null;
    }

    public abstract void V4();

    @Override // com.woolworths.scanlibrary.base.mvp.MvpView
    public final void W3(boolean z) {
        if (!z) {
            LoadingViewDelegate loadingViewDelegate = this.v;
            if (loadingViewDelegate != null) {
                loadingViewDelegate.b();
                return;
            }
            return;
        }
        LoadingViewDelegate loadingViewDelegate2 = this.v;
        if (loadingViewDelegate2 != null) {
            loadingViewDelegate2.b.setVisibility(0);
            loadingViewDelegate2.c();
        }
    }

    public void W4() {
        if (X4()) {
            setContentView(R4());
        }
        V4();
    }

    public boolean X4() {
        return !(this instanceof ShoppingCartActivity);
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void Y3(String str, String str2, Function0 function0) {
        AppCompatActivityExtKt.d(this, str, str2, function0);
    }

    public final void Y4(String str, Function0 function0) {
        String string = getString(R.string.sng_label_ok);
        Intrinsics.g(string, "getString(...)");
        AppCompatActivityExtKt.f(this, str, string, new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(16, function0), new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(17, function0));
    }

    public void Z4(Function0 function0) {
        String string = getString(R.string.sng_error_unhandled);
        Intrinsics.g(string, "getString(...)");
        Y4(string, new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(14, function0));
    }

    public void a5(Function0 function0) {
        String string = getString(R.string.sng_no_network);
        Intrinsics.g(string, "getString(...)");
        Y4(string, new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(15, function0));
    }

    public final void b5() {
        TapActivity.Companion.a(this, null, null, 12);
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void f(String str, String str2, au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c cVar, String str3, d dVar) {
        AppCompatActivityExtKt.b(this, "", str, str2, cVar, str3, dVar, true);
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpView
    public void i0(MvpView.ErrorType errorType) {
        ((ErrorHandlingDelegate) this.E.getD()).b(errorType);
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpView
    public void k1(MvpPresenter presenter) {
        Intrinsics.h(presenter, "presenter");
        this.t = presenter;
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpView
    public void n(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
        ((ErrorHandlingDelegate) this.E.getD()).a(i, i2, apigeeErrorResponse, function0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!this.C) {
            ComponentCallbacks2 application = getApplication();
            Intrinsics.f(application, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
            UserManager userManagerD = ((SnGAppProvider) application).d();
            Intrinsics.h(userManagerD, "<set-?>");
            this.u = userManagerD;
            ComponentCallbacks2 application2 = getApplication();
            Intrinsics.f(application2, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
            Intrinsics.h(((SnGAppProvider) application2).b(), "<set-?>");
            boolean z = false;
            if (this instanceof UserScopedActivity) {
                if (ComponentAndroidInjection.a(U4(), this)) {
                    z = true;
                } else {
                    SngInitializerActivity.Companion.a(this, false);
                }
                this.C = z;
            } else {
                if (this instanceof CartSessionScopedActivity) {
                    if (U4().a()) {
                        UserComponent userComponent = U4().k;
                        Intrinsics.e(userComponent);
                        if (!ComponentAndroidInjection.a(userComponent.e(), this)) {
                            b5();
                        }
                    } else {
                        SngInitializerActivity.Companion.a(this, false);
                    }
                    this.C = z;
                } else {
                    AndroidInjection.a(this);
                }
                z = true;
                this.C = z;
            }
        }
        super.onCreate(bundle);
        if (!this.C) {
            finish();
            return;
        }
        this.v = new LoadingViewDelegate(this);
        W4();
        getOnBackPressedDispatcher().a(this, new OnBackPressedCallback() { // from class: com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity.onCreate.1
            @Override // androidx.activity.OnBackPressedCallback
            public final void e() {
                OnSngAppCloseHandler onSngAppCloseHandler;
                DaggerBaseActivity daggerBaseActivity = DaggerBaseActivity.this;
                if (daggerBaseActivity.isTaskRoot() && (onSngAppCloseHandler = daggerBaseActivity.B) != null) {
                    onSngAppCloseHandler.a(daggerBaseActivity);
                }
                i(false);
                daggerBaseActivity.finish();
            }
        });
        OnBackPressedCallback onBackPressedCallbackP4 = P4();
        if (onBackPressedCallbackP4 != null) {
            getOnBackPressedDispatcher().a(this, onBackPressedCallbackP4);
        }
        Context baseContext = getBaseContext();
        Intrinsics.g(baseContext, "getBaseContext(...)");
        this.D = new NotificationMessageReceiver(baseContext, this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.C) {
            S4().X0();
        }
        LoadingViewDelegate loadingViewDelegate = this.v;
        if (loadingViewDelegate != null) {
            loadingViewDelegate.a();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        S4().M0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        NotificationMessageReceiver notificationMessageReceiver = this.D;
        if (notificationMessageReceiver == null) {
            Intrinsics.p("notificationReceiver");
            throw null;
        }
        IntentFilter intentFilter = new IntentFilter("com.woolworths.scanlibrary.messaging.notification");
        intentFilter.setPriority(1);
        ContextCompat.f(this, notificationMessageReceiver, intentFilter, 4);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        NotificationMessageReceiver notificationMessageReceiver = this.D;
        if (notificationMessageReceiver != null) {
            unregisterReceiver(notificationMessageReceiver);
        } else {
            Intrinsics.p("notificationReceiver");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void q2() {
        SngInitializerActivity.Companion.a(this, false);
    }

    public void x1(boolean z) {
        N3(z);
    }
}
