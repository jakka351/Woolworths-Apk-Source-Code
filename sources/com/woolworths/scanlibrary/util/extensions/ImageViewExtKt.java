package com.woolworths.scanlibrary.util.extensions;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import coil3.Image;
import coil3.ImageLoader;
import coil3.Image_androidKt;
import coil3.SingletonImageLoader;
import coil3.request.ImageRequest;
import coil3.target.Target;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ImageViewExtKt {
    public static final void a(final ImageView imageView, String imageUrl) {
        Intrinsics.h(imageView, "<this>");
        Intrinsics.h(imageUrl, "imageUrl");
        Context context = imageView.getContext();
        Intrinsics.g(context, "getContext(...)");
        ImageLoader imageLoaderA = SingletonImageLoader.a(context);
        Context context2 = imageView.getContext();
        Intrinsics.g(context2, "getContext(...)");
        ImageRequest.Builder builder = new ImageRequest.Builder(context2);
        builder.c = imageUrl;
        builder.d = new Target() { // from class: com.woolworths.scanlibrary.util.extensions.ImageViewExtKt$load$$inlined$target$default$1
            @Override // coil3.target.Target
            public final void b(Image image) {
            }

            @Override // coil3.target.Target
            public final void c(Image image) {
                ImageView imageView2 = imageView;
                Resources resources = imageView2.getContext().getResources();
                Intrinsics.g(resources, "getResources(...)");
                imageView2.setImageDrawable(Image_androidKt.a(image, resources));
            }

            @Override // coil3.target.Target
            public final void d(Image image) {
                ImageView imageView2 = imageView;
                imageView2.setImageDrawable(imageView2.getContext().getDrawable(R.drawable.sng_default_image));
            }
        };
        imageLoaderA.b(builder.a());
    }
}
