package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface IPSLocationTag extends IPSContentItem {
    @Nullable
    String getDescription();

    @Nullable
    String getImageUrl();

    @NonNull
    List<? extends IPSRegionAttachment> getRegionAttachments();
}
