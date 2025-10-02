package com.airbnb.deeplinkdispatch;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/deeplinkdispatch/MatchType;", "", "Companion", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum MatchType {
    /* JADX INFO: Fake field, exist only in values array */
    Activity((byte) 0),
    /* JADX INFO: Fake field, exist only in values array */
    Method((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    Handler((byte) 2);

    public final byte d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/MatchType$Companion;", "", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    MatchType(byte b) {
        this.d = b;
    }
}
