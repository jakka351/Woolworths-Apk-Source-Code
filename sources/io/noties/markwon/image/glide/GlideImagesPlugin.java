package io.noties.markwon.image.glide;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Executors;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.image.AsyncDrawable;
import io.noties.markwon.image.AsyncDrawableLoader;
import io.noties.markwon.image.AsyncDrawableScheduler;
import io.noties.markwon.image.ImageSpanFactory;
import java.util.HashMap;
import org.commonmark.node.Image;

/* loaded from: classes7.dex */
public class GlideImagesPlugin extends AbstractMarkwonPlugin {

    /* renamed from: a, reason: collision with root package name */
    public final GlideAsyncDrawableLoader f24212a;

    /* renamed from: io.noties.markwon.image.glide.GlideImagesPlugin$1, reason: invalid class name */
    class AnonymousClass1 implements GlideStore {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RequestManager f24213a;

        public AnonymousClass1(RequestManager requestManager) {
            this.f24213a = requestManager;
        }
    }

    public static class GlideAsyncDrawableLoader extends AsyncDrawableLoader {

        /* renamed from: a, reason: collision with root package name */
        public final GlideStore f24214a;
        public final HashMap b = new HashMap(2);

        public class AsyncDrawableTarget extends CustomTarget<Drawable> {
            public final AsyncDrawable g;

            public AsyncDrawableTarget(AsyncDrawable asyncDrawable) {
                this.g = asyncDrawable;
            }

            @Override // com.bumptech.glide.request.target.Target
            public final void d(Drawable drawable) {
                Drawable drawable2;
                AsyncDrawable asyncDrawable = this.g;
                if (asyncDrawable.getCallback() == null || (drawable2 = asyncDrawable.f) == null) {
                    return;
                }
                drawable2.setCallback(null);
                asyncDrawable.f = null;
                asyncDrawable.setBounds(0, 0, 0, 0);
            }

            @Override // com.bumptech.glide.request.target.Target
            public final void e(Object obj, Transition transition) {
                Drawable drawable = (Drawable) obj;
                HashMap map = GlideAsyncDrawableLoader.this.b;
                AsyncDrawable asyncDrawable = this.g;
                if (map.remove(asyncDrawable) == null || asyncDrawable.getCallback() == null) {
                    return;
                }
                if (drawable.getBounds().isEmpty()) {
                    drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
                }
                asyncDrawable.d(drawable);
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            public final void h(Drawable drawable) {
                if (drawable != null) {
                    AsyncDrawable asyncDrawable = this.g;
                    if (asyncDrawable.getCallback() != null) {
                        if (drawable.getBounds().isEmpty()) {
                            drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
                        }
                        asyncDrawable.d(drawable);
                    }
                }
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            public final void j(Drawable drawable) {
                HashMap map = GlideAsyncDrawableLoader.this.b;
                AsyncDrawable asyncDrawable = this.g;
                if (map.remove(asyncDrawable) == null || drawable == null || asyncDrawable.getCallback() == null) {
                    return;
                }
                if (drawable.getBounds().isEmpty()) {
                    drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
                }
                asyncDrawable.d(drawable);
            }
        }

        public GlideAsyncDrawableLoader(GlideStore glideStore) {
            this.f24214a = glideStore;
        }

        @Override // io.noties.markwon.image.AsyncDrawableLoader
        public final void a(AsyncDrawable asyncDrawable) {
            Target target = (Target) this.b.remove(asyncDrawable);
            if (target != null) {
                ((AnonymousClass1) this.f24214a).f24213a.f(target);
            }
        }

        @Override // io.noties.markwon.image.AsyncDrawableLoader
        public final void b(AsyncDrawable asyncDrawable) {
            AsyncDrawableTarget asyncDrawableTarget = new AsyncDrawableTarget(asyncDrawable);
            this.b.put(asyncDrawable, asyncDrawableTarget);
            RequestBuilder requestBuilderL = ((AnonymousClass1) this.f24214a).f24213a.l(asyncDrawable.f24210a);
            requestBuilderL.J(asyncDrawableTarget, null, requestBuilderL, Executors.f13983a);
        }
    }

    public interface GlideStore {
    }

    public GlideImagesPlugin(GlideStore glideStore) {
        this.f24212a = new GlideAsyncDrawableLoader(glideStore);
    }

    public static GlideImagesPlugin k(Context context) {
        return new GlideImagesPlugin(new AnonymousClass1(Glide.d(context)));
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void b(TextView textView) {
        AsyncDrawableScheduler.b(textView);
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void d(MarkwonSpansFactory.Builder builder) {
        builder.b(Image.class, new ImageSpanFactory());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void f(MarkwonConfiguration.Builder builder) {
        builder.b = this.f24212a;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void g(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        AsyncDrawableScheduler.c(textView);
    }
}
