package com.tealium.core.network;

import com.tealium.core.persistence.n0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/network/CooldownHelper;", "", "CooldownStatus", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class CooldownHelper {

    /* renamed from: a, reason: collision with root package name */
    public CooldownStatus f19158a;
    public int b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/network/CooldownHelper$CooldownStatus;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class CooldownStatus {
        public static final CooldownStatus d;
        public static final CooldownStatus e;
        public static final /* synthetic */ CooldownStatus[] f;

        static {
            CooldownStatus cooldownStatus = new CooldownStatus("Success", 0);
            d = cooldownStatus;
            CooldownStatus cooldownStatus2 = new CooldownStatus("Failure", 1);
            e = cooldownStatus2;
            f = new CooldownStatus[]{cooldownStatus, cooldownStatus2};
        }

        public static CooldownStatus valueOf(String str) {
            return (CooldownStatus) Enum.valueOf(CooldownStatus.class, str);
        }

        public static CooldownStatus[] values() {
            return (CooldownStatus[]) f.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Long> {
        static {
            new a(0, n0.class, "getTimestampMilliseconds", "getTimestampMilliseconds()J", 1);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }
}
