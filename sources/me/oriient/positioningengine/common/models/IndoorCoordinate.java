package me.oriient.positioningengine.common.models;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001c"}, d2 = {"Lme/oriient/positioningengine/common/models/IndoorCoordinate;", "Ljava/io/Serializable;", "", "x", "y", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Lme/oriient/positioningengine/common/models/IndoorCoordinate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getX", "getY", "Companion", "me/oriient/positioningengine/common/models/d", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IndoorCoordinate implements Serializable {

    @NotNull
    public static final d Companion = new d();
    private static final long serialVersionUID = 1;
    private final float x;
    private final float y;

    public IndoorCoordinate(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public static /* synthetic */ IndoorCoordinate copy$default(IndoorCoordinate indoorCoordinate, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = indoorCoordinate.x;
        }
        if ((i & 2) != 0) {
            f2 = indoorCoordinate.y;
        }
        return indoorCoordinate.copy(f, f2);
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
    public final IndoorCoordinate copy(float x, float y) {
        return new IndoorCoordinate(x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndoorCoordinate)) {
            return false;
        }
        IndoorCoordinate indoorCoordinate = (IndoorCoordinate) other;
        return Float.compare(this.x, indoorCoordinate.x) == 0 && Float.compare(this.y, indoorCoordinate.y) == 0;
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
        StringBuilder sb = new StringBuilder("IndoorCoordinate(x=");
        sb.append(this.x);
        sb.append(", y=");
        return android.support.v4.media.session.a.r(sb, this.y, ')');
    }
}
