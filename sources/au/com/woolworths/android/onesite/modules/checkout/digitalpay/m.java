package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.util.Logger;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.realtime.ofs.J4;
import me.oriient.ipssdk.realtime.ofs.L4;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements QueryFormStatusProvider, AccessibilityViewCommand, Continuation, J4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m(Object obj, int i) {
        this.e = obj;
        this.d = i;
    }

    @Override // me.oriient.ipssdk.realtime.ofs.J4
    public void a(IPSError iPSError) {
        ((L4) this.e).a(this.d, iPSError);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean b(View view) {
        ((SideSheetBehavior) this.e).f(this.d);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.QueryFormStatusProvider
    public void e(boolean z) {
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) this.e;
        digitalPayForOrderPresenter.R.e();
        digitalPayForOrderPresenter.j0(this.d, z);
        digitalPayForOrderPresenter.U = z;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider = (FirebaseAuthCredentialsProvider) this.e;
        int i = this.d;
        synchronized (firebaseAuthCredentialsProvider) {
            try {
                if (i != firebaseAuthCredentialsProvider.d) {
                    Logger.a("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                    return firebaseAuthCredentialsProvider.a();
                }
                if (task.isSuccessful()) {
                    return Tasks.forResult(((GetTokenResult) task.getResult()).f15194a);
                }
                return Tasks.forException(task.getException());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
