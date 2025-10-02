package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PrimitivesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MapBuilder f24817a;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        mapBuilder.put(reflectionFactory.b(String.class), StringSerializer.f24821a);
        mapBuilder.put(reflectionFactory.b(Character.TYPE), CharSerializer.f24785a);
        mapBuilder.put(reflectionFactory.b(char[].class), CharArraySerializer.c);
        mapBuilder.put(reflectionFactory.b(Double.TYPE), DoubleSerializer.f24792a);
        mapBuilder.put(reflectionFactory.b(double[].class), DoubleArraySerializer.c);
        mapBuilder.put(reflectionFactory.b(Float.TYPE), FloatSerializer.f24797a);
        mapBuilder.put(reflectionFactory.b(float[].class), FloatArraySerializer.c);
        mapBuilder.put(reflectionFactory.b(Long.TYPE), LongSerializer.f24804a);
        mapBuilder.put(reflectionFactory.b(long[].class), LongArraySerializer.c);
        mapBuilder.put(reflectionFactory.b(ULong.class), ULongSerializer.f24831a);
        mapBuilder.put(reflectionFactory.b(Integer.TYPE), IntSerializer.f24800a);
        mapBuilder.put(reflectionFactory.b(int[].class), IntArraySerializer.c);
        mapBuilder.put(reflectionFactory.b(UInt.class), UIntSerializer.f24829a);
        mapBuilder.put(reflectionFactory.b(Short.TYPE), ShortSerializer.f24820a);
        mapBuilder.put(reflectionFactory.b(short[].class), ShortArraySerializer.c);
        mapBuilder.put(reflectionFactory.b(UShort.class), UShortSerializer.f24833a);
        mapBuilder.put(reflectionFactory.b(Byte.TYPE), ByteSerializer.f24781a);
        mapBuilder.put(reflectionFactory.b(byte[].class), ByteArraySerializer.c);
        mapBuilder.put(reflectionFactory.b(UByte.class), UByteSerializer.f24827a);
        mapBuilder.put(reflectionFactory.b(Boolean.TYPE), BooleanSerializer.f24779a);
        mapBuilder.put(reflectionFactory.b(boolean[].class), BooleanArraySerializer.c);
        mapBuilder.put(reflectionFactory.b(Unit.class), UnitSerializer.b);
        mapBuilder.put(reflectionFactory.b(Void.class), NothingSerializer.f24809a);
        try {
            KClass kClassB = reflectionFactory.b(Duration.class);
            int i = Duration.g;
            mapBuilder.put(kClassB, DurationSerializer.f24793a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(Reflection.f24268a.b(ULongArray.class), ULongArraySerializer.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(Reflection.f24268a.b(UIntArray.class), UIntArraySerializer.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(Reflection.f24268a.b(UShortArray.class), UShortArraySerializer.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(Reflection.f24268a.b(UByteArray.class), UByteArraySerializer.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapBuilder.put(Reflection.f24268a.b(Uuid.class), UuidSerializer.f24835a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        f24817a = mapBuilder.b();
    }
}
