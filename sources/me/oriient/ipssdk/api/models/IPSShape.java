package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
/* loaded from: classes2.dex */
public interface IPSShape {
    public static final int TYPE_CIRCULAR = 1;
    public static final int TYPE_POLYGONAL = 2;
    public static final int TYPE_RECTANGULAR = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    @NonNull
    IPSCoordinate getCenter();

    int getType();
}
