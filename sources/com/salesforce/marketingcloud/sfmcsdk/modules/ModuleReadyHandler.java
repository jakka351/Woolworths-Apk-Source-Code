package com.salesforce.marketingcloud.sfmcsdk.modules;

import android.os.Handler;
import android.os.Looper;
import com.auth0.android.request.internal.a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleReadyHandler;", "Landroid/os/Handler;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleReadyListener;", "(Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleReadyListener;)V", "getListener", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleReadyListener;", "deliverModule", "", "module", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleInterface;", "execute", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModuleReadyHandler extends Handler {

    @NotNull
    private final ModuleReadyListener listener;

    /* JADX WARN: Illegal instructions before constructor call */
    public ModuleReadyHandler(@NotNull ModuleReadyListener listener) {
        Intrinsics.h(listener, "listener");
        Looper looperMyLooper = Looper.myLooper();
        super(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: deliverModule$lambda-0, reason: not valid java name */
    public static final void m268deliverModule$lambda0(ModuleReadyHandler this$0, ModuleInterface module) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(module, "$module");
        this$0.execute(module, this$0.listener);
    }

    private final void execute(final ModuleInterface module, final ModuleReadyListener listener) {
        try {
            listener.ready(module);
        } catch (Exception e) {
            SFMCSdkLogger.INSTANCE.e("~$ModuleReadyHandler", e, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyHandler.execute.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Error delivering module " + module + " to " + listener;
                }
            });
        }
    }

    public final void deliverModule(@NotNull ModuleInterface module) {
        Intrinsics.h(module, "module");
        post(new a(3, this, module));
    }

    @NotNull
    public final ModuleReadyListener getListener() {
        return this.listener;
    }
}
