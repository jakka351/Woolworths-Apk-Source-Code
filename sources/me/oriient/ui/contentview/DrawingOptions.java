package me.oriient.ui.contentview;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0018\u0010\b\u001a\u00020\tX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\tX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u000e\u001a\u00020\tX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0010\u001a\u00020\tX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lme/oriient/ui/contentview/DrawingOptions;", "", "clickable", "", "getClickable", "()Z", "draggable", "getDraggable", "maxResistScale", "Lme/oriient/ui/contentview/models/PixelsInViewWidth;", "getMaxResistScale-MUBgzH8", "()F", "maxZoom", "getMaxZoom-MUBgzH8", "minResistScale", "getMinResistScale-MUBgzH8", "minZoom", "getMinZoom-MUBgzH8", "resistRotation", "getResistRotation", "resistScale", "getResistScale", "zOrder", "", "getZOrder", "()I", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DrawingOptions {
    boolean getClickable();

    boolean getDraggable();

    /* renamed from: getMaxResistScale-MUBgzH8, reason: not valid java name */
    float mo497getMaxResistScaleMUBgzH8();

    /* renamed from: getMaxZoom-MUBgzH8, reason: not valid java name */
    float mo498getMaxZoomMUBgzH8();

    /* renamed from: getMinResistScale-MUBgzH8, reason: not valid java name */
    float mo499getMinResistScaleMUBgzH8();

    /* renamed from: getMinZoom-MUBgzH8, reason: not valid java name */
    float mo500getMinZoomMUBgzH8();

    boolean getResistRotation();

    boolean getResistScale();

    int getZOrder();
}
