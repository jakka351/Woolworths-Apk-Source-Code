package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.exceptions.GetCredentialException;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CredentialProviderGetSignInIntentController e;
    public final /* synthetic */ GetCredentialException f;

    public /* synthetic */ a(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException, int i) {
        this.d = i;
        this.e = credentialProviderGetSignInIntentController;
        this.f = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CredentialProviderGetSignInIntentController$handleResponse$2.invoke$lambda$0(this.e, this.f);
                break;
            default:
                CredentialProviderGetSignInIntentController$handleResponse$5.invoke$lambda$0(this.e, this.f);
                break;
        }
    }
}
