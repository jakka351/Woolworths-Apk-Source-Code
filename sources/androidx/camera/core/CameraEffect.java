package androidx.camera.core;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class CameraEffect {

    /* renamed from: a, reason: collision with root package name */
    public static final List f393a = Arrays.asList(1, 2, 3, 7);

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Formats {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OutputOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Targets {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Transformations {
    }
}
