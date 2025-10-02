package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.annotation.RequiresApi;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.google.auto.value.AutoValue;

/* loaded from: classes2.dex */
class Bitmap2JpegBytes implements Operation<In, Packet<byte[]>> {

    @RequiresApi
    public static class Api34Impl {
        public static boolean a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    @AutoValue
    public static abstract class In {
        public abstract int a();

        public abstract Packet b();
    }
}
