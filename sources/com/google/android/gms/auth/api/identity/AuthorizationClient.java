package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* loaded from: classes5.dex */
public interface AuthorizationClient extends HasApiKey<zba> {
    @NonNull
    Task<AuthorizationResult> authorize(@NonNull AuthorizationRequest authorizationRequest);

    @NonNull
    Task<Void> clearToken(@NonNull ClearTokenRequest clearTokenRequest);

    @NonNull
    AuthorizationResult getAuthorizationResultFromIntent(@Nullable Intent intent) throws ApiException;

    @NonNull
    Task<Void> revokeAccess(@NonNull RevokeAccessRequest revokeAccessRequest);
}
