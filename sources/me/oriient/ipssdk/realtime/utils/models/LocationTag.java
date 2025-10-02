package me.oriient.ipssdk.realtime.utils.models;

import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSLocationTag;
import me.oriient.ipssdk.api.models.IPSPlacement;
import me.oriient.ipssdk.api.models.IPSRegionAttachment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/LocationTag;", "Lme/oriient/ipssdk/api/models/IPSLocationTag;", "", "id", AppMeasurementSdk.ConditionalUserProperty.NAME, lqlqqlq.mmm006Dm006Dm, "imageUrl", "metadata", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "coordinate", "", "Lme/oriient/ipssdk/realtime/utils/models/PlacementInBuilding;", "placements", "Lme/oriient/ipssdk/realtime/utils/models/RegionAttachment;", "regionAttachments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/realtime/utils/models/Coordinate;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "", "getType", "()I", "getDescription", "getImageUrl", "Lme/oriient/ipssdk/api/models/IPSRegionAttachment;", "getRegionAttachments", "()Ljava/util/List;", "getMetadata", "Lme/oriient/ipssdk/api/models/IPSPlacement;", "getPlacements", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "getCoordinate", "()Lme/oriient/ipssdk/api/models/IPSCoordinate;", "toString", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LocationTag implements IPSLocationTag {

    /* renamed from: a, reason: collision with root package name */
    private final String f26196a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Coordinate f;
    private final List g;
    private final List h;

    public LocationTag(@NotNull String id, @NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Coordinate coordinate, @NotNull List<? extends PlacementInBuilding> placements, @NotNull List<RegionAttachment> regionAttachments) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(placements, "placements");
        Intrinsics.h(regionAttachments, "regionAttachments");
        this.f26196a = id;
        this.b = name;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = coordinate;
        this.g = placements;
        this.h = regionAttachments;
    }

    @Nullable
    public final IPSCoordinate getCoordinate() {
        return this.f;
    }

    @Override // me.oriient.ipssdk.api.models.IPSLocationTag
    @Nullable
    /* renamed from: getDescription, reason: from getter */
    public String getC() {
        return this.c;
    }

    @Override // me.oriient.ipssdk.api.models.IPSContentItem
    @NotNull
    /* renamed from: getId, reason: from getter */
    public String getF26196a() {
        return this.f26196a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSLocationTag
    @Nullable
    /* renamed from: getImageUrl, reason: from getter */
    public String getD() {
        return this.d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSContentItem
    @Nullable
    /* renamed from: getMetadata, reason: from getter */
    public String getE() {
        return this.e;
    }

    @Override // me.oriient.ipssdk.api.models.IPSContentItem
    @NotNull
    /* renamed from: getName, reason: from getter */
    public String getB() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.api.models.IPSContentItem
    @NotNull
    public List<IPSPlacement> getPlacements() {
        return this.g;
    }

    @Override // me.oriient.ipssdk.api.models.IPSLocationTag
    @NotNull
    public List<IPSRegionAttachment> getRegionAttachments() {
        return this.h;
    }

    @Override // me.oriient.ipssdk.api.models.IPSContentItem
    public int getType() {
        return 0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LocationTag{id='");
        sb.append(this.f26196a);
        sb.append("', name='");
        sb.append(this.b);
        sb.append("', description='");
        sb.append(this.c);
        sb.append("', imageUrl='");
        sb.append(this.d);
        sb.append("', metadata='");
        sb.append(this.e);
        sb.append("', coordinate=");
        sb.append(this.f);
        sb.append(", placements=");
        return a.o(sb, this.g, '}');
    }

    public /* synthetic */ LocationTag(String str, String str2, String str3, String str4, String str5, Coordinate coordinate, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, coordinate, (i & 64) != 0 ? new ArrayList() : list, (i & 128) != 0 ? new ArrayList() : list2);
    }
}
