package com.airbnb.epoxy;

/* loaded from: classes4.dex */
class MainThreadExecutor extends HandlerExecutor {
    public static final MainThreadExecutor e = new MainThreadExecutor(false);
    public static final MainThreadExecutor f = new MainThreadExecutor(true);

    public MainThreadExecutor(boolean z) {
        super(z ? EpoxyAsyncUtil.b : EpoxyAsyncUtil.f13313a);
    }
}
