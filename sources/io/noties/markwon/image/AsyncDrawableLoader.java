package io.noties.markwon.image;

/* loaded from: classes7.dex */
public abstract class AsyncDrawableLoader {
    public static AsyncDrawableLoader c() {
        return new AsyncDrawableLoaderNoOp();
    }

    public abstract void a(AsyncDrawable asyncDrawable);

    public abstract void b(AsyncDrawable asyncDrawable);
}
