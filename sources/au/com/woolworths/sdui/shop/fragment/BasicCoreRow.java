package au.com.woolworths.sdui.shop.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ActionType;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/BasicCoreRow;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Row", "Action", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BasicCoreRow implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final Row f10036a;
    public final Action b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/BasicCoreRow$Action;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f10037a;
        public final String b;

        public Action(ActionType actionType, String str) {
            this.f10037a = actionType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f10037a == action.f10037a && Intrinsics.c(this.b, action.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10037a.hashCode() * 31);
        }

        public final String toString() {
            return "Action(type=" + this.f10037a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/BasicCoreRow$Row;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Row {

        /* renamed from: a, reason: collision with root package name */
        public final String f10038a;
        public final CoreRowUI b;

        public Row(String str, CoreRowUI coreRowUI) {
            this.f10038a = str;
            this.b = coreRowUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.c(this.f10038a, row.f10038a) && Intrinsics.c(this.b, row.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10038a.hashCode() * 31);
        }

        public final String toString() {
            return "Row(__typename=" + this.f10038a + ", coreRowUI=" + this.b + ")";
        }
    }

    public BasicCoreRow(Row row, Action action) {
        this.f10036a = row;
        this.b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicCoreRow)) {
            return false;
        }
        BasicCoreRow basicCoreRow = (BasicCoreRow) obj;
        return Intrinsics.c(this.f10036a, basicCoreRow.f10036a) && Intrinsics.c(this.b, basicCoreRow.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10036a.hashCode() * 31);
    }

    public final String toString() {
        return "BasicCoreRow(row=" + this.f10036a + ", action=" + this.b + ")";
    }
}
