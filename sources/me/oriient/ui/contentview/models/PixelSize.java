package me.oriient.ui.contentview.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lme/oriient/ui/contentview/models/PixelSize;", "", "width", "Lme/oriient/ui/contentview/models/Pixel;", "height", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeight-XFKo8e8", "()F", "F", "getWidth-XFKo8e8", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PixelSize {
    private final float height;
    private final float width;

    public /* synthetic */ PixelSize(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* renamed from: getHeight-XFKo8e8, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: getWidth-XFKo8e8, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    private PixelSize(float f, float f2) {
        this.width = f;
        this.height = f2;
    }
}
