package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ArrayNode extends ContainerNode<ArrayNode> implements Serializable {
    public final ArrayList e;

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this.e = new ArrayList();
    }

    public final void C(JsonNode jsonNode) {
        if (jsonNode == null) {
            this.d.getClass();
            jsonNode = NullNode.d;
        }
        this.e.add(jsonNode);
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final JsonToken d() {
        return JsonToken.START_ARRAY;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ArrayNode)) {
            return false;
        }
        return this.e.equals(((ArrayNode) obj).e);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base, com.fasterxml.jackson.databind.JsonSerializable
    public final void g(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_ARRAY, this));
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) ((JsonNode) it.next())).h(jsonGenerator, serializerProvider);
        }
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        jsonGenerator.a1(size, this);
        for (int i = 0; i < size; i++) {
            ((JsonNode) arrayList.get(i)).h(jsonGenerator, serializerProvider);
        }
        jsonGenerator.F();
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
        return this.e.iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode w(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.e;
        if (i < arrayList.size()) {
            return (JsonNode) arrayList.get(i);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType x() {
        return JsonNodeType.d;
    }
}
