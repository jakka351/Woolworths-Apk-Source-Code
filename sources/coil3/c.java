package coil3;

import android.content.Context;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements SingletonImageLoader.Factory {
    @Override // coil3.SingletonImageLoader.Factory
    public final ImageLoader a(Context context) {
        c cVar = SingletonImageLoaderKt.f13054a;
        ImageLoader.Builder builder = new ImageLoader.Builder(context);
        builder.d.b(SingletonImageLoaderKt.b, Unit.f24250a);
        return builder.a();
    }
}
