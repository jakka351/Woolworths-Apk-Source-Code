package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

/* loaded from: classes4.dex */
public class MapProperty extends PropertyWriter {
    @Override // com.fasterxml.jackson.databind.BeanProperty
    public final AnnotatedMember a() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public final PropertyName b() {
        return new PropertyName(getName(), null);
    }

    @Override // com.fasterxml.jackson.databind.util.Named
    public final String getName() {
        return String.valueOf((Object) null);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public final JavaType getType() {
        throw null;
    }
}
