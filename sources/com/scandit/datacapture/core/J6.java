package com.scandit.datacapture.core;

import android.media.Image;
import android.os.Build;
import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.ByteBuffer;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class J6 implements I6 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18332a;
    private final Q b = new Q();
    private final byte[] c = new byte[57960];
    private int d;

    public final void a(boolean z) {
        this.f18332a = z;
        if (z) {
            String MODEL = Build.MODEL;
            Intrinsics.g(MODEL, "MODEL");
            Locale locale = Locale.ENGLISH;
            String string = StringsKt.k0(StringsKt.Q(androidx.constraintlayout.core.state.a.m(locale, "ENGLISH", MODEL, locale, "this as java.lang.String).toLowerCase(locale)"), "samsung-", "", false)).toString();
            this.b.getClass();
            Log.i("sdc-core", "CAMCTRL Scene Change Detection enabled");
            O3.a("CAMCTRL device model: " + string + ", SCD version: 0.6.8");
        }
    }

    public final void a(Image image, Function0 onSceneChanged) {
        Intrinsics.h(image, "image");
        Intrinsics.h(onSceneChanged, "onSceneChanged");
        if (this.f18332a) {
            this.b.getClass();
            this.b.getClass();
            int rowStride = image.getPlanes()[0].getRowStride();
            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
            int i = (rowStride * SubsamplingScaleImageView.ORIENTATION_270) + 479;
            for (int i2 = 0; i2 < 180; i2++) {
                buffer.position((i2 * rowStride) + i);
                buffer.get(this.c, i2 * 322, 322);
            }
            if (this.b.a(this.c)) {
                O3.a("CAMCTRL Scene Change Detection #" + this.d);
                this.d = this.d + 1;
                ((J) onSceneChanged).invoke();
            }
        }
    }
}
