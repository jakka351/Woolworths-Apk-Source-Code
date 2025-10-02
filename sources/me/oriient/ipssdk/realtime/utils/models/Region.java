package me.oriient.ipssdk.realtime.utils.models;

import androidx.camera.core.impl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.ipssdk.api.models.IPSRegion;
import me.oriient.ipssdk.api.models.IPSRegionPlacement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\fR\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013¨\u0006%"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/Region;", "Lme/oriient/ipssdk/api/models/IPSRegion;", "", "id", AppMeasurementSdk.ConditionalUserProperty.NAME, "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "reset", "()V", "getId", "()Ljava/lang/String;", "getName", "", "getType", "()I", "", "getTriggerIds", "()Ljava/util/List;", "getMetadata", "Lme/oriient/ipssdk/api/models/IPSRegionPlacement;", "getPlacements", "toString", "Lme/oriient/ipssdk/realtime/utils/models/RegionPlacementInBuilding;", "placements", "Ljava/util/List;", "", "Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", m.g, "", "isInside", "Z", "Lme/oriient/ipssdk/realtime/utils/models/TriggerEvent;", "getAllTriggersEvents", "allTriggersEvents", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Region implements IPSRegion {

    /* renamed from: a, reason: collision with root package name */
    private final String f26202a;
    private final String b;
    private final String c;
    private final List d;

    @JvmField
    public boolean isInside;

    @JvmField
    @NotNull
    public List<? extends RegionPlacementInBuilding> placements;

    @JvmField
    @NotNull
    public List<ProximityTrigger> triggers;

    public Region(@NotNull String id, @NotNull String name, @Nullable String str) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        this.f26202a = id;
        this.b = name;
        this.c = str;
        EmptyList emptyList = EmptyList.d;
        this.d = emptyList;
        this.placements = emptyList;
        this.triggers = new ArrayList();
    }

    @NotNull
    public final List<TriggerEvent> getAllTriggersEvents() {
        ArrayList arrayList = new ArrayList();
        Iterator<ProximityTrigger> it = this.triggers.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(it.next().m478getTriggerEvents(), arrayList);
        }
        return arrayList;
    }

    @Override // me.oriient.ipssdk.api.models.IPSContentItem
    @NotNull
    /* renamed from: getId, reason: from getter */
    public String getF26202a() {
        return this.f26202a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSContentItem
    @Nullable
    /* renamed from: getMetadata, reason: from getter */
    public String getC() {
        return this.c;
    }

    @Override // me.oriient.ipssdk.api.models.IPSContentItem
    @NotNull
    /* renamed from: getName, reason: from getter */
    public String getB() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRegion, me.oriient.ipssdk.api.models.IPSContentItem
    @NotNull
    public List<IPSRegionPlacement> getPlacements() {
        return this.placements;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRegion
    @NotNull
    public List<String> getTriggerIds() {
        List<ProximityTrigger> list = this.triggers;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProximityTrigger) it.next()).getF26200a());
        }
        return arrayList;
    }

    @Override // me.oriient.ipssdk.api.models.IPSContentItem
    public int getType() {
        return 2;
    }

    public final void reset() {
        this.isInside = false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Region{id='");
        sb.append(this.f26202a);
        sb.append("', name='");
        sb.append(this.b);
        sb.append("', metadata='");
        sb.append(this.c);
        sb.append("', triggerIds=");
        sb.append(this.d);
        sb.append(", placements=");
        sb.append(this.placements);
        sb.append(", triggers=");
        sb.append(this.triggers);
        sb.append(", isInside=");
        return b.s(sb, this.isInside, '}');
    }
}
