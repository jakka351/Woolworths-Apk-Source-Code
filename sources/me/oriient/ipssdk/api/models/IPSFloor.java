package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
import me.oriient.ipssdk.common.BuildConfig;

@Keep
/* loaded from: classes2.dex */
public interface IPSFloor extends Comparable<Object> {
    @NonNull
    List<IPSEntrance> getEntrances();

    double getHeight();

    @NonNull
    String getId();

    @NonNull
    @Deprecated(forRemoval = true, since = BuildConfig.LIB_VERSION_NAME)
    String getMapId();

    @NonNull
    String getName();

    int getOrder();

    @Deprecated
    double getRotation();

    @NonNull
    String getShortName();
}
