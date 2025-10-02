package com.bumptech.glide.module;

import android.content.Context;
import androidx.camera.core.impl.b;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* loaded from: classes.dex */
public final class ManifestParser {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13960a;

    public ManifestParser(Context context) {
        this.f13960a = context;
    }

    public static GlideModule a(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof GlideModule) {
                    return (GlideModule) objNewInstance;
                }
                throw new RuntimeException(b.m(objNewInstance, "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                b(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                b(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                b(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }
}
