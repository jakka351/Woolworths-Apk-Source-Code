package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface IPSContentItem {
    public static final int TYPE_LOCATION_TAG = 0;
    public static final int TYPE_REGION = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    @NonNull
    String getId();

    @Nullable
    String getMetadata();

    @NonNull
    String getName();

    List<? extends IPSPlacement> getPlacements();

    int getType();
}
