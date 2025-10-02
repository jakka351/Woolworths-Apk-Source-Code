package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
abstract class NodeCursor extends JsonStreamContext {
    public final NodeCursor c;
    public String d;
    public Object e;

    public static final class ArrayCursor extends NodeCursor {
        public final Iterator f;
        public JsonNode g;

        public ArrayCursor(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(1, nodeCursor);
            this.f = jsonNode.t();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor, com.fasterxml.jackson.core.JsonStreamContext
        public final JsonStreamContext c() {
            return this.c;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final JsonNode i() {
            return this.g;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final JsonToken j() {
            Iterator it = this.f;
            if (!it.hasNext()) {
                this.g = null;
                return JsonToken.END_ARRAY;
            }
            this.b++;
            JsonNode jsonNode = (JsonNode) it.next();
            this.g = jsonNode;
            return jsonNode.d();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final ArrayCursor k() {
            return new ArrayCursor(this.g, this);
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final ObjectCursor l() {
            return new ObjectCursor(this.g, this);
        }
    }

    public static final class ObjectCursor extends NodeCursor {
        public final Iterator f;
        public Map.Entry g;
        public boolean h;

        public ObjectCursor(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(2, nodeCursor);
            this.f = jsonNode.u();
            this.h = true;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor, com.fasterxml.jackson.core.JsonStreamContext
        public final JsonStreamContext c() {
            return this.c;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final JsonNode i() {
            Map.Entry entry = this.g;
            if (entry == null) {
                return null;
            }
            return (JsonNode) entry.getValue();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final JsonToken j() {
            if (!this.h) {
                this.h = true;
                return ((JsonNode) this.g.getValue()).d();
            }
            Iterator it = this.f;
            if (!it.hasNext()) {
                this.d = null;
                this.g = null;
                return JsonToken.END_OBJECT;
            }
            this.b++;
            this.h = false;
            Map.Entry entry = (Map.Entry) it.next();
            this.g = entry;
            this.d = entry != null ? (String) entry.getKey() : null;
            return JsonToken.FIELD_NAME;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final ArrayCursor k() {
            return new ArrayCursor(i(), this);
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final ObjectCursor l() {
            return new ObjectCursor(i(), this);
        }
    }

    public static final class RootCursor extends NodeCursor {
        public JsonNode f;
        public boolean g;

        @Override // com.fasterxml.jackson.databind.node.NodeCursor, com.fasterxml.jackson.core.JsonStreamContext
        public final JsonStreamContext c() {
            return this.c;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final JsonNode i() {
            if (this.g) {
                return this.f;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final JsonToken j() {
            if (this.g) {
                this.f = null;
                return null;
            }
            this.b++;
            this.g = true;
            return this.f.d();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final ArrayCursor k() {
            return new ArrayCursor(this.f, this);
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public final ObjectCursor l() {
            return new ObjectCursor(this.f, this);
        }
    }

    public NodeCursor(int i, NodeCursor nodeCursor) {
        this.f14193a = i;
        this.b = -1;
        this.c = nodeCursor;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final String a() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final Object b() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public JsonStreamContext c() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final void g(Object obj) {
        this.e = obj;
    }

    public abstract JsonNode i();

    public abstract JsonToken j();

    public abstract ArrayCursor k();

    public abstract ObjectCursor l();
}
