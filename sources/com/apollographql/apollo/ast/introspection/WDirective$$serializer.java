package com.apollographql.apollo.ast.introspection;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/apollographql/apollo/ast/introspection/WDirective.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/apollographql/apollo/ast/introspection/WDirective;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class WDirective$$serializer implements GeneratedSerializer<WDirective> {

    /* renamed from: a, reason: collision with root package name */
    public static final WDirective$$serializer f13605a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WDirective$$serializer wDirective$$serializer = new WDirective$$serializer();
        f13605a = wDirective$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.apollographql.apollo.ast.introspection.WDirective", wDirective$$serializer, 5);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        pluginGeneratedSerialDescriptor.k(lqlqqlq.mmm006Dm006Dm, false);
        pluginGeneratedSerialDescriptor.k("locations", false);
        pluginGeneratedSerialDescriptor.k("args", false);
        pluginGeneratedSerialDescriptor.k("isRepeatable", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = WDirective.f;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.d(stringSerializer), lazyArr[2].getD(), lazyArr[3].getD(), BooleanSerializer.f24779a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = WDirective.f;
        int i = 0;
        boolean zB = false;
        String strJ = null;
        String str = null;
        List list = null;
        List list2 = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                strJ = compositeDecoderB.j(serialDescriptor, 0);
                i |= 1;
            } else if (iU == 1) {
                str = (String) compositeDecoderB.k(serialDescriptor, 1, StringSerializer.f24821a, str);
                i |= 2;
            } else if (iU == 2) {
                list = (List) compositeDecoderB.o(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getD(), list);
                i |= 4;
            } else if (iU == 3) {
                list2 = (List) compositeDecoderB.o(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getD(), list2);
                i |= 8;
            } else {
                if (iU != 4) {
                    throw new UnknownFieldException(iU);
                }
                zB = compositeDecoderB.B(serialDescriptor, 4);
                i |= 16;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new WDirective(i, strJ, str, list, list2, zB);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        WDirective value = (WDirective) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = WDirective.f;
        compositeEncoderB.p(serialDescriptor, 0, value.f13604a);
        compositeEncoderB.w(serialDescriptor, 1, StringSerializer.f24821a, value.b);
        compositeEncoderB.F(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getD(), value.c);
        compositeEncoderB.F(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getD(), value.d);
        compositeEncoderB.o(serialDescriptor, 4, value.e);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
