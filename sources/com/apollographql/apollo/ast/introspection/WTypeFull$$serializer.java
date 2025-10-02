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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/apollographql/apollo/ast/introspection/WTypeFull.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/apollographql/apollo/ast/introspection/WTypeFull;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class WTypeFull$$serializer implements GeneratedSerializer<WTypeFull> {

    /* renamed from: a, reason: collision with root package name */
    public static final WTypeFull$$serializer f13615a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WTypeFull$$serializer wTypeFull$$serializer = new WTypeFull$$serializer();
        f13615a = wTypeFull$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.apollographql.apollo.ast.introspection.WTypeFull", wTypeFull$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("kind", false);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        pluginGeneratedSerialDescriptor.k(lqlqqlq.mmm006Dm006Dm, false);
        pluginGeneratedSerialDescriptor.k("fields", false);
        pluginGeneratedSerialDescriptor.k("interfaces", false);
        pluginGeneratedSerialDescriptor.k("possibleTypes", false);
        pluginGeneratedSerialDescriptor.k("enumValues", false);
        pluginGeneratedSerialDescriptor.k("inputFields", false);
        pluginGeneratedSerialDescriptor.k("specifiedByURL", false);
        pluginGeneratedSerialDescriptor.k("isOneOf", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = WTypeFull.k;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{lazyArr[0].getD(), stringSerializer, BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d((KSerializer) lazyArr[3].getD()), BuiltinSerializersKt.d((KSerializer) lazyArr[4].getD()), BuiltinSerializersKt.d((KSerializer) lazyArr[5].getD()), BuiltinSerializersKt.d((KSerializer) lazyArr[6].getD()), BuiltinSerializersKt.d((KSerializer) lazyArr[7].getD()), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(BooleanSerializer.f24779a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr2 = WTypeFull.k;
        String str = null;
        Boolean bool = null;
        WTypeKind wTypeKind = null;
        String strJ = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    lazyArr = lazyArr2;
                    z = false;
                    break;
                case 0:
                    lazyArr = lazyArr2;
                    wTypeKind = (WTypeKind) compositeDecoderB.o(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getD(), wTypeKind);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    strJ = compositeDecoderB.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    str2 = (String) compositeDecoderB.k(serialDescriptor, 2, StringSerializer.f24821a, str2);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    list = (List) compositeDecoderB.k(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getD(), list);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    list2 = (List) compositeDecoderB.k(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getD(), list2);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    list3 = (List) compositeDecoderB.k(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getD(), list3);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    list4 = (List) compositeDecoderB.k(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getD(), list4);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    list5 = (List) compositeDecoderB.k(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getD(), list5);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    str = (String) compositeDecoderB.k(serialDescriptor, 8, StringSerializer.f24821a, str);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    bool = (Boolean) compositeDecoderB.k(serialDescriptor, 9, BooleanSerializer.f24779a, bool);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
            lazyArr2 = lazyArr;
        }
        compositeDecoderB.c(serialDescriptor);
        return new WTypeFull(i, wTypeKind, strJ, str2, list, list2, list3, list4, list5, str, bool);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        WTypeFull value = (WTypeFull) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = WTypeFull.k;
        compositeEncoderB.F(serialDescriptor, 0, (SerializationStrategy) lazyArr[0].getD(), value.f13614a);
        compositeEncoderB.p(serialDescriptor, 1, value.b);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        compositeEncoderB.w(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderB.w(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getD(), value.d);
        compositeEncoderB.w(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getD(), value.e);
        compositeEncoderB.w(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getD(), value.f);
        compositeEncoderB.w(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getD(), value.g);
        compositeEncoderB.w(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getD(), value.h);
        compositeEncoderB.w(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderB.w(serialDescriptor, 9, BooleanSerializer.f24779a, value.j);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
