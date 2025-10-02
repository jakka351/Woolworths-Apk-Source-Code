package com.apollographql.apollo.ast.introspection;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/apollographql/apollo/ast/introspection/WSchema.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/apollographql/apollo/ast/introspection/WSchema;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class WSchema$$serializer implements GeneratedSerializer<WSchema> {

    /* renamed from: a, reason: collision with root package name */
    public static final WSchema$$serializer f13613a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WSchema$$serializer wSchema$$serializer = new WSchema$$serializer();
        f13613a = wSchema$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.apollographql.apollo.ast.introspection.WSchema", wSchema$$serializer, 6);
        pluginGeneratedSerialDescriptor.k(lqlqqlq.mmm006Dm006Dm, false);
        pluginGeneratedSerialDescriptor.k("types", false);
        pluginGeneratedSerialDescriptor.k("queryType", false);
        pluginGeneratedSerialDescriptor.k("mutationType", false);
        pluginGeneratedSerialDescriptor.k("subscriptionType", false);
        pluginGeneratedSerialDescriptor.k("directives", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = WSchema.g;
        WTypeRoot$$serializer wTypeRoot$$serializer = WTypeRoot$$serializer.f13619a;
        return new KSerializer[]{BuiltinSerializersKt.d(StringSerializer.f24821a), lazyArr[1].getD(), wTypeRoot$$serializer, BuiltinSerializersKt.d(wTypeRoot$$serializer), BuiltinSerializersKt.d(wTypeRoot$$serializer), lazyArr[5].getD()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = WSchema.g;
        int i = 0;
        String str = null;
        List list = null;
        WTypeRoot wTypeRoot = null;
        WTypeRoot wTypeRoot2 = null;
        WTypeRoot wTypeRoot3 = null;
        List list2 = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) compositeDecoderB.k(serialDescriptor, 0, StringSerializer.f24821a, str);
                    i |= 1;
                    break;
                case 1:
                    list = (List) compositeDecoderB.o(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getD(), list);
                    i |= 2;
                    break;
                case 2:
                    wTypeRoot = (WTypeRoot) compositeDecoderB.o(serialDescriptor, 2, WTypeRoot$$serializer.f13619a, wTypeRoot);
                    i |= 4;
                    break;
                case 3:
                    wTypeRoot2 = (WTypeRoot) compositeDecoderB.k(serialDescriptor, 3, WTypeRoot$$serializer.f13619a, wTypeRoot2);
                    i |= 8;
                    break;
                case 4:
                    wTypeRoot3 = (WTypeRoot) compositeDecoderB.k(serialDescriptor, 4, WTypeRoot$$serializer.f13619a, wTypeRoot3);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) compositeDecoderB.o(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getD(), list2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new WSchema(i, str, list, wTypeRoot, wTypeRoot2, wTypeRoot3, list2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        WSchema value = (WSchema) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = WSchema.g;
        compositeEncoderB.w(serialDescriptor, 0, StringSerializer.f24821a, value.f13612a);
        compositeEncoderB.F(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getD(), value.b);
        WTypeRoot$$serializer wTypeRoot$$serializer = WTypeRoot$$serializer.f13619a;
        compositeEncoderB.F(serialDescriptor, 2, wTypeRoot$$serializer, value.c);
        compositeEncoderB.w(serialDescriptor, 3, wTypeRoot$$serializer, value.d);
        compositeEncoderB.w(serialDescriptor, 4, wTypeRoot$$serializer, value.e);
        compositeEncoderB.F(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getD(), value.f);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
