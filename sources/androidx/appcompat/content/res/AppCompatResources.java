package androidx.appcompat.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;

/* loaded from: classes2.dex */
public final class AppCompatResources {
    public static ColorStateList a(int i, Context context) {
        return ContextCompat.c(i, context);
    }

    public static Drawable b(int i, Context context) {
        return ResourceManagerInternal.b().d(i, context);
    }
}
