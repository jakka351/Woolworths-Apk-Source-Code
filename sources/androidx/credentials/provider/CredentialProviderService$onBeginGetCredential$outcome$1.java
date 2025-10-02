package androidx.credentials.provider;

import android.os.OutcomeReceiver;
import androidx.credentials.a;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/provider/CredentialProviderService$onBeginGetCredential$outcome$1", "Landroid/os/OutcomeReceiver;", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderService$onBeginGetCredential$outcome$1 implements OutcomeReceiver {
    public final void onError(Throwable th) {
        GetCredentialException error = (GetCredentialException) th;
        Intrinsics.h(error, "error");
        a.z();
        ((OutcomeReceiver) null).onError(a.e(error.getE(), error.getMessage()));
    }

    public final void onResult(Object obj) {
        BeginGetCredentialResponse response = (BeginGetCredentialResponse) obj;
        Intrinsics.h(response, "response");
        ((OutcomeReceiver) null).onResult(BeginGetCredentialUtil.Companion.a(response));
    }
}
