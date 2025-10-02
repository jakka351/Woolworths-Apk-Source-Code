package au.com.woolworths.rewards.base.coachmark.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000f2\u00020\u0001:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "", "id", "", "getId", "()Ljava/lang/String;", "OfferList", "Redemption", "Fuel", "Card", "Redemption2024", "SubscriberInHeader", "CardInHeader", "BoosterHeader", "Dynamic", "Companion", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$BoosterHeader;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Card;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$CardInHeader;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Dynamic;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Fuel;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$OfferList;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Redemption;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Redemption2024;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$SubscriberInHeader;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HomeCoachMarkElement {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$BoosterHeader;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoosterHeader implements HomeCoachMarkElement {
        public static final int $stable = 0;

        @NotNull
        public static final BoosterHeader INSTANCE = new BoosterHeader();

        @NotNull
        private static final String id = "booster_header";

        private BoosterHeader() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof BoosterHeader);
        }

        @Override // au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement
        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return -243313894;
        }

        @NotNull
        public String toString() {
            return "BoosterHeader";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Card;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card implements HomeCoachMarkElement {
        public static final int $stable = 0;

        @NotNull
        public static final Card INSTANCE = new Card();

        @NotNull
        private static final String id = "card";

        private Card() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Card);
        }

        @Override // au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement
        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return -793083501;
        }

        @NotNull
        public String toString() {
            return "Card";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$CardInHeader;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CardInHeader implements HomeCoachMarkElement {
        public static final int $stable = 0;

        @NotNull
        public static final CardInHeader INSTANCE = new CardInHeader();

        @NotNull
        private static final String id = "card_home_header";

        private CardInHeader() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof CardInHeader);
        }

        @Override // au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement
        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return -256749883;
        }

        @NotNull
        public String toString() {
            return "CardInHeader";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Companion;", "", "<init>", "()V", "Locals", "", "", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "nonQuickLinks", "from", "id", "isQuickLink", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Map<String, HomeCoachMarkElement> Locals;

        @NotNull
        private static final Map<String, HomeCoachMarkElement> nonQuickLinks;

        static {
            List listR = CollectionsKt.R(OfferList.INSTANCE, Redemption.INSTANCE, Fuel.INSTANCE, Card.INSTANCE, Redemption2024.INSTANCE, SubscriberInHeader.INSTANCE);
            int iH = MapsKt.h(CollectionsKt.s(listR, 10));
            if (iH < 16) {
                iH = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
            for (Object obj : listR) {
                linkedHashMap.put(((HomeCoachMarkElement) obj).getId(), obj);
            }
            Locals = linkedHashMap;
            List listR2 = CollectionsKt.R(OfferList.INSTANCE, Redemption.INSTANCE, Redemption2024.INSTANCE, SubscriberInHeader.INSTANCE);
            int iH2 = MapsKt.h(CollectionsKt.s(listR2, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH2 >= 16 ? iH2 : 16);
            for (Object obj2 : listR2) {
                linkedHashMap2.put(((HomeCoachMarkElement) obj2).getId(), obj2);
            }
            nonQuickLinks = linkedHashMap2;
        }

        private Companion() {
        }

        @NotNull
        public final HomeCoachMarkElement from(@NotNull String id) {
            Intrinsics.h(id, "id");
            HomeCoachMarkElement homeCoachMarkElement = Locals.get(id);
            return homeCoachMarkElement == null ? new Dynamic(id) : homeCoachMarkElement;
        }

        public final boolean isQuickLink(@NotNull String id) {
            Intrinsics.h(id, "id");
            return !nonQuickLinks.containsKey(id);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Dynamic;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Dynamic implements HomeCoachMarkElement {
        public static final int $stable = 0;

        @NotNull
        private final String id;

        public Dynamic(@NotNull String id) {
            Intrinsics.h(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Dynamic copy$default(Dynamic dynamic, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dynamic.id;
            }
            return dynamic.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Dynamic copy(@NotNull String id) {
            Intrinsics.h(id, "id");
            return new Dynamic(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dynamic) && Intrinsics.c(this.id, ((Dynamic) other).id);
        }

        @Override // au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return a.h("Dynamic(id=", this.id, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Fuel;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fuel implements HomeCoachMarkElement {
        public static final int $stable = 0;

        @NotNull
        public static final Fuel INSTANCE = new Fuel();

        @NotNull
        private static final String id = "fuel";

        private Fuel() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Fuel);
        }

        @Override // au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement
        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return -792975303;
        }

        @NotNull
        public String toString() {
            return "Fuel";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$OfferList;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferList implements HomeCoachMarkElement {
        public static final int $stable = 0;

        @NotNull
        public static final OfferList INSTANCE = new OfferList();

        @NotNull
        private static final String id = "offerList";

        private OfferList() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OfferList);
        }

        @Override // au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement
        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return 930497655;
        }

        @NotNull
        public String toString() {
            return "OfferList";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Redemption;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Redemption implements HomeCoachMarkElement {
        public static final int $stable = 0;

        @NotNull
        public static final Redemption INSTANCE = new Redemption();

        @NotNull
        private static final String id = "redemption";

        private Redemption() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Redemption);
        }

        @Override // au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement
        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return 698335854;
        }

        @NotNull
        public String toString() {
            return "Redemption";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$Redemption2024;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Redemption2024 implements HomeCoachMarkElement {
        public static final int $stable = 0;

        @NotNull
        public static final Redemption2024 INSTANCE = new Redemption2024();

        @NotNull
        private static final String id = "redemption_home_uplift";

        private Redemption2024() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Redemption2024);
        }

        @Override // au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement
        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return -166440850;
        }

        @NotNull
        public String toString() {
            return "Redemption2024";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement$SubscriberInHeader;", "Lau/com/woolworths/rewards/base/coachmark/data/HomeCoachMarkElement;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubscriberInHeader implements HomeCoachMarkElement {
        public static final int $stable = 0;

        @NotNull
        public static final SubscriberInHeader INSTANCE = new SubscriberInHeader();

        @NotNull
        private static final String id = "extra_subscription_home_header";

        private SubscriberInHeader() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof SubscriberInHeader);
        }

        @Override // au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement
        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return -426059299;
        }

        @NotNull
        public String toString() {
            return "SubscriberInHeader";
        }
    }

    @NotNull
    String getId();
}
