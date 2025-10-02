package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class RootNameLookup implements Serializable {
    public final transient LRUMap d = new LRUMap(20, 200);

    public final PropertyName a(Class cls, MapperConfigBase mapperConfigBase) {
        ClassKey classKey = new ClassKey(cls);
        LRUMap lRUMap = this.d;
        PropertyName propertyName = (PropertyName) lRUMap.f.get(classKey);
        if (propertyName != null) {
            return propertyName;
        }
        PropertyName propertyNameR = mapperConfigBase.d().R(((BasicBeanDescription) mapperConfigBase.l(cls)).e);
        if (propertyNameR == null || !propertyNameR.c()) {
            propertyNameR = PropertyName.a(cls.getSimpleName());
        }
        lRUMap.f.f(classKey, propertyNameR, false);
        return propertyNameR;
    }

    public Object readResolve() {
        return new RootNameLookup();
    }
}
