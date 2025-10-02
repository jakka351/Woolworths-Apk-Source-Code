package me.oriient.internal.infra.utils.core.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¨\u0006\u0005"}, d2 = {"sampleWithFirst", "Lkotlinx/coroutines/flow/Flow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "periodMillis", "", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlowExtKt {
    @FlowPreview
    @ExperimentalCoroutinesApi
    @NotNull
    public static final <T> Flow<T> sampleWithFirst(@NotNull Flow<? extends T> flow, long j) {
        Intrinsics.h(flow, "<this>");
        return FlowKt.B(new f(flow, j, null));
    }
}
