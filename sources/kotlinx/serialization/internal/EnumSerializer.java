package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/EnumSerializer;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EnumSerializer<T extends Enum<T>> implements KSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f24795a;
    public EnumDescriptor b;
    public final Lazy c;

    public EnumSerializer(Enum[] values, String str) {
        Intrinsics.h(values, "values");
        this.f24795a = values;
        this.c = LazyKt.b(new coil3.gif.a(10, this, str));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iR = decoder.r(getB());
        Enum[] enumArr = this.f24795a;
        if (iR >= 0 && iR < enumArr.length) {
            return enumArr[iR];
        }
        throw new SerializationException(iR + " is not among valid " + getB().getB() + " enum values, values size is " + enumArr.length);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return (SerialDescriptor) this.c.getD();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Enum value = (Enum) obj;
        Intrinsics.h(value, "value");
        Enum[] enumArr = this.f24795a;
        int iQ = ArraysKt.Q(enumArr, value);
        if (iQ != -1) {
            encoder.i(getB(), iQ);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getB().getB());
        sb.append(", must be one of ");
        String string = Arrays.toString(enumArr);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getB().getB() + '>';
    }
}
