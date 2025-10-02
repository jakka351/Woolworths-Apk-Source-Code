package com.tealium.remotecommanddispatcher;

import com.tealium.core.TealiumConfig;
import com.tealium.remotecommands.RemoteCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/remotecommanddispatcher/f;", "Lcom/tealium/remotecommanddispatcher/CommandsManager;", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f implements CommandsManager {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f19197a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final String c = "";
    public boolean d = true;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.tealium.remotecommanddispatcher.RemoteCommandsManager", f = "RemoteCommandsManager.kt", l = {59}, m = "refreshConfig")
    final class a extends ContinuationImpl {
        public Iterator p;
        public /* synthetic */ Object q;
        public int s;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.q = obj;
            this.s |= Integer.MIN_VALUE;
            return f.this.c(this);
        }
    }

    public f(TealiumConfig tealiumConfig) {
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // com.tealium.remotecommanddispatcher.CommandsManager
    public final ArrayList D() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            RemoteCommand remoteCommand = (RemoteCommand) this.f19197a.get((String) ((Map.Entry) it.next()).getKey());
            if (remoteCommand != null) {
                arrayList.add(remoteCommand);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.tealium.remotecommanddispatcher.CommandsManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.tealium.remotecommanddispatcher.f.a
            if (r0 == 0) goto L13
            r0 = r5
            com.tealium.remotecommanddispatcher.f$a r0 = (com.tealium.remotecommanddispatcher.f.a) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            com.tealium.remotecommanddispatcher.f$a r0 = new com.tealium.remotecommanddispatcher.f$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r2 = r0.p
            kotlin.ResultKt.b(r5)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            java.util.concurrent.ConcurrentHashMap r5 = r4.b
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r2 = r5.iterator()
        L3e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            com.tealium.remotecommanddispatcher.d r5 = (com.tealium.remotecommanddispatcher.d) r5
            r0.p = r2
            r0.s = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3e
            return r1
        L5b:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.remotecommanddispatcher.f.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // com.tealium.remotecommanddispatcher.CommandsManager
    public final void h(RemoteCommand remoteCommand) {
        String str = remoteCommand.f19200a;
        Intrinsics.g(str, "remoteCommand.commandName");
        this.f19197a.put(str, remoteCommand);
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        ConcurrentHashMap concurrentHashMap = this.f19197a;
        if (concurrentHashMap.isEmpty()) {
            return EmptyMap.d;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            RemoteCommand remoteCommand = (RemoteCommand) entry.getValue();
            String str = remoteCommand.b;
            String str2 = remoteCommand.f19200a;
            arrayList.add(str != null ? androidx.camera.core.impl.b.o(str2, "-", str) : YU.a.g(str2, "-0.0"));
        }
        return MapsKt.i(new Pair("remote_commands", arrayList));
    }

    @Override // com.tealium.remotecommanddispatcher.CommandsManager
    public final d r(String commandId) {
        Intrinsics.h(commandId, "commandId");
        return (d) this.b.get(commandId);
    }

    @Override // com.tealium.remotecommanddispatcher.CommandsManager
    public final RemoteCommand s(String commandId) {
        Intrinsics.h(commandId, "commandId");
        return (RemoteCommand) this.f19197a.get(commandId);
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.d = z;
    }
}
