package androidx.camera.video;

import androidx.camera.video.OutputOptions;
import com.google.auto.value.AutoValue;

/* loaded from: classes2.dex */
public final class FileDescriptorOutputOptions extends OutputOptions {

    public static final class Builder extends OutputOptions.Builder<FileDescriptorOutputOptions, Builder> {
    }

    @AutoValue
    public static abstract class FileDescriptorOutputOptionsInternal extends OutputOptions.OutputOptionsInternal {

        @AutoValue.Builder
        public static abstract class Builder extends OutputOptions.OutputOptionsInternal.Builder<Builder> {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileDescriptorOutputOptions) {
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
