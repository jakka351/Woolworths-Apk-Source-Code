package au.com.woolworths.shop.auth.keycloak.data;

import au.com.woolworths.shop.auth.keycloak.KeycloakAuthParameters;
import au.com.woolworths.shop.auth.keycloak.exception.KeycloakCredentialException;
import au.com.woolworths.shop.auth.keycloak.exception.KeycloakServerErrorException;
import au.com.woolworths.shop.auth.keycloak.exception.SessionExpiredException;
import au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/auth/keycloak/model/KeycloakCredentials;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.keycloak.data.KeycloakApiService$postTokenExchange$2", f = "KeycloakApiService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class KeycloakApiService$postTokenExchange$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super KeycloakCredentials>, Object> {
    public final /* synthetic */ KeycloakApiService p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakApiService$postTokenExchange$2(KeycloakApiService keycloakApiService, String str, Continuation continuation) {
        super(2, continuation);
        this.p = keycloakApiService;
        this.q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KeycloakApiService$postTokenExchange$2(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((KeycloakApiService$postTokenExchange$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        String strD;
        KeycloakCredentials keycloakCredentialsB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        KeycloakApiService keycloakApiService = this.p;
        String str = keycloakApiService.f10238a.d;
        FormBody.Builder builder = new FormBody.Builder(0);
        KeycloakAuthParameters keycloakAuthParameters = keycloakApiService.f10238a;
        keycloakAuthParameters.getClass();
        builder.a("client_id", "mobile_supers");
        builder.a("refresh_token", this.q);
        builder.a("grant_type", keycloakAuthParameters.g);
        FormBody formBodyC = builder.c();
        Request.Builder builder2 = new Request.Builder();
        builder2.d((Headers) keycloakApiService.e.getD());
        builder2.h(str);
        builder2.f(formBodyC);
        Response responseExecute = FirebasePerfOkHttpClient.execute(((OkHttpClient) keycloakApiService.f.getD()).a(new Request(builder2)));
        boolean z = responseExecute.s;
        int i = responseExecute.g;
        if (z) {
            ResponseBody responseBody = responseExecute.j;
            if (responseBody == null || (strD = responseBody.d()) == null || (keycloakCredentialsB = keycloakApiService.b(strD, false)) == null) {
                throw new KeycloakCredentialException(new IllegalArgumentException("Token response body is invalid."));
            }
            return keycloakCredentialsB;
        }
        if (400 > i || i >= 500) {
            KeycloakServerErrorException keycloakServerErrorException = new KeycloakServerErrorException();
            String.valueOf(i);
            throw new KeycloakCredentialException(keycloakServerErrorException);
        }
        SessionExpiredException sessionExpiredException = new SessionExpiredException();
        String.valueOf(i);
        throw new KeycloakCredentialException(sessionExpiredException);
    }
}
