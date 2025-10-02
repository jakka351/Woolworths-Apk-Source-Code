package androidx.credentials.provider;

import android.os.OutcomeReceiver;
import androidx.credentials.a;
import androidx.credentials.exceptions.ClearCredentialException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/provider/CredentialProviderService$onClearCredentialState$outcome$1", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderService$onClearCredentialState$outcome$1 implements OutcomeReceiver {
    public final void onError(Throwable th) {
        ClearCredentialException error = (ClearCredentialException) th;
        Intrinsics.h(error, "error");
        a.A();
        ((OutcomeReceiver) null).onError(a.b(error.getD(), error.getMessage()));
    }

    public final void onResult(Object obj) {
        ((OutcomeReceiver) null).onResult((Void) obj);
    }
}
