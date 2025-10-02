package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.JacksonFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class JsonFactory extends TokenStreamFactory implements Versioned, Serializable {
    public static final int l;
    public static final int m;
    public static final int n;
    public static final SerializedString o;
    public final transient CharsToNameCanonicalizer d;
    public final transient ByteQuadsCanonicalizer e;
    public final int f;
    public final int g;
    public final int h;
    public ObjectCodec i;
    public final SerializableString j;
    public final char k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Feature implements JacksonFeature {
        public static final Feature d;
        public static final Feature e;
        public static final Feature f;
        public static final Feature g;
        public static final /* synthetic */ Feature[] h;

        static {
            Feature feature = new Feature("INTERN_FIELD_NAMES", 0);
            d = feature;
            Feature feature2 = new Feature("CANONICALIZE_FIELD_NAMES", 1);
            e = feature2;
            Feature feature3 = new Feature("FAIL_ON_SYMBOL_HASH_OVERFLOW", 2);
            f = feature3;
            Feature feature4 = new Feature("USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING", 3);
            g = feature4;
            h = new Feature[]{feature, feature2, feature3, feature4};
        }

        public static Feature valueOf(String str) {
            return (Feature) Enum.valueOf(Feature.class, str);
        }

        public static Feature[] values() {
            return (Feature[]) h.clone();
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public final int a() {
            return 1 << ordinal();
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public final boolean b() {
            return true;
        }

        public final boolean c(int i) {
            return (i & a()) != 0;
        }
    }

    static {
        int iA = 0;
        for (Feature feature : Feature.values()) {
            feature.getClass();
            iA |= feature.a();
        }
        l = iA;
        int i = 0;
        for (JsonParser.Feature feature2 : JsonParser.Feature.values()) {
            if (feature2.d) {
                i |= feature2.e;
            }
        }
        m = i;
        n = JsonGenerator.Feature.a();
        o = DefaultPrettyPrinter.k;
    }

    public JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.d = new CharsToNameCanonicalizer((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.e = new ByteQuadsCanonicalizer((((int) jCurrentTimeMillis2) + ((int) (jCurrentTimeMillis2 >>> 32))) | 1);
        this.f = l;
        this.g = m;
        this.h = n;
        this.j = o;
        this.i = objectCodec;
        this.f = jsonFactory.f;
        this.g = jsonFactory.g;
        this.h = jsonFactory.h;
        this.j = jsonFactory.j;
        this.k = jsonFactory.k;
    }

    public final IOContext a(ContentReference contentReference, boolean z) {
        return new IOContext(b(), contentReference, z);
    }

    public final BufferRecycler b() {
        return Feature.g.c(this.f) ? BufferRecyclers.a() : new BufferRecycler();
    }

    public Object readResolve() {
        return new JsonFactory(this, this.i);
    }

    public JsonFactory(ObjectMapper objectMapper) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.d = new CharsToNameCanonicalizer((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.e = new ByteQuadsCanonicalizer((((int) jCurrentTimeMillis2) + ((int) (jCurrentTimeMillis2 >>> 32))) | 1);
        this.f = l;
        this.g = m;
        this.h = n;
        this.j = o;
        this.i = objectMapper;
        this.k = '\"';
    }

    public JsonFactory() {
        this(null);
    }
}
