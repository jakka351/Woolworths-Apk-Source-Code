package me.oriient.ui.contentview.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.models.ContentColor;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lme/oriient/ui/contentview/models/BillboardParameters;", "", "width", "Lme/oriient/ui/contentview/models/Pixel;", "height", "localAnchorPoint", "Lme/oriient/ui/contentview/models/AnchorPoint;", "bottomStandHeight", "bottomStandWidth", "imageMargins", "color", "Lme/oriient/ui/contentview/models/ContentColor;", "(FFLme/oriient/ui/contentview/models/AnchorPoint;FFFLme/oriient/ui/contentview/models/ContentColor;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottomStandHeight-XFKo8e8", "()F", "F", "getBottomStandWidth-XFKo8e8", "getColor", "()Lme/oriient/ui/contentview/models/ContentColor;", "getHeight-XFKo8e8", "getImageMargins-XFKo8e8", "getLocalAnchorPoint", "()Lme/oriient/ui/contentview/models/AnchorPoint;", "getWidth-XFKo8e8", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BillboardParameters {
    private final float bottomStandHeight;
    private final float bottomStandWidth;

    @NotNull
    private final ContentColor color;
    private final float height;
    private final float imageMargins;

    @NotNull
    private final AnchorPoint localAnchorPoint;
    private final float width;

    public /* synthetic */ BillboardParameters(float f, float f2, AnchorPoint anchorPoint, float f3, float f4, float f5, ContentColor contentColor, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, anchorPoint, f3, f4, f5, contentColor);
    }

    /* renamed from: getBottomStandHeight-XFKo8e8, reason: not valid java name and from getter */
    public final float getBottomStandHeight() {
        return this.bottomStandHeight;
    }

    /* renamed from: getBottomStandWidth-XFKo8e8, reason: not valid java name and from getter */
    public final float getBottomStandWidth() {
        return this.bottomStandWidth;
    }

    @NotNull
    public final ContentColor getColor() {
        return this.color;
    }

    /* renamed from: getHeight-XFKo8e8, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: getImageMargins-XFKo8e8, reason: not valid java name and from getter */
    public final float getImageMargins() {
        return this.imageMargins;
    }

    @NotNull
    public final AnchorPoint getLocalAnchorPoint() {
        return this.localAnchorPoint;
    }

    /* renamed from: getWidth-XFKo8e8, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    private BillboardParameters(float f, float f2, AnchorPoint localAnchorPoint, float f3, float f4, float f5, ContentColor color) {
        Intrinsics.h(localAnchorPoint, "localAnchorPoint");
        Intrinsics.h(color, "color");
        this.width = f;
        this.height = f2;
        this.localAnchorPoint = localAnchorPoint;
        this.bottomStandHeight = f3;
        this.bottomStandWidth = f4;
        this.imageMargins = f5;
        this.color = color;
    }

    public /* synthetic */ BillboardParameters(float f, float f2, AnchorPoint anchorPoint, float f3, float f4, float f5, ContentColor contentColor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ExtensionsKt.getPx(100) : f, (i & 2) != 0 ? ExtensionsKt.getPx(75) : f2, (i & 4) != 0 ? new AnchorPoint(0.5f, 1.0f) : anchorPoint, (i & 8) != 0 ? ExtensionsKt.getPx(12) : f3, (i & 16) != 0 ? ExtensionsKt.getPx(24) : f4, (i & 32) != 0 ? ExtensionsKt.getPx(5) : f5, (i & 64) != 0 ? new ContentColor.Int(-1) : contentColor, null);
    }
}
