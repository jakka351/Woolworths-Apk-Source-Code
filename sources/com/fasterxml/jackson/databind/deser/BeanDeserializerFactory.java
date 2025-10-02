package com.fasterxml.jackson.databind.deser;

import YU.a;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    public static final Class[] e = {Throwable.class};
    public static final BeanDeserializerFactory f = new BeanDeserializerFactory(new DeserializerFactoryConfig(null, null, null, null, null));

    public static void G(BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) throws SecurityException {
        Map mapG = beanDescription.g();
        if (mapG != null) {
            for (Map.Entry entry : mapG.entrySet()) {
                AnnotatedMember annotatedMember = (AnnotatedMember) entry.getValue();
                PropertyName propertyNameA = PropertyName.a(annotatedMember.d());
                JavaType javaTypeF = annotatedMember.f();
                beanDescription.l();
                Object key = entry.getKey();
                DeserializationConfig deserializationConfig = beanDeserializerBuilder.f14239a;
                if (beanDeserializerBuilder.e == null) {
                    beanDeserializerBuilder.e = new ArrayList();
                }
                deserializationConfig.getClass();
                if (deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                    try {
                        annotatedMember.g(deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    } catch (IllegalArgumentException e2) {
                        beanDeserializerBuilder.c(e2);
                        throw null;
                    }
                }
                beanDeserializerBuilder.e.add(new ValueInjector(propertyNameA, javaTypeF, annotatedMember, key));
            }
        }
    }

    public static void H(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        JavaType javaType;
        ObjectIdGenerator objectIdGeneratorG;
        SettableBeanProperty settableBeanProperty;
        ObjectIdInfo objectIdInfoQ = beanDescription.q();
        if (objectIdInfoQ == null) {
            return;
        }
        PropertyName propertyName = objectIdInfoQ.f14277a;
        Class cls = objectIdInfoQ.b;
        ObjectIdResolver objectIdResolverH = deserializationContext.h(objectIdInfoQ);
        if (cls == ObjectIdGenerators.PropertyGenerator.class) {
            String str = propertyName.d;
            settableBeanProperty = (SettableBeanProperty) beanDeserializerBuilder.d.get(str);
            if (settableBeanProperty == null) {
                throw new IllegalArgumentException(a.i("Invalid Object Id definition for ", ClassUtil.t(beanDescription.f14226a), ": cannot find property with name ", ClassUtil.c(str)));
            }
            javaType = settableBeanProperty.g;
            objectIdGeneratorG = new PropertyBasedObjectIdGenerator(objectIdInfoQ.d);
        } else {
            JavaType javaTypeL = deserializationContext.l(cls);
            deserializationContext.e().getClass();
            javaType = TypeFactory.m(javaTypeL, ObjectIdGenerator.class)[0];
            objectIdGeneratorG = deserializationContext.g(objectIdInfoQ);
            settableBeanProperty = null;
        }
        SettableBeanProperty settableBeanProperty2 = settableBeanProperty;
        JavaType javaType2 = javaType;
        beanDeserializerBuilder.j = new ObjectIdReader(javaType2, propertyName, objectIdGeneratorG, deserializationContext.u(javaType2), settableBeanProperty2, objectIdResolverH);
    }

    @Override // com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
    public final BeanDeserializerFactory D(DeserializerFactoryConfig deserializerFactoryConfig) {
        if (this.d == deserializerFactoryConfig) {
            return this;
        }
        ClassUtil.H(BeanDeserializerFactory.class, this, "withConfig");
        return new BeanDeserializerFactory(deserializerFactoryConfig);
    }

    public final void E(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) throws InvalidDefinitionException {
        ArrayList<BeanPropertyDefinition> arrayListC = beanDescription.c();
        if (arrayListC != null) {
            for (BeanPropertyDefinition beanPropertyDefinition : arrayListC) {
                AnnotationIntrospector.ReferenceProperty referencePropertyN = beanPropertyDefinition.n();
                String str = referencePropertyN == null ? null : referencePropertyN.b;
                SettableBeanProperty settableBeanPropertyI = I(deserializationContext, beanDescription, beanPropertyDefinition, beanPropertyDefinition.u());
                DeserializationConfig deserializationConfig = beanDeserializerBuilder.f14239a;
                if (beanDeserializerBuilder.f == null) {
                    beanDeserializerBuilder.f = new HashMap(4);
                }
                deserializationConfig.getClass();
                if (deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                    try {
                        settableBeanPropertyI.k(deserializationConfig);
                    } catch (IllegalArgumentException e2) {
                        beanDeserializerBuilder.c(e2);
                        throw null;
                    }
                }
                beanDeserializerBuilder.f.put(str, settableBeanPropertyI);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d7  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.fasterxml.jackson.databind.DeserializationContext] */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(com.fasterxml.jackson.databind.DeserializationContext r29, com.fasterxml.jackson.databind.BeanDescription r30, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder r31) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.F(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder):void");
    }

    public final SettableBeanProperty I(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType) throws InvalidDefinitionException {
        BeanPropertyDefinition beanPropertyDefinition2;
        SettableBeanProperty fieldProperty;
        AnnotatedMember annotatedMemberW = beanPropertyDefinition.w();
        if (annotatedMemberW == null) {
            annotatedMemberW = beanPropertyDefinition.s();
        }
        if (annotatedMemberW == null) {
            deserializationContext.S(beanDescription, beanPropertyDefinition, "No non-constructor mutator available", new Object[0]);
            throw null;
        }
        JavaType javaTypeC = C(deserializationContext, annotatedMemberW, javaType);
        TypeDeserializer typeDeserializer = (TypeDeserializer) javaTypeC.g;
        if (annotatedMemberW instanceof AnnotatedMethod) {
            beanPropertyDefinition2 = beanPropertyDefinition;
            fieldProperty = new MethodProperty(beanPropertyDefinition2, javaTypeC, typeDeserializer, beanDescription.l(), (AnnotatedMethod) annotatedMemberW);
        } else {
            beanPropertyDefinition2 = beanPropertyDefinition;
            fieldProperty = new FieldProperty(beanPropertyDefinition2, javaTypeC, typeDeserializer, beanDescription.l(), (AnnotatedField) annotatedMemberW);
        }
        JsonDeserializer jsonDeserializerY = BasicDeserializerFactory.y(deserializationContext, annotatedMemberW);
        if (jsonDeserializerY == null) {
            jsonDeserializerY = (JsonDeserializer) javaTypeC.f;
        }
        if (jsonDeserializerY != null) {
            fieldProperty = fieldProperty.E(deserializationContext.B(jsonDeserializerY, fieldProperty, javaTypeC));
        }
        AnnotationIntrospector.ReferenceProperty referencePropertyN = beanPropertyDefinition2.n();
        if (referencePropertyN != null && referencePropertyN.f14225a == AnnotationIntrospector.ReferenceProperty.Type.d) {
            fieldProperty.l = referencePropertyN.b;
        }
        ObjectIdInfo objectIdInfoM = beanPropertyDefinition2.m();
        if (objectIdInfoM != null) {
            fieldProperty.m = objectIdInfoM;
        }
        return fieldProperty;
    }

    public final SetterlessProperty J(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        AnnotatedMethod annotatedMethodT = beanPropertyDefinition.t();
        JavaType javaTypeC = C(deserializationContext, annotatedMethodT, annotatedMethodT.f());
        SetterlessProperty setterlessProperty = new SetterlessProperty(beanPropertyDefinition, javaTypeC, (TypeDeserializer) javaTypeC.g, beanDescription.l(), annotatedMethodT);
        JsonDeserializer jsonDeserializerY = BasicDeserializerFactory.y(deserializationContext, annotatedMethodT);
        if (jsonDeserializerY == null) {
            jsonDeserializerY = (JsonDeserializer) javaTypeC.f;
        }
        return jsonDeserializerY != null ? (SetterlessProperty) setterlessProperty.E(deserializationContext.B(jsonDeserializerY, setterlessProperty, javaTypeC)) : setterlessProperty;
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x0448, code lost:
    
        if (r8.endsWith("DataSource") != false) goto L318;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0277 A[PHI: r12
  0x0277: PHI (r12v70 com.fasterxml.jackson.databind.JsonDeserializer) = 
  (r12v42 com.fasterxml.jackson.databind.JsonDeserializer)
  (r12v90 com.fasterxml.jackson.databind.JsonDeserializer)
  (r12v92 com.fasterxml.jackson.databind.JsonDeserializer)
  (r12v93 com.fasterxml.jackson.databind.JsonDeserializer)
  (r12v94 com.fasterxml.jackson.databind.JsonDeserializer)
  (r12v95 com.fasterxml.jackson.databind.JsonDeserializer)
  (r12v96 com.fasterxml.jackson.databind.JsonDeserializer)
  (r12v97 com.fasterxml.jackson.databind.JsonDeserializer)
 binds: [B:163:0x0275, B:200:0x0303, B:224:0x035e, B:221:0x0353, B:218:0x0348, B:215:0x033d, B:212:0x0326, B:209:0x031b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03f9  */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer b(com.fasterxml.jackson.databind.DeserializationContext r18, com.fasterxml.jackson.databind.JavaType r19, com.fasterxml.jackson.databind.BeanDescription r20) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.b(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final JsonDeserializer c(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class cls) throws InvalidDefinitionException, SecurityException {
        JavaType javaType2;
        boolean z;
        MapperFeature mapperFeature = MapperFeature.INFER_BUILDER_TYPE_BINDINGS;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        BasicBeanDescription basicBeanDescriptionD = deserializationConfig.e.e.d(deserializationConfig, deserializationConfig.m(mapperFeature) ? deserializationContext.e().c(null, cls, javaType.j()) : deserializationContext.l(cls), deserializationConfig, beanDescription);
        try {
            ValueInstantiator valueInstantiatorB = B(basicBeanDescriptionD, deserializationContext);
            BeanDeserializerBuilder beanDeserializerBuilder = new BeanDeserializerBuilder(basicBeanDescriptionD, deserializationContext);
            beanDeserializerBuilder.i = valueInstantiatorB;
            F(deserializationContext, basicBeanDescriptionD, beanDeserializerBuilder);
            H(deserializationContext, basicBeanDescriptionD, beanDeserializerBuilder);
            E(deserializationContext, basicBeanDescriptionD, beanDeserializerBuilder);
            G(basicBeanDescriptionD, beanDeserializerBuilder);
            AnnotationIntrospector annotationIntrospector = basicBeanDescriptionD.d;
            JsonPOJOBuilder.Value valueD = annotationIntrospector == null ? null : annotationIntrospector.D(basicBeanDescriptionD.e);
            String str = valueD == null ? "build" : valueD.f14232a;
            AnnotatedMethod annotatedMethodI = basicBeanDescriptionD.i(str, null);
            if (annotatedMethodI != null && deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                ClassUtil.e(annotatedMethodI.g, deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            beanDeserializerBuilder.m = annotatedMethodI;
            DeserializerFactoryConfig deserializerFactoryConfig = this.d;
            if (deserializerFactoryConfig.c()) {
                ArrayIterator arrayIteratorA = deserializerFactoryConfig.a();
                while (arrayIteratorA.hasNext()) {
                    ((BeanDeserializerModifier) arrayIteratorA.next()).getClass();
                }
            }
            AnnotatedMethod annotatedMethod = beanDeserializerBuilder.m;
            BeanDescription beanDescription2 = beanDeserializerBuilder.c;
            DeserializationContext deserializationContext2 = beanDeserializerBuilder.b;
            if (annotatedMethod != null) {
                Class<?> returnType = annotatedMethod.g.getReturnType();
                javaType2 = javaType;
                Class<?> cls2 = javaType2.d;
                if (returnType != cls2 && !returnType.isAssignableFrom(cls2) && !cls2.isAssignableFrom(returnType)) {
                    JavaType javaType3 = beanDescription2.f14226a;
                    String strI = beanDeserializerBuilder.m.i();
                    String strO = ClassUtil.o(returnType);
                    String strT = ClassUtil.t(javaType2);
                    StringBuilder sbV = a.v("Build method `", strI, "` has wrong return type (", strO, "), not compatible with POJO type (");
                    sbV.append(strT);
                    sbV.append(")");
                    deserializationContext2.j(sbV.toString());
                    throw null;
                }
            } else {
                if (!str.isEmpty()) {
                    deserializationContext2.j(a.j("Builder class ", ClassUtil.t(beanDescription2.f14226a), " does not have build method (name: '", str, "')"));
                    throw null;
                }
                javaType2 = javaType;
            }
            Collection collectionValues = beanDeserializerBuilder.d.values();
            beanDeserializerBuilder.b(collectionValues);
            Map mapA = beanDeserializerBuilder.a(collectionValues);
            Boolean boolB = beanDescription2.f().b(JsonFormat.Feature.e);
            DeserializationConfig deserializationConfig2 = beanDeserializerBuilder.f14239a;
            BeanPropertyMap beanPropertyMap = new BeanPropertyMap(boolB == null ? deserializationConfig2.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : boolB.booleanValue(), collectionValues, mapA, deserializationConfig2.e.i);
            int length = beanPropertyMap.h.length;
            int i = 0;
            for (int i2 = 1; i2 < length; i2 += 2) {
                SettableBeanProperty settableBeanProperty = (SettableBeanProperty) beanPropertyMap.h[i2];
                if (settableBeanProperty != null) {
                    settableBeanProperty.f(i);
                    i++;
                }
            }
            boolean zM = deserializationConfig2.m(MapperFeature.DEFAULT_VIEW_INCLUSION);
            boolean z2 = !zM;
            if (zM) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((SettableBeanProperty) it.next()).u()) {
                        z = true;
                        break;
                    }
                }
                z = z2;
            } else {
                z = z2;
            }
            if (beanDeserializerBuilder.j != null) {
                beanPropertyMap = beanPropertyMap.k(new ObjectIdValueProperty(beanDeserializerBuilder.j, PropertyMetadata.k));
            }
            BuilderBasedDeserializer builderBasedDeserializer = new BuilderBasedDeserializer(beanDeserializerBuilder, beanDeserializerBuilder.c, javaType2, beanPropertyMap, beanDeserializerBuilder.f, beanDeserializerBuilder.g, beanDeserializerBuilder.l, beanDeserializerBuilder.h, z);
            if (deserializerFactoryConfig.c()) {
                ArrayIterator arrayIteratorA2 = deserializerFactoryConfig.a();
                while (arrayIteratorA2.hasNext()) {
                    ((BeanDeserializerModifier) arrayIteratorA2.next()).getClass();
                }
            }
            return builderBasedDeserializer;
        } catch (IllegalArgumentException e2) {
            throw new InvalidDefinitionException(deserializationContext.i, ClassUtil.i(e2));
        } catch (NoClassDefFoundError e3) {
            return new ErrorThrowingDeserializer(e3);
        }
    }
}
