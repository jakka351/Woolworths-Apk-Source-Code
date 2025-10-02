package androidx.window.layout;

import androidx.core.util.Consumer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferedChannel;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {
    public final /* synthetic */ BufferedChannel d;

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        WindowLayoutInfo info = (WindowLayoutInfo) obj;
        Intrinsics.g(info, "info");
        this.d.k(info);
    }
}
