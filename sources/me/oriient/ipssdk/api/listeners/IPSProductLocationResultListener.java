package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import me.oriient.ipssdk.api.models.IPSProductLocationSearchResult;

@Keep
/* loaded from: classes2.dex */
public interface IPSProductLocationResultListener extends IPSFailable {
    void onSuccess(@Nullable IPSProductLocationSearchResult iPSProductLocationSearchResult);
}
