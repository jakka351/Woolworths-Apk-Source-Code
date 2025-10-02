package androidx.os.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ArrayClassDesc;
import kotlinx.serialization.internal.ArrayListClassDesc;
import kotlinx.serialization.internal.BooleanArraySerializer;
import kotlinx.serialization.internal.CharArraySerializer;
import kotlinx.serialization.internal.DoubleArraySerializer;
import kotlinx.serialization.internal.FloatArraySerializer;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongArraySerializer;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SavedStateCodecUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayListClassDesc f3736a = BuiltinSerializersKt.b(IntSerializer.f24800a).b;
    public static final ArrayListClassDesc b;
    public static final SerialDescriptor c;
    public static final SerialDescriptor d;
    public static final SerialDescriptor e;
    public static final SerialDescriptor f;
    public static final SerialDescriptor g;
    public static final SerialDescriptor h;
    public static final ArrayClassDesc i;

    static {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        b = BuiltinSerializersKt.b(stringSerializer).b;
        c = BooleanArraySerializer.c.b;
        d = CharArraySerializer.c.b;
        e = DoubleArraySerializer.c.b;
        f = FloatArraySerializer.c.b;
        g = IntArraySerializer.c.b;
        h = LongArraySerializer.c.b;
        i = BuiltinSerializersKt.a(Reflection.f24268a.b(String.class), stringSerializer).c;
    }
}
