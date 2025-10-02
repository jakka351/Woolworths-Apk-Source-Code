package me.oriient.ui.contentview;

import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.models.PixelsInViewWidth;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0016\u0010+\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0018J\u0016\u0010-\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010\u0018J\u0016\u0010/\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0018J\u0016\u00101\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0018J\t\u00103\u001a\u00020\fHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003Jm\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0005HÖ\u0001J\b\u0010>\u001a\u00020?H\u0016R\u001a\u0010\u000e\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\"\u0010\t\u001a\u00020\u0007X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\u00020\u0007X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\n\u001a\u00020\u0007X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\"\u0010\u0006\u001a\u00020\u0007X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010\r\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Lme/oriient/ui/contentview/DrawingOptionsImpl;", "Lme/oriient/ui/contentview/DrawingOptions;", "options", "(Lme/oriient/ui/contentview/DrawingOptions;)V", "zOrder", "", "minZoom", "Lme/oriient/ui/contentview/models/PixelsInViewWidth;", "maxZoom", "maxResistScale", "minResistScale", "resistRotation", "", "resistScale", "clickable", "draggable", "(IFFFFZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClickable", "()Z", "setClickable", "(Z)V", "getDraggable", "setDraggable", "getMaxResistScale-MUBgzH8", "()F", "setMaxResistScale-qAQk9oQ", "(F)V", "F", "getMaxZoom-MUBgzH8", "setMaxZoom-qAQk9oQ", "getMinResistScale-MUBgzH8", "setMinResistScale-qAQk9oQ", "getMinZoom-MUBgzH8", "setMinZoom-qAQk9oQ", "getResistRotation", "setResistRotation", "getResistScale", "setResistScale", "getZOrder", "()I", "setZOrder", "(I)V", "component1", "component2", "component2-MUBgzH8", "component3", "component3-MUBgzH8", "component4", "component4-MUBgzH8", "component5", "component5-MUBgzH8", "component6", "component7", "component8", "component9", "copy", "copy-ZHfxv_Y", "(IFFFFZZZZ)Lme/oriient/ui/contentview/DrawingOptionsImpl;", "equals", "other", "", "hashCode", "toString", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DrawingOptionsImpl implements DrawingOptions {
    private boolean clickable;
    private boolean draggable;
    private float maxResistScale;
    private float maxZoom;
    private float minResistScale;
    private float minZoom;
    private boolean resistRotation;
    private boolean resistScale;
    private int zOrder;

    public /* synthetic */ DrawingOptionsImpl(int i, float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f, f2, f3, f4, z, z2, z3, z4);
    }

    /* renamed from: copy-ZHfxv_Y$default, reason: not valid java name */
    public static /* synthetic */ DrawingOptionsImpl m501copyZHfxv_Y$default(DrawingOptionsImpl drawingOptionsImpl, int i, float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = drawingOptionsImpl.zOrder;
        }
        if ((i2 & 2) != 0) {
            f = drawingOptionsImpl.minZoom;
        }
        if ((i2 & 4) != 0) {
            f2 = drawingOptionsImpl.maxZoom;
        }
        if ((i2 & 8) != 0) {
            f3 = drawingOptionsImpl.maxResistScale;
        }
        if ((i2 & 16) != 0) {
            f4 = drawingOptionsImpl.minResistScale;
        }
        if ((i2 & 32) != 0) {
            z = drawingOptionsImpl.resistRotation;
        }
        if ((i2 & 64) != 0) {
            z2 = drawingOptionsImpl.resistScale;
        }
        if ((i2 & 128) != 0) {
            z3 = drawingOptionsImpl.clickable;
        }
        if ((i2 & 256) != 0) {
            z4 = drawingOptionsImpl.draggable;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z;
        boolean z8 = z2;
        float f5 = f4;
        float f6 = f2;
        return drawingOptionsImpl.m506copyZHfxv_Y(i, f, f6, f3, f5, z7, z8, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getZOrder() {
        return this.zOrder;
    }

    /* renamed from: component2-MUBgzH8, reason: not valid java name and from getter */
    public final float getMinZoom() {
        return this.minZoom;
    }

    /* renamed from: component3-MUBgzH8, reason: not valid java name and from getter */
    public final float getMaxZoom() {
        return this.maxZoom;
    }

    /* renamed from: component4-MUBgzH8, reason: not valid java name and from getter */
    public final float getMaxResistScale() {
        return this.maxResistScale;
    }

    /* renamed from: component5-MUBgzH8, reason: not valid java name and from getter */
    public final float getMinResistScale() {
        return this.minResistScale;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getResistRotation() {
        return this.resistRotation;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getResistScale() {
        return this.resistScale;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getClickable() {
        return this.clickable;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getDraggable() {
        return this.draggable;
    }

    @NotNull
    /* renamed from: copy-ZHfxv_Y, reason: not valid java name */
    public final DrawingOptionsImpl m506copyZHfxv_Y(int zOrder, float minZoom, float maxZoom, float maxResistScale, float minResistScale, boolean resistRotation, boolean resistScale, boolean clickable, boolean draggable) {
        return new DrawingOptionsImpl(zOrder, minZoom, maxZoom, maxResistScale, minResistScale, resistRotation, resistScale, clickable, draggable, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawingOptionsImpl)) {
            return false;
        }
        DrawingOptionsImpl drawingOptionsImpl = (DrawingOptionsImpl) other;
        return this.zOrder == drawingOptionsImpl.zOrder && PixelsInViewWidth.m593equalsimpl0(this.minZoom, drawingOptionsImpl.minZoom) && PixelsInViewWidth.m593equalsimpl0(this.maxZoom, drawingOptionsImpl.maxZoom) && PixelsInViewWidth.m593equalsimpl0(this.maxResistScale, drawingOptionsImpl.maxResistScale) && PixelsInViewWidth.m593equalsimpl0(this.minResistScale, drawingOptionsImpl.minResistScale) && this.resistRotation == drawingOptionsImpl.resistRotation && this.resistScale == drawingOptionsImpl.resistScale && this.clickable == drawingOptionsImpl.clickable && this.draggable == drawingOptionsImpl.draggable;
    }

    @Override // me.oriient.ui.contentview.DrawingOptions
    public boolean getClickable() {
        return this.clickable;
    }

    @Override // me.oriient.ui.contentview.DrawingOptions
    public boolean getDraggable() {
        return this.draggable;
    }

    @Override // me.oriient.ui.contentview.DrawingOptions
    /* renamed from: getMaxResistScale-MUBgzH8 */
    public float mo497getMaxResistScaleMUBgzH8() {
        return this.maxResistScale;
    }

    @Override // me.oriient.ui.contentview.DrawingOptions
    /* renamed from: getMaxZoom-MUBgzH8 */
    public float mo498getMaxZoomMUBgzH8() {
        return this.maxZoom;
    }

    @Override // me.oriient.ui.contentview.DrawingOptions
    /* renamed from: getMinResistScale-MUBgzH8 */
    public float mo499getMinResistScaleMUBgzH8() {
        return this.minResistScale;
    }

    @Override // me.oriient.ui.contentview.DrawingOptions
    /* renamed from: getMinZoom-MUBgzH8 */
    public float mo500getMinZoomMUBgzH8() {
        return this.minZoom;
    }

    @Override // me.oriient.ui.contentview.DrawingOptions
    public boolean getResistRotation() {
        return this.resistRotation;
    }

    @Override // me.oriient.ui.contentview.DrawingOptions
    public boolean getResistScale() {
        return this.resistScale;
    }

    @Override // me.oriient.ui.contentview.DrawingOptions
    public int getZOrder() {
        return this.zOrder;
    }

    public int hashCode() {
        return Boolean.hashCode(this.draggable) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((PixelsInViewWidth.m594hashCodeimpl(this.minResistScale) + ((PixelsInViewWidth.m594hashCodeimpl(this.maxResistScale) + ((PixelsInViewWidth.m594hashCodeimpl(this.maxZoom) + ((PixelsInViewWidth.m594hashCodeimpl(this.minZoom) + (Integer.hashCode(this.zOrder) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.resistRotation), 31, this.resistScale), 31, this.clickable);
    }

    public void setClickable(boolean z) {
        this.clickable = z;
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    /* renamed from: setMaxResistScale-qAQk9oQ, reason: not valid java name */
    public void m507setMaxResistScaleqAQk9oQ(float f) {
        this.maxResistScale = f;
    }

    /* renamed from: setMaxZoom-qAQk9oQ, reason: not valid java name */
    public void m508setMaxZoomqAQk9oQ(float f) {
        this.maxZoom = f;
    }

    /* renamed from: setMinResistScale-qAQk9oQ, reason: not valid java name */
    public void m509setMinResistScaleqAQk9oQ(float f) {
        this.minResistScale = f;
    }

    /* renamed from: setMinZoom-qAQk9oQ, reason: not valid java name */
    public void m510setMinZoomqAQk9oQ(float f) {
        this.minZoom = f;
    }

    public void setResistRotation(boolean z) {
        this.resistRotation = z;
    }

    public void setResistScale(boolean z) {
        this.resistScale = z;
    }

    public void setZOrder(int i) {
        this.zOrder = i;
    }

    @NotNull
    public String toString() {
        return "DrawingOptions(zOrder=" + getZOrder() + ", minZoom=" + ((Object) PixelsInViewWidth.m595toStringimpl(mo500getMinZoomMUBgzH8())) + ", maxZoom=" + ((Object) PixelsInViewWidth.m595toStringimpl(mo498getMaxZoomMUBgzH8())) + ", maxResistScale=" + ((Object) PixelsInViewWidth.m595toStringimpl(mo497getMaxResistScaleMUBgzH8())) + ", minResistScale=" + ((Object) PixelsInViewWidth.m595toStringimpl(mo499getMinResistScaleMUBgzH8())) + ", resistRotation=" + getResistRotation() + ", resistScale=" + getResistScale() + ", clickable=" + getClickable() + ", draggable=" + getDraggable() + ')';
    }

    private DrawingOptionsImpl(int i, float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.zOrder = i;
        this.minZoom = f;
        this.maxZoom = f2;
        this.maxResistScale = f3;
        this.minResistScale = f4;
        this.resistRotation = z;
        this.resistScale = z2;
        this.clickable = z3;
        this.draggable = z4;
    }

    public /* synthetic */ DrawingOptionsImpl(int i, float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? PixelsInViewWidth.m591constructorimpl(BitmapDescriptorFactory.HUE_RED) : f, (i2 & 4) != 0 ? PixelsInViewWidth.m591constructorimpl(Float.MAX_VALUE) : f2, (i2 & 8) != 0 ? PixelsInViewWidth.m591constructorimpl(Float.MAX_VALUE) : f3, (i2 & 16) != 0 ? PixelsInViewWidth.m591constructorimpl(BitmapDescriptorFactory.HUE_RED) : f4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) == 0 ? z4 : false, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DrawingOptionsImpl(@NotNull DrawingOptions options) {
        this(options.getZOrder(), options.mo500getMinZoomMUBgzH8(), options.mo498getMaxZoomMUBgzH8(), options.mo497getMaxResistScaleMUBgzH8(), options.mo499getMinResistScaleMUBgzH8(), options.getResistRotation(), options.getResistScale(), options.getClickable(), options.getDraggable(), null);
        Intrinsics.h(options, "options");
    }
}
