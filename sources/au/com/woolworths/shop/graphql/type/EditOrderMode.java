package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/EditOrderMode;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditOrderMode {
    public static final Companion e;
    public static final EnumType f;
    public static final EditOrderMode g;
    public static final EditOrderMode h;
    public static final EditOrderMode i;
    public static final /* synthetic */ EditOrderMode[] j;
    public static final /* synthetic */ EnumEntries k;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/EditOrderMode$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        EditOrderMode editOrderMode = new EditOrderMode("EDITING", 0, "EDITING");
        g = editOrderMode;
        EditOrderMode editOrderMode2 = new EditOrderMode("NOT_EDITING", 1, "NOT_EDITING");
        h = editOrderMode2;
        EditOrderMode editOrderMode3 = new EditOrderMode("UNKNOWN__", 2, "UNKNOWN__");
        i = editOrderMode3;
        EditOrderMode[] editOrderModeArr = {editOrderMode, editOrderMode2, editOrderMode3};
        j = editOrderModeArr;
        k = EnumEntriesKt.a(editOrderModeArr);
        e = new Companion();
        f = new EnumType("EditOrderMode", CollectionsKt.R("EDITING", "NOT_EDITING"));
    }

    public EditOrderMode(String str, int i2, String str2) {
        this.d = str2;
    }

    public static EditOrderMode valueOf(String str) {
        return (EditOrderMode) Enum.valueOf(EditOrderMode.class, str);
    }

    public static EditOrderMode[] values() {
        return (EditOrderMode[]) j.clone();
    }
}
