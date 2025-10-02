package au.com.woolworths.android.onesite.bindings;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.interop.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.OneShotPreDrawListener;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import au.com.woolworths.android.onesite.bindings.markdown.MarkdownLinkPlugin;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.android.onesite.common.imageloading.RatioScaleTransformation;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Preconditions;
import io.noties.markwon.Markwon;
import io.noties.markwon.SoftBreakAddsNewLinePlugin;
import io.noties.markwon.linkify.LinkifyPlugin;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BindingAdaptersKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4229a;

        static {
            int[] iArr = new int[DownloadableAssetFit.values().length];
            try {
                iArr[DownloadableAssetFit.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadableAssetFit.ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4229a = iArr;
        }
    }

    public static final void a(LottieAnimationView lottieView, final String str, Boolean bool, Boolean bool2) {
        Intrinsics.h(lottieView, "lottieView");
        LottieDrawable lottieDrawable = lottieView.k;
        Boolean bool3 = Boolean.TRUE;
        int i = 0;
        lottieView.setRepeatCount(bool2.equals(bool3) ? -1 : 0);
        if (lottieDrawable.k()) {
            return;
        }
        if (str != null) {
            lottieView.setFailureListener(new LottieListener() { // from class: au.com.woolworths.android.onesite.bindings.b
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    Throwable th = (Throwable) obj;
                    Bark.Companion companion = Bark.f8483a;
                    ReportOwner reportOwner = new ReportOwner(ReportOwner.Squad.l);
                    Intrinsics.e(th);
                    Bark.Barker.c(reportOwner, th, "Failed to load lottie with url : " + str, 8);
                }
            });
            lottieView.setAnimationFromUrl(str);
            if (bool.equals(bool3)) {
                lottieView.g();
            } else {
                lottieView.o = false;
                lottieDrawable.m();
            }
        } else {
            lottieView.d();
            i = 8;
        }
        lottieView.setVisibility(i);
    }

    public static final void b(ImageView view, String str) {
        Intrinsics.h(view, "view");
        ViewParent parent = view.getParent();
        ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        if (constraintLayout == null) {
            return;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.g(constraintLayout);
        constraintSet.k(view.getId()).e.z = str;
        constraintSet.c(constraintLayout);
    }

    public static final void c(final ImageView view, DownloadableAsset downloadableAsset) {
        Intrinsics.h(view, "view");
        if (downloadableAsset == null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = 0;
            layoutParams.height = 0;
            view.setLayoutParams(layoutParams);
            b(view, null);
            return;
        }
        DownloadableAssetFit fit = downloadableAsset.getFit();
        int i = fit == null ? -1 : WhenMappings.f4229a[fit.ordinal()];
        if (i != -1) {
            if (i == 1) {
                Context context = view.getContext();
                Intrinsics.g(context, "getContext(...)");
                final int iA = ContextExtKt.a(downloadableAsset.getAssetWidth(), context);
                Context context2 = view.getContext();
                Intrinsics.g(context2, "getContext(...)");
                final int iA2 = ContextExtKt.a(downloadableAsset.getAssetHeight(), context2);
                b(view, null);
                OneShotPreDrawListener.a(view, new Runnable() { // from class: au.com.woolworths.android.onesite.bindings.BindingAdaptersKt$setDownloadableAsset$$inlined$doOnPreDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageView imageView = view;
                        Object parent = imageView.getParent();
                        Intrinsics.f(parent, "null cannot be cast to non-null type android.view.View");
                        int width = ((View) parent).getWidth();
                        int i2 = iA;
                        float fMin = width != 0 ? Math.min(1.0f, width / i2) : 1.0f;
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams2.width = (int) (i2 * fMin);
                        layoutParams2.height = (int) (iA2 * fMin);
                        imageView.setLayoutParams(layoutParams2);
                    }
                });
                return;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = 0;
        layoutParams2.height = 0;
        view.setLayoutParams(layoutParams2);
        b(view, downloadableAsset.getAssetWidth() + ":" + downloadableAsset.getAssetHeight());
    }

    public static final void d(final ImageView imageView, String str) {
        Intrinsics.h(imageView, "imageView");
        e(imageView, str, new ImageLoaderListener() { // from class: au.com.woolworths.android.onesite.bindings.BindingAdaptersKt$setImageUrl$1
            @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
            public final boolean a(ViewDataBinding viewDataBinding) {
                imageView.setVisibility(8);
                return false;
            }

            @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
            public final boolean b(ViewDataBinding viewDataBinding, Drawable drawable) {
                imageView.setVisibility(0);
                return false;
            }
        });
    }

    public static final void e(ImageView imageView, String str, ImageLoaderListener imageLoaderListener) {
        Intrinsics.h(imageView, "imageView");
        i(imageView, str, null, null, imageLoaderListener, 96);
    }

    public static final void f(ImageView imageView, String str, Drawable drawable) {
        Intrinsics.h(imageView, "imageView");
        i(imageView, str, drawable, null, null, 96);
    }

    public static final void g(ImageView imageView, String str, Drawable drawable, Drawable drawable2) {
        Intrinsics.h(imageView, "imageView");
        i(imageView, str, drawable, drawable2, null, 96);
    }

    public static final void h(ImageView imageView, String str, Integer num, Integer num2) {
        Drawable drawable;
        Intrinsics.h(imageView, "imageView");
        Drawable drawable2 = null;
        if (num.intValue() != 0) {
            drawable = imageView.getContext().getDrawable(num.intValue());
        } else {
            drawable = null;
        }
        if (num2.intValue() != 0) {
            drawable2 = imageView.getContext().getDrawable(num2.intValue());
        }
        i(imageView, str, drawable, drawable2, null, 96);
    }

    public static void i(final ImageView imageView, String str, Drawable drawable, Drawable drawable2, final ImageLoaderListener imageLoaderListener, int i) {
        boolean z = (i & 32) == 0;
        Intrinsics.h(imageView, "imageView");
        if (str == null || str.length() == 0) {
            if (drawable2 != null) {
                drawable = drawable2;
            }
            imageView.setImageDrawable(drawable);
            if (imageLoaderListener != null) {
                imageLoaderListener.c(DataBindingUtil.b(imageView));
                return;
            }
            return;
        }
        LazyHeaders.Builder builder = new LazyHeaders.Builder();
        if (StringsKt.W(str, "https://uat-assets", false)) {
            builder.a();
        }
        builder.f13856a = true;
        GlideUrl glideUrl = new GlideUrl(str, new LazyHeaders(builder.b));
        Context context = imageView.getContext();
        Preconditions.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        RequestBuilder requestBuilderN = Glide.a(context).i.d(imageView).c(Drawable.class).N(glideUrl);
        if (z) {
            requestBuilderN.y(RatioScaleTransformation.f4238a, true);
        }
        ((RequestBuilder) ((RequestBuilder) requestBuilderN.o(drawable)).f(drawable2)).K(new RequestListener<Drawable>() { // from class: au.com.woolworths.android.onesite.bindings.BindingAdaptersKt$setImageUrlWithPlaceHolderAndErrorAndCallback$2
            @Override // com.bumptech.glide.request.RequestListener
            public final boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z2) {
                Intrinsics.h(target, "target");
                ImageLoaderListener imageLoaderListener2 = imageLoaderListener;
                if (imageLoaderListener2 != null) {
                    return imageLoaderListener2.a(DataBindingUtil.b(imageView));
                }
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public final boolean onResourceReady(Object obj, Object model, Target target, DataSource dataSource, boolean z2) {
                Drawable drawable3 = (Drawable) obj;
                Intrinsics.h(model, "model");
                Intrinsics.h(dataSource, "dataSource");
                ImageLoaderListener imageLoaderListener2 = imageLoaderListener;
                if (imageLoaderListener2 != null) {
                    return imageLoaderListener2.b(DataBindingUtil.b(imageView), drawable3);
                }
                return false;
            }
        }).H(imageView);
    }

    public static final void j(View view, boolean z) {
        Intrinsics.h(view, "view");
        view.setVisibility(z ? 4 : 0);
    }

    public static final void k(int i, View view) throws Resources.NotFoundException {
        Intrinsics.h(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = view.getContext().getResources().getDimensionPixelSize(i);
        view.setLayoutParams(layoutParams);
    }

    public static final void l(TextView textView, String str, boolean z, LinkHandler linkHandler, Iterable iterable) {
        Intrinsics.h(textView, "textView");
        if (str != null) {
            Markwon.Builder builderA = Markwon.a(textView.getContext());
            if (z) {
                builderA.b(new LinkifyPlugin());
            }
            if (iterable != null) {
                builderA.a(iterable);
            }
            builderA.b(new MarkdownLinkPlugin(linkHandler));
            builderA.b(new SoftBreakAddsNewLinePlugin());
            builderA.build().c(textView, str);
        }
    }

    public static final void m(ImageView imageView, int i, Integer num) {
        Intrinsics.h(imageView, "imageView");
        Context context = imageView.getContext();
        if (i != 0) {
            imageView.setImageDrawable(VectorDrawableCompat.a(i, context.getTheme(), context.getResources()));
        } else {
            imageView.setImageDrawable(null);
        }
        if (num == null || num.intValue() == 0) {
            imageView.clearColorFilter();
        } else {
            imageView.setColorFilter(imageView.getContext().getColor(num.intValue()), PorterDuff.Mode.SRC_IN);
        }
    }

    public static final void n(View view, String str) {
        Intrinsics.h(view, "view");
        view.setVisibility((str == null || StringsKt.D(str)) ? 8 : 0);
    }

    public static final void o(View view, boolean z) {
        Intrinsics.h(view, "view");
        view.setVisibility(z ? 0 : 8);
    }

    public static final void p(Group group, boolean z) {
        Intrinsics.h(group, "group");
        group.setVisibility(z ? 0 : 8);
    }

    public static final void q(ImageView imageView, int i) {
        Intrinsics.h(imageView, "imageView");
        if (i == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
    }

    public static final void r(TextView textView, int i) {
        Intrinsics.h(textView, "textView");
        if (i == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(textView.getContext().getText(i));
            textView.setVisibility(0);
        }
    }

    public static final void s(TextView textView, Text text) {
        Intrinsics.h(textView, "textView");
        if (text == null) {
            textView.setVisibility(8);
            return;
        }
        Context context = textView.getContext();
        Intrinsics.g(context, "getContext(...)");
        textView.setText(text.getText(context));
        textView.setVisibility(0);
    }

    public static final void t(TextView textView, String str) {
        Intrinsics.h(textView, "textView");
        if (str == null || StringsKt.D(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public static final void u(final ImageView view, int i) {
        Intrinsics.h(view, "view");
        if (i == 0) {
            view.setImageDrawable(null);
            return;
        }
        final AnimatedVectorDrawableCompat animatedVectorDrawableCompatA = AnimatedVectorDrawableCompat.a(i, view.getContext());
        view.setImageDrawable(animatedVectorDrawableCompatA);
        animatedVectorDrawableCompatA.clearAnimationCallbacks();
        animatedVectorDrawableCompatA.b(new Animatable2Compat.AnimationCallback() { // from class: au.com.woolworths.android.onesite.bindings.BindingAdaptersKt$srcAnimatedVector$1
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public final void a(Drawable drawable) {
                view.post(new d(animatedVectorDrawableCompatA, 14));
            }
        });
        animatedVectorDrawableCompatA.start();
    }
}
