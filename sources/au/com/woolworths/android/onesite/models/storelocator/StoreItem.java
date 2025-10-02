package au.com.woolworths.android.onesite.models.storelocator;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/models/storelocator/StoreItem;", "", "itemType", "", "getItemType", "()I", "itemId", "", "getItemId", "()J", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StoreItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int ITEM_TYPE_DUMMY_FOOTER = 6;
    public static final int ITEM_TYPE_EMPTY_LIST = 7;
    public static final int ITEM_TYPE_ERROR_LIST = 8;
    public static final int ITEM_TYPE_STORE = 1;
    public static final int ITEM_TYPE_STORE_FACILITY = 5;
    public static final int ITEM_TYPE_STORE_HOURS = 3;
    public static final int ITEM_TYPE_STORE_INFO = 2;
    public static final int ITEM_TYPE_STORE_PHONE = 4;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lau/com/woolworths/android/onesite/models/storelocator/StoreItem$Companion;", "", "<init>", "()V", "ITEM_TYPE_STORE", "", "ITEM_TYPE_STORE_INFO", "ITEM_TYPE_STORE_HOURS", "ITEM_TYPE_STORE_PHONE", "ITEM_TYPE_STORE_FACILITY", "ITEM_TYPE_DUMMY_FOOTER", "ITEM_TYPE_EMPTY_LIST", "ITEM_TYPE_ERROR_LIST", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ITEM_TYPE_DUMMY_FOOTER = 6;
        public static final int ITEM_TYPE_EMPTY_LIST = 7;
        public static final int ITEM_TYPE_ERROR_LIST = 8;
        public static final int ITEM_TYPE_STORE = 1;
        public static final int ITEM_TYPE_STORE_FACILITY = 5;
        public static final int ITEM_TYPE_STORE_HOURS = 3;
        public static final int ITEM_TYPE_STORE_INFO = 2;
        public static final int ITEM_TYPE_STORE_PHONE = 4;

        private Companion() {
        }
    }

    long getItemId();

    int getItemType();
}
