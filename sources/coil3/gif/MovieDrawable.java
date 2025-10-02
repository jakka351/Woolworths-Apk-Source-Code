package coil3.gif;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/gif/MovieDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;", "Companion", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MovieDrawable extends Drawable implements Animatable2Compat {
    public Canvas d;
    public Bitmap e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public long k;
    public long l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/gif/MovieDrawable$Companion;", "", "", "REPEAT_INFINITE", "I", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public final void a(Canvas canvas) {
        Canvas canvas2 = this.d;
        Bitmap bitmap = this.e;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.f;
            canvas2.scale(f, f);
            throw null;
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    public final void b(Rect rect) {
        if (!Intrinsics.c(null, rect)) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        throw null;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i >= 0 && i < 256) {
            throw null;
        }
        throw new IllegalArgumentException(YU.a.d(i, "Invalid alpha: ").toString());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.k = SystemClock.uptimeMillis();
        throw null;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.j) {
            this.j = false;
            throw null;
        }
    }
}
