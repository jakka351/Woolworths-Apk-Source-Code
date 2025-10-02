package com.swrve.sdk.messaging;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveLogger;
import com.swrve.sdk.SwrveTextTemplating;
import java.io.File;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class SwrveBaseImageView extends AppCompatImageView {
    public final int g;

    /* renamed from: com.swrve.sdk.messaging.SwrveBaseImageView$1, reason: invalid class name */
    class AnonymousClass1 implements RequestListener<GifDrawable> {
        @Override // com.bumptech.glide.request.RequestListener
        public final boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z) {
            SwrveLogger.c("SwrveSDK: Glide failed to load image.", glideException, new Object[0]);
            return false;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public final boolean onResourceReady(Object obj, Object obj2, Target target, DataSource dataSource, boolean z) {
            SwrveLogger.g("SwrveSDK: Glide successfully loaded image", new Object[0]);
            return false;
        }
    }

    public SwrveBaseImageView(Context context) {
        super(context);
    }

    public final void c(SwrveImageFileInfo swrveImageFileInfo) {
        if (!swrveImageFileInfo.c) {
            setImageBitmap(swrveImageFileInfo.d.f19058a);
            return;
        }
        RequestBuilder requestBuilderN = Glide.d(getContext()).c(GifDrawable.class).a(RequestManager.o).N(new File(swrveImageFileInfo.f19097a));
        requestBuilderN.getClass();
        ((RequestBuilder) requestBuilderN.r(DownsampleStrategy.f13909a, new FitCenter(), true)).K(new AnonymousClass1()).H(this);
    }

    public final void d(SwrveWidget swrveWidget, Map map, String str) {
        if (SwrveHelper.o(swrveWidget.a())) {
            setContentDescription(SwrveTextTemplating.a(swrveWidget.a(), map));
        } else if (SwrveHelper.o(str)) {
            setContentDescription(str);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            SwrveHelper.t(this, 1.0f, 1.2f);
        } else {
            SwrveHelper.t(this, 1.2f, 1.0f);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            setColorFilter(this.g);
            invalidate();
        } else if (action == 1) {
            clearColorFilter();
        }
        return super.onTouchEvent(motionEvent);
    }

    public SwrveBaseImageView(Context context, int i) {
        super(context);
        this.g = i;
    }
}
