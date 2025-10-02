package com.fasterxml.jackson.databind.deser.impl;

import YU.a;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    public final boolean d;
    public int e;
    public int f;
    public int g;
    public Object[] h;
    public final SettableBeanProperty[] i;
    public final Map j;
    public final Map k;
    public final Locale l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashMap] */
    public BeanPropertyMap(boolean z, Collection collection, Map map, Locale locale) {
        ?? map2;
        this.d = z;
        this.i = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        this.j = map;
        this.l = locale;
        if (map == null || map.isEmpty()) {
            map2 = Collections.EMPTY_MAP;
        } else {
            map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                String lowerCase = (String) entry.getKey();
                lowerCase = z ? lowerCase.toLowerCase(locale) : lowerCase;
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    String lowerCase2 = ((PropertyName) it.next()).d;
                    if (z) {
                        lowerCase2 = lowerCase2.toLowerCase(locale);
                    }
                    map2.put(lowerCase2, lowerCase);
                }
            }
        }
        this.k = map2;
        i(collection);
    }

    public final int b(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty[] settableBeanPropertyArr = this.i;
        int length = settableBeanPropertyArr.length;
        for (int i = 0; i < length; i++) {
            if (settableBeanPropertyArr[i] == settableBeanProperty) {
                return i;
            }
        }
        throw new IllegalStateException(a.o(new StringBuilder("Illegal state: property '"), settableBeanProperty.f.d, "' missing from _propsInOrder"));
    }

    public final SettableBeanProperty d(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode() & this.e;
        int i = iHashCode << 1;
        Object obj = this.h[i];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this.h[i + 1];
        }
        if (obj == null) {
            return null;
        }
        int i2 = this.e + 1;
        int i3 = ((iHashCode >> 1) + i2) << 1;
        Object obj2 = this.h[i3];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this.h[i3 + 1];
        }
        if (obj2 != null) {
            int i4 = (i2 + (i2 >> 1)) << 1;
            int i5 = this.g + i4;
            while (i4 < i5) {
                Object obj3 = this.h[i4];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this.h[i4 + 1];
                }
                i4 += 2;
            }
        }
        return null;
    }

    public final SettableBeanProperty g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot pass null property name");
        }
        if (this.d) {
            str = str.toLowerCase(this.l);
        }
        int iHashCode = str.hashCode() & this.e;
        int i = iHashCode << 1;
        Object obj = this.h[i];
        if (obj == str || str.equals(obj)) {
            return (SettableBeanProperty) this.h[i + 1];
        }
        Map map = this.k;
        if (obj == null) {
            return d((String) map.get(str));
        }
        int i2 = this.e + 1;
        int i3 = ((iHashCode >> 1) + i2) << 1;
        Object obj2 = this.h[i3];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this.h[i3 + 1];
        }
        if (obj2 != null) {
            int i4 = (i2 + (i2 >> 1)) << 1;
            int i5 = this.g + i4;
            while (i4 < i5) {
                Object obj3 = this.h[i4];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this.h[i4 + 1];
                }
                i4 += 2;
            }
        }
        return d((String) map.get(str));
    }

    public final String h(SettableBeanProperty settableBeanProperty) {
        return this.d ? settableBeanProperty.f.d.toLowerCase(this.l) : settableBeanProperty.f.d;
    }

    public final void i(Collection collection) {
        int i;
        int size = collection.size();
        this.f = size;
        if (size <= 5) {
            i = 8;
        } else if (size <= 12) {
            i = 16;
        } else {
            int i2 = 32;
            while (i2 < size + (size >> 2)) {
                i2 += i2;
            }
            i = i2;
        }
        this.e = i - 1;
        int i3 = (i >> 1) + i;
        Object[] objArrCopyOf = new Object[i3 * 2];
        Iterator it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) it.next();
            if (settableBeanProperty != null) {
                String strH = h(settableBeanProperty);
                int iHashCode = strH.hashCode() & this.e;
                int i5 = iHashCode << 1;
                if (objArrCopyOf[i5] != null) {
                    i5 = ((iHashCode >> 1) + i) << 1;
                    if (objArrCopyOf[i5] != null) {
                        i5 = (i3 << 1) + i4;
                        i4 += 2;
                        if (i5 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i5] = strH;
                objArrCopyOf[i5 + 1] = settableBeanProperty;
            }
        }
        this.h = objArrCopyOf;
        this.g = i4;
    }

    @Override // java.lang.Iterable
    public final Iterator<SettableBeanProperty> iterator() {
        ArrayList arrayList = new ArrayList(this.f);
        int length = this.h.length;
        for (int i = 1; i < length; i += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.h[i];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList.iterator();
    }

    public final void j(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this.f);
        String strH = h(settableBeanProperty);
        int length = this.h.length;
        boolean zEquals = false;
        for (int i = 1; i < length; i += 2) {
            Object[] objArr = this.h;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i];
            if (settableBeanProperty2 != null) {
                if (zEquals || !(zEquals = strH.equals(objArr[i - 1]))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this.i[b(settableBeanProperty2)] = null;
                }
            }
        }
        if (!zEquals) {
            throw new NoSuchElementException(a.o(new StringBuilder("No entry '"), settableBeanProperty.f.d, "' found, can't remove"));
        }
        i(arrayList);
    }

    public final BeanPropertyMap k(ObjectIdValueProperty objectIdValueProperty) {
        String strH = h(objectIdValueProperty);
        int length = this.h.length;
        for (int i = 1; i < length; i += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.h[i];
            if (settableBeanProperty != null && settableBeanProperty.f.d.equals(strH)) {
                return new BeanPropertyMap(this, objectIdValueProperty, i, b(settableBeanProperty));
            }
        }
        return new BeanPropertyMap(this, objectIdValueProperty, strH, strH.hashCode() & this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Properties=[");
        Iterator<SettableBeanProperty> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            int i2 = i + 1;
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(next.f.d);
            sb.append('(');
            sb.append(next.g);
            sb.append(')');
            i = i2;
        }
        sb.append(']');
        Map map = this.j;
        if (!map.isEmpty()) {
            sb.append("(aliases: ");
            sb.append(map);
            sb.append(")");
        }
        return sb.toString();
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, ObjectIdValueProperty objectIdValueProperty, int i, int i2) {
        this.d = beanPropertyMap.d;
        this.l = beanPropertyMap.l;
        this.e = beanPropertyMap.e;
        this.f = beanPropertyMap.f;
        this.g = beanPropertyMap.g;
        this.j = beanPropertyMap.j;
        this.k = beanPropertyMap.k;
        Object[] objArr = beanPropertyMap.h;
        this.h = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.i;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this.i = settableBeanPropertyArr2;
        this.h[i] = objectIdValueProperty;
        settableBeanPropertyArr2[i2] = objectIdValueProperty;
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, ObjectIdValueProperty objectIdValueProperty, String str, int i) {
        this.d = beanPropertyMap.d;
        this.l = beanPropertyMap.l;
        this.e = beanPropertyMap.e;
        this.f = beanPropertyMap.f;
        this.g = beanPropertyMap.g;
        this.j = beanPropertyMap.j;
        this.k = beanPropertyMap.k;
        Object[] objArr = beanPropertyMap.h;
        this.h = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.i;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this.i = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = objectIdValueProperty;
        int i2 = this.e + 1;
        int i3 = i << 1;
        Object[] objArr2 = this.h;
        if (objArr2[i3] != null) {
            i3 = ((i >> 1) + i2) << 1;
            if (objArr2[i3] != null) {
                int i4 = this.g;
                i3 = ((i2 + (i2 >> 1)) << 1) + i4;
                this.g = i4 + 2;
                if (i3 >= objArr2.length) {
                    this.h = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.h;
        objArr3[i3] = str;
        objArr3[i3 + 1] = objectIdValueProperty;
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z) {
        this.d = z;
        this.l = beanPropertyMap.l;
        this.j = beanPropertyMap.j;
        this.k = beanPropertyMap.k;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.i;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this.i = settableBeanPropertyArr2;
        i(Arrays.asList(settableBeanPropertyArr2));
    }
}
