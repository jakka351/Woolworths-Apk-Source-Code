package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/PaymentInstrument;", "", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class PaymentInstrument {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f4685a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/PaymentInstrument$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/PaymentInstrument;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<PaymentInstrument> serializer() {
            return PaymentInstrument$$serializer.f4686a;
        }
    }

    public /* synthetic */ PaymentInstrument(int i, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.a(i, 1023, PaymentInstrument$$serializer.f4686a.getB());
            throw null;
        }
        this.f4685a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInstrument)) {
            return false;
        }
        PaymentInstrument paymentInstrument = (PaymentInstrument) obj;
        return Intrinsics.c(this.f4685a, paymentInstrument.f4685a) && this.b == paymentInstrument.b && Intrinsics.c(this.c, paymentInstrument.c) && Intrinsics.c(this.d, paymentInstrument.d) && Intrinsics.c(this.e, paymentInstrument.e) && Intrinsics.c(this.f, paymentInstrument.f) && Intrinsics.c(this.g, paymentInstrument.g) && Intrinsics.c(this.h, paymentInstrument.h) && Intrinsics.c(this.i, paymentInstrument.i) && Intrinsics.c(this.j, paymentInstrument.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.b(this.f4685a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentInstrument(bin=");
        sb.append(this.f4685a);
        sb.append(", created=");
        sb.append(this.b);
        androidx.constraintlayout.core.state.a.B(sb, ", expiryMonth=", this.c, ", expiryYear=", this.d);
        androidx.constraintlayout.core.state.a.B(sb, ", itemId=", this.e, ", nickname=", this.f);
        androidx.constraintlayout.core.state.a.B(sb, ", paymentToken=", this.g, ", scheme=", this.h);
        androidx.constraintlayout.core.state.a.B(sb, ", status=", this.i, ", suffix=", this.j);
        sb.append(")");
        return sb.toString();
    }
}
