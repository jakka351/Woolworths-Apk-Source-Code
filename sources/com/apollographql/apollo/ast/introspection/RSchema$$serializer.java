package com.apollographql.apollo.ast.introspection;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/apollographql/apollo/ast/introspection/RSchema.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/apollographql/apollo/ast/introspection/RSchema;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class RSchema$$serializer implements GeneratedSerializer<RSchema> {

    /* renamed from: a, reason: collision with root package name */
    public static final RSchema$$serializer f13595a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RSchema$$serializer rSchema$$serializer = new RSchema$$serializer();
        f13595a = rSchema$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.apollographql.apollo.ast.introspection.RSchema", rSchema$$serializer, 6);
        pluginGeneratedSerialDescriptor.k(lqlqqlq.mmm006Dm006Dm, true);
        pluginGeneratedSerialDescriptor.k("types", false);
        pluginGeneratedSerialDescriptor.k("queryType", false);
        pluginGeneratedSerialDescriptor.k("mutationType", true);
        pluginGeneratedSerialDescriptor.k("subscriptionType", true);
        pluginGeneratedSerialDescriptor.k("directives", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RSchema.g;
        return new KSerializer[]{lazyArr[0].getD(), lazyArr[1].getD(), RTypeRoot$$serializer.f13601a, lazyArr[3].getD(), lazyArr[4].getD(), lazyArr[5].getD()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = RSchema.g;
        int i = 0;
        Optional optional = null;
        List list = null;
        RTypeRoot rTypeRoot = null;
        Optional optional2 = null;
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
                    optional = (Optional) compositeDecoderB.o(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getD(), optional);
                    i |= 1;
                    break;
                case 1:
                    list = (List) compositeDecoderB.o(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getD(), list);
                    i |= 2;
                    break;
                case 2:
                    rTypeRoot = (RTypeRoot) compositeDecoderB.o(serialDescriptor, 2, RTypeRoot$$serializer.f13601a, rTypeRoot);
                    i |= 4;
                    break;
                case 3:
                    optional2 = (Optional) compositeDecoderB.o(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getD(), optional2);
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
        return new RSchema(i, optional, list, rTypeRoot, optional2, optional3, optional4);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // kotlinx.serialization.SerializationStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r10, java.lang.Object r11) {
        /*
            r9 = this;
            com.apollographql.apollo.ast.introspection.RSchema r11 = (com.apollographql.apollo.ast.introspection.RSchema) r11
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.h(r11, r0)
            com.apollographql.apollo.ast.introspection.Optional r0 = r11.f13594a
            kotlinx.serialization.descriptors.SerialDescriptor r1 = com.apollographql.apollo.ast.introspection.RSchema$$serializer.descriptor
            kotlinx.serialization.encoding.CompositeEncoder r10 = r10.b(r1)
            kotlin.Lazy[] r2 = com.apollographql.apollo.ast.introspection.RSchema.g
            r3 = 0
            boolean r4 = r10.q(r1, r3)
            com.apollographql.apollo.ast.introspection.Optional$Absent r5 = com.apollographql.apollo.ast.introspection.Optional.Absent.f13579a
            if (r4 == 0) goto L1b
            goto L26
        L1b:
            com.apollographql.apollo.ast.introspection.Optional$Companion r4 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r4.getClass()
            boolean r4 = kotlin.jvm.internal.Intrinsics.c(r0, r5)
            if (r4 != 0) goto L31
        L26:
            r4 = r2[r3]
            java.lang.Object r4 = r4.getD()
            kotlinx.serialization.SerializationStrategy r4 = (kotlinx.serialization.SerializationStrategy) r4
            r10.F(r1, r3, r4, r0)
        L31:
            r0 = 1
            r3 = r2[r0]
            java.lang.Object r3 = r3.getD()
            kotlinx.serialization.SerializationStrategy r3 = (kotlinx.serialization.SerializationStrategy) r3
            java.util.List r4 = r11.b
            com.apollographql.apollo.ast.introspection.Optional r6 = r11.f
            com.apollographql.apollo.ast.introspection.Optional r7 = r11.e
            com.apollographql.apollo.ast.introspection.Optional r8 = r11.d
            r10.F(r1, r0, r3, r4)
            com.apollographql.apollo.ast.introspection.RTypeRoot$$serializer r0 = com.apollographql.apollo.ast.introspection.RTypeRoot$$serializer.f13601a
            com.apollographql.apollo.ast.introspection.RTypeRoot r11 = r11.c
            r3 = 2
            r10.F(r1, r3, r0, r11)
            r11 = 3
            boolean r0 = r10.q(r1, r11)
            if (r0 == 0) goto L55
            goto L60
        L55:
            com.apollographql.apollo.ast.introspection.Optional$Companion r0 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r0.getClass()
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r8, r5)
            if (r0 != 0) goto L6b
        L60:
            r0 = r2[r11]
            java.lang.Object r0 = r0.getD()
            kotlinx.serialization.SerializationStrategy r0 = (kotlinx.serialization.SerializationStrategy) r0
            r10.F(r1, r11, r0, r8)
        L6b:
            r11 = 4
            boolean r0 = r10.q(r1, r11)
            if (r0 == 0) goto L73
            goto L7e
        L73:
            com.apollographql.apollo.ast.introspection.Optional$Companion r0 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r0.getClass()
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r7, r5)
            if (r0 != 0) goto L89
        L7e:
            r0 = r2[r11]
            java.lang.Object r0 = r0.getD()
            kotlinx.serialization.SerializationStrategy r0 = (kotlinx.serialization.SerializationStrategy) r0
            r10.F(r1, r11, r0, r7)
        L89:
            r11 = 5
            boolean r0 = r10.q(r1, r11)
            if (r0 == 0) goto L91
            goto L9c
        L91:
            com.apollographql.apollo.ast.introspection.Optional$Companion r0 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r0.getClass()
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r6, r5)
            if (r0 != 0) goto La7
        L9c:
            r0 = r2[r11]
            java.lang.Object r0 = r0.getD()
            kotlinx.serialization.SerializationStrategy r0 = (kotlinx.serialization.SerializationStrategy) r0
            r10.F(r1, r11, r0, r6)
        La7:
            r10.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.ast.introspection.RSchema$$serializer.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
