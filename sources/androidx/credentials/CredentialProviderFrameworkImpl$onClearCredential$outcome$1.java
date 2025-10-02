package androidx.credentials;

import android.credentials.ClearCredentialStateException;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.compose.foundation.text.input.internal.c;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/CredentialProviderFrameworkImpl$onClearCredential$outcome$1", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderFrameworkImpl$onClearCredential$outcome$1 implements OutcomeReceiver {
    public final void onError(Throwable th) {
        ClearCredentialStateException error = c.c(th);
        Intrinsics.h(error, "error");
        Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
        new ClearCredentialUnknownException(null);
        throw null;
    }

    public final void onResult(Object obj) {
        Void response = (Void) obj;
        Intrinsics.h(response, "response");
        Log.i("CredManProvService", "Clear result returned from framework: ");
        throw null;
    }
}
