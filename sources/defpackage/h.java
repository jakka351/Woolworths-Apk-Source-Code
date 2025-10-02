package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class h extends Lambda implements Function0 {
    public final /* synthetic */ RemoteLogImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RemoteLogImpl remoteLogImpl) {
        super(0);
        this.h = remoteLogImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.h.getCoroutineContextProvider().newSingleThreadCoroutineContext();
    }
}
