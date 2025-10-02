package com.tealium.core;

import com.tealium.core.collection.AppCollector;
import com.tealium.core.collection.ConnectivityCollector;
import com.tealium.core.collection.DeviceCollector;
import com.tealium.core.collection.TimeCollector;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/Collectors;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Collectors {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f19121a = ArraysKt.r0(new CollectorFactory[]{AppCollector.g, ConnectivityCollector.d, DeviceCollector.q, TimeCollector.e});
}
