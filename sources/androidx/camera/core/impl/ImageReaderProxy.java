package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface ImageReaderProxy {

    @RestrictTo
    public interface OnImageAvailableListener {
        void a(ImageReaderProxy imageReaderProxy);
    }

    int a();

    int b();

    ImageProxy c();

    void close();

    ImageProxy d();

    void e();

    void f(OnImageAvailableListener onImageAvailableListener, Executor executor);

    int getHeight();

    Surface getSurface();

    int getWidth();
}
