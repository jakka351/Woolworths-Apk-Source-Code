package androidx.camera.video;

import android.content.ContentValues;
import androidx.camera.video.OutputOptions;
import com.google.auto.value.AutoValue;

/* loaded from: classes2.dex */
public final class MediaStoreOutputOptions extends OutputOptions {

    public static final class Builder extends OutputOptions.Builder<MediaStoreOutputOptions, Builder> {
    }

    @AutoValue
    public static abstract class MediaStoreOutputOptionsInternal extends OutputOptions.OutputOptionsInternal {

        @AutoValue.Builder
        public static abstract class Builder extends OutputOptions.OutputOptionsInternal.Builder<Builder> {
        }
    }

    static {
        new ContentValues();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaStoreOutputOptions) {
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
