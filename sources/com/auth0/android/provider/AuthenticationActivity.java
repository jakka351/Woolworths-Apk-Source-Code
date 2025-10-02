package com.auth0.android.provider;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.request.internal.CommonThreadSwitcher;
import com.google.androidbrowserhelper.trusted.TwaLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/auth0/android/provider/AuthenticationActivity;", "Landroid/app/Activity;", "<init>", "()V", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class AuthenticationActivity extends Activity {
    public static final /* synthetic */ int f = 0;
    public boolean d;
    public CustomTabsController e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/auth0/android/provider/AuthenticationActivity$Companion;", "", "", "EXTRA_AUTHORIZE_URI", "Ljava/lang/String;", "EXTRA_CT_OPTIONS", "EXTRA_INTENT_LAUNCHED", "EXTRA_LAUNCH_AS_TWA", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static void a(Context context, Uri uri, CustomTabsOptions options) {
            Intrinsics.h(context, "context");
            Intrinsics.h(options, "options");
            Intent intent = new Intent(context, (Class<?>) AuthenticationActivity.class);
            intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", uri);
            intent.putExtra("com.auth0.android.EXTRA_LAUNCH_AS_TWA", false);
            intent.putExtra("com.auth0.android.EXTRA_CT_OPTIONS", options);
            intent.addFlags(67108864);
            context.startActivity(intent);
        }
    }

    public static void a(Intent intent) {
        if (WebAuthProvider.b == null) {
            Log.w(WebAuthProvider.f13671a, "There is no previous instance of this provider.");
            return;
        }
        AuthorizeResult authorizeResult = new AuthorizeResult(intent);
        ResumableManager resumableManager = WebAuthProvider.b;
        Intrinsics.e(resumableManager);
        if (resumableManager.b(authorizeResult)) {
            WebAuthProvider.b = null;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            intent = new Intent();
        }
        a(intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.d = bundle.getBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", false);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CustomTabsController customTabsController = this.e;
        if (customTabsController != null) {
            Log.v("CustomTabsController", "Trying to unbind the service");
            Context context = (Context) customTabsController.d.get();
            if (customTabsController.j && context != null) {
                context.unbindService(customTabsController);
                customTabsController.j = false;
            }
            TwaLauncher twaLauncher = customTabsController.h;
            if (!twaLauncher.h) {
                TwaLauncher.TwaCustomTabsServiceConnection twaCustomTabsServiceConnection = twaLauncher.e;
                if (twaCustomTabsServiceConnection != null) {
                    twaLauncher.f14785a.unbindService(twaCustomTabsServiceConnection);
                }
                twaLauncher.f14785a = null;
                twaLauncher.h = true;
            }
            this.e = null;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (!this.d && intent.getExtras() == null) {
            finish();
            return;
        }
        if (this.d) {
            if (intent.getData() == null) {
                setResult(0);
            }
            a(intent);
            finish();
            return;
        }
        this.d = true;
        Bundle extras = getIntent().getExtras();
        Intrinsics.e(extras);
        final Uri uri = (Uri) extras.getParcelable("com.auth0.android.EXTRA_AUTHORIZE_URI");
        Parcelable parcelable = extras.getParcelable("com.auth0.android.EXTRA_CT_OPTIONS");
        Intrinsics.e(parcelable);
        final boolean z = extras.getBoolean("com.auth0.android.EXTRA_LAUNCH_AS_TWA", false);
        CustomTabsController customTabsController = new CustomTabsController(this, (CustomTabsOptions) parcelable, new TwaLauncher(this));
        this.e = customTabsController;
        customTabsController.a();
        final CustomTabsController customTabsController2 = this.e;
        Intrinsics.e(customTabsController2);
        Intrinsics.e(uri);
        final CommonThreadSwitcher commonThreadSwitcherA = CommonThreadSwitcher.b.a();
        final AuthenticationActivity$launchAuthenticationIntent$1 authenticationActivity$launchAuthenticationIntent$1 = new AuthenticationActivity$launchAuthenticationIntent$1(this);
        final Context context = (Context) customTabsController2.d.get();
        if (context == null) {
            Log.v("CustomTabsController", "Custom Tab Context was no longer valid.");
        } else {
            commonThreadSwitcherA.f13682a.f13683a.execute(new Runnable() { // from class: com.auth0.android.provider.a
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    CustomTabsController customTabsController3 = customTabsController2;
                    customTabsController3.getClass();
                    boolean z2 = z;
                    Context context2 = context;
                    Uri uri2 = uri;
                    try {
                        if (z2) {
                            customTabsController3.h.a(customTabsController3.i.b(context2, uri2), null, null, null, TwaLauncher.i);
                        } else {
                            customTabsController3.b(context2, uri2);
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.e("CustomTabsController", "Could not find any Browser application installed in this device to handle the intent.");
                    } catch (SecurityException e) {
                        final AuthenticationException authenticationException = new AuthenticationException("An error occurred when trying to authenticate with the server.", e);
                        authenticationException.d = "a0.browser_not_available";
                        authenticationException.e = "Error launching browser for authentication";
                        final AuthenticationActivity$launchAuthenticationIntent$1 authenticationActivity$launchAuthenticationIntent$12 = authenticationActivity$launchAuthenticationIntent$1;
                        commonThreadSwitcherA.f13682a.a(new Runnable() { // from class: com.auth0.android.provider.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                AuthenticationActivity authenticationActivity = authenticationActivity$launchAuthenticationIntent$12.f13660a;
                                ResumableManager resumableManager = WebAuthProvider.b;
                                Intrinsics.e(resumableManager);
                                resumableManager.a(authenticationException);
                                authenticationActivity.finish();
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", this.d);
    }
}
