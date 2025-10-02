package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
@SourceDebugExtension
/* loaded from: classes7.dex */
final /* synthetic */ class SerializersKt__SerializersKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.serialization.KSerializer a(kotlinx.serialization.modules.SerializersModule r6, kotlin.reflect.KType r7, boolean r8) {
        /*
            kotlin.reflect.KClass r0 = kotlinx.serialization.internal.Platform_commonKt.c(r7)
            boolean r1 = r7.l()
            java.util.List r7 = r7.getE()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.s(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r7.next()
            kotlin.reflect.KTypeProjection r3 = (kotlin.reflect.KTypeProjection) r3
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r3, r4)
            kotlin.reflect.KType r3 = r3.b
            if (r3 == 0) goto L36
            r2.add(r3)
            goto L1d
        L36:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Star projections in type arguments are not allowed, but had "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L4e:
            boolean r7 = r2.isEmpty()
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.d
            r4 = 0
            if (r7 == 0) goto L79
            boolean r7 = kotlinx.serialization.internal.PlatformKt.c(r0)
            if (r7 == 0) goto L65
            kotlinx.serialization.KSerializer r7 = r6.b(r0, r3)
            if (r7 == 0) goto L65
        L63:
            r7 = r4
            goto L98
        L65:
            kotlinx.serialization.internal.SerializerCache r7 = kotlinx.serialization.SerializersCacheKt.f24752a
            if (r1 != 0) goto L72
            kotlinx.serialization.internal.SerializerCache r7 = kotlinx.serialization.SerializersCacheKt.f24752a
            kotlinx.serialization.KSerializer r7 = r7.get(r0)
            if (r7 == 0) goto L63
            goto L98
        L72:
            kotlinx.serialization.internal.SerializerCache r7 = kotlinx.serialization.SerializersCacheKt.b
            kotlinx.serialization.KSerializer r7 = r7.get(r0)
            goto L98
        L79:
            boolean r7 = r6.getF()
            if (r7 == 0) goto L80
            goto L63
        L80:
            kotlinx.serialization.internal.SerializerCache r7 = kotlinx.serialization.SerializersCacheKt.f24752a
            if (r1 != 0) goto L8b
            kotlinx.serialization.internal.ParametrizedSerializerCache r7 = kotlinx.serialization.SerializersCacheKt.c
            java.lang.Object r7 = r7.a(r0, r2)
            goto L91
        L8b:
            kotlinx.serialization.internal.ParametrizedSerializerCache r7 = kotlinx.serialization.SerializersCacheKt.d
            java.lang.Object r7 = r7.a(r0, r2)
        L91:
            boolean r5 = r7 instanceof kotlin.Result.Failure
            if (r5 == 0) goto L96
            r7 = r4
        L96:
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7
        L98:
            if (r7 == 0) goto L9b
            return r7
        L9b:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto Lbc
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.SerializersKt.d(r0)
            if (r7 != 0) goto Le2
            kotlinx.serialization.KSerializer r7 = r6.b(r0, r3)
            if (r7 != 0) goto Le2
            boolean r6 = kotlinx.serialization.internal.PlatformKt.c(r0)
            if (r6 == 0) goto Lba
            kotlinx.serialization.PolymorphicSerializer r6 = new kotlinx.serialization.PolymorphicSerializer
            r6.<init>(r0)
        Lb8:
            r7 = r6
            goto Le2
        Lba:
            r7 = r4
            goto Le2
        Lbc:
            java.util.ArrayList r7 = kotlinx.serialization.SerializersKt.f(r6, r2, r8)
            if (r7 != 0) goto Lc3
            goto Lec
        Lc3:
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.g r8 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.g
            r3 = 1
            r8.<init>(r3, r2)
            kotlinx.serialization.KSerializer r8 = kotlinx.serialization.SerializersKt.a(r0, r7, r8)
            if (r8 != 0) goto Le1
            kotlinx.serialization.KSerializer r7 = r6.b(r0, r7)
            if (r7 != 0) goto Le2
            boolean r6 = kotlinx.serialization.internal.PlatformKt.c(r0)
            if (r6 == 0) goto Lba
            kotlinx.serialization.PolymorphicSerializer r6 = new kotlinx.serialization.PolymorphicSerializer
            r6.<init>(r0)
            goto Lb8
        Le1:
            r7 = r8
        Le2:
            if (r7 == 0) goto Lec
            if (r1 == 0) goto Leb
            kotlinx.serialization.KSerializer r6 = kotlinx.serialization.builtins.BuiltinSerializersKt.d(r7)
            return r6
        Leb:
            return r7
        Lec:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.SerializersKt__SerializersKt.a(kotlinx.serialization.modules.SerializersModule, kotlin.reflect.KType, boolean):kotlinx.serialization.KSerializer");
    }
}
