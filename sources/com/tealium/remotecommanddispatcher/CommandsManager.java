package com.tealium.remotecommanddispatcher;

import com.tealium.core.Collector;
import com.tealium.remotecommands.RemoteCommand;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/remotecommanddispatcher/CommandsManager;", "Lcom/tealium/core/Collector;", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface CommandsManager extends Collector {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
    }

    ArrayList D();

    Object c(ContinuationImpl continuationImpl);

    void h(RemoteCommand remoteCommand);

    d r(String str);

    RemoteCommand s(String str);
}
