package coil.size;

import android.content.Context;
import android.util.DisplayMetrics;
import coil.size.Dimension;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil/size/DisplaySizeResolver;", "Lcoil/size/SizeResolver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DisplaySizeResolver implements SizeResolver {
    public final Context d;

    public DisplaySizeResolver(@NotNull Context context) {
        this.d = context;
    }

    @Override // coil.size.SizeResolver
    public final Object a(Continuation continuation) {
        DisplayMetrics displayMetrics = this.d.getResources().getDisplayMetrics();
        Dimension.Pixels pixels = new Dimension.Pixels(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new Size(pixels, pixels);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DisplaySizeResolver) {
            return Intrinsics.c(this.d, ((DisplaySizeResolver) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
