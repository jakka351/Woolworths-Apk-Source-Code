package com.tealium.core.collection;

import com.tealium.core.Collector;
import com.tealium.core.messaging.NewSessionListener;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/collection/a;", "Lcom/tealium/core/messaging/NewSessionListener;", "Lcom/tealium/core/Collector;", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a implements NewSessionListener, Collector {

    /* renamed from: a, reason: collision with root package name */
    public long f19139a;
    public boolean b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tealium/core/collection/a$a;", "", "", "MODULE_NAME", "Ljava/lang/String;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.tealium.core.collection.a$a, reason: collision with other inner class name */
    public static final class C0382a {
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // com.tealium.core.messaging.NewSessionListener
    public final void f(long j) {
        this.f19139a = j;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getF() {
        return "SessionCollector";
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        return MapsKt.i(new Pair("tealium_session_id", new Long(this.f19139a)));
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.b = z;
    }
}
