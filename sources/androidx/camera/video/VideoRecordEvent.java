package androidx.camera.video;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public abstract class VideoRecordEvent {

    public static final class Finalize extends VideoRecordEvent {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface VideoRecordError {
        }
    }

    public static final class Pause extends VideoRecordEvent {
    }

    public static final class Resume extends VideoRecordEvent {
    }

    public static final class Start extends VideoRecordEvent {
    }

    public static final class Status extends VideoRecordEvent {
    }
}
