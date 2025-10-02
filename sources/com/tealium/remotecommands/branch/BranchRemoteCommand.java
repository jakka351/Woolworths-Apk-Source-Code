package com.tealium.remotecommands.branch;

import android.app.Application;
import com.tealium.remotecommands.RemoteCommand;
import com.tealium.remotecommands.RemoteCommandContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/remotecommands/branch/BranchRemoteCommand;", "Lcom/tealium/remotecommands/RemoteCommand;", "Companion", "branch_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BranchRemoteCommand extends RemoteCommand {
    public final Application d;
    public final String e;
    public BranchInstance f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tealium/remotecommands/branch/BranchRemoteCommand$Companion;", "", "", "DEFAULT_COMMAND_DESCRIPTION", "Ljava/lang/String;", "DEFAULT_COMMAND_ID", "branch_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public BranchRemoteCommand(Application application, String str) {
        super("branch", "1.1.0", 0);
        this.d = application;
        this.e = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023b  */
    @Override // com.tealium.remotecommands.RemoteCommand
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.tealium.remotecommands.RemoteCommand.Response r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.remotecommands.branch.BranchRemoteCommand.b(com.tealium.remotecommands.RemoteCommand$Response):void");
    }

    @Override // com.tealium.remotecommands.RemoteCommand
    public final void c(RemoteCommandContext remoteCommandContext) {
        this.f = new BranchInstance(this.d, this.e, remoteCommandContext);
    }

    public final BranchCommand d() {
        BranchInstance branchInstance = this.f;
        if (branchInstance != null) {
            return branchInstance;
        }
        Intrinsics.p("branchInstance");
        throw null;
    }
}
