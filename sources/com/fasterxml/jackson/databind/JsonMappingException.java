package com.fasterxml.jackson.databind;

import YU.a;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class JsonMappingException extends DatabindException {
    public static final /* synthetic */ int g = 0;
    public LinkedList e;
    public final transient Closeable f;

    public static class Reference implements Serializable {
        public transient Object d;
        public final String e;
        public int f = -1;
        public String g;

        public Reference(Object obj, String str) {
            this.d = obj;
            if (str == null) {
                throw new NullPointerException("Cannot pass null fieldName");
            }
            this.e = str;
        }

        public final String getDescription() {
            if (this.g == null) {
                StringBuilder sb = new StringBuilder();
                Object obj = this.d;
                if (obj != null) {
                    Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i = 0;
                    while (componentType.isArray()) {
                        componentType = componentType.getComponentType();
                        i++;
                    }
                    sb.append(componentType.getName());
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        sb.append("[]");
                    }
                } else {
                    sb.append("UNKNOWN");
                }
                sb.append('[');
                String str = this.e;
                if (str != null) {
                    sb.append('\"');
                    sb.append(str);
                    sb.append('\"');
                } else {
                    int i2 = this.f;
                    if (i2 >= 0) {
                        sb.append(i2);
                    } else {
                        sb.append('?');
                    }
                }
                sb.append(']');
                this.g = sb.toString();
            }
            return this.g;
        }

        public final String toString() {
            return getDescription();
        }

        public Object writeReplace() {
            getDescription();
            return this;
        }
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this.f = closeable;
        if (closeable instanceof JsonParser) {
            this.d = ((JsonParser) closeable).z0();
        }
    }

    public static JsonMappingException g(IOException iOException) {
        return new JsonMappingException(null, a.i("Unexpected IOException (of type ", iOException.getClass().getName(), "): ", ClassUtil.i(iOException)));
    }

    public static JsonMappingException h(Throwable th, Reference reference) {
        JsonMappingException jsonMappingException;
        Object objC;
        if (th instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th;
        } else {
            String strI = ClassUtil.i(th);
            if (strI == null || strI.isEmpty()) {
                strI = "(was " + th.getClass().getName() + ")";
            }
            jsonMappingException = new JsonMappingException((!(th instanceof JacksonException) || (objC = ((JacksonException) th).c()) == null) ? null : (Closeable) objC, strI, th);
        }
        if (jsonMappingException.e == null) {
            jsonMappingException.e = new LinkedList();
        }
        if (jsonMappingException.e.size() < 1000) {
            jsonMappingException.e.addFirst(reference);
        }
        return jsonMappingException;
    }

    public static JsonMappingException i(Throwable th, Object obj, int i) {
        Reference reference = new Reference();
        reference.d = obj;
        reference.f = i;
        return h(th, reference);
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public final Object c() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public final void e(Object obj, String str) {
        Reference reference = new Reference(obj, str);
        if (this.e == null) {
            this.e = new LinkedList();
        }
        if (this.e.size() < 1000) {
            this.e.addFirst(reference);
        }
    }

    public final String f() {
        String message = super.getMessage();
        if (this.e == null) {
            return message;
        }
        StringBuilder sb = message == null ? new StringBuilder() : new StringBuilder(message);
        sb.append(" (through reference chain: ");
        LinkedList linkedList = this.e;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(((Reference) it.next()).getDescription());
                if (it.hasNext()) {
                    sb.append("->");
                }
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return f();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return f();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonMappingException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation, null);
        this.f = jsonParser;
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th) {
        super(str, null, th);
        this.f = closeable;
        if (th instanceof JacksonException) {
            this.d = ((JacksonException) th).a();
        } else if (closeable instanceof JsonParser) {
            this.d = ((JsonParser) closeable).z0();
        }
    }
}
