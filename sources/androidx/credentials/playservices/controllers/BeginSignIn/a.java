package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialException;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CredentialProviderBeginSignInController e;
    public final /* synthetic */ GetCredentialException f;

    public /* synthetic */ a(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i) {
        this.d = i;
        this.e = credentialProviderBeginSignInController;
        this.f = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CredentialProviderBeginSignInController$handleResponse$2.invoke$lambda$0(this.e, this.f);
                break;
            default:
                CredentialProviderBeginSignInController$handleResponse$5.invoke$lambda$0(this.e, this.f);
                break;
        }
    }
}
