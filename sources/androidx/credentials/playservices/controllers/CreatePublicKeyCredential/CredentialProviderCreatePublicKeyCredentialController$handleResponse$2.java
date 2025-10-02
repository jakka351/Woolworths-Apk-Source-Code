package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "Landroidx/credentials/exceptions/CreateCredentialException;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$2 extends Lambda implements Function1<CreateCredentialException, Unit> {
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(1);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, CreateCredentialException e) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(e, "$e");
        CredentialManagerCallback credentialManagerCallback = this$0.callback;
        if (credentialManagerCallback != null) {
            credentialManagerCallback.a(e);
            throw null;
        }
        Intrinsics.p("callback");
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CreateCredentialException) obj);
        return Unit.f24250a;
    }

    public final void invoke(@NotNull CreateCredentialException e) {
        Intrinsics.h(e, "e");
        Executor executor = this.this$0.executor;
        if (executor != null) {
            executor.execute(new a(this.this$0, e, 0));
        } else {
            Intrinsics.p("executor");
            throw null;
        }
    }
}
