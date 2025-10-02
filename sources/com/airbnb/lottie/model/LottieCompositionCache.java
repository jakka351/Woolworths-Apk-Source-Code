package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import com.airbnb.lottie.LottieComposition;

@RestrictTo
/* loaded from: classes4.dex */
public class LottieCompositionCache {
    public static final LottieCompositionCache b = new LottieCompositionCache();

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f13394a = new LruCache(20);

    public final LottieComposition a(String str) {
        if (str == null) {
            return null;
        }
        return (LottieComposition) this.f13394a.get(str);
    }
}
