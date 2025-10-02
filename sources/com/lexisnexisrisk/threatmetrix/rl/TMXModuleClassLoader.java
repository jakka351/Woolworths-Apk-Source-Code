package com.lexisnexisrisk.threatmetrix.rl;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/* loaded from: classes6.dex */
public class TMXModuleClassLoader extends ClassLoader {
    private static boolean tttt007400740074 = false;
    private final ClassLoader t0074tt007400740074;

    public TMXModuleClassLoader(ClassLoader classLoader) {
        this.t0074tt007400740074 = classLoader;
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
        return this.t0074tt007400740074.getResources(str.replace("META-INF/services", tttt007400740074 ? "assets/testServices" : "assets/services"));
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        return this.t0074tt007400740074.loadClass(str);
    }
}
