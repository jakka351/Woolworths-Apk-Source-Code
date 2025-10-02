package au.com.woolworths.shop.auth.keycloak.data;

import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$clear$2", f = "KeycloakCredentialsStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class KeycloakCredentialsStore$clear$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ KeycloakCredentialsStore q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakCredentialsStore$clear$2(KeycloakCredentialsStore keycloakCredentialsStore, Continuation continuation) {
        super(2, continuation);
        this.q = keycloakCredentialsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        KeycloakCredentialsStore$clear$2 keycloakCredentialsStore$clear$2 = new KeycloakCredentialsStore$clear$2(this.q, continuation);
        keycloakCredentialsStore$clear$2.p = obj;
        return keycloakCredentialsStore$clear$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        KeycloakCredentialsStore$clear$2 keycloakCredentialsStore$clear$2 = (KeycloakCredentialsStore$clear$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        keycloakCredentialsStore$clear$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ((MutablePreferences) this.p).d(this.q.d);
        return Unit.f24250a;
    }
}
