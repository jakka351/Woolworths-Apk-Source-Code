package androidx.credentials.playservices.controllers.CreatePassword;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.exceptions.CreateCredentialException;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CredentialProviderCreatePasswordController e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Object obj, int i) {
        this.d = i;
        this.e = credentialProviderCreatePasswordController;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(this.e, (CreateCredentialException) this.f);
                break;
            default:
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(this.e, (CreateCredentialResponse) this.f);
                break;
        }
    }
}
