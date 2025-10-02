package coil3.compose;

import android.content.Context;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SingletonImageLoadersKt$sam$coil3_SingletonImageLoader_Factory$0 implements SingletonImageLoader.Factory, FunctionAdapter {
    @Override // coil3.SingletonImageLoader.Factory
    public final /* synthetic */ ImageLoader a(Context context) {
        throw null;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SingletonImageLoader.Factory) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
