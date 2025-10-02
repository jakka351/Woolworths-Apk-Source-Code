package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidImageBitmap implements ImageBitmap {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f1758a;

    public AndroidImageBitmap(Bitmap bitmap) {
        this.f1758a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.f1758a.getConfig();
        Intrinsics.e(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }

    public final void b() {
        this.f1758a.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final int getHeight() {
        return this.f1758a.getHeight();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final int getWidth() {
        return this.f1758a.getWidth();
    }
}
