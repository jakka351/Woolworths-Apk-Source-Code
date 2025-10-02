package androidx.credentials.provider;

import android.os.OutcomeReceiver;
import androidx.credentials.a;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/provider/CredentialProviderService$onBeginCreateCredential$outcome$1", "Landroid/os/OutcomeReceiver;", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderService$onBeginCreateCredential$outcome$1 implements OutcomeReceiver {
    public final void onError(Throwable th) {
        CreateCredentialException error = (CreateCredentialException) th;
        Intrinsics.h(error, "error");
        a.t();
        ((OutcomeReceiver) null).onError(a.c(error.getE(), error.getMessage()));
    }

    public final void onResult(Object obj) {
        BeginCreateCredentialResponse response = (BeginCreateCredentialResponse) obj;
        Intrinsics.h(response, "response");
        ((OutcomeReceiver) null).onResult(BeginCreateCredentialUtil.Companion.a(response));
    }
}
