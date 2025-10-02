package androidx.compose.ui.platform;

import android.view.WindowInsets;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l {
    public static /* synthetic */ WindowInsets.Builder d() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder e(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession h(Object obj) {
        return (ContentCaptureSession) obj;
    }
}
