package com.woolworths.scanlibrary.base.dagger;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.rewards.base.d;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.base.message.MessageReceiverListener;
import com.woolworths.scanlibrary.base.message.NotificationMessageReceiver;
import com.woolworths.scanlibrary.base.mvvm.SnGViewModelFactory;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.di.ComponentAndroidInjection;
import com.woolworths.scanlibrary.di.component.SnGAppProvider;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.ui.entry.SngEntryActivity;
import com.woolworths.scanlibrary.ui.splash.SngInitializerActivity;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/woolworths/scanlibrary/base/message/MessageReceiverListener;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class DaggerBaseMvvmActivity extends AppCompatActivity implements MessageReceiverListener {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public NotificationMessageReceiver B;
    public final Lazy C = LazyKt.b(new c(this, 0));
    public UserManager t;
    public SnGViewModelFactory u;
    public LoadingViewDelegate v;
    public FeatureToggleManager w;
    public AnalyticsProvider x;
    public AnalyticsManager y;
    public ScanAndGoFeatureConfig z;

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void D0() {
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void E1() {
        TapActivity.Companion.a(this, null, null, 12);
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final int F0() {
        return 39;
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void J() {
        TapActivity.Companion.a(this, null, null, 12);
    }

    public final void N3(boolean z) {
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

    public final boolean N4() {
        ComponentCallbacks2 application = getApplication();
        Intrinsics.f(application, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
        UserManager userManagerD = ((SnGAppProvider) application).d();
        Intrinsics.h(userManagerD, "<set-?>");
        this.t = userManagerD;
        ComponentCallbacks2 application2 = getApplication();
        Intrinsics.f(application2, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
        SnGViewModelFactory snGViewModelFactoryB = ((SnGAppProvider) application2).b();
        Intrinsics.h(snGViewModelFactoryB, "<set-?>");
        this.u = snGViewModelFactoryB;
        if (this instanceof UserScopedActivity) {
            if (!ComponentAndroidInjection.a(P4(), this)) {
                SngInitializerActivity.Companion.a(this, false);
                return false;
            }
        } else {
            if (!(this instanceof CartSessionScopedActivity)) {
                AndroidInjection.a(this);
                return true;
            }
            if (!P4().a()) {
                SngInitializerActivity.Companion.a(this, false);
                return false;
            }
            UserComponent userComponent = P4().k;
            Intrinsics.e(userComponent);
            if (!ComponentAndroidInjection.a(userComponent.e(), this)) {
                TapActivity.Companion.a(this, null, null, 12);
                return false;
            }
        }
        return true;
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void O0(String str) {
        ContextExtKt.e(this, str);
    }

    public abstract int O4();

    public final UserManager P4() {
        UserManager userManager = this.t;
        if (userManager != null) {
            return userManager;
        }
        Intrinsics.p("userManager");
        throw null;
    }

    public final SnGViewModelFactory Q4() {
        SnGViewModelFactory snGViewModelFactory = this.u;
        if (snGViewModelFactory != null) {
            return snGViewModelFactory;
        }
        Intrinsics.p("viewModelFactory");
        throw null;
    }

    public abstract void R4();

    public boolean S4() {
        return !(this instanceof SngEntryActivity);
    }

    public final void T4(String message, Function0 listenerAction) {
        Intrinsics.h(message, "message");
        Intrinsics.h(listenerAction, "listenerAction");
        String string = getString(R.string.sng_label_ok);
        Intrinsics.g(string, "getString(...)");
        AppCompatActivityExtKt.f(this, message, string, new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(24, listenerAction), new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(21, listenerAction));
    }

    public final void U4(MutableLiveData liveEvent, MutableLiveData mutableLiveData) {
        Intrinsics.h(liveEvent, "liveEvent");
        liveEvent.f(this, new DaggerBaseMvvmActivity$sam$androidx_lifecycle_Observer$0(new i(this, 11)));
        if (mutableLiveData != null) {
            mutableLiveData.f(this, new androidx.compose.runtime.livedata.a(this, 5));
        }
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void Y3(String str, String str2, Function0 function0) {
        AppCompatActivityExtKt.d(this, str, str2, function0);
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void f(String str, String str2, au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c cVar, String str3, d dVar) {
        AppCompatActivityExtKt.b(this, "", str, str2, cVar, str3, dVar, true);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!this.A) {
            this.A = N4();
        }
        super.onCreate(bundle);
        if (!this.A) {
            finish();
            return;
        }
        this.v = new LoadingViewDelegate(this);
        if (S4()) {
            setContentView(O4());
        }
        R4();
        Context baseContext = getBaseContext();
        Intrinsics.g(baseContext, "getBaseContext(...)");
        this.B = new NotificationMessageReceiver(baseContext, this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        NotificationMessageReceiver notificationMessageReceiver = this.B;
        if (notificationMessageReceiver == null) {
            Intrinsics.p("notificationReceiver");
            throw null;
        }
        IntentFilter intentFilter = new IntentFilter("com.woolworths.scanlibrary.messaging.notification");
        intentFilter.setPriority(1);
        ContextCompat.f(this, notificationMessageReceiver, intentFilter, 4);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        NotificationMessageReceiver notificationMessageReceiver = this.B;
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
}
