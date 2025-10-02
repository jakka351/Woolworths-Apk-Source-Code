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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/apollographql/apollo/ast/introspection/WField.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/apollographql/apollo/ast/introspection/WField;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class WField$$serializer implements GeneratedSerializer<WField> {

    /* renamed from: a, reason: collision with root package name */
    public static final WField$$serializer f13609a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WField$$serializer wField$$serializer = new WField$$serializer();
        f13609a = wField$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.apollographql.apollo.ast.introspection.WField", wField$$serializer, 6);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        pluginGeneratedSerialDescriptor.k(lqlqqlq.mmm006Dm006Dm, false);
        pluginGeneratedSerialDescriptor.k("args", false);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("isDeprecated", false);
        pluginGeneratedSerialDescriptor.k("deprecationReason", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = WField.g;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.d(stringSerializer), lazyArr[2].getD(), WTypeRef$$serializer.f13617a, BooleanSerializer.f24779a, BuiltinSerializersKt.d(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = WField.g;
        int i = 0;
        boolean zB = false;
        String strJ = null;
        String str = null;
        List list = null;
        WTypeRef wTypeRef = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strJ = compositeDecoderB.j(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) compositeDecoderB.k(serialDescriptor, 1, StringSerializer.f24821a, str);
                    i |= 2;
                    break;
                case 2:
                    list = (List) compositeDecoderB.o(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getD(), list);
                    i |= 4;
                    break;
                case 3:
                    wTypeRef = (WTypeRef) compositeDecoderB.o(serialDescriptor, 3, WTypeRef$$serializer.f13617a, wTypeRef);
                    i |= 8;
                    break;
                case 4:
                    zB = compositeDecoderB.B(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) compositeDecoderB.k(serialDescriptor, 5, StringSerializer.f24821a, str2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new WField(i, strJ, str, list, wTypeRef, zB, str2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        WField value = (WField) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = WField.g;
        compositeEncoderB.p(serialDescriptor, 0, value.f13608a);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        compositeEncoderB.w(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderB.F(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getD(), value.c);
        compositeEncoderB.F(serialDescriptor, 3, WTypeRef$$serializer.f13617a, value.d);
        compositeEncoderB.o(serialDescriptor, 4, value.e);
        compositeEncoderB.w(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
