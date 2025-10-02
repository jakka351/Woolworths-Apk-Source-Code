package me.oriient.ipssdk.realtime.services.rest.responses;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.utils.models.ProximityTrigger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 32\u00020\u0001:\u0003234BG\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J9\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0006\u0010*\u001a\u00020\u001eJ&\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÁ\u0001¢\u0006\u0002\b1R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018¨\u00065"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/TriggerResponse;", "", "seen1", "", "triggerId", "", "triggerName", "triggerMetadata", "events", "", "Lme/oriient/ipssdk/realtime/services/rest/responses/TriggerEvent;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEvents", "()Ljava/util/List;", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getTriggerId", "()Ljava/lang/String;", "getTriggerMetadata", "getTriggerName", "addEventToTrigger", "", "trigger", "Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "event", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "toTrigger", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_realtime", "$serializer", "Companion", "EventType", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class TriggerResponse {

    @NotNull
    private final List<TriggerEvent> events;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final String triggerId;

    @Nullable
    private final String triggerMetadata;

    @NotNull
    private final String triggerName;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(TriggerEvent$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/TriggerResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/responses/TriggerResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<TriggerResponse> serializer() {
            return TriggerResponse$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/TriggerResponse$EventType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ENTER", "EXIT", "DWELL", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EventType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @NotNull
        private final String value;
        public static final EventType ENTER = new EventType("ENTER", 0, "enterRegion");
        public static final EventType EXIT = new EventType("EXIT", 1, "exitRegion");
        public static final EventType DWELL = new EventType("DWELL", 2, "dwellInRegion");

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{ENTER, EXIT, DWELL};
        }

        static {
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = EnumEntriesKt.a(eventTypeArr$values);
        }

        private EventType(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<EventType> getEntries() {
            return $ENTRIES;
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Deprecated
    public TriggerResponse(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.a(i, 11, TriggerResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.triggerId = str;
        this.triggerName = str2;
        if ((i & 4) == 0) {
            this.triggerMetadata = null;
        } else {
            this.triggerMetadata = str3;
        }
        this.events = list;
        this.logger = DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    private final void addEventToTrigger(ProximityTrigger trigger, TriggerEvent event) {
        String type = event.getType();
        if (Intrinsics.c(type, EventType.ENTER.getValue())) {
            trigger.addEnterEvent();
            return;
        }
        if (Intrinsics.c(type, EventType.EXIT.getValue())) {
            trigger.addExitEvent();
            return;
        }
        if (Intrinsics.c(type, EventType.DWELL.getValue())) {
            trigger.addDwellEvent(event.getMsTime());
            return;
        }
        getLogger().e("TriggerResponse", "addEventToTrigger: unknown trigger event " + event.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TriggerResponse copy$default(TriggerResponse triggerResponse, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = triggerResponse.triggerId;
        }
        if ((i & 2) != 0) {
            str2 = triggerResponse.triggerName;
        }
        if ((i & 4) != 0) {
            str3 = triggerResponse.triggerMetadata;
        }
        if ((i & 8) != 0) {
            list = triggerResponse.events;
        }
        return triggerResponse.copy(str, str2, str3, list);
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_realtime(TriggerResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.triggerId);
        output.p(serialDesc, 1, self.triggerName);
        if (output.q(serialDesc, 2) || self.triggerMetadata != null) {
            output.w(serialDesc, 2, StringSerializer.f24821a, self.triggerMetadata);
        }
        output.F(serialDesc, 3, kSerializerArr[3], self.events);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTriggerId() {
        return this.triggerId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTriggerName() {
        return this.triggerName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTriggerMetadata() {
        return this.triggerMetadata;
    }

    @NotNull
    public final List<TriggerEvent> component4() {
        return this.events;
    }

    @NotNull
    public final TriggerResponse copy(@NotNull String triggerId, @NotNull String triggerName, @Nullable String triggerMetadata, @NotNull List<TriggerEvent> events) {
        Intrinsics.h(triggerId, "triggerId");
        Intrinsics.h(triggerName, "triggerName");
        Intrinsics.h(events, "events");
        return new TriggerResponse(triggerId, triggerName, triggerMetadata, events);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggerResponse)) {
            return false;
        }
        TriggerResponse triggerResponse = (TriggerResponse) other;
        return Intrinsics.c(this.triggerId, triggerResponse.triggerId) && Intrinsics.c(this.triggerName, triggerResponse.triggerName) && Intrinsics.c(this.triggerMetadata, triggerResponse.triggerMetadata) && Intrinsics.c(this.events, triggerResponse.events);
    }

    @NotNull
    public final List<TriggerEvent> getEvents() {
        return this.events;
    }

    @NotNull
    public final String getTriggerId() {
        return this.triggerId;
    }

    @Nullable
    public final String getTriggerMetadata() {
        return this.triggerMetadata;
    }

    @NotNull
    public final String getTriggerName() {
        return this.triggerName;
    }

    public int hashCode() {
        int iC = b.c(this.triggerId.hashCode() * 31, 31, this.triggerName);
        String str = this.triggerMetadata;
        return this.events.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TriggerResponse(triggerId=");
        sb.append(this.triggerId);
        sb.append(", triggerName=");
        sb.append(this.triggerName);
        sb.append(", triggerMetadata=");
        sb.append(this.triggerMetadata);
        sb.append(", events=");
        return a.o(sb, this.events, ')');
    }

    @NotNull
    public final ProximityTrigger toTrigger() {
        ProximityTrigger proximityTrigger = new ProximityTrigger(this.triggerId, this.triggerName, this.triggerMetadata);
        Iterator<TriggerEvent> it = this.events.iterator();
        while (it.hasNext()) {
            addEventToTrigger(proximityTrigger, it.next());
        }
        return proximityTrigger;
    }

    public TriggerResponse(@NotNull String triggerId, @NotNull String triggerName, @Nullable String str, @NotNull List<TriggerEvent> events) {
        Intrinsics.h(triggerId, "triggerId");
        Intrinsics.h(triggerName, "triggerName");
        Intrinsics.h(events, "events");
        this.triggerId = triggerId;
        this.triggerName = triggerName;
        this.triggerMetadata = str;
        this.events = events;
        this.logger = DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    public /* synthetic */ TriggerResponse(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, list);
    }
}
