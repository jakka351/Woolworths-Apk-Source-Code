package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MaybeToPublisher implements Function<MaybeSource<Object>, Publisher<Object>> {
    public static final /* synthetic */ MaybeToPublisher[] d = {new MaybeToPublisher("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    MaybeToPublisher EF5;

    public static MaybeToPublisher valueOf(String str) {
        return (MaybeToPublisher) Enum.valueOf(MaybeToPublisher.class, str);
    }

    public static MaybeToPublisher[] values() {
        return (MaybeToPublisher[]) d.clone();
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public final Object mo0apply(Object obj) {
        return new MaybeToFlowable((MaybeSource) obj);
    }
}
