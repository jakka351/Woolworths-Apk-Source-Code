package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class zzhhz {
    public static zzhhr zzb(Class cls) {
        String strI;
        ClassLoader classLoader = zzhhz.class.getClassLoader();
        if (cls.equals(zzhhr.class)) {
            strI = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(zzhhz.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            strI = androidx.constraintlayout.core.state.a.i(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (zzhhr) cls.cast(((zzhhz) Class.forName(strI, true, classLoader).getConstructor(null).newInstance(null)).zza());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    } catch (InstantiationException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzhhz.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzhhr) cls.cast(((zzhhz) it.next()).zza()));
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(zzhhm.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (zzhhr) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzhhr) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract zzhhr zza();
}
