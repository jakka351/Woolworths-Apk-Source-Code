package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import YU.a;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class JvmProtoBufUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final ExtensionRegistryLite f24497a;

    static {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
        extensionRegistryLite.a(JvmProtoBuf.f24491a);
        extensionRegistryLite.a(JvmProtoBuf.b);
        extensionRegistryLite.a(JvmProtoBuf.c);
        extensionRegistryLite.a(JvmProtoBuf.d);
        extensionRegistryLite.a(JvmProtoBuf.e);
        extensionRegistryLite.a(JvmProtoBuf.f);
        extensionRegistryLite.a(JvmProtoBuf.g);
        extensionRegistryLite.a(JvmProtoBuf.h);
        extensionRegistryLite.a(JvmProtoBuf.i);
        extensionRegistryLite.a(JvmProtoBuf.j);
        extensionRegistryLite.a(JvmProtoBuf.k);
        extensionRegistryLite.a(JvmProtoBuf.l);
        extensionRegistryLite.a(JvmProtoBuf.m);
        extensionRegistryLite.a(JvmProtoBuf.n);
        f24497a = extensionRegistryLite;
    }

    public static JvmMemberSignature.Method a(ProtoBuf.Constructor proto, NameResolver nameResolver, TypeTable typeTable) {
        String strM;
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension constructorSignature = JvmProtoBuf.f24491a;
        Intrinsics.g(constructorSignature, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.a(proto, constructorSignature);
        String string = (jvmMethodSignature == null || (jvmMethodSignature.e & 1) != 1) ? "<init>" : nameResolver.getString(jvmMethodSignature.f);
        if (jvmMethodSignature == null || (jvmMethodSignature.e & 2) != 2) {
            List list = proto.h;
            Intrinsics.g(list, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (ProtoBuf.ValueParameter valueParameter : list2) {
                Intrinsics.e(valueParameter);
                String strE = e(ProtoTypeTableUtilKt.p(valueParameter, typeTable), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strM = CollectionsKt.M(arrayList, "", "(", ")V", null, 56);
        } else {
            strM = nameResolver.getString(jvmMethodSignature.g);
        }
        return new JvmMemberSignature.Method(string, strM);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN]
          (r4v2 java.lang.String) from 0x0055: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field b(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r4, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r5, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.h(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.h(r6, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.a(r4, r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.e
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = r0.f
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.e
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.f
            goto L3b
        L39:
            int r7 = r4.i
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.e
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.g
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.m(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field r6 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.b(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, boolean):kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field");
    }

    public static JvmMemberSignature.Method c(ProtoBuf.Function proto, NameResolver nameResolver, TypeTable typeTable) {
        String strO;
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension methodSignature = JvmProtoBuf.b;
        Intrinsics.g(methodSignature, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.a(proto, methodSignature);
        int i = (jvmMethodSignature == null || (jvmMethodSignature.e & 1) != 1) ? proto.i : jvmMethodSignature.f;
        if (jvmMethodSignature == null || (jvmMethodSignature.e & 2) != 2) {
            List listS = CollectionsKt.S(ProtoTypeTableUtilKt.j(proto, typeTable));
            List list = proto.r;
            Intrinsics.g(list, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (ProtoBuf.ValueParameter valueParameter : list2) {
                Intrinsics.e(valueParameter);
                arrayList.add(ProtoTypeTableUtilKt.p(valueParameter, typeTable));
            }
            ArrayList arrayListC0 = CollectionsKt.c0(arrayList, listS);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayListC0, 10));
            Iterator it = arrayListC0.iterator();
            while (it.hasNext()) {
                String strE = e((ProtoBuf.Type) it.next(), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(ProtoTypeTableUtilKt.l(proto, typeTable), nameResolver);
            if (strE2 == null) {
                return null;
            }
            strO = a.o(new StringBuilder(), CollectionsKt.M(arrayList2, "", "(", ")", null, 56), strE2);
        } else {
            strO = nameResolver.getString(jvmMethodSignature.g);
        }
        return new JvmMemberSignature.Method(nameResolver.getString(i), strO);
    }

    public static final boolean d(ProtoBuf.Property proto) {
        Intrinsics.h(proto, "proto");
        Flags.BooleanFlagField booleanFlagFieldA = JvmFlags.a();
        Object objF = proto.f(JvmProtoBuf.e);
        Intrinsics.g(objF, "getExtension(...)");
        return booleanFlagFieldA.e(((Number) objF).intValue()).booleanValue();
    }

    public static String e(ProtoBuf.Type type, NameResolver nameResolver) {
        if ((type.f & 16) == 16) {
            return ClassMapperLite.b(nameResolver.a(type.l));
        }
        return null;
    }

    public static final Pair f(String[] strArr, String[] strings) throws InvalidProtocolBufferException {
        Intrinsics.h(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.a(strArr));
        JvmNameResolver jvmNameResolverG = g(byteArrayInputStream, strings);
        AbstractParser abstractParser = (AbstractParser) ProtoBuf.Class.O;
        abstractParser.getClass();
        CodedInputStream codedInputStream = new CodedInputStream(byteArrayInputStream);
        MessageLite messageLite = (MessageLite) abstractParser.b(codedInputStream, f24497a);
        try {
            codedInputStream.a(0);
            AbstractParser.c(messageLite);
            return new Pair(jvmNameResolverG, (ProtoBuf.Class) messageLite);
        } catch (InvalidProtocolBufferException e) {
            e.d = messageLite;
            throw e;
        }
    }

    public static JvmNameResolver g(ByteArrayInputStream byteArrayInputStream, String[] strings) {
        JvmProtoBuf.StringTableTypes stringTableTypes = (JvmProtoBuf.StringTableTypes) ((AbstractParser) JvmProtoBuf.StringTableTypes.k).a(byteArrayInputStream, f24497a);
        Intrinsics.g(stringTableTypes, "parseDelimitedFrom(...)");
        Intrinsics.h(strings, "strings");
        List list = stringTableTypes.f;
        Set setL0 = list.isEmpty() ? EmptySet.d : CollectionsKt.L0(list);
        List<JvmProtoBuf.StringTableTypes.Record> list2 = stringTableTypes.e;
        Intrinsics.g(list2, "getRecordList(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list2) {
            int i = record.f;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        return new JvmNameResolver(strings, setL0, arrayList);
    }

    public static final Pair h(String[] data, String[] strings) throws InvalidProtocolBufferException {
        Intrinsics.h(data, "data");
        Intrinsics.h(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.a(data));
        JvmNameResolver jvmNameResolverG = g(byteArrayInputStream, strings);
        AbstractParser abstractParser = (AbstractParser) ProtoBuf.Package.o;
        abstractParser.getClass();
        CodedInputStream codedInputStream = new CodedInputStream(byteArrayInputStream);
        MessageLite messageLite = (MessageLite) abstractParser.b(codedInputStream, f24497a);
        try {
            codedInputStream.a(0);
            AbstractParser.c(messageLite);
            return new Pair(jvmNameResolverG, (ProtoBuf.Package) messageLite);
        } catch (InvalidProtocolBufferException e) {
            e.d = messageLite;
            throw e;
        }
    }
}
