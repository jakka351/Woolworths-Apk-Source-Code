package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.GetCredentialResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ GetCredentialResponse $response;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialResponse getCredentialResponse) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = getCredentialResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, GetCredentialResponse response) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(response, "$response");
        this$0.getCallback().onResult(response);
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m35invoke();
        return Unit.f24250a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m35invoke() {
        this.this$0.getExecutor().execute(new b(this.this$0, this.$response, 0));
    }
}
