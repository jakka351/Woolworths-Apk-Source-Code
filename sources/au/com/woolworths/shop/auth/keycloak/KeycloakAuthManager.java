package au.com.woolworths.shop.auth.keycloak;

import android.app.Application;
import android.content.Context;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.auth.api.AuthManagerApi;
import au.com.woolworths.shop.auth.keycloak.KeycloakAuthParameters;
import au.com.woolworths.shop.auth.keycloak.data.KeycloakApiService;
import au.com.woolworths.shop.auth.keycloak.data.KeycloakAuthFeature;
import au.com.woolworths.shop.auth.keycloak.data.KeycloakAuthProvider;
import au.com.woolworths.shop.auth.keycloak.data.KeycloakAuthUrlRepository;
import au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository;
import au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthManager;", "Lau/com/woolworths/auth/api/AuthManagerApi;", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class KeycloakAuthManager implements AuthManagerApi {

    /* renamed from: a, reason: collision with root package name */
    public final FeatureToggleManager f10235a;
    public final KeycloakCredentialsStore b;

    public KeycloakAuthManager(Application application, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f10235a = featureToggleManager;
        this.b = new KeycloakCredentialsStore(application);
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object a(Continuation continuation) {
        return g().d((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.auth.api.AuthManagerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager$getAccessToken$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager$getAccessToken$1 r0 = (au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager$getAccessToken$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager$getAccessToken$1 r0 = new au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager$getAccessToken$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository r5 = r4.g()
            r0.r = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            au.com.woolworths.shop.auth.keycloak.model.KeycloakIdentity r5 = (au.com.woolworths.shop.auth.keycloak.model.KeycloakIdentity) r5
            java.lang.String r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object c(Context context, SuspendLambda suspendLambda) {
        Object objE = g().e(suspendLambda);
        return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object d(Context context, String str, Boolean bool, Map map, Continuation continuation) {
        return h(context, false, continuation);
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object e(ContinuationImpl continuationImpl) {
        Object objB = g().b(continuationImpl);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object f(Context context, Map map, Continuation continuation) {
        return h(context, true, continuation);
    }

    public final KeycloakCredentialsRepository g() {
        return new KeycloakCredentialsRepository(new KeycloakApiService(KeycloakAuthParameters.Companion.a(AppEnvironment.Production.INSTANCE, this.f10235a.c(KeycloakAuthFeature.d)), !Intrinsics.c(r2, r2)), this.b);
    }

    public final Object h(Context context, boolean z, Continuation continuation) {
        String strA = new KeycloakAuthUrlRepository(KeycloakAuthParameters.Companion.a(AppEnvironment.Production.INSTANCE, this.f10235a.c(KeycloakAuthFeature.d)), z).a();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        KeycloakAuthProvider.Builder builder = new KeycloakAuthProvider.Builder();
        builder.b(strA);
        builder.a(context, new KeycloakAuthManager$signInOrRegister$2$1(cancellableContinuationImpl, this));
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }
}
