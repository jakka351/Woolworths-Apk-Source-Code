package me.oriient.ipssdk.realtime.ips.proximity;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventOrigin;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\rJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/ProximityStatsManager;", "Lme/oriient/internal/services/dataModel/proximity/ProximityMetadataProvider;", "onEventTriggered", "", "origin", "Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventOrigin;", "isFirstTrigger", "", "eventShape", "Lme/oriient/ipssdk/realtime/ips/proximity/ProximityStatsManager$EventShape;", "onNewTriggersCount", "newValue", "", "EventShape", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ProximityStatsManager extends ProximityMetadataProvider {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/ProximityStatsManager$EventShape;", "", "(Ljava/lang/String;I)V", "CIRCLE", "RECTANGLE", "POLYGON", "WALKING_DISTANCE", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EventShape {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventShape[] $VALUES;
        public static final EventShape CIRCLE = new EventShape("CIRCLE", 0);
        public static final EventShape RECTANGLE = new EventShape("RECTANGLE", 1);
        public static final EventShape POLYGON = new EventShape("POLYGON", 2);
        public static final EventShape WALKING_DISTANCE = new EventShape("WALKING_DISTANCE", 3);

        private static final /* synthetic */ EventShape[] $values() {
            return new EventShape[]{CIRCLE, RECTANGLE, POLYGON, WALKING_DISTANCE};
        }

        static {
            EventShape[] eventShapeArr$values = $values();
            $VALUES = eventShapeArr$values;
            $ENTRIES = EnumEntriesKt.a(eventShapeArr$values);
        }

        private EventShape(String str, int i) {
        }

        @NotNull
        public static EnumEntries<EventShape> getEntries() {
            return $ENTRIES;
        }

        public static EventShape valueOf(String str) {
            return (EventShape) Enum.valueOf(EventShape.class, str);
        }

        public static EventShape[] values() {
            return (EventShape[]) $VALUES.clone();
        }
    }

    void onEventTriggered(@NotNull ProximityEventOrigin origin, boolean isFirstTrigger, @NotNull EventShape eventShape);

    void onNewTriggersCount(@NotNull ProximityEventOrigin origin, int newValue);
}
