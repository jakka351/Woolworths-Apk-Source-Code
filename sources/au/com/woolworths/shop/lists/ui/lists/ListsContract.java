package au.com.woolworths.shop.lists.ui.lists;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePrompt;
import au.com.woolworths.shop.lists.ui.lists.analytics.ListsActions;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/ListsContract;", "", "Action", "ListsTabsContent", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ListsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/ListsContract$Action;", "", "ShowInstorePrompt", "Lau/com/woolworths/shop/lists/ui/lists/ListsContract$Action$ShowInstorePrompt;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/ListsContract$Action$ShowInstorePrompt;", "Lau/com/woolworths/shop/lists/ui/lists/ListsContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowInstorePrompt extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final InstorePresencePrompt f12321a;

            public ShowInstorePrompt(InstorePresencePrompt instorePresencePrompt) {
                this.f12321a = instorePresencePrompt;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowInstorePrompt) && Intrinsics.c(this.f12321a, ((ShowInstorePrompt) obj).f12321a);
            }

            public final int hashCode() {
                return this.f12321a.hashCode();
            }

            public final String toString() {
                return "ShowInstorePrompt(instorePrompt=" + this.f12321a + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/ListsContract$ListsTabsContent;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ListsTabsContent {
        public static final ListsTabsContent e;
        public static final ListsTabsContent f;
        public static final /* synthetic */ ListsTabsContent[] g;
        public static final /* synthetic */ EnumEntries h;
        public final ResText d;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/ui/lists/ListsContract.ListsTabsContent.MY_LISTS", "Lau/com/woolworths/shop/lists/ui/lists/ListsContract$ListsTabsContent;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MY_LISTS extends ListsTabsContent {
            public final ListsActions.MyListsTabSelect i;

            public MY_LISTS() {
                super("MY_LISTS", 0, new ResText(R.string.lists_my_lists_tab_title));
                this.i = new ListsActions.MyListsTabSelect();
            }

            @Override // au.com.woolworths.shop.lists.ui.lists.ListsContract.ListsTabsContent
            public final ListsActions a() {
                return this.i;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/ui/lists/ListsContract.ListsTabsContent.SUGGESTED_LISTS", "Lau/com/woolworths/shop/lists/ui/lists/ListsContract$ListsTabsContent;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SUGGESTED_LISTS extends ListsTabsContent {
            public final ListsActions.SuggestedListsTabSelect i;

            public SUGGESTED_LISTS() {
                super("SUGGESTED_LISTS", 1, new ResText(R.string.lists_suggested_lists_tab_tittle));
                this.i = new ListsActions.SuggestedListsTabSelect();
            }

            @Override // au.com.woolworths.shop.lists.ui.lists.ListsContract.ListsTabsContent
            public final ListsActions a() {
                return this.i;
            }
        }

        static {
            MY_LISTS my_lists = new MY_LISTS();
            e = my_lists;
            SUGGESTED_LISTS suggested_lists = new SUGGESTED_LISTS();
            f = suggested_lists;
            ListsTabsContent[] listsTabsContentArr = {my_lists, suggested_lists};
            g = listsTabsContentArr;
            h = EnumEntriesKt.a(listsTabsContentArr);
        }

        public ListsTabsContent(String str, int i, ResText resText) {
            this.d = resText;
        }

        public static ListsTabsContent valueOf(String str) {
            return (ListsTabsContent) Enum.valueOf(ListsTabsContent.class, str);
        }

        public static ListsTabsContent[] values() {
            return (ListsTabsContent[]) g.clone();
        }

        public abstract ListsActions a();
    }
}
