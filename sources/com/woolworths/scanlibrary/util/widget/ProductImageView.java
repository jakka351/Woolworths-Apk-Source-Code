package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import coil3.Image;
import coil3.ImageLoader;
import coil3.Image_androidKt;
import coil3.SingletonImageLoader;
import coil3.request.ImageRequest;
import coil3.target.Target;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ViewCartProudctImageBinding;
import com.woolworths.scanlibrary.util.extensions.ImageLoadingCallback;
import com.woolworths.scanlibrary.util.widget.ProductImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001b\u0010\u001b\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/ProductImageView;", "Landroid/widget/FrameLayout;", "Lcom/woolworths/scanlibrary/util/extensions/ImageLoadingCallback;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "value", "f", "Ljava/lang/String;", "getImageSrcUrl", "()Ljava/lang/String;", "setImageSrcUrl", "(Ljava/lang/String;)V", "imageSrcUrl", "g", "getItemDescription", "setItemDescription", "itemDescription", "Landroid/widget/ImageView;", "h", "Lcom/woolworths/scanlibrary/util/widget/ProductImageView$ThumbnailViewDelegate;", "getThumbnailView", "()Landroid/widget/ImageView;", "thumbnailView", "ThumbnailViewDelegate", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductImageView extends FrameLayout implements ImageLoadingCallback {
    public static final /* synthetic */ KProperty[] i = {Reflection.f24268a.h(new PropertyReference1Impl(ProductImageView.class, "thumbnailView", "getThumbnailView()Landroid/widget/ImageView;", 0))};
    public final ViewCartProudctImageBinding d;
    public final View e;

    /* renamed from: f, reason: from kotlin metadata */
    public String imageSrcUrl;

    /* renamed from: g, reason: from kotlin metadata */
    public String itemDescription;

    /* renamed from: h, reason: from kotlin metadata */
    public final ThumbnailViewDelegate thumbnailView;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/ProductImageView$ThumbnailViewDelegate;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ThumbnailViewDelegate {
        public ThumbnailViewDelegate() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductImageView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        this.thumbnailView = new ThumbnailViewDelegate();
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        int i2 = ViewCartProudctImageBinding.A;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ViewCartProudctImageBinding viewCartProudctImageBinding = (ViewCartProudctImageBinding) ViewDataBinding.q((LayoutInflater) systemService, R.layout.view_cart_proudct_image, null, false, null);
        this.d = viewCartProudctImageBinding;
        if (viewCartProudctImageBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        View view = viewCartProudctImageBinding.h;
        this.e = view;
        if (view != null) {
            addView(view, -1, -2);
        } else {
            Intrinsics.p("rootLayout");
            throw null;
        }
    }

    @Nullable
    public final String getImageSrcUrl() {
        return this.imageSrcUrl;
    }

    @Nullable
    public final String getItemDescription() {
        return this.itemDescription;
    }

    @NotNull
    public final ImageView getThumbnailView() {
        KProperty property = i[0];
        ThumbnailViewDelegate thumbnailViewDelegate = this.thumbnailView;
        thumbnailViewDelegate.getClass();
        Intrinsics.h(property, "property");
        ViewCartProudctImageBinding viewCartProudctImageBinding = ProductImageView.this.d;
        if (viewCartProudctImageBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        SquareImageView imgThumbnail = viewCartProudctImageBinding.y;
        Intrinsics.g(imgThumbnail, "imgThumbnail");
        return imgThumbnail;
    }

    public final void setImageSrcUrl(@Nullable String str) {
        this.imageSrcUrl = str;
        ViewCartProudctImageBinding viewCartProudctImageBinding = this.d;
        if (viewCartProudctImageBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        viewCartProudctImageBinding.z.setText(this.itemDescription);
        ViewCartProudctImageBinding viewCartProudctImageBinding2 = this.d;
        if (viewCartProudctImageBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        final SquareImageView imgThumbnail = viewCartProudctImageBinding2.y;
        Intrinsics.g(imgThumbnail, "imgThumbnail");
        Context context = imgThumbnail.getContext();
        Intrinsics.g(context, "getContext(...)");
        ImageLoader imageLoaderA = SingletonImageLoader.a(context);
        Context context2 = imgThumbnail.getContext();
        Intrinsics.g(context2, "getContext(...)");
        ImageRequest.Builder builder = new ImageRequest.Builder(context2);
        builder.c = str;
        builder.d = new Target() { // from class: com.woolworths.scanlibrary.util.extensions.ImageViewExtKt$load$$inlined$target$default$2
            @Override // coil3.target.Target
            public final void b(Image image) {
            }

            @Override // coil3.target.Target
            public final void c(Image image) {
                ImageView imageView = imgThumbnail;
                Resources resources = imageView.getContext().getResources();
                Intrinsics.g(resources, "getResources(...)");
                imageView.setImageDrawable(Image_androidKt.a(image, resources));
                ProductImageView productImageView = this;
                ViewCartProudctImageBinding viewCartProudctImageBinding3 = productImageView.d;
                if (viewCartProudctImageBinding3 == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                viewCartProudctImageBinding3.y.setVisibility(0);
                ViewCartProudctImageBinding viewCartProudctImageBinding4 = productImageView.d;
                if (viewCartProudctImageBinding4 != null) {
                    viewCartProudctImageBinding4.z.setText("");
                } else {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
            }

            @Override // coil3.target.Target
            public final void d(Image image) {
                ProductImageView productImageView = this.d;
                ViewCartProudctImageBinding viewCartProudctImageBinding3 = productImageView.d;
                if (viewCartProudctImageBinding3 == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                viewCartProudctImageBinding3.y.setBackground(productImageView.getContext().getDrawable(R.drawable.sng_default_image));
                ViewCartProudctImageBinding viewCartProudctImageBinding4 = productImageView.d;
                if (viewCartProudctImageBinding4 != null) {
                    viewCartProudctImageBinding4.z.setVisibility(8);
                } else {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
            }
        };
        imageLoaderA.b(builder.a());
    }

    public final void setItemDescription(@Nullable String str) {
        this.itemDescription = str;
    }
}
