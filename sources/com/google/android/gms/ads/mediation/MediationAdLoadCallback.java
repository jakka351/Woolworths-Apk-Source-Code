package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(@NonNull AdError adError);

    @Deprecated
    void onFailure(@NonNull String str);

    @NonNull
    MediationAdCallbackT onSuccess(@NonNull MediationAdT mediationadt);
}
