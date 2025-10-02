package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class DeserializedDescriptorResolver {
    public static final Set b = SetsKt.i(KotlinClassHeader.Kind.h);
    public static final Set c = ArraysKt.r0(new KotlinClassHeader.Kind[]{KotlinClassHeader.Kind.i, KotlinClassHeader.Kind.l});
    public static final MetadataVersion d;
    public static final MetadataVersion e;

    /* renamed from: a, reason: collision with root package name */
    public DeserializationComponents f24468a;

    public static final class Companion {
    }

    static {
        new MetadataVersion(new int[]{1, 1, 2}, false);
        d = new MetadataVersion(new int[]{1, 1, 11}, false);
        e = new MetadataVersion(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope a(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r12, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r13) {
        /*
            r11 = this;
            java.lang.String r1 = "Could not read data from "
            java.lang.String r0 = "kotlinClass"
            kotlin.jvm.internal.Intrinsics.h(r13, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r13.a()
            java.lang.String[] r2 = r0.c
            if (r2 != 0) goto L11
            java.lang.String[] r2 = r0.d
        L11:
            r3 = 0
            if (r2 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = r0.f24478a
            java.util.Set r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.c
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r2 = r3
        L20:
            if (r2 != 0) goto L23
            goto L6d
        L23:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r13.a()
            java.lang.String[] r0 = r0.e
            if (r0 != 0) goto L2c
            goto L6d
        L2c:
            kotlin.Pair r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.h(r2, r0)     // Catch: java.lang.Throwable -> L31 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L33
            goto L6b
        L31:
            r0 = move-exception
            goto L4a
        L33:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r13.getLocation()     // Catch: java.lang.Throwable -> L31
            r4.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L31
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L31
            throw r2     // Catch: java.lang.Throwable -> L31
        L4a:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r1 = r11.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration$Default r1 = r1.c
            r1.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r13.a()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r1 = r1.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r2 = r11.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration$Default r2 = r2.c
            r2.getClass()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.g
            boolean r1 = r1.b(r2)
            if (r1 != 0) goto Lb0
            r0 = r3
        L6b:
            if (r0 != 0) goto L6e
        L6d:
            return r3
        L6e:
            java.lang.Object r1 = r0.d
            r5 = r1
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver r5 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver) r5
            java.lang.Object r0 = r0.e
            r4 = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r4
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource r7 = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource
            r11.d(r13)
            r11.e(r13)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r0 = r11.b(r13)
            r7.<init>(r13, r4, r5, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r13 = r13.a()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r6 = r13.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r8 = r11.c()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "scope for "
            r13.<init>(r0)
            r13.append(r7)
            java.lang.String r0 = " in "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r9 = r13.toString()
            kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$$Lambda$0 r10 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$$Lambda$0.d
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        Lb0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.a(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass):kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope");
    }

    public final DeserializedContainerAbiStability b(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        c().c.getClass();
        int i = kotlinJvmBinaryClass.a().g;
        return ((i & 16) == 0 || (i & 32) != 0) ? DeserializedContainerAbiStability.d : DeserializedContainerAbiStability.e;
    }

    public final DeserializationComponents c() {
        DeserializationComponents deserializationComponents = this.f24468a;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.p("components");
        throw null;
    }

    public final IncompatibleVersionErrorData d(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        c().c.getClass();
        MetadataVersion metadataVersion = kotlinJvmBinaryClass.a().b;
        c().c.getClass();
        MetadataVersion metadataVersion2 = MetadataVersion.g;
        if (metadataVersion.b(metadataVersion2)) {
            return null;
        }
        MetadataVersion metadataVersion3 = kotlinJvmBinaryClass.a().b;
        c().c.getClass();
        c().c.getClass();
        boolean z = kotlinJvmBinaryClass.a().b.f;
        metadataVersion2.getClass();
        MetadataVersion metadataVersion4 = z ? metadataVersion2 : MetadataVersion.h;
        int i = metadataVersion4.b;
        int i2 = metadataVersion2.b;
        return new IncompatibleVersionErrorData(metadataVersion3, metadataVersion2, metadataVersion2, (i <= i2 && (i < i2 || metadataVersion4.c <= metadataVersion2.c)) ? metadataVersion2 : metadataVersion4, kotlinJvmBinaryClass.getLocation(), kotlinJvmBinaryClass.c());
    }

    public final boolean e(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        c().c.getClass();
        c().c.getClass();
        return (kotlinJvmBinaryClass.a().g & 2) != 0 && kotlinJvmBinaryClass.a().b.equals(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData f(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Could not read data from "
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r6.a()
            java.lang.String[] r2 = r1.c
            if (r2 != 0) goto Lc
            java.lang.String[] r2 = r1.d
        Lc:
            r3 = 0
            if (r2 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = r1.f24478a
            java.util.Set r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.b
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            if (r2 != 0) goto L1e
            goto L68
        L1e:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r6.a()
            java.lang.String[] r1 = r1.e
            if (r1 != 0) goto L27
            goto L68
        L27:
            kotlin.Pair r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.f(r2, r1)     // Catch: java.lang.Throwable -> L2c kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L2e
            goto L66
        L2c:
            r0 = move-exception
            goto L45
        L2e:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r6.getLocation()     // Catch: java.lang.Throwable -> L2c
            r4.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L45:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r1 = r5.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration$Default r1 = r1.c
            r1.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r6.a()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r1 = r1.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r2 = r5.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration$Default r2 = r2.c
            r2.getClass()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.g
            boolean r1 = r1.b(r2)
            if (r1 != 0) goto L8c
            r0 = r3
        L66:
            if (r0 != 0) goto L69
        L68:
            return r3
        L69:
            java.lang.Object r1 = r0.d
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver) r1
            java.lang.Object r0 = r0.e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r0
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement r2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement
            r5.d(r6)
            r5.e(r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r3 = r5.b(r6)
            r2.<init>(r6, r3)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData r3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r6 = r6.a()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r6 = r6.b
            r3.<init>(r1, r0, r6, r2)
            return r3
        L8c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.f(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass):kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData");
    }
}
