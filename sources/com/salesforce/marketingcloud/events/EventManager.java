package com.salesforce.marketingcloud.events;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MCKeep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \n2\u00020\u0001:\u0002\t\nB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H'¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/salesforce/marketingcloud/events/EventManager;", "", "()V", "track", "", "events", "", "Lcom/salesforce/marketingcloud/events/Event;", "([Lcom/salesforce/marketingcloud/events/Event;)V", "AuthEventType", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EventManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = com.salesforce.marketingcloud.g.a("EventManager");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/salesforce/marketingcloud/events/EventManager$AuthEventType;", "", "(Ljava/lang/String;I)V", "LOGIN", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AuthEventType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AuthEventType[] $VALUES;
        public static final AuthEventType LOGIN = new AuthEventType("LOGIN", 0);

        private static final /* synthetic */ AuthEventType[] $values() {
            return new AuthEventType[]{LOGIN};
        }

        static {
            AuthEventType[] authEventTypeArr$values = $values();
            $VALUES = authEventTypeArr$values;
            $ENTRIES = EnumEntriesKt.a(authEventTypeArr$values);
        }

        private AuthEventType(String str, int i) {
        }

        @NotNull
        public static EnumEntries<AuthEventType> getEntries() {
            return $ENTRIES;
        }

        public static AuthEventType valueOf(String str) {
            return (AuthEventType) Enum.valueOf(AuthEventType.class, str);
        }

        public static AuthEventType[] values() {
            return (AuthEventType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/salesforce/marketingcloud/events/EventManager$Companion;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", k.a.h, "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "producer", "Lcom/salesforce/marketingcloud/events/Event;", "customEvent", "input", "a", "(Ljava/lang/String;)Ljava/lang/String;", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class Companion {

        public static final class a extends Lambda implements Function0<String> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f16875a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.f16875a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return YU.a.g(this.f16875a, " contains a \".\" and will be dropped.");
            }
        }

        public static final class b extends Lambda implements Function0<String> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f16876a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(0);
                this.f16876a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return YU.a.g(this.f16876a, " is null, blank, starts with a \"$\", or contains a line break and will be dropped.");
            }
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Event a(Companion companion, String str, Map map, Event.Producer producer, int i, Object obj) {
            if ((i & 2) != 0) {
                map = EmptyMap.d;
            }
            if ((i & 4) != 0) {
                producer = Event.Producer.PUSH;
            }
            return companion.customEvent(str, map, producer);
        }

        @Nullable
        public final String b(@NotNull String input) {
            Intrinsics.h(input, "input");
            String string = StringsKt.k0(input).toString();
            if (!StringsKt.D(string) && !StringsKt.W(string, "$", false) && !StringsKt.o(string, "\n", false) && !StringsKt.o(string, "\r", false)) {
                return string;
            }
            com.salesforce.marketingcloud.g.e(com.salesforce.marketingcloud.g.f16896a, EventManager.TAG, null, new b(input), 2, null);
            return null;
        }

        @MCKeep
        @JvmStatic
        @Nullable
        public final Event customEvent(@NotNull String name) {
            Intrinsics.h(name, "name");
            return customEvent(name, EmptyMap.d, Event.Producer.PUSH);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String a(@NotNull String input) {
            Intrinsics.h(input, "input");
            if (!StringsKt.o(input, ".", false)) {
                return b(input);
            }
            com.salesforce.marketingcloud.g.e(com.salesforce.marketingcloud.g.f16896a, EventManager.TAG, null, new a(input), 2, null);
            return null;
        }

        @MCKeep
        @JvmStatic
        @Nullable
        public final Event customEvent(@NotNull String name, @NotNull Map<String, ? extends Object> attributes) {
            Intrinsics.h(name, "name");
            Intrinsics.h(attributes, "attributes");
            return customEvent(name, attributes, Event.Producer.PUSH);
        }

        @MCKeep
        @JvmStatic
        @Nullable
        public final Event customEvent(@NotNull String name, @NotNull Map<String, ? extends Object> attributes, @NotNull Event.Producer producer) {
            Intrinsics.h(name, "name");
            Intrinsics.h(attributes, "attributes");
            Intrinsics.h(producer, "producer");
            String strB = b(name);
            if (strB == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : attributes.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String strA = EventManager.INSTANCE.a(key);
                if (strA != null) {
                    linkedHashMap.put(strA, value);
                }
            }
            return new com.salesforce.marketingcloud.events.b(strB, linkedHashMap, producer);
        }
    }

    @MCKeep
    @JvmStatic
    @Nullable
    public static final Event customEvent(@NotNull String str) {
        return INSTANCE.customEvent(str);
    }

    @Deprecated
    public abstract void track(@NotNull Event... events);

    @MCKeep
    @JvmStatic
    @Nullable
    public static final Event customEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        return INSTANCE.customEvent(str, map);
    }

    @MCKeep
    @JvmStatic
    @Nullable
    public static final Event customEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull Event.Producer producer) {
        return INSTANCE.customEvent(str, map, producer);
    }
}
