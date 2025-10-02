package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.domerrors.EncodingError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$6 extends Lambda implements Function0<Unit> {
    final /* synthetic */ JSONException $e;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$e = jSONException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, JSONException e) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(e, "$e");
        CredentialManagerCallback credentialManagerCallback = this$0.callback;
        if (credentialManagerCallback != null) {
            credentialManagerCallback.a(new CreatePublicKeyCredentialDomException(new EncodingError(), e.getMessage()));
            throw null;
        }
        Intrinsics.p("callback");
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m25invoke();
        return Unit.f24250a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m25invoke() {
        Executor executor = this.this$0.executor;
        if (executor != null) {
            executor.execute(new b(this.this$0, this.$e, 0));
        } else {
            Intrinsics.p("executor");
            throw null;
        }
    }
}
