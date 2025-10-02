package androidx.os.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.os.serialization.serializers.CharSequenceSerializer;
import androidx.os.serialization.serializers.DefaultParcelableSerializer;
import androidx.os.serialization.serializers.SparseArraySerializer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ArrayClassDesc;
import kotlinx.serialization.internal.ArrayListClassDesc;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SavedStateCodecUtils_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialDescriptor f3737a;
    public static final SerialDescriptor b;
    public static final SerialDescriptor c;
    public static final SerialDescriptor d;
    public static final ArrayClassDesc e;
    public static final ArrayClassDesc f;
    public static final ArrayListClassDesc g;
    public static final ArrayListClassDesc h;
    public static final ArrayClassDesc i;
    public static final ArrayClassDesc j;
    public static final ArrayListClassDesc k;
    public static final ArrayListClassDesc l;
    public static final SerialDescriptor m;
    public static final SerialDescriptor n;
    public static final SerialDescriptor o;

    static {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f3737a = new PolymorphicSerializer(reflectionFactory.b(CharSequence.class)).getB();
        b = new PolymorphicSerializer(reflectionFactory.b(Parcelable.class)).getB();
        c = new PolymorphicSerializer(reflectionFactory.b(Serializable.class)).getB();
        d = new PolymorphicSerializer(reflectionFactory.b(IBinder.class)).getB();
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.b;
        e = BuiltinSerializersKt.a(reflectionFactory.b(Parcelable.class), defaultParcelableSerializer).c;
        f = BuiltinSerializersKt.a(reflectionFactory.b(Parcelable.class), new PolymorphicSerializer(reflectionFactory.b(Parcelable.class))).c;
        g = BuiltinSerializersKt.b(defaultParcelableSerializer).b;
        h = BuiltinSerializersKt.b(new PolymorphicSerializer(reflectionFactory.b(Parcelable.class))).b;
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.f3743a;
        i = BuiltinSerializersKt.a(reflectionFactory.b(CharSequence.class), charSequenceSerializer).c;
        j = BuiltinSerializersKt.a(reflectionFactory.b(CharSequence.class), new PolymorphicSerializer(reflectionFactory.b(CharSequence.class))).c;
        k = BuiltinSerializersKt.b(charSequenceSerializer).b;
        l = BuiltinSerializersKt.b(new PolymorphicSerializer(reflectionFactory.b(CharSequence.class))).b;
        m = new SparseArraySerializer(defaultParcelableSerializer).b;
        n = new SparseArraySerializer(new PolymorphicSerializer(reflectionFactory.b(Parcelable.class))).b;
        o = new SparseArraySerializer(BuiltinSerializersKt.d(new PolymorphicSerializer(reflectionFactory.b(Parcelable.class)))).b;
    }
}
