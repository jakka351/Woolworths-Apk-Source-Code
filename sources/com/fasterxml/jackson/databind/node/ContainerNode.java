package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.node.ContainerNode;

/* loaded from: classes4.dex */
public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode implements JsonNodeCreator {
    public final JsonNodeFactory d;

    public ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this.d = jsonNodeFactory;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String k() {
        return "";
    }
}
