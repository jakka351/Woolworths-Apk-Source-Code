package com.tealium.core.collection;

import com.medallia.digital.mobilesdk.l8;
import com.tealium.core.Collector;
import com.tealium.core.CollectorFactory;
import com.tealium.core.TealiumContext;
import com.tealium.test.OpenForTesting;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/collection/TimeCollector;", "Lcom/tealium/core/Collector;", "Lcom/tealium/core/collection/TimeData;", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
@OpenForTesting
/* loaded from: classes.dex */
public final class TimeCollector implements Collector, TimeData {
    public static final Companion e = new Companion();
    public static volatile TimeCollector f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f19138a = true;
    public final SimpleDateFormat b;
    public final SimpleDateFormat c;
    public final long d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tealium/core/collection/TimeCollector$Companion;", "Lcom/tealium/core/CollectorFactory;", "Lcom/tealium/core/Collector;", "instance", "Lcom/tealium/core/Collector;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements CollectorFactory {
        @Override // com.tealium.core.CollectorFactory
        public final Collector a(TealiumContext context) {
            TimeCollector timeCollector;
            Intrinsics.h(context, "context");
            TimeCollector timeCollector2 = TimeCollector.f;
            if (timeCollector2 != null) {
                return timeCollector2;
            }
            synchronized (this) {
                timeCollector = TimeCollector.f;
                if (timeCollector == null) {
                    timeCollector = new TimeCollector();
                    TimeCollector.f = timeCollector;
                }
            }
            return timeCollector;
        }
    }

    public TimeCollector() {
        Locale locale = Locale.ROOT;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
        this.b = simpleDateFormat;
        this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
        this.d = l8.b.c;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getF19138a() {
        return this.f19138a;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getF() {
        return "TimeCollector";
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        String str = this.b.format(new Date(System.currentTimeMillis()));
        Intrinsics.g(str, "utcDateFormat.format(Dat…mestampUnixMilliseconds))");
        Pair pair = new Pair("timestamp", str);
        String str2 = this.c.format(new Date(System.currentTimeMillis()));
        Intrinsics.g(str2, "localDateFormat.format(D…mestampUnixMilliseconds))");
        long j = 1000;
        return MapsKt.j(pair, new Pair("timestamp_local", str2), new Pair("timestamp_offset", String.format(Locale.ROOT, "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / this.d)}, 1))), new Pair("timestamp_unix", new Long(System.currentTimeMillis() / j)), new Pair("timestamp_unix_milliseconds", new Long(System.currentTimeMillis())), new Pair("timestamp_epoch", new Long(System.currentTimeMillis() / j)));
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.f19138a = z;
    }
}
