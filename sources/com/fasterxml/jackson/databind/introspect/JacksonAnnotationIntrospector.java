package com.fasterxml.jackson.databind.introspect;

import YU.a;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonKey;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ext.Java7Support;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    public static final Class[] f = {JsonSerialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonRawValue.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class};
    public static final Class[] g = {JsonDeserialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class, JsonMerge.class};
    public static final Java7Support h;
    public transient LRUMap d;
    public boolean e;

    /* renamed from: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14275a;

        static {
            int[] iArr = new int[JsonSerialize.Inclusion.values().length];
            f14275a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14275a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14275a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14275a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14275a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        Java7Support java7Support;
        try {
            java7Support = Java7Support.f14267a;
        } catch (Throwable unused) {
            java7Support = null;
        }
        h = java7Support;
    }

    public static boolean A0(Class cls, Class cls2) {
        return cls.isPrimitive() ? cls == ClassUtil.C(cls2) : cls2.isPrimitive() && cls2 == ClassUtil.C(cls);
    }

    public static Class w0(Class cls) {
        if (cls == null || ClassUtil.v(cls)) {
            return null;
        }
        return cls;
    }

    public static JsonMappingException x0(IllegalArgumentException illegalArgumentException, String str) {
        return new JsonMappingException((Closeable) null, str, illegalArgumentException);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder y0(com.fasterxml.jackson.databind.cfg.MapperConfig r3, com.fasterxml.jackson.databind.introspect.Annotated r4, com.fasterxml.jackson.databind.JavaType r5) {
        /*
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo> r5 = com.fasterxml.jackson.annotation.JsonTypeInfo.class
            java.lang.annotation.Annotation r5 = r4.c(r5)
            com.fasterxml.jackson.annotation.JsonTypeInfo r5 = (com.fasterxml.jackson.annotation.JsonTypeInfo) r5
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonTypeResolver> r0 = com.fasterxml.jackson.databind.annotation.JsonTypeResolver.class
            java.lang.annotation.Annotation r0 = r4.c(r0)
            com.fasterxml.jackson.databind.annotation.JsonTypeResolver r0 = (com.fasterxml.jackson.databind.annotation.JsonTypeResolver) r0
            r1 = 0
            if (r0 == 0) goto L2c
            if (r5 != 0) goto L16
            goto L2e
        L16:
            java.lang.Class r0 = r0.value()
            com.fasterxml.jackson.databind.cfg.BaseSettings r2 = r3.e
            r2.getClass()
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r2 = r3.m(r2)
            java.lang.Object r0 = com.fasterxml.jackson.databind.util.ClassUtil.h(r0, r2)
            com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder r0 = (com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder) r0
            goto L48
        L2c:
            if (r5 != 0) goto L2f
        L2e:
            return r1
        L2f:
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r0 = r5.use()
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r2 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE
            if (r0 != r2) goto L43
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r3 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
            r3.<init>()
            r3.d = r2
            r3.i = r1
            r3.f = r1
            return r3
        L43:
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
            r0.<init>()
        L48:
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver> r2 = com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver.class
            java.lang.annotation.Annotation r2 = r4.c(r2)
            com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver r2 = (com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver) r2
            if (r2 != 0) goto L53
            goto L69
        L53:
            java.lang.Class r1 = r2.value()
            com.fasterxml.jackson.databind.cfg.BaseSettings r2 = r3.e
            r2.getClass()
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r3 = r3.m(r2)
            java.lang.Object r3 = com.fasterxml.jackson.databind.util.ClassUtil.h(r1, r3)
            r1 = r3
            com.fasterxml.jackson.databind.jsontype.TypeIdResolver r1 = (com.fasterxml.jackson.databind.jsontype.TypeIdResolver) r1
        L69:
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r3 = r5.use()
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r3 = r0.b(r3, r1)
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r0 = r5.include()
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.g
            if (r0 != r1) goto L7f
            boolean r4 = r4 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedClass
            if (r4 == 0) goto L7f
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r0 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.d
        L7f:
            if (r0 == 0) goto Lac
            r3.e = r0
            java.lang.String r4 = r5.property()
            if (r4 == 0) goto L8f
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L93
        L8f:
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r4 = r3.d
            java.lang.String r4 = r4.d
        L93:
            r3.f = r4
            java.lang.Class r4 = r5.defaultImpl()
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo$None> r0 = com.fasterxml.jackson.annotation.JsonTypeInfo.None.class
            if (r4 == r0) goto La5
            boolean r0 = r4.isAnnotation()
            if (r0 != 0) goto La5
            r3.h = r4
        La5:
            boolean r4 = r5.visible()
            r3.g = r4
            return r3
        Lac:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "includeAs cannot be null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.y0(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder");
    }

    public static boolean z0(JavaType javaType, Class cls) {
        return javaType.d.isPrimitive() ? javaType.u(ClassUtil.C(cls)) : cls.isPrimitive() && cls == ClassUtil.C(javaType.d);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final ObjectIdInfo B(Annotated annotated, ObjectIdInfo objectIdInfo) {
        JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) annotated.c(JsonIdentityReference.class);
        if (jsonIdentityReference == null) {
            return objectIdInfo;
        }
        if (objectIdInfo == null) {
            objectIdInfo = ObjectIdInfo.f;
        }
        boolean zAlwaysAsId = jsonIdentityReference.alwaysAsId();
        return objectIdInfo.e == zAlwaysAsId ? objectIdInfo : new ObjectIdInfo(objectIdInfo.f14277a, objectIdInfo.d, objectIdInfo.b, zAlwaysAsId, objectIdInfo.c);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Class C(AnnotatedClass annotatedClass) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotatedClass.m.a(JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return w0(jsonDeserialize.builder());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonPOJOBuilder.Value D(AnnotatedClass annotatedClass) {
        JsonPOJOBuilder jsonPOJOBuilder = (JsonPOJOBuilder) annotatedClass.m.a(JsonPOJOBuilder.class);
        if (jsonPOJOBuilder == null) {
            return null;
        }
        return new JsonPOJOBuilder.Value(jsonPOJOBuilder);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonProperty.Access E(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) annotatedMember.c(JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final List F(AnnotatedMember annotatedMember) {
        JsonAlias jsonAlias = (JsonAlias) annotatedMember.c(JsonAlias.class);
        if (jsonAlias == null) {
            return null;
        }
        String[] strArrValue = jsonAlias.value();
        int length = strArrValue.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArrValue) {
            arrayList.add(PropertyName.a(str));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final TypeResolverBuilder G(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.k() != null) {
            return y0(mapperConfig, annotatedMember, javaType);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String H(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) annotatedMember.c(JsonProperty.class);
        if (jsonProperty != null) {
            String strDefaultValue = jsonProperty.defaultValue();
            if (!strDefaultValue.isEmpty()) {
                return strDefaultValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String I(AnnotatedMember annotatedMember) {
        JsonPropertyDescription jsonPropertyDescription = (JsonPropertyDescription) annotatedMember.c(JsonPropertyDescription.class);
        if (jsonPropertyDescription == null) {
            return null;
        }
        return jsonPropertyDescription.value();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashSet] */
    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonIgnoreProperties.Value J(Annotated annotated) {
        ?? hashSet;
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) annotated.c(JsonIgnoreProperties.class);
        if (jsonIgnoreProperties == null) {
            return JsonIgnoreProperties.Value.i;
        }
        JsonIgnoreProperties.Value value = JsonIgnoreProperties.Value.i;
        String[] strArrValue = jsonIgnoreProperties.value();
        if (strArrValue == null || strArrValue.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                hashSet.add(str);
            }
        }
        Set set = hashSet;
        boolean zIgnoreUnknown = jsonIgnoreProperties.ignoreUnknown();
        boolean zAllowGetters = jsonIgnoreProperties.allowGetters();
        boolean zAllowSetters = jsonIgnoreProperties.allowSetters();
        return JsonIgnoreProperties.Value.a(set, zIgnoreUnknown, zAllowGetters, zAllowSetters, false) ? JsonIgnoreProperties.Value.i : new JsonIgnoreProperties.Value(set, zIgnoreUnknown, zAllowGetters, zAllowSetters, false);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonIgnoreProperties.Value K(Annotated annotated) {
        return J(annotated);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonInclude.Value L(Annotated annotated) {
        JsonInclude.Value value;
        JsonSerialize jsonSerialize;
        JsonInclude jsonInclude = (JsonInclude) annotated.c(JsonInclude.class);
        JsonInclude.Include include = JsonInclude.Include.h;
        if (jsonInclude == null) {
            value = JsonInclude.Value.h;
        } else {
            JsonInclude.Value value2 = JsonInclude.Value.h;
            JsonInclude.Include includeValue = jsonInclude.value();
            JsonInclude.Include includeContent = jsonInclude.content();
            if (includeValue == include && includeContent == include) {
                value = value2;
            } else {
                Class clsValueFilter = jsonInclude.valueFilter();
                if (clsValueFilter == Void.class) {
                    clsValueFilter = null;
                }
                Class clsContentFilter = jsonInclude.contentFilter();
                value = new JsonInclude.Value(includeValue, includeContent, clsValueFilter, clsContentFilter != Void.class ? clsContentFilter : null);
            }
        }
        if (value.d == include && (jsonSerialize = (JsonSerialize) annotated.c(JsonSerialize.class)) != null) {
            int iOrdinal = jsonSerialize.include().ordinal();
            if (iOrdinal == 0) {
                return value.b(JsonInclude.Include.d);
            }
            if (iOrdinal == 1) {
                return value.b(JsonInclude.Include.e);
            }
            if (iOrdinal == 2) {
                return value.b(JsonInclude.Include.g);
            }
            if (iOrdinal == 3) {
                return value.b(JsonInclude.Include.f);
            }
        }
        return value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashSet] */
    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonIncludeProperties.Value M(Annotated annotated) {
        ?? hashSet;
        JsonIncludeProperties jsonIncludeProperties = (JsonIncludeProperties) annotated.c(JsonIncludeProperties.class);
        if (jsonIncludeProperties == null) {
            return JsonIncludeProperties.Value.e;
        }
        String[] strArrValue = jsonIncludeProperties.value();
        if (strArrValue == null || strArrValue.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                hashSet.add(str);
            }
        }
        return new JsonIncludeProperties.Value(hashSet);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Integer N(AnnotatedMember annotatedMember) {
        int iIndex;
        JsonProperty jsonProperty = (JsonProperty) annotatedMember.c(JsonProperty.class);
        if (jsonProperty == null || (iIndex = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final TypeResolverBuilder O(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.z() || javaType.b()) {
            return null;
        }
        return y0(mapperConfig, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final AnnotationIntrospector.ReferenceProperty P(AnnotatedMember annotatedMember) {
        JsonManagedReference jsonManagedReference = (JsonManagedReference) annotatedMember.c(JsonManagedReference.class);
        if (jsonManagedReference != null) {
            return new AnnotationIntrospector.ReferenceProperty(AnnotationIntrospector.ReferenceProperty.Type.d, jsonManagedReference.value());
        }
        JsonBackReference jsonBackReference = (JsonBackReference) annotatedMember.c(JsonBackReference.class);
        if (jsonBackReference == null) {
            return null;
        }
        return new AnnotationIntrospector.ReferenceProperty(AnnotationIntrospector.ReferenceProperty.Type.e, jsonBackReference.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final PropertyName Q() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final PropertyName R(AnnotatedClass annotatedClass) {
        JsonRootName jsonRootName = (JsonRootName) annotatedClass.m.a(JsonRootName.class);
        if (jsonRootName == null) {
            return null;
        }
        String strNamespace = jsonRootName.namespace();
        return PropertyName.b(jsonRootName.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object S(AnnotatedMember annotatedMember) {
        Class clsW0;
        JsonSerialize jsonSerialize = (JsonSerialize) annotatedMember.c(JsonSerialize.class);
        if (jsonSerialize == null || (clsW0 = w0(jsonSerialize.contentConverter())) == null || clsW0 == Converter.None.class) {
            return null;
        }
        return clsW0;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object T(Annotated annotated) {
        Class clsW0;
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.c(JsonSerialize.class);
        if (jsonSerialize == null || (clsW0 = w0(jsonSerialize.converter())) == null || clsW0 == Converter.None.class) {
            return null;
        }
        return clsW0;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String[] U(AnnotatedClass annotatedClass) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) annotatedClass.m.a(JsonPropertyOrder.class);
        if (jsonPropertyOrder == null) {
            return null;
        }
        return jsonPropertyOrder.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean V(Annotated annotated) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) annotated.c(JsonPropertyOrder.class);
        if (jsonPropertyOrder == null || !jsonPropertyOrder.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonSerialize.Typing W(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.c(JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object X(Annotated annotated) {
        Class clsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.c(JsonSerialize.class);
        if (jsonSerialize != null && (clsUsing = jsonSerialize.using()) != JsonSerializer.None.class) {
            return clsUsing;
        }
        JsonRawValue jsonRawValue = (JsonRawValue) annotated.c(JsonRawValue.class);
        if (jsonRawValue == null || !jsonRawValue.value()) {
            return null;
        }
        return new RawSerializer(annotated.e(), 0);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonSetter.Value Y(AnnotatedMember annotatedMember) {
        JsonSetter jsonSetter = (JsonSetter) annotatedMember.c(JsonSetter.class);
        JsonSetter.Value value = JsonSetter.Value.f;
        if (jsonSetter == null) {
            return value;
        }
        Nulls nulls = jsonSetter.nulls();
        Nulls nullsContentNulls = jsonSetter.contentNulls();
        Nulls nulls2 = Nulls.g;
        if (nulls == null) {
            nulls = nulls2;
        }
        if (nullsContentNulls == null) {
            nullsContentNulls = nulls2;
        }
        return (nulls == nulls2 && nullsContentNulls == nulls2) ? value : new JsonSetter.Value(nulls, nullsContentNulls);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final List Z(Annotated annotated) {
        JsonSubTypes jsonSubTypes = (JsonSubTypes) annotated.c(JsonSubTypes.class);
        if (jsonSubTypes == null) {
            return null;
        }
        JsonSubTypes.Type[] typeArrValue = jsonSubTypes.value();
        if (!jsonSubTypes.failOnRepeatedNames()) {
            ArrayList arrayList = new ArrayList(typeArrValue.length);
            for (JsonSubTypes.Type type : typeArrValue) {
                arrayList.add(new NamedType(type.value(), type.name()));
                for (String str : type.names()) {
                    arrayList.add(new NamedType(type.value(), str));
                }
            }
            return arrayList;
        }
        String strD = annotated.d();
        ArrayList arrayList2 = new ArrayList(typeArrValue.length);
        HashSet hashSet = new HashSet();
        for (JsonSubTypes.Type type2 : typeArrValue) {
            String strName = type2.name();
            if (!strName.isEmpty() && hashSet.contains(strName)) {
                throw new IllegalArgumentException(a.j("Annotated type [", strD, "] got repeated subtype name [", strName, "]"));
            }
            hashSet.add(strName);
            arrayList2.add(new NamedType(type2.value(), strName));
            for (String str2 : type2.names()) {
                if (!str2.isEmpty() && hashSet.contains(str2)) {
                    throw new IllegalArgumentException(a.j("Annotated type [", strD, "] got repeated subtype name [", str2, "]"));
                }
                hashSet.add(str2);
                arrayList2.add(new NamedType(type2.value(), str2));
            }
        }
        return arrayList2;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final void a(MapperConfig mapperConfig, AnnotatedClass annotatedClass, ArrayList arrayList) {
        JsonInclude.Include include;
        JsonInclude.Value value;
        JsonInclude.Value value2;
        Annotation annotationA = annotatedClass.m.a(JsonAppend.class);
        Class cls = annotatedClass.e;
        JsonAppend jsonAppend = (JsonAppend) annotationA;
        if (jsonAppend == null) {
            return;
        }
        boolean zPrepend = jsonAppend.prepend();
        JsonAppend.Attr[] attrArrAttrs = jsonAppend.attrs();
        int length = attrArrAttrs.length;
        JavaType javaTypeC = null;
        int i = 0;
        while (true) {
            include = JsonInclude.Include.h;
            if (i >= length) {
                break;
            }
            if (javaTypeC == null) {
                javaTypeC = mapperConfig.c(Object.class);
            }
            JsonAppend.Attr attr = attrArrAttrs[i];
            PropertyMetadata propertyMetadata = attr.required() ? PropertyMetadata.k : PropertyMetadata.l;
            String strValue = attr.value();
            String strPropName = attr.propName();
            String strPropNamespace = attr.propNamespace();
            PropertyName propertyNameA = strPropName.isEmpty() ? PropertyName.g : (strPropNamespace == null || strPropNamespace.isEmpty()) ? PropertyName.a(strPropName) : PropertyName.b(strPropName, strPropNamespace);
            if (!propertyNameA.c()) {
                propertyNameA = PropertyName.a(strValue);
            }
            PropertyName propertyName = propertyNameA;
            VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(annotatedClass, cls, strValue, javaTypeC);
            JsonInclude.Include include2 = attr.include();
            int i2 = SimpleBeanPropertyDefinition.j;
            if (include2 == null || include2 == include) {
                value2 = BeanPropertyDefinition.d;
            } else {
                JsonInclude.Value value3 = JsonInclude.Value.h;
                value2 = include2 != include ? new JsonInclude.Value(include2, null, null, null) : JsonInclude.Value.h;
            }
            AttributePropertyWriter attributePropertyWriter = new AttributePropertyWriter(strValue, new SimpleBeanPropertyDefinition(mapperConfig.d(), virtualAnnotatedMember, propertyName, propertyMetadata, value2), annotatedClass.m, javaTypeC);
            if (zPrepend) {
                arrayList.add(i, attributePropertyWriter);
            } else {
                arrayList.add(attributePropertyWriter);
            }
            i++;
        }
        JsonAppend.Prop[] propArrProps = jsonAppend.props();
        if (propArrProps.length > 0) {
            JsonAppend.Prop prop = propArrProps[0];
            PropertyMetadata propertyMetadata2 = prop.required() ? PropertyMetadata.k : PropertyMetadata.l;
            String strName = prop.name();
            String strNamespace = prop.namespace();
            PropertyName propertyNameA2 = strName.isEmpty() ? PropertyName.g : (strNamespace == null || strNamespace.isEmpty()) ? PropertyName.a(strName) : PropertyName.b(strName, strNamespace);
            VirtualAnnotatedMember virtualAnnotatedMember2 = new VirtualAnnotatedMember(annotatedClass, cls, propertyNameA2.d, mapperConfig.c(prop.type()));
            JsonInclude.Include include3 = prop.include();
            int i3 = SimpleBeanPropertyDefinition.j;
            if (include3 == null || include3 == include) {
                value = BeanPropertyDefinition.d;
            } else {
                JsonInclude.Value value4 = JsonInclude.Value.h;
                value = include3 != include ? new JsonInclude.Value(include3, null, null, null) : JsonInclude.Value.h;
            }
            new SimpleBeanPropertyDefinition(mapperConfig.d(), virtualAnnotatedMember2, propertyNameA2, propertyMetadata2, value);
            Class clsValue = prop.value();
            mapperConfig.e.getClass();
            ((VirtualBeanPropertyWriter) ClassUtil.h(clsValue, mapperConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS))).n();
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String a0(AnnotatedClass annotatedClass) {
        JsonTypeName jsonTypeName = (JsonTypeName) annotatedClass.m.a(JsonTypeName.class);
        if (jsonTypeName == null) {
            return null;
        }
        return jsonTypeName.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final VisibilityChecker b(AnnotatedClass annotatedClass, VisibilityChecker visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) annotatedClass.m.a(JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.c(jsonAutoDetect);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final TypeResolverBuilder b0(JavaType javaType, MapperConfig mapperConfig, AnnotatedClass annotatedClass) {
        return y0(mapperConfig, annotatedClass, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object c(Annotated annotated) {
        Class clsContentUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.c(JsonDeserialize.class);
        if (jsonDeserialize == null || (clsContentUsing = jsonDeserialize.contentUsing()) == JsonDeserializer.None.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final NameTransformer c0(AnnotatedMember annotatedMember) {
        JsonUnwrapped jsonUnwrapped = (JsonUnwrapped) annotatedMember.c(JsonUnwrapped.class);
        if (jsonUnwrapped == null || !jsonUnwrapped.enabled()) {
            return null;
        }
        return NameTransformer.a(jsonUnwrapped.prefix(), jsonUnwrapped.suffix());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object d(Annotated annotated) {
        Class clsContentUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.c(JsonSerialize.class);
        if (jsonSerialize == null || (clsContentUsing = jsonSerialize.contentUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object d0(AnnotatedClass annotatedClass) {
        JsonValueInstantiator jsonValueInstantiator = (JsonValueInstantiator) annotatedClass.m.a(JsonValueInstantiator.class);
        if (jsonValueInstantiator == null) {
            return null;
        }
        return jsonValueInstantiator.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonCreator.Mode e(MapperConfig mapperConfig, Annotated annotated) {
        Java7Support java7Support;
        Boolean boolC;
        JsonCreator jsonCreator = (JsonCreator) annotated.c(JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode();
        }
        if (this.e && mapperConfig.m(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (annotated instanceof AnnotatedConstructor) && (java7Support = h) != null && (boolC = java7Support.c(annotated)) != null && boolC.booleanValue()) {
            return JsonCreator.Mode.f;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Class[] e0(Annotated annotated) {
        JsonView jsonView = (JsonView) annotated.c(JsonView.class);
        if (jsonView == null) {
            return null;
        }
        return jsonView.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonCreator.Mode f(Annotated annotated) {
        JsonCreator jsonCreator = (JsonCreator) annotated.c(JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Enum g(Class cls) {
        Annotation[] annotationArr = ClassUtil.f14330a;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(JsonEnumDefaultValue.class) != null) {
                String name = field.getName();
                for (Enum r8 : (Enum[]) cls.getEnumConstants()) {
                    if (name.equals(r8.name())) {
                        return r8;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean g0(AnnotatedMember annotatedMember) {
        JsonAnyGetter jsonAnyGetter = (JsonAnyGetter) annotatedMember.c(JsonAnyGetter.class);
        if (jsonAnyGetter == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnyGetter.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object h(AnnotatedMember annotatedMember) {
        Class clsW0;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotatedMember.c(JsonDeserialize.class);
        if (jsonDeserialize == null || (clsW0 = w0(jsonDeserialize.contentConverter())) == null || clsW0 == Converter.None.class) {
            return null;
        }
        return clsW0;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean h0(AnnotatedMethod annotatedMethod) {
        return annotatedMethod.l(JsonAnyGetter.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object i(Annotated annotated) {
        Class clsW0;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.c(JsonDeserialize.class);
        if (jsonDeserialize == null || (clsW0 = w0(jsonDeserialize.converter())) == null || clsW0 == Converter.None.class) {
            return null;
        }
        return clsW0;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean i0(AnnotatedMember annotatedMember) {
        JsonAnySetter jsonAnySetter = (JsonAnySetter) annotatedMember.c(JsonAnySetter.class);
        if (jsonAnySetter == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnySetter.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object j(Annotated annotated) {
        Class clsUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.c(JsonDeserialize.class);
        if (jsonDeserialize == null || (clsUsing = jsonDeserialize.using()) == JsonDeserializer.None.class) {
            return null;
        }
        return clsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean j0(AnnotatedMember annotatedMember) {
        JsonKey jsonKey = (JsonKey) annotatedMember.c(JsonKey.class);
        if (jsonKey == null) {
            return null;
        }
        return Boolean.valueOf(jsonKey.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final void k(Class cls, Enum[] enumArr, String[][] strArr) {
        JsonAlias jsonAlias;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonAlias = (JsonAlias) field.getAnnotation(JsonAlias.class)) != null) {
                String[] strArrValue = jsonAlias.value();
                if (strArrValue.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i = 0; i < length; i++) {
                        if (name.equals(enumArr[i].name())) {
                            strArr[i] = strArrValue;
                        }
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String[] l(Class cls, Enum[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        HashMap map = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String strValue = jsonProperty.value();
                if (!strValue.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(field.getName(), strValue);
                }
            }
        }
        if (map != null) {
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) map.get(enumArr[i].name());
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return strArr;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean l0(AnnotatedMember annotatedMember) {
        JsonValue jsonValue = (JsonValue) annotatedMember.c(JsonValue.class);
        if (jsonValue == null) {
            return null;
        }
        return Boolean.valueOf(jsonValue.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object m(Annotated annotated) {
        JsonFilter jsonFilter = (JsonFilter) annotated.c(JsonFilter.class);
        if (jsonFilter == null) {
            return null;
        }
        String strValue = jsonFilter.value();
        if (strValue.isEmpty()) {
            return null;
        }
        return strValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean m0(AnnotatedMethod annotatedMethod) {
        JsonValue jsonValue = (JsonValue) annotatedMethod.c(JsonValue.class);
        return jsonValue != null && jsonValue.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonFormat.Value n(Annotated annotated) {
        JsonFormat jsonFormat = (JsonFormat) annotated.c(JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        String strPattern = jsonFormat.pattern();
        JsonFormat.Shape shape = jsonFormat.shape();
        String strLocale = jsonFormat.locale();
        String strTimezone = jsonFormat.timezone();
        JsonFormat.Feature[] featureArrWith = jsonFormat.with();
        JsonFormat.Feature[] featureArrWithout = jsonFormat.without();
        int iOrdinal = 0;
        for (JsonFormat.Feature feature : featureArrWith) {
            iOrdinal |= 1 << feature.ordinal();
        }
        int iOrdinal2 = 0;
        for (JsonFormat.Feature feature2 : featureArrWithout) {
            iOrdinal2 |= 1 << feature2.ordinal();
        }
        JsonFormat.Features features = new JsonFormat.Features(iOrdinal, iOrdinal2);
        OptBoolean optBooleanLenient = jsonFormat.lenient();
        optBooleanLenient.getClass();
        return new JsonFormat.Value(strPattern, shape, strLocale, strTimezone, features, optBooleanLenient != OptBoolean.e ? optBooleanLenient == OptBoolean.d ? Boolean.TRUE : Boolean.FALSE : null);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean n0(Annotated annotated) {
        Java7Support java7Support;
        Boolean boolC;
        JsonCreator jsonCreator = (JsonCreator) annotated.c(JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode() != JsonCreator.Mode.g;
        }
        if (!this.e || !(annotated instanceof AnnotatedConstructor) || (java7Support = h) == null || (boolC = java7Support.c(annotated)) == null) {
            return false;
        }
        return boolC.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String o(com.fasterxml.jackson.databind.introspect.AnnotatedMember r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedParameter
            r1 = 0
            if (r0 == 0) goto L12
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r3 = (com.fasterxml.jackson.databind.introspect.AnnotatedParameter) r3
            com.fasterxml.jackson.databind.ext.Java7Support r0 = com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.h
            if (r0 == 0) goto L12
            com.fasterxml.jackson.databind.PropertyName r3 = r0.a(r3)
            if (r3 == 0) goto L12
            goto L13
        L12:
            r3 = r1
        L13:
            if (r3 != 0) goto L16
            return r1
        L16:
            java.lang.String r3 = r3.d
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.o(com.fasterxml.jackson.databind.introspect.AnnotatedMember):java.lang.String");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean o0(AnnotatedMember annotatedMember) {
        Boolean boolB;
        JsonIgnore jsonIgnore = (JsonIgnore) annotatedMember.c(JsonIgnore.class);
        if (jsonIgnore != null) {
            return jsonIgnore.value();
        }
        Java7Support java7Support = h;
        if (java7Support == null || (boolB = java7Support.b(annotatedMember)) == null) {
            return false;
        }
        return boolB.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JacksonInject.Value p(AnnotatedMember annotatedMember) {
        String name;
        JacksonInject jacksonInject = (JacksonInject) annotatedMember.c(JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        String strValue = jacksonInject.value();
        OptBoolean optBooleanUseInput = jacksonInject.useInput();
        optBooleanUseInput.getClass();
        Boolean bool = optBooleanUseInput == OptBoolean.e ? null : optBooleanUseInput == OptBoolean.d ? Boolean.TRUE : Boolean.FALSE;
        String str = "".equals(strValue) ? null : strValue;
        JacksonInject.Value value = (str == null && bool == null) ? JacksonInject.Value.f : new JacksonInject.Value(str, bool);
        Object obj = value.d;
        if (obj == null) {
            if (annotatedMember instanceof AnnotatedMethod) {
                AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
                name = annotatedMethod.g.getParameterCount() == 0 ? annotatedMember.e().getName() : annotatedMethod.u(0).getName();
            } else {
                name = annotatedMember.e().getName();
            }
            if (!name.equals(obj)) {
                return new JacksonInject.Value(name, value.e);
            }
        }
        return value;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean p0(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) annotatedMember.c(JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object q(AnnotatedMember annotatedMember) {
        JacksonInject.Value valueP = p(annotatedMember);
        if (valueP == null) {
            return null;
        }
        return valueP.d;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean q0(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Boolean boolValueOf = (Boolean) this.d.f.get(clsAnnotationType);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(JacksonAnnotationsInside.class) != null);
            this.d.f.f(clsAnnotationType, boolValueOf, true);
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object r(Annotated annotated) {
        Class clsKeyUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.c(JsonDeserialize.class);
        if (jsonDeserialize == null || (clsKeyUsing = jsonDeserialize.keyUsing()) == KeyDeserializer.None.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean r0(AnnotatedClass annotatedClass) {
        JsonIgnoreType jsonIgnoreType = (JsonIgnoreType) annotatedClass.m.a(JsonIgnoreType.class);
        if (jsonIgnoreType == null) {
            return null;
        }
        return Boolean.valueOf(jsonIgnoreType.value());
    }

    public Object readResolve() {
        if (this.d == null) {
            this.d = new LRUMap(48, 48);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object s(Annotated annotated) {
        Class clsKeyUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.c(JsonSerialize.class);
        if (jsonSerialize == null || (clsKeyUsing = jsonSerialize.keyUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean s0(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(annotatedMember.l(JsonTypeId.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean t(AnnotatedMember annotatedMember) {
        JsonMerge jsonMerge = (JsonMerge) annotatedMember.c(JsonMerge.class);
        if (jsonMerge == null) {
            return null;
        }
        OptBoolean optBooleanValue = jsonMerge.value();
        optBooleanValue.getClass();
        if (optBooleanValue == OptBoolean.e) {
            return null;
        }
        return optBooleanValue == OptBoolean.d ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JavaType t0(MapperConfig mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        TypeFactory typeFactory = mapperConfig.e.d;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.c(JsonDeserialize.class);
        Class clsW0 = jsonDeserialize == null ? null : w0(jsonDeserialize.as());
        if (clsW0 != null && !javaType.u(clsW0) && !z0(javaType, clsW0)) {
            try {
                javaType = typeFactory.j(javaType, clsW0, false);
            } catch (IllegalArgumentException e) {
                throw x0(e, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType, clsW0.getName(), annotated.d(), e.getMessage()));
            }
        }
        if (javaType.E()) {
            JavaType javaTypeO = javaType.o();
            Class clsW02 = jsonDeserialize == null ? null : w0(jsonDeserialize.keyAs());
            if (clsW02 != null && !z0(javaTypeO, clsW02)) {
                try {
                    javaType = ((MapLikeType) javaType).T(typeFactory.j(javaTypeO, clsW02, false));
                } catch (IllegalArgumentException e2) {
                    throw x0(e2, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsW02.getName(), annotated.d(), e2.getMessage()));
                }
            }
        }
        JavaType javaTypeK = javaType.k();
        if (javaTypeK != null) {
            Class clsW03 = jsonDeserialize != null ? w0(jsonDeserialize.contentAs()) : null;
            if (clsW03 != null && !z0(javaTypeK, clsW03)) {
                try {
                    return javaType.I(typeFactory.j(javaTypeK, clsW03, false));
                } catch (IllegalArgumentException e3) {
                    throw x0(e3, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsW03.getName(), annotated.d(), e3.getMessage()));
                }
            }
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final PropertyName u(AnnotatedMember annotatedMember) {
        boolean z;
        JsonSetter jsonSetter = (JsonSetter) annotatedMember.c(JsonSetter.class);
        if (jsonSetter != null) {
            String strValue = jsonSetter.value();
            if (!strValue.isEmpty()) {
                return PropertyName.a(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) annotatedMember.c(JsonProperty.class);
        if (jsonProperty != null) {
            String strNamespace = jsonProperty.namespace();
            return PropertyName.b(jsonProperty.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z || annotatedMember.m(g)) {
            return PropertyName.g;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JavaType u0(MapperConfig mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeM;
        JavaType javaTypeM2;
        TypeFactory typeFactory = mapperConfig.e.d;
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.c(JsonSerialize.class);
        Class<?> clsW0 = jsonSerialize == null ? null : w0(jsonSerialize.as());
        if (clsW0 != null) {
            if (javaType.u(clsW0)) {
                javaType = javaType.M();
            } else {
                Class<?> cls = javaType.d;
                try {
                    if (clsW0.isAssignableFrom(cls)) {
                        typeFactory.getClass();
                        javaType = TypeFactory.h(javaType, clsW0);
                    } else if (cls.isAssignableFrom(clsW0)) {
                        javaType = typeFactory.j(javaType, clsW0, false);
                    } else {
                        if (!A0(cls, clsW0)) {
                            throw new JsonMappingException(null, String.format("Cannot refine serialization type %s into %s; types not related", javaType, clsW0.getName()));
                        }
                        javaType = javaType.M();
                    }
                } catch (IllegalArgumentException e) {
                    throw x0(e, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, clsW0.getName(), annotated.d(), e.getMessage()));
                }
            }
        }
        if (javaType.E()) {
            JavaType javaTypeO = javaType.o();
            Class<?> clsW02 = jsonSerialize == null ? null : w0(jsonSerialize.keyAs());
            if (clsW02 != null) {
                if (javaTypeO.u(clsW02)) {
                    javaTypeM2 = javaTypeO.M();
                } else {
                    Class<?> cls2 = javaTypeO.d;
                    try {
                        if (clsW02.isAssignableFrom(cls2)) {
                            typeFactory.getClass();
                            javaTypeM2 = TypeFactory.h(javaTypeO, clsW02);
                        } else if (cls2.isAssignableFrom(clsW02)) {
                            javaTypeM2 = typeFactory.j(javaTypeO, clsW02, false);
                        } else {
                            if (!A0(cls2, clsW02)) {
                                throw new JsonMappingException(null, String.format("Cannot refine serialization key type %s into %s; types not related", javaTypeO, clsW02.getName()));
                            }
                            javaTypeM2 = javaTypeO.M();
                        }
                    } catch (IllegalArgumentException e2) {
                        throw x0(e2, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsW02.getName(), annotated.d(), e2.getMessage()));
                    }
                }
                javaType = ((MapLikeType) javaType).T(javaTypeM2);
            }
        }
        JavaType javaTypeK = javaType.k();
        if (javaTypeK != null) {
            Class<?> clsW03 = jsonSerialize == null ? null : w0(jsonSerialize.contentAs());
            if (clsW03 != null) {
                if (javaTypeK.u(clsW03)) {
                    javaTypeM = javaTypeK.M();
                } else {
                    Class<?> cls3 = javaTypeK.d;
                    try {
                        if (clsW03.isAssignableFrom(cls3)) {
                            typeFactory.getClass();
                            javaTypeM = TypeFactory.h(javaTypeK, clsW03);
                        } else if (cls3.isAssignableFrom(clsW03)) {
                            javaTypeM = typeFactory.j(javaTypeK, clsW03, false);
                        } else {
                            if (!A0(cls3, clsW03)) {
                                throw new JsonMappingException(null, String.format("Cannot refine serialization content type %s into %s; types not related", javaTypeK, clsW03.getName()));
                            }
                            javaTypeM = javaTypeK.M();
                        }
                    } catch (IllegalArgumentException e3) {
                        throw x0(e3, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsW03.getName(), annotated.d(), e3.getMessage()));
                    }
                }
                return javaType.I(javaTypeM);
            }
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final AnnotatedMethod v0(AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class clsU = annotatedMethod.u(0);
        Class clsU2 = annotatedMethod2.u(0);
        if (!clsU.isPrimitive()) {
            if (!clsU2.isPrimitive()) {
                if (clsU == String.class) {
                    if (clsU2 == String.class) {
                        return null;
                    }
                } else if (clsU2 != String.class) {
                    return null;
                }
            }
            return annotatedMethod2;
        }
        if (clsU2.isPrimitive()) {
            return null;
        }
        return annotatedMethod;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final PropertyName w(AnnotatedMember annotatedMember) {
        boolean z;
        JsonGetter jsonGetter = (JsonGetter) annotatedMember.c(JsonGetter.class);
        if (jsonGetter != null) {
            String strValue = jsonGetter.value();
            if (!strValue.isEmpty()) {
                return PropertyName.a(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) annotatedMember.c(JsonProperty.class);
        if (jsonProperty != null) {
            String strNamespace = jsonProperty.namespace();
            return PropertyName.b(jsonProperty.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z || annotatedMember.m(f)) {
            return PropertyName.g;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object x(AnnotatedClass annotatedClass) {
        JsonNaming jsonNaming = (JsonNaming) annotatedClass.m.a(JsonNaming.class);
        if (jsonNaming == null) {
            return null;
        }
        return jsonNaming.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object y(AnnotatedMember annotatedMember) {
        Class clsNullsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) annotatedMember.c(JsonSerialize.class);
        if (jsonSerialize == null || (clsNullsUsing = jsonSerialize.nullsUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final ObjectIdInfo z(Annotated annotated) {
        JsonIdentityInfo jsonIdentityInfo = (JsonIdentityInfo) annotated.c(JsonIdentityInfo.class);
        if (jsonIdentityInfo == null || jsonIdentityInfo.generator() == ObjectIdGenerators.None.class) {
            return null;
        }
        return new ObjectIdInfo(PropertyName.a(jsonIdentityInfo.property()), jsonIdentityInfo.scope(), jsonIdentityInfo.generator(), false, jsonIdentityInfo.resolver());
    }
}
