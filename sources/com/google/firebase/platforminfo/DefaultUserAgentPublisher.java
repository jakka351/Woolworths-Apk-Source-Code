package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {

    /* renamed from: a, reason: collision with root package name */
    public final String f15752a;
    public final GlobalLibraryVersionRegistrar b;

    public DefaultUserAgentPublisher(Set set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f15752a = c(set);
        this.b = globalLibraryVersionRegistrar;
    }

    public static Component b() {
        Component.Builder builderB = Component.b(UserAgentPublisher.class);
        builderB.a(new Dependency(2, 0, LibraryVersion.class));
        builderB.f = new a();
        return builderB.b();
    }

    public static String c(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion libraryVersion = (LibraryVersion) it.next();
            sb.append(libraryVersion.a());
            sb.append('/');
            sb.append(libraryVersion.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f15752a;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = this.b;
        synchronized (globalLibraryVersionRegistrar.f15753a) {
            setUnmodifiableSet = Collections.unmodifiableSet(globalLibraryVersionRegistrar.f15753a);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (globalLibraryVersionRegistrar.f15753a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(globalLibraryVersionRegistrar.f15753a);
        }
        sb.append(c(setUnmodifiableSet2));
        return sb.toString();
    }
}
