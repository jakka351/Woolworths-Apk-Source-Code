package me.oriient.ipssdk.realtime.utils.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSRegion;
import me.oriient.ipssdk.api.models.IPSRegionAttachment;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/RegionAttachment;", "Lme/oriient/ipssdk/api/models/IPSRegionAttachment;", "", "id", "", "clientCategory", "Lme/oriient/ipssdk/realtime/utils/models/Region;", "attachedToRegion", "<init>", "(Ljava/lang/String;ILme/oriient/ipssdk/realtime/utils/models/Region;)V", "getId", "()Ljava/lang/String;", "getClientCategory", "()I", "Lme/oriient/ipssdk/api/models/IPSRegion;", "getAttachedToRegion", "()Lme/oriient/ipssdk/api/models/IPSRegion;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RegionAttachment implements IPSRegionAttachment {

    /* renamed from: a, reason: collision with root package name */
    private final String f26203a;
    private final int b;
    private final Region c;

    public RegionAttachment(@NotNull String id, int i, @NotNull Region attachedToRegion) {
        Intrinsics.h(id, "id");
        Intrinsics.h(attachedToRegion, "attachedToRegion");
        this.f26203a = id;
        this.b = i;
        this.c = attachedToRegion;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRegionAttachment
    @NotNull
    public IPSRegion getAttachedToRegion() {
        return this.c;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRegionAttachment
    /* renamed from: getClientCategory, reason: from getter */
    public int getB() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRegionAttachment
    @NotNull
    /* renamed from: getId, reason: from getter */
    public String getF26203a() {
        return this.f26203a;
    }
}
