package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController e;
    public final /* synthetic */ JSONException f;

    public /* synthetic */ b(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i) {
        this.d = i;
        this.e = credentialProviderCreatePublicKeyCredentialController;
        this.f = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$6.invoke$lambda$0(this.e, this.f);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.AnonymousClass1.invoke$lambda$0(this.e, this.f);
                break;
        }
    }
}
