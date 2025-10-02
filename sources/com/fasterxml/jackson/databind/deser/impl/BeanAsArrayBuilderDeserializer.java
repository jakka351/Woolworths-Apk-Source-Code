package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* loaded from: classes4.dex */
public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase {
    public final BeanDeserializerBase B;
    public final SettableBeanProperty[] C;
    public final AnnotatedMethod D;
    public final JavaType E;

    public BeanAsArrayBuilderDeserializer(BeanDeserializerBase beanDeserializerBase, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, AnnotatedMethod annotatedMethod) {
        super(beanDeserializerBase);
        this.B = beanDeserializerBase;
        this.E = javaType;
        this.C = settableBeanPropertyArr;
        this.D = annotatedMethod;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase H0(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayBuilderDeserializer(this.B.H0(beanPropertyMap), this.E, this.C, this.D);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase I0(Set set, Set set2) {
        return new BeanAsArrayBuilderDeserializer(this.B.I0(set, set2), this.E, this.C, this.D);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase J0() {
        return new BeanAsArrayBuilderDeserializer(this.B.J0(), this.E, this.C, this.D);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase K0(ObjectIdReader objectIdReader) {
        return new BeanAsArrayBuilderDeserializer(this.B.K0(objectIdReader), this.E, this.C, this.D);
    }

    public final Object N0(DeserializationContext deserializationContext, Object obj) throws IOException {
        try {
            return this.D.g.invoke(obj, null);
        } catch (Exception e) {
            M0(e, deserializationContext);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objY0;
        boolean zX1 = jsonParser.x1();
        JavaType javaType = this.g;
        if (!zX1) {
            deserializationContext.F(l0(deserializationContext), jsonParser.e(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", javaType.d.getName(), jsonParser.e());
            throw null;
        }
        boolean z = this.n;
        boolean z2 = this.t;
        int i = 0;
        SettableBeanProperty[] settableBeanPropertyArr = this.C;
        ValueInstantiator valueInstantiator = this.i;
        if (z) {
            Object objY = valueInstantiator.y(deserializationContext);
            int length = settableBeanPropertyArr.length;
            Object objI = objY;
            int i2 = 0;
            while (jsonParser.N1() != JsonToken.END_ARRAY) {
                if (i2 == length) {
                    if (z2 || !deserializationContext.N(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        while (jsonParser.N1() != JsonToken.END_ARRAY) {
                            jsonParser.V1();
                        }
                        return N0(deserializationContext, objI);
                    }
                    Class cls = javaType.d;
                    throw new MismatchedInputException(deserializationContext.i, String.format("Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length)));
                }
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i2];
                if (settableBeanProperty != null) {
                    try {
                        objI = settableBeanProperty.i(jsonParser, deserializationContext, objI);
                    } catch (Exception e) {
                        BeanDeserializerBase.L0(deserializationContext, e, objI, settableBeanProperty.f.d);
                        throw null;
                    }
                } else {
                    jsonParser.V1();
                }
                i2++;
            }
            return N0(deserializationContext, objI);
        }
        if (this.m) {
            objY0 = y0(jsonParser, deserializationContext);
        } else {
            Object objY2 = valueInstantiator.y(deserializationContext);
            if (this.p != null) {
                G0(deserializationContext, objY2);
            }
            if (this.u) {
                deserializationContext.getClass();
            }
            int length2 = settableBeanPropertyArr.length;
            while (true) {
                JsonToken jsonTokenN1 = jsonParser.N1();
                JsonToken jsonToken = JsonToken.END_ARRAY;
                if (jsonTokenN1 == jsonToken) {
                    break;
                }
                if (i != length2) {
                    SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i];
                    i++;
                    if (settableBeanProperty2 != null) {
                        try {
                            settableBeanProperty2.i(jsonParser, deserializationContext, objY2);
                        } catch (Exception e2) {
                            BeanDeserializerBase.L0(deserializationContext, e2, objY2, settableBeanProperty2.f.d);
                            throw null;
                        }
                    } else {
                        jsonParser.V1();
                    }
                } else {
                    if (!z2 && deserializationContext.N(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        deserializationContext.Z(this, jsonToken, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                        throw null;
                    }
                    while (jsonParser.N1() != JsonToken.END_ARRAY) {
                        jsonParser.V1();
                    }
                }
            }
            objY0 = objY2;
        }
        return N0(deserializationContext, objY0);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return this.B.f(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public final JsonDeserializer p(NameTransformer nameTransformer) {
        return this.B.p(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object p0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JavaType javaType = this.g;
        PropertyBasedCreator propertyBasedCreator = this.l;
        PropertyValueBuffer propertyValueBufferD = propertyBasedCreator.d(jsonParser, deserializationContext, this.z);
        SettableBeanProperty[] settableBeanPropertyArr = this.C;
        int length = settableBeanPropertyArr.length;
        if (this.u) {
            deserializationContext.getClass();
        }
        int i = 0;
        Object objI = null;
        while (jsonParser.N1() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i < length ? settableBeanPropertyArr[i] : null;
            if (settableBeanProperty == null) {
                jsonParser.V1();
            } else {
                PropertyName propertyName = settableBeanProperty.f;
                if (objI != null) {
                    try {
                        objI = settableBeanProperty.i(jsonParser, deserializationContext, objI);
                    } catch (Exception e) {
                        BeanDeserializerBase.L0(deserializationContext, e, objI, propertyName.d);
                        throw null;
                    }
                } else {
                    String str = propertyName.d;
                    SettableBeanProperty settableBeanPropertyC = propertyBasedCreator.c(str);
                    if (!propertyValueBufferD.f(str) || settableBeanPropertyC != null) {
                        if (settableBeanPropertyC == null) {
                            propertyValueBufferD.e(settableBeanProperty, settableBeanProperty.g(jsonParser, deserializationContext));
                        } else if (propertyValueBufferD.b(settableBeanPropertyC, settableBeanPropertyC.g(jsonParser, deserializationContext))) {
                            try {
                                objI = propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
                                if (objI.getClass() != javaType.d) {
                                    deserializationContext.j("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type " + ClassUtil.t(javaType) + ", actual type " + objI.getClass().getName());
                                    throw null;
                                }
                            } catch (Exception e2) {
                                BeanDeserializerBase.L0(deserializationContext, e2, javaType.d, str);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            i++;
        }
        if (objI != null) {
            return objI;
        }
        try {
            return propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
        } catch (Exception e3) {
            M0(e3, deserializationContext);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase t0() {
        return this;
    }
}
