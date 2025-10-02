package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ReleaseResourcesReason {
        public static final /* synthetic */ ReleaseResourcesReason[] d = {new ReleaseResourcesReason("OUTPUT_FUTURE_DONE", 0), new ReleaseResourcesReason("ALL_INPUT_FUTURES_PROCESSED", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ReleaseResourcesReason EF5;

        public static ReleaseResourcesReason valueOf(String str) {
            return (ReleaseResourcesReason) Enum.valueOf(ReleaseResourcesReason.class, str);
        }

        public static ReleaseResourcesReason[] values() {
            return (ReleaseResourcesReason[]) d.clone();
        }
    }

    static {
        new LazyLogger(AggregateFuture.class);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void c() {
        p();
    }

    public void p() {
    }
}
