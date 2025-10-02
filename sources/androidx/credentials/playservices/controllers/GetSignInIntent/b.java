package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CredentialProviderGetSignInIntentController e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Object obj, int i) {
        this.d = i;
        this.e = credentialProviderGetSignInIntentController;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(this.e, (GetCredentialResponse) this.f);
                break;
            case 1:
                CredentialProviderGetSignInIntentController$handleResponse$4.invoke$lambda$0(this.e, (Ref.ObjectRef) this.f);
                break;
            case 2:
                CredentialProviderGetSignInIntentController$handleResponse$6.invoke$lambda$0(this.e, (GetCredentialUnknownException) this.f);
                break;
            default:
                CredentialProviderGetSignInIntentController.AnonymousClass1.invoke$lambda$0(this.e, (Exception) this.f);
                break;
        }
    }
}
