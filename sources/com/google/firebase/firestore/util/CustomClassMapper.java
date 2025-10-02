package com.google.firebase.firestore.util;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Blob;
import com.google.firebase.firestore.DocumentId;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.PropertyName;
import com.google.firebase.firestore.ServerTimestamp;
import com.google.firebase.firestore.VectorValue;
import com.google.firebase.firestore.model.DocumentKey;
import com.woolworths.scanlibrary.data.firebase.firestore.FireStoreCartDocument;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class CustomClassMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f15596a = new ConcurrentHashMap();

    public static class BeanMapper<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class f15597a;
        public final Constructor b;
        public final boolean c;
        public final boolean d;
        public final HashMap e = new HashMap();
        public final HashMap g = new HashMap();
        public final HashMap f = new HashMap();
        public final HashMap h = new HashMap();
        public final HashSet i = new HashSet();
        public final HashSet j = new HashSet();

        /* JADX WARN: Code restructure failed: missing block: B:146:0x0387, code lost:
        
            if (r20.e.isEmpty() != false) goto L158;
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x0389, code lost:
        
            r2 = r20.j.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x0393, code lost:
        
            if (r2.hasNext() == false) goto L199;
         */
        /* JADX WARN: Code restructure failed: missing block: B:150:0x0395, code lost:
        
            r3 = (java.lang.String) r2.next();
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x03a1, code lost:
        
            if (r20.g.containsKey(r3) != false) goto L203;
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x03a9, code lost:
        
            if (r20.h.containsKey(r3) == false) goto L201;
         */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x03bf, code lost:
        
            throw new java.lang.RuntimeException(androidx.constraintlayout.core.state.a.f(r21, YU.a.u("@DocumentId is annotated on property ", r3, " of class "), " but no field or public setter was found"));
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x03c0, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:159:0x03d0, code lost:
        
            throw new java.lang.RuntimeException("No properties to serialize found on class ".concat(r21.getName()));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public BeanMapper(java.lang.Class r21) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
            /*
                Method dump skipped, instructions count: 977
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.util.CustomClassMapper.BeanMapper.<init>(java.lang.Class):void");
        }

        public static String b(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(PropertyName.class)) {
                return ((PropertyName) accessibleObject.getAnnotation(PropertyName.class)).value();
            }
            return null;
        }

        public static void e(Class cls, String str, String str2) {
            if (cls == String.class || cls == DocumentReference.class) {
                return;
            }
            throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + cls + " instead of String or DocumentReference.");
        }

        public static boolean f(Method method, Method method2) {
            CustomClassMapper.g("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
            Class<?> returnType = method.getReturnType();
            Class cls = Void.TYPE;
            CustomClassMapper.g("Expected void return type", returnType.equals(cls));
            CustomClassMapper.g("Expected void return type", method2.getReturnType().equals(cls));
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            CustomClassMapper.g("Expected exactly one parameter", parameterTypes.length == 1);
            CustomClassMapper.g("Expected exactly one parameter", parameterTypes2.length == 1);
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        public static String g(Method method) {
            String strB = b(method);
            if (strB != null) {
                return strB;
            }
            String name = method.getName();
            String[] strArr = {"get", "set", "is"};
            String str = null;
            for (int i = 0; i < 3; i++) {
                String str2 = strArr[i];
                if (name.startsWith(str2)) {
                    str = str2;
                }
            }
            if (str == null) {
                throw new IllegalArgumentException(YU.a.A("Unknown Bean prefix for method: ", name));
            }
            char[] charArray = name.substring(str.length()).toCharArray();
            for (int i2 = 0; i2 < charArray.length && Character.isUpperCase(charArray[i2]); i2++) {
                charArray[i2] = Character.toLowerCase(charArray[i2]);
            }
            return new String(charArray);
        }

        public static Type h(Type type, Map map) {
            if (!(type instanceof TypeVariable)) {
                return type;
            }
            Type type2 = (Type) map.get(type);
            if (type2 != null) {
                return type2;
            }
            throw new IllegalStateException("Could not resolve type " + type);
        }

        public final void a(String str) {
            Locale locale = Locale.US;
            String str2 = (String) this.e.put(str.toLowerCase(locale), str);
            if (str2 == null || str.equals(str2)) {
                return;
            }
            throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        public final void c(Field field) {
            if (field.isAnnotationPresent(ServerTimestamp.class)) {
                Class<?> type = field.getType();
                if (type != Date.class && type != Timestamp.class) {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
                String strB = b(field);
                if (strB == null) {
                    strB = field.getName();
                }
                this.i.add(strB);
            }
            if (field.isAnnotationPresent(DocumentId.class)) {
                e(field.getType(), "Field", "is");
                String strB2 = b(field);
                if (strB2 == null) {
                    strB2 = field.getName();
                }
                this.j.add(strB2);
            }
        }

        public final Object d(Map map, Map map2, DeserializeContext deserializeContext) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Class cls;
            int i;
            ErrorPath errorPath = deserializeContext.f15598a;
            DocumentReference documentReference = deserializeContext.b;
            Class cls2 = this.f15597a;
            Constructor constructor = this.b;
            if (constructor == null) {
                throw CustomClassMapper.c(errorPath, "Class " + cls2.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped");
            }
            try {
                Object objNewInstance = constructor.newInstance(null);
                HashSet hashSet = new HashSet();
                Iterator it = map.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    int i2 = 1;
                    HashMap map3 = this.h;
                    HashMap map4 = this.g;
                    if (!zHasNext) {
                        Iterator it2 = this.j.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (hashSet.contains(str)) {
                                StringBuilder sbU = YU.a.u("'", str, "' was found from document ");
                                sbU.append(documentReference.f15424a.d.b());
                                sbU.append(", cannot apply @DocumentId on this property for class ");
                                sbU.append(cls2.getName());
                                throw new RuntimeException(sbU.toString());
                            }
                            DocumentKey documentKey = documentReference.f15424a;
                            ErrorPath errorPath2 = new ErrorPath(errorPath, str, errorPath.f15599a + i2);
                            if (map4.containsKey(str)) {
                                Method method = (Method) map4.get(str);
                                Type[] genericParameterTypes = method.getGenericParameterTypes();
                                cls = cls2;
                                i = 1;
                                if (genericParameterTypes.length != 1) {
                                    throw CustomClassMapper.c(errorPath2, "Setter does not have exactly one parameter");
                                }
                                if (h(genericParameterTypes[0], map2) == String.class) {
                                    ApiUtil.a(method, objNewInstance, documentKey.d.e());
                                } else {
                                    ApiUtil.a(method, objNewInstance, documentReference);
                                }
                            } else {
                                cls = cls2;
                                i = 1;
                                Field field = (Field) map3.get(str);
                                try {
                                    if (field.getType() == String.class) {
                                        field.set(objNewInstance, documentKey.d.e());
                                    } else {
                                        field.set(objNewInstance, documentReference);
                                    }
                                } catch (IllegalAccessException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            i2 = i;
                            cls2 = cls;
                        }
                        return objNewInstance;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    ErrorPath errorPath3 = new ErrorPath(errorPath, str2, errorPath.f15599a + 1);
                    if (map4.containsKey(str2)) {
                        Method method2 = (Method) map4.get(str2);
                        Type[] genericParameterTypes2 = method2.getGenericParameterTypes();
                        if (genericParameterTypes2.length != 1) {
                            throw CustomClassMapper.c(errorPath3, "Setter does not have exactly one parameter");
                        }
                        ApiUtil.a(method2, objNewInstance, CustomClassMapper.e(entry.getValue(), h(genericParameterTypes2[0], map2), new DeserializeContext(errorPath3, documentReference)));
                        hashSet.add(str2);
                    } else if (map3.containsKey(str2)) {
                        Field field2 = (Field) map3.get(str2);
                        try {
                            field2.set(objNewInstance, CustomClassMapper.e(entry.getValue(), h(field2.getGenericType(), map2), new DeserializeContext(errorPath3, documentReference)));
                            hashSet.add(str2);
                        } catch (IllegalAccessException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        StringBuilder sbU2 = YU.a.u("No setter/field for ", str2, " found on class ");
                        sbU2.append(cls2.getName());
                        String string = sbU2.toString();
                        if (this.e.containsKey(str2.toLowerCase(Locale.US))) {
                            string = YU.a.g(string, " (fields/setters are case sensitive!)");
                        }
                        if (this.c) {
                            throw new RuntimeException(string);
                        }
                        if (this.d) {
                            Logger.c("CustomClassMapper", "%s", string);
                        }
                    }
                }
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    public static class DeserializeContext {

        /* renamed from: a, reason: collision with root package name */
        public final ErrorPath f15598a;
        public final DocumentReference b;

        public DeserializeContext(ErrorPath errorPath, DocumentReference documentReference) {
            this.f15598a = errorPath;
            this.b = documentReference;
        }
    }

    public static class ErrorPath {
        public static final ErrorPath d = new ErrorPath(null, null, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f15599a;
        public final ErrorPath b;
        public final String c;

        public ErrorPath(ErrorPath errorPath, String str, int i) {
            this.b = errorPath;
            this.c = str;
            this.f15599a = i;
        }

        public final String toString() {
            int i = this.f15599a;
            if (i == 0) {
                return "";
            }
            String str = this.c;
            if (i == 1) {
                return str;
            }
            return this.b.toString() + "." + str;
        }
    }

    public static Double a(Object obj, DeserializeContext deserializeContext) {
        ErrorPath errorPath = deserializeContext.f15598a;
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw c(errorPath, "Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
        Long l = (Long) obj;
        Double dValueOf = Double.valueOf(l.doubleValue());
        if (dValueOf.longValue() == l.longValue()) {
            return dValueOf;
        }
        throw c(errorPath, "Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
    }

    public static Object b(Map map, DocumentReference documentReference) {
        return d(map, FireStoreCartDocument.class, new DeserializeContext(ErrorPath.d, documentReference));
    }

    public static RuntimeException c(ErrorPath errorPath, String str) {
        String strA = YU.a.A("Could not deserialize object. ", str);
        if (errorPath.f15599a > 0) {
            strA = YU.a.o(YU.a.t(strA, " (found in field '"), errorPath.toString(), "')");
        }
        return new RuntimeException(strA);
    }

    public static Object d(Object obj, Class cls, DeserializeContext deserializeContext) throws SecurityException {
        ErrorPath errorPath = deserializeContext.f15598a;
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls) || Character.class.isAssignableFrom(cls)) {
            if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
                if (obj instanceof Integer) {
                    return (Integer) obj;
                }
                if (!(obj instanceof Long) && !(obj instanceof Double)) {
                    throw c(errorPath, "Failed to convert a value of type " + obj.getClass().getName() + " to int");
                }
                Number number = (Number) obj;
                double dDoubleValue = number.doubleValue();
                if (dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
                    return Integer.valueOf(number.intValue());
                }
                throw c(errorPath, "Numeric value out of 32-bit integer range: " + dDoubleValue + ". Did you mean to use a long or double instead of an int?");
            }
            if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                throw c(errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to boolean");
            }
            if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
                return a(obj, deserializeContext);
            }
            if (!Long.class.isAssignableFrom(cls) && !Long.TYPE.isAssignableFrom(cls)) {
                if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
                    return Float.valueOf(a(obj, deserializeContext).floatValue());
                }
                throw c(errorPath, "Deserializing values to " + cls.getSimpleName() + " is not supported");
            }
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).longValue());
            }
            if (obj instanceof Long) {
                return (Long) obj;
            }
            if (!(obj instanceof Double)) {
                throw c(errorPath, "Failed to convert a value of type " + obj.getClass().getName() + " to long");
            }
            Double d = (Double) obj;
            if (d.doubleValue() >= -9.223372036854776E18d && d.doubleValue() <= 9.223372036854776E18d) {
                return Long.valueOf(d.longValue());
            }
            throw c(errorPath, "Numeric value out of 64-bit long range: " + d + ". Did you mean to use a double instead of a long?");
        }
        if (String.class.isAssignableFrom(cls)) {
            if (obj instanceof String) {
                return (String) obj;
            }
            throw c(errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to String");
        }
        if (Date.class.isAssignableFrom(cls)) {
            if (obj instanceof Date) {
                return (Date) obj;
            }
            if (obj instanceof Timestamp) {
                return new Date((((Timestamp) obj).d * 1000) + (r5.e / 1000000));
            }
            throw c(errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to Date");
        }
        if (Timestamp.class.isAssignableFrom(cls)) {
            if (obj instanceof Timestamp) {
                return (Timestamp) obj;
            }
            if (obj instanceof Date) {
                return new Timestamp((Date) obj);
            }
            throw c(errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to Timestamp");
        }
        if (Blob.class.isAssignableFrom(cls)) {
            if (obj instanceof Blob) {
                return (Blob) obj;
            }
            throw c(errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to Blob");
        }
        if (GeoPoint.class.isAssignableFrom(cls)) {
            if (obj instanceof GeoPoint) {
                return (GeoPoint) obj;
            }
            throw c(errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to GeoPoint");
        }
        if (DocumentReference.class.isAssignableFrom(cls)) {
            if (obj instanceof DocumentReference) {
                return (DocumentReference) obj;
            }
            throw c(errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to DocumentReference");
        }
        if (VectorValue.class.isAssignableFrom(cls)) {
            if (obj instanceof VectorValue) {
                return (VectorValue) obj;
            }
            throw c(errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to VectorValue");
        }
        if (cls.isArray()) {
            throw c(errorPath, "Converting to Arrays is not supported, please use Lists instead");
        }
        if (cls.getTypeParameters().length > 0) {
            throw c(errorPath, "Class " + cls.getName() + " has generic type parameters");
        }
        if (cls.equals(Object.class)) {
            return obj;
        }
        if (!cls.isEnum()) {
            ConcurrentHashMap concurrentHashMap = f15596a;
            BeanMapper beanMapper = (BeanMapper) concurrentHashMap.get(cls);
            if (beanMapper == null) {
                beanMapper = new BeanMapper(cls);
                concurrentHashMap.put(cls, beanMapper);
            }
            if (obj instanceof Map) {
                return beanMapper.d(f(obj, deserializeContext), Collections.EMPTY_MAP, deserializeContext);
            }
            throw c(errorPath, "Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
        }
        if (!(obj instanceof String)) {
            throw c(errorPath, "Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
        }
        String name = (String) obj;
        Field[] fields = cls.getFields();
        int length = fields.length;
        int i = 0;
        while (true) {
            if (i < length) {
                Field field = fields[i];
                if (field.isEnumConstant()) {
                    String strB = BeanMapper.b(field);
                    if (strB == null) {
                        strB = field.getName();
                    }
                    if (name.equals(strB)) {
                        name = field.getName();
                        break;
                    }
                }
                i++;
            }
        }
        try {
            return Enum.valueOf(cls, name);
        } catch (IllegalArgumentException unused) {
            throw c(errorPath, "Could not find enum value of " + cls.getName() + " for value \"" + name + "\"");
        }
    }

    public static Object e(Object obj, Type type, DeserializeContext deserializeContext) {
        DocumentReference documentReference = deserializeContext.b;
        ErrorPath errorPath = deserializeContext.f15598a;
        if (obj == null) {
            return null;
        }
        int i = 0;
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof Class) {
                return d(obj, (Class) type, deserializeContext);
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length > 0) {
                    throw c(errorPath, "Generic lower-bounded wildcard types are not supported");
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                g("Unexpected type bounds on wildcard " + type, upperBounds.length > 0);
                return e(obj, upperBounds[0], deserializeContext);
            }
            if (!(type instanceof TypeVariable)) {
                if (type instanceof GenericArrayType) {
                    throw c(errorPath, "Generic Arrays are not supported, please use Lists instead");
                }
                throw c(errorPath, "Unknown type encountered: " + type);
            }
            Type[] bounds = ((TypeVariable) type).getBounds();
            g("Unexpected type bounds on type variable " + type, bounds.length > 0);
            return e(obj, bounds[0], deserializeContext);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (!(obj instanceof List)) {
                throw c(errorPath, "Expected a List, but got a " + obj.getClass());
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            while (i < list.size()) {
                arrayList.add(e(list.get(i), type2, new DeserializeContext(new ErrorPath(errorPath, YU.a.e(i, "[", "]"), errorPath.f15599a + 1), documentReference)));
                i++;
            }
            return arrayList;
        }
        if (Map.class.isAssignableFrom(cls)) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (!type3.equals(String.class)) {
                throw c(errorPath, "Only Maps with string keys are supported, but found Map with key type " + type3);
            }
            Map mapF = f(obj, deserializeContext);
            HashMap map = new HashMap();
            for (Map.Entry entry : mapF.entrySet()) {
                map.put((String) entry.getKey(), e(entry.getValue(), type4, new DeserializeContext(new ErrorPath(errorPath, (String) entry.getKey(), errorPath.f15599a + 1), documentReference)));
            }
            return map;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw c(errorPath, "Collections are not supported, please use Lists instead");
        }
        Map mapF2 = f(obj, deserializeContext);
        ConcurrentHashMap concurrentHashMap = f15596a;
        BeanMapper beanMapper = (BeanMapper) concurrentHashMap.get(cls);
        if (beanMapper == null) {
            beanMapper = new BeanMapper(cls);
            concurrentHashMap.put(cls, beanMapper);
        }
        HashMap map2 = new HashMap();
        TypeVariable[] typeParameters = beanMapper.f15597a.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length != typeParameters.length) {
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        }
        while (i < typeParameters.length) {
            map2.put(typeParameters[i], actualTypeArguments[i]);
            i++;
        }
        return beanMapper.d(mapF2, map2, deserializeContext);
    }

    public static Map f(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw c(deserializeContext.f15598a, "Expected a Map while deserializing, but got a " + obj.getClass());
    }

    public static void g(String str, boolean z) {
        if (!z) {
            throw new RuntimeException(YU.a.A("Hard assert failed: ", str));
        }
    }
}
