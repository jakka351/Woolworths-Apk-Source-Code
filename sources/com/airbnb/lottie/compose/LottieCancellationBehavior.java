package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LottieCancellationBehavior {
    public static final LottieCancellationBehavior d;
    public static final /* synthetic */ LottieCancellationBehavior[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        LottieCancellationBehavior lottieCancellationBehavior = new LottieCancellationBehavior("Immediately", 0);
        d = lottieCancellationBehavior;
        LottieCancellationBehavior[] lottieCancellationBehaviorArr = {lottieCancellationBehavior, new LottieCancellationBehavior("OnIterationFinish", 1)};
        e = lottieCancellationBehaviorArr;
        f = EnumEntriesKt.a(lottieCancellationBehaviorArr);
    }

    public static LottieCancellationBehavior valueOf(String str) {
        return (LottieCancellationBehavior) Enum.valueOf(LottieCancellationBehavior.class, str);
    }

    public static LottieCancellationBehavior[] values() {
        return (LottieCancellationBehavior[]) e.clone();
    }
}
