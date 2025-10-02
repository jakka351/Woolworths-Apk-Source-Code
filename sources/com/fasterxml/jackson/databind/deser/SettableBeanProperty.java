package com.fasterxml.jackson.databind.deser;

import YU.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase implements Serializable {
    public static final FailingDeserializer p = new FailingDeserializer(Object.class);
    public final PropertyName f;
    public final JavaType g;
    public final transient Annotations h;
    public final JsonDeserializer i;
    public final TypeDeserializer j;
    public final NullValueProvider k;
    public String l;
    public ObjectIdInfo m;
    public ViewMatcher n;
    public int o;

    public static abstract class Delegating extends SettableBeanProperty {
        public final SettableBeanProperty q;

        public Delegating(SettableBeanProperty settableBeanProperty) {
            super(settableBeanProperty);
            this.q = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object B(Object obj, Object obj2) {
            return this.q.B(obj, obj2);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final SettableBeanProperty C(PropertyName propertyName) {
            SettableBeanProperty settableBeanProperty = this.q;
            SettableBeanProperty settableBeanPropertyC = settableBeanProperty.C(propertyName);
            return settableBeanPropertyC == settableBeanProperty ? this : F(settableBeanPropertyC);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final SettableBeanProperty D(NullValueProvider nullValueProvider) {
            SettableBeanProperty settableBeanProperty = this.q;
            SettableBeanProperty settableBeanPropertyD = settableBeanProperty.D(nullValueProvider);
            return settableBeanPropertyD == settableBeanProperty ? this : F(settableBeanPropertyD);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final SettableBeanProperty E(JsonDeserializer jsonDeserializer) {
            SettableBeanProperty settableBeanProperty = this.q;
            SettableBeanProperty settableBeanPropertyE = settableBeanProperty.E(jsonDeserializer);
            return settableBeanPropertyE == settableBeanProperty ? this : F(settableBeanPropertyE);
        }

        public abstract SettableBeanProperty F(SettableBeanProperty settableBeanProperty);

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
        public final AnnotatedMember a() {
            return this.q.a();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final void f(int i) {
            this.q.f(i);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
            this.q.h(jsonParser, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object i(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
            return this.q.i(jsonParser, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void k(DeserializationConfig deserializationConfig) {
            this.q.k(deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final int l() {
            return this.q.l();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final Class m() {
            return this.q.m();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final Object n() {
            return this.q.n();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final String o() {
            return this.q.o();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final ObjectIdInfo p() {
            return this.q.p();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final JsonDeserializer q() {
            return this.q.q();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final TypeDeserializer r() {
            return this.q.r();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final boolean s() {
            return this.q.s();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final boolean t() {
            return this.q.t();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final boolean u() {
            return this.q.u();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public final boolean x() {
            return this.q.x();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void z(Object obj, Object obj2) {
            this.q.z(obj, obj2);
        }
    }

    public SettableBeanProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations) {
        this(beanPropertyDefinition.b(), javaType, beanPropertyDefinition.x(), typeDeserializer, annotations, beanPropertyDefinition.getMetadata());
    }

    public abstract Object B(Object obj, Object obj2);

    public abstract SettableBeanProperty C(PropertyName propertyName);

    public abstract SettableBeanProperty D(NullValueProvider nullValueProvider);

    public abstract SettableBeanProperty E(JsonDeserializer jsonDeserializer);

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract AnnotatedMember a();

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public final PropertyName b() {
        return this.f;
    }

    public final void e(JsonParser jsonParser, Exception exc, Object obj) throws JsonMappingException {
        if (!(exc instanceof IllegalArgumentException)) {
            ClassUtil.F(exc);
            ClassUtil.G(exc);
            Throwable thS = ClassUtil.s(exc);
            throw new JsonMappingException(jsonParser, ClassUtil.i(thS), thS);
        }
        String strF = ClassUtil.f(obj);
        StringBuilder sb = new StringBuilder("Problem deserializing property '");
        sb.append(this.f.d);
        sb.append("' (expected type: ");
        sb.append(this.g);
        sb.append("; actual type: ");
        sb.append(strF);
        sb.append(")");
        String strI = ClassUtil.i(exc);
        if (strI != null) {
            sb.append(", problem: ");
            sb.append(strI);
        } else {
            sb.append(" (no error message provided)");
        }
        throw new JsonMappingException(jsonParser, sb.toString(), exc);
    }

    public void f(int i) {
        if (this.o == -1) {
            this.o = i;
            return;
        }
        throw new IllegalStateException("Property '" + this.f.d + "' already had index (" + this.o + "), trying to assign " + i);
    }

    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext) {
        boolean zA1 = jsonParser.a1(JsonToken.VALUE_NULL);
        NullValueProvider nullValueProvider = this.k;
        if (zA1) {
            return nullValueProvider.c(deserializationContext);
        }
        JsonDeserializer jsonDeserializer = this.i;
        TypeDeserializer typeDeserializer = this.j;
        if (typeDeserializer != null) {
            return jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
        }
        Object objE = jsonDeserializer.e(jsonParser, deserializationContext);
        return objE == null ? nullValueProvider.c(deserializationContext) : objE;
    }

    @Override // com.fasterxml.jackson.databind.util.Named
    public final String getName() {
        return this.f.d;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public final JavaType getType() {
        return this.g;
    }

    public abstract void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj);

    public abstract Object i(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj);

    public final Object j(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws InvalidDefinitionException {
        boolean zA1 = jsonParser.a1(JsonToken.VALUE_NULL);
        NullValueProvider nullValueProvider = this.k;
        if (zA1) {
            if (!NullsConstantProvider.a(nullValueProvider)) {
                return nullValueProvider.c(deserializationContext);
            }
        } else {
            if (this.j != null) {
                return deserializationContext.p(deserializationContext.e().k(obj.getClass()), this).f(jsonParser, deserializationContext, obj);
            }
            Object objF = this.i.f(jsonParser, deserializationContext, obj);
            if (objF != null) {
                return objF;
            }
            if (!NullsConstantProvider.a(nullValueProvider)) {
                return nullValueProvider.c(deserializationContext);
            }
        }
        return obj;
    }

    public void k(DeserializationConfig deserializationConfig) {
    }

    public int l() {
        throw new IllegalStateException(a.j("Internal error: no creator index for property '", this.f.d, "' (of type ", getClass().getName(), ")"));
    }

    public Class m() {
        return a().h();
    }

    public Object n() {
        return null;
    }

    public String o() {
        return this.l;
    }

    public ObjectIdInfo p() {
        return this.m;
    }

    public JsonDeserializer q() {
        FailingDeserializer failingDeserializer = p;
        JsonDeserializer jsonDeserializer = this.i;
        if (jsonDeserializer == failingDeserializer) {
            return null;
        }
        return jsonDeserializer;
    }

    public TypeDeserializer r() {
        return this.j;
    }

    public boolean s() {
        JsonDeserializer jsonDeserializer = this.i;
        return (jsonDeserializer == null || jsonDeserializer == p) ? false : true;
    }

    public boolean t() {
        return this.j != null;
    }

    public String toString() {
        return a.o(new StringBuilder("[property '"), this.f.d, "']");
    }

    public boolean u() {
        return this.n != null;
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return false;
    }

    public void y() {
    }

    public abstract void z(Object obj, Object obj2);

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, TypeDeserializer typeDeserializer, Annotations annotations, PropertyMetadata propertyMetadata) {
        String strA;
        super(propertyMetadata);
        this.o = -1;
        if (propertyName == null) {
            this.f = PropertyName.h;
        } else {
            String str = propertyName.d;
            if (!str.isEmpty() && (strA = InternCache.e.a(str)) != str) {
                propertyName = new PropertyName(strA, propertyName.e);
            }
            this.f = propertyName;
        }
        this.g = javaType;
        this.h = annotations;
        this.n = null;
        this.j = typeDeserializer != null ? typeDeserializer.f(this) : typeDeserializer;
        FailingDeserializer failingDeserializer = p;
        this.i = failingDeserializer;
        this.k = failingDeserializer;
    }

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyMetadata propertyMetadata, JsonDeserializer jsonDeserializer) {
        String strA;
        super(propertyMetadata);
        this.o = -1;
        String str = propertyName.d;
        if (!str.isEmpty() && (strA = InternCache.e.a(str)) != str) {
            propertyName = new PropertyName(strA, propertyName.e);
        }
        this.f = propertyName;
        this.g = javaType;
        this.h = null;
        this.n = null;
        this.j = null;
        this.i = jsonDeserializer;
        this.k = jsonDeserializer;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty) {
        super(settableBeanProperty);
        this.o = -1;
        this.f = settableBeanProperty.f;
        this.g = settableBeanProperty.g;
        this.h = settableBeanProperty.h;
        this.i = settableBeanProperty.i;
        this.j = settableBeanProperty.j;
        this.l = settableBeanProperty.l;
        this.o = settableBeanProperty.o;
        this.n = settableBeanProperty.n;
        this.k = settableBeanProperty.k;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, JsonDeserializer jsonDeserializer, NullValueProvider nullValueProvider) {
        super(settableBeanProperty);
        this.o = -1;
        this.f = settableBeanProperty.f;
        this.g = settableBeanProperty.g;
        this.h = settableBeanProperty.h;
        this.j = settableBeanProperty.j;
        this.l = settableBeanProperty.l;
        this.o = settableBeanProperty.o;
        FailingDeserializer failingDeserializer = p;
        if (jsonDeserializer == null) {
            this.i = failingDeserializer;
        } else {
            this.i = jsonDeserializer;
        }
        this.n = settableBeanProperty.n;
        this.k = nullValueProvider == failingDeserializer ? this.i : nullValueProvider;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, PropertyName propertyName) {
        super(settableBeanProperty);
        this.o = -1;
        this.f = propertyName;
        this.g = settableBeanProperty.g;
        this.h = settableBeanProperty.h;
        this.i = settableBeanProperty.i;
        this.j = settableBeanProperty.j;
        this.l = settableBeanProperty.l;
        this.o = settableBeanProperty.o;
        this.n = settableBeanProperty.n;
        this.k = settableBeanProperty.k;
    }
}
