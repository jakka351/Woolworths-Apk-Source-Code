package com.tealium.core;

import android.app.Application;
import com.tealium.test.OpenForTesting;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/TealiumConfig;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
@OpenForTesting
/* loaded from: classes.dex */
public final class TealiumConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Application f19129a;
    public final String b;
    public final String c;
    public final Environment d;
    public String e;
    public final Set f;
    public final Set g;
    public final Set h;
    public final LinkedHashSet i;
    public final File j;
    public final LinkedHashMap k;
    public boolean l;
    public final boolean m;
    public final ArrayList n;
    public String o;
    public LogLevel p;
    public final ArrayList q;

    public TealiumConfig(Application application, String accountName, String profileName, Environment environment, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, int i) {
        LinkedHashSet linkedHashSetK0 = CollectionsKt.K0(Collectors.f19121a);
        linkedHashSet2 = (i & 128) != 0 ? new LinkedHashSet() : linkedHashSet2;
        Intrinsics.h(accountName, "accountName");
        Intrinsics.h(profileName, "profileName");
        this.f19129a = application;
        this.b = accountName;
        this.c = profileName;
        this.d = environment;
        this.e = null;
        this.f = linkedHashSetK0;
        this.g = linkedHashSet;
        this.h = linkedHashSet2;
        this.i = new LinkedHashSet();
        File filesDir = application.getFilesDir();
        char c = File.separatorChar;
        File file = new File(filesDir + c + "tealium" + c + accountName + c + profileName + c + environment.d);
        this.j = file;
        this.k = new LinkedHashMap();
        this.l = true;
        this.m = true;
        this.n = new ArrayList();
        this.q = new ArrayList();
        file.mkdirs();
    }
}
