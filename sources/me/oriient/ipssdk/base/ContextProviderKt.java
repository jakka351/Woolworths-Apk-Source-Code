package me.oriient.ipssdk.base;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "", "setGlobalContext", "(Landroid/content/Context;)V", "me.oriient.sdk-base"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextProviderKt {

    /* renamed from: a, reason: collision with root package name */
    private static Context f25680a;

    public static final void setGlobalContext(@NotNull Context context) {
        Intrinsics.h(context, "context");
        f25680a = context.getApplicationContext();
    }
}
