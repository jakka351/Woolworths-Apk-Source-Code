package com.auth0.android.authentication.storage;

import com.auth0.android.Auth0Exception;
import com.auth0.android.callback.Callback;
import com.auth0.android.result.Credentials;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/auth0/android/authentication/storage/CredentialsManager$awaitCredentials$6$1", "Lcom/auth0/android/callback/Callback;", "Lcom/auth0/android/result/Credentials;", "Lcom/auth0/android/authentication/storage/CredentialsManagerException;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CredentialsManager$awaitCredentials$6$1 implements Callback<Credentials, CredentialsManagerException> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f13657a;

    public CredentialsManager$awaitCredentials$6$1(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f13657a = cancellableContinuationImpl;
    }

    @Override // com.auth0.android.callback.Callback
    public final void a(Auth0Exception auth0Exception) {
        CredentialsManagerException error = (CredentialsManagerException) auth0Exception;
        Intrinsics.h(error, "error");
        this.f13657a.resumeWith(ResultKt.a(error));
    }

    @Override // com.auth0.android.callback.Callback
    public final void onSuccess(Object obj) {
        Credentials result = (Credentials) obj;
        Intrinsics.h(result, "result");
        this.f13657a.resumeWith(result);
    }
}
