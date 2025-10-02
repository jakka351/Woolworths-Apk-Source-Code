package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ComponentDiscovery<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15224a;
    public final MetadataRegistrarNameRetriever b;

    public static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {

        /* renamed from: a, reason: collision with root package name */
        public final Class f15225a;

        public MetadataRegistrarNameRetriever(Class cls) {
            this.f15225a = cls;
        }
    }

    @VisibleForTesting
    public interface RegistrarNameRetriever<T> {
    }

    public ComponentDiscovery(Context context, MetadataRegistrarNameRetriever metadataRegistrarNameRetriever) {
        this.f15224a = context;
        this.b = metadataRegistrarNameRetriever;
    }

    public static ComponentDiscovery b(Context context, Class cls) {
        return new ComponentDiscovery(context, new MetadataRegistrarNameRetriever(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public final ArrayList a() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f15224a;
        Class cls = this.b.f15225a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new a((String) it.next(), 0));
        }
        return arrayList2;
    }
}
