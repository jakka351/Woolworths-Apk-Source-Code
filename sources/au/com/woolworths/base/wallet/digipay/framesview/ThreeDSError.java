package au.com.woolworths.base.wallet.digipay.framesview;

import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSError;", "", "Companion", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final class ThreeDSError {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Object d;
    public static final ThreeDSError e;
    public static final ThreeDSError f;
    public static final /* synthetic */ ThreeDSError[] g;
    public static final /* synthetic */ EnumEntries h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSError$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSError;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer<ThreeDSError> serializer() {
            return (KSerializer) ThreeDSError.d.getD();
        }
    }

    static {
        ThreeDSError threeDSError = new ThreeDSError("TOKEN_REQUIRED", 0);
        e = threeDSError;
        ThreeDSError threeDSError2 = new ThreeDSError("INVALID_SESSION", 1);
        ThreeDSError threeDSError3 = new ThreeDSError("VALIDATION_FAILED", 2);
        ThreeDSError threeDSError4 = new ThreeDSError("UNSUPPORTED_VERSION", 3);
        ThreeDSError threeDSError5 = new ThreeDSError("SERVICE_UNAVAILABLE", 4);
        ThreeDSError threeDSError6 = new ThreeDSError("AUTHENTICATION_FAILED", 5);
        f = threeDSError6;
        ThreeDSError[] threeDSErrorArr = {threeDSError, threeDSError2, threeDSError3, threeDSError4, threeDSError5, threeDSError6, new ThreeDSError("VALIDATION_TIMEOUT", 6), new ThreeDSError("NOT_ENABLED", 7), new ThreeDSError("UNKNOWN_ERROR", 8)};
        g = threeDSErrorArr;
        h = EnumEntriesKt.a(threeDSErrorArr);
        INSTANCE = new Companion();
        d = LazyKt.a(LazyThreadSafetyMode.d, new h(18));
    }

    public static ThreeDSError valueOf(String str) {
        return (ThreeDSError) Enum.valueOf(ThreeDSError.class, str);
    }

    public static ThreeDSError[] values() {
        return (ThreeDSError[]) g.clone();
    }
}
