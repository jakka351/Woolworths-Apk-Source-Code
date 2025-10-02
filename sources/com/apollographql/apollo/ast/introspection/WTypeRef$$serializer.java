package com.apollographql.apollo.ast.introspection;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/apollographql/apollo/ast/introspection/WTypeRef.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/apollographql/apollo/ast/introspection/WTypeRef;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class WTypeRef$$serializer implements GeneratedSerializer<WTypeRef> {

    /* renamed from: a, reason: collision with root package name */
    public static final WTypeRef$$serializer f13617a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WTypeRef$$serializer wTypeRef$$serializer = new WTypeRef$$serializer();
        f13617a = wTypeRef$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.apollographql.apollo.ast.introspection.WTypeRef", wTypeRef$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("kind", false);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        pluginGeneratedSerialDescriptor.k("ofType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{WTypeRef.d[0].getD(), BuiltinSerializersKt.d(StringSerializer.f24821a), BuiltinSerializersKt.d(f13617a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = WTypeRef.d;
        WTypeKind wTypeKind = null;
        boolean z = true;
        int i = 0;
        String str = null;
        WTypeRef wTypeRef = null;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                wTypeKind = (WTypeKind) compositeDecoderB.o(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getD(), wTypeKind);
                i |= 1;
            } else if (iU == 1) {
                str = (String) compositeDecoderB.k(serialDescriptor, 1, StringSerializer.f24821a, str);
                i |= 2;
            } else {
                if (iU != 2) {
                    throw new UnknownFieldException(iU);
                }
                wTypeRef = (WTypeRef) compositeDecoderB.k(serialDescriptor, 2, f13617a, wTypeRef);
                i |= 4;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new WTypeRef(i, wTypeKind, str, wTypeRef);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        WTypeRef value = (WTypeRef) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        compositeEncoderB.F(serialDescriptor, 0, (SerializationStrategy) WTypeRef.d[0].getD(), value.f13616a);
        compositeEncoderB.w(serialDescriptor, 1, StringSerializer.f24821a, value.b);
        compositeEncoderB.w(serialDescriptor, 2, f13617a, value.c);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
