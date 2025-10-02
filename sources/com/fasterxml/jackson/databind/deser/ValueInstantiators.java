package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;

/* loaded from: classes4.dex */
public interface ValueInstantiators {

    public static class Base implements ValueInstantiators {
        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiators
        public ValueInstantiator a(BeanDescription beanDescription, ValueInstantiator valueInstantiator) {
            return valueInstantiator;
        }
    }

    ValueInstantiator a(BeanDescription beanDescription, ValueInstantiator valueInstantiator);
}
