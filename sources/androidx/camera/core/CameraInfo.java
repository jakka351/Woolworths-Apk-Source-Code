package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public interface CameraInfo {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ImplementationType {
    }

    default int d() {
        return -1;
    }

    int f(int i);

    LiveData h();

    int i();

    LiveData m();

    String o();
}
