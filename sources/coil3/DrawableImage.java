package coil3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import coil3.util.Utils_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/DrawableImage;", "Lcoil3/Image;", "SizeProvider", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DrawableImage implements Image {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f13041a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcoil3/DrawableImage$SizeProvider;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SizeProvider {
        long getSize();
    }

    public DrawableImage(Drawable drawable) {
        this.f13041a = drawable;
    }

    @Override // coil3.Image
    public final boolean a() {
        return false;
    }

    @Override // coil3.Image
    public final void b(Canvas canvas) {
        this.f13041a.draw(canvas);
    }

    /* renamed from: c, reason: from getter */
    public final Drawable getF13041a() {
        return this.f13041a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawableImage) && Intrinsics.c(this.f13041a, ((DrawableImage) obj).f13041a);
    }

    @Override // coil3.Image
    public final int getHeight() {
        return Utils_androidKt.a(this.f13041a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // coil3.Image
    public final long getSize() {
        Drawable drawable = this.f13041a;
        long size = drawable instanceof SizeProvider ? ((SizeProvider) drawable).getSize() : Utils_androidKt.b(drawable) * 4 * Utils_androidKt.a(drawable);
        if (size < 0) {
            return 0L;
        }
        return size;
    }

    @Override // coil3.Image
    public final int getWidth() {
        return Utils_androidKt.b(this.f13041a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f13041a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f13041a + ", shareable=false)";
    }
}
