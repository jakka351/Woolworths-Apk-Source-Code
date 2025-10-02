package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes4.dex */
public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public final Collection q0(JsonParser jsonParser, DeserializationContext deserializationContext, Collection collection) throws JsonMappingException {
        if (collection == null) {
            collection = new ArrayList();
        }
        Collection collectionQ0 = super.q0(jsonParser, deserializationContext, collection);
        return collectionQ0.isEmpty() ? new ArrayBlockingQueue(1, false) : new ArrayBlockingQueue(collectionQ0.size(), false, collectionQ0);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public final Collection r0(DeserializationContext deserializationContext) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public final CollectionDeserializer t0(JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        return new ArrayBlockingQueueDeserializer(this.g, jsonDeserializer2, typeDeserializer, this.m, jsonDeserializer, nullValueProvider, bool);
    }
}
