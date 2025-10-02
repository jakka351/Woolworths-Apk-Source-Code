package me.oriient.ui.contentview.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\u0000J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0086\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aR&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lme/oriient/ui/contentview/models/PixelCoordinate;", "", "()V", "x", "Lme/oriient/ui/contentview/models/Pixel;", "y", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "getX-XFKo8e8", "()F", "F", "getY-XFKo8e8", "copy", "offset", "", "ofX", "ofY", "offset-oaYw5vM", "(FF)V", "times", "other", "", "toString", "", "updateX", "updateX-K-UIv1s", "(F)V", "updateY", "updateY-K-UIv1s", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PixelCoordinate {
    private float x;
    private float y;

    public /* synthetic */ PixelCoordinate(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    @NotNull
    public final PixelCoordinate copy() {
        return new PixelCoordinate(this.x, this.y, null);
    }

    /* renamed from: getX-XFKo8e8, reason: not valid java name and from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: getY-XFKo8e8, reason: not valid java name and from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: offset-oaYw5vM, reason: not valid java name */
    public final void m554offsetoaYw5vM(float ofX, float ofY) {
        this.x = Pixel.m543pluse6v528(this.x, ofX);
        this.y = Pixel.m543pluse6v528(this.y, ofY);
    }

    @NotNull
    public final PixelCoordinate times(float other) {
        return new PixelCoordinate(Pixel.m544timesRDCHks(this.x, other), Pixel.m544timesRDCHks(this.y, other), null);
    }

    @NotNull
    public String toString() {
        return "PixelCoordinate(x=" + ((Object) Pixel.m548toStringimpl(this.x)) + ", y=" + ((Object) Pixel.m548toStringimpl(this.y)) + ')';
    }

    /* renamed from: updateX-K-UIv1s, reason: not valid java name */
    public final void m555updateXKUIv1s(float x) {
        this.x = x;
    }

    /* renamed from: updateY-K-UIv1s, reason: not valid java name */
    public final void m556updateYKUIv1s(float y) {
        this.y = y;
    }

    private PixelCoordinate(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public PixelCoordinate() {
        this(ExtensionsKt.getPx(0), ExtensionsKt.getPx(0), null);
    }
}
