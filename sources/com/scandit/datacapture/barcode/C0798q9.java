package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.q9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0798q9 implements BarcodePickIcon {
    private final int b;
    private Drawable c;

    public C0798q9(int i) {
        this.b = i;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final Drawable a(Context context) {
        Intrinsics.h(context, "context");
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = context.getDrawable(this.b);
        this.c = drawable2;
        return drawable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0798q9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.ResourceIcon");
        return this.b == ((C0798q9) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final String toJson() {
        Bitmap bitmap;
        Context context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        Intrinsics.h(context, "context");
        Drawable drawableA = a(context);
        if (drawableA == null) {
            bitmap = null;
        } else if (drawableA instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawableA).getBitmap();
        } else {
            drawableA.setBounds(0, 0, drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            drawableA.draw(new Canvas(bitmapCreateBitmap));
            bitmap = bitmapCreateBitmap;
        }
        if (bitmap != null) {
            return BitmapExtensionsKt.toBase64(bitmap);
        }
        return null;
    }
}
