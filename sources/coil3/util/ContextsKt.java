package coil3.util;

import YU.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ContextsKt {
    public static final Drawable a(int i, Context context) {
        Drawable drawableB = AppCompatResources.b(i, context);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(a.d(i, "Invalid resource ID: ").toString());
    }
}
