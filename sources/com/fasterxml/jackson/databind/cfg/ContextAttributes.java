package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class ContextAttributes {
    public abstract Object a(Object obj);

    public abstract Impl b(IdentityHashMap identityHashMap);

    public static class Impl extends ContextAttributes implements Serializable {
        public static final Impl f;
        public static final Object g;
        public final Map d;
        public final transient HashMap e;

        static {
            Map map = Collections.EMPTY_MAP;
            f = new Impl();
            g = new Object();
        }

        public Impl() {
            this.d = Collections.EMPTY_MAP;
            this.e = null;
        }

        @Override // com.fasterxml.jackson.databind.cfg.ContextAttributes
        public final Object a(Object obj) {
            Object obj2;
            HashMap map = this.e;
            if (map == null || (obj2 = map.get(obj)) == null) {
                return Collections.EMPTY_MAP.get(obj);
            }
            if (obj2 == g) {
                return null;
            }
            return obj2;
        }

        @Override // com.fasterxml.jackson.databind.cfg.ContextAttributes
        public final Impl b(IdentityHashMap identityHashMap) {
            Map map = Collections.EMPTY_MAP;
            Object obj = StdSerializer.e;
            HashMap map2 = this.e;
            if (map2 != null) {
                map2.put(obj, identityHashMap);
                return this;
            }
            HashMap map3 = new HashMap();
            map3.put(obj, identityHashMap);
            return new Impl(map3);
        }

        public Impl(HashMap map) {
            this.d = Collections.EMPTY_MAP;
            this.e = map;
        }
    }
}
