package au.com.woolworths.shop.auth.keycloak;

import android.net.Uri;
import au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager$signInOrRegister$2$1$onSuccess$1", f = "KeycloakAuthManager.kt", l = {99, 109}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class KeycloakAuthManager$signInOrRegister$2$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CancellableContinuationImpl p;
    public KeycloakCredentials q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ CancellableContinuationImpl t;
    public final /* synthetic */ Uri u;
    public final /* synthetic */ KeycloakAuthManager v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakAuthManager$signInOrRegister$2$1$onSuccess$1(CancellableContinuationImpl cancellableContinuationImpl, Uri uri, KeycloakAuthManager keycloakAuthManager, Continuation continuation) {
        super(2, continuation);
        this.t = cancellableContinuationImpl;
        this.u = uri;
        this.v = keycloakAuthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        KeycloakAuthManager$signInOrRegister$2$1$onSuccess$1 keycloakAuthManager$signInOrRegister$2$1$onSuccess$1 = new KeycloakAuthManager$signInOrRegister$2$1$onSuccess$1(this.t, this.u, this.v, continuation);
        keycloakAuthManager$signInOrRegister$2$1$onSuccess$1.s = obj;
        return keycloakAuthManager$signInOrRegister$2$1$onSuccess$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((KeycloakAuthManager$signInOrRegister$2$1$onSuccess$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r0 = "Invalid URI returned from Keycloak redirection - "
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r14.r
            kotlinx.coroutines.CancellableContinuationImpl r3 = r14.t
            au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager r4 = r14.v
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L2c
            if (r2 == r6) goto L25
            if (r2 != r5) goto L1d
            au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials r0 = r14.q
            kotlinx.coroutines.CancellableContinuationImpl r1 = r14.p
            java.lang.Object r2 = r14.s
            kotlin.ResultKt.b(r15)
            goto Lad
        L1d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L25:
            kotlin.ResultKt.b(r15)     // Catch: java.lang.Throwable -> L29
            goto L60
        L29:
            r0 = move-exception
            r15 = r0
            goto L7b
        L2c:
            kotlin.ResultKt.b(r15)
            java.lang.Object r15 = r14.s
            kotlinx.coroutines.CoroutineScope r15 = (kotlinx.coroutines.CoroutineScope) r15
            android.net.Uri r15 = r14.u
            if (r15 == 0) goto L64
            java.lang.String r2 = "code"
            java.lang.String r2 = r15.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L64
            au.com.woolworths.shop.auth.keycloak.data.KeycloakApiService r15 = new au.com.woolworths.shop.auth.keycloak.data.KeycloakApiService     // Catch: java.lang.Throwable -> L29
            au.com.woolworths.android.onesite.appdata.AppEnvironment$Production r0 = au.com.woolworths.android.onesite.appdata.AppEnvironment.Production.INSTANCE     // Catch: java.lang.Throwable -> L29
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r7 = r4.f10235a     // Catch: java.lang.Throwable -> L29
            au.com.woolworths.shop.auth.keycloak.data.KeycloakAuthFeature r8 = au.com.woolworths.shop.auth.keycloak.data.KeycloakAuthFeature.d     // Catch: java.lang.Throwable -> L29
            boolean r7 = r7.c(r8)     // Catch: java.lang.Throwable -> L29
            au.com.woolworths.shop.auth.keycloak.KeycloakAuthParameters r7 = au.com.woolworths.shop.auth.keycloak.KeycloakAuthParameters.Companion.a(r0, r7)     // Catch: java.lang.Throwable -> L29
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r0)     // Catch: java.lang.Throwable -> L29
            r0 = r0 ^ r6
            r15.<init>(r7, r0)     // Catch: java.lang.Throwable -> L29
            r14.r = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r15 = r15.a(r2, r14)     // Catch: java.lang.Throwable -> L29
            if (r15 != r1) goto L60
            goto Laa
        L60:
            au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials r15 = (au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials) r15     // Catch: java.lang.Throwable -> L29
        L62:
            r2 = r15
            goto L80
        L64:
            au.com.woolworths.shop.auth.keycloak.exception.KeycloakAuthException r2 = new au.com.woolworths.shop.auth.keycloak.exception.KeycloakAuthException     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L29
            r6.append(r15)     // Catch: java.lang.Throwable -> L29
            java.lang.String r15 = r6.toString()     // Catch: java.lang.Throwable -> L29
            au.com.woolworths.shop.auth.keycloak.exception.MissingAuthCodeException r0 = new au.com.woolworths.shop.auth.keycloak.exception.MissingAuthCodeException     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            r2.<init>(r15, r0)     // Catch: java.lang.Throwable -> L29
            throw r2     // Catch: java.lang.Throwable -> L29
        L7b:
            kotlin.Result$Failure r15 = kotlin.ResultKt.a(r15)
            goto L62
        L80:
            boolean r15 = r2 instanceof kotlin.Result.Failure
            if (r15 != 0) goto Lb5
            r15 = r2
            au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials r15 = (au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials) r15
            java.lang.String r10 = r15.b
            java.lang.String r11 = r15.d
            java.lang.String r12 = r15.e
            java.lang.String r9 = r15.f10244a
            long r7 = r15.c
            java.lang.String r13 = r15.f
            au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials r6 = new au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials
            r6.<init>(r7, r9, r10, r11, r12, r13)
            au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository r15 = r4.g()
            r14.s = r2
            r14.p = r3
            r14.q = r6
            r14.r = r5
            java.lang.Object r15 = r15.f(r6, r14)
            if (r15 != r1) goto Lab
        Laa:
            return r1
        Lab:
            r1 = r3
            r0 = r6
        Lad:
            au.com.woolworths.shop.auth.keycloak.model.KeycloakIdentity r15 = new au.com.woolworths.shop.auth.keycloak.model.KeycloakIdentity
            r15.<init>(r0)
            r1.resumeWith(r15)
        Lb5:
            java.lang.Throwable r15 = kotlin.Result.a(r2)
            if (r15 == 0) goto Lc2
            kotlin.Result$Failure r15 = kotlin.ResultKt.a(r15)
            r3.resumeWith(r15)
        Lc2:
            kotlin.Unit r15 = kotlin.Unit.f24250a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager$signInOrRegister$2$1$onSuccess$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
