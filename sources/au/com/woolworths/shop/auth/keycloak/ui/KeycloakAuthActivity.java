package au.com.woolworths.shop.auth.keycloak.ui;

import YU.a;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager$signInOrRegister$2$1;
import au.com.woolworths.shop.auth.keycloak.data.KeycloakAuthProvider;
import au.com.woolworths.shop.auth.keycloak.exception.AuthCancelledException;
import au.com.woolworths.shop.auth.keycloak.exception.BrowserNotInstalledException;
import au.com.woolworths.shop.auth.keycloak.exception.KeycloakAuthException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/ui/KeycloakAuthActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class KeycloakAuthActivity extends AppCompatActivity {
    public static final /* synthetic */ int u = 0;
    public boolean t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/ui/KeycloakAuthActivity$Companion;", "", "", "INTENT_EXTRA_AUTH_URL", "Ljava/lang/String;", "AuthUrl", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/ui/KeycloakAuthActivity$Companion$AuthUrl;", "Landroid/os/Parcelable;", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AuthUrl implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AuthUrl> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AuthUrl> {
                @Override // android.os.Parcelable.Creator
                public final AuthUrl createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new AuthUrl(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AuthUrl[] newArray(int i) {
                    return new AuthUrl[i];
                }
            }

            public AuthUrl(String url) {
                Intrinsics.h(url, "url");
                this.d = url;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AuthUrl) && Intrinsics.c(this.d, ((AuthUrl) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("AuthUrl(url=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.t) {
            if (getIntent().getData() == null) {
                KeycloakAuthProvider.a(new KeycloakAuthException("Authorisation cancelled by user", new AuthCancelledException()));
            } else {
                Uri data = getIntent().getData();
                KeycloakAuthManager$signInOrRegister$2$1 keycloakAuthManager$signInOrRegister$2$1 = KeycloakAuthProvider.f10239a;
                if (keycloakAuthManager$signInOrRegister$2$1 != null) {
                    keycloakAuthManager$signInOrRegister$2$1.a(data);
                    KeycloakAuthProvider.f10239a = null;
                } else {
                    Bark.Companion companion = Bark.f8483a;
                    Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.w), "keycloakAuthCallback listener is not registered", null);
                }
            }
            finish();
            return;
        }
        this.t = true;
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                parcelable = (Parcelable) extras.getParcelable("authUrl", Companion.AuthUrl.class);
            }
        } else {
            Bundle extras2 = intent.getExtras();
            Parcelable parcelable = extras2 != null ? extras2.getParcelable("authUrl") : null;
            parcelable = (Companion.AuthUrl) (parcelable instanceof Companion.AuthUrl ? parcelable : null);
        }
        Companion.AuthUrl authUrl = (Companion.AuthUrl) parcelable;
        if (authUrl == null) {
            throw new IllegalArgumentException("Unable to launch Keycloak authorisation flow as auth URL is missing");
        }
        try {
            new CustomTabsIntent.Builder().a().b(this, Uri.parse(authUrl.d));
        } catch (ActivityNotFoundException unused) {
            KeycloakAuthProvider.a(new KeycloakAuthException("Browser not installed", new BrowserNotInstalledException()));
            finish();
        }
    }
}
