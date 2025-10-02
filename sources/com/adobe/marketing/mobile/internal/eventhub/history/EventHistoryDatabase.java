package com.adobe.marketing.mobile.internal.eventhub.history;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/history/EventHistoryDatabase;", "", "QueryResult", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface EventHistoryDatabase {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/history/EventHistoryDatabase$QueryResult;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class QueryResult {

        /* renamed from: a, reason: collision with root package name */
        public final int f13192a;
        public final Long b;
        public final Long c;

        public QueryResult(int i, Long l, Long l2) {
            this.f13192a = i;
            this.b = l;
            this.c = l2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueryResult)) {
                return false;
            }
            QueryResult queryResult = (QueryResult) obj;
            return this.f13192a == queryResult.f13192a && Intrinsics.c(this.b, queryResult.b) && Intrinsics.c(this.c, queryResult.c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f13192a) * 31;
            Long l = this.b;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.c;
            return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
        }

        public final String toString() {
            return "QueryResult(count=" + this.f13192a + ", oldestTimestamp=" + this.b + ", newestTimeStamp=" + this.c + ')';
        }
    }
}
