package com.scandit.datacapture.core;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class b8 implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final Z f18420a;
    private int b;
    private boolean c;

    public b8(Z callback) {
        Intrinsics.h(callback, "callback");
        this.f18420a = callback;
        this.c = true;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader reader) {
        Intrinsics.h(reader, "reader");
        try {
            Image imageAcquireLatestImage = reader.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return;
            }
            if (!this.c) {
                imageAcquireLatestImage.close();
                return;
            }
            try {
                ((K) this.f18420a).a(imageAcquireLatestImage);
                AutoCloseableKt.a(imageAcquireLatestImage, null);
            } finally {
            }
        } catch (IllegalStateException unused) {
            if (this.b == 0) {
                Log.i("sdc-core", "No buffer available for next image.");
            }
            this.b = (this.b + 1) % 30;
        }
    }
}
