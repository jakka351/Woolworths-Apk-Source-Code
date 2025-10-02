package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/layer/OutlineVerificationHelper;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OutlineVerificationHelper {
    public static void a(Outline outline, Path path) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((AndroidPath) path).f1761a);
    }
}
