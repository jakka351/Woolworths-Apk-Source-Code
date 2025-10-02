package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.util.Collection;

/* loaded from: classes4.dex */
public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements ContextualSerializer {
    public final Boolean f;

    public StaticListSerializerBase(Class cls) {
        super(cls, 0);
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonSerializer b(com.fasterxml.jackson.databind.SerializerProvider r6, com.fasterxml.jackson.databind.BeanProperty r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L1a
            com.fasterxml.jackson.databind.SerializationConfig r1 = r6.d
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r1.d()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r7.a()
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r1.d(r2)
            if (r1 == 0) goto L1a
            com.fasterxml.jackson.databind.JsonSerializer r1 = r6.I(r2, r1)
            goto L1b
        L1a:
            r1 = r0
        L1b:
            java.lang.Class r2 = r5.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = com.fasterxml.jackson.databind.ser.std.StdSerializer.k(r6, r7, r2)
            if (r2 == 0) goto L2a
            com.fasterxml.jackson.annotation.JsonFormat$Feature r3 = com.fasterxml.jackson.annotation.JsonFormat.Feature.f
            java.lang.Boolean r2 = r2.b(r3)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            com.fasterxml.jackson.databind.JsonSerializer r1 = com.fasterxml.jackson.databind.ser.std.StdSerializer.j(r6, r7, r1)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != 0) goto L37
            com.fasterxml.jackson.databind.JsonSerializer r1 = r6.q(r3, r7)
        L37:
            boolean r4 = com.fasterxml.jackson.databind.util.ClassUtil.x(r1)
            if (r4 == 0) goto L4b
            java.lang.Boolean r6 = r5.f
            boolean r6 = java.util.Objects.equals(r2, r6)
            if (r6 == 0) goto L46
            return r5
        L46:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r5.o(r7, r2)
            return r6
        L4b:
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r7 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            com.fasterxml.jackson.databind.type.TypeFactory r6 = r6.e()
            com.fasterxml.jackson.databind.JavaType r6 = r6.k(r3)
            r2 = 1
            r7.<init>(r6, r2, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.b(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        Collection collection = (Collection) obj;
        return collection == null || collection.isEmpty();
    }

    public abstract JsonSerializer o(BeanProperty beanProperty, Boolean bool);

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract void g(Collection collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer);

    public StaticListSerializerBase(StaticListSerializerBase staticListSerializerBase, Boolean bool) {
        super(staticListSerializerBase);
        this.f = bool;
    }
}
