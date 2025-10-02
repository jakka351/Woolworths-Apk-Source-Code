package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;
import java.security.PrivilegedAction;
import java.util.ServiceLoader;

/* loaded from: classes4.dex */
public abstract class MapperBuilder<M extends ObjectMapper, B extends MapperBuilder<M, B>> {

    /* renamed from: com.fasterxml.jackson.databind.cfg.MapperBuilder$1, reason: invalid class name */
    final class AnonymousClass1 implements PrivilegedAction<ServiceLoader<Object>> {
        @Override // java.security.PrivilegedAction
        public final ServiceLoader<Object> run() {
            return ServiceLoader.load(null);
        }
    }
}
