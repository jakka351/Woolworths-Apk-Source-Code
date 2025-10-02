package me.oriient.ipssdk.common.utils.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import me.oriient.ipssdk.api.models.IPSOffset;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/Offset;", "Lme/oriient/ipssdk/api/models/IPSOffset;", "x", "", "y", "(DD)V", "getX", "getY", "toString", "", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Offset implements IPSOffset {
    private final double x;
    private final double y;

    public Offset(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    @Override // me.oriient.ipssdk.api.models.IPSOffset
    public double getX() {
        return this.x;
    }

    @Override // me.oriient.ipssdk.api.models.IPSOffset
    public double getY() {
        return this.y;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Offset(x=");
        sb.append(this.x);
        sb.append(", y=");
        return b.p(sb, this.y, ')');
    }
}
