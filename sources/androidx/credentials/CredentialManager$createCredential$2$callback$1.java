package androidx.credentials;

import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/CredentialManager$createCredential$2$callback$1", "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialManager$createCredential$2$callback$1 implements CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> {
    @Override // androidx.credentials.CredentialManagerCallback
    public final void a(Object obj) {
        CreateCredentialException e = (CreateCredentialException) obj;
        Intrinsics.h(e, "e");
        ResultKt.a(e);
        throw null;
    }

    @Override // androidx.credentials.CredentialManagerCallback
    public final void onResult(Object obj) {
        CreateCredentialResponse result = (CreateCredentialResponse) obj;
        Intrinsics.h(result, "result");
        throw null;
    }
}
