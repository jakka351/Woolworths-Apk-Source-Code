package me.oriient.ipssdk.realtime.ips.proximity;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJV\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\r\"\u0004\b&\u0010#R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\r\"\u0004\b)\u0010#R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\r\"\u0004\b,\u0010#R\"\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\r\"\u0004\b/\u0010#R\"\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\r\"\u0004\b2\u0010#R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\r\"\u0004\b5\u0010#¨\u00066"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/ProximityMetadataImpl;", "Lme/oriient/internal/services/dataModel/proximity/ProximityMetadataProvider$ProximityMetadata;", "", "triggersCreated", "triggersTriggered", "triggersTriggeredUnique", "triggersTriggeredWalkingDistance", "triggersTriggeredCircle", "triggersTriggeredRectangle", "triggersTriggeredPolygon", "<init>", "(IIIIIII)V", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(IIIIIII)Lme/oriient/ipssdk/realtime/ips/proximity/ProximityMetadataImpl;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getTriggersCreated", "setTriggersCreated", "(I)V", "b", "getTriggersTriggered", "setTriggersTriggered", "c", "getTriggersTriggeredUnique", "setTriggersTriggeredUnique", "d", "getTriggersTriggeredWalkingDistance", "setTriggersTriggeredWalkingDistance", "e", "getTriggersTriggeredCircle", "setTriggersTriggeredCircle", "f", "getTriggersTriggeredRectangle", "setTriggersTriggeredRectangle", "g", "getTriggersTriggeredPolygon", "setTriggersTriggeredPolygon", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProximityMetadataImpl implements ProximityMetadataProvider.ProximityMetadata {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int triggersCreated;

    /* renamed from: b, reason: from kotlin metadata */
    private int triggersTriggered;

    /* renamed from: c, reason: from kotlin metadata */
    private int triggersTriggeredUnique;

    /* renamed from: d, reason: from kotlin metadata */
    private int triggersTriggeredWalkingDistance;

    /* renamed from: e, reason: from kotlin metadata */
    private int triggersTriggeredCircle;

    /* renamed from: f, reason: from kotlin metadata */
    private int triggersTriggeredRectangle;

    /* renamed from: g, reason: from kotlin metadata */
    private int triggersTriggeredPolygon;

    public ProximityMetadataImpl() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ ProximityMetadataImpl copy$default(ProximityMetadataImpl proximityMetadataImpl, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = proximityMetadataImpl.triggersCreated;
        }
        if ((i8 & 2) != 0) {
            i2 = proximityMetadataImpl.triggersTriggered;
        }
        if ((i8 & 4) != 0) {
            i3 = proximityMetadataImpl.triggersTriggeredUnique;
        }
        if ((i8 & 8) != 0) {
            i4 = proximityMetadataImpl.triggersTriggeredWalkingDistance;
        }
        if ((i8 & 16) != 0) {
            i5 = proximityMetadataImpl.triggersTriggeredCircle;
        }
        if ((i8 & 32) != 0) {
            i6 = proximityMetadataImpl.triggersTriggeredRectangle;
        }
        if ((i8 & 64) != 0) {
            i7 = proximityMetadataImpl.triggersTriggeredPolygon;
        }
        int i9 = i6;
        int i10 = i7;
        int i11 = i5;
        int i12 = i3;
        return proximityMetadataImpl.copy(i, i2, i12, i4, i11, i9, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTriggersCreated() {
        return this.triggersCreated;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTriggersTriggered() {
        return this.triggersTriggered;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTriggersTriggeredUnique() {
        return this.triggersTriggeredUnique;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTriggersTriggeredWalkingDistance() {
        return this.triggersTriggeredWalkingDistance;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTriggersTriggeredCircle() {
        return this.triggersTriggeredCircle;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTriggersTriggeredRectangle() {
        return this.triggersTriggeredRectangle;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTriggersTriggeredPolygon() {
        return this.triggersTriggeredPolygon;
    }

    @NotNull
    public final ProximityMetadataImpl copy(int triggersCreated, int triggersTriggered, int triggersTriggeredUnique, int triggersTriggeredWalkingDistance, int triggersTriggeredCircle, int triggersTriggeredRectangle, int triggersTriggeredPolygon) {
        return new ProximityMetadataImpl(triggersCreated, triggersTriggered, triggersTriggeredUnique, triggersTriggeredWalkingDistance, triggersTriggeredCircle, triggersTriggeredRectangle, triggersTriggeredPolygon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProximityMetadataImpl)) {
            return false;
        }
        ProximityMetadataImpl proximityMetadataImpl = (ProximityMetadataImpl) other;
        return this.triggersCreated == proximityMetadataImpl.triggersCreated && this.triggersTriggered == proximityMetadataImpl.triggersTriggered && this.triggersTriggeredUnique == proximityMetadataImpl.triggersTriggeredUnique && this.triggersTriggeredWalkingDistance == proximityMetadataImpl.triggersTriggeredWalkingDistance && this.triggersTriggeredCircle == proximityMetadataImpl.triggersTriggeredCircle && this.triggersTriggeredRectangle == proximityMetadataImpl.triggersTriggeredRectangle && this.triggersTriggeredPolygon == proximityMetadataImpl.triggersTriggeredPolygon;
    }

    @Override // me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider.ProximityMetadata
    public int getTriggersCreated() {
        return this.triggersCreated;
    }

    @Override // me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider.ProximityMetadata
    public int getTriggersTriggered() {
        return this.triggersTriggered;
    }

    @Override // me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider.ProximityMetadata
    public int getTriggersTriggeredCircle() {
        return this.triggersTriggeredCircle;
    }

    @Override // me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider.ProximityMetadata
    public int getTriggersTriggeredPolygon() {
        return this.triggersTriggeredPolygon;
    }

    @Override // me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider.ProximityMetadata
    public int getTriggersTriggeredRectangle() {
        return this.triggersTriggeredRectangle;
    }

    @Override // me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider.ProximityMetadata
    public int getTriggersTriggeredUnique() {
        return this.triggersTriggeredUnique;
    }

    @Override // me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider.ProximityMetadata
    public int getTriggersTriggeredWalkingDistance() {
        return this.triggersTriggeredWalkingDistance;
    }

    public int hashCode() {
        return Integer.hashCode(this.triggersTriggeredPolygon) + b.a(this.triggersTriggeredRectangle, b.a(this.triggersTriggeredCircle, b.a(this.triggersTriggeredWalkingDistance, b.a(this.triggersTriggeredUnique, b.a(this.triggersTriggered, Integer.hashCode(this.triggersCreated) * 31, 31), 31), 31), 31), 31);
    }

    public void setTriggersCreated(int i) {
        this.triggersCreated = i;
    }

    public void setTriggersTriggered(int i) {
        this.triggersTriggered = i;
    }

    public void setTriggersTriggeredCircle(int i) {
        this.triggersTriggeredCircle = i;
    }

    public void setTriggersTriggeredPolygon(int i) {
        this.triggersTriggeredPolygon = i;
    }

    public void setTriggersTriggeredRectangle(int i) {
        this.triggersTriggeredRectangle = i;
    }

    public void setTriggersTriggeredUnique(int i) {
        this.triggersTriggeredUnique = i;
    }

    public void setTriggersTriggeredWalkingDistance(int i) {
        this.triggersTriggeredWalkingDistance = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ProximityMetadataImpl(triggersCreated=");
        sb.append(this.triggersCreated);
        sb.append(", triggersTriggered=");
        sb.append(this.triggersTriggered);
        sb.append(", triggersTriggeredUnique=");
        sb.append(this.triggersTriggeredUnique);
        sb.append(", triggersTriggeredWalkingDistance=");
        sb.append(this.triggersTriggeredWalkingDistance);
        sb.append(", triggersTriggeredCircle=");
        sb.append(this.triggersTriggeredCircle);
        sb.append(", triggersTriggeredRectangle=");
        sb.append(this.triggersTriggeredRectangle);
        sb.append(", triggersTriggeredPolygon=");
        return YU.a.l(sb, this.triggersTriggeredPolygon, ')');
    }

    public ProximityMetadataImpl(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.triggersCreated = i;
        this.triggersTriggered = i2;
        this.triggersTriggeredUnique = i3;
        this.triggersTriggeredWalkingDistance = i4;
        this.triggersTriggeredCircle = i5;
        this.triggersTriggeredRectangle = i6;
        this.triggersTriggeredPolygon = i7;
    }

    public /* synthetic */ ProximityMetadataImpl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }
}
