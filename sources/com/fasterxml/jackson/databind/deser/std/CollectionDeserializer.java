package com.fasterxml.jackson.databind.deser.std;

import androidx.camera.core.impl.b;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>> implements ContextualDeserializer {
    public final JsonDeserializer k;
    public final TypeDeserializer l;
    public final ValueInstantiator m;
    public final JsonDeserializer n;

    public static final class CollectionReferring extends ReadableObjectId.Referring {
        public final CollectionReferringAccumulator b;
        public final ArrayList c;

        public CollectionReferring(CollectionReferringAccumulator collectionReferringAccumulator, UnresolvedForwardReference unresolvedForwardReference) {
            super(unresolvedForwardReference);
            this.c = new ArrayList();
            this.b = collectionReferringAccumulator;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public final void a(Object obj, Object obj2) {
            CollectionReferringAccumulator collectionReferringAccumulator = this.b;
            Iterator it = collectionReferringAccumulator.b.iterator();
            Collection collection = collectionReferringAccumulator.f14256a;
            while (it.hasNext()) {
                CollectionReferring collectionReferring = (CollectionReferring) it.next();
                boolean zEquals = obj.equals(collectionReferring.f14253a.h.b.f);
                ArrayList arrayList = collectionReferring.c;
                if (zEquals) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(arrayList);
                    return;
                }
                collection = arrayList;
            }
            throw new IllegalArgumentException(b.n(obj, "Trying to resolve a forward reference with id [", "] that wasn't previously seen as unresolved."));
        }
    }

    public static class CollectionReferringAccumulator {

        /* renamed from: a, reason: collision with root package name */
        public final Collection f14256a;
        public final ArrayList b = new ArrayList();

        public CollectionReferringAccumulator(Collection collection, Class cls) {
            this.f14256a = collection;
        }

        public final void a(Object obj) {
            ArrayList arrayList = this.b;
            if (arrayList.isEmpty()) {
                this.f14256a.add(obj);
            } else {
                ((CollectionReferring) YU.a.c(1, arrayList)).c.add(obj);
            }
        }
    }

    public CollectionDeserializer(CollectionType collectionType, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator) {
        this(collectionType, jsonDeserializer, typeDeserializer, valueInstantiator, null, null, null);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) throws InvalidDefinitionException {
        JsonDeserializer jsonDeserializer;
        JsonDeserializer jsonDeserializerP;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        JavaType javaType = this.g;
        ValueInstantiator valueInstantiator = this.m;
        if (valueInstantiator == null) {
            jsonDeserializer = null;
        } else {
            if (valueInstantiator.k()) {
                JavaType javaTypeF = valueInstantiator.F(deserializationConfig);
                if (javaTypeF == null) {
                    deserializationContext.j(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, valueInstantiator.getClass().getName()));
                    throw null;
                }
                jsonDeserializerP = deserializationContext.p(javaTypeF, beanProperty);
            } else {
                if (valueInstantiator.i()) {
                    JavaType javaTypeC = valueInstantiator.C(deserializationConfig);
                    if (javaTypeC == null) {
                        deserializationContext.j(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType, valueInstantiator.getClass().getName()));
                        throw null;
                    }
                    jsonDeserializerP = deserializationContext.p(javaTypeC, beanProperty);
                }
                jsonDeserializer = null;
            }
            jsonDeserializer = jsonDeserializerP;
        }
        JsonFormat.Value valueH0 = StdDeserializer.h0(deserializationContext, beanProperty, Collection.class);
        Boolean boolB = valueH0 != null ? valueH0.b(JsonFormat.Feature.d) : null;
        JsonDeserializer jsonDeserializer2 = this.k;
        JsonDeserializer jsonDeserializerG0 = StdDeserializer.g0(deserializationContext, beanProperty, jsonDeserializer2);
        JavaType javaTypeK = javaType.k();
        JsonDeserializer jsonDeserializerP2 = jsonDeserializerG0 == null ? deserializationContext.p(javaTypeK, beanProperty) : deserializationContext.C(jsonDeserializerG0, beanProperty, javaTypeK);
        TypeDeserializer typeDeserializer = this.l;
        TypeDeserializer typeDeserializerF = typeDeserializer != null ? typeDeserializer.f(beanProperty) : typeDeserializer;
        NullValueProvider nullValueProviderF0 = StdDeserializer.f0(deserializationContext, beanProperty, jsonDeserializerP2);
        return (Objects.equals(boolB, this.j) && nullValueProviderF0 == this.h && jsonDeserializer == this.n && jsonDeserializerP2 == jsonDeserializer2 && typeDeserializerF == typeDeserializer) ? this : t0(jsonDeserializer, jsonDeserializerP2, typeDeserializerF, nullValueProviderF0, boolB);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        CoercionAction coercionActionO;
        JsonDeserializer jsonDeserializer = this.n;
        if (jsonDeserializer != null) {
            return (Collection) this.m.z(deserializationContext, jsonDeserializer.e(jsonParser, deserializationContext));
        }
        if (jsonParser.x1()) {
            return q0(jsonParser, deserializationContext, r0(deserializationContext));
        }
        if (!jsonParser.a1(JsonToken.VALUE_STRING)) {
            return s0(jsonParser, deserializationContext, r0(deserializationContext));
        }
        String strK0 = jsonParser.k0();
        boolean zIsEmpty = strK0.isEmpty();
        CoercionAction coercionAction = CoercionAction.d;
        LogicalType logicalType = LogicalType.e;
        Class cls = this.d;
        if (zIsEmpty) {
            CoercionAction coercionActionN = deserializationContext.n(logicalType, cls, CoercionInputShape.i);
            if (coercionActionN != null && coercionActionN != coercionAction) {
                return (Collection) F(deserializationContext, coercionActionN);
            }
        } else if (StdDeserializer.I(strK0) && (coercionActionO = deserializationContext.o(logicalType, cls)) != coercionAction) {
            return (Collection) F(deserializationContext, coercionActionO);
        }
        return s0(jsonParser, deserializationContext, r0(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Collection collection = (Collection) obj;
        return jsonParser.x1() ? q0(jsonParser, deserializationContext, collection) : s0(jsonParser, deserializationContext, collection);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final ValueInstantiator i0() {
        return this.m;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return this.k == null && this.l == null && this.n == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.e;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public final JsonDeserializer o0() {
        return this.k;
    }

    public Collection q0(JsonParser jsonParser, DeserializationContext deserializationContext, Collection collection) throws JsonMappingException {
        Object objE;
        Object objE2;
        jsonParser.U1(collection);
        JsonDeserializer jsonDeserializer = this.k;
        ObjectIdReader objectIdReaderK = jsonDeserializer.k();
        NullValueProvider nullValueProvider = this.h;
        boolean z = this.i;
        TypeDeserializer typeDeserializer = this.l;
        if (objectIdReaderK == null) {
            while (true) {
                JsonToken jsonTokenN1 = jsonParser.N1();
                if (jsonTokenN1 == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenN1 != JsonToken.VALUE_NULL) {
                        objE = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                    } else if (!z) {
                        objE = nullValueProvider.c(deserializationContext);
                    }
                    collection.add(objE);
                } catch (Exception e) {
                    if (deserializationContext != null && !deserializationContext.N(DeserializationFeature.WRAP_EXCEPTIONS)) {
                        ClassUtil.G(e);
                    }
                    throw JsonMappingException.i(e, collection, collection.size());
                }
            }
        } else {
            if (!jsonParser.x1()) {
                return s0(jsonParser, deserializationContext, collection);
            }
            jsonParser.U1(collection);
            CollectionReferringAccumulator collectionReferringAccumulator = new CollectionReferringAccumulator(collection, this.g.k().d);
            while (true) {
                JsonToken jsonTokenN12 = jsonParser.N1();
                if (jsonTokenN12 == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                } catch (UnresolvedForwardReference e2) {
                    CollectionReferring collectionReferring = new CollectionReferring(collectionReferringAccumulator, e2);
                    collectionReferringAccumulator.b.add(collectionReferring);
                    e2.h.a(collectionReferring);
                } catch (Exception e3) {
                    if (deserializationContext != null && !deserializationContext.N(DeserializationFeature.WRAP_EXCEPTIONS)) {
                        ClassUtil.G(e3);
                    }
                    throw JsonMappingException.i(e3, collection, collection.size());
                }
                if (jsonTokenN12 != JsonToken.VALUE_NULL) {
                    objE2 = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                } else if (!z) {
                    objE2 = nullValueProvider.c(deserializationContext);
                }
                collectionReferringAccumulator.a(objE2);
            }
        }
        return collection;
    }

    public Collection r0(DeserializationContext deserializationContext) {
        return (Collection) this.m.y(deserializationContext);
    }

    public final Collection s0(JsonParser jsonParser, DeserializationContext deserializationContext, Collection collection) throws JsonMappingException {
        Object objE;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.j;
        if (bool2 != bool && (bool2 != null || !deserializationContext.N(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            deserializationContext.D(jsonParser, this.g);
            throw null;
        }
        try {
            if (!jsonParser.a1(JsonToken.VALUE_NULL)) {
                JsonDeserializer jsonDeserializer = this.k;
                TypeDeserializer typeDeserializer = this.l;
                objE = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
            } else {
                if (this.i) {
                    return collection;
                }
                objE = this.h.c(deserializationContext);
            }
            collection.add(objE);
            return collection;
        } catch (Exception e) {
            if (!deserializationContext.N(DeserializationFeature.WRAP_EXCEPTIONS)) {
                ClassUtil.G(e);
            }
            throw JsonMappingException.i(e, Object.class, collection.size());
        }
    }

    public CollectionDeserializer t0(JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        return new CollectionDeserializer(this.g, jsonDeserializer2, typeDeserializer, this.m, jsonDeserializer, nullValueProvider, bool);
    }

    public CollectionDeserializer(JavaType javaType, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator, JsonDeserializer jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType, nullValueProvider, bool);
        this.k = jsonDeserializer;
        this.l = typeDeserializer;
        this.m = valueInstantiator;
        this.n = jsonDeserializer2;
    }
}
