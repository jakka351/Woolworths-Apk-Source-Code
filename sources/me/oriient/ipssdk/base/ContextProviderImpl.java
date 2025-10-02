package me.oriient.ipssdk.base;

import android.content.Context;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.android.ContextProvider;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/base/ContextProviderImpl;", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContextProviderImpl implements ContextProvider {
    @Override // me.oriient.internal.infra.utils.android.ContextProvider
    @NotNull
    public Context getContext() {
        Context context = ContextProviderKt.f25680a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Must call init before using the library");
    }
}
