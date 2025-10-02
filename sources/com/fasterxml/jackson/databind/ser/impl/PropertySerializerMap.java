package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class PropertySerializerMap {

    public static final class Double extends PropertySerializerMap {

        /* renamed from: a, reason: collision with root package name */
        public final Class f14309a;
        public final Class b;
        public final JsonSerializer c;
        public final JsonSerializer d;

        public Double(PropertySerializerMap propertySerializerMap, Class cls, JsonSerializer jsonSerializer, Class cls2, JsonSerializer jsonSerializer2) {
            this.f14309a = cls;
            this.c = jsonSerializer;
            this.b = cls2;
            this.d = jsonSerializer2;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final PropertySerializerMap c(Class cls, JsonSerializer jsonSerializer) {
            return new Multi(this, new TypeAndSerializer[]{new TypeAndSerializer(this.f14309a, this.c), new TypeAndSerializer(this.b, this.d), new TypeAndSerializer(cls, jsonSerializer)});
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final JsonSerializer d(Class cls) {
            if (cls == this.f14309a) {
                return this.c;
            }
            if (cls == this.b) {
                return this.d;
            }
            return null;
        }
    }

    public static final class Empty extends PropertySerializerMap {

        /* renamed from: a, reason: collision with root package name */
        public static final Empty f14310a = new Empty();

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final PropertySerializerMap c(Class cls, JsonSerializer jsonSerializer) {
            return new Single(this, cls, jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final JsonSerializer d(Class cls) {
            return null;
        }
    }

    public static final class Multi extends PropertySerializerMap {

        /* renamed from: a, reason: collision with root package name */
        public final TypeAndSerializer[] f14311a;

        public Multi(PropertySerializerMap propertySerializerMap, TypeAndSerializer[] typeAndSerializerArr) {
            this.f14311a = typeAndSerializerArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final PropertySerializerMap c(Class cls, JsonSerializer jsonSerializer) {
            TypeAndSerializer[] typeAndSerializerArr = this.f14311a;
            int length = typeAndSerializerArr.length;
            if (length == 8) {
                return this;
            }
            TypeAndSerializer[] typeAndSerializerArr2 = (TypeAndSerializer[]) Arrays.copyOf(typeAndSerializerArr, length + 1);
            typeAndSerializerArr2[length] = new TypeAndSerializer(cls, jsonSerializer);
            return new Multi(this, typeAndSerializerArr2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[ORIG_RETURN, RETURN] */
        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.fasterxml.jackson.databind.JsonSerializer d(java.lang.Class r4) {
            /*
                r3 = this;
                r0 = 0
                com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$TypeAndSerializer[] r1 = r3.f14311a
                r0 = r1[r0]
                java.lang.Class r2 = r0.f14314a
                if (r2 != r4) goto Lc
                com.fasterxml.jackson.databind.JsonSerializer r4 = r0.b
                return r4
            Lc:
                r0 = 1
                r0 = r1[r0]
                java.lang.Class r2 = r0.f14314a
                if (r2 != r4) goto L16
                com.fasterxml.jackson.databind.JsonSerializer r4 = r0.b
                return r4
            L16:
                r0 = 2
                r0 = r1[r0]
                java.lang.Class r2 = r0.f14314a
                if (r2 != r4) goto L20
                com.fasterxml.jackson.databind.JsonSerializer r4 = r0.b
                return r4
            L20:
                int r0 = r1.length
                switch(r0) {
                    case 4: goto L4d;
                    case 5: goto L43;
                    case 6: goto L39;
                    case 7: goto L2f;
                    case 8: goto L25;
                    default: goto L24;
                }
            L24:
                goto L57
            L25:
                r0 = 7
                r0 = r1[r0]
                java.lang.Class r2 = r0.f14314a
                if (r2 != r4) goto L2f
                com.fasterxml.jackson.databind.JsonSerializer r4 = r0.b
                return r4
            L2f:
                r0 = 6
                r0 = r1[r0]
                java.lang.Class r2 = r0.f14314a
                if (r2 != r4) goto L39
                com.fasterxml.jackson.databind.JsonSerializer r4 = r0.b
                return r4
            L39:
                r0 = 5
                r0 = r1[r0]
                java.lang.Class r2 = r0.f14314a
                if (r2 != r4) goto L43
                com.fasterxml.jackson.databind.JsonSerializer r4 = r0.b
                return r4
            L43:
                r0 = 4
                r0 = r1[r0]
                java.lang.Class r2 = r0.f14314a
                if (r2 != r4) goto L4d
                com.fasterxml.jackson.databind.JsonSerializer r4 = r0.b
                return r4
            L4d:
                r0 = 3
                r0 = r1[r0]
                java.lang.Class r1 = r0.f14314a
                if (r1 != r4) goto L57
                com.fasterxml.jackson.databind.JsonSerializer r4 = r0.b
                return r4
            L57:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.Multi.d(java.lang.Class):com.fasterxml.jackson.databind.JsonSerializer");
        }
    }

    public static final class SerializerAndMapResult {

        /* renamed from: a, reason: collision with root package name */
        public final JsonSerializer f14312a;
        public final PropertySerializerMap b;

        public SerializerAndMapResult(JsonSerializer jsonSerializer, PropertySerializerMap propertySerializerMap) {
            this.f14312a = jsonSerializer;
            this.b = propertySerializerMap;
        }
    }

    public static final class Single extends PropertySerializerMap {

        /* renamed from: a, reason: collision with root package name */
        public final Class f14313a;
        public final JsonSerializer b;

        public Single(PropertySerializerMap propertySerializerMap, Class cls, JsonSerializer jsonSerializer) {
            this.f14313a = cls;
            this.b = jsonSerializer;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final PropertySerializerMap c(Class cls, JsonSerializer jsonSerializer) {
            return new Double(this, this.f14313a, this.b, cls, jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final JsonSerializer d(Class cls) {
            if (cls == this.f14313a) {
                return this.b;
            }
            return null;
        }
    }

    public static final class TypeAndSerializer {

        /* renamed from: a, reason: collision with root package name */
        public final Class f14314a;
        public final JsonSerializer b;

        public TypeAndSerializer(Class cls, JsonSerializer jsonSerializer) {
            this.f14314a = cls;
            this.b = jsonSerializer;
        }
    }

    public static PropertySerializerMap a() {
        return Empty.f14310a;
    }

    public final SerializerAndMapResult b(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer jsonSerializerP = serializerProvider.p(javaType, beanProperty);
        return new SerializerAndMapResult(jsonSerializerP, c(javaType.d, jsonSerializerP));
    }

    public abstract PropertySerializerMap c(Class cls, JsonSerializer jsonSerializer);

    public abstract JsonSerializer d(Class cls);
}
