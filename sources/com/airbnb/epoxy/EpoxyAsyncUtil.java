package com.airbnb.epoxy;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes4.dex */
public final class EpoxyAsyncUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f13313a = new Handler(Looper.getMainLooper());
    public static final Handler b = Handler.createAsync(Looper.getMainLooper());
    public static Handler c;
}
