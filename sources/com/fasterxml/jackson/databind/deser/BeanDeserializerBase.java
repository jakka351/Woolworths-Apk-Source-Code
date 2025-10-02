package com.fasterxml.jackson.databind.deser;

import YU.a;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.NativeImageUtil;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements ContextualDeserializer, ResolvableDeserializer, ValueInstantiator.Gettable, Serializable {
    public static final PropertyName A = new PropertyName("#temporary-name", null);
    public final JavaType g;
    public final JsonFormat.Shape h;
    public final ValueInstantiator i;
    public JsonDeserializer j;
    public JsonDeserializer k;
    public PropertyBasedCreator l;
    public boolean m;
    public boolean n;
    public final BeanPropertyMap o;
    public final ValueInjector[] p;
    public SettableAnyProperty q;
    public final Set r;
    public final Set s;
    public final boolean t;
    public final boolean u;
    public final Map v;
    public transient HashMap w;
    public UnwrappedPropertyHandler x;
    public ExternalTypeHandler y;
    public final ObjectIdReader z;

    /* JADX WARN: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map map, Set set, boolean z, Set set2, boolean z2) {
        JavaType javaType = beanDescription.f14226a;
        super(javaType);
        this.g = javaType;
        ValueInstantiator valueInstantiator = beanDeserializerBuilder.i;
        this.i = valueInstantiator;
        ValueInjector[] valueInjectorArr = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.o = beanPropertyMap;
        this.v = map;
        this.r = set;
        this.t = z;
        this.s = set2;
        this.q = beanDeserializerBuilder.k;
        ArrayList arrayList = beanDeserializerBuilder.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            valueInjectorArr = (ValueInjector[]) arrayList.toArray(new ValueInjector[arrayList.size()]);
        }
        this.p = valueInjectorArr;
        ObjectIdReader objectIdReader = beanDeserializerBuilder.j;
        this.z = objectIdReader;
        this.m = this.x != null || valueInstantiator.k() || valueInstantiator.g() || !valueInstantiator.j();
        this.h = beanDescription.f().e;
        this.u = z2;
        this.n = !this.m && valueInjectorArr == null && !z2 && objectIdReader == null;
    }

    public static void L0(DeserializationContext deserializationContext, Exception exc, Object obj, String str) throws IOException {
        Exception cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        ClassUtil.E(cause);
        boolean z = deserializationContext == null || deserializationContext.N(DeserializationFeature.WRAP_EXCEPTIONS);
        if (cause instanceof IOException) {
            if (!z || !(cause instanceof JacksonException)) {
                throw ((IOException) cause);
            }
        } else if (!z) {
            ClassUtil.G(cause);
        }
        int i = JsonMappingException.g;
        throw JsonMappingException.h(cause, new JsonMappingException.Reference(obj, str));
    }

    public static JsonDeserializer q0(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) {
        BeanProperty.Std std = new BeanProperty.Std(A, javaType, null, annotatedWithParams, PropertyMetadata.l);
        TypeDeserializer typeDeserializerA = (TypeDeserializer) javaType.g;
        if (typeDeserializerA == null) {
            DeserializationConfig deserializationConfig = deserializationContext.f;
            deserializationConfig.getClass();
            AnnotatedClass annotatedClass = ((BasicBeanDescription) deserializationConfig.l(javaType.d)).e;
            TypeResolverBuilder typeResolverBuilderB0 = deserializationConfig.d().b0(javaType, deserializationConfig, annotatedClass);
            if (typeResolverBuilderB0 == null) {
                deserializationConfig.e.getClass();
                typeDeserializerA = null;
            } else {
                typeDeserializerA = typeResolverBuilderB0.a(deserializationConfig, javaType, deserializationConfig.g.e(deserializationConfig, annotatedClass));
            }
        }
        JsonDeserializer jsonDeserializer = (JsonDeserializer) javaType.f;
        JsonDeserializer jsonDeserializerP = jsonDeserializer == null ? deserializationContext.p(javaType, std) : deserializationContext.C(jsonDeserializer, std, javaType);
        return typeDeserializerA != null ? new TypeWrappedDeserializer(typeDeserializerA.f(std), jsonDeserializerP) : jsonDeserializerP;
    }

    public static void s0(BeanPropertyMap beanPropertyMap, SettableBeanProperty[] settableBeanPropertyArr, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = beanPropertyMap.h.length;
        for (int i = 1; i < length; i += 2) {
            Object[] objArr = beanPropertyMap.h;
            if (objArr[i] == settableBeanProperty) {
                objArr[i] = settableBeanProperty2;
                beanPropertyMap.i[beanPropertyMap.b(settableBeanProperty)] = settableBeanProperty2;
                if (settableBeanPropertyArr != null) {
                    int length2 = settableBeanPropertyArr.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (settableBeanPropertyArr[i2] == settableBeanProperty) {
                            settableBeanPropertyArr[i2] = settableBeanProperty2;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException(a.o(new StringBuilder("No entry '"), settableBeanProperty.f.d, "' found, can't replace"));
    }

    public final Collection A0() {
        ArrayList arrayList = new ArrayList();
        Iterator<SettableBeanProperty> it = this.o.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f.d);
        }
        return arrayList;
    }

    public final void B0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IgnoredPropertyException {
        if (!deserializationContext.N(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            jsonParser.V1();
            return;
        }
        Collection collectionA0 = A0();
        int i = IgnoredPropertyException.j;
        IgnoredPropertyException ignoredPropertyException = new IgnoredPropertyException(jsonParser, a.j("Ignored field \"", str, "\" (class ", (obj instanceof Class ? (Class) obj : obj.getClass()).getName(), ") encountered; mapper configured not to allow this"), jsonParser.l(), collectionA0);
        ignoredPropertyException.e(obj, str);
        throw ignoredPropertyException;
    }

    public final Object C0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws UnrecognizedPropertyException, InvalidDefinitionException, IgnoredPropertyException {
        JsonDeserializer jsonDeserializerU;
        synchronized (this) {
            HashMap map = this.w;
            jsonDeserializerU = map == null ? null : (JsonDeserializer) map.get(new ClassKey(obj.getClass()));
        }
        if (jsonDeserializerU == null && (jsonDeserializerU = deserializationContext.u(deserializationContext.l(obj.getClass()))) != null) {
            synchronized (this) {
                try {
                    if (this.w == null) {
                        this.w = new HashMap();
                    }
                    this.w.put(new ClassKey(obj.getClass()), jsonDeserializerU);
                } finally {
                }
            }
        }
        if (jsonDeserializerU == null) {
            if (tokenBuffer != null) {
                D0(deserializationContext, obj, tokenBuffer);
            }
            return jsonParser != null ? f(jsonParser, deserializationContext, obj) : obj;
        }
        if (tokenBuffer != null) {
            tokenBuffer.H();
            TokenBuffer.Parser parserM2 = tokenBuffer.m2(tokenBuffer.e);
            parserM2.N1();
            obj = jsonDeserializerU.f(parserM2, deserializationContext, obj);
        }
        return jsonParser != null ? jsonDeserializerU.f(jsonParser, deserializationContext, obj) : obj;
    }

    public final void D0(DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws UnrecognizedPropertyException, IgnoredPropertyException {
        tokenBuffer.H();
        TokenBuffer.Parser parserM2 = tokenBuffer.m2(tokenBuffer.e);
        while (parserM2.N1() != JsonToken.END_OBJECT) {
            String strD = parserM2.d();
            parserM2.N1();
            E0(parserM2, deserializationContext, obj, strD);
        }
    }

    public final void E0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws UnrecognizedPropertyException, IgnoredPropertyException {
        if (this.t) {
            jsonParser.V1();
            return;
        }
        if (IgnorePropertiesUtil.b(str, this.r, this.s)) {
            B0(jsonParser, deserializationContext, obj, str);
        }
        if (obj == null) {
            obj = this.g.d;
        }
        deserializationContext.f.getClass();
        for (LinkedNode linkedNode = null; linkedNode != null; linkedNode = linkedNode.b) {
            ((DeserializationProblemHandler) linkedNode.f14334a).getClass();
        }
        if (!deserializationContext.N(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            jsonParser.V1();
            return;
        }
        Collection collectionA0 = A0();
        JsonParser jsonParser2 = deserializationContext.i;
        int i = UnrecognizedPropertyException.j;
        UnrecognizedPropertyException unrecognizedPropertyException = new UnrecognizedPropertyException(jsonParser2, a.j("Unrecognized field \"", str, "\" (class ", (obj instanceof Class ? obj : obj.getClass()).getName(), "), not marked as ignorable"), jsonParser2.l(), collectionA0);
        unrecognizedPropertyException.e(obj, str);
        throw unrecognizedPropertyException;
    }

    public final void F0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (IgnorePropertiesUtil.b(str, this.r, this.s)) {
            B0(jsonParser, deserializationContext, obj, str);
            return;
        }
        SettableAnyProperty settableAnyProperty = this.q;
        if (settableAnyProperty == null) {
            E0(jsonParser, deserializationContext, obj, str);
            return;
        }
        try {
            settableAnyProperty.c(jsonParser, deserializationContext, obj, str);
        } catch (Exception e) {
            L0(deserializationContext, e, obj, str);
            throw null;
        }
    }

    public final void G0(DeserializationContext deserializationContext, Object obj) {
        ValueInjector[] valueInjectorArr = this.p;
        if (valueInjectorArr.length <= 0) {
            return;
        }
        ValueInjector valueInjector = valueInjectorArr[0];
        AnnotatedMember annotatedMember = valueInjector.g;
        deserializationContext.q(valueInjector.h, valueInjector, obj);
        throw null;
    }

    public BeanDeserializerBase H0(BeanPropertyMap beanPropertyMap) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    public abstract BeanDeserializerBase I0(Set set, Set set2);

    public abstract BeanDeserializerBase J0();

    public abstract BeanDeserializerBase K0(ObjectIdReader objectIdReader);

    public final void M0(Exception exc, DeserializationContext deserializationContext) throws IOException {
        Throwable cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        ClassUtil.E(cause);
        if (cause instanceof IOException) {
            throw ((IOException) cause);
        }
        if (deserializationContext == null) {
            throw new IllegalArgumentException(cause.getMessage(), cause);
        }
        if (!deserializationContext.N(DeserializationFeature.WRAP_EXCEPTIONS)) {
            ClassUtil.G(cause);
        }
        deserializationContext.y(cause, this.g.d);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0172, code lost:
    
        if (r7 != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0206 A[EDGE_INSN: B:176:0x0206->B:101:0x0206 BREAK  A[LOOP:2: B:91:0x01cd->B:100:0x0201], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cf  */
    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fasterxml.jackson.databind.DeserializationContext r23) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.a(com.fasterxml.jackson.databind.DeserializationContext):void");
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) throws InvalidDefinitionException {
        ObjectIdReader objectIdReader;
        ObjectIdInfo objectIdInfoZ;
        JavaType javaType;
        ObjectIdGenerator objectIdGeneratorG;
        SettableBeanProperty settableBeanProperty;
        PropertyBasedCreator propertyBasedCreator;
        AnnotationIntrospector annotationIntrospectorD = deserializationContext.f.d();
        AnnotatedMember annotatedMemberA = beanProperty != null ? beanProperty.a() : null;
        JavaType javaType2 = this.g;
        BeanPropertyMap beanPropertyMap = this.o;
        ObjectIdReader objectIdReader2 = this.z;
        if (annotatedMemberA == null || (objectIdInfoZ = annotationIntrospectorD.z(annotatedMemberA)) == null) {
            objectIdReader = objectIdReader2;
        } else {
            ObjectIdInfo objectIdInfoB = annotationIntrospectorD.B(annotatedMemberA, objectIdInfoZ);
            Class cls = objectIdInfoB.b;
            PropertyName propertyName = objectIdInfoB.f14277a;
            ObjectIdResolver objectIdResolverH = deserializationContext.h(objectIdInfoB);
            if (cls == ObjectIdGenerators.PropertyGenerator.class) {
                String str = propertyName.d;
                SettableBeanProperty settableBeanPropertyG = beanPropertyMap == null ? null : beanPropertyMap.g(str);
                if (settableBeanPropertyG == null && (propertyBasedCreator = this.l) != null) {
                    settableBeanPropertyG = propertyBasedCreator.c(str);
                }
                if (settableBeanPropertyG == null) {
                    deserializationContext.j("Invalid Object Id definition for " + ClassUtil.B(javaType2.d) + ": cannot find property with name " + ClassUtil.c(str));
                    throw null;
                }
                javaType = settableBeanPropertyG.g;
                objectIdGeneratorG = new PropertyBasedObjectIdGenerator(objectIdInfoB.d);
                settableBeanProperty = settableBeanPropertyG;
            } else {
                JavaType javaTypeL = deserializationContext.l(cls);
                deserializationContext.e().getClass();
                javaType = TypeFactory.m(javaTypeL, ObjectIdGenerator.class)[0];
                objectIdGeneratorG = deserializationContext.g(objectIdInfoB);
                settableBeanProperty = null;
            }
            ObjectIdGenerator objectIdGenerator = objectIdGeneratorG;
            JavaType javaType3 = javaType;
            objectIdReader = new ObjectIdReader(javaType3, propertyName, objectIdGenerator, deserializationContext.u(javaType3), settableBeanProperty, objectIdResolverH);
        }
        BeanDeserializerBase beanDeserializerBaseK0 = (objectIdReader == null || objectIdReader == objectIdReader2) ? this : K0(objectIdReader);
        if (annotatedMemberA != null) {
            JsonIgnoreProperties.Value valueJ = annotationIntrospectorD.J(annotatedMemberA);
            if (valueJ.e && !this.t) {
                beanDeserializerBaseK0 = beanDeserializerBaseK0.J0();
            }
            Set set = valueJ.g ? Collections.EMPTY_SET : valueJ.d;
            Set set2 = beanDeserializerBaseK0.r;
            if (set.isEmpty()) {
                set = set2;
            } else if (set2 != null && !set2.isEmpty()) {
                HashSet hashSet = new HashSet(set2);
                hashSet.addAll(set);
                set = hashSet;
            }
            Set set3 = beanDeserializerBaseK0.s;
            Set<String> set4 = annotationIntrospectorD.M(annotatedMemberA).d;
            if (set3 != null) {
                if (set4 == null) {
                    set4 = set3;
                } else {
                    HashSet hashSet2 = new HashSet();
                    for (String str2 : set4) {
                        if (set3.contains(str2)) {
                            hashSet2.add(str2);
                        }
                    }
                    set4 = hashSet2;
                }
            }
            if (set != set2 || set4 != set3) {
                beanDeserializerBaseK0 = beanDeserializerBaseK0.I0(set, set4);
            }
        }
        JsonFormat.Value valueH0 = StdDeserializer.h0(deserializationContext, beanProperty, javaType2.d);
        if (valueH0 != null) {
            JsonFormat.Shape shape = valueH0.e;
            shape = shape != JsonFormat.Shape.d ? shape : null;
            Boolean boolB = valueH0.b(JsonFormat.Feature.e);
            if (boolB != null) {
                boolean zBooleanValue = boolB.booleanValue();
                BeanPropertyMap beanPropertyMap2 = beanPropertyMap.d == zBooleanValue ? beanPropertyMap : new BeanPropertyMap(beanPropertyMap, zBooleanValue);
                if (beanPropertyMap2 != beanPropertyMap) {
                    beanDeserializerBaseK0 = beanDeserializerBaseK0.H0(beanPropertyMap2);
                }
            }
        }
        if (shape == null) {
            shape = this.h;
        }
        return shape == JsonFormat.Shape.g ? beanDeserializerBaseK0.t0() : beanDeserializerBaseK0;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        Object objZ;
        ObjectIdReader objectIdReader = this.z;
        if (objectIdReader != null) {
            if (jsonParser.a() && (objZ = jsonParser.Z()) != null) {
                return r0(jsonParser, deserializationContext, typeDeserializer.d(jsonParser, deserializationContext), objZ);
            }
            JsonToken jsonTokenE = jsonParser.e();
            if (jsonTokenE != null) {
                if (jsonTokenE.k) {
                    return x0(jsonParser, deserializationContext);
                }
                if (jsonTokenE == JsonToken.START_OBJECT) {
                    jsonTokenE = jsonParser.N1();
                }
                if (jsonTokenE == JsonToken.FIELD_NAME) {
                    objectIdReader.f.getClass();
                }
            }
        }
        return typeDeserializer.d(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final SettableBeanProperty h(String str) {
        Map map = this.v;
        if (map == null) {
            return null;
        }
        return (SettableBeanProperty) map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final AccessPattern i() {
        return AccessPattern.f;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final ValueInstantiator i0() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) throws JsonMappingException {
        try {
            return this.i.y(deserializationContext);
        } catch (IOException e) {
            ClassUtil.D(deserializationContext, e);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final JavaType j0() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final ObjectIdReader k() {
        return this.z;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Class l() {
        return this.g.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.g;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public final JsonDeserializer o0() {
        JsonDeserializer jsonDeserializer = this.j;
        return jsonDeserializer == null ? this.k : jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public abstract JsonDeserializer p(NameTransformer nameTransformer);

    public abstract Object p0(JsonParser jsonParser, DeserializationContext deserializationContext);

    public final Object r0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) {
        ObjectIdReader objectIdReader = this.z;
        JsonDeserializer jsonDeserializer = objectIdReader.h;
        if (jsonDeserializer.l() != obj2.getClass()) {
            TokenBuffer tokenBufferK = deserializationContext.k(jsonParser);
            if (obj2 instanceof String) {
                tokenBufferK.J1((String) obj2);
            } else if (obj2 instanceof Long) {
                tokenBufferK.b2(JsonToken.VALUE_NUMBER_INT, (Long) obj2);
            } else if (obj2 instanceof Integer) {
                tokenBufferK.b2(JsonToken.VALUE_NUMBER_INT, (Integer) obj2);
            } else {
                tokenBufferK.writeObject(obj2);
            }
            JsonParser jsonParserM2 = tokenBufferK.m2(tokenBufferK.e);
            jsonParserM2.N1();
            obj2 = jsonDeserializer.e(jsonParserM2, deserializationContext);
        }
        deserializationContext.t(obj2, objectIdReader.f, objectIdReader.g).b(obj);
        SettableBeanProperty settableBeanProperty = objectIdReader.i;
        return settableBeanProperty != null ? settableBeanProperty.B(obj, obj2) : obj;
    }

    public abstract BeanDeserializerBase t0();

    public final Object u0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        JsonDeserializer jsonDeserializerO0 = o0();
        ValueInstantiator valueInstantiator = this.i;
        if (jsonDeserializerO0 == null || valueInstantiator.c()) {
            return valueInstantiator.p(deserializationContext, jsonParser.e() == JsonToken.VALUE_TRUE);
        }
        Object objZ = valueInstantiator.z(deserializationContext, jsonDeserializerO0.e(jsonParser, deserializationContext));
        if (this.p != null) {
            G0(deserializationContext, objZ);
        }
        return objZ;
    }

    public final Object v0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        JsonParser.NumberType numberTypeT = jsonParser.T();
        JsonParser.NumberType numberType = JsonParser.NumberType.h;
        ValueInjector[] valueInjectorArr = this.p;
        ValueInstantiator valueInstantiator = this.i;
        if (numberTypeT == numberType || numberTypeT == JsonParser.NumberType.g) {
            JsonDeserializer jsonDeserializerO0 = o0();
            if (jsonDeserializerO0 == null || valueInstantiator.d()) {
                return valueInstantiator.q(deserializationContext, jsonParser.A());
            }
            Object objZ = valueInstantiator.z(deserializationContext, jsonDeserializerO0.e(jsonParser, deserializationContext));
            if (valueInjectorArr != null) {
                G0(deserializationContext, objZ);
            }
            return objZ;
        }
        if (numberTypeT != JsonParser.NumberType.i) {
            deserializationContext.z(this.g.d, valueInstantiator, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.U());
            throw null;
        }
        JsonDeserializer jsonDeserializerO02 = o0();
        if (jsonDeserializerO02 == null || valueInstantiator.a()) {
            return valueInstantiator.n(deserializationContext, jsonParser.x());
        }
        Object objZ2 = valueInstantiator.z(deserializationContext, jsonDeserializerO02.e(jsonParser, deserializationContext));
        if (valueInjectorArr != null) {
            G0(deserializationContext, objZ2);
        }
        return objZ2;
    }

    public final Object w0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        if (this.z != null) {
            return x0(jsonParser, deserializationContext);
        }
        JsonDeserializer jsonDeserializerO0 = o0();
        JsonParser.NumberType numberTypeT = jsonParser.T();
        JsonParser.NumberType numberType = JsonParser.NumberType.d;
        ValueInjector[] valueInjectorArr = this.p;
        ValueInstantiator valueInstantiator = this.i;
        if (numberTypeT == numberType) {
            if (jsonDeserializerO0 == null || valueInstantiator.e()) {
                return valueInstantiator.r(deserializationContext, jsonParser.H());
            }
            Object objZ = valueInstantiator.z(deserializationContext, jsonDeserializerO0.e(jsonParser, deserializationContext));
            if (valueInjectorArr != null) {
                G0(deserializationContext, objZ);
            }
            return objZ;
        }
        if (numberTypeT == JsonParser.NumberType.e) {
            if (jsonDeserializerO0 == null || valueInstantiator.e()) {
                return valueInstantiator.s(deserializationContext, jsonParser.R());
            }
            Object objZ2 = valueInstantiator.z(deserializationContext, jsonDeserializerO0.e(jsonParser, deserializationContext));
            if (valueInjectorArr != null) {
                G0(deserializationContext, objZ2);
            }
            return objZ2;
        }
        if (numberTypeT != JsonParser.NumberType.f) {
            deserializationContext.z(this.g.d, valueInstantiator, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.U());
            throw null;
        }
        if (jsonDeserializerO0 == null || valueInstantiator.b()) {
            return valueInstantiator.o(deserializationContext, jsonParser.g());
        }
        Object objZ3 = valueInstantiator.z(deserializationContext, jsonDeserializerO0.e(jsonParser, deserializationContext));
        if (valueInjectorArr != null) {
            G0(deserializationContext, objZ3);
        }
        return objZ3;
    }

    public final Object x0(JsonParser jsonParser, DeserializationContext deserializationContext) throws UnresolvedForwardReference {
        ObjectIdReader objectIdReader = this.z;
        Object objE = objectIdReader.h.e(jsonParser, deserializationContext);
        ReadableObjectId readableObjectIdT = deserializationContext.t(objE, objectIdReader.f, objectIdReader.g);
        Object objB = readableObjectIdT.d.b(readableObjectIdT.b);
        readableObjectIdT.f14252a = objB;
        if (objB != null) {
            return objB;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + objE + "] (for " + this.g + ").", jsonParser.l(), readableObjectIdT);
    }

    public final Object y0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        JsonDeserializer jsonDeserializerO0 = o0();
        ValueInstantiator valueInstantiator = this.i;
        if (jsonDeserializerO0 != null) {
            Object objZ = valueInstantiator.z(deserializationContext, jsonDeserializerO0.e(jsonParser, deserializationContext));
            if (this.p != null) {
                G0(deserializationContext, objZ);
            }
            return objZ;
        }
        if (this.l != null) {
            return p0(jsonParser, deserializationContext);
        }
        Class cls = this.g.d;
        Annotation[] annotationArr = ClassUtil.f14330a;
        if (!Modifier.isStatic(cls.getModifiers())) {
            if ((ClassUtil.y(cls) ? null : cls.getEnclosingClass()) != null) {
                deserializationContext.z(cls, null, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]);
                throw null;
            }
        }
        if (NativeImageUtil.a(cls)) {
            deserializationContext.z(cls, null, "cannot deserialize from Object value (no delegate- or property-based Creator): this appears to be a native image, in which case you may need to configure reflection for the class that is to be deserialized", new Object[0]);
            throw null;
        }
        deserializationContext.z(cls, valueInstantiator, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
        throw null;
    }

    public final Object z0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        if (this.z != null) {
            return x0(jsonParser, deserializationContext);
        }
        JsonDeserializer jsonDeserializerO0 = o0();
        if (jsonDeserializerO0 != null) {
            ValueInstantiator valueInstantiator = this.i;
            if (!valueInstantiator.h()) {
                Object objZ = valueInstantiator.z(deserializationContext, jsonDeserializerO0.e(jsonParser, deserializationContext));
                if (this.p != null) {
                    G0(deserializationContext, objZ);
                }
                return objZ;
            }
        }
        return G(jsonParser, deserializationContext);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase.t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        JavaType javaType = beanDeserializerBase.g;
        super(javaType);
        this.g = javaType;
        this.i = beanDeserializerBase.i;
        this.j = beanDeserializerBase.j;
        this.k = beanDeserializerBase.k;
        this.l = beanDeserializerBase.l;
        this.o = beanDeserializerBase.o;
        this.v = beanDeserializerBase.v;
        this.r = beanDeserializerBase.r;
        this.t = z;
        this.s = beanDeserializerBase.s;
        this.q = beanDeserializerBase.q;
        this.p = beanDeserializerBase.p;
        this.z = beanDeserializerBase.z;
        this.m = beanDeserializerBase.m;
        this.x = beanDeserializerBase.x;
        this.u = beanDeserializerBase.u;
        this.h = beanDeserializerBase.h;
        this.n = beanDeserializerBase.n;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        PropertyName propertyName;
        JsonDeserializer jsonDeserializerP;
        PropertyName propertyName2;
        JsonDeserializer jsonDeserializerP2;
        JavaType javaType = beanDeserializerBase.g;
        super(javaType);
        this.g = javaType;
        this.i = beanDeserializerBase.i;
        this.j = beanDeserializerBase.j;
        this.k = beanDeserializerBase.k;
        this.l = beanDeserializerBase.l;
        this.v = beanDeserializerBase.v;
        this.r = beanDeserializerBase.r;
        this.t = true;
        this.s = beanDeserializerBase.s;
        this.q = beanDeserializerBase.q;
        this.p = beanDeserializerBase.p;
        this.z = beanDeserializerBase.z;
        this.m = beanDeserializerBase.m;
        UnwrappedPropertyHandler unwrappedPropertyHandler = beanDeserializerBase.x;
        String str = null;
        if (unwrappedPropertyHandler != null) {
            ArrayList arrayList = unwrappedPropertyHandler.f14254a;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SettableBeanProperty settableBeanPropertyC = (SettableBeanProperty) it.next();
                String strB = nameTransformer.b(settableBeanPropertyC.f.d);
                PropertyName propertyName3 = settableBeanPropertyC.f;
                if (propertyName3 != null) {
                    strB = strB == null ? "" : strB;
                    propertyName2 = strB.equals(propertyName3.d) ? propertyName3 : new PropertyName(strB, propertyName3.e);
                } else {
                    propertyName2 = new PropertyName(strB, null);
                }
                settableBeanPropertyC = propertyName2 != propertyName3 ? settableBeanPropertyC.C(propertyName2) : settableBeanPropertyC;
                JsonDeserializer jsonDeserializerQ = settableBeanPropertyC.q();
                if (jsonDeserializerQ != null && (jsonDeserializerP2 = jsonDeserializerQ.p(nameTransformer)) != jsonDeserializerQ) {
                    settableBeanPropertyC = settableBeanPropertyC.E(jsonDeserializerP2);
                }
                arrayList2.add(settableBeanPropertyC);
            }
            unwrappedPropertyHandler = new UnwrappedPropertyHandler(arrayList2);
        }
        BeanPropertyMap beanPropertyMap = beanDeserializerBase.o;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.i;
        if (nameTransformer != NameTransformer.d) {
            int length = settableBeanPropertyArr.length;
            ArrayList arrayList3 = new ArrayList(length);
            int i = 0;
            while (i < length) {
                SettableBeanProperty settableBeanPropertyC2 = settableBeanPropertyArr[i];
                if (settableBeanPropertyC2 == null) {
                    arrayList3.add(settableBeanPropertyC2);
                } else {
                    PropertyName propertyName4 = settableBeanPropertyC2.f;
                    String strB2 = nameTransformer.b(propertyName4.d);
                    if (propertyName4 != null) {
                        strB2 = strB2 == null ? "" : strB2;
                        propertyName = strB2.equals(propertyName4.d) ? propertyName4 : new PropertyName(strB2, propertyName4.e);
                    } else {
                        propertyName = new PropertyName(strB2, str);
                    }
                    settableBeanPropertyC2 = propertyName != propertyName4 ? settableBeanPropertyC2.C(propertyName) : settableBeanPropertyC2;
                    JsonDeserializer jsonDeserializerQ2 = settableBeanPropertyC2.q();
                    if (jsonDeserializerQ2 != null && (jsonDeserializerP = jsonDeserializerQ2.p(nameTransformer)) != jsonDeserializerQ2) {
                        settableBeanPropertyC2 = settableBeanPropertyC2.E(jsonDeserializerP);
                    }
                    arrayList3.add(settableBeanPropertyC2);
                }
                i++;
                str = null;
            }
            beanPropertyMap = new BeanPropertyMap(beanPropertyMap.d, arrayList3, beanPropertyMap.j, beanPropertyMap.l);
        }
        this.o = beanPropertyMap;
        this.x = unwrappedPropertyHandler;
        this.u = beanDeserializerBase.u;
        this.h = beanDeserializerBase.h;
        this.n = false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        JavaType javaType = beanDeserializerBase.g;
        super(javaType);
        this.g = javaType;
        this.i = beanDeserializerBase.i;
        this.j = beanDeserializerBase.j;
        this.k = beanDeserializerBase.k;
        this.l = beanDeserializerBase.l;
        this.v = beanDeserializerBase.v;
        this.r = beanDeserializerBase.r;
        this.t = beanDeserializerBase.t;
        this.s = beanDeserializerBase.s;
        this.q = beanDeserializerBase.q;
        this.p = beanDeserializerBase.p;
        this.m = beanDeserializerBase.m;
        this.x = beanDeserializerBase.x;
        this.u = beanDeserializerBase.u;
        this.h = beanDeserializerBase.h;
        this.z = objectIdReader;
        this.o = beanDeserializerBase.o.k(new ObjectIdValueProperty(objectIdReader, PropertyMetadata.k));
        this.n = false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set set, Set set2) {
        JavaType javaType = beanDeserializerBase.g;
        super(javaType);
        this.g = javaType;
        this.i = beanDeserializerBase.i;
        this.j = beanDeserializerBase.j;
        this.k = beanDeserializerBase.k;
        this.l = beanDeserializerBase.l;
        this.v = beanDeserializerBase.v;
        this.r = set;
        this.t = beanDeserializerBase.t;
        this.s = set2;
        this.q = beanDeserializerBase.q;
        this.p = beanDeserializerBase.p;
        this.m = beanDeserializerBase.m;
        this.x = beanDeserializerBase.x;
        this.u = beanDeserializerBase.u;
        this.h = beanDeserializerBase.h;
        this.n = beanDeserializerBase.n;
        this.z = beanDeserializerBase.z;
        BeanPropertyMap beanPropertyMap = beanDeserializerBase.o;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.i;
        if ((set != null && !set.isEmpty()) || set2 != null) {
            ArrayList arrayList = new ArrayList(settableBeanPropertyArr.length);
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                if (settableBeanProperty != null && !IgnorePropertiesUtil.b(settableBeanProperty.f.d, set, set2)) {
                    arrayList.add(settableBeanProperty);
                }
            }
            beanPropertyMap = new BeanPropertyMap(beanPropertyMap.d, arrayList, beanPropertyMap.j, beanPropertyMap.l);
        }
        this.o = beanPropertyMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        JavaType javaType = beanDeserializerBase.g;
        super(javaType);
        this.g = javaType;
        this.i = beanDeserializerBase.i;
        this.j = beanDeserializerBase.j;
        this.k = beanDeserializerBase.k;
        this.l = beanDeserializerBase.l;
        this.o = beanPropertyMap;
        this.v = beanDeserializerBase.v;
        this.r = beanDeserializerBase.r;
        this.t = beanDeserializerBase.t;
        this.s = beanDeserializerBase.s;
        this.q = beanDeserializerBase.q;
        this.p = beanDeserializerBase.p;
        this.z = beanDeserializerBase.z;
        this.m = beanDeserializerBase.m;
        this.x = beanDeserializerBase.x;
        this.u = beanDeserializerBase.u;
        this.h = beanDeserializerBase.h;
        this.n = beanDeserializerBase.n;
    }
}
