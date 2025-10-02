package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public class SimpleBeanPropertyFilter implements BeanPropertyFilter, PropertyFilter {

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$1, reason: invalid class name */
    final class AnonymousClass1 implements PropertyFilter {
    }

    public static class FilterExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
    }

    public static class SerializeExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        public final Set d = Collections.EMPTY_SET;

        static {
            new SerializeExceptFilter();
        }
    }
}
