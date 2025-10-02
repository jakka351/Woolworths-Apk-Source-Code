package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class BeanSerializerBuilder {
    public static final BeanPropertyWriter[] i = new BeanPropertyWriter[0];

    /* renamed from: a, reason: collision with root package name */
    public final BeanDescription f14303a;
    public SerializationConfig b;
    public List c = Collections.EMPTY_LIST;
    public BeanPropertyWriter[] d;
    public AnyGetterWriter e;
    public Object f;
    public AnnotatedMember g;
    public ObjectIdWriter h;

    public BeanSerializerBuilder(BeanDescription beanDescription) {
        this.f14303a = beanDescription;
    }

    public final BeanSerializer a() {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this.g != null && this.b.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.g.g(this.b.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        AnyGetterWriter anyGetterWriter = this.e;
        if (anyGetterWriter != null) {
            anyGetterWriter.b.g(this.b.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        List list = this.c;
        if (list == null || list.isEmpty()) {
            if (this.e == null && this.h == null) {
                return null;
            }
            beanPropertyWriterArr = i;
        } else {
            List list2 = this.c;
            beanPropertyWriterArr = (BeanPropertyWriter[]) list2.toArray(new BeanPropertyWriter[list2.size()]);
            if (this.b.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                    beanPropertyWriter.l.g(this.b.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                }
            }
        }
        BeanPropertyWriter[] beanPropertyWriterArr2 = this.d;
        if (beanPropertyWriterArr2 == null || beanPropertyWriterArr2.length == this.c.size()) {
            return new BeanSerializer(this.f14303a.f14226a, this, beanPropertyWriterArr, this.d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.c.size()), Integer.valueOf(this.d.length)));
    }
}
