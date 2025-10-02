package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController e;
    public final /* synthetic */ Throwable f;

    public /* synthetic */ c(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th, int i) {
        this.d = i;
        this.e = credentialProviderCreatePublicKeyCredentialController;
        this.f = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$7.invoke$lambda$0(this.e, this.f);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.AnonymousClass2.invoke$lambda$0(this.e, this.f);
                break;
        }
    }
}
