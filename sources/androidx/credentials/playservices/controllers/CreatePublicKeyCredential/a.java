package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.exceptions.CreateCredentialException;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Object obj, int i) {
        this.d = i;
        this.e = credentialProviderCreatePublicKeyCredentialController;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$2.invoke$lambda$0(this.e, (CreateCredentialException) this.f);
                break;
            case 1:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$4.invoke$lambda$0(this.e, (CreateCredentialException) this.f);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$5.invoke$lambda$0(this.e, (CreateCredentialResponse) this.f);
                break;
        }
    }
}
