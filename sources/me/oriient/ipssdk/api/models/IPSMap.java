package me.oriient.ipssdk.api.models;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import me.oriient.ipssdk.common.BuildConfig;

@Keep
@Deprecated(forRemoval = true, since = BuildConfig.LIB_VERSION_NAME)
/* loaded from: classes2.dex */
public interface IPSMap {
    double getHeightInMeters();

    @NonNull
    String getId();

    @NonNull
    Bitmap getImage();

    @NonNull
    String getName();

    @NonNull
    IPSOffset getOffset();

    double getPixelToMeter();

    @Nullable
    Double getPreferredInitialRotationDegrees();

    @NonNull
    List<IPSSignMark> getSignMarks();

    double getWidthInMeters();
}
