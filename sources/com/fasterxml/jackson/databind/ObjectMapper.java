package com.fasterxml.jackson.databind;

import YU.a;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonGeneratorImpl;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase;
import com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.security.PrivilegedAction;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class ObjectMapper extends ObjectCodec implements Versioned, Serializable {
    public static final BaseSettings n;
    public final JsonFactory d;
    public final TypeFactory e;
    public final ConfigOverrides f;
    public SerializationConfig g;
    public final DefaultSerializerProvider h;
    public SerializerFactory i;
    public DeserializationConfig j;
    public DefaultDeserializationContext k;
    public LinkedHashSet l;
    public final ConcurrentHashMap m;

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$2, reason: invalid class name */
    final class AnonymousClass2 implements PrivilegedAction<ServiceLoader<Object>> {
        @Override // java.security.PrivilegedAction
        public final ServiceLoader<Object> run() {
            return ServiceLoader.load(null);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14230a;

        static {
            int[] iArr = new int[DefaultTyping.values().length];
            f14230a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14230a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14230a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14230a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14230a[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class DefaultTypeResolverBuilder extends StdTypeResolverBuilder implements Serializable {
        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
        public final TypeDeserializerBase a(DeserializationConfig deserializationConfig, JavaType javaType, Collection collection) {
            j(javaType);
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
        public final TypeSerializerBase d(SerializationConfig serializationConfig, JavaType javaType, Collection collection) {
            j(javaType);
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
        public final TypeResolverBuilder e(Class cls) {
            if (this.h == cls) {
                return this;
            }
            ClassUtil.H(DefaultTypeResolverBuilder.class, this, "withDefaultImpl");
            return new DefaultTypeResolverBuilder(this, cls);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
        public final PolymorphicTypeValidator h(MapperConfigBase mapperConfigBase) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
        /* renamed from: i */
        public final StdTypeResolverBuilder e(Class cls) {
            if (this.h == cls) {
                return this;
            }
            ClassUtil.H(DefaultTypeResolverBuilder.class, this, "withDefaultImpl");
            return new DefaultTypeResolverBuilder(this, cls);
        }

        public final boolean j(JavaType javaType) {
            if (javaType.d.isPrimitive()) {
                return false;
            }
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DefaultTyping {
        public static final /* synthetic */ DefaultTyping[] d = {new DefaultTyping("JAVA_LANG_OBJECT", 0), new DefaultTyping("OBJECT_AND_NON_CONCRETE", 1), new DefaultTyping("NON_CONCRETE_AND_ARRAYS", 2), new DefaultTyping("NON_FINAL", 3), new DefaultTyping("EVERYTHING", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        DefaultTyping EF5;

        public static DefaultTyping valueOf(String str) {
            return (DefaultTyping) Enum.valueOf(DefaultTyping.class, str);
        }

        public static DefaultTyping[] values() {
            return (DefaultTyping[]) d.clone();
        }
    }

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        jacksonAnnotationIntrospector.d = new LRUMap(48, 48);
        jacksonAnnotationIntrospector.e = true;
        n = new BaseSettings(null, jacksonAnnotationIntrospector, TypeFactory.g, StdDateFormat.p, Locale.getDefault(), Base64Variants.b, new DefaultAccessorNamingStrategy.Provider());
    }

    public ObjectMapper(JsonFactory jsonFactory, int i) {
        this.m = new ConcurrentHashMap(64, 0.6f, 2);
        if (jsonFactory == null) {
            this.d = new MappingJsonFactory(this);
        } else {
            this.d = jsonFactory;
            if (jsonFactory.i == null) {
                jsonFactory.i = this;
            }
        }
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this.e = TypeFactory.g;
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver();
        BasicClassIntrospector basicClassIntrospector = new BasicClassIntrospector();
        BaseSettings baseSettings = n;
        BaseSettings baseSettings2 = baseSettings.e == basicClassIntrospector ? baseSettings : new BaseSettings(basicClassIntrospector, baseSettings.f, baseSettings.d, baseSettings.h, baseSettings.i, baseSettings.j, baseSettings.g);
        JsonInclude.Value value = JsonInclude.Value.h;
        ConfigOverrides configOverrides = new ConfigOverrides();
        configOverrides.d = value;
        configOverrides.e = JsonSetter.Value.f;
        configOverrides.f = VisibilityChecker.Std.i;
        this.f = configOverrides;
        CoercionConfigs coercionConfigs = new CoercionConfigs();
        this.g = new SerializationConfig(baseSettings2, stdSubtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, DatatypeFeatures.a());
        this.j = new DeserializationConfig(baseSettings2, stdSubtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, coercionConfigs, DatatypeFeatures.a());
        this.d.getClass();
        SerializationConfig serializationConfig = this.g;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.m(mapperFeature)) {
            g(mapperFeature, false);
        }
        this.h = new DefaultSerializerProvider.Impl();
        Class[] clsArr = BeanDeserializerFactory.e;
        this.k = new DefaultDeserializationContext.Impl();
        this.i = BeanSerializerFactory.g;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public final Object a(JsonParser jsonParser, TypeReference typeReference) {
        DeserializationConfig deserializationConfig = this.j;
        TypeFactory typeFactory = this.e;
        typeFactory.getClass();
        return e(deserializationConfig, jsonParser, typeFactory.b(null, typeReference.d, TypeFactory.h));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public final Object b(JsonNode jsonNode) throws JsonProcessingException {
        if (jsonNode == null) {
            return null;
        }
        try {
            if (TreeNode.class.isAssignableFrom(String.class) && String.class.isAssignableFrom(jsonNode.getClass())) {
                return jsonNode;
            }
            if (jsonNode.d() == JsonToken.VALUE_EMBEDDED_OBJECT && (jsonNode instanceof POJONode)) {
                Object obj = ((POJONode) jsonNode).d;
                if (String.class.isInstance(obj)) {
                    return obj;
                }
            }
            return e(this.j, new TreeTraversingParser(jsonNode, this), this.e.k(String.class));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public final void c(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = this.g;
        if (serializationConfig.r(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.g() == null) {
            PrettyPrinter prettyPrinterE = serializationConfig.n;
            if (prettyPrinterE instanceof Instantiatable) {
                prettyPrinterE = ((Instantiatable) prettyPrinterE).e();
            }
            jsonGenerator.k(prettyPrinterE);
        }
        boolean zR = serializationConfig.r(SerializationFeature.CLOSE_CLOSEABLE);
        DefaultSerializerProvider defaultSerializerProvider = this.h;
        if (!zR || !(obj instanceof Closeable)) {
            defaultSerializerProvider.K(serializationConfig, this.i).L(jsonGenerator, obj);
            if (serializationConfig.r(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            defaultSerializerProvider.K(serializationConfig, this.i).L(jsonGenerator, obj);
            if (serializationConfig.r(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            ClassUtil.g(null, closeable, e);
            throw null;
        }
    }

    public final JsonDeserializer d(DefaultDeserializationContext defaultDeserializationContext, JavaType javaType) throws InvalidDefinitionException {
        ConcurrentHashMap concurrentHashMap = this.m;
        JsonDeserializer jsonDeserializer = (JsonDeserializer) concurrentHashMap.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer jsonDeserializerU = defaultDeserializationContext.u(javaType);
        if (jsonDeserializerU != null) {
            concurrentHashMap.put(javaType, jsonDeserializerU);
            return jsonDeserializerU;
        }
        defaultDeserializationContext.j("Cannot find a deserializer for type " + javaType);
        throw null;
    }

    public final Object e(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) throws MismatchedInputException {
        JsonToken jsonTokenN1;
        this.j.getClass();
        JsonToken jsonTokenE = jsonParser.e();
        if (jsonTokenE == null && (jsonTokenE = jsonParser.N1()) == null) {
            throw new MismatchedInputException(jsonParser, "No content to map due to end-of-input", null);
        }
        DefaultDeserializationContext.Impl implE0 = this.k.e0(deserializationConfig, jsonParser);
        Object objC = jsonTokenE == JsonToken.VALUE_NULL ? d(implE0, javaType).c(implE0) : (jsonTokenE == JsonToken.END_ARRAY || jsonTokenE == JsonToken.END_OBJECT) ? null : implE0.f0(jsonParser, javaType, d(implE0, javaType));
        jsonParser.c();
        if (!deserializationConfig.r(DeserializationFeature.FAIL_ON_TRAILING_TOKENS) || (jsonTokenN1 = jsonParser.N1()) == null) {
            return objC;
        }
        Annotation[] annotationArr = ClassUtil.f14330a;
        DeserializationContext.X(javaType == null ? null : javaType.d, jsonParser, jsonTokenN1);
        throw null;
    }

    public final void f(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = this.g;
        boolean zR = serializationConfig.r(SerializationFeature.CLOSE_CLOSEABLE);
        DefaultSerializerProvider defaultSerializerProvider = this.h;
        if (!zR || !(obj instanceof Closeable)) {
            try {
                defaultSerializerProvider.K(serializationConfig, this.i).L(jsonGenerator, obj);
                jsonGenerator.close();
                return;
            } catch (Exception e) {
                JsonGeneratorImpl jsonGeneratorImpl = (JsonGeneratorImpl) jsonGenerator;
                Annotation[] annotationArr = ClassUtil.f14330a;
                jsonGeneratorImpl.d2(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
                try {
                    jsonGeneratorImpl.close();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
                ClassUtil.F(e);
                ClassUtil.G(e);
                throw new RuntimeException(e);
            }
        }
        Closeable closeable = (Closeable) obj;
        try {
            defaultSerializerProvider.K(serializationConfig, this.i).L(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e3) {
                e = e3;
                closeable = null;
                ClassUtil.g((JsonGeneratorImpl) jsonGenerator, closeable, e);
                throw null;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public final void g(MapperFeature mapperFeature, boolean z) {
        MapperConfigBase mapperConfigBaseP;
        MapperConfigBase mapperConfigBaseP2;
        if (z) {
            SerializationConfig serializationConfig = this.g;
            long j = serializationConfig.d;
            long j2 = new MapperFeature[]{mapperFeature}[0].e | j;
            mapperConfigBaseP = serializationConfig;
            if (j2 != j) {
                mapperConfigBaseP = serializationConfig.p(j2);
            }
        } else {
            SerializationConfig serializationConfig2 = this.g;
            long j3 = serializationConfig2.d;
            long j4 = (~new MapperFeature[]{mapperFeature}[0].e) & j3;
            mapperConfigBaseP = serializationConfig2;
            if (j4 != j3) {
                mapperConfigBaseP = serializationConfig2.p(j4);
            }
        }
        this.g = (SerializationConfig) mapperConfigBaseP;
        if (z) {
            DeserializationConfig deserializationConfig = this.j;
            long j5 = deserializationConfig.d;
            long j6 = new MapperFeature[]{mapperFeature}[0].e | j5;
            mapperConfigBaseP2 = deserializationConfig;
            if (j6 != j5) {
                mapperConfigBaseP2 = deserializationConfig.p(j6);
            }
        } else {
            DeserializationConfig deserializationConfig2 = this.j;
            long j7 = deserializationConfig2.d;
            long j8 = (~new MapperFeature[]{mapperFeature}[0].e) & j7;
            mapperConfigBaseP2 = deserializationConfig2;
            if (j8 != j7) {
                mapperConfigBaseP2 = deserializationConfig2.p(j8);
            }
        }
        this.j = (DeserializationConfig) mapperConfigBaseP2;
    }

    public final JsonGenerator h(OutputStream outputStream) {
        JsonFactory jsonFactory = this.d;
        jsonFactory.getClass();
        IOContext iOContextA = jsonFactory.a(new ContentReference(-1, -1, outputStream, true), false);
        iOContextA.c = JsonEncoding.g;
        UTF8JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContextA, jsonFactory.h, jsonFactory.i, outputStream, jsonFactory.k);
        SerializableString serializableString = jsonFactory.j;
        if (serializableString != JsonFactory.o) {
            uTF8JsonGenerator.m = serializableString;
        }
        this.g.q(uTF8JsonGenerator);
        return uTF8JsonGenerator;
    }

    public final ObjectReader i(Class cls) {
        return new ObjectReader(this, this.j, this.e.k(cls));
    }

    public final void j(Module module) {
        Object objB;
        if (module == null) {
            throw new IllegalArgumentException(a.h("argument \"", "module", "\" is null"));
        }
        if (module.a() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (module.d() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            j((Module) it.next());
        }
        if (this.g.m(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (objB = module.b()) != null) {
            if (this.l == null) {
                this.l = new LinkedHashSet();
            }
            if (!this.l.add(objB)) {
                return;
            }
        }
        module.c(new Module.SetupContext() { // from class: com.fasterxml.jackson.databind.ObjectMapper.1
            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public final void a(Serializers serializers) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.i = objectMapper.i.e(serializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public final void b(Deserializers deserializers) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.k = objectMapper.k.g0(objectMapper.k.e.n(deserializers));
            }
        });
    }

    public ObjectMapper() {
        this(null, 0);
    }
}
