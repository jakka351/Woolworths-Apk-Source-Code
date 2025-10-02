package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u0002\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType;", "", "Companion", "CaptureCard", "ThreeDS", "ConsumerAuthenticationInformation", "StepUp", "UpdateCard", "ValidateCard", "ValidatePayment", "AcsWindowSize", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$CaptureCard;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$StepUp;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$UpdateCard;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ValidateCard;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ValidatePayment;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class ActionType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.d, new h(11));

    /* renamed from: a, reason: collision with root package name */
    public final String f4637a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$AcsWindowSize;", "", "Companion", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class AcsWindowSize {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Object e;
        public static final AcsWindowSize f;
        public static final /* synthetic */ AcsWindowSize[] g;
        public static final /* synthetic */ EnumEntries h;
        public final String d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$AcsWindowSize$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$AcsWindowSize;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer<AcsWindowSize> serializer() {
                return (KSerializer) AcsWindowSize.e.getD();
            }
        }

        static {
            AcsWindowSize acsWindowSize = new AcsWindowSize("ACS_250x400", 0, "01");
            f = acsWindowSize;
            AcsWindowSize[] acsWindowSizeArr = {acsWindowSize, new AcsWindowSize("ACS_390x400", 1, "02"), new AcsWindowSize("ACS_500x600", 2, "03"), new AcsWindowSize("ACS_600x400", 3, "04"), new AcsWindowSize("ACS_FULL_PAGE", 4, "05")};
            g = acsWindowSizeArr;
            h = EnumEntriesKt.a(acsWindowSizeArr);
            INSTANCE = new Companion();
            e = LazyKt.a(LazyThreadSafetyMode.d, new h(12));
        }

        public AcsWindowSize(String str, int i, String str2) {
            this.d = str2;
        }

        public static AcsWindowSize valueOf(String str) {
            return (AcsWindowSize) Enum.valueOf(AcsWindowSize.class, str);
        }

        public static AcsWindowSize[] values() {
            return (AcsWindowSize[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$CaptureCard;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class CaptureCard extends ActionType {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final ThreeDS f;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$CaptureCard$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$CaptureCard;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<CaptureCard> serializer() {
                return ActionType$CaptureCard$$serializer.f4638a;
            }
        }

        public /* synthetic */ CaptureCard(int i, boolean z, boolean z2, boolean z3, ThreeDS threeDS) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.a(i, 7, ActionType$CaptureCard$$serializer.f4638a.getDescriptor());
                throw null;
            }
            this.c = z;
            this.d = z2;
            this.e = z3;
            if ((i & 8) == 0) {
                this.f = null;
            } else {
                this.f = threeDS;
            }
        }

        public CaptureCard(ThreeDS threeDS) {
            super("CaptureCard");
            this.c = false;
            this.d = true;
            this.e = false;
            this.f = threeDS;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer<ActionType> serializer() {
            return (KSerializer) ActionType.b.getD();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$StepUp;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class StepUp extends ActionType {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$StepUp$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$StepUp;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<StepUp> serializer() {
                return ActionType$StepUp$$serializer.f4640a;
            }
        }

        public /* synthetic */ StepUp(int i, String str) {
            if (1 == (i & 1)) {
                this.c = str;
            } else {
                PluginExceptionsKt.a(i, 1, ActionType$StepUp$$serializer.f4640a.getDescriptor());
                throw null;
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ThreeDS;", "", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class ThreeDS {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4646a;
        public final ConsumerAuthenticationInformation b;
        public final String c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ThreeDS$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ThreeDS;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<ThreeDS> serializer() {
                return ActionType$ThreeDS$$serializer.f4641a;
            }
        }

        public /* synthetic */ ThreeDS(int i, boolean z, ConsumerAuthenticationInformation consumerAuthenticationInformation, String str) {
            if (5 != (i & 5)) {
                PluginExceptionsKt.a(i, 5, ActionType$ThreeDS$$serializer.f4641a.getDescriptor());
                throw null;
            }
            this.f4646a = z;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = consumerAuthenticationInformation;
            }
            this.c = str;
        }

        public ThreeDS(boolean z, boolean z2, ConsumerAuthenticationInformation consumerAuthenticationInformation) {
            this.f4646a = z;
            this.b = consumerAuthenticationInformation;
            this.c = z2 ? "prod" : "staging";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$UpdateCard;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class UpdateCard extends ActionType {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;
        public final boolean e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$UpdateCard$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$UpdateCard;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<UpdateCard> serializer() {
                return ActionType$UpdateCard$$serializer.f4642a;
            }
        }

        public /* synthetic */ UpdateCard(String str, int i, String str2, boolean z) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.a(i, 7, ActionType$UpdateCard$$serializer.f4642a.getDescriptor());
                throw null;
            }
            this.c = str;
            this.d = str2;
            this.e = z;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ValidateCard;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class ValidateCard extends ActionType {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final boolean d;
        public final ThreeDS e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ValidateCard$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ValidateCard;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<ValidateCard> serializer() {
                return ActionType$ValidateCard$$serializer.f4643a;
            }
        }

        public /* synthetic */ ValidateCard(int i, String str, boolean z, ThreeDS threeDS) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.a(i, 7, ActionType$ValidateCard$$serializer.f4643a.getDescriptor());
                throw null;
            }
            this.c = str;
            this.d = z;
            this.e = threeDS;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidateCard(String sessionId, ThreeDS threeDS) {
            super("ValidateCard");
            Intrinsics.h(sessionId, "sessionId");
            this.c = sessionId;
            this.d = true;
            this.e = threeDS;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ValidatePayment;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class ValidatePayment extends ActionType {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;
        public final ThreeDS e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ValidatePayment$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ValidatePayment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<ValidatePayment> serializer() {
                return ActionType$ValidatePayment$$serializer.f4644a;
            }
        }

        public /* synthetic */ ValidatePayment(int i, String str, String str2, ThreeDS threeDS) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.a(i, 7, ActionType$ValidatePayment$$serializer.f4644a.getDescriptor());
                throw null;
            }
            this.c = str;
            this.d = str2;
            this.e = threeDS;
        }
    }

    public /* synthetic */ ActionType() {
        this.f4637a = "";
    }

    public final String toString() {
        Json.Default r0 = Json.d;
        r0.getClass();
        return r0.c(INSTANCE.serializer(), this);
    }

    public ActionType(String str) {
        this.f4637a = str;
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ConsumerAuthenticationInformation;", "", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class ConsumerAuthenticationInformation {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f4645a;
        public final String b;
        public final String c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ConsumerAuthenticationInformation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionType$ConsumerAuthenticationInformation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<ConsumerAuthenticationInformation> serializer() {
                return ActionType$ConsumerAuthenticationInformation$$serializer.f4639a;
            }
        }

        public ConsumerAuthenticationInformation(AcsWindowSize acsWindowSizeValue) {
            Intrinsics.h(acsWindowSizeValue, "acsWindowSizeValue");
            this.f4645a = "04";
            this.b = "01";
            this.c = acsWindowSizeValue.d;
        }

        public /* synthetic */ ConsumerAuthenticationInformation(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.a(i, 7, ActionType$ConsumerAuthenticationInformation$$serializer.f4639a.getDescriptor());
                throw null;
            }
            AcsWindowSize.Companion companion = AcsWindowSize.INSTANCE;
            this.f4645a = str;
            this.b = str2;
            this.c = str3;
        }
    }
}
