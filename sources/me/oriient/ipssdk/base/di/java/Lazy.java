package me.oriient.ipssdk.base.di.java;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/base/di/java/Lazy;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kLazy", "Lkotlin/Lazy;", "(Lkotlin/Lazy;)V", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Lazy<T> {

    @NotNull
    private final kotlin.Lazy<T> kLazy;

    /* JADX WARN: Multi-variable type inference failed */
    public Lazy(@NotNull kotlin.Lazy<? extends T> kLazy) {
        Intrinsics.h(kLazy, "kLazy");
        this.kLazy = kLazy;
    }

    public final T getValue() {
        return (T) this.kLazy.getD();
    }

    public final boolean isInitialized() {
        return this.kLazy.isInitialized();
    }
}
