package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* loaded from: classes4.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements ContextualSerializer {
    public final JavaType f;
    public final BeanProperty g;
    public final TypeSerializer h;
    public final JsonSerializer i;
    public final NameTransformer j;
    public transient PropertySerializerMap k;
    public final Object l;
    public final boolean m;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14321a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f14321a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14321a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14321a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14321a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14321a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14321a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ReferenceTypeSerializer(ReferenceType referenceType, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super(referenceType);
        this.f = referenceType.m;
        this.g = null;
        this.h = typeSerializer;
        this.i = jsonSerializer;
        this.j = null;
        this.l = null;
        this.m = false;
        this.k = PropertySerializerMap.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonSerializer b(com.fasterxml.jackson.databind.SerializerProvider r11, com.fasterxml.jackson.databind.BeanProperty r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.b(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        if (!r(obj)) {
            return true;
        }
        Object objP = p(obj);
        if (objP == null) {
            return this.m;
        }
        Object obj2 = this.l;
        if (obj2 == null) {
            return false;
        }
        JsonSerializer jsonSerializerO = this.i;
        if (jsonSerializerO == null) {
            try {
                jsonSerializerO = o(serializerProvider, objP.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        return obj2 == JsonInclude.Include.f ? jsonSerializerO.d(serializerProvider, objP) : obj2.equals(objP);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean e() {
        return this.j != null;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object objQ = q(obj);
        if (objQ == null) {
            if (this.j == null) {
                serializerProvider.o(jsonGenerator);
                return;
            }
            return;
        }
        JsonSerializer jsonSerializerO = this.i;
        if (jsonSerializerO == null) {
            jsonSerializerO = o(serializerProvider, objQ.getClass());
        }
        TypeSerializer typeSerializer = this.h;
        if (typeSerializer != null) {
            jsonSerializerO.g(objQ, jsonGenerator, serializerProvider, typeSerializer);
        } else {
            jsonSerializerO.f(objQ, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Object objQ = q(obj);
        if (objQ == null) {
            if (this.j == null) {
                serializerProvider.o(jsonGenerator);
            }
        } else {
            JsonSerializer jsonSerializerO = this.i;
            if (jsonSerializerO == null) {
                jsonSerializerO = o(serializerProvider, objQ.getClass());
            }
            jsonSerializerO.g(objQ, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final JsonSerializer h(NameTransformer nameTransformer) {
        JsonSerializer jsonSerializerH;
        JsonSerializer jsonSerializer = this.i;
        if (jsonSerializer != null) {
            jsonSerializerH = jsonSerializer.h(nameTransformer);
            if (jsonSerializerH != jsonSerializer) {
            }
            return this;
        }
        jsonSerializerH = jsonSerializer;
        NameTransformer nameTransformer2 = this.j;
        if (nameTransformer2 != null) {
            nameTransformer = new NameTransformer.Chained(nameTransformer, nameTransformer2);
        }
        if (jsonSerializer != jsonSerializerH || nameTransformer2 != nameTransformer) {
            return t(this.g, this.h, jsonSerializerH, nameTransformer);
        }
        return this;
    }

    public final JsonSerializer o(SerializerProvider serializerProvider, Class cls) {
        JsonSerializer jsonSerializerD = this.k.d(cls);
        if (jsonSerializerD != null) {
            return jsonSerializerD;
        }
        JavaType javaType = this.f;
        boolean zS = javaType.s();
        BeanProperty beanProperty = this.g;
        JsonSerializer jsonSerializerT = zS ? serializerProvider.t(serializerProvider.n(javaType, cls), beanProperty) : serializerProvider.u(cls, beanProperty);
        NameTransformer nameTransformer = this.j;
        if (nameTransformer != null) {
            jsonSerializerT = jsonSerializerT.h(nameTransformer);
        }
        this.k = this.k.c(cls, jsonSerializerT);
        return jsonSerializerT;
    }

    public abstract Object p(Object obj);

    public abstract Object q(Object obj);

    public abstract boolean r(Object obj);

    public abstract AtomicReferenceSerializer s(Object obj, boolean z);

    public abstract AtomicReferenceSerializer t(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, NameTransformer nameTransformer);

    public ReferenceTypeSerializer(AtomicReferenceSerializer atomicReferenceSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, NameTransformer nameTransformer, Object obj, boolean z) {
        super(atomicReferenceSerializer);
        this.f = atomicReferenceSerializer.f;
        this.k = PropertySerializerMap.a();
        this.g = beanProperty;
        this.h = typeSerializer;
        this.i = jsonSerializer;
        this.j = nameTransformer;
        this.l = obj;
        this.m = z;
    }
}
