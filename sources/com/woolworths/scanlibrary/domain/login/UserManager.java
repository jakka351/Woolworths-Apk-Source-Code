package com.woolworths.scanlibrary.domain.login;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$string$$inlined$delegate$1;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.di.ComponentManager;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.di.user.UserModule;
import com.woolworths.scanlibrary.models.user.User;
import com.woolworths.scanlibrary.util.payment.DigitalPayProvider;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import timber.log.Timber;

@StabilityInferred
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/UserManager;", "Lcom/woolworths/scanlibrary/di/ComponentManager;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserManager extends ComponentManager {
    public final SignInUC e;
    public final DefaultLocalTokenProvider f;
    public final AuthenticatedUser g;
    public final UserComponent.Builder h;
    public final DigitalPayProvider i;
    public final FirebaseCrashlytics j;
    public UserComponent k;
    public User l;
    public boolean m;

    public UserManager(SignInUC signInUC, RewardSignInPreAuthUC rewardSignInPreAuthUC, DefaultLocalTokenProvider defaultLocalTokenProvider, AuthenticatedUser authenticatedUser, UserComponent.Builder builder, DigitalPayProvider digitalPayProvider, FirebaseCrashlytics firebaseCrashlytics) {
        Intrinsics.h(digitalPayProvider, "digitalPayProvider");
        this.e = signInUC;
        this.f = defaultLocalTokenProvider;
        this.g = authenticatedUser;
        this.h = builder;
        this.i = digitalPayProvider;
        this.j = firebaseCrashlytics;
    }

    @Override // dagger.android.HasAndroidInjector
    public final AndroidInjector B() {
        if (!this.m) {
            c();
        }
        DispatchingAndroidInjector dispatchingAndroidInjector = this.d;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        Intrinsics.p("androidInjector");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.di.ComponentManager
    public final boolean a() {
        return this.k != null || c();
    }

    public final void b() {
        Timber.Forest forest = Timber.f27013a;
        AuthenticatedUser authenticatedUser = this.g;
        forest.h("[sng] Close session for authenticatedUser: %s", authenticatedUser.a());
        authenticatedUser.g("");
        authenticatedUser.i("");
        authenticatedUser.j("");
        authenticatedUser.d.setValue(authenticatedUser, AuthenticatedUser.i[3], Boolean.FALSE);
        authenticatedUser.d(false);
        authenticatedUser.f("");
        authenticatedUser.k("");
        authenticatedUser.h(false);
        DefaultLocalTokenProvider defaultLocalTokenProvider = this.f;
        defaultLocalTokenProvider.c.setValue(defaultLocalTokenProvider, DefaultLocalTokenProvider.d[1], "");
        this.m = false;
        this.k = null;
    }

    public final boolean c() {
        if (this.m) {
            return true;
        }
        DefaultLocalTokenProvider defaultLocalTokenProvider = this.f;
        boolean zD = StringsKt.D(defaultLocalTokenProvider.a());
        AuthenticatedUser authenticatedUser = this.g;
        if (zD || StringsKt.D(authenticatedUser.a())) {
            return false;
        }
        String strB = authenticatedUser.b();
        SharedPreferenceExtKt$string$$inlined$delegate$1 sharedPreferenceExtKt$string$$inlined$delegate$1 = authenticatedUser.b;
        KProperty[] kPropertyArr = AuthenticatedUser.i;
        this.l = new User(strB, (String) sharedPreferenceExtKt$string$$inlined$delegate$1.getValue(authenticatedUser, kPropertyArr[1]), authenticatedUser.a(), authenticatedUser.c(), ((Boolean) authenticatedUser.e.getValue(authenticatedUser, kPropertyArr[4])).booleanValue(), defaultLocalTokenProvider.b(), defaultLocalTokenProvider.a());
        this.i.b(defaultLocalTokenProvider.a());
        User user = this.l;
        if (user == null) {
            Intrinsics.p("authenticatedUser");
            throw null;
        }
        UserModule userModule = new UserModule(user);
        UserComponent.Builder builder = this.h;
        builder.a(userModule);
        UserComponent userComponentBuild = builder.build();
        this.k = userComponentBuild;
        userComponentBuild.c(this);
        this.m = true;
        String strC = authenticatedUser.c();
        CrashlyticsCore crashlyticsCore = this.j.f15252a;
        crashlyticsCore.o.f15286a.a(new com.google.firebase.crashlytics.internal.common.c(1, crashlyticsCore, strC));
        return true;
    }
}
