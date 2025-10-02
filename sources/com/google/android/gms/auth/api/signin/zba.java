package com.google.android.gms.auth.api.signin;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* loaded from: classes5.dex */
final class zba implements PendingResultUtil.ResultConverter {
    private zba() {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    @Nullable
    public final /* synthetic */ Object convert(Result result) {
        return ((GoogleSignInResult) result).getSignInAccount();
    }

    public /* synthetic */ zba(byte[] bArr) {
    }
}
