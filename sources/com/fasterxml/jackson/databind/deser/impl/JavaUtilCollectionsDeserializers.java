package com.fasterxml.jackson.databind.deser.impl;

import YU.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class JavaUtilCollectionsDeserializers {

    public static class JavaUtilCollectionsConverter implements Converter<Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final JavaType f14248a;
        public final int b;

        public JavaUtilCollectionsConverter(int i, JavaType javaType) {
            this.f14248a = javaType;
            this.b = i;
        }

        public static void d(int i) {
            if (i != 1) {
                throw new IllegalArgumentException(a.e(i, "Can not deserialize Singleton container from ", " entries"));
            }
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public final Object a(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.b) {
                case 1:
                    Set set = (Set) obj;
                    d(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    d(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    d(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                case 7:
                    return Collections.synchronizedSet((Set) obj);
                case 8:
                    return Collections.synchronizedCollection((Collection) obj);
                case 9:
                    return Collections.synchronizedList((List) obj);
                case 10:
                    return Collections.synchronizedMap((Map) obj);
                default:
                    return obj;
            }
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public final JavaType b(TypeFactory typeFactory) {
            return this.f14248a;
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public final JavaType c(TypeFactory typeFactory) {
            return this.f14248a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer a(com.fasterxml.jackson.databind.type.CollectionType r9) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.a(com.fasterxml.jackson.databind.type.CollectionType):com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer b(com.fasterxml.jackson.databind.type.MapType r7) {
        /*
            java.lang.Class r0 = r7.d
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.util.Collections$"
            boolean r1 = r0.startsWith(r1)
            r2 = 0
            if (r1 == 0) goto L16
            r1 = 22
            java.lang.String r1 = r0.substring(r1)
            goto L17
        L16:
            r1 = r2
        L17:
            r3 = 6
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.String r5 = "Map"
            if (r1 == 0) goto L86
            java.lang.String r0 = "Unmodifiable"
            boolean r0 = r1.startsWith(r0)
            r6 = 12
            if (r0 == 0) goto L2d
            java.lang.String r0 = r1.substring(r6)
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 == 0) goto L41
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto La8
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter r0 = new com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter
            com.fasterxml.jackson.databind.JavaType r7 = r7.i(r4)
            r0.<init>(r3, r7)
            goto La9
        L41:
            java.lang.String r0 = "Singleton"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L50
            r0 = 9
            java.lang.String r0 = r1.substring(r0)
            goto L51
        L50:
            r0 = r2
        L51:
            if (r0 == 0) goto L64
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto La8
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter r0 = new com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter
            com.fasterxml.jackson.databind.JavaType r7 = r7.i(r4)
            r1 = 3
            r0.<init>(r1, r7)
            goto La9
        L64:
            java.lang.String r0 = "Synchronized"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L71
            java.lang.String r0 = r1.substring(r6)
            goto L72
        L71:
            r0 = r2
        L72:
            if (r0 == 0) goto La8
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto La8
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter r0 = new com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter
            com.fasterxml.jackson.databind.JavaType r7 = r7.i(r4)
            r1 = 10
            r0.<init>(r1, r7)
            goto La9
        L86:
            java.lang.String r1 = "java.util.ImmutableCollections$"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L95
            r1 = 31
            java.lang.String r0 = r0.substring(r1)
            goto L96
        L95:
            r0 = r2
        L96:
            if (r0 == 0) goto La8
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto La8
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter r0 = new com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter
            com.fasterxml.jackson.databind.JavaType r7 = r7.i(r4)
            r0.<init>(r3, r7)
            goto La9
        La8:
            r0 = r2
        La9:
            if (r0 != 0) goto Lac
            return r2
        Lac:
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r7 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.b(com.fasterxml.jackson.databind.type.MapType):com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer");
    }
}
