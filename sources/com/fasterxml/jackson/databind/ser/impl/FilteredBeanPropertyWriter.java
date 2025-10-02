package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class FilteredBeanPropertyWriter {

    public static final class MultiView extends BeanPropertyWriter implements Serializable {
        public final BeanPropertyWriter w;
        public final Class[] x;

        public MultiView(BeanPropertyWriter beanPropertyWriter, Class[] clsArr) {
            super(beanPropertyWriter);
            this.w = beanPropertyWriter;
            this.x = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void g(JsonSerializer jsonSerializer) {
            this.w.g(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void h(JsonSerializer jsonSerializer) {
            this.w.h(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final BeanPropertyWriter i(NameTransformer nameTransformer) {
            return new MultiView(this.w.i(nameTransformer), this.x);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void j(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            serializerProvider.getClass();
            this.w.j(obj, jsonGenerator, serializerProvider);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void k(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            serializerProvider.getClass();
            this.w.k(obj, jsonGenerator, serializerProvider);
        }
    }

    public static final class SingleView extends BeanPropertyWriter implements Serializable {
        public final BeanPropertyWriter w;
        public final Class x;

        public SingleView(BeanPropertyWriter beanPropertyWriter, Class cls) {
            super(beanPropertyWriter);
            this.w = beanPropertyWriter;
            this.x = cls;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void g(JsonSerializer jsonSerializer) {
            this.w.g(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void h(JsonSerializer jsonSerializer) {
            this.w.h(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final BeanPropertyWriter i(NameTransformer nameTransformer) {
            return new SingleView(this.w.i(nameTransformer), this.x);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void j(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            serializerProvider.getClass();
            this.w.j(obj, jsonGenerator, serializerProvider);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void k(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            serializerProvider.getClass();
            this.w.k(obj, jsonGenerator, serializerProvider);
        }
    }

    public static BeanPropertyWriter a(BeanPropertyWriter beanPropertyWriter, Class[] clsArr) {
        return clsArr.length == 1 ? new SingleView(beanPropertyWriter, clsArr[0]) : new MultiView(beanPropertyWriter, clsArr);
    }
}
