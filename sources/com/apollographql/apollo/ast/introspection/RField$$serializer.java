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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/apollographql/apollo/ast/introspection/RField.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/apollographql/apollo/ast/introspection/RField;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class RField$$serializer implements GeneratedSerializer<RField> {

    /* renamed from: a, reason: collision with root package name */
    public static final RField$$serializer f13591a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RField$$serializer rField$$serializer = new RField$$serializer();
        f13591a = rField$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.apollographql.apollo.ast.introspection.RField", rField$$serializer, 6);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        pluginGeneratedSerialDescriptor.k(lqlqqlq.mmm006Dm006Dm, true);
        pluginGeneratedSerialDescriptor.k("args", true);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("isDeprecated", true);
        pluginGeneratedSerialDescriptor.k("deprecationReason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RField.g;
        return new KSerializer[]{StringSerializer.f24821a, lazyArr[1].getD(), lazyArr[2].getD(), RTypeRef$$serializer.f13599a, lazyArr[4].getD(), lazyArr[5].getD()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = RField.g;
        int i = 0;
        String strJ = null;
        Optional optional = null;
        Optional optional2 = null;
        RTypeRef rTypeRef = null;
        Optional optional3 = null;
        Optional optional4 = null;
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
                    optional = (Optional) compositeDecoderB.o(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getD(), optional);
                    i |= 2;
                    break;
                case 2:
                    optional2 = (Optional) compositeDecoderB.o(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getD(), optional2);
                    i |= 4;
                    break;
                case 3:
                    rTypeRef = (RTypeRef) compositeDecoderB.o(serialDescriptor, 3, RTypeRef$$serializer.f13599a, rTypeRef);
                    i |= 8;
                    break;
                case 4:
                    optional3 = (Optional) compositeDecoderB.o(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getD(), optional3);
                    i |= 16;
                    break;
                case 5:
                    optional4 = (Optional) compositeDecoderB.o(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getD(), optional4);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new RField(i, strJ, optional, optional2, rTypeRef, optional3, optional4);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // kotlinx.serialization.SerializationStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r10, java.lang.Object r11) {
        /*
            r9 = this;
            com.apollographql.apollo.ast.introspection.RField r11 = (com.apollographql.apollo.ast.introspection.RField) r11
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.h(r11, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = com.apollographql.apollo.ast.introspection.RField$$serializer.descriptor
            kotlinx.serialization.encoding.CompositeEncoder r10 = r10.b(r0)
            kotlin.Lazy[] r1 = com.apollographql.apollo.ast.introspection.RField.g
            java.lang.String r2 = r11.f13590a
            com.apollographql.apollo.ast.introspection.Optional r3 = r11.f
            com.apollographql.apollo.ast.introspection.Optional r4 = r11.e
            com.apollographql.apollo.ast.introspection.Optional r5 = r11.c
            com.apollographql.apollo.ast.introspection.Optional r6 = r11.b
            r7 = 0
            r10.p(r0, r7, r2)
            r2 = 1
            boolean r7 = r10.q(r0, r2)
            com.apollographql.apollo.ast.introspection.Optional$Absent r8 = com.apollographql.apollo.ast.introspection.Optional.Absent.f13579a
            if (r7 == 0) goto L27
            goto L32
        L27:
            com.apollographql.apollo.ast.introspection.Optional$Companion r7 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r7.getClass()
            boolean r7 = kotlin.jvm.internal.Intrinsics.c(r6, r8)
            if (r7 != 0) goto L3d
        L32:
            r7 = r1[r2]
            java.lang.Object r7 = r7.getD()
            kotlinx.serialization.SerializationStrategy r7 = (kotlinx.serialization.SerializationStrategy) r7
            r10.F(r0, r2, r7, r6)
        L3d:
            r2 = 2
            boolean r6 = r10.q(r0, r2)
            if (r6 == 0) goto L45
            goto L50
        L45:
            com.apollographql.apollo.ast.introspection.Optional$Companion r6 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r6.getClass()
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r5, r8)
            if (r6 != 0) goto L5b
        L50:
            r6 = r1[r2]
            java.lang.Object r6 = r6.getD()
            kotlinx.serialization.SerializationStrategy r6 = (kotlinx.serialization.SerializationStrategy) r6
            r10.F(r0, r2, r6, r5)
        L5b:
            com.apollographql.apollo.ast.introspection.RTypeRef$$serializer r2 = com.apollographql.apollo.ast.introspection.RTypeRef$$serializer.f13599a
            com.apollographql.apollo.ast.introspection.RTypeRef r11 = r11.d
            r5 = 3
            r10.F(r0, r5, r2, r11)
            r11 = 4
            boolean r2 = r10.q(r0, r11)
            if (r2 == 0) goto L6b
            goto L76
        L6b:
            com.apollographql.apollo.ast.introspection.Optional$Companion r2 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r2.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r4, r8)
            if (r2 != 0) goto L81
        L76:
            r2 = r1[r11]
            java.lang.Object r2 = r2.getD()
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            r10.F(r0, r11, r2, r4)
        L81:
            r11 = 5
            boolean r2 = r10.q(r0, r11)
            if (r2 == 0) goto L89
            goto L94
        L89:
            com.apollographql.apollo.ast.introspection.Optional$Companion r2 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r2.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r3, r8)
            if (r2 != 0) goto L9f
        L94:
            r1 = r1[r11]
            java.lang.Object r1 = r1.getD()
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            r10.F(r0, r11, r1, r3)
        L9f:
            r10.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.ast.introspection.RField$$serializer.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
