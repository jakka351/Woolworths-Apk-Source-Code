package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.SerializationConfig;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public final class EnumValues implements Serializable {
    public final Class d;
    public final SerializableString[] e;

    public EnumValues(Class cls, SerializableString[] serializableStringArr) {
        this.d = cls;
        this.e = serializableStringArr;
    }

    public static EnumValues a(SerializationConfig serializationConfig, Class cls) {
        Annotation[] annotationArr = ClassUtil.f14330a;
        Class superclass = cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
        Enum[] enumArr = (Enum[]) superclass.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(cls.getName()));
        }
        String[] strArrL = serializationConfig.d().l(superclass, enumArr, new String[enumArr.length]);
        SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum r4 = enumArr[i];
            String strName = strArrL[i];
            if (strName == null) {
                strName = r4.name();
            }
            serializableStringArr[r4.ordinal()] = new SerializedString(strName);
        }
        return new EnumValues(cls, serializableStringArr);
    }
}
