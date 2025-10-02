package me.oriient.ui.contentview.models;

import androidx.annotation.FloatRange;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lme/oriient/ui/contentview/models/AnchorPoint;", "", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AnchorPoint {
    private final float x;
    private final float y;

    public AnchorPoint(@FloatRange float f, @FloatRange float f2) {
        this.x = f;
        this.y = f2;
    }

    public static /* synthetic */ AnchorPoint copy$default(AnchorPoint anchorPoint, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = anchorPoint.x;
        }
        if ((i & 2) != 0) {
            f2 = anchorPoint.y;
        }
        return anchorPoint.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @NotNull
    public final AnchorPoint copy(@FloatRange float x, @FloatRange float y) {
        return new AnchorPoint(x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnchorPoint)) {
            return false;
        }
        AnchorPoint anchorPoint = (AnchorPoint) other;
        return Float.compare(this.x, anchorPoint.x) == 0 && Float.compare(this.y, anchorPoint.y) == 0;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AnchorPoint(x=");
        sb.append(this.x);
        sb.append(", y=");
        return android.support.v4.media.session.a.r(sb, this.y, ')');
    }
}
