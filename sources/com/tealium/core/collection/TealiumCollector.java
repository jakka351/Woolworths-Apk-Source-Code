package com.tealium.core.collection;

import com.tealium.core.Collector;
import com.tealium.core.CollectorFactory;
import com.tealium.core.TealiumConfig;
import com.tealium.core.TealiumContext;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/collection/TealiumCollector;", "Lcom/tealium/core/Collector;", "Lcom/tealium/core/collection/TealiumData;", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class TealiumCollector implements Collector, TealiumData {

    /* renamed from: a, reason: collision with root package name */
    public final TealiumContext f19137a;
    public boolean b;
    public final SecureRandom c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/collection/TealiumCollector$Companion;", "Lcom/tealium/core/CollectorFactory;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements CollectorFactory {
        @Override // com.tealium.core.CollectorFactory
        public final Collector a(TealiumContext context) {
            Intrinsics.h(context, "context");
            return new TealiumCollector(context);
        }
    }

    public TealiumCollector(TealiumContext context) {
        Intrinsics.h(context, "context");
        this.f19137a = context;
        this.b = true;
        this.c = new SecureRandom();
        TealiumConfig tealiumConfig = context.f19130a;
        this.d = tealiumConfig.b;
        this.e = tealiumConfig.c;
        this.f = tealiumConfig.d.d;
        this.g = tealiumConfig.e;
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getJ() {
        return this.b;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getI() {
        return "TealiumCollector";
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        Pair pair = new Pair("tealium_account", this.d);
        Pair pair2 = new Pair("tealium_profile", this.e);
        Pair pair3 = new Pair("tealium_environment", this.f);
        String str = this.g;
        if (str == null) {
            str = "";
        }
        return MapsKt.j(pair, pair2, pair3, new Pair("tealium_datasource", str), new Pair("tealium_visitor_id", this.f19137a.f.x.e), new Pair("tealium_library_name", "android-kotlin"), new Pair("tealium_library_version", "1.6.0"), new Pair("tealium_random", String.format(Locale.ROOT, "%016d", Arrays.copyOf(new Object[]{Long.valueOf(Math.abs(this.c.nextLong() % 10000000000000000L))}, 1))));
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.b = z;
    }
}
