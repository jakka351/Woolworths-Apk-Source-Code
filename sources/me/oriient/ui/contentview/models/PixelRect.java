package me.oriient.ui.contentview.models;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0001[B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u0018\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b'\u0010(J \u0010,\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0019H\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0000¢\u0006\u0004\b1\u00102J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0000¢\u0006\u0004\b0\u00102J \u00104\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b3\u0010 J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u00102J\u0015\u00105\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b5\u00106J\u001b\u00108\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0006H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b7\u0010(J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00068\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010CR*\u0010\b\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00068\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bD\u0010CR*\u0010\t\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00068\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bE\u0010CR*\u0010\n\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00068\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bF\u0010CR*\u0010G\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00068\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010A\u001a\u0004\bH\u0010CR*\u0010I\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00068\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010CR\u0017\u0010L\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bK\u0010CR\u0017\u0010N\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bM\u0010CR\u0011\u0010Q\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0011\u0010U\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bT\u0010PR\u0011\u0010W\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bV\u0010PR\u0011\u0010Y\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bX\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Lme/oriient/ui/contentview/models/PixelRect;", "", "Landroid/graphics/RectF;", "rect", "<init>", "(Landroid/graphics/RectF;)V", "Lme/oriient/ui/contentview/models/Pixel;", "left", "top", "right", "bottom", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "contentCoordinate", "", "contains", "(Lme/oriient/ui/contentview/models/PixelCoordinate;)Z", "copy", "()Lme/oriient/ui/contentview/models/PixelRect;", "", "set-Pp-j8M8", "(FFFF)V", "set", "(Lme/oriient/ui/contentview/models/PixelRect;)V", "set$ui_content_view_publishRelease", "Landroid/graphics/Rect;", "(Landroid/graphics/Rect;)V", "reset", "()V", "dx", "dy", "increaseBy-oaYw5vM", "(FF)V", "increaseBy", "Lme/oriient/ui/contentview/models/a;", "scale", "scale$ui_content_view_publishRelease", "(Lme/oriient/ui/contentview/models/a;)V", "pixel", "inset-K-UIv1s", "(F)Lme/oriient/ui/contentview/models/PixelRect;", "inset", "insetInto-YTXeZNg", "(FLme/oriient/ui/contentview/models/PixelRect;)Lme/oriient/ui/contentview/models/PixelRect;", "insetInto", "other", "isOverlapping$ui_content_view_publishRelease", "(Landroid/graphics/Rect;)Z", "isOverlapping", "intersect", "(Lme/oriient/ui/contentview/models/PixelRect;)Z", "move-oaYw5vM", "move", "diff", "(Lme/oriient/ui/contentview/models/PixelRect;)Lme/oriient/ui/contentview/models/PixelRect;", "times-K-UIv1s", "times", "", "toString", "()Ljava/lang/String;", "rectF", "Landroid/graphics/RectF;", "getRectF$ui_content_view_publishRelease", "()Landroid/graphics/RectF;", "<set-?>", "F", "getLeft-XFKo8e8", "()F", "getTop-XFKo8e8", "getRight-XFKo8e8", "getBottom-XFKo8e8", "height", "getHeight-XFKo8e8", "width", "getWidth-XFKo8e8", "getCenterX-XFKo8e8", "centerX", "getCenterY-XFKo8e8", "centerY", "getCenter", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "center", "getTopLeft", "topLeft", "getTopRight", "topRight", "getBottomLeft", "bottomLeft", "getBottomRight", "bottomRight", "Companion", "a", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PixelRect {

    @NotNull
    private static final a Companion = new a(null);

    @NotNull
    private static final String TAG = "PixelRect";
    private float bottom;
    private float height;
    private float left;

    @NotNull
    private final RectF rectF;
    private float right;
    private float top;
    private float width;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ PixelRect(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    public final boolean contains(@NotNull PixelCoordinate contentCoordinate) {
        Intrinsics.h(contentCoordinate, "contentCoordinate");
        float f = this.left;
        float f2 = this.right;
        float x = contentCoordinate.getX();
        return Pixel.m533boximpl(x).compareTo(Pixel.m533boximpl(f)) >= 0 && Pixel.m533boximpl(x).compareTo(Pixel.m533boximpl(f2)) <= 0 && Pixel.m534compareToKUIv1s(contentCoordinate.getY(), this.top) >= 0 && Pixel.m534compareToKUIv1s(contentCoordinate.getY(), this.bottom) <= 0;
    }

    @NotNull
    public final PixelRect copy() {
        return new PixelRect(ExtensionsKt.getPx(this.left), ExtensionsKt.getPx(this.top), ExtensionsKt.getPx(this.right), ExtensionsKt.getPx(this.bottom), null);
    }

    @NotNull
    public final PixelRect diff(@NotNull PixelRect rect) {
        Intrinsics.h(rect, "rect");
        return new PixelRect(Pixel.m542minuse6v528(rect.left, this.left), Pixel.m542minuse6v528(rect.top, this.top), Pixel.m542minuse6v528(this.right, rect.right), Pixel.m542minuse6v528(this.bottom, rect.bottom), null);
    }

    /* renamed from: getBottom-XFKo8e8, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    @NotNull
    public final PixelCoordinate getBottomLeft() {
        return new PixelCoordinate(this.left, this.bottom, null);
    }

    @NotNull
    public final PixelCoordinate getBottomRight() {
        return new PixelCoordinate(this.right, this.bottom, null);
    }

    @NotNull
    public final PixelCoordinate getCenter() {
        return new PixelCoordinate(m574getCenterXXFKo8e8(), m575getCenterYXFKo8e8(), null);
    }

    /* renamed from: getCenterX-XFKo8e8, reason: not valid java name */
    public final float m574getCenterXXFKo8e8() {
        return Pixel.m543pluse6v528(this.left, Pixel.m537divRDCHks(this.width, 2));
    }

    /* renamed from: getCenterY-XFKo8e8, reason: not valid java name */
    public final float m575getCenterYXFKo8e8() {
        return Pixel.m543pluse6v528(this.top, Pixel.m537divRDCHks(this.height, 2));
    }

    /* renamed from: getHeight-XFKo8e8, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: getLeft-XFKo8e8, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    @NotNull
    /* renamed from: getRectF$ui_content_view_publishRelease, reason: from getter */
    public final RectF getRectF() {
        return this.rectF;
    }

    /* renamed from: getRight-XFKo8e8, reason: not valid java name and from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: getTop-XFKo8e8, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    @NotNull
    public final PixelCoordinate getTopLeft() {
        return new PixelCoordinate(this.left, this.top, null);
    }

    @NotNull
    public final PixelCoordinate getTopRight() {
        return new PixelCoordinate(this.right, this.top, null);
    }

    /* renamed from: getWidth-XFKo8e8, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: increaseBy-oaYw5vM, reason: not valid java name */
    public final void m581increaseByoaYw5vM(float dx, float dy) {
        m585setPpj8M8(Pixel.m542minuse6v528(this.left, dx), Pixel.m542minuse6v528(this.top, dy), Pixel.m543pluse6v528(this.right, dx), Pixel.m543pluse6v528(this.bottom, dy));
    }

    @NotNull
    /* renamed from: inset-K-UIv1s, reason: not valid java name */
    public final PixelRect m582insetKUIv1s(float pixel) {
        float f = this.width;
        float f2 = 2.0f * pixel;
        float fM543pluse6v528 = f > f2 ? Pixel.m543pluse6v528(this.left, pixel) : Pixel.m537divRDCHks(f, 2);
        float f3 = this.height;
        float fM543pluse6v5282 = f3 > f2 ? Pixel.m543pluse6v528(this.top, pixel) : Pixel.m537divRDCHks(f3, 2);
        float f4 = this.width;
        float fM542minuse6v528 = f4 > f2 ? Pixel.m542minuse6v528(this.right, pixel) : Pixel.m537divRDCHks(f4, 2);
        float f5 = this.height;
        return new PixelRect(fM543pluse6v528, fM543pluse6v5282, fM542minuse6v528, f5 > f2 ? Pixel.m542minuse6v528(this.bottom, pixel) : Pixel.m537divRDCHks(f5, 2), null);
    }

    @NotNull
    /* renamed from: insetInto-YTXeZNg, reason: not valid java name */
    public final PixelRect m583insetIntoYTXeZNg(float pixel, @NotNull PixelRect rect) {
        Intrinsics.h(rect, "rect");
        float f = this.width;
        float f2 = 2.0f * pixel;
        float fM543pluse6v528 = f > f2 ? Pixel.m543pluse6v528(this.left, pixel) : Pixel.m537divRDCHks(f, 2);
        float f3 = this.height;
        float fM543pluse6v5282 = f3 > f2 ? Pixel.m543pluse6v528(this.top, pixel) : Pixel.m537divRDCHks(f3, 2);
        float f4 = this.width;
        float fM542minuse6v528 = f4 > f2 ? Pixel.m542minuse6v528(this.right, pixel) : Pixel.m537divRDCHks(f4, 2);
        float f5 = this.height;
        rect.m585setPpj8M8(fM543pluse6v528, fM543pluse6v5282, fM542minuse6v528, f5 > f2 ? Pixel.m542minuse6v528(this.bottom, pixel) : Pixel.m537divRDCHks(f5, 2));
        return rect;
    }

    public final boolean intersect(@NotNull PixelRect other) {
        Intrinsics.h(other, "other");
        return Pixel.m534compareToKUIv1s(this.left, other.right) < 0 && Pixel.m534compareToKUIv1s(this.right, other.left) > 0 && Pixel.m534compareToKUIv1s(this.top, other.bottom) < 0 && Pixel.m534compareToKUIv1s(this.bottom, other.top) > 0;
    }

    public final boolean isOverlapping(@NotNull PixelRect other) {
        Intrinsics.h(other, "other");
        return Pixel.m534compareToKUIv1s(this.right, other.left) >= 0 && Pixel.m534compareToKUIv1s(this.left, other.right) <= 0 && Pixel.m534compareToKUIv1s(this.top, other.bottom) >= 0 && Pixel.m534compareToKUIv1s(this.bottom, other.top) <= 0;
    }

    public final boolean isOverlapping$ui_content_view_publishRelease(@NotNull Rect other) {
        Intrinsics.h(other, "other");
        return this.right >= ((float) other.left) && this.left <= ((float) other.right) && this.top >= ((float) other.bottom) && this.bottom <= ((float) other.top);
    }

    /* renamed from: move-oaYw5vM, reason: not valid java name */
    public final void m584moveoaYw5vM(float dx, float dy) {
        this.left = Pixel.m543pluse6v528(this.left, dx);
        this.right = Pixel.m543pluse6v528(this.right, dx);
        this.top = Pixel.m543pluse6v528(this.top, dy);
        float fM543pluse6v528 = Pixel.m543pluse6v528(this.bottom, dy);
        this.bottom = fM543pluse6v528;
        this.rectF.set(this.left, this.top, this.right, fM543pluse6v528);
    }

    public final void reset() {
        m585setPpj8M8(ExtensionsKt.getPx(0), ExtensionsKt.getPx(0), ExtensionsKt.getPx(0), ExtensionsKt.getPx(0));
    }

    public final void scale$ui_content_view_publishRelease(@NotNull me.oriient.ui.contentview.models.a scale) {
        Intrinsics.h(scale, "scale");
        float fM537divRDCHks = Pixel.m537divRDCHks(Pixel.m542minuse6v528(Pixel.m546timesRDCHks$ui_content_view_publishRelease(this.width, scale), this.width), 2);
        float fM537divRDCHks2 = Pixel.m537divRDCHks(Pixel.m542minuse6v528(Pixel.m546timesRDCHks$ui_content_view_publishRelease(this.height, scale), this.height), 2);
        m585setPpj8M8(Pixel.m542minuse6v528(this.left, fM537divRDCHks), Pixel.m542minuse6v528(this.top, fM537divRDCHks2), Pixel.m543pluse6v528(this.right, fM537divRDCHks), Pixel.m543pluse6v528(this.bottom, fM537divRDCHks2));
    }

    public final void set(@NotNull PixelRect rect) {
        Intrinsics.h(rect, "rect");
        PixelRect pixelRectCopy = rect.copy();
        m585setPpj8M8(pixelRectCopy.left, pixelRectCopy.top, pixelRectCopy.right, pixelRectCopy.bottom);
    }

    public final void set$ui_content_view_publishRelease(@NotNull RectF rect) {
        Intrinsics.h(rect, "rect");
        m585setPpj8M8(ExtensionsKt.getPx(rect.left), ExtensionsKt.getPx(rect.top), ExtensionsKt.getPx(rect.right), ExtensionsKt.getPx(rect.bottom));
    }

    /* renamed from: set-Pp-j8M8, reason: not valid java name */
    public final void m585setPpj8M8(float left, float top, float right, float bottom) {
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
        this.height = Pixel.m542minuse6v528(bottom, top);
        this.width = Pixel.m542minuse6v528(right, left);
        this.rectF.set(left, top, right, bottom);
    }

    @NotNull
    /* renamed from: times-K-UIv1s, reason: not valid java name */
    public final PixelRect m586timesKUIv1s(float other) {
        return new PixelRect(Pixel.m547timese6v528(this.left, other), Pixel.m547timese6v528(this.top, other), Pixel.m547timese6v528(this.right, other), Pixel.m547timese6v528(this.bottom, other), null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        sb.append(this.bottom);
        sb.append("], [height=");
        sb.append(this.height);
        sb.append(", width=");
        return android.support.v4.media.session.a.j(this.width, ")]", sb);
    }

    private PixelRect(float f, float f2, float f3, float f4) {
        this.rectF = new RectF(f, f2, f3, f4);
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.height = Pixel.m542minuse6v528(f4, f2);
        this.width = Pixel.m542minuse6v528(f3, f);
        Pixel.m534compareToKUIv1s(this.height, ExtensionsKt.getPx(0));
        Pixel.m534compareToKUIv1s(this.width, ExtensionsKt.getPx(0));
    }

    public final boolean contains(@NotNull PixelRect rect) {
        Intrinsics.h(rect, "rect");
        return Pixel.m534compareToKUIv1s(this.left, rect.left) < 0 && Pixel.m534compareToKUIv1s(this.right, rect.right) > 0 && Pixel.m534compareToKUIv1s(this.top, rect.top) < 0 && Pixel.m534compareToKUIv1s(this.bottom, rect.bottom) > 0;
    }

    public final void set$ui_content_view_publishRelease(@NotNull Rect rect) {
        Intrinsics.h(rect, "rect");
        m585setPpj8M8(ExtensionsKt.getPx(rect.left), ExtensionsKt.getPx(rect.top), ExtensionsKt.getPx(rect.right), ExtensionsKt.getPx(rect.bottom));
    }

    public /* synthetic */ PixelRect(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ExtensionsKt.getPx(0) : f, (i & 2) != 0 ? ExtensionsKt.getPx(0) : f2, (i & 4) != 0 ? ExtensionsKt.getPx(0) : f3, (i & 8) != 0 ? ExtensionsKt.getPx(0) : f4, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PixelRect(@NotNull RectF rect) {
        this(ExtensionsKt.getPx(rect.left), ExtensionsKt.getPx(rect.top), ExtensionsKt.getPx(rect.right), ExtensionsKt.getPx(rect.bottom), null);
        Intrinsics.h(rect, "rect");
    }
}
