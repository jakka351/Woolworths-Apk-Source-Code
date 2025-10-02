package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderBeginSignInController$handleResponse$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Ref.ObjectRef<GetCredentialException> $exception;
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, Ref.ObjectRef<GetCredentialException> objectRef) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$exception = objectRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController this$0, Ref.ObjectRef exception) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(exception, "$exception");
        this$0.getCallback().a(exception.d);
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m16invoke();
        return Unit.f24250a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m16invoke() {
        this.this$0.getExecutor().execute(new b(this.this$0, this.$exception, 1));
    }
}
