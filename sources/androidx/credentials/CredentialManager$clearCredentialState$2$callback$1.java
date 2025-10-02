package androidx.credentials;

import androidx.credentials.exceptions.ClearCredentialException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/CredentialManager$clearCredentialState$2$callback$1", "Landroidx/credentials/CredentialManagerCallback;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialManager$clearCredentialState$2$callback$1 implements CredentialManagerCallback<Void, ClearCredentialException> {
    @Override // androidx.credentials.CredentialManagerCallback
    public final void a(Object obj) {
        ClearCredentialException e = (ClearCredentialException) obj;
        Intrinsics.h(e, "e");
        ResultKt.a(e);
        throw null;
    }

    @Override // androidx.credentials.CredentialManagerCallback
    public final void onResult(Object obj) {
        throw null;
    }
}
