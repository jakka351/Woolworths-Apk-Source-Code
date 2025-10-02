package androidx.webkit;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.internal.AssetHelper;

/* loaded from: classes2.dex */
public final class WebViewAssetLoader {

    public static final class AssetsPathHandler implements PathHandler {
        public AssetsPathHandler(Context context) {
            new AssetHelper(context);
        }
    }

    public static final class Builder {
    }

    public static final class InternalStoragePathHandler implements PathHandler {
    }

    public interface PathHandler {
    }

    @VisibleForTesting
    public static class PathMatcher {
    }

    public static final class ResourcesPathHandler implements PathHandler {
        public ResourcesPathHandler(Context context) {
            new AssetHelper(context);
        }
    }
}
