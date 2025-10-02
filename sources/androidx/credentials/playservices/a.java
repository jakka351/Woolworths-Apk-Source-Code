package androidx.credentials.playservices;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements OnSuccessListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ a(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.d) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(this.e, obj);
                break;
            case 1:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0(this.e, obj);
                break;
            case 2:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$12(this.e, obj);
                break;
            case 3:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$4(this.e, obj);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$8(this.e, obj);
                break;
        }
    }
}
