package com.google.android.play.core.integrity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;

/* loaded from: classes6.dex */
public final class i implements k {
    @Override // com.google.android.play.core.integrity.k
    @Nullable
    public final ApiException a(Bundle bundle) {
        int i = bundle.getInt("error");
        if (i == 0) {
            return null;
        }
        return new IntegrityServiceException(i, null);
    }
}
