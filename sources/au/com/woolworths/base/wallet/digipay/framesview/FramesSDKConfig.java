package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/FramesSDKConfig;", "", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class FramesSDKConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.d, new h(16))};

    /* renamed from: a, reason: collision with root package name */
    public final String f4674a;
    public final String b;
    public final String c;
    public final LogLevel d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/FramesSDKConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/FramesSDKConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FramesSDKConfig> serializer() {
            return FramesSDKConfig$$serializer.f4675a;
        }
    }

    public /* synthetic */ FramesSDKConfig(int i, String str, String str2, String str3, LogLevel logLevel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, FramesSDKConfig$$serializer.f4675a.getDescriptor());
            throw null;
        }
        this.f4674a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = LogLevel.d;
        } else {
            this.d = logLevel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FramesSDKConfig)) {
            return false;
        }
        FramesSDKConfig framesSDKConfig = (FramesSDKConfig) obj;
        return Intrinsics.c(this.f4674a, framesSDKConfig.f4674a) && Intrinsics.c(this.b, framesSDKConfig.b) && Intrinsics.c(this.c, framesSDKConfig.c) && this.d == framesSDKConfig.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.f4674a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        Json.Default r0 = Json.d;
        r0.getClass();
        return r0.c(INSTANCE.serializer(), this);
    }

    public FramesSDKConfig(String apiKey, String str, String apiBase) {
        LogLevel logLevel = LogLevel.d;
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(apiBase, "apiBase");
        this.f4674a = apiKey;
        this.b = str;
        this.c = apiBase;
        this.d = logLevel;
    }
}
