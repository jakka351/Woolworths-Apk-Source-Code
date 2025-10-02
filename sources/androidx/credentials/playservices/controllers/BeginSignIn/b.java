package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CredentialProviderBeginSignInController e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(CredentialProviderBeginSignInController credentialProviderBeginSignInController, Object obj, int i) {
        this.d = i;
        this.e = credentialProviderBeginSignInController;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CredentialProviderBeginSignInController$handleResponse$3.invoke$lambda$0(this.e, (GetCredentialResponse) this.f);
                break;
            case 1:
                CredentialProviderBeginSignInController$handleResponse$4.invoke$lambda$0(this.e, (Ref.ObjectRef) this.f);
                break;
            default:
                CredentialProviderBeginSignInController$handleResponse$6.invoke$lambda$0(this.e, (GetCredentialUnknownException) this.f);
                break;
        }
    }
}
