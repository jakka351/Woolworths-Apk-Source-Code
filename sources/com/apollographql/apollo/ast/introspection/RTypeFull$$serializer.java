package com.apollographql.apollo.ast.introspection;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/apollographql/apollo/ast/introspection/RTypeFull.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/apollographql/apollo/ast/introspection/RTypeFull;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class RTypeFull$$serializer implements GeneratedSerializer<RTypeFull> {

    /* renamed from: a, reason: collision with root package name */
    public static final RTypeFull$$serializer f13597a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RTypeFull$$serializer rTypeFull$$serializer = new RTypeFull$$serializer();
        f13597a = rTypeFull$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.apollographql.apollo.ast.introspection.RTypeFull", rTypeFull$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("kind", false);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        pluginGeneratedSerialDescriptor.k(lqlqqlq.mmm006Dm006Dm, true);
        pluginGeneratedSerialDescriptor.k("fields", true);
        pluginGeneratedSerialDescriptor.k("interfaces", true);
        pluginGeneratedSerialDescriptor.k("possibleTypes", true);
        pluginGeneratedSerialDescriptor.k("enumValues", true);
        pluginGeneratedSerialDescriptor.k("inputFields", true);
        pluginGeneratedSerialDescriptor.k("specifiedByURL", true);
        pluginGeneratedSerialDescriptor.k("isOneOf", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RTypeFull.k;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{lazyArr[0].getD(), stringSerializer, lazyArr[2].getD(), BuiltinSerializersKt.d((KSerializer) lazyArr[3].getD()), BuiltinSerializersKt.d((KSerializer) lazyArr[4].getD()), BuiltinSerializersKt.d((KSerializer) lazyArr[5].getD()), BuiltinSerializersKt.d((KSerializer) lazyArr[6].getD()), BuiltinSerializersKt.d((KSerializer) lazyArr[7].getD()), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(BooleanSerializer.f24779a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr2 = RTypeFull.k;
        String str = null;
        Boolean bool = null;
        RTypeKind rTypeKind = null;
        String strJ = null;
        Optional optional = null;
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
                    rTypeKind = (RTypeKind) compositeDecoderB.o(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getD(), rTypeKind);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    strJ = compositeDecoderB.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    optional = (Optional) compositeDecoderB.o(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getD(), optional);
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
        return new RTypeFull(i, rTypeKind, strJ, optional, list, list2, list3, list4, list5, str, bool);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    @Override // kotlinx.serialization.SerializationStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r14, java.lang.Object r15) {
        /*
            r13 = this;
            com.apollographql.apollo.ast.introspection.RTypeFull r15 = (com.apollographql.apollo.ast.introspection.RTypeFull) r15
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.h(r15, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = com.apollographql.apollo.ast.introspection.RTypeFull$$serializer.descriptor
            kotlinx.serialization.encoding.CompositeEncoder r14 = r14.b(r0)
            kotlin.Lazy[] r1 = com.apollographql.apollo.ast.introspection.RTypeFull.k
            r2 = 0
            r3 = r1[r2]
            java.lang.Object r3 = r3.getD()
            kotlinx.serialization.SerializationStrategy r3 = (kotlinx.serialization.SerializationStrategy) r3
            com.apollographql.apollo.ast.introspection.RTypeKind r4 = r15.f13596a
            java.lang.Boolean r5 = r15.j
            java.lang.String r6 = r15.i
            java.util.List r7 = r15.h
            java.util.List r8 = r15.g
            java.util.List r9 = r15.f
            java.util.List r10 = r15.e
            java.util.List r11 = r15.d
            com.apollographql.apollo.ast.introspection.Optional r12 = r15.c
            r14.F(r0, r2, r3, r4)
            r2 = 1
            java.lang.String r15 = r15.b
            r14.p(r0, r2, r15)
            r15 = 2
            boolean r2 = r14.q(r0, r15)
            if (r2 == 0) goto L3b
            goto L48
        L3b:
            com.apollographql.apollo.ast.introspection.Optional$Companion r2 = com.apollographql.apollo.ast.introspection.Optional.INSTANCE
            r2.getClass()
            com.apollographql.apollo.ast.introspection.Optional$Absent r2 = com.apollographql.apollo.ast.introspection.Optional.Absent.f13579a
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r12, r2)
            if (r2 != 0) goto L53
        L48:
            r2 = r1[r15]
            java.lang.Object r2 = r2.getD()
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            r14.F(r0, r15, r2, r12)
        L53:
            r15 = 3
            boolean r2 = r14.q(r0, r15)
            if (r2 == 0) goto L5b
            goto L5d
        L5b:
            if (r11 == 0) goto L68
        L5d:
            r2 = r1[r15]
            java.lang.Object r2 = r2.getD()
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            r14.w(r0, r15, r2, r11)
        L68:
            r15 = 4
            boolean r2 = r14.q(r0, r15)
            if (r2 == 0) goto L70
            goto L72
        L70:
            if (r10 == 0) goto L7d
        L72:
            r2 = r1[r15]
            java.lang.Object r2 = r2.getD()
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            r14.w(r0, r15, r2, r10)
        L7d:
            r15 = 5
            boolean r2 = r14.q(r0, r15)
            if (r2 == 0) goto L85
            goto L87
        L85:
            if (r9 == 0) goto L92
        L87:
            r2 = r1[r15]
            java.lang.Object r2 = r2.getD()
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            r14.w(r0, r15, r2, r9)
        L92:
            r15 = 6
            boolean r2 = r14.q(r0, r15)
            if (r2 == 0) goto L9a
            goto L9c
        L9a:
            if (r8 == 0) goto La7
        L9c:
            r2 = r1[r15]
            java.lang.Object r2 = r2.getD()
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2
            r14.w(r0, r15, r2, r8)
        La7:
            r15 = 7
            boolean r2 = r14.q(r0, r15)
            if (r2 == 0) goto Laf
            goto Lb1
        Laf:
            if (r7 == 0) goto Lbc
        Lb1:
            r1 = r1[r15]
            java.lang.Object r1 = r1.getD()
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            r14.w(r0, r15, r1, r7)
        Lbc:
            r15 = 8
            boolean r1 = r14.q(r0, r15)
            if (r1 == 0) goto Lc5
            goto Lc7
        Lc5:
            if (r6 == 0) goto Lcc
        Lc7:
            kotlinx.serialization.internal.StringSerializer r1 = kotlinx.serialization.internal.StringSerializer.f24821a
            r14.w(r0, r15, r1, r6)
        Lcc:
            r15 = 9
            boolean r1 = r14.q(r0, r15)
            if (r1 == 0) goto Ld5
            goto Ld7
        Ld5:
            if (r5 == 0) goto Ldc
        Ld7:
            kotlinx.serialization.internal.BooleanSerializer r1 = kotlinx.serialization.internal.BooleanSerializer.f24779a
            r14.w(r0, r15, r1, r5)
        Ldc:
            r14.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.ast.introspection.RTypeFull$$serializer.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
