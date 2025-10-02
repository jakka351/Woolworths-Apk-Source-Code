package androidx.camera.video;

import androidx.camera.video.OutputOptions;
import com.google.auto.value.AutoValue;

/* loaded from: classes2.dex */
public final class FileOutputOptions extends OutputOptions {

    public static final class Builder extends OutputOptions.Builder<FileOutputOptions, Builder> {
    }

    @AutoValue
    public static abstract class FileOutputOptionsInternal extends OutputOptions.OutputOptionsInternal {

        @AutoValue.Builder
        public static abstract class Builder extends OutputOptions.OutputOptionsInternal.Builder<Builder> {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileOutputOptions) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
