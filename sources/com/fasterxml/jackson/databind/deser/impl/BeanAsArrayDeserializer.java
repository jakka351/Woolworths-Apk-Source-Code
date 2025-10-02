package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* loaded from: classes4.dex */
public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    public final BeanDeserializerBase B;
    public final SettableBeanProperty[] C;

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, SettableBeanProperty[] settableBeanPropertyArr) {
        super(beanDeserializerBase);
        this.B = beanDeserializerBase;
        this.C = settableBeanPropertyArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase H0(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayDeserializer(this.B.H0(beanPropertyMap), this.C);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase I0(Set set, Set set2) {
        return new BeanAsArrayDeserializer(this.B.I0(set, set2), this.C);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase J0() {
        return new BeanAsArrayDeserializer(this.B.J0(), this.C);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase K0(ObjectIdReader objectIdReader) {
        return new BeanAsArrayDeserializer(this.B.K0(objectIdReader), this.C);
    }

    public final void N0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        deserializationContext.F(l0(deserializationContext), jsonParser.e(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", ClassUtil.t(this.g), jsonParser.e());
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.x1()) {
            N0(jsonParser, deserializationContext);
            throw null;
        }
        boolean z = this.n;
        boolean z2 = this.t;
        int i = 0;
        SettableBeanProperty[] settableBeanPropertyArr = this.C;
        ValueInstantiator valueInstantiator = this.i;
        if (z) {
            Object objY = valueInstantiator.y(deserializationContext);
            jsonParser.U1(objY);
            int length = settableBeanPropertyArr.length;
            while (true) {
                JsonToken jsonTokenN1 = jsonParser.N1();
                JsonToken jsonToken = JsonToken.END_ARRAY;
                if (jsonTokenN1 == jsonToken) {
                    break;
                }
                if (i != length) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                    if (settableBeanProperty != null) {
                        try {
                            settableBeanProperty.h(jsonParser, deserializationContext, objY);
                        } catch (Exception e) {
                            BeanDeserializerBase.L0(deserializationContext, e, objY, settableBeanProperty.f.d);
                            throw null;
                        }
                    } else {
                        jsonParser.V1();
                    }
                    i++;
                } else {
                    if (!z2 && deserializationContext.N(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        deserializationContext.Z(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                        throw null;
                    }
                    do {
                        jsonParser.V1();
                    } while (jsonParser.N1() != JsonToken.END_ARRAY);
                }
            }
            return objY;
        }
        if (this.m) {
            return y0(jsonParser, deserializationContext);
        }
        Object objY2 = valueInstantiator.y(deserializationContext);
        jsonParser.U1(objY2);
        if (this.p != null) {
            G0(deserializationContext, objY2);
        }
        if (this.u) {
            deserializationContext.getClass();
        }
        int length2 = settableBeanPropertyArr.length;
        while (true) {
            JsonToken jsonTokenN12 = jsonParser.N1();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            if (jsonTokenN12 == jsonToken2) {
                break;
            }
            if (i != length2) {
                SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i];
                i++;
                if (settableBeanProperty2 != null) {
                    try {
                        settableBeanProperty2.h(jsonParser, deserializationContext, objY2);
                    } catch (Exception e2) {
                        BeanDeserializerBase.L0(deserializationContext, e2, objY2, settableBeanProperty2.f.d);
                        throw null;
                    }
                } else {
                    jsonParser.V1();
                }
            } else {
                if (!z2) {
                    deserializationContext.Z(this, jsonToken2, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                    throw null;
                }
                do {
                    jsonParser.V1();
                } while (jsonParser.N1() != JsonToken.END_ARRAY);
            }
        }
        return objY2;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        jsonParser.U1(obj);
        if (!jsonParser.x1()) {
            N0(jsonParser, deserializationContext);
            throw null;
        }
        if (this.p != null) {
            G0(deserializationContext, obj);
        }
        SettableBeanProperty[] settableBeanPropertyArr = this.C;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (true) {
            JsonToken jsonTokenN1 = jsonParser.N1();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenN1 == jsonToken) {
                break;
            }
            if (i != length) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.h(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        BeanDeserializerBase.L0(deserializationContext, e, obj, settableBeanProperty.f.d);
                        throw null;
                    }
                } else {
                    jsonParser.V1();
                }
                i++;
            } else {
                if (!this.t && deserializationContext.N(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.Z(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                    throw null;
                }
                do {
                    jsonParser.V1();
                } while (jsonParser.N1() != JsonToken.END_ARRAY);
            }
        }
        return obj;
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
        Object objA = null;
        while (jsonParser.N1() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i < length ? settableBeanPropertyArr[i] : null;
            if (settableBeanProperty == null) {
                jsonParser.V1();
            } else {
                PropertyName propertyName = settableBeanProperty.f;
                if (objA != null) {
                    try {
                        settableBeanProperty.h(jsonParser, deserializationContext, objA);
                    } catch (Exception e) {
                        BeanDeserializerBase.L0(deserializationContext, e, objA, propertyName.d);
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
                                objA = propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
                                jsonParser.U1(objA);
                                if (objA.getClass() != javaType.d) {
                                    deserializationContext.j("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type " + ClassUtil.t(javaType) + ", actual type " + ClassUtil.o(objA));
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
        if (objA != null) {
            return objA;
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
