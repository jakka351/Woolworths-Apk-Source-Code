package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface IPSRegionAttachment {
    @NonNull
    IPSRegion getAttachedToRegion();

    int getClientCategory();

    @NonNull
    String getId();
}
