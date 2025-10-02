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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/apollographql/apollo/ast/introspection/RDirective.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/apollographql/apollo/ast/introspection/RDirective;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class RDirective$$serializer implements GeneratedSerializer<RDirective> {

    /* renamed from: a, reason: collision with root package name */
    public static final RDirective$$serializer f13585a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RDirective$$serializer rDirective$$serializer = new RDirective$$serializer();
        f13585a = rDirective$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.apollographql.apollo.ast.introspection.RDirective", rDirective$$serializer, 5);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        pluginGeneratedSerialDescriptor.k(lqlqqlq.mmm006Dm006Dm, true);
        pluginGeneratedSerialDescriptor.k("locations", true);
        pluginGeneratedSerialDescriptor.k("args", true);
        pluginGeneratedSerialDescriptor.k("isRepeatable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RDirective.f;
        return new KSerializer[]{StringSerializer.f24821a, lazyArr[1].getD(), lazyArr[2].getD(), lazyArr[3].getD(), BooleanSerializer.f24779a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = RDirective.f;
        int i = 0;
        boolean zB = false;
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
            } else if (iU == 3) {
                optional3 = (Optional) compositeDecoderB.o(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getD(), optional3);
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
        return new RDirective(i, strJ, optional, optional2, optional3, zB);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // kotlinx.serialization.SerializationStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r9, java.lang.Object r10) {
        /*
            r8 = this;
            com.apollographql.apollo.ast.introspection.RDirective r10 = (com.apollographql.apollo.ast.introspection.RDirective) r10
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.h(r10, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = com.apollographql.apollo.ast.introspection.RDirective$$serializer.descriptor
            kotlinx.serialization.encoding.CompositeEncoder r9 = r9.b(r0)
            kotlin.Lazy[] r1 = com.apollographql.apollo.ast.introspection.RDirective.f
            java.lang.String r2 = r10.f13584a
            boolean r3 = r10.e
            com.apollographql.apollo.ast.introspection.Optional r4 = r10.d
            com.apollographql.apollo.ast.introspection.Optional r5 = r10.c
            com.apollographql.apollo.ast.introspection.Optional r10 = r10.b
            r6 = 0
            r9.p(r0, r6, r2)
            r2 = 1
            boolean r6 = r9.q(r0, r2)
            com.apollographql.apollo.ast.introspection.Optional$Absent r7 = com.apollographql.apollo.ast.introspection.Optional.Absent.f13579a
            if (r6 == 0) goto L27
            goto L32
        L27:
            com.apollographql.apollo.ast.introspection.Optional$Companion r6 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r6.getClass()
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r10, r7)
            if (r6 != 0) goto L3d
        L32:
            r6 = r1[r2]
            java.lang.Object r6 = r6.getD()
            kotlinx.serialization.SerializationStrategy r6 = (kotlinx.serialization.SerializationStrategy) r6
            r9.F(r0, r2, r6, r10)
        L3d:
            r10 = 2
            boolean r2 = r9.q(r0, r10)
            if (r2 == 0) goto L45
            goto L50
        L45:
            com.apollographql.apollo.ast.introspection.Optional$Companion r2 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r2.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r5, r7)
            if (r2 != 0) goto L5b
        L50:
            r2 = r1[r10]
            java.lang.Object r2 = r2.getD()
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            r9.F(r0, r10, r2, r5)
        L5b:
            r10 = 3
            boolean r2 = r9.q(r0, r10)
            if (r2 == 0) goto L63
            goto L6e
        L63:
            com.apollographql.apollo.ast.introspection.Optional$Companion r2 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r2.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r4, r7)
            if (r2 != 0) goto L79
        L6e:
            r1 = r1[r10]
            java.lang.Object r1 = r1.getD()
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            r9.F(r0, r10, r1, r4)
        L79:
            r10 = 4
            boolean r1 = r9.q(r0, r10)
            if (r1 == 0) goto L81
            goto L83
        L81:
            if (r3 == 0) goto L86
        L83:
            r9.o(r0, r10, r3)
        L86:
            r9.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.ast.introspection.RDirective$$serializer.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
