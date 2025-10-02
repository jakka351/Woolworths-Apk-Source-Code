package com.fasterxml.jackson.databind.node;

/* loaded from: classes4.dex */
public abstract class NumericNode extends ValueNode {
    public abstract boolean C();

    public abstract int D();

    public boolean E() {
        return false;
    }

    public abstract long F();

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final long i() {
        return F();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final long j() {
        return F();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public abstract boolean o();

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType x() {
        return JsonNodeType.i;
    }
}
