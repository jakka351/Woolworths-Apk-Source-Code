package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/DurationSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/time/Duration;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class DurationSerializer implements KSerializer<Duration> {

    /* renamed from: a, reason: collision with root package name */
    public static final DurationSerializer f24793a = new DurationSerializer();
    public static final PrimitiveSerialDescriptor b = new PrimitiveSerialDescriptor("kotlin.time.Duration", PrimitiveKind.STRING.f24770a);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i = Duration.g;
        String value = decoder.p();
        Intrinsics.h(value, "value");
        try {
            return new Duration(DurationKt.a(value));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(YU.a.h("Invalid ISO duration string format: '", value, "'."), e);
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((Duration) obj).d;
        int i = Duration.g;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jO = j < 0 ? Duration.o(j) : j;
        long jM = Duration.m(jO, DurationUnit.j);
        boolean z = false;
        int iM = Duration.f(jO) ? 0 : (int) (Duration.m(jO, DurationUnit.i) % 60);
        int iM2 = Duration.f(jO) ? 0 : (int) (Duration.m(jO, DurationUnit.h) % 60);
        int iE = Duration.e(jO);
        if (Duration.f(j)) {
            jM = 9999999999999L;
        }
        boolean z2 = jM != 0;
        boolean z3 = (iM2 == 0 && iE == 0) ? false : true;
        if (iM != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM);
            sb.append('H');
        }
        if (z) {
            sb.append(iM);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            Duration.b(sb, iM2, iE, 9, "S", true);
        }
        encoder.u(sb.toString());
    }
}
