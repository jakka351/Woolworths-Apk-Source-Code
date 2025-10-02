package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;

/* loaded from: classes4.dex */
public class JsonNodeDeserializer extends BaseNodeDeserializer<JsonNode> {
    public static final JsonNodeDeserializer j = new JsonNodeDeserializer(JsonNode.class, null);

    public static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        public static final ArrayDeserializer j = new ArrayDeserializer(ArrayNode.class, Boolean.TRUE);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            if (!jsonParser.x1()) {
                deserializationContext.E(jsonParser, ArrayNode.class);
                throw null;
            }
            JsonNodeFactory jsonNodeFactory = deserializationContext.f.n;
            jsonNodeFactory.getClass();
            ArrayNode arrayNode = new ArrayNode(jsonNodeFactory);
            q0(jsonParser, deserializationContext, jsonNodeFactory, new BaseNodeDeserializer.ContainerStack(), arrayNode);
            return arrayNode;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws MismatchedInputException {
            ArrayNode arrayNode = (ArrayNode) obj;
            if (jsonParser.x1()) {
                q0(jsonParser, deserializationContext, deserializationContext.f.n, new BaseNodeDeserializer.ContainerStack(), arrayNode);
                return arrayNode;
            }
            deserializationContext.E(jsonParser, ArrayNode.class);
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
        public final JsonDeserializer o0(boolean z, boolean z2) {
            return new ArrayDeserializer(this, z, z2);
        }
    }

    public static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        public static final ObjectDeserializer j = new ObjectDeserializer(ObjectNode.class, Boolean.TRUE);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            JsonNodeFactory jsonNodeFactory = deserializationContext.f.n;
            if (jsonParser.y1()) {
                jsonNodeFactory.getClass();
                ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
                q0(jsonParser, deserializationContext, jsonNodeFactory, new BaseNodeDeserializer.ContainerStack(), objectNode);
                return objectNode;
            }
            if (jsonParser.a1(JsonToken.FIELD_NAME)) {
                return r0(jsonParser, deserializationContext, jsonNodeFactory, new BaseNodeDeserializer.ContainerStack());
            }
            if (jsonParser.a1(JsonToken.END_OBJECT)) {
                jsonNodeFactory.getClass();
                return new ObjectNode(jsonNodeFactory);
            }
            deserializationContext.E(jsonParser, ObjectNode.class);
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws MismatchedInputException {
            ObjectNode objectNode = (ObjectNode) obj;
            if (jsonParser.y1() || jsonParser.a1(JsonToken.FIELD_NAME)) {
                return (ObjectNode) y0(jsonParser, deserializationContext, objectNode, new BaseNodeDeserializer.ContainerStack());
            }
            deserializationContext.E(jsonParser, ObjectNode.class);
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
        public final JsonDeserializer o0(boolean z, boolean z2) {
            return new ObjectDeserializer(this, z, z2);
        }
    }

    public static JsonDeserializer z0(Class cls) {
        return cls == ObjectNode.class ? ObjectDeserializer.j : cls == ArrayNode.class ? ArrayDeserializer.j : j;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public final Object c(DeserializationContext deserializationContext) {
        deserializationContext.f.n.getClass();
        return NullNode.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public final Object d(DeserializationContext deserializationContext) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        BaseNodeDeserializer.ContainerStack containerStack = new BaseNodeDeserializer.ContainerStack();
        JsonNodeFactory jsonNodeFactory = deserializationContext.f.n;
        int iF = jsonParser.f();
        if (iF == 1) {
            jsonNodeFactory.getClass();
            ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
            q0(jsonParser, deserializationContext, jsonNodeFactory, containerStack, objectNode);
            return objectNode;
        }
        if (iF == 2) {
            jsonNodeFactory.getClass();
            return new ObjectNode(jsonNodeFactory);
        }
        if (iF != 3) {
            return iF != 5 ? p0(jsonParser, deserializationContext) : r0(jsonParser, deserializationContext, jsonNodeFactory, containerStack);
        }
        jsonNodeFactory.getClass();
        ArrayNode arrayNode = new ArrayNode(jsonNodeFactory);
        q0(jsonParser, deserializationContext, jsonNodeFactory, containerStack, arrayNode);
        return arrayNode;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.b(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ boolean m() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ LogicalType n() {
        return LogicalType.h;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
    public final JsonDeserializer o0(boolean z, boolean z2) {
        return new JsonNodeDeserializer(this, z, z2);
    }
}
