package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.r5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0809r5 implements BarcodePickIcon {
    private final Bitmap b;
    private BitmapDrawable c;

    public C0809r5(Bitmap bitmap) {
        Intrinsics.h(bitmap, "bitmap");
        this.b = bitmap;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final Drawable a(Context context) {
        Intrinsics.h(context, "context");
        BitmapDrawable bitmapDrawable = this.c;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), this.b);
        this.c = bitmapDrawable2;
        return bitmapDrawable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0809r5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BitmapIcon");
        return Intrinsics.c(this.b, ((C0809r5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final String toJson() {
        return BitmapExtensionsKt.toBase64(this.b);
    }
}
