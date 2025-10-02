package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory g = new BeanSerializerFactory(null);

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public final JsonSerializer c(SerializerProvider serializerProvider, JavaType javaType) throws InvalidDefinitionException {
        SerializationConfig serializationConfig = serializerProvider.d;
        BaseSettings baseSettings = serializationConfig.e;
        BaseSettings baseSettings2 = serializationConfig.e;
        BasicBeanDescription basicBeanDescriptionE = baseSettings.e.e(serializationConfig, javaType, serializationConfig);
        AnnotatedClass annotatedClass = basicBeanDescriptionE.e;
        JsonSerializer jsonSerializerH = BasicSerializerFactory.h(serializerProvider, annotatedClass);
        if (jsonSerializerH != null) {
            return jsonSerializerH;
        }
        boolean z = false;
        try {
            JavaType javaTypeU0 = serializationConfig.d().u0(serializationConfig, annotatedClass, javaType);
            if (javaTypeU0 != javaType) {
                if (!javaTypeU0.u(javaType.d)) {
                    basicBeanDescriptionE = baseSettings2.e.e(serializationConfig, javaTypeU0, serializationConfig);
                }
                z = true;
            }
            AnnotationIntrospector annotationIntrospector = basicBeanDescriptionE.d;
            Converter converterT = annotationIntrospector != null ? basicBeanDescriptionE.t(annotationIntrospector.T(basicBeanDescriptionE.e)) : null;
            if (converterT == null) {
                return l(serializerProvider, javaTypeU0, basicBeanDescriptionE, z);
            }
            JavaType javaTypeC = converterT.c(serializerProvider.e());
            if (!javaTypeC.u(javaTypeU0.d)) {
                basicBeanDescriptionE = baseSettings2.e.e(serializationConfig, javaTypeC, serializationConfig);
                jsonSerializerH = BasicSerializerFactory.h(serializerProvider, basicBeanDescriptionE.e);
            }
            if (jsonSerializerH == null && !javaTypeC.D()) {
                jsonSerializerH = l(serializerProvider, javaTypeC, basicBeanDescriptionE, true);
            }
            return new StdDelegatingSerializer(converterT, javaTypeC, jsonSerializerH);
        } catch (JsonMappingException e) {
            serializerProvider.H(basicBeanDescriptionE, e.getMessage(), new Object[0]);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public final BeanSerializerFactory j(SerializerFactoryConfig serializerFactoryConfig) {
        if (this.d == serializerFactoryConfig) {
            return this;
        }
        if (getClass() == BeanSerializerFactory.class) {
            return new BeanSerializerFactory(serializerFactoryConfig);
        }
        throw new IllegalStateException("Subtype of BeanSerializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.ser.BeanPropertyWriter k(com.fasterxml.jackson.databind.SerializerProvider r20, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r21, com.fasterxml.jackson.databind.ser.PropertyBuilder r22, boolean r23, com.fasterxml.jackson.databind.introspect.AnnotatedMember r24) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BeanSerializerFactory.k(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.ser.PropertyBuilder, boolean, com.fasterxml.jackson.databind.introspect.AnnotatedMember):com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x036e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04be A[PHI: r11 r32
  0x04be: PHI (r11v23 ??) = (r11v21 ??), (r11v21 ??), (r11v21 ??), (r11v31 ??), (r11v31 ??) binds: [B:342:0x0593, B:343:0x0595, B:370:0x05e7, B:288:0x04a8, B:719:0x04be] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r32v3 boolean) = (r32v2 boolean), (r32v2 boolean), (r32v2 boolean), (r32v0 boolean), (r32v0 boolean) binds: [B:342:0x0593, B:343:0x0595, B:370:0x05e7, B:288:0x04a8, B:719:0x04be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06c0 A[PHI: r2 r4
  0x06c0: PHI (r2v18 com.fasterxml.jackson.databind.SerializerProvider) = (r2v0 com.fasterxml.jackson.databind.SerializerProvider), (r2v12 com.fasterxml.jackson.databind.SerializerProvider) binds: [B:423:0x06be, B:614:0x0a99] A[DONT_GENERATE, DONT_INLINE]
  0x06c0: PHI (r4v58 com.fasterxml.jackson.databind.JsonSerializer) = (r4v2 com.fasterxml.jackson.databind.JsonSerializer), (r4v32 com.fasterxml.jackson.databind.JsonSerializer) binds: [B:423:0x06be, B:614:0x0a99] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0b7f A[PHI: r3
  0x0b7f: PHI (r3v67 com.fasterxml.jackson.databind.JsonSerializer) = (r3v66 com.fasterxml.jackson.databind.JsonSerializer), (r3v71 com.fasterxml.jackson.databind.JsonSerializer) binds: [B:402:0x0673, B:655:0x0b76] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Type inference failed for: r11v21, types: [com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v31, types: [com.fasterxml.jackson.databind.ser.std.EnumSerializer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonSerializer l(com.fasterxml.jackson.databind.SerializerProvider r42, com.fasterxml.jackson.databind.JavaType r43, com.fasterxml.jackson.databind.BeanDescription r44, boolean r45) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instructions count: 2980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BeanSerializerFactory.l(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final ArrayIterator m() {
        return new ArrayIterator(this.d.d);
    }
}
