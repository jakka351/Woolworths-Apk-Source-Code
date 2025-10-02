package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.jsontype.DefaultBaseTypeLimitingValidator;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class StdTypeResolverBuilder implements TypeResolverBuilder<StdTypeResolverBuilder> {
    public JsonTypeInfo.Id d;
    public JsonTypeInfo.As e;
    public String f;
    public boolean g;
    public Class h;
    public TypeIdResolver i;

    /* renamed from: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14293a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonTypeInfo.Id.values().length];
            b = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonTypeInfo.As.values().length];
            f14293a = iArr2;
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14293a[0] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14293a[1] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14293a[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14293a[4] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public StdTypeResolverBuilder() {
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase a(com.fasterxml.jackson.databind.DeserializationConfig r9, com.fasterxml.jackson.databind.JavaType r10, java.util.Collection r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.a(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection):com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public final StdTypeResolverBuilder b(JsonTypeInfo.Id id, TypeIdResolver typeIdResolver) {
        if (id == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this.d = id;
        this.i = typeIdResolver;
        this.f = id.d;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public final StdTypeResolverBuilder c(Class cls) {
        this.h = cls;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeSerializerBase d(SerializationConfig serializationConfig, JavaType javaType, Collection collection) {
        if (this.d == JsonTypeInfo.Id.NONE || javaType.d.isPrimitive()) {
            return null;
        }
        if (this.d == JsonTypeInfo.Id.DEDUCTION) {
            return AsDeductionTypeSerializer.c;
        }
        TypeIdResolver typeIdResolverG = g(serializationConfig, javaType, h(serializationConfig), collection, true, false);
        int iOrdinal = this.e.ordinal();
        if (iOrdinal == 0) {
            return new AsPropertyTypeSerializer(typeIdResolverG, null, this.f);
        }
        if (iOrdinal == 1) {
            return new AsWrapperTypeSerializer(typeIdResolverG, null);
        }
        if (iOrdinal == 2) {
            return new AsArrayTypeSerializer(typeIdResolverG, null);
        }
        if (iOrdinal == 3) {
            return new AsExternalTypeSerializer(typeIdResolverG, null, this.f);
        }
        if (iOrdinal == 4) {
            return new AsExistingPropertyTypeSerializer(typeIdResolverG, null, this.f);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.e);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public final Class f() {
        return this.h;
    }

    public final TypeIdResolver g(MapperConfigBase mapperConfigBase, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator, Collection collection, boolean z, boolean z2) {
        ConcurrentHashMap concurrentHashMap;
        String name;
        TypeIdResolver typeIdResolver = this.i;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        JsonTypeInfo.Id id = this.d;
        if (id == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int iOrdinal = id.ordinal();
        HashMap map = null;
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new MinimalClassNameIdResolver(javaType, mapperConfigBase.e.d, polymorphicTypeValidator);
            }
            if (iOrdinal == 3) {
                if (z == z2) {
                    throw new IllegalArgumentException();
                }
                if (z) {
                    concurrentHashMap = new ConcurrentHashMap();
                } else {
                    map = new HashMap();
                    concurrentHashMap = new ConcurrentHashMap(4);
                }
                boolean zM = mapperConfigBase.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        NamedType namedType = (NamedType) it.next();
                        Class cls = namedType.d;
                        if (namedType.a()) {
                            name = namedType.f;
                        } else {
                            name = cls.getName();
                            int iLastIndexOf = name.lastIndexOf(46);
                            if (iLastIndexOf >= 0) {
                                name = name.substring(iLastIndexOf + 1);
                            }
                        }
                        if (z) {
                            concurrentHashMap.put(cls.getName(), name);
                        }
                        if (z2) {
                            if (zM) {
                                name = name.toLowerCase();
                            }
                            JavaType javaType2 = (JavaType) map.get(name);
                            if (javaType2 == null || !cls.isAssignableFrom(javaType2.d)) {
                                map.put(name, mapperConfigBase.c(cls));
                            }
                        }
                    }
                }
                return new TypeNameIdResolver(mapperConfigBase, javaType, concurrentHashMap, map);
            }
            if (iOrdinal != 4) {
                throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.d);
            }
        }
        return new ClassNameIdResolver(javaType, mapperConfigBase.e.d, polymorphicTypeValidator);
    }

    public PolymorphicTypeValidator h(MapperConfigBase mapperConfigBase) {
        mapperConfigBase.e.getClass();
        return mapperConfigBase.m(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES) ? new DefaultBaseTypeLimitingValidator() : LaissezFaireSubTypeValidator.d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public StdTypeResolverBuilder e(Class cls) {
        if (this.h == cls) {
            return this;
        }
        ClassUtil.H(StdTypeResolverBuilder.class, this, "withDefaultImpl");
        return new StdTypeResolverBuilder(this, cls);
    }

    public StdTypeResolverBuilder(StdTypeResolverBuilder stdTypeResolverBuilder, Class cls) {
        this.g = false;
        this.d = stdTypeResolverBuilder.d;
        this.e = stdTypeResolverBuilder.e;
        this.f = stdTypeResolverBuilder.f;
        this.g = stdTypeResolverBuilder.g;
        this.i = stdTypeResolverBuilder.i;
        this.h = cls;
    }
}
