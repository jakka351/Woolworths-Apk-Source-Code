package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes4.dex */
public class ViewPreloadSizeProvider<T> implements ListPreloader.PreloadSizeProvider<T>, SizeReadyCallback {

    public static final class SizeViewTarget extends CustomViewTarget<View, Object> {
        @Override // com.bumptech.glide.request.target.Target
        public final void e(Object obj, Transition transition) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void j(Drawable drawable) {
        }
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public final void b(int i, int i2) {
    }
}
