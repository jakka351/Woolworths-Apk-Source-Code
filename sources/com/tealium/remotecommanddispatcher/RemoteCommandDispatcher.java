package com.tealium.remotecommanddispatcher;

import com.tealium.core.Collector;
import com.tealium.core.DispatcherFactory;
import com.tealium.core.JsonUtils;
import com.tealium.core.Logger;
import com.tealium.core.TealiumContext;
import com.tealium.core.messaging.RemoteCommandListener;
import com.tealium.core.network.HttpClient;
import com.tealium.core.network.NetworkClient;
import com.tealium.dispatcher.Dispatch;
import com.tealium.dispatcher.Dispatcher;
import com.tealium.dispatcher.TealiumEvent;
import com.tealium.remotecommanddispatcher.e;
import com.tealium.remotecommands.RemoteCommand;
import com.tealium.remotecommands.RemoteCommandContext;
import com.tealium.remotecommands.RemoteCommandRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tealium/remotecommanddispatcher/RemoteCommandDispatcher;", "Lcom/tealium/dispatcher/Dispatcher;", "Lcom/tealium/core/messaging/RemoteCommandListener;", "Lcom/tealium/core/Collector;", "Companion", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteCommandDispatcher implements Dispatcher, RemoteCommandListener, Collector {

    @NotNull
    public static final String MODULE_VERSION = "1.4.0";
    public static final Companion f = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final TealiumContext f19193a;
    public final NetworkClient b;
    public final CommandsManager c;
    public final String d;
    public boolean e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tealium/remotecommanddispatcher/RemoteCommandDispatcher$Companion;", "Lcom/tealium/core/DispatcherFactory;", "", "MODULE_VERSION", "Ljava/lang/String;", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements DispatcherFactory {
        @Override // com.tealium.core.DispatcherFactory
        public final Dispatcher a(TealiumContext context, com.tealium.core.messaging.b callbacks) {
            Intrinsics.h(context, "context");
            Intrinsics.h(callbacks, "callbacks");
            return new RemoteCommandDispatcher(context);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tealium/remotecommanddispatcher/RemoteCommandDispatcher$a", "Lcom/tealium/remotecommands/RemoteCommandContext;", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
    public final class a implements RemoteCommandContext {
        public a() {
        }

        @Override // com.tealium.remotecommands.RemoteCommandContext
        public final void a(String str, Map map) {
            TealiumContext tealiumContext = RemoteCommandDispatcher.this.f19193a;
            if (map == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            }
            tealiumContext.a(new TealiumEvent(str, map));
        }
    }

    public RemoteCommandDispatcher(TealiumContext context) {
        HttpClient httpClient = new HttpClient(context.f19130a);
        f fVar = new f(context.f19130a);
        Intrinsics.h(context, "context");
        this.f19193a = context;
        this.b = httpClient;
        this.c = fVar;
        this.d = "RemoteCommands";
        this.e = true;
    }

    public static void E(RemoteCommandDispatcher remoteCommandDispatcher, RemoteCommand remoteCommand) {
        RemoteCommandContext aVar = remoteCommand.c;
        if (aVar == null) {
            aVar = remoteCommandDispatcher.new a();
        }
        remoteCommand.c(aVar);
        remoteCommandDispatcher.c.h(remoteCommand);
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    public final void F(RemoteCommand remoteCommand, Dispatch dispatch) {
        c cVarA;
        String str = remoteCommand.f19200a;
        Intrinsics.g(str, "remoteCommand.commandName");
        d dVarR = this.c.r(str);
        if (dVarR == null || (cVarA = dVarR.a()) == null) {
            return;
        }
        Map mapE = e.a.e(cVarA.getD(), dispatch.a(), cVarA.getE());
        Map b = cVarA.getB();
        if (b != null) {
            LinkedHashMap linkedHashMapC = e.a.c(mapE, b);
            Map f19196a = cVarA.getF19196a();
            if (f19196a != null) {
                linkedHashMapC.putAll(f19196a);
            }
            String strA = e.a.a(cVarA.getC(), dispatch.a(), cVarA.getE());
            if (strA.length() == 0) {
                return;
            }
            linkedHashMapC.put("command_name", strA);
            Logger.f19124a.b("Tealium-RemoteCommandDispatcher-1.4.0", "Processing Remote Command: " + str + " with command name: " + linkedHashMapC.get("command_name"));
            remoteCommand.a(new RemoteCommandRequest(str, JsonUtils.Companion.a(linkedHashMapC)));
        }
    }

    @Override // com.tealium.core.messaging.DispatchSendListener
    public final Object d(Dispatch dispatch, Continuation continuation) {
        CommandsManager commandsManager = this.c;
        Iterator it = commandsManager.D().iterator();
        while (it.hasNext()) {
            F((RemoteCommand) it.next(), dispatch);
        }
        Object objC = commandsManager.c((ContinuationImpl) continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        return this.c.i(continuation);
    }

    @Override // com.tealium.core.messaging.RemoteCommandListener
    public final void j(Dispatch dispatch) {
        Intrinsics.h(dispatch, "dispatch");
        Iterator it = this.c.D().iterator();
        while (it.hasNext()) {
            F((RemoteCommand) it.next(), dispatch);
        }
    }

    @Override // com.tealium.core.messaging.BatchDispatchSendListener
    public final Object o(List list, Continuation continuation) {
        return Unit.f24250a;
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.e = z;
    }

    @Override // com.tealium.core.messaging.RemoteCommandListener
    public final void w(RemoteCommandRequest remoteCommandRequest) {
        String str = remoteCommandRequest.f19202a;
        if (str != null) {
            boolean zEquals = str.equals("_http");
            CommandsManager commandsManager = this.c;
            if (zEquals && commandsManager.s("_http") == null) {
                commandsManager.h(new com.tealium.remotecommanddispatcher.remotecommands.a(this.b));
            }
            RemoteCommand remoteCommandS = commandsManager.s(str);
            if (remoteCommandS != null) {
                Logger.Companion companion = Logger.f19124a;
                RemoteCommand.Response response = remoteCommandRequest.c;
                companion.b("Tealium-RemoteCommandDispatcher-1.4.0", "Detected Remote Command " + str + " with payload " + (response != null ? response.d : null));
                remoteCommandS.a(remoteCommandRequest);
                obj = Unit.f24250a;
            }
            if (obj == null) {
                Logger.f19124a.b("Tealium-RemoteCommandDispatcher-1.4.0", "No Remote Command found with id: ".concat(str));
            }
        }
    }
}
