package au.com.woolworths.rewards.wearos.base;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract;", "", "CardTransferData", "RedemptionTransferData", "BenefitsData", "CardData", "ValueCardData", "PointsData", "Companion", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WearAppContract {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$BenefitsData;", "", "Companion", "$serializer", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class BenefitsData {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final ValueCardData f9974a;
        public final PointsData b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$BenefitsData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/wearos/base/WearAppContract$BenefitsData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<BenefitsData> serializer() {
                return WearAppContract$BenefitsData$$serializer.f9968a;
            }
        }

        public /* synthetic */ BenefitsData(int i, ValueCardData valueCardData, PointsData pointsData) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, WearAppContract$BenefitsData$$serializer.f9968a.getB());
                throw null;
            }
            this.f9974a = valueCardData;
            this.b = pointsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BenefitsData)) {
                return false;
            }
            BenefitsData benefitsData = (BenefitsData) obj;
            return Intrinsics.c(this.f9974a, benefitsData.f9974a) && Intrinsics.c(this.b, benefitsData.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9974a.hashCode() * 31);
        }

        public final String toString() {
            return "BenefitsData(redemption=" + this.f9974a + ", points=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$CardData;", "", "Companion", "$serializer", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CardData {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f9975a;
        public final String b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$CardData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/wearos/base/WearAppContract$CardData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<CardData> serializer() {
                return WearAppContract$CardData$$serializer.f9969a;
            }
        }

        public /* synthetic */ CardData(int i, String str, String str2) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, WearAppContract$CardData$$serializer.f9969a.getB());
                throw null;
            }
            this.f9975a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardData)) {
                return false;
            }
            CardData cardData = (CardData) obj;
            return Intrinsics.c(this.f9975a, cardData.f9975a) && Intrinsics.c(this.b, cardData.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9975a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("CardData(cardNumber=", this.f9975a, ", cardNumberDisplay=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$CardTransferData;", "", "Companion", "$serializer", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CardTransferData {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final CardData f9976a;
        public final String b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$CardTransferData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/wearos/base/WearAppContract$CardTransferData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<CardTransferData> serializer() {
                return WearAppContract$CardTransferData$$serializer.f9970a;
            }
        }

        public /* synthetic */ CardTransferData(int i, CardData cardData, String str) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.a(i, 1, WearAppContract$CardTransferData$$serializer.f9970a.getB());
                throw null;
            }
            this.f9976a = cardData;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardTransferData)) {
                return false;
            }
            CardTransferData cardTransferData = (CardTransferData) obj;
            return Intrinsics.c(this.f9976a, cardTransferData.f9976a) && Intrinsics.c(this.b, cardTransferData.b);
        }

        public final int hashCode() {
            CardData cardData = this.f9976a;
            int iHashCode = (cardData == null ? 0 : cardData.hashCode()) * 31;
            String str = this.b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "CardTransferData(rewardsCard=" + this.f9976a + ", message=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$Companion;", "", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$PointsData;", "", "Companion", "$serializer", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PointsData {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f9977a;
        public final String b;
        public final int c;
        public final int d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$PointsData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/wearos/base/WearAppContract$PointsData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<PointsData> serializer() {
                return WearAppContract$PointsData$$serializer.f9971a;
            }
        }

        public /* synthetic */ PointsData(int i, int i2, int i3, String str, String str2) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.a(i, 15, WearAppContract$PointsData$$serializer.f9971a.getB());
                throw null;
            }
            this.f9977a = str;
            this.b = str2;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PointsData)) {
                return false;
            }
            PointsData pointsData = (PointsData) obj;
            return Intrinsics.c(this.f9977a, pointsData.f9977a) && Intrinsics.c(this.b, pointsData.b) && this.c == pointsData.c && this.d == pointsData.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + b.a(this.c, b.c(this.f9977a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.i(this.c, this.d, ", goalBalance=", ")", a.v("PointsData(label=", this.f9977a, ", value=", this.b, ", currentBalance="));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$RedemptionTransferData;", "", "Companion", "$serializer", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RedemptionTransferData {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f9978a;
        public final BenefitsData b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$RedemptionTransferData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/wearos/base/WearAppContract$RedemptionTransferData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<RedemptionTransferData> serializer() {
                return WearAppContract$RedemptionTransferData$$serializer.f9972a;
            }
        }

        public /* synthetic */ RedemptionTransferData(int i, String str, BenefitsData benefitsData) {
            if ((i & 1) == 0) {
                this.f9978a = null;
            } else {
                this.f9978a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = benefitsData;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RedemptionTransferData)) {
                return false;
            }
            RedemptionTransferData redemptionTransferData = (RedemptionTransferData) obj;
            return Intrinsics.c(this.f9978a, redemptionTransferData.f9978a) && Intrinsics.c(this.b, redemptionTransferData.b);
        }

        public final int hashCode() {
            String str = this.f9978a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            BenefitsData benefitsData = this.b;
            return iHashCode + (benefitsData != null ? benefitsData.hashCode() : 0);
        }

        public final String toString() {
            return "RedemptionTransferData(message=" + this.f9978a + ", benefitsData=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$ValueCardData;", "", "Companion", "$serializer", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ValueCardData {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f9979a;
        public final String b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/wearos/base/WearAppContract$ValueCardData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/wearos/base/WearAppContract$ValueCardData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<ValueCardData> serializer() {
                return WearAppContract$ValueCardData$$serializer.f9973a;
            }
        }

        public /* synthetic */ ValueCardData(int i, String str, String str2) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, WearAppContract$ValueCardData$$serializer.f9973a.getB());
                throw null;
            }
            this.f9979a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValueCardData)) {
                return false;
            }
            ValueCardData valueCardData = (ValueCardData) obj;
            return Intrinsics.c(this.f9979a, valueCardData.f9979a) && Intrinsics.c(this.b, valueCardData.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9979a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("ValueCardData(label=", this.f9979a, ", value=", this.b, ")");
        }
    }
}
