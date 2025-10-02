package androidx.os.serialization;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.navigation.a;
import androidx.os.serialization.serializers.SavedStateSerializer;
import androidx.os.serialization.serializers.SizeFSerializer;
import androidx.os.serialization.serializers.SizeSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SavedStateConfigurationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialModuleImpl f3738a;

    static {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        SavedStateSerializer savedStateSerializer = SavedStateSerializer.f3749a;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        serializersModuleBuilder.d(reflectionFactory.b(Bundle.class), savedStateSerializer);
        SerialModuleImpl serialModuleImplF = serializersModuleBuilder.f();
        SerializersModuleBuilder serializersModuleBuilder2 = new SerializersModuleBuilder();
        serializersModuleBuilder2.d(reflectionFactory.b(Size.class), SizeSerializer.f3751a);
        serializersModuleBuilder2.d(reflectionFactory.b(SizeF.class), SizeFSerializer.f3750a);
        serializersModuleBuilder2.e(reflectionFactory.b(SparseArray.class), new a(16));
        SerialModuleImpl serialModuleImplF2 = serializersModuleBuilder2.f();
        SerialModuleImpl serialModuleImpl = SerializersModuleKt.f24879a;
        SerializersModuleBuilder serializersModuleBuilder3 = new SerializersModuleBuilder();
        serialModuleImplF.a(serializersModuleBuilder3);
        serialModuleImplF2.a(serializersModuleBuilder3);
        f3738a = serializersModuleBuilder3.f();
    }
}
