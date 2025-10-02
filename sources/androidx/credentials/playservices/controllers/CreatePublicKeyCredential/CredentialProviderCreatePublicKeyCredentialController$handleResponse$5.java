package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$5 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CreateCredentialResponse $response;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialResponse createCredentialResponse) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$response = createCredentialResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, CreateCredentialResponse response) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(response, "$response");
        CredentialManagerCallback credentialManagerCallback = this$0.callback;
        if (credentialManagerCallback != null) {
            credentialManagerCallback.onResult(response);
            throw null;
        }
        Intrinsics.p("callback");
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m24invoke();
        return Unit.f24250a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m24invoke() {
        Executor executor = this.this$0.executor;
        if (executor != null) {
            executor.execute(new a(this.this$0, this.$response, 2));
        } else {
            Intrinsics.p("executor");
            throw null;
        }
    }
}
