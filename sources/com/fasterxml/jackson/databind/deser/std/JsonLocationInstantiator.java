package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* loaded from: classes4.dex */
public class JsonLocationInstantiator extends ValueInstantiator.Base {
    public static CreatorProperty I(String str, JavaType javaType, int i) {
        return new CreatorProperty(PropertyName.a(str), javaType, null, null, null, null, i, null, PropertyMetadata.k);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final SettableBeanProperty[] G(DeserializationConfig deserializationConfig) {
        JavaType javaTypeC = deserializationConfig.c(Integer.TYPE);
        JavaType javaTypeC2 = deserializationConfig.c(Long.TYPE);
        return new SettableBeanProperty[]{I("sourceRef", deserializationConfig.c(Object.class), 0), I("byteOffset", javaTypeC2, 1), I("charOffset", javaTypeC2, 2), I("lineNr", javaTypeC, 3), I("columnNr", javaTypeC, 4)};
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object u(DeserializationContext deserializationContext, Object[] objArr) {
        Object obj = objArr[0];
        ContentReference contentReference = obj instanceof ContentReference ? (ContentReference) obj : new ContentReference(-1, -1, obj, false);
        Object obj2 = objArr[1];
        long jLongValue = obj2 == null ? 0L : ((Number) obj2).longValue();
        Object obj3 = objArr[2];
        long jLongValue2 = obj3 != null ? ((Number) obj3).longValue() : 0L;
        Object obj4 = objArr[3];
        int iIntValue = obj4 == null ? 0 : ((Number) obj4).intValue();
        Object obj5 = objArr[4];
        return new JsonLocation(contentReference, jLongValue, jLongValue2, iIntValue, obj5 != null ? ((Number) obj5).intValue() : 0);
    }
}
