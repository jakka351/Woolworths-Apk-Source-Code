package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.JsonNodeFeature;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ObjectNode extends ContainerNode<ObjectNode> implements Serializable {
    public final LinkedHashMap e;

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this.e = new LinkedHashMap();
    }

    public final JsonNode C(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            this.d.getClass();
            jsonNode = NullNode.d;
        }
        return (JsonNode) this.e.put(str, jsonNode);
    }

    public final void D(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, boolean z, boolean z2) {
        for (Map.Entry entry : this.e.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (z) {
                baseJsonNode.getClass();
                if (!(baseJsonNode instanceof ArrayNode) || !baseJsonNode.isEmpty()) {
                }
            }
            if (!z2 || !baseJsonNode.y()) {
                jsonGenerator.U((String) entry.getKey());
                baseJsonNode.h(jsonGenerator, serializerProvider);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.START_OBJECT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return this.e.equals(((ObjectNode) obj).e);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base, com.fasterxml.jackson.databind.JsonSerializable
    public final void g(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        boolean z;
        boolean z2;
        if (serializerProvider != null) {
            SerializationConfig serializationConfig = serializerProvider.d;
            z = !serializationConfig.r(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
            JsonNodeFeature jsonNodeFeature = JsonNodeFeature.WRITE_NULL_PROPERTIES;
            DatatypeFeatures datatypeFeatures = serializationConfig.k;
            datatypeFeatures.getClass();
            jsonNodeFeature.getClass();
            z2 = !jsonNodeFeature.c(datatypeFeatures.d);
        } else {
            z = false;
            z2 = false;
        }
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_OBJECT, this));
        if (z || z2) {
            D(jsonGenerator, serializerProvider, z, z2);
        } else {
            for (Map.Entry entry : this.e.entrySet()) {
                JsonNode jsonNode = (JsonNode) entry.getValue();
                jsonGenerator.U((String) entry.getKey());
                jsonNode.h(jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (serializerProvider != null) {
            SerializationConfig serializationConfig = serializerProvider.d;
            boolean zR = serializationConfig.r(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
            boolean z = !zR;
            JsonNodeFeature jsonNodeFeature = JsonNodeFeature.WRITE_NULL_PROPERTIES;
            DatatypeFeatures datatypeFeatures = serializationConfig.k;
            datatypeFeatures.getClass();
            jsonNodeFeature.getClass();
            boolean zC = jsonNodeFeature.c(datatypeFeatures.d);
            boolean z2 = !zC;
            if (!zR || !zC) {
                jsonGenerator.x1(this);
                D(jsonGenerator, serializerProvider, z, z2);
                jsonGenerator.H();
                return;
            }
        }
        jsonGenerator.x1(this);
        for (Map.Entry entry : this.e.entrySet()) {
            JsonNode jsonNode = (JsonNode) entry.getValue();
            jsonGenerator.U((String) entry.getKey());
            jsonNode.h(jsonGenerator, serializerProvider);
        }
        jsonGenerator.H();
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int size() {
        return this.e.size();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final Iterator t() {
        return this.e.values().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final Iterator u() {
        return this.e.entrySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode w(int i) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType x() {
        return JsonNodeType.j;
    }
}
