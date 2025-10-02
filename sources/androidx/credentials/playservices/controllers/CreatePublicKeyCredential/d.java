package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController e;

    public /* synthetic */ d(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, int i) {
        this.d = i;
        this.e = credentialProviderCreatePublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.AnonymousClass3.invoke$lambda$0(this.e);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(this.e);
                break;
        }
    }
}
