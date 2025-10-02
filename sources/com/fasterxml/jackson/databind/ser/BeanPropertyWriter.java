package com.fasterxml.jackson.databind.ser;

import YU.a;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class BeanPropertyWriter extends PropertyWriter implements Serializable {
    public final SerializedString f;
    public final PropertyName g;
    public final JavaType h;
    public final JavaType i;
    public JavaType j;
    public final transient Annotations k;
    public final AnnotatedMember l;
    public transient Method m;
    public transient Field n;
    public JsonSerializer o;
    public JsonSerializer p;
    public TypeSerializer q;
    public transient PropertySerializerMap r;
    public final boolean s;
    public final Object t;
    public final Class[] u;
    public final transient HashMap v;

    public BeanPropertyWriter(BeanPropertyDefinition beanPropertyDefinition, AnnotatedMember annotatedMember, Annotations annotations, JavaType javaType, JsonSerializer jsonSerializer, TypeSerializer typeSerializer, JavaType javaType2, boolean z, Object obj, Class[] clsArr) {
        super(beanPropertyDefinition.getMetadata());
        this.l = annotatedMember;
        this.k = annotations;
        this.f = new SerializedString(beanPropertyDefinition.getName());
        this.g = beanPropertyDefinition.x();
        this.h = javaType;
        this.o = jsonSerializer;
        this.r = jsonSerializer == null ? PropertySerializerMap.a() : null;
        this.q = typeSerializer;
        this.i = javaType2;
        if (annotatedMember instanceof AnnotatedField) {
            this.m = null;
            this.n = ((AnnotatedField) annotatedMember).f;
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this.m = ((AnnotatedMethod) annotatedMember).g;
            this.n = null;
        } else {
            this.m = null;
            this.n = null;
        }
        this.s = z;
        this.t = obj;
        this.p = null;
        this.u = clsArr;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public final AnnotatedMember a() {
        return this.l;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public final PropertyName b() {
        return new PropertyName(this.f.d, null);
    }

    public JsonSerializer e(PropertySerializerMap propertySerializerMap, Class cls, SerializerProvider serializerProvider) {
        PropertySerializerMap.SerializerAndMapResult serializerAndMapResult;
        JavaType javaType = this.j;
        if (javaType != null) {
            JavaType javaTypeN = serializerProvider.n(javaType, cls);
            propertySerializerMap.getClass();
            JsonSerializer jsonSerializerT = serializerProvider.t(javaTypeN, this);
            serializerAndMapResult = new PropertySerializerMap.SerializerAndMapResult(jsonSerializerT, propertySerializerMap.c(javaTypeN.d, jsonSerializerT));
        } else {
            propertySerializerMap.getClass();
            JsonSerializer jsonSerializerU = serializerProvider.u(cls, this);
            serializerAndMapResult = new PropertySerializerMap.SerializerAndMapResult(jsonSerializerU, propertySerializerMap.c(cls, jsonSerializerU));
        }
        PropertySerializerMap propertySerializerMap2 = serializerAndMapResult.b;
        if (propertySerializerMap != propertySerializerMap2) {
            this.r = propertySerializerMap2;
        }
        return serializerAndMapResult.f14312a;
    }

    public final boolean f(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer jsonSerializer) throws InvalidDefinitionException {
        if (jsonSerializer.i()) {
            return false;
        }
        if (serializerProvider.d.r(SerializationFeature.FAIL_ON_SELF_REFERENCES)) {
            if (!(jsonSerializer instanceof BeanSerializerBase)) {
                return false;
            }
            serializerProvider.j("Direct self-reference leading to cycle");
            throw null;
        }
        if (!serializerProvider.d.r(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this.p == null) {
            return true;
        }
        if (!jsonGenerator.f().d()) {
            jsonGenerator.T(this.f);
        }
        this.p.f(null, jsonGenerator, serializerProvider);
        return true;
    }

    public void g(JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = this.p;
        if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
            throw new IllegalStateException(a.i("Cannot override _nullSerializer: had a ", ClassUtil.f(this.p), ", trying to set to ", ClassUtil.f(jsonSerializer)));
        }
        this.p = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.util.Named
    public final String getName() {
        return this.f.d;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public final JavaType getType() {
        return this.h;
    }

    public void h(JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = this.o;
        if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
            throw new IllegalStateException(a.i("Cannot override _serializer: had a ", ClassUtil.f(this.o), ", trying to set to ", ClassUtil.f(jsonSerializer)));
        }
        this.o = jsonSerializer;
    }

    public BeanPropertyWriter i(NameTransformer nameTransformer) {
        SerializedString serializedString = this.f;
        String strB = nameTransformer.b(serializedString.d);
        return strB.equals(serializedString.d) ? this : new BeanPropertyWriter(this, PropertyName.a(strB));
    }

    public void j(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Method method = this.m;
        Object objInvoke = method == null ? this.n.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            JsonSerializer jsonSerializer = this.p;
            if (jsonSerializer != null) {
                jsonSerializer.f(null, jsonGenerator, serializerProvider);
                return;
            } else {
                jsonGenerator.Y();
                return;
            }
        }
        JsonSerializer jsonSerializerE = this.o;
        if (jsonSerializerE == null) {
            Class<?> cls = objInvoke.getClass();
            PropertySerializerMap propertySerializerMap = this.r;
            JsonSerializer jsonSerializerD = propertySerializerMap.d(cls);
            jsonSerializerE = jsonSerializerD == null ? e(propertySerializerMap, cls, serializerProvider) : jsonSerializerD;
        }
        Object obj2 = this.t;
        if (obj2 != null) {
            if (JsonInclude.Include.f == obj2) {
                if (jsonSerializerE.d(serializerProvider, objInvoke)) {
                    l(jsonGenerator, serializerProvider);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                l(jsonGenerator, serializerProvider);
                return;
            }
        }
        if (objInvoke == obj && f(jsonGenerator, serializerProvider, jsonSerializerE)) {
            return;
        }
        TypeSerializer typeSerializer = this.q;
        if (typeSerializer == null) {
            jsonSerializerE.f(objInvoke, jsonGenerator, serializerProvider);
        } else {
            jsonSerializerE.g(objInvoke, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    public void k(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Method method = this.m;
        Object objInvoke = method == null ? this.n.get(obj) : method.invoke(obj, null);
        SerializedString serializedString = this.f;
        Object obj2 = this.t;
        if (objInvoke == null) {
            if ((obj2 == null || !serializerProvider.F(obj2)) && this.p != null) {
                jsonGenerator.T(serializedString);
                this.p.f(null, jsonGenerator, serializerProvider);
                return;
            }
            return;
        }
        JsonSerializer jsonSerializerE = this.o;
        if (jsonSerializerE == null) {
            Class<?> cls = objInvoke.getClass();
            PropertySerializerMap propertySerializerMap = this.r;
            JsonSerializer jsonSerializerD = propertySerializerMap.d(cls);
            jsonSerializerE = jsonSerializerD == null ? e(propertySerializerMap, cls, serializerProvider) : jsonSerializerD;
        }
        if (obj2 != null) {
            if (JsonInclude.Include.f == obj2) {
                if (jsonSerializerE.d(serializerProvider, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && f(jsonGenerator, serializerProvider, jsonSerializerE)) {
            return;
        }
        jsonGenerator.T(serializedString);
        TypeSerializer typeSerializer = this.q;
        if (typeSerializer == null) {
            jsonSerializerE.f(objInvoke, jsonGenerator, serializerProvider);
        } else {
            jsonSerializerE.g(objInvoke, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    public final void l(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer jsonSerializer = this.p;
        if (jsonSerializer != null) {
            jsonSerializer.f(null, jsonGenerator, serializerProvider);
        } else {
            jsonGenerator.Y();
        }
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this.l;
        if (annotatedMember instanceof AnnotatedField) {
            this.m = null;
            this.n = (Field) annotatedMember.j();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this.m = (Method) annotatedMember.j();
            this.n = null;
        }
        if (this.o == null) {
            this.r = PropertySerializerMap.a();
        }
        return this;
    }

    public final String toString() {
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(40, "property '");
        sbO.append(this.f.d);
        sbO.append("' (");
        if (this.m != null) {
            sbO.append("via method ");
            sbO.append(this.m.getDeclaringClass().getName());
            sbO.append("#");
            sbO.append(this.m.getName());
        } else if (this.n != null) {
            sbO.append("field \"");
            sbO.append(this.n.getDeclaringClass().getName());
            sbO.append("#");
            sbO.append(this.n.getName());
        } else {
            sbO.append("virtual");
        }
        JsonSerializer jsonSerializer = this.o;
        if (jsonSerializer == null) {
            sbO.append(", no static serializer");
        } else {
            sbO.append(", static serializer of type ".concat(jsonSerializer.getClass().getName()));
        }
        sbO.append(')');
        return sbO.toString();
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, SerializedString serializedString) {
        super(beanPropertyWriter);
        this.f = serializedString;
        this.g = beanPropertyWriter.g;
        this.l = beanPropertyWriter.l;
        this.k = beanPropertyWriter.k;
        this.h = beanPropertyWriter.h;
        this.m = beanPropertyWriter.m;
        this.n = beanPropertyWriter.n;
        this.o = beanPropertyWriter.o;
        this.p = beanPropertyWriter.p;
        if (beanPropertyWriter.v != null) {
            this.v = new HashMap(beanPropertyWriter.v);
        }
        this.i = beanPropertyWriter.i;
        this.r = beanPropertyWriter.r;
        this.s = beanPropertyWriter.s;
        this.t = beanPropertyWriter.t;
        this.u = beanPropertyWriter.u;
        this.q = beanPropertyWriter.q;
        this.j = beanPropertyWriter.j;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super(beanPropertyWriter);
        this.f = new SerializedString(propertyName.d);
        this.g = beanPropertyWriter.g;
        this.k = beanPropertyWriter.k;
        this.h = beanPropertyWriter.h;
        this.l = beanPropertyWriter.l;
        this.m = beanPropertyWriter.m;
        this.n = beanPropertyWriter.n;
        this.o = beanPropertyWriter.o;
        this.p = beanPropertyWriter.p;
        if (beanPropertyWriter.v != null) {
            this.v = new HashMap(beanPropertyWriter.v);
        }
        this.i = beanPropertyWriter.i;
        this.r = beanPropertyWriter.r;
        this.s = beanPropertyWriter.s;
        this.t = beanPropertyWriter.t;
        this.u = beanPropertyWriter.u;
        this.q = beanPropertyWriter.q;
        this.j = beanPropertyWriter.j;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        this(beanPropertyWriter, beanPropertyWriter.f);
    }
}
