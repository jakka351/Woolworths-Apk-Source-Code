package au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao;

import androidx.room.Entity;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/SyncMetadataEntity;", "", "ResourceType", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SyncMetadataEntity {

    /* renamed from: a, reason: collision with root package name */
    public final String f8419a;
    public final Instant b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/SyncMetadataEntity$ResourceType;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResourceType {
        public static final ResourceType d;
        public static final /* synthetic */ ResourceType[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            ResourceType resourceType = new ResourceType("InboxMessages", 0);
            d = resourceType;
            ResourceType[] resourceTypeArr = {resourceType};
            e = resourceTypeArr;
            f = EnumEntriesKt.a(resourceTypeArr);
        }

        public static ResourceType valueOf(String str) {
            return (ResourceType) Enum.valueOf(ResourceType.class, str);
        }

        public static ResourceType[] values() {
            return (ResourceType[]) e.clone();
        }
    }

    public SyncMetadataEntity(String userId, Instant instant) {
        ResourceType resourceType = ResourceType.d;
        Intrinsics.h(userId, "userId");
        this.f8419a = userId;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncMetadataEntity)) {
            return false;
        }
        SyncMetadataEntity syncMetadataEntity = (SyncMetadataEntity) obj;
        if (!Intrinsics.c(this.f8419a, syncMetadataEntity.f8419a)) {
            return false;
        }
        ResourceType resourceType = ResourceType.d;
        return this.b.equals(syncMetadataEntity.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((ResourceType.d.hashCode() + (this.f8419a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SyncMetadataEntity(userId=" + this.f8419a + ", resourceType=" + ResourceType.d + ", lastSyncTime=" + this.b + ")";
    }
}
