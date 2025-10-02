package au.com.woolworths.foundation.rewards.servicemessages;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.feature.shop.bundles.ui.a;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0002¨\u0006\r"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage;", "", "Companion", "ActionButton", "ScreenType", "OutageType", "ScreenTypeSafeSerializer", "OutageTypeSafeSerializer", "ScreenTypeSafeListSerializer", "DateSerializer", "RegionListSerializer", "RegionSafeSerializer", "$serializer", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class RewardsServiceMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {LazyKt.a(LazyThreadSafetyMode.d, new a(20)), null, null, null, null, null, null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public final InlineErrorType f8645a;
    public final String b;
    public final String c;
    public final ActionButton d;
    public final String e;
    public final List f;
    public final ZonedDateTime g;
    public final ZonedDateTime h;
    public final OutageType i;
    public final List j;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$ActionButton;", "", "Companion", "$serializer", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ActionButton {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f8648a;
        public final String b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$ActionButton$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$ActionButton;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<ActionButton> serializer() {
                return RewardsServiceMessage$ActionButton$$serializer.f8647a;
            }
        }

        public /* synthetic */ ActionButton(int i, String str, String str2) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.a(i, 1, RewardsServiceMessage$ActionButton$$serializer.f8647a.getDescriptor());
                throw null;
            }
            this.f8648a = str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) obj;
            return Intrinsics.c(this.f8648a, actionButton.f8648a) && Intrinsics.c(this.b, actionButton.b);
        }

        public final int hashCode() {
            int iHashCode = this.f8648a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("ActionButton(label=", this.f8648a, ", url=", this.b, ")");
        }

        public ActionButton(String str, String str2) {
            this.f8648a = str;
            this.b = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RewardsServiceMessage> serializer() {
            return RewardsServiceMessage$$serializer.f8646a;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$DateSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/time/ZonedDateTime;", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DateSerializer implements KSerializer<ZonedDateTime> {

        /* renamed from: a, reason: collision with root package name */
        public static final DateSerializer f8649a = new DateSerializer();
        public static final PrimitiveSerialDescriptor b = SerialDescriptorsKt.a("Date");

        @Override // kotlinx.serialization.DeserializationStrategy
        public final Object deserialize(Decoder decoder) {
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(decoder.p(), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            Intrinsics.g(zonedDateTime, "parse(...)");
            return zonedDateTime;
        }

        @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(Encoder encoder, Object obj) {
            ZonedDateTime value = (ZonedDateTime) obj;
            Intrinsics.h(value, "value");
            String str = value.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            Intrinsics.g(str, "format(...)");
            encoder.u(str);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$OutageType;", "", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OutageType {
        public static final OutageType d;
        public static final OutageType e;
        public static final /* synthetic */ OutageType[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            OutageType outageType = new OutageType("FULL", 0);
            d = outageType;
            OutageType outageType2 = new OutageType("PARTIAL", 1);
            e = outageType2;
            OutageType[] outageTypeArr = {outageType, outageType2};
            f = outageTypeArr;
            g = EnumEntriesKt.a(outageTypeArr);
        }

        public static OutageType valueOf(String str) {
            return (OutageType) Enum.valueOf(OutageType.class, str);
        }

        public static OutageType[] values() {
            return (OutageType[]) f.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$OutageTypeSafeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$OutageType;", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OutageTypeSafeSerializer implements KSerializer<OutageType> {

        /* renamed from: a, reason: collision with root package name */
        public static final OutageTypeSafeSerializer f8650a = new OutageTypeSafeSerializer();
        public static final PrimitiveSerialDescriptor b = SerialDescriptorsKt.a("OutageType");

        @Override // kotlinx.serialization.DeserializationStrategy
        public final Object deserialize(Decoder decoder) {
            try {
                String upperCase = decoder.p().toUpperCase(Locale.ROOT);
                Intrinsics.g(upperCase, "toUpperCase(...)");
                return OutageType.valueOf(upperCase);
            } catch (Exception unused) {
                return OutageType.e;
            }
        }

        @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(Encoder encoder, Object obj) {
            OutageType value = (OutageType) obj;
            Intrinsics.h(value, "value");
            encoder.u(value.name());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$RegionListSerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lau/com/woolworths/android/onesite/modules/common/Region;", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RegionListSerializer implements KSerializer<List<? extends Region>> {

        /* renamed from: a, reason: collision with root package name */
        public static final RegionListSerializer f8651a = new RegionListSerializer();
        public static final ArrayListSerializer b;
        public static final SerialDescriptor c;

        static {
            ArrayListSerializer arrayListSerializerB = BuiltinSerializersKt.b(RegionSafeSerializer.f8652a);
            b = arrayListSerializerB;
            c = arrayListSerializerB.b;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final Object deserialize(Decoder decoder) {
            return CollectionsKt.B((Iterable) decoder.E(b));
        }

        @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return c;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(Encoder encoder, Object obj) {
            List value = (List) obj;
            Intrinsics.h(value, "value");
            encoder.e(b, value);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$RegionSafeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/android/onesite/modules/common/Region;", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RegionSafeSerializer implements KSerializer<Region> {

        /* renamed from: a, reason: collision with root package name */
        public static final RegionSafeSerializer f8652a = new RegionSafeSerializer();
        public static final PrimitiveSerialDescriptor b = SerialDescriptorsKt.a("Region");

        @Override // kotlinx.serialization.DeserializationStrategy
        public final Object deserialize(Decoder decoder) {
            Region.Companion companion = Region.h;
            String strP = decoder.p();
            companion.getClass();
            Region regionA = Region.Companion.a(strP);
            return regionA == null ? Region.i : regionA;
        }

        @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(Encoder encoder, Object obj) {
            Region region = (Region) obj;
            if (region != null) {
                encoder.u(region.name());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$ScreenType;", "", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScreenType {
        public static final ScreenType d;
        public static final ScreenType e;
        public static final ScreenType f;
        public static final ScreenType g;
        public static final ScreenType h;
        public static final ScreenType i;
        public static final /* synthetic */ ScreenType[] j;
        public static final /* synthetic */ EnumEntries k;

        static {
            ScreenType screenType = new ScreenType("EDX_BENEFITS", 0);
            d = screenType;
            ScreenType screenType2 = new ScreenType("EDX_SIGNUP", 1);
            e = screenType2;
            ScreenType screenType3 = new ScreenType("HOME", 2);
            f = screenType3;
            ScreenType screenType4 = new ScreenType("DISCOVER", 3);
            g = screenType4;
            ScreenType screenType5 = new ScreenType("ACTIVITY", 4);
            h = screenType5;
            ScreenType screenType6 = new ScreenType("VALUE_DASHBOARD", 5);
            i = screenType6;
            ScreenType[] screenTypeArr = {screenType, screenType2, screenType3, screenType4, screenType5, screenType6};
            j = screenTypeArr;
            k = EnumEntriesKt.a(screenTypeArr);
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) j.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$ScreenTypeSafeListSerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$ScreenType;", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScreenTypeSafeListSerializer implements KSerializer<List<? extends ScreenType>> {

        /* renamed from: a, reason: collision with root package name */
        public static final ScreenTypeSafeListSerializer f8653a = new ScreenTypeSafeListSerializer();
        public static final ArrayListSerializer b;
        public static final SerialDescriptor c;

        static {
            ArrayListSerializer arrayListSerializerB = BuiltinSerializersKt.b(ScreenTypeSafeSerializer.f8654a);
            b = arrayListSerializerB;
            c = arrayListSerializerB.b;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final Object deserialize(Decoder decoder) {
            return CollectionsKt.B((Iterable) decoder.E(b));
        }

        @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return c;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(Encoder encoder, Object obj) {
            List value = (List) obj;
            Intrinsics.h(value, "value");
            encoder.e(b, value);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$ScreenTypeSafeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage$ScreenType;", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScreenTypeSafeSerializer implements KSerializer<ScreenType> {

        /* renamed from: a, reason: collision with root package name */
        public static final ScreenTypeSafeSerializer f8654a = new ScreenTypeSafeSerializer();
        public static final PrimitiveSerialDescriptor b = SerialDescriptorsKt.a("ScreenType");

        @Override // kotlinx.serialization.DeserializationStrategy
        public final Object deserialize(Decoder decoder) {
            try {
                return ScreenType.valueOf(decoder.p());
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(Encoder encoder, Object obj) {
            ScreenType screenType = (ScreenType) obj;
            if (screenType != null) {
                encoder.u(screenType.name());
            }
        }
    }

    public /* synthetic */ RewardsServiceMessage(int i, InlineErrorType inlineErrorType, String str, String str2, ActionButton actionButton, String str3, List list, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, OutageType outageType, List list2) {
        if (999 != (i & 999)) {
            PluginExceptionsKt.a(i, 999, RewardsServiceMessage$$serializer.f8646a.getDescriptor());
            throw null;
        }
        this.f8645a = inlineErrorType;
        this.b = str;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = actionButton;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        this.f = list;
        this.g = zonedDateTime;
        this.h = zonedDateTime2;
        this.i = outageType;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsServiceMessage)) {
            return false;
        }
        RewardsServiceMessage rewardsServiceMessage = (RewardsServiceMessage) obj;
        return this.f8645a == rewardsServiceMessage.f8645a && Intrinsics.c(this.b, rewardsServiceMessage.b) && Intrinsics.c(this.c, rewardsServiceMessage.c) && Intrinsics.c(this.d, rewardsServiceMessage.d) && Intrinsics.c(this.e, rewardsServiceMessage.e) && Intrinsics.c(this.f, rewardsServiceMessage.f) && Intrinsics.c(this.g, rewardsServiceMessage.g) && Intrinsics.c(this.h, rewardsServiceMessage.h) && this.i == rewardsServiceMessage.i && Intrinsics.c(this.j, rewardsServiceMessage.j);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f8645a.hashCode() * 31, 31, this.b), 31, this.c);
        ActionButton actionButton = this.d;
        int iHashCode = (iC + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        String str = this.e;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + b.d((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardsServiceMessage(type=");
        sb.append(this.f8645a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append(this.c);
        sb.append(", actionButton=");
        sb.append(this.d);
        sb.append(", coreIconName=");
        au.com.woolworths.android.onesite.a.B(sb, this.e, ", screenTypes=", this.f, ", startDate=");
        sb.append(this.g);
        sb.append(", endDate=");
        sb.append(this.h);
        sb.append(", outageType=");
        sb.append(this.i);
        sb.append(", targetApps=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public RewardsServiceMessage(InlineErrorType inlineErrorType, String str, String str2, ActionButton actionButton, String str3, List list, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, OutageType outageType, List list2) {
        this.f8645a = inlineErrorType;
        this.b = str;
        this.c = str2;
        this.d = actionButton;
        this.e = str3;
        this.f = list;
        this.g = zonedDateTime;
        this.h = zonedDateTime2;
        this.i = outageType;
        this.j = list2;
    }
}
