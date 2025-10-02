package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class ViewCompatShims {

    @RequiresApi
    public static class Api26Impl {
    }

    @RequiresApi
    public static class Api29Impl {
        public static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    @RequiresApi
    public static class Api30Impl {
        public static void a(View view) {
            view.setImportantForContentCapture(1);
        }
    }

    public static ContentCaptureSessionCompat a(View view) {
        ContentCaptureSession contentCaptureSessionA;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionA = Api29Impl.a(view)) == null) {
            return null;
        }
        return new ContentCaptureSessionCompat(contentCaptureSessionA, view);
    }

    public static void b(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.a(view);
        }
    }
}
