package au.com.woolworths.shop.addtolist.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.shop.addtolist.analytics.AddToListScreen;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract;
import au.com.woolworths.shop.lists.data.utils.ListsAnalyticsAppSection;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/CreateUpdateShoppingListActions;", "", "Actions", "CreateMode", "UpdateMode", "DuplicateMode", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CreateUpdateShoppingListActions {

    /* renamed from: a, reason: collision with root package name */
    public final ListsAnalyticsAppSection f10116a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/CreateUpdateShoppingListActions$Actions;", "", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {
        public abstract Action a();

        public abstract Action b();

        public abstract Action c();

        public abstract Screen d();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/CreateUpdateShoppingListActions$CreateMode;", "Lau/com/woolworths/shop/addtolist/analytics/CreateUpdateShoppingListActions$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreateMode extends Actions {

        /* renamed from: a, reason: collision with root package name */
        public final AddToListScreen.AddList f10117a;
        public final CreateUpdateShoppingListActions$CreateMode$saveListClick$1 b;
        public final CreateUpdateShoppingListActions$CreateMode$cancelClick$1 c;
        public final CreateUpdateShoppingListActions$CreateMode$colorClick$1 d;

        /* JADX WARN: Type inference failed for: r2v1, types: [au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$CreateMode$saveListClick$1] */
        /* JADX WARN: Type inference failed for: r2v2, types: [au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$CreateMode$cancelClick$1] */
        /* JADX WARN: Type inference failed for: r2v3, types: [au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$CreateMode$colorClick$1] */
        public CreateMode(ListsAnalyticsAppSection appSection) {
            Intrinsics.h(appSection, "appSection");
            final AddToListScreen.AddList addList = new AddToListScreen.AddList(appSection);
            this.f10117a = addList;
            this.b = new ScreenAction(addList) { // from class: au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$CreateMode$saveListClick$1
                public final Category e = Category.m;
                public final String f = "Add";

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }
            };
            this.c = new ScreenAction(addList) { // from class: au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$CreateMode$cancelClick$1
                public final Category e = Category.m;
                public final String f = "Cancel";

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }
            };
            this.d = new ScreenAction(addList) { // from class: au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$CreateMode$colorClick$1
                public final Category e = Category.m;
                public final String f = "color selection";

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }
            };
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Action a() {
            return this.c;
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Action b() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Action c() {
            return this.b;
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Screen d() {
            return this.f10117a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/CreateUpdateShoppingListActions$DuplicateMode;", "Lau/com/woolworths/shop/addtolist/analytics/CreateUpdateShoppingListActions$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DuplicateMode extends Actions {

        /* renamed from: a, reason: collision with root package name */
        public final AddToListScreen.DuplicateList f10118a;
        public final CreateUpdateShoppingListActions$DuplicateMode$saveListClick$1 b;
        public final CreateUpdateShoppingListActions$DuplicateMode$cancelClick$1 c;
        public final CreateUpdateShoppingListActions$DuplicateMode$colorClick$1 d;

        /* JADX WARN: Type inference failed for: r2v1, types: [au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$DuplicateMode$saveListClick$1] */
        /* JADX WARN: Type inference failed for: r2v2, types: [au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$DuplicateMode$cancelClick$1] */
        /* JADX WARN: Type inference failed for: r2v3, types: [au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$DuplicateMode$colorClick$1] */
        public DuplicateMode(ListsAnalyticsAppSection appSection) {
            Intrinsics.h(appSection, "appSection");
            final AddToListScreen.DuplicateList duplicateList = new AddToListScreen.DuplicateList(appSection);
            this.f10118a = duplicateList;
            this.b = new ScreenAction(duplicateList) { // from class: au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$DuplicateMode$saveListClick$1
                public final Category e = Category.m;
                public final String f = "Add";

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }
            };
            this.c = new ScreenAction(duplicateList) { // from class: au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$DuplicateMode$cancelClick$1
                public final Category e = Category.m;
                public final String f = "Cancel";

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }
            };
            this.d = new ScreenAction(duplicateList) { // from class: au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$DuplicateMode$colorClick$1
                public final Category e = Category.m;
                public final String f = "color selection";

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }
            };
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Action a() {
            return this.c;
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Action b() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Action c() {
            return this.b;
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Screen d() {
            return this.f10118a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/analytics/CreateUpdateShoppingListActions$UpdateMode;", "Lau/com/woolworths/shop/addtolist/analytics/CreateUpdateShoppingListActions$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateMode extends Actions {

        /* renamed from: a, reason: collision with root package name */
        public final AddToListScreen.EditList f10119a;
        public final CreateUpdateShoppingListActions$UpdateMode$saveListClick$1 b;
        public final CreateUpdateShoppingListActions$UpdateMode$cancelClick$1 c;
        public final CreateUpdateShoppingListActions$UpdateMode$colorClick$1 d;

        /* JADX WARN: Type inference failed for: r2v1, types: [au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$UpdateMode$saveListClick$1] */
        /* JADX WARN: Type inference failed for: r2v2, types: [au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$UpdateMode$cancelClick$1] */
        /* JADX WARN: Type inference failed for: r2v3, types: [au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$UpdateMode$colorClick$1] */
        public UpdateMode(ListsAnalyticsAppSection appSection) {
            Intrinsics.h(appSection, "appSection");
            final AddToListScreen.EditList editList = new AddToListScreen.EditList(appSection);
            this.f10119a = editList;
            this.b = new ScreenAction(editList) { // from class: au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$UpdateMode$saveListClick$1
                public final Category e = Category.m;
                public final String f = "Update";

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }
            };
            this.c = new ScreenAction(editList) { // from class: au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$UpdateMode$cancelClick$1
                public final Category e = Category.m;
                public final String f = "Cancel";

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }
            };
            this.d = new ScreenAction(editList) { // from class: au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions$UpdateMode$colorClick$1
                public final Category e = Category.m;
                public final String f = "color selection";

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }
            };
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Action a() {
            return this.c;
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Action b() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Action c() {
            return this.b;
        }

        @Override // au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions.Actions
        public final Screen d() {
            return this.f10119a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CreateUpdateShoppingListContract.ActivityMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CreateUpdateShoppingListContract.ActivityMode activityMode = CreateUpdateShoppingListContract.ActivityMode.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CreateUpdateShoppingListContract.ActivityMode activityMode2 = CreateUpdateShoppingListContract.ActivityMode.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CreateUpdateShoppingListActions(ListsInMemoryRepository listsInMemoryRepository) {
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        this.f10116a = listsInMemoryRepository.a();
    }

    public final Actions a(CreateUpdateShoppingListContract.ActivityMode mode) {
        Intrinsics.h(mode, "mode");
        int iOrdinal = mode.ordinal();
        ListsAnalyticsAppSection listsAnalyticsAppSection = this.f10116a;
        if (iOrdinal == 0) {
            return new CreateMode(listsAnalyticsAppSection);
        }
        if (iOrdinal == 1) {
            return new DuplicateMode(listsAnalyticsAppSection);
        }
        if (iOrdinal == 2) {
            return new UpdateMode(listsAnalyticsAppSection);
        }
        throw new NoWhenBranchMatchedException();
    }
}
