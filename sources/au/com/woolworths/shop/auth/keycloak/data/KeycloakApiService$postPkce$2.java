package au.com.woolworths.shop.auth.keycloak.data;

import au.com.woolworths.shop.auth.keycloak.KeycloakAuthParameters;
import au.com.woolworths.shop.auth.keycloak.exception.KeycloakAuthException;
import au.com.woolworths.shop.auth.keycloak.exception.PkceException;
import au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials;
import au.com.woolworths.shop.auth.keycloak.utils.PkceUtil;
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
@DebugMetadata(c = "au.com.woolworths.shop.auth.keycloak.data.KeycloakApiService$postPkce$2", f = "KeycloakApiService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class KeycloakApiService$postPkce$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super KeycloakCredentials>, Object> {
    public final /* synthetic */ KeycloakApiService p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakApiService$postPkce$2(KeycloakApiService keycloakApiService, String str, Continuation continuation) {
        super(2, continuation);
        this.p = keycloakApiService;
        this.q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KeycloakApiService$postPkce$2(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((KeycloakApiService$postPkce$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        String strD;
        KeycloakCredentials keycloakCredentialsB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        KeycloakApiService keycloakApiService = this.p;
        KeycloakAuthParameters keycloakAuthParameters = keycloakApiService.f10238a;
        String str = keycloakAuthParameters.d;
        FormBody.Builder builder = new FormBody.Builder(0);
        keycloakAuthParameters.getClass();
        builder.a("client_id", "mobile_supers");
        builder.a("redirect_uri", keycloakAuthParameters.b);
        builder.a("grant_type", keycloakAuthParameters.f);
        keycloakAuthParameters.getClass();
        builder.a("code_verifier", PkceUtil.f10247a);
        builder.a("code", this.q);
        FormBody formBodyC = builder.c();
        Request.Builder builder2 = new Request.Builder();
        builder2.d((Headers) keycloakApiService.e.getD());
        builder2.h(str);
        builder2.f(formBodyC);
        Response responseExecute = FirebasePerfOkHttpClient.execute(((OkHttpClient) keycloakApiService.f.getD()).a(new Request(builder2)));
        if (!responseExecute.s) {
            throw new KeycloakAuthException(YU.a.d(responseExecute.g, "PKCE failed with code: "), new PkceException());
        }
        ResponseBody responseBody = responseExecute.j;
        if (responseBody == null || (strD = responseBody.d()) == null || (keycloakCredentialsB = keycloakApiService.b(strD, true)) == null) {
            throw new KeycloakAuthException("Authorisation code response body is empty.", new PkceException());
        }
        return keycloakCredentialsB;
    }
}
