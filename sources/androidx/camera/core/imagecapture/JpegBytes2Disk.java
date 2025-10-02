package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.google.auto.value.AutoValue;

/* loaded from: classes2.dex */
class JpegBytes2Disk implements Operation<In, ImageCapture.OutputFileResults> {

    @AutoValue
    public static abstract class In {
        public abstract ImageCapture.OutputFileOptions a();

        public abstract Packet b();
    }
}
