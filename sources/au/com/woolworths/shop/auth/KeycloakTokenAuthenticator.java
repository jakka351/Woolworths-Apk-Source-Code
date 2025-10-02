package au.com.woolworths.shop.auth;

import au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$2;
import au.com.woolworths.android.onesite.network.RefreshTokenListener;
import au.com.woolworths.auth.api.AuthManagerApi;
import au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/auth/KeycloakTokenAuthenticator;", "Lokhttp3/Authenticator;", "Lau/com/woolworths/android/onesite/network/RefreshTokenListener;", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class KeycloakTokenAuthenticator implements Authenticator, RefreshTokenListener {
    public final AuthManagerApi b;
    public BaseShopApplication$observerTokenRefresh$2 c;
    public final MutexImpl d;

    public KeycloakTokenAuthenticator(KeycloakAuthManager authManagerApi) {
        Intrinsics.h(authManagerApi, "authManagerApi");
        this.b = authManagerApi;
        this.d = MutexKt.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:4|(1:6)(1:7))(0)|8|70|(1:(1:(1:(1:(6:14|15|61|63|64|65)(2:19|20))(3:21|22|58))(9:24|72|25|26|38|(1:40)|46|64|65))(1:31))(3:32|(0)|65)|68|35|(2:37|65)|38|(0)|46|64|65|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0096, code lost:
    
        r7.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009f, code lost:
    
        r11 = r11.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
    
        if (r11 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
    
        r1.p = r12;
        r1.s = 3;
        r11.c(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00aa, code lost:
    
        if (r4 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
    
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b6, code lost:
    
        if (r0.e(r1) != r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bb, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085 A[Catch: all -> 0x0089, CredentialException -> 0x008e, TRY_LEAVE, TryCatch #0 {CredentialException -> 0x008e, blocks: (B:38:0x007e, B:40:0x0085, B:35:0x0073), top: B:68:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096 A[Catch: all -> 0x0089, TryCatch #3 {all -> 0x0089, blocks: (B:38:0x007e, B:40:0x0085, B:47:0x0092, B:49:0x0096, B:50:0x0099, B:52:0x009f, B:54:0x00a3, B:35:0x0073), top: B:68:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[Catch: all -> 0x0089, TryCatch #3 {all -> 0x0089, blocks: (B:38:0x007e, B:40:0x0085, B:47:0x0092, B:49:0x0096, B:50:0x0099, B:52:0x009f, B:54:0x00a3, B:35:0x0073), top: B:68:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r11v0, types: [au.com.woolworths.shop.auth.KeycloakTokenAuthenticator] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v11, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v8, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(au.com.woolworths.shop.auth.KeycloakTokenAuthenticator r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.KeycloakTokenAuthenticator.b(au.com.woolworths.shop.auth.KeycloakTokenAuthenticator, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // okhttp3.Authenticator
    public final Request a(Route route, Response response) {
        Object objD;
        Request request = response.d;
        KeycloakTokenAuthenticator$authenticate$hasCredentials$1 keycloakTokenAuthenticator$authenticate$hasCredentials$1 = new KeycloakTokenAuthenticator$authenticate$hasCredentials$1(this, null);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.d;
        if (!((Boolean) BuildersKt.d(emptyCoroutineContext, keycloakTokenAuthenticator$authenticate$hasCredentials$1)).booleanValue() || (objD = BuildersKt.d(emptyCoroutineContext, new KeycloakTokenAuthenticator$authenticate$1(this, null))) == null) {
            return null;
        }
        Request.Builder builderB = request.b();
        builderB.c.g("Authorization");
        builderB.a("Authorization", "Bearer " + objD);
        return new Request(builderB);
    }
}
