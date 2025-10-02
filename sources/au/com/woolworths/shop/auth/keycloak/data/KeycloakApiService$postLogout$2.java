package au.com.woolworths.shop.auth.keycloak.data;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.keycloak.data.KeycloakApiService$postLogout$2", f = "KeycloakApiService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class KeycloakApiService$postLogout$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response>, Object> {
    public final /* synthetic */ KeycloakApiService p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakApiService$postLogout$2(KeycloakApiService keycloakApiService, String str, Continuation continuation) {
        super(2, continuation);
        this.p = keycloakApiService;
        this.q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KeycloakApiService$postLogout$2(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((KeycloakApiService$postLogout$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        KeycloakApiService keycloakApiService = this.p;
        String str = keycloakApiService.f10238a.e;
        FormBody.Builder builder = new FormBody.Builder(0);
        keycloakApiService.f10238a.getClass();
        builder.a("client_id", "mobile_supers");
        builder.a("refresh_token", this.q);
        FormBody formBodyC = builder.c();
        Request.Builder builder2 = new Request.Builder();
        builder2.d((Headers) keycloakApiService.e.getD());
        builder2.h(str);
        builder2.f(formBodyC);
        return FirebasePerfOkHttpClient.execute(((OkHttpClient) keycloakApiService.f.getD()).a(new Request(builder2)));
    }
}
