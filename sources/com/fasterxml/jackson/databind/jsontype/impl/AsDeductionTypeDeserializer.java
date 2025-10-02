package com.fasterxml.jackson.databind.jsontype.impl;

import YU.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class AsDeductionTypeDeserializer extends AsPropertyTypeDeserializer {
    public static final BitSet p = new BitSet(0);
    public final HashMap n;
    public final HashMap o;

    public AsDeductionTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, JavaType javaType2, DeserializationConfig deserializationConfig, Collection collection) {
        super(javaType, typeIdResolver, null, false, javaType2, null);
        HashMap map = new HashMap();
        this.n = map;
        boolean zM = deserializationConfig.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap map2 = new HashMap();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            NamedType namedType = (NamedType) it.next();
            TypeFactory typeFactory = deserializationConfig.e.d;
            Class cls = namedType.d;
            List listU = ((BasicBeanDescription) deserializationConfig.q(typeFactory.k(cls))).u();
            BitSet bitSet = new BitSet(listU.size() + i);
            Iterator it2 = listU.iterator();
            while (it2.hasNext()) {
                String name = ((BeanPropertyDefinition) it2.next()).getName();
                name = zM ? name.toLowerCase() : name;
                Integer numValueOf = (Integer) map.get(name);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i);
                    map.put(name, Integer.valueOf(i));
                    i++;
                }
                bitSet.set(numValueOf.intValue());
            }
            String str = (String) map2.put(bitSet, cls.getName());
            if (str != null) {
                throw new IllegalStateException(a.j("Subtypes ", str, " and ", cls.getName(), " have the same signature and cannot be uniquely deduced."));
            }
        }
        this.o = map2;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str;
        JsonToken jsonTokenE = jsonParser.e();
        if (jsonTokenE == JsonToken.START_OBJECT) {
            jsonTokenE = jsonParser.N1();
        } else if (jsonTokenE != JsonToken.FIELD_NAME) {
            return q(jsonParser, deserializationContext, null, "Unexpected input");
        }
        JsonToken jsonToken = JsonToken.END_OBJECT;
        HashMap map = this.o;
        if (jsonTokenE == jsonToken && (str = (String) map.get(p)) != null) {
            return p(jsonParser, deserializationContext, null, str);
        }
        LinkedList linkedList = new LinkedList(map.keySet());
        TokenBuffer tokenBufferK = deserializationContext.k(jsonParser);
        boolean zM = deserializationContext.f.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenE == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            if (zM) {
                strD = strD.toLowerCase();
            }
            tokenBufferK.u2(jsonParser);
            Integer num = (Integer) this.n.get(strD);
            if (num != null) {
                int iIntValue = num.intValue();
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (!((BitSet) it.next()).get(iIntValue)) {
                        it.remove();
                    }
                }
                if (linkedList.size() == 1) {
                    return p(jsonParser, deserializationContext, tokenBufferK, (String) map.get(linkedList.get(0)));
                }
            }
            jsonTokenE = jsonParser.N1();
        }
        return q(jsonParser, deserializationContext, tokenBufferK, String.format("Cannot deduce unique subtype of %s (%d candidates match)", ClassUtil.t(this.e), Integer.valueOf(linkedList.size())));
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final TypeDeserializer f(BeanProperty beanProperty) {
        return beanProperty == this.f ? this : new AsDeductionTypeDeserializer(this, beanProperty);
    }

    public AsDeductionTypeDeserializer(AsDeductionTypeDeserializer asDeductionTypeDeserializer, BeanProperty beanProperty) {
        super(asDeductionTypeDeserializer, beanProperty);
        this.n = asDeductionTypeDeserializer.n;
        this.o = asDeductionTypeDeserializer.o;
    }
}
