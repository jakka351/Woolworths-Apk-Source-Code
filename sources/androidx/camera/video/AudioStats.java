package androidx.camera.video;

import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@AutoValue
/* loaded from: classes2.dex */
public abstract class AudioStats {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f578a = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AudioState {
    }

    public abstract double a();

    public abstract int b();

    public abstract Throwable c();
}
