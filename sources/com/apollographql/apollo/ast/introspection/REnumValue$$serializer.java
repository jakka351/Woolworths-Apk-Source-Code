package com.apollographql.apollo.ast.introspection;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/apollographql/apollo/ast/introspection/REnumValue.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/apollographql/apollo/ast/introspection/REnumValue;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class REnumValue$$serializer implements GeneratedSerializer<REnumValue> {

    /* renamed from: a, reason: collision with root package name */
    public static final REnumValue$$serializer f13587a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        REnumValue$$serializer rEnumValue$$serializer = new REnumValue$$serializer();
        f13587a = rEnumValue$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.apollographql.apollo.ast.introspection.REnumValue", rEnumValue$$serializer, 4);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        pluginGeneratedSerialDescriptor.k(lqlqqlq.mmm006Dm006Dm, true);
        pluginGeneratedSerialDescriptor.k("isDeprecated", true);
        pluginGeneratedSerialDescriptor.k("deprecationReason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = REnumValue.e;
        return new KSerializer[]{StringSerializer.f24821a, lazyArr[1].getD(), lazyArr[2].getD(), lazyArr[3].getD()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = REnumValue.e;
        int i = 0;
        String strJ = null;
        Optional optional = null;
        Optional optional2 = null;
        Optional optional3 = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                strJ = compositeDecoderB.j(serialDescriptor, 0);
                i |= 1;
            } else if (iU == 1) {
                optional = (Optional) compositeDecoderB.o(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getD(), optional);
                i |= 2;
            } else if (iU == 2) {
                optional2 = (Optional) compositeDecoderB.o(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getD(), optional2);
                i |= 4;
            } else {
                if (iU != 3) {
                    throw new UnknownFieldException(iU);
                }
                optional3 = (Optional) compositeDecoderB.o(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getD(), optional3);
                i |= 8;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new REnumValue(i, strJ, optional, optional2, optional3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    @Override // kotlinx.serialization.SerializationStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r8, java.lang.Object r9) {
        /*
            r7 = this;
            com.apollographql.apollo.ast.introspection.REnumValue r9 = (com.apollographql.apollo.ast.introspection.REnumValue) r9
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.h(r9, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = com.apollographql.apollo.ast.introspection.REnumValue$$serializer.descriptor
            kotlinx.serialization.encoding.CompositeEncoder r8 = r8.b(r0)
            kotlin.Lazy[] r1 = com.apollographql.apollo.ast.introspection.REnumValue.e
            java.lang.String r2 = r9.f13586a
            com.apollographql.apollo.ast.introspection.Optional r3 = r9.d
            com.apollographql.apollo.ast.introspection.Optional r4 = r9.c
            com.apollographql.apollo.ast.introspection.Optional r9 = r9.b
            r5 = 0
            r8.p(r0, r5, r2)
            r2 = 1
            boolean r5 = r8.q(r0, r2)
            com.apollographql.apollo.ast.introspection.Optional$Absent r6 = com.apollographql.apollo.ast.introspection.Optional.Absent.f13579a
            if (r5 == 0) goto L25
            goto L30
        L25:
            com.apollographql.apollo.ast.introspection.Optional$Companion r5 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r5.getClass()
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r9, r6)
            if (r5 != 0) goto L3b
        L30:
            r5 = r1[r2]
            java.lang.Object r5 = r5.getD()
            kotlinx.serialization.SerializationStrategy r5 = (kotlinx.serialization.SerializationStrategy) r5
            r8.F(r0, r2, r5, r9)
        L3b:
            r9 = 2
            boolean r2 = r8.q(r0, r9)
            if (r2 == 0) goto L43
            goto L4e
        L43:
            com.apollographql.apollo.ast.introspection.Optional$Companion r2 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r2.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r4, r6)
            if (r2 != 0) goto L59
        L4e:
            r2 = r1[r9]
            java.lang.Object r2 = r2.getD()
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            r8.F(r0, r9, r2, r4)
        L59:
            r9 = 3
            boolean r2 = r8.q(r0, r9)
            if (r2 == 0) goto L61
            goto L6c
        L61:
            com.apollographql.apollo.ast.introspection.Optional$Companion r2 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r2.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r3, r6)
            if (r2 != 0) goto L77
        L6c:
            r1 = r1[r9]
            java.lang.Object r1 = r1.getD()
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            r8.F(r0, r9, r1, r3)
        L77:
            r8.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.ast.introspection.REnumValue$$serializer.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
