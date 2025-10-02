package au.com.woolworths.pay.internal.network;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class JSONHelper {
    public static JSONArray a(Object obj) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < Array.getLength(obj); i++) {
            if (Array.get(obj, i).getClass().isArray()) {
                jSONArray.put(i, a(Array.get(obj, i)));
            } else {
                jSONArray.put(i, Array.get(obj, i));
            }
        }
        return jSONArray;
    }

    public static void b(JSONArray jSONArray, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Class<?> cls = obj.getClass();
        String simpleName = cls.getComponentType().getSimpleName();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (cls.getComponentType().isArray()) {
                Array.set(obj, i, Array.newInstance(cls.getComponentType().getComponentType(), jSONArray.getJSONArray(i).length()));
                b(jSONArray.getJSONArray(i), Array.get(obj, i));
            } else if (cls.getComponentType().isPrimitive() || simpleName.equalsIgnoreCase("string")) {
                Array.set(obj, i, jSONArray.get(i));
            } else {
                Array.set(obj, i, c(cls.getComponentType(), jSONArray.getJSONObject(i)));
            }
        }
    }

    public static Object c(Class cls, JSONObject jSONObject) throws IllegalAccessException, JSONException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Object objNewInstance = declaredConstructor.newInstance(null);
        declaredConstructor.setAccessible(false);
        ArrayList arrayList = new ArrayList();
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            JSONField jSONField = (JSONField) field.getAnnotation(JSONField.class);
            if (jSONField != null) {
                field.setAccessible(true);
                String strValue = jSONField.value();
                if (strValue.isEmpty()) {
                    strValue = field.getName();
                }
                boolean z = jSONField.optional() && jSONObject.isNull(strValue);
                if (jSONObject.has(strValue) && !z) {
                    String simpleName = field.getType().getSimpleName();
                    if (simpleName.equals("boolean")) {
                        field.setBoolean(objNewInstance, jSONObject.getBoolean(strValue));
                    } else if (simpleName.equalsIgnoreCase("int")) {
                        field.setInt(objNewInstance, jSONObject.getInt(strValue));
                    } else if (simpleName.equalsIgnoreCase("double")) {
                        field.setDouble(objNewInstance, jSONObject.getDouble(strValue));
                    } else if (simpleName.equalsIgnoreCase("float")) {
                        field.setFloat(objNewInstance, (float) jSONObject.getDouble(strValue));
                    } else if (simpleName.equalsIgnoreCase("string")) {
                        field.set(objNewInstance, jSONObject.getString(strValue));
                    } else if (simpleName.equalsIgnoreCase("BigDecimal")) {
                        field.set(objNewInstance, new BigDecimal(jSONObject.getString(strValue)));
                    } else if (simpleName.equals("Boolean")) {
                        field.set(objNewInstance, Boolean.valueOf(jSONObject.getBoolean(strValue)));
                    } else if (simpleName.equalsIgnoreCase("Integer")) {
                        field.set(objNewInstance, Integer.valueOf(jSONObject.getInt(strValue)));
                    } else if (simpleName.equalsIgnoreCase("URL")) {
                        field.set(objNewInstance, new URL(jSONObject.getString(strValue)));
                    } else if (simpleName.equalsIgnoreCase("Date")) {
                        field.set(objNewInstance, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(jSONObject.getString(strValue)));
                    } else if (field.getType().isArray()) {
                        JSONArray jSONArray = jSONObject.getJSONArray(strValue);
                        field.set(objNewInstance, Array.newInstance(field.getType().getComponentType(), jSONArray.length()));
                        b(jSONArray, field.get(objNewInstance));
                    } else {
                        field.set(objNewInstance, c(field.getType(), jSONObject.getJSONObject(strValue)));
                    }
                } else if (!jSONField.optional()) {
                    throw new NoSuchFieldException("During JSON deserialisation, the class " + cls.toString() + " does not contain field " + strValue + ".");
                }
                field.setAccessible(false);
            }
        }
        return objNewInstance;
    }

    public static JSONObject d(Object obj) throws JSONException, SecurityException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
            }
            String simpleName = field.getType().getSimpleName();
            JSONField jSONField = (JSONField) field.getAnnotation(JSONField.class);
            if (jSONField != null && field.get(obj) != null) {
                String strValue = jSONField.value();
                if (strValue.isEmpty()) {
                    strValue = field.getName();
                }
                if (simpleName.equals("boolean")) {
                    jSONObject.put(strValue, field.getBoolean(obj));
                } else if (simpleName.equalsIgnoreCase("int")) {
                    jSONObject.put(strValue, field.getInt(obj));
                } else if (simpleName.equalsIgnoreCase("double")) {
                    jSONObject.put(strValue, field.getDouble(obj));
                } else if (simpleName.equalsIgnoreCase("float")) {
                    jSONObject.put(strValue, field.getFloat(obj));
                } else if (simpleName.equalsIgnoreCase("string")) {
                    jSONObject.put(strValue, (String) field.get(obj));
                } else if (simpleName.equals("Boolean")) {
                    jSONObject.put(strValue, (Boolean) field.get(obj));
                } else if (simpleName.equalsIgnoreCase("Integer")) {
                    jSONObject.put(strValue, (Integer) field.get(obj));
                } else if (simpleName.endsWith("]")) {
                    jSONObject.put(strValue, a(field.get(obj)));
                } else {
                    jSONObject.put(strValue, d(field.get(obj)));
                }
            }
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(false);
            }
        }
        return jSONObject;
    }
}
