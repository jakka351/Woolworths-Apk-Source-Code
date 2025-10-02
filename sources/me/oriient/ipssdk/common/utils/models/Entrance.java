package me.oriient.ipssdk.common.utils.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSEntrance;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/Entrance;", "Lme/oriient/ipssdk/api/models/IPSEntrance;", "entranceId", "", "entranceDescription", "isMain", "", "x", "", "y", "(Ljava/lang/String;Ljava/lang/String;ZDD)V", "getEntranceId", "()Ljava/lang/String;", "()Z", "getEntranceDescription", "getId", "getIsMain", "getX", "getY", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Entrance implements IPSEntrance {

    @NotNull
    private final String entranceDescription;

    @NotNull
    private final String entranceId;
    private final boolean isMain;
    private final double x;
    private final double y;

    public Entrance(@NotNull String entranceId, @NotNull String entranceDescription, boolean z, double d, double d2) {
        Intrinsics.h(entranceId, "entranceId");
        Intrinsics.h(entranceDescription, "entranceDescription");
        this.entranceId = entranceId;
        this.entranceDescription = entranceDescription;
        this.isMain = z;
        this.x = d;
        this.y = d2;
    }

    @Override // me.oriient.ipssdk.api.models.IPSEntrance
    @NotNull
    public String getEntranceDescription() {
        return this.entranceDescription;
    }

    @NotNull
    public final String getEntranceId() {
        return this.entranceId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSEntrance
    @NotNull
    public String getId() {
        return this.entranceId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSEntrance
    public boolean getIsMain() {
        return this.isMain;
    }

    @Override // me.oriient.ipssdk.api.models.IPSEntrance
    public double getX() {
        return this.x;
    }

    @Override // me.oriient.ipssdk.api.models.IPSEntrance
    public double getY() {
        return this.y;
    }

    public final boolean isMain() {
        return this.isMain;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Entrance(entranceId='");
        sb.append(this.entranceId);
        sb.append("', entranceDescription='");
        sb.append(this.entranceDescription);
        sb.append("', isMain=");
        sb.append(this.isMain);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        return b.p(sb, this.y, ')');
    }
}
