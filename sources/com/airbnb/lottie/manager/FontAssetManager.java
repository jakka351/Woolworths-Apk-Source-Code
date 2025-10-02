package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.utils.Logger;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class FontAssetManager {
    public final AssetManager d;

    /* renamed from: a, reason: collision with root package name */
    public final MutablePair f13387a = new MutablePair();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String e = ".ttf";

    public FontAssetManager(Drawable.Callback callback, FontAssetDelegate fontAssetDelegate) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            Logger.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }
}
