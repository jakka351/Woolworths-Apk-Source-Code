package io.branch.coroutines;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"Branch-SDK_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeviceSignalsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MutexImpl f23837a = MutexKt.a();

    public static final void a(Context context, Continuation continuation) {
        BuildersKt.f(Dispatchers.f24691a, new DeviceSignalsKt$getUserAgentAsync$2(context, null), continuation);
    }
}
