package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class SimpleValueInstantiators extends ValueInstantiators.Base implements Serializable {
    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiators.Base, com.fasterxml.jackson.databind.deser.ValueInstantiators
    public final ValueInstantiator a(BeanDescription beanDescription, ValueInstantiator valueInstantiator) {
        new ClassKey(beanDescription.f14226a.d);
        throw null;
    }
}
