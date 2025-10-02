package androidx.camera.core;

import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface ImageProxy extends AutoCloseable {

    public interface PlaneProxy {
        ByteBuffer q();

        int r();

        int s();
    }

    ImageInfo M0();

    int getFormat();

    int getHeight();

    Image getImage();

    PlaneProxy[] getPlanes();

    int getWidth();
}
