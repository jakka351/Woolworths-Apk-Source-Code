package com.airbnb.lottie.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.medallia.digital.mobilesdk.q2;
import java.util.Map;

/* loaded from: classes4.dex */
public class ImageAssetManager {
    public static final Object e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f13388a;
    public final String b;
    public ImageAssetDelegate c;
    public final Map d;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str.concat(q2.c);
        }
        this.d = map;
        this.c = imageAssetDelegate;
        if (callback instanceof View) {
            this.f13388a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f13388a = null;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (e) {
            ((LottieImageAsset) this.d.get(str)).f = bitmap;
        }
    }
}
