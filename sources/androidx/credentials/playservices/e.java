package androidx.credentials.playservices;

import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements OnFailureListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ HiddenActivity e;

    public /* synthetic */ e(HiddenActivity hiddenActivity, int i) {
        this.d = i;
        this.e = hiddenActivity;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.d) {
            case 0:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(this.e, exc);
                break;
            case 1:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(this.e, exc);
                break;
            case 2:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(this.e, exc);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(this.e, exc);
                break;
        }
    }
}
