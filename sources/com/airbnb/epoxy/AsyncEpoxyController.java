package com.airbnb.epoxy;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes4.dex */
public abstract class AsyncEpoxyController extends EpoxyController {
    public AsyncEpoxyController() {
        this(true);
    }

    private static Handler getHandler(boolean z) {
        if (!z) {
            return EpoxyAsyncUtil.f13313a;
        }
        if (EpoxyAsyncUtil.c == null) {
            HandlerThread handlerThread = new HandlerThread("epoxy");
            handlerThread.start();
            EpoxyAsyncUtil.c = Handler.createAsync(handlerThread.getLooper());
        }
        return EpoxyAsyncUtil.c;
    }

    public AsyncEpoxyController(boolean z) {
        this(z, z);
    }

    public AsyncEpoxyController(boolean z, boolean z2) {
        super(getHandler(z), getHandler(z2));
    }
}
