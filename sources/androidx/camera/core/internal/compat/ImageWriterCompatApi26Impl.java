package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
final class ImageWriterCompatApi26Impl {
    static {
        try {
            Class cls = Integer.TYPE;
            ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e) {
            Log.i("ImageWriterCompatApi26", "Unable to initialize via reflection.", e);
        }
    }
}
